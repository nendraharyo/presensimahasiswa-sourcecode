package com.bumptech.glide.load.engine.cache;

import java.io.File;

class DiskLruCacheFactory$2
  implements DiskLruCacheFactory.CacheDirectoryGetter
{
  DiskLruCacheFactory$2(String paramString1, String paramString2) {}
  
  public File getCacheDirectory()
  {
    File localFile = new java/io/File;
    String str1 = this.val$diskCacheFolder;
    String str2 = this.val$diskCacheName;
    localFile.<init>(str1, str2);
    return localFile;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskLruCacheFactory$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */