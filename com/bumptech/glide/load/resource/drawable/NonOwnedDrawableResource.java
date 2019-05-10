package com.bumptech.glide.load.resource.drawable;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.Resource;

final class NonOwnedDrawableResource
  extends DrawableResource
{
  private NonOwnedDrawableResource(Drawable paramDrawable)
  {
    super(paramDrawable);
  }
  
  static Resource newInstance(Drawable paramDrawable)
  {
    NonOwnedDrawableResource localNonOwnedDrawableResource;
    if (paramDrawable != null)
    {
      localNonOwnedDrawableResource = new com/bumptech/glide/load/resource/drawable/NonOwnedDrawableResource;
      localNonOwnedDrawableResource.<init>(paramDrawable);
    }
    for (;;)
    {
      return localNonOwnedDrawableResource;
      localNonOwnedDrawableResource = null;
    }
  }
  
  public Class getResourceClass()
  {
    return this.drawable.getClass();
  }
  
  public int getSize()
  {
    int i = this.drawable.getIntrinsicWidth();
    int j = this.drawable.getIntrinsicHeight();
    i = i * j * 4;
    return Math.max(1, i);
  }
  
  public void recycle() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\drawable\NonOwnedDrawableResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */