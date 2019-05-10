package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.engine.Initializable;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.resource.drawable.DrawableResource;
import com.bumptech.glide.util.Util;

public class BitmapDrawableResource
  extends DrawableResource
  implements Initializable
{
  private final BitmapPool bitmapPool;
  
  public BitmapDrawableResource(BitmapDrawable paramBitmapDrawable, BitmapPool paramBitmapPool)
  {
    super(paramBitmapDrawable);
    this.bitmapPool = paramBitmapPool;
  }
  
  public Class getResourceClass()
  {
    return BitmapDrawable.class;
  }
  
  public int getSize()
  {
    return Util.getBitmapByteSize(((BitmapDrawable)this.drawable).getBitmap());
  }
  
  public void initialize()
  {
    ((BitmapDrawable)this.drawable).getBitmap().prepareToDraw();
  }
  
  public void recycle()
  {
    BitmapPool localBitmapPool = this.bitmapPool;
    Bitmap localBitmap = ((BitmapDrawable)this.drawable).getBitmap();
    localBitmapPool.put(localBitmap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapDrawableResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */