package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public abstract interface MemoryCache
{
  public abstract void clearMemory();
  
  public abstract long getCurrentSize();
  
  public abstract long getMaxSize();
  
  public abstract Resource put(Key paramKey, Resource paramResource);
  
  public abstract Resource remove(Key paramKey);
  
  public abstract void setResourceRemovedListener(MemoryCache.ResourceRemovedListener paramResourceRemovedListener);
  
  public abstract void setSizeMultiplier(float paramFloat);
  
  public abstract void trimMemory(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\MemoryCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */