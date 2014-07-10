package se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore;

/**
 *
 * @author nickstanogias
 */
public class HopApplicationAttemptState {

    private final String applicationid;
    private final String applicationattemptid;
    private final byte[] applicationattemptstate;

    public HopApplicationAttemptState(String applicationid, String applicationattemptid, byte[] applicationattemptstate) {
        this.applicationid = applicationid;
        this.applicationattemptid = applicationattemptid;
        this.applicationattemptstate = applicationattemptstate;
    }

    public String getApplicationid() {
        return applicationid;
    }

    public String getApplicationattemptid() {
        return applicationattemptid;
    }

    public byte[] getApplicationattemptstate() {
        return applicationattemptstate;
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
