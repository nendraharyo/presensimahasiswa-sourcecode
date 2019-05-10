package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;

public final class ResourceLoader$AssetFileDescriptorFactory
  implements ModelLoaderFactory
{
  private final Resources resources;
  
  public ResourceLoader$AssetFileDescriptorFactory(Resources paramResources)
  {
    this.resources = paramResources;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    ResourceLoader localResourceLoader = new com/bumptech/glide/load/model/ResourceLoader;
    Resources localResources = this.resources;
    ModelLoader localModelLoader = paramMultiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class);
    localResourceLoader.<init>(localResources, localModelLoader);
    return localResourceLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ResourceLoader$AssetFileDescriptorFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */