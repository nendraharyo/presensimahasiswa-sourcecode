package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.io.File;

public class BitmapDrawableEncoder
  implements ResourceEncoder
{
  private final BitmapPool bitmapPool;
  private final ResourceEncoder encoder;
  
  public BitmapDrawableEncoder(BitmapPool paramBitmapPool, ResourceEncoder paramResourceEncoder)
  {
    this.bitmapPool = paramBitmapPool;
    this.encoder = paramResourceEncoder;
  }
  
  public boolean encode(Resource paramResource, File paramFile, Options paramOptions)
  {
    ResourceEncoder localResourceEncoder = this.encoder;
    BitmapResource localBitmapResource = new com/bumptech/glide/load/resource/bitmap/BitmapResource;
    Bitmap localBitmap = ((BitmapDrawable)paramResource.get()).getBitmap();
    BitmapPool localBitmapPool = this.bitmapPool;
    localBitmapResource.<init>(localBitmap, localBitmapPool);
    return localResourceEncoder.encode(localBitmapResource, paramFile, paramOptions);
  }
  
  public EncodeStrategy getEncodeStrategy(Options paramOptions)
  {
    return this.encoder.getEncodeStrategy(paramOptions);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\BitmapDrawableEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */