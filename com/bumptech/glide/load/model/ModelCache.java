package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;

public class ModelCache
{
  private static final int DEFAULT_SIZE = 250;
  private final LruCache cache;
  
  public ModelCache()
  {
    this(250L);
  }
  
  public ModelCache(long paramLong)
  {
    ModelCache.1 local1 = new com/bumptech/glide/load/model/ModelCache$1;
    local1.<init>(this, paramLong);
    this.cache = local1;
  }
  
  public void clear()
  {
    this.cache.clearMemory();
  }
  
  public Object get(Object paramObject, int paramInt1, int paramInt2)
  {
    ModelCache.ModelKey localModelKey = ModelCache.ModelKey.get(paramObject, paramInt1, paramInt2);
    Object localObject = this.cache.get(localModelKey);
    localModelKey.release();
    return localObject;
  }
  
  public void put(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2)
  {
    ModelCache.ModelKey localModelKey = ModelCache.ModelKey.get(paramObject1, paramInt1, paramInt2);
    this.cache.put(localModelKey, paramObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */