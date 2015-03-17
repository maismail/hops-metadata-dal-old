package se.sics.hop.metadata.hdfs.entity.yarn;

public class HopNodeHBResponse {

    private final String rmnodeId;
    private final byte[] responseid;

    public HopNodeHBResponse(String rmnodeId, byte[] responseid) {
        this.rmnodeId = rmnodeId;
        this.responseid = responseid;
    }

    public String getRMNodeId() {
        return rmnodeId;
    }

    public byte[] getResponseid() {
        return responseid;
    }
}
