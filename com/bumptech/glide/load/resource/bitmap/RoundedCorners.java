package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class RoundedCorners
  extends BitmapTransformation
{
  private static final String ID = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";
  private static final byte[] ID_BYTES;
  private final int roundingRadius;
  
  static
  {
    Charset localCharset = CHARSET;
    ID_BYTES = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".getBytes(localCharset);
  }
  
  public RoundedCorners(int paramInt)
  {
    if (paramInt > 0) {}
    for (boolean bool = true;; bool = false)
    {
      Preconditions.checkArgument(bool, "roundingRadius must be greater than 0.");
      this.roundingRadius = paramInt;
      return;
    }
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = paramObject instanceof RoundedCorners;
    if (bool2)
    {
      paramObject = (RoundedCorners)paramObject;
      int i = this.roundingRadius;
      int j = ((RoundedCorners)paramObject).roundingRadius;
      if (i == j) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public int hashCode()
  {
    int i = "com.bumptech.glide.load.resource.bitmap.RoundedCorners".hashCode();
    int j = Util.hashCode(this.roundingRadius);
    return Util.hashCode(i, j);
  }
  
  protected Bitmap transform(BitmapPool paramBitmapPool, Bitmap paramBitmap, int paramInt1, int paramInt2)
  {
    int i = this.roundingRadius;
    return TransformationUtils.roundedCorners(paramBitmapPool, paramBitmap, i);
  }
  
  public void updateDiskCacheKey(MessageDigest paramMessageDigest)
  {
    Object localObject = ID_BYTES;
    paramMessageDigest.update((byte[])localObject);
    localObject = ByteBuffer.allocate(4);
    int i = this.roundingRadius;
    localObject = ((ByteBuffer)localObject).putInt(i).array();
    paramMessageDigest.update((byte[])localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\RoundedCorners.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */