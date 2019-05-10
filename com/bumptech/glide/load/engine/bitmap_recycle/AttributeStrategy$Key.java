package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;

class AttributeStrategy$Key
  implements Poolable
{
  private Bitmap.Config config;
  private int height;
  private final AttributeStrategy.KeyPool pool;
  private int width;
  
  public AttributeStrategy$Key(AttributeStrategy.KeyPool paramKeyPool)
  {
    this.pool = paramKeyPool;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Key;
    if (bool2)
    {
      paramObject = (Key)paramObject;
      int i = this.width;
      int j = ((Key)paramObject).width;
      if (i == j)
      {
        i = this.height;
        j = ((Key)paramObject).height;
        if (i == j)
        {
          Bitmap.Config localConfig1 = this.config;
          Bitmap.Config localConfig2 = ((Key)paramObject).config;
          if (localConfig1 == localConfig2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = this.width * 31;
    int j = this.height;
    i += j;
    j = i * 31;
    Bitmap.Config localConfig = this.config;
    if (localConfig != null)
    {
      localConfig = this.config;
      i = localConfig.hashCode();
    }
    for (;;)
    {
      return i + j;
      i = 0;
      localConfig = null;
    }
  }
  
  public void init(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    this.width = paramInt1;
    this.height = paramInt2;
    this.config = paramConfig;
  }
  
  public void offer()
  {
    this.pool.offer(this);
  }
  
  public String toString()
  {
    int i = this.width;
    int j = this.height;
    Bitmap.Config localConfig = this.config;
    return AttributeStrategy.getBitmapString(i, j, localConfig);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\AttributeStrategy$Key.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */