package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.HttpUrlFetcher;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;

public class HttpGlideUrlLoader
  implements ModelLoader
{
  public static final Option TIMEOUT;
  private final ModelCache modelCache;
  
  static
  {
    Integer localInteger = Integer.valueOf(2500);
    TIMEOUT = Option.memory("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", localInteger);
  }
  
  public HttpGlideUrlLoader()
  {
    this(null);
  }
  
  public HttpGlideUrlLoader(ModelCache paramModelCache)
  {
    this.modelCache = paramModelCache;
  }
  
  public ModelLoader.LoadData buildLoadData(GlideUrl paramGlideUrl, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader.LoadData localLoadData = null;
    Object localObject = this.modelCache;
    if (localObject != null)
    {
      localObject = (GlideUrl)this.modelCache.get(paramGlideUrl, 0, 0);
      if (localObject != null) {
        break label98;
      }
      localObject = this.modelCache;
      ((ModelCache)localObject).put(paramGlideUrl, 0, 0, paramGlideUrl);
    }
    for (;;)
    {
      localObject = TIMEOUT;
      int i = ((Integer)paramOptions.get((Option)localObject)).intValue();
      localLoadData = new com/bumptech/glide/load/model/ModelLoader$LoadData;
      HttpUrlFetcher localHttpUrlFetcher = new com/bumptech/glide/load/data/HttpUrlFetcher;
      localHttpUrlFetcher.<init>(paramGlideUrl, i);
      localLoadData.<init>(paramGlideUrl, localHttpUrlFetcher);
      return localLoadData;
      label98:
      paramGlideUrl = (GlideUrl)localObject;
    }
  }
  
  public boolean handles(GlideUrl paramGlideUrl)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\HttpGlideUrlLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */