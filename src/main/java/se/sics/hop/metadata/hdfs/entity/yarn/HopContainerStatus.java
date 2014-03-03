package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * HOP representation of ContainerStatus yarn object.
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerStatus {

    private final int id;
    private final String state;
    private final int containerid;
    private final String diagnostics;
    private final int exitstatus;
    private final String type;
    private final int updatedcontainerinfoid;

    public HopContainerStatus(int id, String state, int containerid, String diagnostics, int exitstatus, String type, int updatedcontainerinfoid) {
        this.id = id;
        this.state = state;
        this.containerid = containerid;
        this.diagnostics = diagnostics;
        this.exitstatus = exitstatus;
        this.type = type;
        this.updatedcontainerinfoid = updatedcontainerinfoid;
    }

    public int getId() {
        return id;
    }

    public String getState() {
        return state;
    }

    public int getContainerid() {
        return containerid;
    }

    public String getDiagnostics() {
        return diagnostics;
    }

    public int getExitstatus() {
        return exitstatus;
    }

    public String getType() {
        return type;
    }

    public int getUpdatedcontainerinfoid() {
        return updatedcontainerinfoid;
    }
}
