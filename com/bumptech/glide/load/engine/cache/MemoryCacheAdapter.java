package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;

public class MemoryCacheAdapter
  implements MemoryCache
{
  private MemoryCache.ResourceRemovedListener listener;
  
  public void clearMemory() {}
  
  public long getCurrentSize()
  {
    return 0L;
  }
  
  public long getMaxSize()
  {
    return 0L;
  }
  
  public Resource put(Key paramKey, Resource paramResource)
  {
    if (paramResource != null)
    {
      MemoryCache.ResourceRemovedListener localResourceRemovedListener = this.listener;
      localResourceRemovedListener.onResourceRemoved(paramResource);
    }
    return null;
  }
  
  public Resource remove(Key paramKey)
  {
    return null;
  }
  
  public void setResourceRemovedListener(MemoryCache.ResourceRemovedListener paramResourceRemovedListener)
  {
    this.listener = paramResourceRemovedListener;
  }
  
  public void setSizeMultiplier(float paramFloat) {}
  
  public void trimMemory(int paramInt) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\MemoryCacheAdapter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */