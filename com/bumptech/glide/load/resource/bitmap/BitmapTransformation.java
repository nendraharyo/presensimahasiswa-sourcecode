package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Util;

public abstract class BitmapTransformation
  implements Transformation
{
  protected abstract Bitmap transform(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2);
  
  public final Resource transform(Context paramContext, Resource paramResource, int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    boolean bool = Util.isValidDimensions(paramInt1, paramInt2);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Cannot apply transformation on width: " + paramInt1 + " or height: " + paramInt2 + " less than or equal to zero and not Target.SIZE_ORIGINAL";
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    Object localObject2 = Glide.get(paramContext).getBitmapPool();
    Object localObject1 = (Bitmap)paramResource.get();
    if (paramInt1 == i) {
      paramInt1 = ((Bitmap)localObject1).getWidth();
    }
    if (paramInt2 == i) {
      paramInt2 = ((Bitmap)localObject1).getHeight();
    }
    Bitmap localBitmap = transform((BitmapPool)localObject2, (Bitmap)localObject1, paramInt1, paramInt2);
    bool = localObject1.equals(localBitmap);
    if (bool) {}
    for (;;)
    {
      return paramResource;
      paramResource = BitmapResource.obtain(localBitmap, (BitmapPool)localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapTransformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */