package com.bumptech.glide.load.engine.cache;

public abstract interface DiskCache$Factory
{
  public static final String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
  public static final int DEFAULT_DISK_CACHE_SIZE = 262144000;
  
  public abstract DiskCache build();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskCache$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */