package io.hops.metadata.yarn.entity;

/**
 * Hop object representing the inactivenodes Map of RMContext.
 */
public class HopRMContextInactiveNodes {

    private final String rmnodeid;

    public HopRMContextInactiveNodes(String rmnodeid) {
        this.rmnodeid = rmnodeid;
    }

    public String getRmnodeid() {
        return rmnodeid;
    }

}
