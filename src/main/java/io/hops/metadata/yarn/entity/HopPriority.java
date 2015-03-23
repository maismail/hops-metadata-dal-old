package io.hops.metadata.yarn.entity;

/**
 * Pojo representing Priority class.
 */
public class HopPriority {

    private int id;
    private int priority;

    public HopPriority(int id, int priority) {
        this.id = id;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public int getPriority() {
        return priority;
    }
}
