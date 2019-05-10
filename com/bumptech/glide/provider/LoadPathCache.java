package com.bumptech.glide.provider;

import android.support.v4.h.a;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.MultiClassKey;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class LoadPathCache
{
  private static final LoadPath NO_PATHS_SIGNAL;
  private final a cache;
  private final AtomicReference keyRef;
  
  static
  {
    LoadPath localLoadPath = new com/bumptech/glide/load/engine/LoadPath;
    DecodePath localDecodePath = new com/bumptech/glide/load/engine/DecodePath;
    Object localObject1 = Collections.emptyList();
    Object localObject2 = new com/bumptech/glide/load/resource/transcode/UnitTranscoder;
    ((UnitTranscoder)localObject2).<init>();
    localDecodePath.<init>(Object.class, Object.class, Object.class, (List)localObject1, (ResourceTranscoder)localObject2, null);
    localObject2 = Collections.singletonList(localDecodePath);
    Class localClass1 = Object.class;
    Class localClass2 = Object.class;
    localObject1 = Object.class;
    localLoadPath.<init>(localClass1, localClass2, (Class)localObject1, (List)localObject2, null);
    NO_PATHS_SIGNAL = localLoadPath;
  }
  
  public LoadPathCache()
  {
    Object localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.cache = ((a)localObject);
    localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.keyRef = ((AtomicReference)localObject);
  }
  
  private MultiClassKey getKey(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    MultiClassKey localMultiClassKey = (MultiClassKey)this.keyRef.getAndSet(null);
    if (localMultiClassKey == null)
    {
      localMultiClassKey = new com/bumptech/glide/util/MultiClassKey;
      localMultiClassKey.<init>();
    }
    localMultiClassKey.set(paramClass1, paramClass2, paramClass3);
    return localMultiClassKey;
  }
  
  public LoadPath get(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    MultiClassKey localMultiClassKey = getKey(paramClass1, paramClass2, paramClass3);
    synchronized (this.cache)
    {
      Object localObject1 = this.cache;
      localObject1 = ((a)localObject1).get(localMultiClassKey);
      localObject1 = (LoadPath)localObject1;
      this.keyRef.set(localMultiClassKey);
      return (LoadPath)localObject1;
    }
  }
  
  public boolean isEmptyLoadPath(LoadPath paramLoadPath)
  {
    return NO_PATHS_SIGNAL.equals(paramLoadPath);
  }
  
  public void put(Class paramClass1, Class paramClass2, Class paramClass3, LoadPath paramLoadPath)
  {
    synchronized (this.cache)
    {
      a locala2 = this.cache;
      MultiClassKey localMultiClassKey = new com/bumptech/glide/util/MultiClassKey;
      localMultiClassKey.<init>(paramClass1, paramClass2, paramClass3);
      if (paramLoadPath != null)
      {
        locala2.put(localMultiClassKey, paramLoadPath);
        return;
      }
      paramLoadPath = NO_PATHS_SIGNAL;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\LoadPathCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */