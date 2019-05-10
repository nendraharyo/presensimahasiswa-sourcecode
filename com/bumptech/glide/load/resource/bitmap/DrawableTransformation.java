package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.security.MessageDigest;

public class DrawableTransformation
  implements Transformation
{
  private final boolean isRequired;
  private final Transformation wrapped;
  
  public DrawableTransformation(Transformation paramTransformation, boolean paramBoolean)
  {
    this.wrapped = paramTransformation;
    this.isRequired = paramBoolean;
  }
  
  private Resource newDrawableResource(Context paramContext, Resource paramResource)
  {
    return LazyBitmapDrawableResource.obtain(paramContext.getResources(), paramResource);
  }
  
  public Transformation asBitmapDrawable()
  {
    return this;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool = paramObject instanceof DrawableTransformation;
    Transformation localTransformation1;
    if (bool)
    {
      paramObject = (DrawableTransformation)paramObject;
      localTransformation1 = this.wrapped;
      Transformation localTransformation2 = ((DrawableTransformation)paramObject).wrapped;
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
    Object localObject1 = Glide.get(paramContext).getBitmapPool();
    Object localObject2 = (Drawable)paramResource.get();
    localObject1 = DrawableToBitmapConverter.convert((BitmapPool)localObject1, (Drawable)localObject2, paramInt1, paramInt2);
    boolean bool;
    if (localObject1 == null)
    {
      bool = this.isRequired;
      if (bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = "Unable to convert " + localObject2 + " to a Bitmap";
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
      }
    }
    else
    {
      localObject2 = this.wrapped.transform(paramContext, (Resource)localObject1, paramInt1, paramInt2);
      bool = localObject2.equals(localObject1);
      if (!bool) {
        break label135;
      }
      ((Resource)localObject2).recycle();
    }
    for (;;)
    {
      return paramResource;
      label135:
      paramResource = newDrawableResource(paramContext, (Resource)localObject2);
    }
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    this.wrapped.updateDiskCacheKey(paramMessageDigest);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\DrawableTransformation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */