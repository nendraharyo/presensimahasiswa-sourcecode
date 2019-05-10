package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import java.io.File;

public abstract interface DiskCache
{
  public abstract void clear();
  
  public abstract void delete(Key paramKey);
  
  public abstract File get(Key paramKey);
  
  public abstract void put(Key paramKey, DiskCache.Writer paramWriter);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\DiskCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */