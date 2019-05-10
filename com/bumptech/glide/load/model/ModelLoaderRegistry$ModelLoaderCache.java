package com.bumptech.glide.load.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ModelLoaderRegistry$ModelLoaderCache
{
  private final Map cachedModelLoaders;
  
  ModelLoaderRegistry$ModelLoaderCache()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.cachedModelLoaders = localHashMap;
  }
  
  public void clear()
  {
    this.cachedModelLoaders.clear();
  }
  
  public List get(Class paramClass)
  {
    Object localObject = (ModelLoaderRegistry.ModelLoaderCache.Entry)this.cachedModelLoaders.get(paramClass);
    if (localObject == null) {}
    for (localObject = null;; localObject = ((ModelLoaderRegistry.ModelLoaderCache.Entry)localObject).loaders) {
      return (List)localObject;
    }
  }
  
  public void put(Class paramClass, List paramList)
  {
    Object localObject1 = this.cachedModelLoaders;
    Object localObject2 = new com/bumptech/glide/load/model/ModelLoaderRegistry$ModelLoaderCache$Entry;
    ((ModelLoaderRegistry.ModelLoaderCache.Entry)localObject2).<init>(paramList);
    localObject1 = (ModelLoaderRegistry.ModelLoaderCache.Entry)((Map)localObject1).put(paramClass, localObject2);
    if (localObject1 != null)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "Already cached loaders for model: " + paramClass;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelLoaderRegistry$ModelLoaderCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */