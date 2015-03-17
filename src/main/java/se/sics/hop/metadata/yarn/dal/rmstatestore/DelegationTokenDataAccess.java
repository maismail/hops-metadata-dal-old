package se.sics.hop.metadata.yarn.dal.rmstatestore;

import java.util.Collection;
import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;
import se.sics.hop.metadata.hdfs.entity.yarn.rmstatestore.HopDelegationToken;

public interface DelegationTokenDataAccess<T> extends EntityDataAccess {

    T findBySeqNumber(int seqnumber) throws StorageException;

    void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

    public void createDelegationTokenEntry(HopDelegationToken hopDelegationToken) throws StorageException;

    List<T> getAll() throws StorageException;
}
