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
public class HopDelegationKey {
    private final int key;
    private final byte[] delegationkey;

    public HopDelegationKey(int key, byte[] delegationkey) {
        this.key = key;
        this.delegationkey = delegationkey;
    }

    public int getKey() {
        return key;
    }

    public byte[] getDelegationkey() {
        return delegationkey;
    }
}
