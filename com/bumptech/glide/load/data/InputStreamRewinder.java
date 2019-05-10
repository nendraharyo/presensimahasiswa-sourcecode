package com.bumptech.glide.load.data;

import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.resource.bitmap.RecyclableBufferedInputStream;
import java.io.InputStream;

public final class InputStreamRewinder
  implements DataRewinder
{
  private static final int MARK_LIMIT = 5242880;
  private final RecyclableBufferedInputStream bufferedStream;
  
  InputStreamRewinder(InputStream paramInputStream, ArrayPool paramArrayPool)
  {
    RecyclableBufferedInputStream localRecyclableBufferedInputStream = new com/bumptech/glide/load/resource/bitmap/RecyclableBufferedInputStream;
    localRecyclableBufferedInputStream.<init>(paramInputStream, paramArrayPool);
    this.bufferedStream = localRecyclableBufferedInputStream;
    this.bufferedStream.mark(5242880);
  }
  
  public void cleanup()
  {
    this.bufferedStream.release();
  }
  
  public InputStream rewindAndGet()
  {
    this.bufferedStream.reset();
    return this.bufferedStream;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\InputStreamRewinder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */