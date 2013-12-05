package se.sics.hop.metadata.persistence.entity.hdfs;

/**
 *
 * @author Mahmoud Ismail <maism@sics.se>
 */
public class HopStorageInfo {

  private int id;
  private int layoutVersion;
  private int namespaceId;
  private String clusterId;
  private long creationTime;
  private String blockPoolId;

  public HopStorageInfo(int id, int layoutVersion,int namespaceId, String clusterId, long creationTime, String blockPoolId) {
    this.id = id;
    this.layoutVersion = layoutVersion;
    this.namespaceId = namespaceId;
    this.clusterId = clusterId;
    this.creationTime = creationTime;
    this.blockPoolId = blockPoolId;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getLayoutVersion() {
    return layoutVersion;
  }

  public void setLayoutVersion(int layoutVersion) {
    this.layoutVersion = layoutVersion;
  }

  public int getNamespaceId() {
    return namespaceId;
  }

  public void setNamespaceId(int namespaceId) {
    this.namespaceId = namespaceId;
  }

  public String getClusterId() {
    return clusterId;
  }

  public void setClusterId(String clusterId) {
    this.clusterId = clusterId;
  }

  public long getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(long creationTime) {
    this.creationTime = creationTime;
  }

  public String getBlockPoolId() {
    return blockPoolId;
  }

  public void setBlockPoolId(String blockPoolId) {
    this.blockPoolId = blockPoolId;
  }
}
