package com.bumptech.glide.load.engine.bitmap_recycle;

final class LruArrayPool$KeyPool
  extends BaseKeyPool
{
  protected LruArrayPool.Key create()
  {
    LruArrayPool.Key localKey = new com/bumptech/glide/load/engine/bitmap_recycle/LruArrayPool$Key;
    localKey.<init>(this);
    return localKey;
  }
  
  LruArrayPool.Key get(int paramInt, Class paramClass)
  {
    LruArrayPool.Key localKey = (LruArrayPool.Key)get();
    localKey.init(paramInt, paramClass);
    return localKey;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\LruArrayPool$KeyPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */