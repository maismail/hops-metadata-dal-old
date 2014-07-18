/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn.appmasterrpc;

/**
 *
 * @author Nikos Stanogias <niksta@sics.se>
 */
public class HopAppMasterRPC {
    private final int id;
    private final String type;
    private final byte[] rpc;

    public HopAppMasterRPC(int id, String type, byte[] rpc) {
        this.id = id;
        this.type = type;
        this.rpc = rpc;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public byte[] getRpc() {
        return rpc;
    }
}

    
