package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

class DiskCacheStrategy$4
  extends DiskCacheStrategy
{
  public boolean decodeCachedData()
  {
    return false;
  }
  
  public boolean decodeCachedResource()
  {
    return true;
  }
  
  public boolean isDataCacheable(DataSource paramDataSource)
  {
    return false;
  }
  
  public boolean isResourceCacheable(boolean paramBoolean, DataSource paramDataSource, EncodeStrategy paramEncodeStrategy)
  {
    DataSource localDataSource = DataSource.RESOURCE_DISK_CACHE;
    boolean bool;
    if (paramDataSource != localDataSource)
    {
      localDataSource = DataSource.MEMORY_CACHE;
      if (paramDataSource != localDataSource) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDataSource = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DiskCacheStrategy$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */