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
public class HopSequenceNumber {
    private final int id;
    private final int sequencenumber;

    public HopSequenceNumber(int id, int sequencenumber) {
        this.id = id;
        this.sequencenumber = sequencenumber;
    }

    public int getId() {
        return id;
    }

    public int getSequencenumber() {
        return sequencenumber;
    }
}
