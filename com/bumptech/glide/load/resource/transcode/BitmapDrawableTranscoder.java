package com.bumptech.glide.load.resource.transcode;

import android.content.Context;
import android.content.res.Resources;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.bitmap.LazyBitmapDrawableResource;
import com.bumptech.glide.util.Preconditions;

public class BitmapDrawableTranscoder
  implements ResourceTranscoder
{
  private final Resources resources;
  
  public BitmapDrawableTranscoder(Context paramContext)
  {
    this(localResources);
  }
  
  public BitmapDrawableTranscoder(Resources paramResources)
  {
    Resources localResources = (Resources)Preconditions.checkNotNull(paramResources);
    this.resources = localResources;
  }
  
  public BitmapDrawableTranscoder(Resources paramResources, BitmapPool paramBitmapPool)
  {
    this(paramResources);
  }
  
  public Resource transcode(Resource paramResource, Options paramOptions)
  {
    return LazyBitmapDrawableResource.obtain(this.resources, paramResource);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\BitmapDrawableTranscoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */