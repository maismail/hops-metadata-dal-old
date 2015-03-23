

package io.hops.metadata.yarn.entity.rmstatestore;

public class DelegationToken {
    private final int seqnumber;
    private final byte[] rmdtidentifier;

    public DelegationToken(int seqnumber, byte[] rmdtidentifier) {
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
