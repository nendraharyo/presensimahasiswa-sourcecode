package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

class DiskCacheStrategy$3
  extends DiskCacheStrategy
{
  public boolean decodeCachedData()
  {
    return true;
  }
  
  public boolean decodeCachedResource()
  {
    return false;
  }
  
  public boolean isDataCacheable(DataSource paramDataSource)
  {
    DataSource localDataSource = DataSource.DATA_DISK_CACHE;
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
  
  public boolean isResourceCacheable(boolean paramBoolean, DataSource paramDataSource, EncodeStrategy paramEncodeStrategy)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DiskCacheStrategy$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */