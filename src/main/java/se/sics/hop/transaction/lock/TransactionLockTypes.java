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
package se.sics.hop.transaction.lock;

/**
 *
 * @author salman
 */
public class TransactionLockTypes {
    public enum LockType {

    WRITE, READ, READ_COMMITTED
  }

  public enum INodeLockType {
      READ_COMMITTED, // No Lock
      READ,
      WRITE,
      WRITE_ON_PARENT; // Write lock on the parent of the last path component. This has the WRITE effect when using inode-id.
      public boolean gt(INodeLockType second){
        if(ordinal() > second.ordinal()){
          return true;
        }else{
          return false;
        }
      }
    }

  public enum INodeResolveType {
    INDIVIDUAL,
    PATH // resolve only the given path
    , PATH_AND_IMMEDIATE_CHILDREN // resolve path and find the given directory's children
    , PATH_AND_ALL_CHILDREN_RECURESIVELY // resolve the given path and find all the children recursively.
  }
  
    
}
