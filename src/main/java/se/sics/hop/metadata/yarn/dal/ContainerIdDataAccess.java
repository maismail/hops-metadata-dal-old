/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.yarn.dal;

import java.util.Collection;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author Theofilos Kakantousis <tkak@sics.se>
 */
public interface ContainerIdDataAccess<T> extends EntityDataAccess {

    T findById(int id) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    void createContainerStatus(T containerstatus) throws StorageException;
}
