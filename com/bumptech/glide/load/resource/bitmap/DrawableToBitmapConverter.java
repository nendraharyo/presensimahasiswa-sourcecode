package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.util.concurrent.locks.Lock;

final class DrawableToBitmapConverter
{
  private static final BitmapPool NO_RECYCLE_BITMAP_POOL;
  private static final String TAG = "DrawableToBitmap";
  
  static
  {
    DrawableToBitmapConverter.1 local1 = new com/bumptech/glide/load/resource/bitmap/DrawableToBitmapConverter$1;
    local1.<init>();
    NO_RECYCLE_BITMAP_POOL = local1;
  }
  
  static Resource convert(BitmapPool paramBitmapPool, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    Drawable localDrawable = paramDrawable.getCurrent();
    Bitmap localBitmap = null;
    boolean bool = localDrawable instanceof BitmapDrawable;
    int i;
    if (bool)
    {
      localBitmap = ((BitmapDrawable)localDrawable).getBitmap();
      i = 0;
      localDrawable = null;
    }
    for (;;)
    {
      if (i != 0) {}
      for (;;)
      {
        return BitmapResource.obtain(localBitmap, paramBitmapPool);
        bool = localDrawable instanceof Animatable;
        if (bool) {
          break label84;
        }
        localBitmap = drawToBitmap(paramBitmapPool, localDrawable, paramInt1, paramInt2);
        i = 1;
        break;
        paramBitmapPool = NO_RECYCLE_BITMAP_POOL;
      }
      label84:
      i = 0;
      localDrawable = null;
      localBitmap = null;
    }
  }
  
  private static Bitmap drawToBitmap(BitmapPool paramBitmapPool, Drawable paramDrawable, int paramInt1, int paramInt2)
  {
    int i = 5;
    int j = -1 << -1;
    int k = 0;
    Object localObject1 = null;
    Object localObject3;
    Object localObject4;
    String str;
    if (paramInt1 == j)
    {
      int m = paramDrawable.getIntrinsicWidth();
      if (m <= 0)
      {
        localObject3 = "DrawableToBitmap";
        boolean bool1 = Log.isLoggable((String)localObject3, i);
        if (bool1)
        {
          localObject3 = "DrawableToBitmap";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = ((StringBuilder)localObject4).append("Unable to draw ").append(paramDrawable);
          str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width";
          localObject4 = str;
          Log.w((String)localObject3, (String)localObject4);
        }
      }
    }
    for (;;)
    {
      return (Bitmap)localObject1;
      if (paramInt2 == j)
      {
        int n = paramDrawable.getIntrinsicHeight();
        if (n <= 0)
        {
          localObject3 = "DrawableToBitmap";
          boolean bool2 = Log.isLoggable((String)localObject3, i);
          if (!bool2) {
            continue;
          }
          localObject3 = "DrawableToBitmap";
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = ((StringBuilder)localObject4).append("Unable to draw ").append(paramDrawable);
          str = " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height";
          localObject4 = str;
          Log.w((String)localObject3, (String)localObject4);
          continue;
        }
      }
      k = paramDrawable.getIntrinsicWidth();
      if (k > 0) {
        paramInt1 = paramDrawable.getIntrinsicWidth();
      }
      k = paramDrawable.getIntrinsicHeight();
      if (k > 0) {
        paramInt2 = paramDrawable.getIntrinsicHeight();
      }
      localObject3 = TransformationUtils.getBitmapDrawableLock();
      ((Lock)localObject3).lock();
      localObject1 = Bitmap.Config.ARGB_8888;
      localObject1 = paramBitmapPool.get(paramInt1, paramInt2, (Bitmap.Config)localObject1);
      try
      {
        localObject4 = new android/graphics/Canvas;
        ((Canvas)localObject4).<init>((Bitmap)localObject1);
        i = 0;
        str = null;
        paramDrawable.setBounds(0, 0, paramInt1, paramInt2);
        paramDrawable.draw((Canvas)localObject4);
        i = 0;
        str = null;
        ((Canvas)localObject4).setBitmap(null);
        ((Lock)localObject3).unlock();
      }
      finally
      {
        ((Lock)localObject3).unlock();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DrawableToBitmapConverter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */