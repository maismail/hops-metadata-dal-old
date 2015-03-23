package io.hops.metadata.hdfs.entity.yarn;

import com.google.common.base.Splitter;
import java.util.Iterator;

public class HopApplicationId {

  private final String id;
  private long clustertimestamp;
  private int appId;

  public HopApplicationId(String id) {
    this.id = id;
    build();
  }

  public String getId() {
    return id;
  }

  public int getAppId(){
      return appId;
  }
  
   private void build() {
    Iterator<String> it = Splitter.on('_').trimResults().split(id).iterator();
    it.next(); // prefix.
    clustertimestamp = Long.parseLong(it.next());
    appId = Integer.parseInt(it.next());
  }

  
  public long getClustertimestamp() {
    return clustertimestamp;
  }

  /**
   *
   * @param object
   * @return
   */
  @Override
  public boolean equals(Object object) {
    if (object instanceof HopApplicationId) {
      HopApplicationId oth = (HopApplicationId) object;
      return id.equals(oth.getId()) && clustertimestamp == oth.getClustertimestamp();
    } else {
      return false;
    }

  }

  @Override
  public int hashCode() {
    int hash = 5;
    hash = 53 * hash + (this.id != null ? this.id.hashCode() : 0);
    hash = 53 * hash + (int) (this.clustertimestamp ^ (this.clustertimestamp >>> 32));
    return hash;
  }
}
