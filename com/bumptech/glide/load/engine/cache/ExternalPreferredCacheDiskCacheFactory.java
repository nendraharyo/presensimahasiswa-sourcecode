package com.bumptech.glide.load.engine.cache;

import android.content.Context;

public final class ExternalPreferredCacheDiskCacheFactory
  extends DiskLruCacheFactory
{
  public ExternalPreferredCacheDiskCacheFactory(Context paramContext)
  {
    this(paramContext, "image_manager_disk_cache", 262144000L);
  }
  
  public ExternalPreferredCacheDiskCacheFactory(Context paramContext, long paramLong)
  {
    this(paramContext, "image_manager_disk_cache", paramLong);
  }
  
  public ExternalPreferredCacheDiskCacheFactory(Context paramContext, String paramString, long paramLong)
  {
    super(local1, paramLong);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\ExternalPreferredCacheDiskCacheFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */