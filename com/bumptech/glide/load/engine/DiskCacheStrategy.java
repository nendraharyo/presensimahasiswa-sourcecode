package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

public abstract class DiskCacheStrategy
{
  public static final DiskCacheStrategy ALL;
  public static final DiskCacheStrategy AUTOMATIC;
  public static final DiskCacheStrategy DATA;
  public static final DiskCacheStrategy NONE;
  public static final DiskCacheStrategy RESOURCE;
  
  static
  {
    Object localObject = new com/bumptech/glide/load/engine/DiskCacheStrategy$1;
    ((DiskCacheStrategy.1)localObject).<init>();
    ALL = (DiskCacheStrategy)localObject;
    localObject = new com/bumptech/glide/load/engine/DiskCacheStrategy$2;
    ((DiskCacheStrategy.2)localObject).<init>();
    NONE = (DiskCacheStrategy)localObject;
    localObject = new com/bumptech/glide/load/engine/DiskCacheStrategy$3;
    ((DiskCacheStrategy.3)localObject).<init>();
    DATA = (DiskCacheStrategy)localObject;
    localObject = new com/bumptech/glide/load/engine/DiskCacheStrategy$4;
    ((DiskCacheStrategy.4)localObject).<init>();
    RESOURCE = (DiskCacheStrategy)localObject;
    localObject = new com/bumptech/glide/load/engine/DiskCacheStrategy$5;
    ((DiskCacheStrategy.5)localObject).<init>();
    AUTOMATIC = (DiskCacheStrategy)localObject;
  }
  
  public abstract boolean decodeCachedData();
  
  public abstract boolean decodeCachedResource();
  
  public abstract boolean isDataCacheable(DataSource paramDataSource);
  
  public abstract boolean isResourceCacheable(boolean paramBoolean, DataSource paramDataSource, EncodeStrategy paramEncodeStrategy);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DiskCacheStrategy.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */