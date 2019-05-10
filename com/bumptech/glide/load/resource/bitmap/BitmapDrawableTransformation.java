package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Preconditions;
import java.security.MessageDigest;

public class BitmapDrawableTransformation
  implements Transformation
{
  private final Transformation wrapped;
  
  public BitmapDrawableTransformation(Transformation paramTransformation)
  {
    Object localObject = new com/bumptech/glide/load/resource/bitmap/DrawableTransformation;
    ((DrawableTransformation)localObject).<init>(paramTransformation, false);
    localObject = (Transformation)Preconditions.checkNotNull(localObject);
    this.wrapped = ((Transformation)localObject);
  }
  
  private static Resource convertToBitmapDrawableResource(Resource paramResource)
  {
    Object localObject1 = paramResource.get();
    boolean bool = localObject1 instanceof BitmapDrawable;
    if (!bool)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: ");
      Object localObject3 = paramResource.get();
      localObject2 = localObject3;
      ((IllegalArgumentException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    return paramResource;
  }
  
  private static Resource convertToDrawableResource(Resource paramResource)
  {
    return paramResource;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof BitmapDrawableTransformation;
    Transformation localTransformation1;
    if (bool)
    {
      paramObject = (BitmapDrawableTransformation)paramObject;
      localTransformation1 = this.wrapped;
      Transformation localTransformation2 = ((BitmapDrawableTransformation)paramObject).wrapped;
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
    Resource localResource = convertToDrawableResource(paramResource);
    return convertToBitmapDrawableResource(this.wrapped.transform(paramContext, localResource, paramInt1, paramInt2));
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    this.wrapped.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapDrawableTransformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */