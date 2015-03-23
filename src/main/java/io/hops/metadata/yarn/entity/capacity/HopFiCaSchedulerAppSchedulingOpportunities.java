

package io.hops.metadata.yarn.entity.capacity;

public class HopFiCaSchedulerAppSchedulingOpportunities {
    private final String schedulerapp_id;
    private final int priority_id;

    public HopFiCaSchedulerAppSchedulingOpportunities(String schedulerapp_id, int priority_id) {
        this.schedulerapp_id = schedulerapp_id;
        this.priority_id = priority_id;
    }

    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public int getPriority_id() {
        return priority_id;
    }
}
