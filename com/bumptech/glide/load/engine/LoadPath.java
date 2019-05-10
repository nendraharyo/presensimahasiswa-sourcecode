package com.bumptech.glide.load.engine;

import android.support.v4.h.k.a;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoadPath
{
  private final Class dataClass;
  private final List decodePaths;
  private final String failureMessage;
  private final k.a listPool;
  
  public LoadPath(Class paramClass1, Class paramClass2, Class paramClass3, List paramList, k.a parama)
  {
    this.dataClass = paramClass1;
    this.listPool = parama;
    Object localObject = (List)Preconditions.checkNotEmpty(paramList);
    this.decodePaths = ((List)localObject);
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Failed LoadPath{");
    String str = paramClass1.getSimpleName();
    localObject = ((StringBuilder)localObject).append(str).append("->");
    str = paramClass2.getSimpleName();
    localObject = ((StringBuilder)localObject).append(str).append("->");
    str = paramClass3.getSimpleName();
    localObject = str + "}";
    this.failureMessage = ((String)localObject);
  }
  
  private Resource loadWithExceptionList(DataRewinder paramDataRewinder, Options paramOptions, int paramInt1, int paramInt2, DecodePath.DecodeCallback paramDecodeCallback, List paramList)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject4 = this.decodePaths;
    int i = ((List)localObject4).size();
    int j = 0;
    if (j < i)
    {
      localObject2 = (DecodePath)this.decodePaths.get(j);
      localObject4 = paramDataRewinder;
      try
      {
        localObject2 = ((DecodePath)localObject2).decode(paramDataRewinder, paramInt1, paramInt2, paramOptions, paramDecodeCallback);
      }
      catch (GlideException localGlideException)
      {
        for (;;)
        {
          paramList.add(localGlideException);
          localObject3 = localObject1;
        }
        k = j + 1;
        j = k;
        localObject1 = localObject3;
      }
      if (localObject2 == null) {}
    }
    for (;;)
    {
      if (localObject2 == null)
      {
        localObject2 = new com/bumptech/glide/load/engine/GlideException;
        localObject4 = this.failureMessage;
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(paramList);
        ((GlideException)localObject2).<init>((String)localObject4, localArrayList);
        throw ((Throwable)localObject2);
        int k;
        break;
      }
      return (Resource)localObject3;
      Object localObject3 = localObject1;
    }
  }
  
  public Class getDataClass()
  {
    return this.dataClass;
  }
  
  public Resource load(DataRewinder paramDataRewinder, Options paramOptions, int paramInt1, int paramInt2, DecodePath.DecodeCallback paramDecodeCallback)
  {
    List localList = (List)Preconditions.checkNotNull(this.listPool.acquire());
    Object localObject1 = this;
    try
    {
      localObject1 = loadWithExceptionList(paramDataRewinder, paramOptions, paramInt1, paramInt2, paramDecodeCallback, localList);
      return (Resource)localObject1;
    }
    finally
    {
      this.listPool.release(localList);
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("LoadPath{decodePaths=");
    String str = Arrays.toString(this.decodePaths.toArray());
    return str + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\LoadPath.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */