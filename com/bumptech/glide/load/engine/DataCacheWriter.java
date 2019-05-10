package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache.Writer;
import java.io.File;

class DataCacheWriter
  implements DiskCache.Writer
{
  private final Object data;
  private final Encoder encoder;
  private final Options options;
  
  DataCacheWriter(Encoder paramEncoder, Object paramObject, Options paramOptions)
  {
    this.encoder = paramEncoder;
    this.data = paramObject;
    this.options = paramOptions;
  }
  
  public boolean write(File paramFile)
  {
    Encoder localEncoder = this.encoder;
    Object localObject = this.data;
    Options localOptions = this.options;
    return localEncoder.encode(localObject, paramFile, localOptions);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DataCacheWriter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */