package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;

public final class StringLoader$AssetFileDescriptorFactory
  implements ModelLoaderFactory
{
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    StringLoader localStringLoader = new com/bumptech/glide/load/model/StringLoader;
    ModelLoader localModelLoader = paramMultiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class);
    localStringLoader.<init>(localModelLoader);
    return localStringLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\StringLoader$AssetFileDescriptorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */