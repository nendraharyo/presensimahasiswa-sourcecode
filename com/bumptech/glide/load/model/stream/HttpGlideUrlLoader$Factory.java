package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.ModelCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;

public class HttpGlideUrlLoader$Factory
  implements ModelLoaderFactory
{
  private final ModelCache modelCache;
  
  public HttpGlideUrlLoader$Factory()
  {
    ModelCache localModelCache = new com/bumptech/glide/load/model/ModelCache;
    localModelCache.<init>(500L);
    this.modelCache = localModelCache;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    HttpGlideUrlLoader localHttpGlideUrlLoader = new com/bumptech/glide/load/model/stream/HttpGlideUrlLoader;
    ModelCache localModelCache = this.modelCache;
    localHttpGlideUrlLoader.<init>(localModelCache);
    return localHttpGlideUrlLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\HttpGlideUrlLoader$Factory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */