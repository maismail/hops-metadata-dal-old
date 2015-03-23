package io.hops.metadata.yarn.entity;

/**
 * Hop object representing the nodes Map of RMContext.
 */
public class RMContextActiveNodes {

    private final String nodeId;

    public RMContextActiveNodes(String nodeidId) {
        this.nodeId = nodeidId;
    }

    public String getNodeId() {
        return nodeId;
    }
}
