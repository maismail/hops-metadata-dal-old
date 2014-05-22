package se.sics.hop.metadata.hdfs.entity.hop;

import java.util.Comparator;
import se.sics.hop.metadata.hdfs.entity.FinderType;

/**
 * This class holds the information of one replica of a block in one datanode.
 *
 * @author kamal hakimzadeh<kamal@sics.se>
 */
public class HopIndexedReplica extends HopReplica {

  public static enum Finder implements FinderType<HopIndexedReplica> {

    ByBlockId, ByINodeId, ByPK, ByPKS;

    @Override
    public Class getType() {
      return HopIndexedReplica.class;
    }
  }

  public static enum Order implements Comparator<HopIndexedReplica> {

    ByIndex() {
      @Override
      public int compare(HopIndexedReplica o1, HopIndexedReplica o2) {
        if (o1.getIndex() < o2.getIndex()) {
          return -1;
        } else {
          return 1;
        }
      }
    };
  }
  int index;

  public HopIndexedReplica(long blockId, int storageId, int inodeId, int index) {
    super(storageId, blockId, inodeId);
    this.index = index;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  @Override
  public String toString() {
    return "sid " + storageId + " bid: " + blockId + " index: " + index;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
  }
}
