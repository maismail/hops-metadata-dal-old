package se.sics.hop.metadata.yarn.dal;

import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface RMNodeImplDataAccess<T> extends EntityDataAccess{
    T findByHostNameHttpPort(String hostName, int httpPort); 
    
}
