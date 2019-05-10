package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;

class SizeConfigStrategy$KeyPool
  extends BaseKeyPool
{
  protected SizeConfigStrategy.Key create()
  {
    SizeConfigStrategy.Key localKey = new com/bumptech/glide/load/engine/bitmap_recycle/SizeConfigStrategy$Key;
    localKey.<init>(this);
    return localKey;
  }
  
  public SizeConfigStrategy.Key get(int paramInt, Bitmap.Config paramConfig)
  {
    SizeConfigStrategy.Key localKey = (SizeConfigStrategy.Key)get();
    localKey.init(paramInt, paramConfig);
    return localKey;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\SizeConfigStrategy$KeyPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */