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
public class HopRMStateVersion {
    private final int id;
    private final byte[] version;

    public HopRMStateVersion(int id, byte[] version) {
        this.id = id;
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public byte[] getVersion() {
        return version;
    }
}
