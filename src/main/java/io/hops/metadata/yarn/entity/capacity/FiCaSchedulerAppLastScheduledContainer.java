

package io.hops.metadata.yarn.entity.capacity;

public class FiCaSchedulerAppLastScheduledContainer {
    private final String schedulerapp_id;
    private final int priority_id;
    private final long time;

    public FiCaSchedulerAppLastScheduledContainer(String schedulerapp_id,
        int priority_id, long time) {
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
