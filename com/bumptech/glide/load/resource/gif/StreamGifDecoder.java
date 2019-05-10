package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser.ImageType;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

public class StreamGifDecoder
  implements ResourceDecoder
{
  private static final String TAG = "StreamGifDecoder";
  private final ArrayPool byteArrayPool;
  private final ResourceDecoder byteBufferDecoder;
  private final List parsers;
  
  public StreamGifDecoder(List paramList, ResourceDecoder paramResourceDecoder, ArrayPool paramArrayPool)
  {
    this.parsers = paramList;
    this.byteBufferDecoder = paramResourceDecoder;
    this.byteArrayPool = paramArrayPool;
  }
  
  private static byte[] inputStreamToBytes(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
    localByteArrayOutputStream.<init>(16384);
    int i = 16384;
    byte[] arrayOfByte;
    try
    {
      Object localObject = new byte[i];
      int j;
      for (;;)
      {
        j = paramInputStream.read((byte[])localObject);
        int k = -1;
        if (j == k) {
          break;
        }
        k = 0;
        localByteArrayOutputStream.write((byte[])localObject, 0, j);
      }
      boolean bool;
      String str;
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      localObject = "StreamGifDecoder";
      j = 5;
      bool = Log.isLoggable((String)localObject, j);
      if (bool)
      {
        localObject = "StreamGifDecoder";
        str = "Error reading data from stream";
        Log.w((String)localObject, str, localIOException);
      }
      arrayOfByte = null;
    }
    for (;;)
    {
      arrayOfByte.flush();
      arrayOfByte = arrayOfByte.toByteArray();
    }
  }
  
  public Resource decode(InputStream paramInputStream, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject = inputStreamToBytes(paramInputStream);
    if (localObject == null) {}
    ResourceDecoder localResourceDecoder;
    for (localObject = null;; localObject = localResourceDecoder.decode(localObject, paramInt1, paramInt2, paramOptions))
    {
      return (Resource)localObject;
      localObject = ByteBuffer.wrap((byte[])localObject);
      localResourceDecoder = this.byteBufferDecoder;
    }
  }
  
  public boolean handles(InputStream paramInputStream, Options paramOptions)
  {
    Object localObject1 = GifOptions.DISABLE_ANIMATION;
    localObject1 = (Boolean)paramOptions.get((Option)localObject1);
    boolean bool = ((Boolean)localObject1).booleanValue();
    if (!bool)
    {
      localObject1 = this.parsers;
      Object localObject2 = this.byteArrayPool;
      localObject1 = ImageHeaderParserUtils.getType((List)localObject1, paramInputStream, (ArrayPool)localObject2);
      localObject2 = ImageHeaderParser.ImageType.GIF;
      if (localObject1 == localObject2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\StreamGifDecoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */