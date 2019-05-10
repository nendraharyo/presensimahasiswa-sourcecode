package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

class ExternalPreferredCacheDiskCacheFactory$1
  implements DiskLruCacheFactory.CacheDirectoryGetter
{
  ExternalPreferredCacheDiskCacheFactory$1(Context paramContext, String paramString) {}
  
  private File getInternalCacheDirectory()
  {
    Object localObject = this.val$context;
    File localFile = ((Context)localObject).getCacheDir();
    if (localFile == null) {
      localObject = null;
    }
    for (;;)
    {
      return (File)localObject;
      localObject = this.val$diskCacheName;
      if (localObject != null)
      {
        localObject = new java/io/File;
        String str = this.val$diskCacheName;
        ((File)localObject).<init>(localFile, str);
      }
      else
      {
        localObject = localFile;
      }
    }
  }
  
  public File getCacheDirectory()
  {
    Object localObject = getInternalCacheDirectory();
    if (localObject != null)
    {
      boolean bool1 = ((File)localObject).exists();
      if (!bool1) {}
    }
    for (;;)
    {
      return (File)localObject;
      File localFile = this.val$context.getExternalCacheDir();
      if (localFile != null)
      {
        boolean bool2 = localFile.canWrite();
        if (bool2)
        {
          localObject = this.val$diskCacheName;
          if (localObject != null)
          {
            localObject = new java/io/File;
            String str = this.val$diskCacheName;
            ((File)localObject).<init>(localFile, str);
          }
          else
          {
            localObject = localFile;
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\ExternalPreferredCacheDiskCacheFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */