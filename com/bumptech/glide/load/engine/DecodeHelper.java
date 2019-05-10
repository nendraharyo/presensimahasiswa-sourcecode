package com.bumptech.glide.load.engine;

import com.bumptech.glide.GlideContext;
import com.bumptech.glide.Priority;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.load.engine.cache.DiskCache;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoader.LoadData;
import com.bumptech.glide.load.resource.UnitTransformation;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class DecodeHelper
{
  private final List cacheKeys;
  private DecodeJob.DiskCacheProvider diskCacheProvider;
  private DiskCacheStrategy diskCacheStrategy;
  private GlideContext glideContext;
  private int height;
  private boolean isCacheKeysSet;
  private boolean isLoadDataSet;
  private boolean isScaleOnlyOrNoTransform;
  private boolean isTransformationRequired;
  private final List loadData;
  private Object model;
  private Options options;
  private Priority priority;
  private Class resourceClass;
  private Key signature;
  private Class transcodeClass;
  private Map transformations;
  private int width;
  
  DecodeHelper()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.loadData = localArrayList;
    localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.cacheKeys = localArrayList;
  }
  
  void clear()
  {
    this.glideContext = null;
    this.model = null;
    this.signature = null;
    this.resourceClass = null;
    this.transcodeClass = null;
    this.options = null;
    this.priority = null;
    this.transformations = null;
    this.diskCacheStrategy = null;
    this.loadData.clear();
    this.isLoadDataSet = false;
    this.cacheKeys.clear();
    this.isCacheKeysSet = false;
  }
  
  ArrayPool getArrayPool()
  {
    return this.glideContext.getArrayPool();
  }
  
  List getCacheKeys()
  {
    boolean bool1 = this.isCacheKeysSet;
    if (!bool1)
    {
      bool1 = true;
      this.isCacheKeysSet = bool1;
      Object localObject1 = this.cacheKeys;
      ((List)localObject1).clear();
      List localList1 = getLoadData();
      int j = localList1.size();
      int i;
      for (int k = 0; k < j; k = i)
      {
        localObject1 = (ModelLoader.LoadData)localList1.get(k);
        List localList2 = this.cacheKeys;
        Object localObject2 = ((ModelLoader.LoadData)localObject1).sourceKey;
        int m = localList2.contains(localObject2);
        if (m == 0)
        {
          localList2 = this.cacheKeys;
          localObject2 = ((ModelLoader.LoadData)localObject1).sourceKey;
          localList2.add(localObject2);
        }
        m = 0;
        localList2 = null;
        for (;;)
        {
          localObject2 = ((ModelLoader.LoadData)localObject1).alternateKeys;
          int i1 = ((List)localObject2).size();
          if (m >= i1) {
            break;
          }
          localObject2 = this.cacheKeys;
          Object localObject3 = ((ModelLoader.LoadData)localObject1).alternateKeys.get(m);
          boolean bool2 = ((List)localObject2).contains(localObject3);
          if (!bool2)
          {
            localObject2 = this.cacheKeys;
            localObject3 = ((ModelLoader.LoadData)localObject1).alternateKeys.get(m);
            ((List)localObject2).add(localObject3);
          }
          int n;
          m += 1;
        }
        i = k + 1;
      }
    }
    return this.cacheKeys;
  }
  
  DiskCache getDiskCache()
  {
    return this.diskCacheProvider.getDiskCache();
  }
  
  DiskCacheStrategy getDiskCacheStrategy()
  {
    return this.diskCacheStrategy;
  }
  
  int getHeight()
  {
    return this.height;
  }
  
  List getLoadData()
  {
    boolean bool = this.isLoadDataSet;
    if (!bool)
    {
      this.isLoadDataSet = true;
      this.loadData.clear();
      Object localObject1 = this.glideContext.getRegistry();
      Object localObject2 = this.model;
      List localList = ((Registry)localObject1).getModelLoaders(localObject2);
      bool = false;
      localObject1 = null;
      int j = localList.size();
      int k = 0;
      localObject2 = null;
      while (k < j)
      {
        localObject1 = (ModelLoader)localList.get(k);
        Object localObject3 = this.model;
        int m = this.width;
        int n = this.height;
        Options localOptions = this.options;
        localObject1 = ((ModelLoader)localObject1).buildLoadData(localObject3, m, n, localOptions);
        if (localObject1 != null)
        {
          localObject3 = this.loadData;
          ((List)localObject3).add(localObject1);
        }
        int i = k + 1;
        k = i;
      }
    }
    return this.loadData;
  }
  
  LoadPath getLoadPath(Class paramClass)
  {
    Registry localRegistry = this.glideContext.getRegistry();
    Class localClass1 = this.resourceClass;
    Class localClass2 = this.transcodeClass;
    return localRegistry.getLoadPath(paramClass, localClass1, localClass2);
  }
  
  Class getModelClass()
  {
    return this.model.getClass();
  }
  
  List getModelLoaders(File paramFile)
  {
    return this.glideContext.getRegistry().getModelLoaders(paramFile);
  }
  
  Options getOptions()
  {
    return this.options;
  }
  
  Priority getPriority()
  {
    return this.priority;
  }
  
  List getRegisteredResourceClasses()
  {
    Registry localRegistry = this.glideContext.getRegistry();
    Class localClass1 = this.model.getClass();
    Class localClass2 = this.resourceClass;
    Class localClass3 = this.transcodeClass;
    return localRegistry.getRegisteredResourceClasses(localClass1, localClass2, localClass3);
  }
  
  ResourceEncoder getResultEncoder(Resource paramResource)
  {
    return this.glideContext.getRegistry().getResultEncoder(paramResource);
  }
  
  Key getSignature()
  {
    return this.signature;
  }
  
  Encoder getSourceEncoder(Object paramObject)
  {
    return this.glideContext.getRegistry().getSourceEncoder(paramObject);
  }
  
  Class getTranscodeClass()
  {
    return this.transcodeClass;
  }
  
  Transformation getTransformation(Class paramClass)
  {
    Object localObject1 = (Transformation)this.transformations.get(paramClass);
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = this.transformations.entrySet();
      Iterator localIterator = ((Set)localObject2).iterator();
      boolean bool2;
      do
      {
        boolean bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (Map.Entry)localIterator.next();
        Class localClass = (Class)((Map.Entry)localObject2).getKey();
        bool2 = localClass.isAssignableFrom(paramClass);
      } while (!bool2);
      localObject1 = (Transformation)((Map.Entry)localObject2).getValue();
    }
    if (localObject1 == null)
    {
      localObject1 = this.transformations;
      boolean bool3 = ((Map)localObject1).isEmpty();
      if (bool3)
      {
        bool3 = this.isTransformationRequired;
        if (bool3)
        {
          localObject1 = new java/lang/IllegalArgumentException;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = "Missing transformation for " + paramClass + ". If you wish to ignore unknown resource types, use the optional transformation methods.";
          ((IllegalArgumentException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      localObject1 = UnitTransformation.get();
    }
    return (Transformation)localObject1;
  }
  
  int getWidth()
  {
    return this.width;
  }
  
  boolean hasLoadPath(Class paramClass)
  {
    LoadPath localLoadPath = getLoadPath(paramClass);
    boolean bool;
    if (localLoadPath != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localLoadPath = null;
    }
  }
  
  void init(GlideContext paramGlideContext, Object paramObject, Key paramKey, int paramInt1, int paramInt2, DiskCacheStrategy paramDiskCacheStrategy, Class paramClass1, Class paramClass2, Priority paramPriority, Options paramOptions, Map paramMap, boolean paramBoolean1, boolean paramBoolean2, DecodeJob.DiskCacheProvider paramDiskCacheProvider)
  {
    this.glideContext = paramGlideContext;
    this.model = paramObject;
    this.signature = paramKey;
    this.width = paramInt1;
    this.height = paramInt2;
    this.diskCacheStrategy = paramDiskCacheStrategy;
    this.resourceClass = paramClass1;
    this.diskCacheProvider = paramDiskCacheProvider;
    this.transcodeClass = paramClass2;
    this.priority = paramPriority;
    this.options = paramOptions;
    this.transformations = paramMap;
    this.isTransformationRequired = paramBoolean1;
    this.isScaleOnlyOrNoTransform = paramBoolean2;
  }
  
  boolean isResourceEncoderAvailable(Resource paramResource)
  {
    return this.glideContext.getRegistry().isResourceEncoderAvailable(paramResource);
  }
  
  boolean isScaleOnlyOrNoTransform()
  {
    return this.isScaleOnlyOrNoTransform;
  }
  
  boolean isSourceKey(Key paramKey)
  {
    List localList = getLoadData();
    int i = localList.size();
    int j = 0;
    Key localKey;
    boolean bool;
    if (j < i)
    {
      localKey = ((ModelLoader.LoadData)localList.get(j)).sourceKey;
      bool = localKey.equals(paramKey);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      int k = j + 1;
      j = k;
      break;
      k = 0;
      localKey = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\DecodeHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */