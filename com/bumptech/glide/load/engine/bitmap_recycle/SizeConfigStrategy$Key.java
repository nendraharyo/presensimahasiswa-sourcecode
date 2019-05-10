package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap.Config;
import com.bumptech.glide.util.Util;

final class SizeConfigStrategy$Key
  implements Poolable
{
  private Bitmap.Config config;
  private final SizeConfigStrategy.KeyPool pool;
  int size;
  
  public SizeConfigStrategy$Key(SizeConfigStrategy.KeyPool paramKeyPool)
  {
    this.pool = paramKeyPool;
  }
  
  SizeConfigStrategy$Key(SizeConfigStrategy.KeyPool paramKeyPool, int paramInt, Bitmap.Config paramConfig)
  {
    this(paramKeyPool);
    init(paramInt, paramConfig);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof Key;
    if (bool2)
    {
      paramObject = (Key)paramObject;
      int i = this.size;
      int j = ((Key)paramObject).size;
      if (i == j)
      {
        Bitmap.Config localConfig1 = this.config;
        Bitmap.Config localConfig2 = ((Key)paramObject).config;
        boolean bool3 = Util.bothNullOrEqual(localConfig1, localConfig2);
        if (bool3) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = this.size;
    int j = i * 31;
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
  
  public void init(int paramInt, Bitmap.Config paramConfig)
  {
    this.size = paramInt;
    this.config = paramConfig;
  }
  
  public void offer()
  {
    this.pool.offer(this);
  }
  
  public String toString()
  {
    int i = this.size;
    Bitmap.Config localConfig = this.config;
    return SizeConfigStrategy.getBitmapString(i, localConfig);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\SizeConfigStrategy$Key.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */