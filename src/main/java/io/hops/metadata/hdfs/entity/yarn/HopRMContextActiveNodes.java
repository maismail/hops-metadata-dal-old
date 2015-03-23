package io.hops.metadata.hdfs.entity.yarn;

/**
 * Hop object representing the nodes Map of RMContext.
 */
public class HopRMContextActiveNodes {

    private final String nodeId;

    public HopRMContextActiveNodes(String nodeidId) {
        this.nodeId = nodeidId;
    }

    public String getNodeId() {
        return nodeId;
    }
}
