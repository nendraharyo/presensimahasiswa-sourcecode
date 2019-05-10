package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.bumptech.glide.gifdecoder.GifDecoder.BitmapProvider;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;

public final class GifBitmapProvider
  implements GifDecoder.BitmapProvider
{
  private final ArrayPool arrayPool;
  private final BitmapPool bitmapPool;
  
  public GifBitmapProvider(BitmapPool paramBitmapPool)
  {
    this(paramBitmapPool, null);
  }
  
  public GifBitmapProvider(BitmapPool paramBitmapPool, ArrayPool paramArrayPool)
  {
    this.bitmapPool = paramBitmapPool;
    this.arrayPool = paramArrayPool;
  }
  
  public Bitmap obtain(int paramInt1, int paramInt2, Bitmap.Config paramConfig)
  {
    return this.bitmapPool.getDirty(paramInt1, paramInt2, paramConfig);
  }
  
  public byte[] obtainByteArray(int paramInt)
  {
    Object localObject = this.arrayPool;
    if (localObject == null) {}
    Class localClass;
    for (localObject = new byte[paramInt];; localObject = (byte[])((ArrayPool)localObject).get(paramInt, localClass))
    {
      return (byte[])localObject;
      localObject = this.arrayPool;
      localClass = byte[].class;
    }
  }
  
  public int[] obtainIntArray(int paramInt)
  {
    Object localObject = this.arrayPool;
    if (localObject == null) {}
    Class localClass;
    for (localObject = new int[paramInt];; localObject = (int[])((ArrayPool)localObject).get(paramInt, localClass))
    {
      return (int[])localObject;
      localObject = this.arrayPool;
      localClass = int[].class;
    }
  }
  
  public void release(Bitmap paramBitmap)
  {
    this.bitmapPool.put(paramBitmap);
  }
  
  public void release(byte[] paramArrayOfByte)
  {
    ArrayPool localArrayPool = this.arrayPool;
    if (localArrayPool == null) {}
    for (;;)
    {
      return;
      localArrayPool = this.arrayPool;
      localArrayPool.put(paramArrayOfByte);
    }
  }
  
  public void release(int[] paramArrayOfInt)
  {
    ArrayPool localArrayPool = this.arrayPool;
    if (localArrayPool == null) {}
    for (;;)
    {
      return;
      localArrayPool = this.arrayPool;
      localArrayPool.put(paramArrayOfInt);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifBitmapProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */