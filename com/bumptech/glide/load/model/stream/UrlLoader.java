package com.bumptech.glide.load.model.stream;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import java.net.URL;

public class UrlLoader
  implements ModelLoader
{
  private final ModelLoader glideUrlLoader;
  
  public UrlLoader(ModelLoader paramModelLoader)
  {
    this.glideUrlLoader = paramModelLoader;
  }
  
  public ModelLoader.LoadData buildLoadData(URL paramURL, int paramInt1, int paramInt2, Options paramOptions)
  {
    ModelLoader localModelLoader = this.glideUrlLoader;
    GlideUrl localGlideUrl = new com/bumptech/glide/load/model/GlideUrl;
    localGlideUrl.<init>(paramURL);
    return localModelLoader.buildLoadData(localGlideUrl, paramInt1, paramInt2, paramOptions);
  }
  
  public boolean handles(URL paramURL)
  {
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\stream\UrlLoader.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */