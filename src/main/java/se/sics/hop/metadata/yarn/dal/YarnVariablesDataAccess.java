/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package se.sics.hop.metadata.yarn.dal;

import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/**
 *
 * @author teo
 */
public interface YarnVariablesDataAccess<T> extends EntityDataAccess {
    int getNodeId() throws StorageException;
}
