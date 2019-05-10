package com.bumptech.glide.load.model;

import android.util.Log;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferEncoder
  implements Encoder
{
  private static final String TAG = "ByteBufferEncoder";
  
  public boolean encode(ByteBuffer paramByteBuffer, File paramFile, Options paramOptions)
  {
    boolean bool1 = false;
    try
    {
      ByteBufferUtil.toFile(paramByteBuffer, paramFile);
      bool1 = true;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = "ByteBufferEncoder";
        int i = 3;
        boolean bool2 = Log.isLoggable(str1, i);
        if (bool2)
        {
          str1 = "ByteBufferEncoder";
          String str2 = "Failed to write data";
          Log.d(str1, str2, localIOException);
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ByteBufferEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */