

package io.hops.metadata.hdfs.entity.yarn.rmstatestore;

public class HopDelegationToken {
    private final int seqnumber;
    private final byte[] rmdtidentifier;

    public HopDelegationToken(int seqnumber, byte[] rmdtidentifier) {
        this.seqnumber = seqnumber;
        this.rmdtidentifier = rmdtidentifier;
    }

    public int getSeqnumber() {
        return seqnumber;
    }

    public byte[] getRmdtidentifier() {
        return rmdtidentifier;
    }
}
