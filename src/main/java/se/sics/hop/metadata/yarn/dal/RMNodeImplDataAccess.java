package se.sics.hop.metadata.yarn.dal;

import java.util.List;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 * @param <T>
 */
public interface RMNodeImplDataAccess<T> extends EntityDataAccess {

    T findByHostNameHttpPort(String hostName, int httpPort);
    T findByHostName(String hostName);
    List<T> findByNodeAddress(String nodeAddress);
    void setRMNodeImpl(T rmNode);
}
