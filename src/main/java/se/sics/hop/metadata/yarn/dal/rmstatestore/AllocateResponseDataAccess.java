package se.sics.hop.metadata.yarn.dal.rmstatestore;


import java.util.List;
import se.sics.hop.exception.StorageException;
import se.sics.hop.metadata.hdfs.dal.EntityDataAccess;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author gautier
 */
public interface AllocateResponseDataAccess<T> extends EntityDataAccess {
  void addAllocateResponse(T entry) throws StorageException;
  List<T> getAll() throws StorageException;
}
