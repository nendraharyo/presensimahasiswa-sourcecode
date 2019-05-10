package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

class DiskCacheStrategy$2
  extends DiskCacheStrategy
{
  public boolean decodeCachedData()
  {
    return false;
  }
  
  public boolean decodeCachedResource()
  {
    return false;
  }
  
  public boolean isDataCacheable(DataSource paramDataSource)
  {
    return false;
  }
  
  public boolean isResourceCacheable(boolean paramBoolean, DataSource paramDataSource, EncodeStrategy paramEncodeStrategy)
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DiskCacheStrategy$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */