package com.bumptech.glide.load.engine.cache;

import java.io.File;

public class DiskLruCacheFactory
  implements DiskCache.Factory
{
  private final DiskLruCacheFactory.CacheDirectoryGetter cacheDirectoryGetter;
  private final long diskCacheSize;
  
  public DiskLruCacheFactory(DiskLruCacheFactory.CacheDirectoryGetter paramCacheDirectoryGetter, long paramLong)
  {
    this.diskCacheSize = paramLong;
    this.cacheDirectoryGetter = paramCacheDirectoryGetter;
  }
  
  public DiskLruCacheFactory(String paramString, long paramLong)
  {
    this(local1, paramLong);
  }
  
  public DiskLruCacheFactory(String paramString1, String paramString2, long paramLong)
  {
    this(local2, paramLong);
  }
  
  public DiskCache build()
  {
    DiskCache localDiskCache = null;
    File localFile = this.cacheDirectoryGetter.getCacheDirectory();
    if (localFile == null) {}
    for (;;)
    {
      return localDiskCache;
      boolean bool = localFile.mkdirs();
      if (!bool)
      {
        bool = localFile.exists();
        if (bool)
        {
          bool = localFile.isDirectory();
          if (!bool) {}
        }
      }
      else
      {
        long l = this.diskCacheSize;
        localDiskCache = DiskLruCacheWrapper.create(localFile, l);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskLruCacheFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */