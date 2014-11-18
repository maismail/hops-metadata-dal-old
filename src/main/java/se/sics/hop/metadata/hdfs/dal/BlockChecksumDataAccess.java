package se.sics.hop.metadata.hdfs.dal;

import se.sics.hop.exception.StorageException;

import java.util.Collection;

public interface BlockChecksumDataAccess<T> extends EntityDataAccess {

  public static class KeyTuple {
    private int inodeId;
    private int blockIndex;

    public KeyTuple(int inodeId, int blockIndex) {
      this.inodeId = inodeId;
      this.blockIndex = blockIndex;
    }

    public int getInodeId() {
      return inodeId;
    }

    public void setInodeId(int inodeId) {
      this.inodeId = inodeId;
    }

    public int getBlockIndex() {
      return blockIndex;
    }

    public void setBlockIndex(int blockIndex) {
      this.blockIndex = blockIndex;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      KeyTuple keyTuple = (KeyTuple) o;

      if (blockIndex != keyTuple.blockIndex) return false;
      if (inodeId != keyTuple.inodeId) return false;

      return true;
    }

    @Override
    public int hashCode() {
      int result = inodeId;
      result = 31 * result + blockIndex;
      return result;
    }

    @Override
    public String toString() {
      return "KeyTuple{" +
          "inodeId=" + inodeId +
          ", blockIndex=" + blockIndex +
          '}';
    }
  }

  void add(T blockChecksum) throws StorageException;

  void update(T blockChecksum) throws StorageException;

  void delete(T blockChecksum) throws StorageException;

  T find(int inodeId, int blockIndex) throws StorageException;

  Collection<T> findAll(int inodeId) throws StorageException;

  void deleteAll(int inodeId) throws StorageException;
}
