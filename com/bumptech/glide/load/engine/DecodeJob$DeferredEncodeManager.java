package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.util.pool.GlideTrace;

class DecodeJob$DeferredEncodeManager
{
  private ResourceEncoder encoder;
  private Key key;
  private LockedResource toEncode;
  
  void clear()
  {
    this.key = null;
    this.encoder = null;
    this.toEncode = null;
  }
  
  void encode(DecodeJob.DiskCacheProvider paramDiskCacheProvider, Options paramOptions)
  {
    Object localObject1 = "DecodeJob.encode";
    GlideTrace.beginSection((String)localObject1);
    try
    {
      localObject1 = paramDiskCacheProvider.getDiskCache();
      Key localKey = this.key;
      DataCacheWriter localDataCacheWriter = new com/bumptech/glide/load/engine/DataCacheWriter;
      ResourceEncoder localResourceEncoder = this.encoder;
      LockedResource localLockedResource = this.toEncode;
      localDataCacheWriter.<init>(localResourceEncoder, localLockedResource, paramOptions);
      ((DiskCache)localObject1).put(localKey, localDataCacheWriter);
      return;
    }
    finally
    {
      this.toEncode.unlock();
      GlideTrace.endSection();
    }
  }
  
  boolean hasResourceToEncode()
  {
    LockedResource localLockedResource = this.toEncode;
    boolean bool;
    if (localLockedResource != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLockedResource = null;
    }
  }
  
  void init(Key paramKey, ResourceEncoder paramResourceEncoder, LockedResource paramLockedResource)
  {
    this.key = paramKey;
    this.encoder = paramResourceEncoder;
    this.toEncode = paramLockedResource;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeJob$DeferredEncodeManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */