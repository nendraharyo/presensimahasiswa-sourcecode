package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

public final class LazyBitmapDrawableResource
  implements Initializable, Resource
{
  private final Resource bitmapResource;
  private final Resources resources;
  
  private LazyBitmapDrawableResource(Resources paramResources, Resource paramResource)
  {
    Object localObject = (Resources)Preconditions.checkNotNull(paramResources);
    this.resources = ((Resources)localObject);
    localObject = (Resource)Preconditions.checkNotNull(paramResource);
    this.bitmapResource = ((Resource)localObject);
  }
  
  public static Resource obtain(Resources paramResources, Resource paramResource)
  {
    Object localObject;
    if (paramResource == null) {
      localObject = null;
    }
    for (;;)
    {
      return (Resource)localObject;
      localObject = new com/bumptech/glide/load/resource/bitmap/LazyBitmapDrawableResource;
      ((LazyBitmapDrawableResource)localObject).<init>(paramResources, paramResource);
    }
  }
  
  public static LazyBitmapDrawableResource obtain(Context paramContext, Bitmap paramBitmap)
  {
    Resources localResources = paramContext.getResources();
    Object localObject = Glide.get(paramContext).getBitmapPool();
    localObject = BitmapResource.obtain(paramBitmap, (BitmapPool)localObject);
    return (LazyBitmapDrawableResource)obtain(localResources, (Resource)localObject);
  }
  
  public static LazyBitmapDrawableResource obtain(Resources paramResources, BitmapPool paramBitmapPool, Bitmap paramBitmap)
  {
    BitmapResource localBitmapResource = BitmapResource.obtain(paramBitmap, paramBitmapPool);
    return (LazyBitmapDrawableResource)obtain(paramResources, localBitmapResource);
  }
  
  public BitmapDrawable get()
  {
    BitmapDrawable localBitmapDrawable = new android/graphics/drawable/BitmapDrawable;
    Resources localResources = this.resources;
    Bitmap localBitmap = (Bitmap)this.bitmapResource.get();
    localBitmapDrawable.<init>(localResources, localBitmap);
    return localBitmapDrawable;
  }
  
  public Class getResourceClass()
  {
    return BitmapDrawable.class;
  }
  
  public int getSize()
  {
    return this.bitmapResource.getSize();
  }
  
  public void initialize()
  {
    Object localObject = this.bitmapResource;
    boolean bool = localObject instanceof Initializable;
    if (bool)
    {
      localObject = (Initializable)this.bitmapResource;
      ((Initializable)localObject).initialize();
    }
  }
  
  public void recycle()
  {
    this.bitmapResource.recycle();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\LazyBitmapDrawableResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */