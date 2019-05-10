package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.Util;

final class UnitBitmapDecoder$NonOwnedBitmapResource
  implements Resource
{
  private final Bitmap bitmap;
  
  UnitBitmapDecoder$NonOwnedBitmapResource(Bitmap paramBitmap)
  {
    this.bitmap = paramBitmap;
  }
  
  public Bitmap get()
  {
    return this.bitmap;
  }
  
  public Class getResourceClass()
  {
    return Bitmap.class;
  }
  
  public int getSize()
  {
    return Util.getBitmapByteSize(this.bitmap);
  }
  
  public void recycle() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\UnitBitmapDecoder$NonOwnedBitmapResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */