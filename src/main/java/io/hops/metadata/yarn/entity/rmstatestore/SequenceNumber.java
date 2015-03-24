package io.hops.metadata.yarn.entity.rmstatestore;

public class SequenceNumber {
  private final int id;
  private final int sequencenumber;

  public SequenceNumber(int id, int sequencenumber) {
    this.id = id;
    this.sequencenumber = sequencenumber;
  }

  public int getId() {
    return id;
  }

  public int getSequencenumber() {
    return sequencenumber;
  }
}
