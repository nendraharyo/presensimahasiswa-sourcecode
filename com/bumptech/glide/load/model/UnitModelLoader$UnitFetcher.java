package com.bumptech.glide.load.model;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.DataFetcher.DataCallback;

class UnitModelLoader$UnitFetcher
  implements DataFetcher
{
  private final Object resource;
  
  UnitModelLoader$UnitFetcher(Object paramObject)
  {
    this.resource = paramObject;
  }
  
  public void cancel() {}
  
  public void cleanup() {}
  
  public Class getDataClass()
  {
    return this.resource.getClass();
  }
  
  public DataSource getDataSource()
  {
    return DataSource.LOCAL;
  }
  
  public void loadData(Priority paramPriority, DataFetcher.DataCallback paramDataCallback)
  {
    Object localObject = this.resource;
    paramDataCallback.onDataReady(localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UnitModelLoader$UnitFetcher.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */