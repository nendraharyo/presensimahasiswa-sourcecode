package com.bumptech.glide.load.model;

import java.io.InputStream;

public class UrlUriLoader$StreamFactory
  implements ModelLoaderFactory
{
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    UrlUriLoader localUrlUriLoader = new com/bumptech/glide/load/model/UrlUriLoader;
    ModelLoader localModelLoader = paramMultiModelLoaderFactory.build(GlideUrl.class, InputStream.class);
    localUrlUriLoader.<init>(localModelLoader);
    return localUrlUriLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\UrlUriLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */