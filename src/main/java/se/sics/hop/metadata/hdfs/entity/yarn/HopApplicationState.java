package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author nickstanogias
 */
public class HopApplicationState {

    private final String applicationid;
    private final byte[] appstate;

    public HopApplicationState(String applicationid, byte[] appstate) {
        this.applicationid = applicationid;
        this.appstate = appstate;
    }

    public String getApplicationid() {
        return this.applicationid;
    }

    public byte[] getAppstate() {
        return this.appstate;
    }

    @Override
    public String toString() {
        String str = "HopApplicationState{" + "applicationid=" + applicationid;
        if (appstate != null) {
            str += ", appstate length=" + appstate.length;
        }
        str += '}';
        return str;
    }
}
