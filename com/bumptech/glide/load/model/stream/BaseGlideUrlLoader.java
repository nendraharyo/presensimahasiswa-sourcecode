package com.bumptech.glide.load.model.stream;

import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public abstract class BaseGlideUrlLoader
  implements ModelLoader
{
  private final ModelLoader concreteLoader;
  private final ModelCache modelCache;
  
  protected BaseGlideUrlLoader(ModelLoader paramModelLoader)
  {
    this(paramModelLoader, null);
  }
  
  protected BaseGlideUrlLoader(ModelLoader paramModelLoader, ModelCache paramModelCache)
  {
    this.concreteLoader = paramModelLoader;
    this.modelCache = paramModelCache;
  }
  
  private static List getAlternateKeys(Collection paramCollection)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramCollection.size();
    localArrayList.<init>(i);
    Iterator localIterator = paramCollection.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      String str = (String)localIterator.next();
      GlideUrl localGlideUrl = new com/bumptech/glide/load/model/GlideUrl;
      localGlideUrl.<init>(str);
      localArrayList.add(localGlideUrl);
    }
    return localArrayList;
  }
  
  public ModelLoader.LoadData buildLoadData(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    Object localObject1 = null;
    Object localObject2 = this.modelCache;
    if (localObject2 != null) {}
    for (localObject2 = (GlideUrl)this.modelCache.get(paramObject, paramInt1, paramInt2);; localObject2 = null)
    {
      Object localObject3;
      if (localObject2 == null)
      {
        localObject3 = getUrl(paramObject, paramInt1, paramInt2, paramOptions);
        bool = TextUtils.isEmpty((CharSequence)localObject3);
        if (bool)
        {
          bool = false;
          localObject2 = null;
        }
      }
      for (;;)
      {
        return (ModelLoader.LoadData)localObject2;
        localObject2 = new com/bumptech/glide/load/model/GlideUrl;
        localObject1 = getHeaders(paramObject, paramInt1, paramInt2, paramOptions);
        ((GlideUrl)localObject2).<init>((String)localObject3, (Headers)localObject1);
        localObject1 = this.modelCache;
        if (localObject1 != null)
        {
          localObject1 = this.modelCache;
          ((ModelCache)localObject1).put(paramObject, paramInt1, paramInt2, localObject2);
        }
        localObject3 = getAlternateUrls(paramObject, paramInt1, paramInt2, paramOptions);
        localObject1 = this.concreteLoader.buildLoadData(localObject2, paramInt1, paramInt2, paramOptions);
        if (localObject1 != null)
        {
          bool = ((List)localObject3).isEmpty();
          if (!bool) {}
        }
        else
        {
          localObject2 = localObject1;
          continue;
        }
        localObject2 = new com/bumptech/glide/load/model/ModelLoader$LoadData;
        Key localKey = ((ModelLoader.LoadData)localObject1).sourceKey;
        localObject3 = getAlternateKeys((Collection)localObject3);
        localObject1 = ((ModelLoader.LoadData)localObject1).fetcher;
        ((ModelLoader.LoadData)localObject2).<init>(localKey, (List)localObject3, (DataFetcher)localObject1);
      }
      boolean bool = false;
    }
  }
  
  protected List getAlternateUrls(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    return Collections.emptyList();
  }
  
  protected Headers getHeaders(Object paramObject, int paramInt1, int paramInt2, Options paramOptions)
  {
    return Headers.DEFAULT;
  }
  
  protected abstract String getUrl(Object paramObject, int paramInt1, int paramInt2, Options paramOptions);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\BaseGlideUrlLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */