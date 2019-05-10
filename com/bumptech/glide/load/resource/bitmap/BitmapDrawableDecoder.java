package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;

public class BitmapDrawableDecoder
  implements ResourceDecoder
{
  private final ResourceDecoder decoder;
  private final Resources resources;
  
  public BitmapDrawableDecoder(Context paramContext, ResourceDecoder paramResourceDecoder)
  {
    this(localResources, paramResourceDecoder);
  }
  
  public BitmapDrawableDecoder(Resources paramResources, ResourceDecoder paramResourceDecoder)
  {
    Object localObject = (Resources)Preconditions.checkNotNull(paramResources);
    this.resources = ((Resources)localObject);
    localObject = (ResourceDecoder)Preconditions.checkNotNull(paramResourceDecoder);
    this.decoder = ((ResourceDecoder)localObject);
  }
  
  public BitmapDrawableDecoder(Resources paramResources, BitmapPool paramBitmapPool, ResourceDecoder paramResourceDecoder)
  {
    this(paramResources, paramResourceDecoder);
  }
  
  public Resource decode(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    Resource localResource = this.decoder.decode(paramObject, paramInt1, paramInt2, paramOptions);
    return LazyBitmapDrawableResource.obtain(this.resources, localResource);
  }
  
  public boolean handles(Object paramObject, Options paramOptions)
  {
    return this.decoder.handles(paramObject, paramOptions);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapDrawableDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */