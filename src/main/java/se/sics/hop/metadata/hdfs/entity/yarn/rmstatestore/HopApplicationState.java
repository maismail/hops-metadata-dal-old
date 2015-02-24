package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

/**
 *
 * @author nickstanogias
 */
public class HopApplicationState {

  private final String applicationId;
  private final byte[] appstate;
  private final String user;
  private final String name;
  private final String state;

  public HopApplicationState(String applicationid){
    this(applicationid,null,null,null, null);
  }
  
  public HopApplicationState(String applicationId, byte[] appstate,
          String user, String name, String state) {
    this.applicationId = applicationId;
    this.appstate = appstate;
    this.name = name;
    this.user = user;
    this.state = state;
  }

  public String getApplicationid() {
    return this.applicationId;
  }

  public byte[] getAppstate() {
    return this.appstate;
  }

  public String getApplicationId() {
    return applicationId;
  }

  public String getUser() {
    return user;
  }

  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }

  @Override
  public String toString() {
    String str = "HopApplicationState{" + "applicationid=" + applicationId;
    if (appstate != null) {
      str += ", appstate length=" + appstate.length;
    }
    str += '}';
    return str;
  }
}
