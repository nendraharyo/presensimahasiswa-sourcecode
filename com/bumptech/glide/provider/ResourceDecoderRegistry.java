package com.bumptech.glide.provider;

import com.bumptech.glide.load.ResourceDecoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ResourceDecoderRegistry
{
  private final List bucketPriorityList;
  private final Map decoders;
  
  public ResourceDecoderRegistry()
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.bucketPriorityList = ((List)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.decoders = ((Map)localObject);
  }
  
  private List getOrAddEntryList(String paramString)
  {
    try
    {
      Object localObject1 = this.bucketPriorityList;
      boolean bool = ((List)localObject1).contains(paramString);
      if (!bool)
      {
        localObject1 = this.bucketPriorityList;
        ((List)localObject1).add(paramString);
      }
      localObject1 = this.decoders;
      localObject1 = ((Map)localObject1).get(paramString);
      localObject1 = (List)localObject1;
      if (localObject1 == null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        Map localMap = this.decoders;
        localMap.put(paramString, localObject1);
      }
      return (List)localObject1;
    }
    finally {}
  }
  
  public void append(String paramString, ResourceDecoder paramResourceDecoder, Class paramClass1, Class paramClass2)
  {
    try
    {
      List localList = getOrAddEntryList(paramString);
      ResourceDecoderRegistry.Entry localEntry = new com/bumptech/glide/provider/ResourceDecoderRegistry$Entry;
      localEntry.<init>(paramClass1, paramClass2, paramResourceDecoder);
      localList.add(localEntry);
      return;
    }
    finally {}
  }
  
  public List getDecoders(Class paramClass1, Class paramClass2)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject1 = this.bucketPriorityList;
      Iterator localIterator = ((List)localObject1).iterator();
      boolean bool1;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        localObject3 = this.decoders;
        localObject1 = ((Map)localObject3).get(localObject1);
        localObject1 = (List)localObject1;
      } while (localObject1 == null);
      Object localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject3).next();
        localObject1 = (ResourceDecoderRegistry.Entry)localObject1;
        boolean bool2 = ((ResourceDecoderRegistry.Entry)localObject1).handles(paramClass1, paramClass2);
        if (bool2)
        {
          localObject1 = ((ResourceDecoderRegistry.Entry)localObject1).decoder;
          localArrayList.add(localObject1);
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  public List getResourceClasses(Class paramClass1, Class paramClass2)
  {
    ArrayList localArrayList;
    try
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      Object localObject1 = this.bucketPriorityList;
      Iterator localIterator = ((List)localObject1).iterator();
      boolean bool1;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        localObject3 = this.decoders;
        localObject1 = ((Map)localObject3).get(localObject1);
        localObject1 = (List)localObject1;
      } while (localObject1 == null);
      Object localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject3).next();
        localObject1 = (ResourceDecoderRegistry.Entry)localObject1;
        boolean bool2 = ((ResourceDecoderRegistry.Entry)localObject1).handles(paramClass1, paramClass2);
        if (bool2)
        {
          Class localClass = ((ResourceDecoderRegistry.Entry)localObject1).resourceClass;
          bool2 = localArrayList.contains(localClass);
          if (!bool2)
          {
            localObject1 = ((ResourceDecoderRegistry.Entry)localObject1).resourceClass;
            localArrayList.add(localObject1);
          }
        }
      }
    }
    finally {}
    return localArrayList;
  }
  
  public void prepend(String paramString, ResourceDecoder paramResourceDecoder, Class paramClass1, Class paramClass2)
  {
    try
    {
      List localList = getOrAddEntryList(paramString);
      ResourceDecoderRegistry.Entry localEntry = new com/bumptech/glide/provider/ResourceDecoderRegistry$Entry;
      localEntry.<init>(paramClass1, paramClass2, paramResourceDecoder);
      localList.add(0, localEntry);
      return;
    }
    finally {}
  }
  
  public void setBucketPriorityList(List paramList)
  {
    try
    {
      Object localObject1 = new java/util/ArrayList;
      Object localObject3 = this.bucketPriorityList;
      ((ArrayList)localObject1).<init>((Collection)localObject3);
      localObject3 = this.bucketPriorityList;
      ((List)localObject3).clear();
      localObject3 = this.bucketPriorityList;
      ((List)localObject3).addAll(paramList);
      localObject3 = ((List)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((Iterator)localObject3).next();
        localObject1 = (String)localObject1;
        boolean bool2 = paramList.contains(localObject1);
        if (!bool2)
        {
          List localList = this.bucketPriorityList;
          localList.add(localObject1);
        }
      }
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\ResourceDecoderRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */