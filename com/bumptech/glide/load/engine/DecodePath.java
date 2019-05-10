package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import android.util.Log;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DecodePath
{
  private static final String TAG = "DecodePath";
  private final Class dataClass;
  private final List decoders;
  private final String failureMessage;
  private final k.a listPool;
  private final ResourceTranscoder transcoder;
  
  public DecodePath(Class paramClass1, Class paramClass2, Class paramClass3, List paramList, ResourceTranscoder paramResourceTranscoder, k.a parama)
  {
    this.dataClass = paramClass1;
    this.decoders = paramList;
    this.transcoder = paramResourceTranscoder;
    this.listPool = parama;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Failed DecodePath{");
    String str = paramClass1.getSimpleName();
    localObject = ((StringBuilder)localObject).append(str).append("->");
    str = paramClass2.getSimpleName();
    localObject = ((StringBuilder)localObject).append(str).append("->");
    str = paramClass3.getSimpleName();
    localObject = str + "}";
    this.failureMessage = ((String)localObject);
  }
  
  private Resource decodeResource(DataRewinder paramDataRewinder, int paramInt1, int paramInt2, Options paramOptions)
  {
    List localList = (List)Preconditions.checkNotNull(this.listPool.acquire());
    Object localObject1 = this;
    try
    {
      localObject1 = decodeResourceWithList(paramDataRewinder, paramInt1, paramInt2, paramOptions, localList);
      return (Resource)localObject1;
    }
    finally
    {
      this.listPool.release(localList);
    }
  }
  
  private Resource decodeResourceWithList(DataRewinder paramDataRewinder, int paramInt1, int paramInt2, Options paramOptions, List paramList)
  {
    Object localObject1 = null;
    int i = 0;
    Object localObject2 = null;
    Object localObject3 = this.decoders;
    int j = ((List)localObject3).size();
    int k = 0;
    for (;;)
    {
      if (k < j) {
        localObject2 = (ResourceDecoder)this.decoders.get(k);
      }
      try
      {
        localObject3 = paramDataRewinder.rewindAndGet();
        boolean bool1 = ((ResourceDecoder)localObject2).handles(localObject3, paramOptions);
        if (bool1)
        {
          localObject3 = paramDataRewinder.rewindAndGet();
          localObject2 = ((ResourceDecoder)localObject2).decode(localObject3, paramInt1, paramInt2, paramOptions);
          localObject1 = localObject2;
          if (localObject1 != null)
          {
            if (localObject1 != null) {
              break label246;
            }
            localObject2 = new com/bumptech/glide/load/engine/GlideException;
            localObject1 = this.failureMessage;
            localObject3 = new java/util/ArrayList;
            ((ArrayList)localObject3).<init>(paramList);
            ((GlideException)localObject2).<init>((String)localObject1, (List)localObject3);
            throw ((Throwable)localObject2);
          }
        }
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          String str1 = "DecodePath";
          int m = 2;
          boolean bool2 = Log.isLoggable(str1, m);
          if (bool2)
          {
            str1 = "DecodePath";
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            String str2 = "Failed to decode data for ";
            localStringBuilder = localStringBuilder.append(str2);
            localObject2 = localObject2;
            Log.v(str1, (String)localObject2, localRuntimeException);
          }
          paramList.add(localRuntimeException);
        }
        i = k + 1;
        k = i;
        continue;
        return (Resource)localObject1;
      }
      catch (OutOfMemoryError localOutOfMemoryError)
      {
        for (;;) {}
      }
      catch (IOException localIOException)
      {
        for (;;)
        {
          label246:
          continue;
          localObject2 = localObject1;
        }
      }
    }
  }
  
  public Resource decode(DataRewinder paramDataRewinder, int paramInt1, int paramInt2, Options paramOptions, DecodePath.DecodeCallback paramDecodeCallback)
  {
    Resource localResource = decodeResource(paramDataRewinder, paramInt1, paramInt2, paramOptions);
    localResource = paramDecodeCallback.onResourceDecoded(localResource);
    return this.transcoder.transcode(localResource, paramOptions);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("DecodePath{ dataClass=");
    Object localObject = this.dataClass;
    localStringBuilder = localStringBuilder.append(localObject).append(", decoders=");
    localObject = this.decoders;
    localStringBuilder = localStringBuilder.append(localObject).append(", transcoder=");
    localObject = this.transcoder;
    return localObject + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodePath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */