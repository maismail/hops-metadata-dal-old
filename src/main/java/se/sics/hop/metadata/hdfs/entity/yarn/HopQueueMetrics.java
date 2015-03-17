/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.hdfs.entity.yarn;

public class HopQueueMetrics {
    private final int id;
    private final int appssubmitted;
    private final int appsrunning;
    private final int appspending;
    private final int appscompleted;
    private final int appskilled;
    private final int appsfailed;
    private final int allocatedmb;
    private final int allocatedvcores;
    private final int allocatedcontainers;
    private final long aggregatecontainersallocated;
    private final long aggregatecontainersreleased;
    private final int availablemb;
    private final int availablevcores;
    private final int pendingmb;
    private final int pendingvcores;
    private final int pendingContainers;
    private final int reservedmb;
    private final int reservedvcores;
    private final int reservedcontainers;
    private final int activeusers;
    private final int activeapplications;
    private final int parentid;
    private final String queuename;

    public HopQueueMetrics(int id, int appssubmitted, int appsrunning, int appspending,
            int appscompleted, int appskilled, int appsfailed, int allocatedmb, 
            int allocatedvcores, int allocatedcontainers, long aggregatecontainersallocated, 
            long aggregatecontainersreleased, int availablemb, int availablevcores, 
            int pendingmb, int pendingvcores, int pendingContainers, int reservedmb, int reservedvcores, 
            int reservedcontainers, int activeusers, int activeapplications, 
            int parentid, String queuename) {
        this.id = id;
        this.appssubmitted = appssubmitted;
        this.appsrunning = appsrunning;
        this.appspending = appspending;
        this.appscompleted = appscompleted;
        this.appskilled = appskilled;
        this.appsfailed = appsfailed;
        this.allocatedmb = allocatedmb;
        this.allocatedvcores = allocatedvcores;
        this.allocatedcontainers = allocatedcontainers;
        this.aggregatecontainersallocated = aggregatecontainersallocated;
        this.aggregatecontainersreleased = aggregatecontainersreleased;
        this.availablemb = availablemb;
        this.availablevcores = availablevcores;
        this.pendingmb = pendingmb;
        this.pendingvcores = pendingvcores;
        this.pendingContainers= pendingContainers;
        this.reservedmb = reservedmb;
        this.reservedvcores = reservedvcores;
        this.reservedcontainers = reservedcontainers;
        this.activeusers = activeusers;
        this.activeapplications = activeapplications;
        this.parentid = parentid;
        this.queuename = queuename;
    }

    public int getId() {
        return id;
    }

    public int getAppssubmitted() {
        return appssubmitted;
    }

    public int getAppsrunning() {
        return appsrunning;
    }

    public int getAppspending() {
        return appspending;
    }

    public int getAppscompleted() {
        return appscompleted;
    }

    public int getAppskilled() {
        return appskilled;
    }

    public int getAppsfailed() {
        return appsfailed;
    }

    public int getAllocatedmb() {
        return allocatedmb;
    }

    public int getAllocatedvcores() {
        return allocatedvcores;
    }

    public int getAllocatedcontainers() {
        return allocatedcontainers;
    }

    public long getAggregatecontainersallocated() {
        return aggregatecontainersallocated;
    }

    public long getAggregatecontainersreleased() {
        return aggregatecontainersreleased;
    }

    public int getAvailablemb() {
        return availablemb;
    }

    public int getAvailablevcores() {
        return availablevcores;
    }

    public int getPendingmb() {
        return pendingmb;
    }

    public int getPendingvcores() {
        return pendingvcores;
    }

    public int getPendingContainers(){
      return pendingContainers;
    }
    
    public int getReservedmb() {
        return reservedmb;
    }

    public int getReservedvcores() {
        return reservedvcores;
    }

    public int getReservedcontainers() {
        return reservedcontainers;
    }

    public int getActiveusers() {
        return activeusers;
    }

    public int getActiveapplications() {
        return activeapplications;
    }

    public int getParentid() {
        return parentid;
    }

    public String getQueuename() {
        return queuename;
    }
    
}
