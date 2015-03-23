

package io.hops.metadata.yarn.entity.rmstatestore;

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
