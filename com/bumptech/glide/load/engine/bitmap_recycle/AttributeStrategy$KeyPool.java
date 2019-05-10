package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;

class AttributeStrategy$KeyPool
  extends BaseKeyPool
{
  protected AttributeStrategy.Key create()
  {
    AttributeStrategy.Key localKey = new com/bumptech/glide/load/engine/bitmap_recycle/AttributeStrategy$Key;
    localKey.<init>(this);
    return localKey;
  }
  
  AttributeStrategy.Key get(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    AttributeStrategy.Key localKey = (AttributeStrategy.Key)get();
    localKey.init(paramInt1, paramInt2, paramConfig);
    return localKey;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\AttributeStrategy$KeyPool.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */