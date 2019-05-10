package com.bumptech.glide.load.resource.bitmap;

import android.media.ExifInterface;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class ExifInterfaceImageHeaderParser
  implements ImageHeaderParser
{
  public int getOrientation(InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    ExifInterface localExifInterface = new android/media/ExifInterface;
    localExifInterface.<init>(paramInputStream);
    String str = "Orientation";
    int i = 1;
    int j = localExifInterface.getAttributeInt(str, i);
    if (j == 0) {
      j = -1;
    }
    return j;
  }
  
  public int getOrientation(ByteBuffer paramByteBuffer, ArrayPool paramArrayPool)
  {
    InputStream localInputStream = ByteBufferUtil.toStream(paramByteBuffer);
    return getOrientation(localInputStream, paramArrayPool);
  }
  
  public ImageHeaderParser.ImageType getType(InputStream paramInputStream)
  {
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
  
  public ImageHeaderParser.ImageType getType(ByteBuffer paramByteBuffer)
  {
    return ImageHeaderParser.ImageType.UNKNOWN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\bitmap\ExifInterfaceImageHeaderParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */