package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 * Pojo for RMNode.finishedApplications list.
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopFinishedApplications {

    private final String hostname;
    private final int commandport;
    private final int applicationId;

    public HopFinishedApplications(String hostname, int commandport, int applicationId) {
        this.hostname = hostname;
        this.commandport = commandport;
        this.applicationId = applicationId;
    }

    public String getHostname() {
        return hostname;
    }

    public int getCommandport() {
        return commandport;
    }

    public int getApplicationId() {
        return applicationId;
    }
}
