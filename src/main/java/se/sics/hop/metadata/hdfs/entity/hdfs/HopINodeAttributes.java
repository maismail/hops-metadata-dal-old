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
package se.sics.hop.metadata.hdfs.entity.hdfs;


/**
 *
 * @author salman right now it holds quota info. later we can add more
 * information like access time ( if we want to remove locks from the parent
 * dirs )
 */
public class HopINodeAttributes implements Comparable<HopINodeAttributes>  {
  private Integer inodeId;
  private Integer partKey;
  private Long nsQuota; /// NameSpace quota
  private Long nsCount;
  private Long dsQuota; /// disk space quota
  private Long diskspace;

    public HopINodeAttributes(Integer inodeId, Integer partKey, Long nsQuota, Long nsCount, Long dsQuota, Long diskspace) {
        this.inodeId = inodeId;
        this.partKey = partKey;
        this.nsQuota = nsQuota;
        this.nsCount = nsCount;
        this.dsQuota = dsQuota;
        this.diskspace = diskspace;
    }

    public Integer getInodeId() {
        return inodeId;
    }

    public Long getNsQuota() {
        return nsQuota;
    }

    public Long getNsCount() {
        return nsCount;
    }

    public Long getDsQuota() {
        return dsQuota;
    }

    public Long getDiskspace() {
        return diskspace;
    }

    public Integer getPartKey() {
      return partKey;
    }

    public void setPartKey(Integer partKey) {
      this.partKey = partKey;
    }
    
    public void setInodeId(Integer inodeId) {
        this.inodeId = inodeId;
    }

    public void setNsQuota(Long nsQuota) {
        this.nsQuota = nsQuota;
    }

    public void setNsCount(Long nsCount) {
        this.nsCount = nsCount;
    }

    public void setDsQuota(Long dsQuota) {
        this.dsQuota = dsQuota;
    }

    public void setDiskspace(Long diskspace) {
        this.diskspace = diskspace;
    }

    public int compareTo(HopINodeAttributes o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
