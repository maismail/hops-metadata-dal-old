

package io.hops.metadata.yarn.entity.fair;

public class FSSchedulerNode {
    
    private final String rmnodeid;
    private final int numcontainers;
    private final String reservedcontainerId;
    private final String reservedappschedulableId;

    public FSSchedulerNode(String rmnodeid, int numcontainers,
        String reservedcontainerId, String reservedappschedulableId) {
        this.rmnodeid = rmnodeid;
        this.numcontainers = numcontainers;
        this.reservedcontainerId = reservedcontainerId;
        this.reservedappschedulableId = reservedappschedulableId;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

    public int getNumcontainers() {
        return numcontainers;
    }

    public String getReservedcontainerId() {
        return reservedcontainerId;
    }

    public String getReservedappschedulableId() {
        return reservedappschedulableId;
    }
}
