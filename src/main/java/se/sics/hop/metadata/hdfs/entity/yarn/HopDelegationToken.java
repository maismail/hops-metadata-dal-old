/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn;

/**
 *
 * @author nickstanogias
 */
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
