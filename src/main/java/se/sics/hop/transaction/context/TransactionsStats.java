package se.sics.hop.transaction.context;

import se.sics.hop.transaction.EntityManager;
import se.sics.hop.transaction.handler.RequestHandler;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static se.sics.hop.transaction.context.EntityContextStat.StatsAggregator;

public class TransactionsStats {
  private static TransactionsStats instance = null;

  private class TransactionStat {
    private RequestHandler.OperationType name;
    private Collection<EntityContextStat> stats;
    private Exception ignoredException;

    public TransactionStat(
        RequestHandler.OperationType name, Collection<EntityContextStat>
        stats, Exception ignoredException) {
      this.name = name;
      this.stats = stats;
      this.ignoredException = ignoredException;
    }
  }

  private boolean enabled;
  private BufferedWriter statsLogWriter;
  private BufferedWriter aggStatsLogWriter;
  private List<TransactionStat> transactionStats;
  private Map<RequestHandler.OperationType, List<TransactionStat>>
      transactionAggregatedStats;
  private File statsDir;

  private TransactionsStats() {
    this.enabled = false;
    this.transactionStats = new
        ArrayList<TransactionStat>();
    this.transactionAggregatedStats = new HashMap<RequestHandler.OperationType,
        List<TransactionStat>>();
  }

  public static TransactionsStats getInstance() {
    if (instance == null) {
      instance = new TransactionsStats();
    }
    return instance;
  }


  public void setConfiguration(boolean enableOrDisable, String statsDir)
      throws IOException {
    if (enableOrDisable) {
      this.enabled = true;
      this.statsDir = new File(statsDir);
      if (!this.statsDir.exists()) {
        this.statsDir.mkdirs();
      }
      BaseEntityContext.enableStats();
    } else {
      this.enabled = false;
      BaseEntityContext.disableStats();
    }
  }

  public void collectStats(RequestHandler.OperationType operationType,
      Exception ignoredException)
      throws IOException {
    if (enabled) {
      Collection<EntityContextStat> contextStats = EntityManager
          .collectSnapshotStat();
      if (!contextStats.isEmpty() || ignoredException != null) {
        TransactionStat stat = new TransactionStat(operationType, contextStats,
            ignoredException);
        transactionStats.add(stat);

        List<TransactionStat> statList =
            transactionAggregatedStats.get(operationType);
        if (statList == null) {
          statList = new ArrayList<TransactionStat>();
          transactionAggregatedStats.put(operationType, statList);
        }
        statList.add(stat);
      }
    }
  }

  public void dump() throws IOException {
    if (enabled) {
      dumpOrdered();
      dumpAggregate();
      clear();
    }
  }


  private void clear() throws IOException {
    statsLogWriter.close();
    aggStatsLogWriter.close();
    statsLogWriter = null;
    aggStatsLogWriter = null;
    transactionAggregatedStats.clear();
    transactionStats.clear();
  }

  private void dumpAggregate() throws IOException {
    for (Map.Entry<RequestHandler.OperationType, List<TransactionStat>> e :
        transactionAggregatedStats.entrySet()) {
      dumpAggregate(e.getKey(), e.getValue());
    }
  }

  private void dumpAggregate(RequestHandler.OperationType operationType,
      List<TransactionStat> transactionStats) throws IOException {
    BufferedWriter writer = getAggStatsLogWriter();
    writer.write("Transaction: " + operationType.toString());
    writer.newLine();

    StatsAggregator globalAggregator = new StatsAggregator();
    for (TransactionStat transactionStat : transactionStats) {
      StatsAggregator txStatAgg = dump(writer, transactionStat);
      globalAggregator.update(txStatAgg);
    }

    writer.write(operationType.toString() + ": Global  Tx. Count=" +
        transactionStats.size());
    writer.newLine();
    writer.write(globalAggregator.toString(operationType.toString() + ": Global"));

    writer.newLine();
    writer.newLine();
  }

  private void dumpOrdered() throws IOException {
    for (TransactionStat stat : transactionStats) {
      dumpOrdered(stat);
    }
  }

  private void dumpOrdered(TransactionStat transactionStat) throws IOException {
    BufferedWriter writer = getStatsLogWriter();
    writer.write("Transaction: " + transactionStat.name.toString());
    writer.newLine();
    dump(writer, transactionStat);
    writer.newLine();
    writer.newLine();
  }

  private StatsAggregator dump(BufferedWriter writer,
      TransactionStat transactionStat)
      throws
      IOException {

    if (transactionStat.ignoredException != null) {
      writer.write(transactionStat.ignoredException.toString());
      writer.newLine();
      writer.newLine();
    }

    StatsAggregator txAggStat = new StatsAggregator();
    for (EntityContextStat contextStat : transactionStat.stats) {
      writer.write(contextStat.toString());
      txAggStat.update(contextStat.getStatsAggregator());
    }

    writer.write(txAggStat.toCSFString("Tx."));
    writer.newLine();
    return txAggStat;
  }

  private BufferedWriter getStatsLogWriter() throws IOException {
    if (statsLogWriter == null) {
      this.statsLogWriter = new BufferedWriter(new FileWriter(new File(statsDir,
          getStatsFile()
      ), true));
    }
    return this.statsLogWriter;
  }

  private BufferedWriter getAggStatsLogWriter() throws IOException {
    if (aggStatsLogWriter == null) {
      this.aggStatsLogWriter =
          new BufferedWriter(new FileWriter(new File(statsDir,
              getAggStatsFile()
          ), true));
    }
    return this.aggStatsLogWriter;
  }

  private String getStatsFile() {
    return "hops-" + System.currentTimeMillis() + ".log";
  }

  private String getAggStatsFile() {
    return "hops-agg-" + System.currentTimeMillis() + ".log";
  }

}
