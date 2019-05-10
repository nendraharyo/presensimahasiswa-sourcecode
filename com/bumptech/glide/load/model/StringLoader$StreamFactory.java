package com.bumptech.glide.load.model;

import android.net.Uri;
import java.io.InputStream;

public class StringLoader$StreamFactory
  implements ModelLoaderFactory
{
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    StringLoader localStringLoader = new com/bumptech/glide/load/model/StringLoader;
    ModelLoader localModelLoader = paramMultiModelLoaderFactory.build(Uri.class, InputStream.class);
    localStringLoader.<init>(localModelLoader);
    return localStringLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\StringLoader$StreamFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */