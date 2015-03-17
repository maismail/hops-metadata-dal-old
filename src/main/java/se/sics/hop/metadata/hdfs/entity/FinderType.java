package se.sics.hop.metadata.hdfs.entity;

public interface FinderType<T> {
  public static enum Annotation {
    PrimaryKey,
    PrunedIndexScan,
    IndexScan,
    Batched,
    BatchedPrunedIndexScan,
    FullTableScan,
    FullTable;

    public String getShort() {
      switch (this) {
        case PrimaryKey:
          return "PK";
        case PrunedIndexScan:
          return "PI";
        case IndexScan:
          return "IS";
        case Batched:
          return "B";
        case BatchedPrunedIndexScan:
          return "BPI";
        case FullTableScan:
          return "FTS";
        case FullTable:
          return "FT";
        default:
          throw new IllegalStateException();
      }
    }
  }

  public Class getType();

  public Annotation getAnnotated();
}
