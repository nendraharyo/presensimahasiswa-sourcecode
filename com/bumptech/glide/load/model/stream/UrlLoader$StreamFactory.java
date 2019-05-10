package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.io.InputStream;

public class UrlLoader$StreamFactory
  implements ModelLoaderFactory
{
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    UrlLoader localUrlLoader = new com/bumptech/glide/load/model/stream/UrlLoader;
    ModelLoader localModelLoader = paramMultiModelLoaderFactory.build(GlideUrl.class, InputStream.class);
    localUrlLoader.<init>(localModelLoader);
    return localUrlLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\UrlLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */