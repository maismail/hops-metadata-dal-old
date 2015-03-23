

package io.hops.metadata.hdfs.entity.yarn.capacity;

public class HopFiCaSchedulerAppLastScheduledContainer {
    private final String schedulerapp_id;
    private final int priority_id;
    private final long time;

    public HopFiCaSchedulerAppLastScheduledContainer(String schedulerapp_id, int priority_id, long time) {
        this.schedulerapp_id = schedulerapp_id;
        this.priority_id = priority_id;
        this.time = time;
    }

    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }

    public long getTime() {
        return time;
    }
}
