package io.hops.metadata.yarn.entity;

/**
 * Pojo representing RMContainer class.
 */
public class HopRMContainer {

    private final String containerIdID;
    private final String applicationAttemptIdID;
    private final String nodeIdID;
    private final String user;
//    private final String reservedNodeIdID;
//    private final int reservedPriorityID;
    private final long starttime;
    private final long finishtime;
    private final String state;
//    private final String reservedNodeHost;
//    private final int reservedNodePort;
    private final String finishedStatusState;
    private final int exitStatus;
    
    public HopRMContainer(String containerIdID, String applicationAttemptIdID, 
            String nodeIdID, String user, /*String reservedNodeIdID, 
            int reservedPriorityID,*/ long starttime, long finishtime,
            String state, /*String reservedNodeHost, Integer reservedNodePort,*/ 
            String finishedStatusState, Integer exitStatus) {
        this.containerIdID = containerIdID;
        this.applicationAttemptIdID = applicationAttemptIdID;
        this.nodeIdID = nodeIdID;
        this.user = user;
//        this.reservedNodeIdID = reservedNodeIdID;
//        this.reservedPriorityID = reservedPriorityID;
        this.starttime = starttime;
        this.finishtime = finishtime;
        this.state = state;
//        this.reservedNodeHost = reservedNodeId;
//        this.reservedNodePort = reservedNodePort;
        this.finishedStatusState = finishedStatusState;
        this.exitStatus = exitStatus;
    }

    public String getContainerIdID() {
        return containerIdID;
    }

    public String getApplicationAttemptIdID() {
        return applicationAttemptIdID;
    }

    public String getNodeIdID() {
        return nodeIdID;
    }

    public String getUser() {
        return user;
    }

//    public String getReservedNodeIdID() {
//        return reservedNodeIdID;
//    }

//    public int getReservedPriorityID() {
//        return reservedPriorityID;
//    }

    public long getStarttime() {
        return starttime;
    }

    public long getFinishtime() {
        return finishtime;
    }

  public String getState() {
    return state;
  }

//  public String getReservedNodeId() {
//    return reservedNodeHost;
//  }
//
//  public int getReservedNodePort() {
//    return reservedNodePort;
//  }

  public String getFinishedStatusState() {
    return finishedStatusState;
  }

  public int getExitStatus() {
    return exitStatus;
  }
    
}
