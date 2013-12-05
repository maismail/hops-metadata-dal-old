package se.sics.hop.metadata.persistence.entity.hdfs;

/**
 * 
 * @author Mahmoud Ismail <maism@sics.se>
 */
public final class HopLease implements Comparable<HopLease>{

  private String holder;
  private long lastUpdate;
  private int holderId;

  public HopLease() {
  }

  public HopLease(String holder, int holderId, long lastUpdate) {
    this.holder = holder;
    this.holderId = holderId;
    this.lastUpdate = lastUpdate;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public long getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(long lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

  public int getHolderId() {
    return holderId;
  }

  public void setHolderId(int holderId) {
    this.holderId = holderId;
  }

  @Override
  public int compareTo(HopLease o) {
    HopLease l1 = this;
    HopLease l2 = o;
    long lu1 = l1.lastUpdate;
    long lu2 = l2.lastUpdate;
    if (lu1 < lu2) {
      return -1;
    } else if (lu1 > lu2) {
      return 1;
    } else {
      return l1.holder.compareTo(l2.holder);
    }
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof HopLease)) {
      return false;
    }
    HopLease obj = (HopLease) o;
    if (lastUpdate == obj.lastUpdate
            && holder.equals(obj.holder)) {
      return true;
    }
    return false;
  }

  @Override
  public int hashCode() {
    return holder.hashCode();
  }
}
