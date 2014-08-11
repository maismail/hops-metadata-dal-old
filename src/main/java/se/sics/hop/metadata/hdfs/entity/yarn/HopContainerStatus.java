package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * HOP representation of ContainerStatus yarn object.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerStatus {

    private final String containerid;
    private final String state;
    private final String diagnostics;
    private final int exitstatus;

    public HopContainerStatus(String containerid, String state, String diagnostics, int exitstatus) {
        this.containerid = containerid;
        this.state = state;
        this.diagnostics = diagnostics;
        this.exitstatus = exitstatus;
    }

    public String getContainerid() {
        return containerid;
    }

    public String getState() {
        return state;
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public int getExitstatus() {
        return exitstatus;
    }
}
