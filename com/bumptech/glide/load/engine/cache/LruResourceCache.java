package com.bumptech.glide.load.engine.cache;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.LruCache;

public class LruResourceCache
  extends LruCache
  implements MemoryCache
{
  private MemoryCache.ResourceRemovedListener listener;
  
  public LruResourceCache(long paramLong)
  {
    super(paramLong);
  }
  
  protected int getSize(Resource paramResource)
  {
    if (paramResource == null) {}
    for (int i = super.getSize(null);; i = paramResource.getSize()) {
      return i;
    }
  }
  
  protected void onItemEvicted(Key paramKey, Resource paramResource)
  {
    MemoryCache.ResourceRemovedListener localResourceRemovedListener = this.listener;
    if ((localResourceRemovedListener != null) && (paramResource != null))
    {
      localResourceRemovedListener = this.listener;
      localResourceRemovedListener.onResourceRemoved(paramResource);
    }
  }
  
  public void setResourceRemovedListener(MemoryCache.ResourceRemovedListener paramResourceRemovedListener)
  {
    this.listener = paramResourceRemovedListener;
  }
  
  public void trimMemory(int paramInt)
  {
    int i = 40;
    if (paramInt >= i) {
      clearMemory();
    }
    for (;;)
    {
      return;
      i = 20;
      if (paramInt < i)
      {
        i = 15;
        if (paramInt != i) {}
      }
      else
      {
        long l1 = getMaxSize();
        long l2 = 2;
        l1 /= l2;
        trimToSize(l1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\cache\LruResourceCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */