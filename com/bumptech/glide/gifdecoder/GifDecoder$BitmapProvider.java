package com.bumptech.glide.gifdecoder;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

public abstract interface GifDecoder$BitmapProvider
{
  public abstract Bitmap obtain(int paramInt1, int paramInt2, Bitmap.Config paramConfig);
  
  public abstract byte[] obtainByteArray(int paramInt);
  
  public abstract int[] obtainIntArray(int paramInt);
  
  public abstract void release(Bitmap paramBitmap);
  
  public abstract void release(byte[] paramArrayOfByte);
  
  public abstract void release(int[] paramArrayOfInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\gifdecoder\GifDecoder$BitmapProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */