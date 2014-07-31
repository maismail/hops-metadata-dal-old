package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public class HopJustLaunchedContainers {

    private final String hostname;
    private final int commandport;
    private final int containerid;
    private final int containerstatusid;

    public HopJustLaunchedContainers(String hostname, int commandport, int containerid, int containerstatusid) {
        this.hostname = hostname;
        this.commandport = commandport;
        this.containerid = containerid;
        this.containerstatusid = containerstatusid;
    }

    public int getCommandport() {
        return commandport;
    }

    public String getHostname() {
        return hostname;
    }

    public int getContainerid() {
        return containerid;
    }

    public int getContainerstatusid() {
        return containerstatusid;
    }
}
