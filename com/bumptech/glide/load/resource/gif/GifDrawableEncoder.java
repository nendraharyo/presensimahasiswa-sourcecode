package com.bumptech.glide.load.resource.gif;

import android.util.Log;
import com.bumptech.glide.load.EncodeStrategy;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class GifDrawableEncoder
  implements ResourceEncoder
{
  private static final String TAG = "GifEncoder";
  
  public boolean encode(Resource paramResource, File paramFile, Options paramOptions)
  {
    Object localObject1 = (GifDrawable)paramResource.get();
    try
    {
      localObject1 = ((GifDrawable)localObject1).getBuffer();
      ByteBufferUtil.toFile((ByteBuffer)localObject1, paramFile);
      bool1 = true;
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        String str1 = "GifEncoder";
        int i = 5;
        boolean bool2 = Log.isLoggable(str1, i);
        if (bool2)
        {
          str1 = "GifEncoder";
          String str2 = "Failed to encode GIF drawable data";
          Log.w(str1, str2, localIOException);
        }
        boolean bool1 = false;
        Object localObject2 = null;
      }
    }
    return bool1;
  }
  
  public EncodeStrategy getEncodeStrategy(Options paramOptions)
  {
    return EncodeStrategy.SOURCE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\gif\GifDrawableEncoder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */