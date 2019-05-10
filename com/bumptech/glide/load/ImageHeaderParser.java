package com.bumptech.glide.load;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;
import java.nio.ByteBuffer;

public abstract interface ImageHeaderParser
{
  public static final int UNKNOWN_ORIENTATION = 255;
  
  public abstract int getOrientation(InputStream paramInputStream, ArrayPool paramArrayPool);
  
  public abstract int getOrientation(ByteBuffer paramByteBuffer, ArrayPool paramArrayPool);
  
  public abstract ImageHeaderParser.ImageType getType(InputStream paramInputStream);
  
  public abstract ImageHeaderParser.ImageType getType(ByteBuffer paramByteBuffer);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\ImageHeaderParser.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */