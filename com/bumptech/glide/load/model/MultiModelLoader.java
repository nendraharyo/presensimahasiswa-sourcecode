package com.bumptech.glide.load.model;

import android.support.v4.h.k.a;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

class MultiModelLoader
  implements ModelLoader
{
  private final k.a exceptionListPool;
  private final List modelLoaders;
  
  MultiModelLoader(List paramList, k.a parama)
  {
    this.modelLoaders = paramList;
    this.exceptionListPool = parama;
  }
  
  public ModelLoader.LoadData buildLoadData(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    MultiModelLoader.MultiFetcher localMultiFetcher = null;
    int i = this.modelLoaders.size();
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(i);
    boolean bool1 = false;
    Object localObject1 = null;
    int j = 0;
    k.a locala = null;
    int k = 0;
    Object localObject2 = null;
    if (j < i)
    {
      localObject1 = (ModelLoader)this.modelLoaders.get(j);
      boolean bool2 = ((ModelLoader)localObject1).handles(paramObject);
      if (!bool2) {
        break label207;
      }
      ModelLoader.LoadData localLoadData = ((ModelLoader)localObject1).buildLoadData(paramObject, paramInt1, paramInt2, paramOptions);
      if (localLoadData == null) {
        break label207;
      }
      localObject1 = localLoadData.sourceKey;
      localObject2 = localLoadData.fetcher;
      localArrayList.add(localObject2);
    }
    for (;;)
    {
      k = j + 1;
      j = k;
      localObject2 = localObject1;
      break;
      bool1 = localArrayList.isEmpty();
      if ((!bool1) && (localObject2 != null))
      {
        localObject1 = new com/bumptech/glide/load/model/ModelLoader$LoadData;
        localMultiFetcher = new com/bumptech/glide/load/model/MultiModelLoader$MultiFetcher;
        locala = this.exceptionListPool;
        localMultiFetcher.<init>(localArrayList, locala);
        ((ModelLoader.LoadData)localObject1).<init>((Key)localObject2, localMultiFetcher);
      }
      for (;;)
      {
        return (ModelLoader.LoadData)localObject1;
        bool1 = false;
        localObject1 = null;
      }
      label207:
      localObject1 = localObject2;
    }
  }
  
  public boolean handles(Object paramObject)
  {
    Object localObject = this.modelLoaders;
    Iterator localIterator = ((List)localObject).iterator();
    do
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (ModelLoader)localIterator.next();
      bool = ((ModelLoader)localObject).handles(paramObject);
    } while (!bool);
    boolean bool = true;
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("MultiModelLoader{modelLoaders=");
    String str = Arrays.toString(this.modelLoaders.toArray());
    return str + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\MultiModelLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */