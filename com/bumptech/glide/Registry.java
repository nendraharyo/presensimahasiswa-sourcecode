package com.bumptech.glide;

import android.support.v4.h.k.a;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.load.data.DataRewinder.Factory;
import com.bumptech.glide.load.data.DataRewinderRegistry;
import com.bumptech.glide.load.engine.DecodePath;
import com.bumptech.glide.load.engine.LoadPath;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.ModelLoaderRegistry;
import com.bumptech.glide.load.resource.transcode.ResourceTranscoder;
import com.bumptech.glide.load.resource.transcode.TranscoderRegistry;
import com.bumptech.glide.provider.EncoderRegistry;
import com.bumptech.glide.provider.ImageHeaderParserRegistry;
import com.bumptech.glide.provider.LoadPathCache;
import com.bumptech.glide.provider.ModelToResourceClassCache;
import com.bumptech.glide.provider.ResourceDecoderRegistry;
import com.bumptech.glide.provider.ResourceEncoderRegistry;
import com.bumptech.glide.util.pool.FactoryPools;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Registry
{
  private static final String BUCKET_APPEND_ALL = "legacy_append";
  public static final String BUCKET_BITMAP = "Bitmap";
  public static final String BUCKET_BITMAP_DRAWABLE = "BitmapDrawable";
  public static final String BUCKET_GIF = "Gif";
  private static final String BUCKET_PREPEND_ALL = "legacy_prepend_all";
  private final DataRewinderRegistry dataRewinderRegistry;
  private final ResourceDecoderRegistry decoderRegistry;
  private final EncoderRegistry encoderRegistry;
  private final ImageHeaderParserRegistry imageHeaderParserRegistry;
  private final LoadPathCache loadPathCache;
  private final ModelLoaderRegistry modelLoaderRegistry;
  private final ModelToResourceClassCache modelToResourceClassCache;
  private final ResourceEncoderRegistry resourceEncoderRegistry;
  private final k.a throwableListPool;
  private final TranscoderRegistry transcoderRegistry;
  
  public Registry()
  {
    Object localObject = new com/bumptech/glide/provider/ModelToResourceClassCache;
    ((ModelToResourceClassCache)localObject).<init>();
    this.modelToResourceClassCache = ((ModelToResourceClassCache)localObject);
    localObject = new com/bumptech/glide/provider/LoadPathCache;
    ((LoadPathCache)localObject).<init>();
    this.loadPathCache = ((LoadPathCache)localObject);
    localObject = FactoryPools.threadSafeList();
    this.throwableListPool = ((k.a)localObject);
    localObject = new com/bumptech/glide/load/model/ModelLoaderRegistry;
    k.a locala = this.throwableListPool;
    ((ModelLoaderRegistry)localObject).<init>(locala);
    this.modelLoaderRegistry = ((ModelLoaderRegistry)localObject);
    localObject = new com/bumptech/glide/provider/EncoderRegistry;
    ((EncoderRegistry)localObject).<init>();
    this.encoderRegistry = ((EncoderRegistry)localObject);
    localObject = new com/bumptech/glide/provider/ResourceDecoderRegistry;
    ((ResourceDecoderRegistry)localObject).<init>();
    this.decoderRegistry = ((ResourceDecoderRegistry)localObject);
    localObject = new com/bumptech/glide/provider/ResourceEncoderRegistry;
    ((ResourceEncoderRegistry)localObject).<init>();
    this.resourceEncoderRegistry = ((ResourceEncoderRegistry)localObject);
    localObject = new com/bumptech/glide/load/data/DataRewinderRegistry;
    ((DataRewinderRegistry)localObject).<init>();
    this.dataRewinderRegistry = ((DataRewinderRegistry)localObject);
    localObject = new com/bumptech/glide/load/resource/transcode/TranscoderRegistry;
    ((TranscoderRegistry)localObject).<init>();
    this.transcoderRegistry = ((TranscoderRegistry)localObject);
    localObject = new com/bumptech/glide/provider/ImageHeaderParserRegistry;
    ((ImageHeaderParserRegistry)localObject).<init>();
    this.imageHeaderParserRegistry = ((ImageHeaderParserRegistry)localObject);
    localObject = new String[3];
    localObject[0] = "Gif";
    localObject[1] = "Bitmap";
    localObject[2] = "BitmapDrawable";
    localObject = Arrays.asList((Object[])localObject);
    setResourceDecoderBucketPriorityList((List)localObject);
  }
  
  private List getDecodePaths(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.decoderRegistry.getResourceClasses(paramClass1, paramClass2);
    Iterator localIterator1 = ((List)localObject).iterator();
    boolean bool = localIterator1.hasNext();
    if (bool)
    {
      Class localClass1 = (Class)localIterator1.next();
      localObject = this.transcoderRegistry.getTranscodeClasses(localClass1, paramClass3);
      Iterator localIterator2 = ((List)localObject).iterator();
      for (;;)
      {
        bool = localIterator2.hasNext();
        if (!bool) {
          break;
        }
        Class localClass2 = (Class)localIterator2.next();
        List localList = this.decoderRegistry.getDecoders(paramClass1, localClass1);
        ResourceTranscoder localResourceTranscoder = this.transcoderRegistry.get(localClass1, localClass2);
        localObject = new com/bumptech/glide/load/engine/DecodePath;
        k.a locala = this.throwableListPool;
        ((DecodePath)localObject).<init>(paramClass1, localClass1, localClass2, localList, localResourceTranscoder, locala);
        localArrayList.add(localObject);
      }
    }
    return localArrayList;
  }
  
  public Registry append(Class paramClass, Encoder paramEncoder)
  {
    this.encoderRegistry.append(paramClass, paramEncoder);
    return this;
  }
  
  public Registry append(Class paramClass, ResourceEncoder paramResourceEncoder)
  {
    this.resourceEncoderRegistry.append(paramClass, paramResourceEncoder);
    return this;
  }
  
  public Registry append(Class paramClass1, Class paramClass2, ResourceDecoder paramResourceDecoder)
  {
    append("legacy_append", paramClass1, paramClass2, paramResourceDecoder);
    return this;
  }
  
  public Registry append(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    this.modelLoaderRegistry.append(paramClass1, paramClass2, paramModelLoaderFactory);
    return this;
  }
  
  public Registry append(String paramString, Class paramClass1, Class paramClass2, ResourceDecoder paramResourceDecoder)
  {
    this.decoderRegistry.append(paramString, paramResourceDecoder, paramClass1, paramClass2);
    return this;
  }
  
  public List getImageHeaderParsers()
  {
    Object localObject = this.imageHeaderParserRegistry.getParsers();
    boolean bool = ((List)localObject).isEmpty();
    if (bool)
    {
      localObject = new com/bumptech/glide/Registry$NoImageHeaderParserException;
      ((Registry.NoImageHeaderParserException)localObject).<init>();
      throw ((Throwable)localObject);
    }
    return (List)localObject;
  }
  
  public LoadPath getLoadPath(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    Object localObject1 = null;
    Object localObject2 = this.loadPathCache.get(paramClass1, paramClass2, paramClass3);
    Object localObject3 = this.loadPathCache;
    boolean bool1 = ((LoadPathCache)localObject3).isEmptyLoadPath((LoadPath)localObject2);
    if (bool1) {}
    for (;;)
    {
      return (LoadPath)localObject1;
      if (localObject2 == null)
      {
        List localList = getDecodePaths(paramClass1, paramClass2, paramClass3);
        boolean bool2 = localList.isEmpty();
        if (bool2) {}
        for (;;)
        {
          localObject2 = this.loadPathCache;
          ((LoadPathCache)localObject2).put(paramClass1, paramClass2, paramClass3, (LoadPath)localObject1);
          break;
          localObject1 = new com/bumptech/glide/load/engine/LoadPath;
          k.a locala = this.throwableListPool;
          localObject2 = paramClass1;
          localObject3 = paramClass2;
          ((LoadPath)localObject1).<init>(paramClass1, paramClass2, paramClass3, localList, locala);
        }
      }
      localObject1 = localObject2;
    }
  }
  
  public List getModelLoaders(Object paramObject)
  {
    Object localObject = this.modelLoaderRegistry.getModelLoaders(paramObject);
    boolean bool = ((List)localObject).isEmpty();
    if (bool)
    {
      localObject = new com/bumptech/glide/Registry$NoModelLoaderAvailableException;
      ((Registry.NoModelLoaderAvailableException)localObject).<init>(paramObject);
      throw ((Throwable)localObject);
    }
    return (List)localObject;
  }
  
  public List getRegisteredResourceClasses(Class paramClass1, Class paramClass2, Class paramClass3)
  {
    Object localObject1 = this.modelToResourceClassCache.get(paramClass1, paramClass2);
    if (localObject1 == null)
    {
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject1 = this.modelLoaderRegistry.getDataClasses(paramClass1);
      Object localObject2 = ((List)localObject1).iterator();
      boolean bool1 = ((Iterator)localObject2).hasNext();
      if (bool1)
      {
        localObject1 = (Class)((Iterator)localObject2).next();
        localObject1 = this.decoderRegistry.getResourceClasses((Class)localObject1, paramClass2);
        Iterator localIterator = ((List)localObject1).iterator();
        for (;;)
        {
          bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = (Class)localIterator.next();
          List localList = this.transcoderRegistry.getTranscodeClasses((Class)localObject1, paramClass3);
          boolean bool2 = localList.isEmpty();
          if (!bool2)
          {
            bool2 = localArrayList.contains(localObject1);
            if (!bool2) {
              localArrayList.add(localObject1);
            }
          }
        }
      }
      localObject1 = this.modelToResourceClassCache;
      localObject2 = Collections.unmodifiableList(localArrayList);
      ((ModelToResourceClassCache)localObject1).put(paramClass1, paramClass2, (List)localObject2);
      localObject1 = localArrayList;
    }
    return (List)localObject1;
  }
  
  public ResourceEncoder getResultEncoder(Resource paramResource)
  {
    Object localObject = this.resourceEncoderRegistry;
    Class localClass = paramResource.getResourceClass();
    localObject = ((ResourceEncoderRegistry)localObject).get(localClass);
    if (localObject != null) {
      return (ResourceEncoder)localObject;
    }
    localObject = new com/bumptech/glide/Registry$NoResultEncoderAvailableException;
    localClass = paramResource.getResourceClass();
    ((Registry.NoResultEncoderAvailableException)localObject).<init>(localClass);
    throw ((Throwable)localObject);
  }
  
  public DataRewinder getRewinder(Object paramObject)
  {
    return this.dataRewinderRegistry.build(paramObject);
  }
  
  public Encoder getSourceEncoder(Object paramObject)
  {
    Object localObject = this.encoderRegistry;
    Class localClass = paramObject.getClass();
    localObject = ((EncoderRegistry)localObject).getEncoder(localClass);
    if (localObject != null) {
      return (Encoder)localObject;
    }
    localObject = new com/bumptech/glide/Registry$NoSourceEncoderAvailableException;
    localClass = paramObject.getClass();
    ((Registry.NoSourceEncoderAvailableException)localObject).<init>(localClass);
    throw ((Throwable)localObject);
  }
  
  public boolean isResourceEncoderAvailable(Resource paramResource)
  {
    Object localObject = this.resourceEncoderRegistry;
    Class localClass = paramResource.getResourceClass();
    localObject = ((ResourceEncoderRegistry)localObject).get(localClass);
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public Registry prepend(Class paramClass, Encoder paramEncoder)
  {
    this.encoderRegistry.prepend(paramClass, paramEncoder);
    return this;
  }
  
  public Registry prepend(Class paramClass, ResourceEncoder paramResourceEncoder)
  {
    this.resourceEncoderRegistry.prepend(paramClass, paramResourceEncoder);
    return this;
  }
  
  public Registry prepend(Class paramClass1, Class paramClass2, ResourceDecoder paramResourceDecoder)
  {
    prepend("legacy_prepend_all", paramClass1, paramClass2, paramResourceDecoder);
    return this;
  }
  
  public Registry prepend(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    this.modelLoaderRegistry.prepend(paramClass1, paramClass2, paramModelLoaderFactory);
    return this;
  }
  
  public Registry prepend(String paramString, Class paramClass1, Class paramClass2, ResourceDecoder paramResourceDecoder)
  {
    this.decoderRegistry.prepend(paramString, paramResourceDecoder, paramClass1, paramClass2);
    return this;
  }
  
  public Registry register(ImageHeaderParser paramImageHeaderParser)
  {
    this.imageHeaderParserRegistry.add(paramImageHeaderParser);
    return this;
  }
  
  public Registry register(DataRewinder.Factory paramFactory)
  {
    this.dataRewinderRegistry.register(paramFactory);
    return this;
  }
  
  public Registry register(Class paramClass, Encoder paramEncoder)
  {
    return append(paramClass, paramEncoder);
  }
  
  public Registry register(Class paramClass, ResourceEncoder paramResourceEncoder)
  {
    return append(paramClass, paramResourceEncoder);
  }
  
  public Registry register(Class paramClass1, Class paramClass2, ResourceTranscoder paramResourceTranscoder)
  {
    this.transcoderRegistry.register(paramClass1, paramClass2, paramResourceTranscoder);
    return this;
  }
  
  public Registry replace(Class paramClass1, Class paramClass2, ModelLoaderFactory paramModelLoaderFactory)
  {
    this.modelLoaderRegistry.replace(paramClass1, paramClass2, paramModelLoaderFactory);
    return this;
  }
  
  public final Registry setResourceDecoderBucketPriorityList(List paramList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramList);
    localArrayList.add(0, "legacy_prepend_all");
    localArrayList.add("legacy_append");
    this.decoderRegistry.setBucketPriorityList(localArrayList);
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\Registry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */