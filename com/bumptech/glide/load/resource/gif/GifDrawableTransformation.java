package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.BitmapResource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public class GifDrawableTransformation
  implements Transformation
{
  private final Transformation wrapped;
  
  public GifDrawableTransformation(Transformation paramTransformation)
  {
    Transformation localTransformation = (Transformation)Preconditions.checkNotNull(paramTransformation);
    this.wrapped = localTransformation;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof GifDrawableTransformation;
    Transformation localTransformation1;
    if (bool)
    {
      paramObject = (GifDrawableTransformation)paramObject;
      localTransformation1 = this.wrapped;
      Transformation localTransformation2 = ((GifDrawableTransformation)paramObject).wrapped;
      bool = localTransformation1.equals(localTransformation2);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localTransformation1 = null;
    }
  }
  
  public int hashCode()
  {
    return this.wrapped.hashCode();
  }
  
  public Resource transform(Context paramContext, Resource paramResource, int paramInt1, int paramInt2)
  {
    GifDrawable localGifDrawable = (GifDrawable)paramResource.get();
    Object localObject1 = Glide.get(paramContext).getBitmapPool();
    Object localObject2 = localGifDrawable.getFirstFrame();
    BitmapResource localBitmapResource = new com/bumptech/glide/load/resource/bitmap/BitmapResource;
    localBitmapResource.<init>((Bitmap)localObject2, (BitmapPool)localObject1);
    localObject1 = this.wrapped.transform(paramContext, localBitmapResource, paramInt1, paramInt2);
    boolean bool = localBitmapResource.equals(localObject1);
    if (!bool) {
      localBitmapResource.recycle();
    }
    localObject1 = (Bitmap)((Resource)localObject1).get();
    localObject2 = this.wrapped;
    localGifDrawable.setFrameTransformation((Transformation)localObject2, (Bitmap)localObject1);
    return paramResource;
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    this.wrapped.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifDrawableTransformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */