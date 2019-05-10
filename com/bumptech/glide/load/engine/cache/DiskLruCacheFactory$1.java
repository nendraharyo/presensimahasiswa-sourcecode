package com.bumptech.glide.load.engine.cache;

import java.io.File;

class DiskLruCacheFactory$1
  implements DiskLruCacheFactory.CacheDirectoryGetter
{
  DiskLruCacheFactory$1(String paramString) {}
  
  public File getCacheDirectory()
  {
    File localFile = new java/io/File;
    String str = this.val$diskCacheFolder;
    localFile.<init>(str);
    return localFile;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskLruCacheFactory$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */