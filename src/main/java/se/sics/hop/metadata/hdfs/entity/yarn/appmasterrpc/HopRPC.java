package se.sics.hop.metadata.hdfs.entity.yarn.appmasterrpc;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public class HopRPC {

  private final int id;
  private final Type type;
  private final byte[] rpc;
  private final String userId;

  public HopRPC(int id) {
    this(id, null, null, null);
  }

  public HopRPC(int id, Type type, byte[] rpc, String userId) {
    this.id = id;
    this.type = type;
    this.rpc = rpc;
    this.userId = userId;
  }

  public int getId() {
    return id;
  }

  public Type getType() {
    return type;
  }

  public byte[] getRpc() {
    return rpc;
  }

  public String getUserId() {
    return userId;
  }

  public enum Type {

    RegisterApplicationMaster,
    FinishApplicationMaster,
    Allocate,
    SubmitApplication,
    ForceKillApplication,
    RegisterNM,
    NodeHeartbeat,
    NodeAddedSchedulerEvent;
  }

  @Override
  public String toString() {
    return "HopRPC{" + "id=" + id + ", type=" + type + ", userId="
            + userId + '}';
  }

}
