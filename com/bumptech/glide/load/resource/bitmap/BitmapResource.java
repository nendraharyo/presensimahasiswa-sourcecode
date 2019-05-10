package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;

public class BitmapResource
  implements Initializable, Resource
{
  private final Bitmap bitmap;
  private final BitmapPool bitmapPool;
  
  public BitmapResource(Bitmap paramBitmap, BitmapPool paramBitmapPool)
  {
    Object localObject = (Bitmap)Preconditions.checkNotNull(paramBitmap, "Bitmap must not be null");
    this.bitmap = ((Bitmap)localObject);
    localObject = (BitmapPool)Preconditions.checkNotNull(paramBitmapPool, "BitmapPool must not be null");
    this.bitmapPool = ((BitmapPool)localObject);
  }
  
  public static BitmapResource obtain(Bitmap paramBitmap, BitmapPool paramBitmapPool)
  {
    BitmapResource localBitmapResource;
    if (paramBitmap == null) {
      localBitmapResource = null;
    }
    for (;;)
    {
      return localBitmapResource;
      localBitmapResource = new com/bumptech/glide/load/resource/bitmap/BitmapResource;
      localBitmapResource.<init>(paramBitmap, paramBitmapPool);
    }
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
  
  public void initialize()
  {
    this.bitmap.prepareToDraw();
  }
  
  public void recycle()
  {
    BitmapPool localBitmapPool = this.bitmapPool;
    Bitmap localBitmap = this.bitmap;
    localBitmapPool.put(localBitmap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */