package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

import java.nio.ByteBuffer;

/**
 *
 * @author nickstanogias
 */
public class HopApplicationAttemptState {

    private final String applicationid;
    private final String applicationattemptid;
    private final byte[] applicationattemptstate;
    private final String host;
    private final int rpcPort;
    private final ByteBuffer appAttemptTokens;
    private final String url;
    
   public HopApplicationAttemptState(String applicationid,
          String applicationattemptid) {
    this(applicationid, applicationattemptid, null, null, 0, null, null);
  }

  public HopApplicationAttemptState(String applicationid,
          String applicationattemptid,
          byte[] applicationattemptstate, String host, int rpcPort,
          ByteBuffer appAttemptTokens, String url) {
    this.applicationid = applicationid;
    this.applicationattemptid = applicationattemptid;
    this.applicationattemptstate = applicationattemptstate;
    this.host = host;
    this.rpcPort = rpcPort;
    this.appAttemptTokens = appAttemptTokens;
    this.url = url;
  }

    public String getApplicationId() {
        return applicationid;
    }

    public String getApplicationattemptid() {
        return applicationattemptid;
    }

    public byte[] getApplicationattemptstate() {
        return applicationattemptstate;
    }

  public String getHost() {
    return host;
  }

  public int getRpcPort() {
    return rpcPort;
  }

  public ByteBuffer getAppAttemptTokens() {
    return appAttemptTokens;
  }

  public String getUrl() {
    return url;
  }
    
    @Override
    public String toString() {
        String str = "HopApplicationState{" + "applicationid=" + applicationid +", applicationattemptid=" +applicationattemptid;
        if (applicationattemptstate != null) {
            str += ", applicationattemptstate length=" + applicationattemptstate.length;
        }
        str += '}';
        return str;
    }
}
