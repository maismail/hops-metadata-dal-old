/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.sics.hop.metadata.yarn.tabledef;

public interface QueueMetricsTableDef {
    public static final String TABLE_NAME = "ha_queuemetrics";
    public static final String ID = "id";
    public static final String APPS_SUBMITTED = "apps_submitted";
    public static final String APPS_RUNNING = "apps_running";
    public static final String APPS_PENDING = "apps_pending";
    public static final String APPS_COMPLETED = "apps_completed";
    public static final String APPS_KILLED = "apps_killed";
    public static final String APPS_FAILED = "apps_failed";
    public static final String ALLOCATED_MB = "allocated_mb";
    public static final String ALLOCATED_VCORES = "allocated_vcores";
    public static final String ALLOCATED_CONTAINERS = "allocated_containers";
    public static final String AGGREGATE_CONTAINERS_ALLOCATED = "aggregate_containers_allocated";
    public static final String AGGREGATE_CONTAINERS_RELEASED = "aggregate_containers_released";
    public static final String AVAILABLE_MB = "available_mb";
    public static final String AVAILABLE_VCORES = "available_vcores";
    public static final String PENDING_CONTAINERS = "pending_containers";
    public static final String PENDING_MB = "pending_mb";
    public static final String PENDING_VCORES = "pending_vcores";
    public static final String RESERVED_MB = "reserved_mb";
    public static final String RESERVED_VCORES = "reserved_vcores";
    public static final String RESERVED_CONTAINERS = "reserved_containers";
    public static final String ACTIVE_USERS = "active_users";
    public static final String ACTIVE_APPLICATIONS = "active_applications";
    public static final String PARENT_ID = "parent_id";
    public static final String QUEUE_NAME = "queue_name";
    
}
