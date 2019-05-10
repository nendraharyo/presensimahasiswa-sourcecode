package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.InputStream;

public final class InputStreamRewinder$Factory
  implements DataRewinder.Factory
{
  private final ArrayPool byteArrayPool;
  
  public InputStreamRewinder$Factory(ArrayPool paramArrayPool)
  {
    this.byteArrayPool = paramArrayPool;
  }
  
  public DataRewinder build(InputStream paramInputStream)
  {
    InputStreamRewinder localInputStreamRewinder = new com/bumptech/glide/load/data/InputStreamRewinder;
    ArrayPool localArrayPool = this.byteArrayPool;
    localInputStreamRewinder.<init>(paramInputStream, localArrayPool);
    return localInputStreamRewinder;
  }
  
  public Class getDataClass()
  {
    return InputStream.class;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\InputStreamRewinder$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */