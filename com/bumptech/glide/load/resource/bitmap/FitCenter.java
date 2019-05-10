package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public class FitCenter
  extends BitmapTransformation
{
  private static final String ID = "com.bumptech.glide.load.resource.bitmap.FitCenter";
  private static final byte[] ID_BYTES;
  
  static
  {
    Charset localCharset = CHARSET;
    ID_BYTES = "com.bumptech.glide.load.resource.bitmap.FitCenter".getBytes(localCharset);
  }
  
  public boolean equals(Object paramObject)
  {
    return paramObject instanceof FitCenter;
  }
  
  public int hashCode()
  {
    return "com.bumptech.glide.load.resource.bitmap.FitCenter".hashCode();
  }
  
  protected Bitmap transform(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    return TransformationUtils.fitCenter(paramBitmapPool, paramBitmap, paramInt1, paramInt2);
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    byte[] arrayOfByte = ID_BYTES;
    paramMessageDigest.update(arrayOfByte);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\FitCenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */