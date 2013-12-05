/*
 * Copyright 2013 Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package se.sics.hop.metadata.persistence.dal;

import java.util.Collection;
import se.sics.hop.metadata.persistence.entity.HopINodeAttributes;
import se.sics.hop.metadata.persistence.exceptions.StorageException;

/**
 *
 * @author salman
 */
public abstract class INodeAttributesDataAccess extends EntityDataAccess {
  public static final String TABLE_NAME = "inode_attributes";
  public static final String ID = "inodeId";
  public static final String NSQUOTA = "nsquota";
  public static final String DSQUOTA = "dsquota";
  public static final String NSCOUNT = "nscount";
  public static final String DISKSPACE = "diskspace";
  

  public abstract HopINodeAttributes findAttributesByPk(long inodeId) throws StorageException;
  public abstract void prepare(Collection<HopINodeAttributes> modified, Collection<HopINodeAttributes> removed) throws StorageException;
    
}
