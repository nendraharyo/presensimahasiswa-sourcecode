package com.bumptech.glide.load.model;

import android.content.res.Resources;

public class ResourceLoader$UriFactory
  implements ModelLoaderFactory
{
  private final Resources resources;
  
  public ResourceLoader$UriFactory(Resources paramResources)
  {
    this.resources = paramResources;
  }
  
  public ModelLoader build(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    ResourceLoader localResourceLoader = new com/bumptech/glide/load/model/ResourceLoader;
    Resources localResources = this.resources;
    UnitModelLoader localUnitModelLoader = UnitModelLoader.getInstance();
    localResourceLoader.<init>(localResources, localUnitModelLoader);
    return localResourceLoader;
  }
  
  public void teardown() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ResourceLoader$UriFactory.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */