package io.hops.metadata.hdfs.entity;

public class EncodingStatus {

  /* Source file status */
  public static final int ENCODING_REQUESTED = 0;
  public static final int ENCODING_ACTIVE = 1;
  public static final int ENCODED = 2;
  public static final int REPAIR_ACTIVE = 3;
  public static final int REPAIR_FAILED = 4;
  public static final int ENCODING_FAILED = 5;
  public static final int ENCODING_CANCELED = 6;
  public static final int REPAIR_CANCELED = 7;
  public static final int REPAIR_REQUESTED = 8;
  public static final int DELETED = 9;

  /* Parity file status */
  public static final int PARITY_HEALTHY = 0;
  public static final int PARITY_REPAIR_REQUESTED = 1;
  public static final int PARITY_REPAIR_ACTIVE = 2;
  public static final int PARITY_REPAIR_FAILED = 3;
  public static final int PARITY_REPAIR_CANCELED = 4;

  private Integer inodeId;
  private Integer parityInodeId;
  private Integer status;
  private Integer parityStatus;
  private String codec;
  private Short targetReplication;
  private Long statusModificationTime;
  private Long parityStatusModificationTime;
  private String parityFileName;
  private Integer lostBlocks;
  private Integer lostParityBlocks;
  private Boolean revoked;

  public EncodingStatus() {

  }

  public EncodingStatus(Integer inodeId, Integer parityInodeId, Integer status,
      String codec, Short targetReplication,
      Long statusModificationTime, Integer parityStatus,
      Long parityStatusModificationTime, String parityFileName,
      Integer lostBlocks, Integer lostParityBlocks, Boolean revoked) {
    this.inodeId = inodeId;
    this.parityInodeId = parityInodeId;
    this.status = status;
    this.codec = codec;
    this.targetReplication = targetReplication;
    this.statusModificationTime = statusModificationTime;
    this.parityStatus = parityStatus;
    this.parityStatusModificationTime = parityStatusModificationTime;
    this.parityFileName = parityFileName;
    this.lostBlocks = lostBlocks;
    this.lostParityBlocks = lostParityBlocks;
    this.revoked = revoked;
  }

  public Integer getInodeId() {
    return inodeId;
  }

  public void setInodeId(Integer inodeId) {
    this.inodeId = inodeId;
  }

  public Integer getParityInodeId() {
    return parityInodeId;
  }

  public void setParityInodeId(Integer parityInodeId) {
    this.parityInodeId = parityInodeId;
  }

  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public Integer getParityStatus() {
    return parityStatus;
  }

  public void setParityStatus(Integer parityStatus) {
    this.parityStatus = parityStatus;
  }

  public String getCodec() {
    return codec;
  }

  public void setCodec(String codec) {
    this.codec = codec;
  }

  public Short getTargetReplication() {
    return targetReplication;
  }

  public void setTargetReplication(Short targetReplication) {
    this.targetReplication = targetReplication;
  }

  public Long getStatusModificationTime() {
    return statusModificationTime;
  }

  public void setStatusModificationTime(Long statusModificationTime) {
    this.statusModificationTime = statusModificationTime;
  }

  public Long getParityStatusModificationTime() {
    return parityStatusModificationTime;
  }

  public void setParityStatusModificationTime(Long parityStatusModificationTime) {
    this.parityStatusModificationTime = parityStatusModificationTime;
  }

  public String getParityFileName() {
    return parityFileName;
  }

  public void setParityFileName(String parityFileName) {
    this.parityFileName = parityFileName;
  }

  public Integer getLostBlocks() {
    return lostBlocks;
  }

  public void setLostBlocks(Integer lostBlocks) {
    this.lostBlocks = lostBlocks;
  }

  public Integer getLostParityBlocks() {
    return lostParityBlocks;
  }

  public void setLostParityBlocks(Integer lostParityBlocks) {
    this.lostParityBlocks = lostParityBlocks;
  }

  public Boolean getRevoked() {
    return revoked;
  }

  public void setRevoked(Boolean revoked) {
    this.revoked = revoked;
  }

  @Override
  public String toString() {
    return "HopEncodingStatus{" +
        "inodeId=" + inodeId +
        ", parityInodeId=" + parityInodeId +
        ", status=" + status +
        ", parityStatus=" + parityStatus +
        ", codec='" + codec + '\'' +
        ", targetReplication=" + targetReplication +
        ", statusModificationTime=" + statusModificationTime +
        ", parityStatusModificationTime=" + parityStatusModificationTime +
        ", parityFileName='" + parityFileName + '\'' +
        ", lostBlocks=" + lostBlocks +
        ", lostParityBlocks=" + lostParityBlocks +
        ", revoked=" + revoked +
        '}';
  }
}
