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
    private final String enumproto;
    private final byte[] proto;

    public HopAppMasterRPC(int id, String enumproto, byte[] proto) {
        this.id = id;
        this.enumproto = enumproto;
        this.proto = proto;
    }

    public int getId() {
        return id;
    }

    public String getEnumproto() {
        return enumproto;
    }

    public byte[] getProto() {
        return proto;
    }
}

    
