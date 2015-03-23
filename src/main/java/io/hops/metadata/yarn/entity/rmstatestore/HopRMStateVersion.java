

package io.hops.metadata.yarn.entity.rmstatestore;

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
