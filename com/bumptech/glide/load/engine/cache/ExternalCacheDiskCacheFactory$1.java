package com.bumptech.glide.load.engine.cache;

import android.content.Context;
import java.io.File;

class ExternalCacheDiskCacheFactory$1
  implements DiskLruCacheFactory.CacheDirectoryGetter
{
  ExternalCacheDiskCacheFactory$1(Context paramContext, String paramString) {}
  
  public File getCacheDirectory()
  {
    Object localObject = this.val$context;
    File localFile = ((Context)localObject).getExternalCacheDir();
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
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\ExternalCacheDiskCacheFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */