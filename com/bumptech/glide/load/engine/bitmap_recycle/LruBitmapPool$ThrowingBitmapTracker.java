package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

class LruBitmapPool$ThrowingBitmapTracker
  implements LruBitmapPool.BitmapTracker
{
  private final Set bitmaps;
  
  private LruBitmapPool$ThrowingBitmapTracker()
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    localObject = Collections.synchronizedSet((Set)localObject);
    this.bitmaps = ((Set)localObject);
  }
  
  public void add(Bitmap paramBitmap)
  {
    Object localObject1 = this.bitmaps;
    boolean bool = ((Set)localObject1).contains(paramBitmap);
    if (bool)
    {
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Can't add already added bitmap: ").append(paramBitmap).append(" [");
      int i = paramBitmap.getWidth();
      localObject2 = ((StringBuilder)localObject2).append(i).append("x");
      i = paramBitmap.getHeight();
      localObject2 = i + "]";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    this.bitmaps.add(paramBitmap);
  }
  
  public void remove(Bitmap paramBitmap)
  {
    Object localObject = this.bitmaps;
    boolean bool = ((Set)localObject).contains(paramBitmap);
    if (!bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot remove bitmap not in tracker");
      throw ((Throwable)localObject);
    }
    this.bitmaps.remove(paramBitmap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\bitmap_recycle\LruBitmapPool$ThrowingBitmapTracker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */