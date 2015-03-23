

package io.hops.metadata.yarn.entity;

public class FiCaSchedulerAppNewlyAllocatedContainers {
    private final String schedulerapp_id;
    private final String rmcontainer_id;

    public FiCaSchedulerAppNewlyAllocatedContainers(String schedulerapp_id,
        String rmcontainer_id) {
        this.schedulerapp_id = schedulerapp_id;
        this.rmcontainer_id = rmcontainer_id;
    }

    public String getSchedulerapp_id() {
        return schedulerapp_id;
    }

    public String getRmcontainer_id() {
        return rmcontainer_id;
    }
}
