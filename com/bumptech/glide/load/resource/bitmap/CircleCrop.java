package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public class CircleCrop
  extends BitmapTransformation
{
  private static final String ID = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1";
  private static final byte[] ID_BYTES;
  private static final int VERSION = 1;
  
  static
  {
    Charset localCharset = CHARSET;
    ID_BYTES = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(localCharset);
  }
  
  public boolean equals(Object paramObject)
  {
    return paramObject instanceof CircleCrop;
  }
  
  public int hashCode()
  {
    return "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".hashCode();
  }
  
  protected Bitmap transform(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return TransformationUtils.circleCrop(paramBitmapPool, paramBitmap, paramInt1, paramInt2);
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    byte[] arrayOfByte = ID_BYTES;
    paramMessageDigest.update(arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\CircleCrop.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */