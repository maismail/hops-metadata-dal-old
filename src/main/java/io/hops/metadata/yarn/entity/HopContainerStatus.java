package io.hops.metadata.yarn.entity;

/**
 * HOP representation of ContainerStatus yarn object.
 */
public class HopContainerStatus {

    private final String containerid;
    private final String state;
    private final String diagnostics;
    private final int exitstatus;
    private final String rMNodeId;

    public HopContainerStatus(String containerid, String state, String diagnostics, 
            int exitstatus, String rMNodeId) {
        this.containerid = containerid;
        this.state = state;
        this.diagnostics = diagnostics;
        this.exitstatus = exitstatus;
        this.rMNodeId = rMNodeId;
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

    public String getRMNodeId() {
        return rMNodeId;
    }

    @Override
    public String toString() {
        return "HopContainerStatus{" + "containerid=" + containerid + ", state=" + state + ", diagnostics=" + diagnostics + ", exitstatus=" + exitstatus + '}';
    }
    
}
