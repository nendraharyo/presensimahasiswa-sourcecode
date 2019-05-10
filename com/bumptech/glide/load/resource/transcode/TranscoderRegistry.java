package com.bumptech.glide.load.resource.transcode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TranscoderRegistry
{
  private final List transcoders;
  
  public TranscoderRegistry()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.transcoders = localArrayList;
  }
  
  public ResourceTranscoder get(Class paramClass1, Class paramClass2)
  {
    try
    {
      boolean bool1 = paramClass2.isAssignableFrom(paramClass1);
      if (bool1) {}
      for (Object localObject1 = UnitTranscoder.get();; localObject1 = ((TranscoderRegistry.Entry)localObject1).transcoder)
      {
        return (ResourceTranscoder)localObject1;
        localObject1 = this.transcoders;
        localObject3 = ((List)localObject1).iterator();
        boolean bool2;
        do
        {
          bool1 = ((Iterator)localObject3).hasNext();
          if (!bool1) {
            break;
          }
          localObject1 = ((Iterator)localObject3).next();
          localObject1 = (TranscoderRegistry.Entry)localObject1;
          bool2 = ((TranscoderRegistry.Entry)localObject1).handles(paramClass1, paramClass2);
        } while (!bool2);
      }
      localObject1 = new java/lang/IllegalArgumentException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      String str = "No transcoder registered to transcode from ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject3 = ((StringBuilder)localObject3).append(paramClass1);
      str = " to ";
      localObject3 = ((StringBuilder)localObject3).append(str);
      localObject3 = ((StringBuilder)localObject3).append(paramClass2);
      localObject3 = ((StringBuilder)localObject3).toString();
      ((IllegalArgumentException)localObject1).<init>((String)localObject3);
      throw ((Throwable)localObject1);
    }
    finally {}
  }
  
  public List getTranscodeClasses(Class paramClass1, Class paramClass2)
  {
    for (;;)
    {
      try
      {
        ArrayList localArrayList1 = new java/util/ArrayList;
        localArrayList1.<init>();
        boolean bool = paramClass2.isAssignableFrom(paramClass1);
        if (bool)
        {
          localArrayList1.add(paramClass2);
          localObject1 = localArrayList1;
          return (List)localObject1;
        }
        Object localObject1 = this.transcoders;
        Iterator localIterator = ((List)localObject1).iterator();
        bool = localIterator.hasNext();
        if (bool)
        {
          localObject1 = localIterator.next();
          localObject1 = (TranscoderRegistry.Entry)localObject1;
          bool = ((TranscoderRegistry.Entry)localObject1).handles(paramClass1, paramClass2);
          if (bool) {
            localArrayList1.add(paramClass2);
          }
        }
        else
        {
          ArrayList localArrayList2 = localArrayList1;
        }
      }
      finally {}
    }
  }
  
  public void register(Class paramClass1, Class paramClass2, ResourceTranscoder paramResourceTranscoder)
  {
    try
    {
      List localList = this.transcoders;
      TranscoderRegistry.Entry localEntry = new com/bumptech/glide/load/resource/transcode/TranscoderRegistry$Entry;
      localEntry.<init>(paramClass1, paramClass2, paramResourceTranscoder);
      localList.add(localEntry);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\resource\transcode\TranscoderRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */