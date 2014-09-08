package se.sics.hop.metadata.hdfs.entity.hdfs;

import com.google.common.primitives.SignedBytes;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * @author salman
 */
public class HopINode implements Comparable<HopINode> {

  private int id;
  private String name;
  private int parentId;
  private boolean dir;
  private boolean dirWithQuota;
  private long modificationTime;
  private long accessTime;
  private byte[] permission;
  private boolean underConstruction;
  private String clientName;
  private String clientMachine;
  private String clientNode;
  private int generationStamp;
  private long header;
  private String symlink;
  private boolean subtreeLocked;
  private long subtreeLockOwner;

  public HopINode() {
  }

  public HopINode(
      int id,
      String name,
      int parentId,
      boolean dir,
      boolean dirWithQuota,
      long modificationTime,
      long accessTime,
      byte[] permission,
      boolean underConstruction,
      String clientName,
      String clientMachine,
      String clientNode,
      int generationStamp,
      long header,
      String symlink,
      boolean subtreeLocked,
      long subtreeLockOwner) {

    this.id = id;
    this.name = name;
    this.parentId = parentId;
    this.dir = dir;
    this.dirWithQuota = dirWithQuota;
    this.modificationTime = modificationTime;
    this.accessTime = accessTime;
    this.permission = permission;
    this.underConstruction = underConstruction;
    this.clientName = clientName;
    this.clientMachine = clientMachine;
    this.clientNode = clientNode;
    this.generationStamp = generationStamp;
    this.header = header;
    this.symlink = symlink;
    this.subtreeLocked = subtreeLocked;
    this.subtreeLockOwner = subtreeLockOwner;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getParentId() {
    return parentId;
  }

  public void setParentId(int parentId) {
    this.parentId = parentId;
  }

  public boolean isDir() {
    return dir;
  }

  public void setDir(boolean dir) {
    this.dir = dir;
  }

  public boolean isDirWithQuota() {
    return dirWithQuota;
  }

  public void setDirWithQuota(boolean dirWithQuota) {
    this.dirWithQuota = dirWithQuota;
  }

  public long getModificationTime() {
    return modificationTime;
  }

  public void setModificationTime(long modificationTime) {
    this.modificationTime = modificationTime;
  }

  public long getAccessTime() {
    return accessTime;
  }

  public void setAccessTime(long accessTime) {
    this.accessTime = accessTime;
  }

  public byte[] getPermission() {
    return permission;
  }

  public void setPermission(byte[] permission) {
    this.permission = permission;
  }

  public boolean isUnderConstruction() {
    return underConstruction;
  }

  public void setUnderConstruction(boolean underConstruction) {
    this.underConstruction = underConstruction;
  }

  public String getClientName() {
    return clientName;
  }

  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getClientMachine() {
    return clientMachine;
  }

  public void setClientMachine(String clientMachine) {
    this.clientMachine = clientMachine;
  }

  public String getClientNode() {
    return clientNode;
  }

  public void setClientNode(String clientNode) {
    this.clientNode = clientNode;
  }

  public int getGenerationStamp() {
    return generationStamp;
  }

  public void setGenerationStamp(int generationStamp) {
    this.generationStamp = generationStamp;
  }

  public long getHeader() {
    return header;
  }

  public void setHeader(long header) {
    this.header = header;
  }

  public String getSymlink() {
    return symlink;
  }

  public void setSymlink(String symlink) {
    this.symlink = symlink;
  }

  public boolean isSubtreeLocked() {
    return subtreeLocked;
  }

  public void setSubtreeLocked(boolean subtreeLocked) {
    this.subtreeLocked = subtreeLocked;
  }

  public long getSubtreeLockOwner() {
    return subtreeLockOwner;
  }

  public void setSubtreeLockOwner(long subtreeLockOwner) {
    this.subtreeLockOwner = subtreeLockOwner;
  }

  @Override
  public final int compareTo(HopINode other) {
    String left = name == null ? "" : name;
    String right = other.name == null ? "" : other.name;
    return SignedBytes.lexicographicalComparator().compare(left.getBytes(), right.getBytes());
  }

  @Override
  public final boolean equals(Object that) {
    if (this == that) {
      return true;
    }
    if (that == null || !(that instanceof HopINode)) {
      return false;
    }
    if (name.equals(((HopINode) that).name)
        && this.id == ((HopINode) that).id
        && this.parentId == ((HopINode) that).parentId) {
      return true;
    }
    return false;
  }

  @Override
  public final int hashCode() {
    return Arrays.hashCode(this.name.getBytes());
  }

  public static enum Order implements Comparator<HopINode> {

    ByName() {
      @Override
      public int compare(HopINode o1, HopINode o2) {
        // TODO - JIM why not compare by ID - more efficient?
        return o1.compareTo(o2);
      }
    };

    @Override
    public abstract int compare(HopINode o1, HopINode o2);

    public Comparator acsending() {
      return this;
    }

    public Comparator descending() {
      return Collections.reverseOrder(this);
    }
  }
}
