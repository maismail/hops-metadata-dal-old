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
public class HopApplicationAttemptState {
    private final int applicationid;
    private final int applicationattemptid;
    private final byte[] applicationattemptstate;

    public HopApplicationAttemptState(int applicationid, int applicationattemptid, byte[] applicationattemptstate) {
        this.applicationid = applicationid;
        this.applicationattemptid = applicationattemptid;
        this.applicationattemptstate = applicationattemptstate;
    }

    public int getApplicationid() {
        return applicationid;
    }

    public int getApplicationattemptid() {
        return applicationattemptid;
    }

    public byte[] getApplicationattemptstate() {
        return applicationattemptstate;
    }
}
