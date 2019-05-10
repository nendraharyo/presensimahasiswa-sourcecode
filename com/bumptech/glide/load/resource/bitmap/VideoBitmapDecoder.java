package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

public class VideoBitmapDecoder
  extends VideoDecoder
{
  public VideoBitmapDecoder(Context paramContext)
  {
    this(localBitmapPool);
  }
  
  public VideoBitmapDecoder(BitmapPool paramBitmapPool)
  {
    super(paramBitmapPool, localParcelFileDescriptorInitializer);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\VideoBitmapDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */