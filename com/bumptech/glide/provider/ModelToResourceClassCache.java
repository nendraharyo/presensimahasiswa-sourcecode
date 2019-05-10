package com.bumptech.glide.provider;

import android.support.v4.h.a;
import com.bumptech.glide.util.MultiClassKey;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ModelToResourceClassCache
{
  private final a registeredResourceClassCache;
  private final AtomicReference resourceClassKeyRef;
  
  public ModelToResourceClassCache()
  {
    Object localObject = new java/util/concurrent/atomic/AtomicReference;
    ((AtomicReference)localObject).<init>();
    this.resourceClassKeyRef = ((AtomicReference)localObject);
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.registeredResourceClassCache = ((a)localObject);
  }
  
  public void clear()
  {
    synchronized (this.registeredResourceClassCache)
    {
      a locala2 = this.registeredResourceClassCache;
      locala2.clear();
      return;
    }
  }
  
  public List get(Class paramClass1, Class paramClass2)
  {
    Object localObject1 = this.resourceClassKeyRef;
    Object localObject3 = null;
    localObject1 = (MultiClassKey)((AtomicReference)localObject1).getAndSet(null);
    if (localObject1 == null)
    {
      localObject1 = new com/bumptech/glide/util/MultiClassKey;
      ((MultiClassKey)localObject1).<init>(paramClass1, paramClass2);
      localObject3 = localObject1;
    }
    synchronized (this.registeredResourceClassCache)
    {
      localObject1 = this.registeredResourceClassCache;
      localObject1 = ((a)localObject1).get(localObject3);
      localObject1 = (List)localObject1;
      this.resourceClassKeyRef.set(localObject3);
      return (List)localObject1;
      ((MultiClassKey)localObject1).set(paramClass1, paramClass2);
      localObject3 = localObject1;
    }
  }
  
  public void put(Class paramClass1, Class paramClass2, List paramList)
  {
    synchronized (this.registeredResourceClassCache)
    {
      a locala2 = this.registeredResourceClassCache;
      MultiClassKey localMultiClassKey = new com/bumptech/glide/util/MultiClassKey;
      localMultiClassKey.<init>(paramClass1, paramClass2);
      locala2.put(localMultiClassKey, paramList);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\provider\ModelToResourceClassCache.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */