package com.bumptech.glide.load.engine.cache;

import android.content.Context;

public final class InternalCacheDiskCacheFactory
  extends DiskLruCacheFactory
{
  public InternalCacheDiskCacheFactory(Context paramContext)
  {
    this(paramContext, "image_manager_disk_cache", 262144000L);
  }
  
  public InternalCacheDiskCacheFactory(Context paramContext, long paramLong)
  {
    this(paramContext, "image_manager_disk_cache", paramLong);
  }
  
  public InternalCacheDiskCacheFactory(Context paramContext, String paramString, long paramLong)
  {
    super(local1, paramLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\InternalCacheDiskCacheFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */