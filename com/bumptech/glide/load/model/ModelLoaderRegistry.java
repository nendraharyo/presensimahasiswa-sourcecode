package com.bumptech.glide.load.model;

import android.support.v4.h.k.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ModelLoaderRegistry
{
  private final ModelLoaderRegistry.ModelLoaderCache cache;
  private final MultiModelLoaderFactory multiModelLoaderFactory;
  
  public ModelLoaderRegistry(k.a parama)
  {
    this(localMultiModelLoaderFactory);
  }
  
  private ModelLoaderRegistry(MultiModelLoaderFactory paramMultiModelLoaderFactory)
  {
    ModelLoaderRegistry.ModelLoaderCache localModelLoaderCache = new com/bumptech/glide/load/model/ModelLoaderRegistry$ModelLoaderCache;
    localModelLoaderCache.<init>();
    this.cache = localModelLoaderCache;
    this.multiModelLoaderFactory = paramMultiModelLoaderFactory;
  }
  
  private static Class getClass(Object paramObject)
  {
    return paramObject.getClass();
  }
  
  private List getModelLoadersForClass(Class paramClass)
  {
    try
    {
      Object localObject1 = this.cache;
      localObject1 = ((ModelLoaderRegistry.ModelLoaderCache)localObject1).get(paramClass);
      if (localObject1 == null)
      {
        localObject1 = this.multiModelLoaderFactory;
        localObject1 = ((MultiModelLoaderFactory)localObject1).build(paramClass);
        localObject1 = Collections.unmodifiableList((List)localObject1);
        ModelLoaderRegistry.ModelLoaderCache localModelLoaderCache = this.cache;
        localModelLoaderCache.put(paramClass, (List)localObject1);
      }
      return (List)localObject1;
    }
    finally {}
  }
  
  private void tearDown(List paramList)
  {
    Iterator localIterator = paramList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      ModelLoaderFactory localModelLoaderFactory = (ModelLoaderFactory)localIterator.next();
      localModelLoaderFactory.teardown();
    }
  }
  
  public void append(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    try
    {
      Object localObject1 = this.multiModelLoaderFactory;
      ((MultiModelLoaderFactory)localObject1).append(paramClass1, paramClass2, paramModelLoaderFactory);
      localObject1 = this.cache;
      ((ModelLoaderRegistry.ModelLoaderCache)localObject1).clear();
      return;
    }
    finally {}
  }
  
  public ModelLoader build(Class paramClass1, Class paramClass2)
  {
    try
    {
      Object localObject1 = this.multiModelLoaderFactory;
      localObject1 = ((MultiModelLoaderFactory)localObject1).build(paramClass1, paramClass2);
      return (ModelLoader)localObject1;
    }
    finally {}
  }
  
  public List getDataClasses(Class paramClass)
  {
    try
    {
      Object localObject1 = this.multiModelLoaderFactory;
      localObject1 = ((MultiModelLoaderFactory)localObject1).getDataClasses(paramClass);
      return (List)localObject1;
    }
    finally {}
  }
  
  public List getModelLoaders(Object paramObject)
  {
    Object localObject1 = getClass(paramObject);
    List localList = getModelLoadersForClass((Class)localObject1);
    int i = localList.size();
    int j = 1;
    Object localObject2 = Collections.emptyList();
    int m;
    for (int k = 0; k < i; k = m)
    {
      localObject1 = (ModelLoader)localList.get(k);
      boolean bool = ((ModelLoader)localObject1).handles(paramObject);
      if (bool)
      {
        if (j != 0)
        {
          localObject2 = new java/util/ArrayList;
          j = i - k;
          ((ArrayList)localObject2).<init>(j);
          j = 0;
        }
        ((List)localObject2).add(localObject1);
      }
      m = k + 1;
    }
    return (List)localObject2;
  }
  
  public void prepend(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    try
    {
      Object localObject1 = this.multiModelLoaderFactory;
      ((MultiModelLoaderFactory)localObject1).prepend(paramClass1, paramClass2, paramModelLoaderFactory);
      localObject1 = this.cache;
      ((ModelLoaderRegistry.ModelLoaderCache)localObject1).clear();
      return;
    }
    finally {}
  }
  
  public void remove(Class paramClass1, Class paramClass2)
  {
    try
    {
      Object localObject1 = this.multiModelLoaderFactory;
      localObject1 = ((MultiModelLoaderFactory)localObject1).remove(paramClass1, paramClass2);
      tearDown((List)localObject1);
      localObject1 = this.cache;
      ((ModelLoaderRegistry.ModelLoaderCache)localObject1).clear();
      return;
    }
    finally {}
  }
  
  public void replace(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    try
    {
      Object localObject1 = this.multiModelLoaderFactory;
      localObject1 = ((MultiModelLoaderFactory)localObject1).replace(paramClass1, paramClass2, paramModelLoaderFactory);
      tearDown((List)localObject1);
      localObject1 = this.cache;
      ((ModelLoaderRegistry.ModelLoaderCache)localObject1).clear();
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\model\ModelLoaderRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */