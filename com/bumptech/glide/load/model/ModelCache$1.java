package com.bumptech.glide.load.model;

import com.bumptech.glide.util.LruCache;

class ModelCache$1
  extends LruCache
{
  ModelCache$1(ModelCache paramModelCache, long paramLong)
  {
    super(paramLong);
  }
  
  protected void onItemEvicted(ModelCache.ModelKey paramModelKey, Object paramObject)
  {
    paramModelKey.release();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelCache$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */