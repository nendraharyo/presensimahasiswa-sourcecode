package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

class DiskCacheStrategy$5
  extends DiskCacheStrategy
{
  public boolean decodeCachedData()
  {
    return true;
  }
  
  public boolean decodeCachedResource()
  {
    return true;
  }
  
  public boolean isDataCacheable(DataSource paramDataSource)
  {
    DataSource localDataSource = DataSource.REMOTE;
    boolean bool;
    if (paramDataSource == localDataSource) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataSource = null;
    }
  }
  
  public boolean isResourceCacheable(boolean paramBoolean, DataSource paramDataSource, EncodeStrategy paramEncodeStrategy)
  {
    if (paramBoolean)
    {
      localObject = DataSource.DATA_DISK_CACHE;
      if (paramDataSource == localObject) {}
    }
    else
    {
      localObject = DataSource.LOCAL;
      if (paramDataSource != localObject) {
        break label43;
      }
    }
    Object localObject = EncodeStrategy.TRANSFORMED;
    boolean bool;
    if (paramEncodeStrategy == localObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      label43:
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DiskCacheStrategy$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */