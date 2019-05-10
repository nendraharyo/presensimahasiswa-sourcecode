package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

public abstract interface Downsampler$DecodeCallbacks
{
  public abstract void onDecodeComplete(BitmapPool paramBitmapPool, Bitmap paramBitmap);
  
  public abstract void onObtainBounds();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\Downsampler$DecodeCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */