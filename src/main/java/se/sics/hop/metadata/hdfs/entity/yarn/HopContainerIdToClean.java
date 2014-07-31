package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo class for the RMNode.containersToClean set. Hostname, commandport point
 * to the RMNode primary key.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopContainerIdToClean {

    private String hostname;
    private int commandport;
    private String containerId;

    public HopContainerIdToClean(String hostname, int commandport, String containerId) {
        this.hostname = hostname;
        this.commandport = commandport;
        this.containerId = containerId;
    }

    public String getHostname() {
        return hostname;
    }

    public int getCommandport() {
        return commandport;
    }

    public String getContainerId() {
        return containerId;
    }
}
