package com.bumptech.glide.load.data;

import com.bumptech.glide.util.Preconditions;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataRewinderRegistry
{
  private static final DataRewinder.Factory DEFAULT_FACTORY;
  private final Map rewinders;
  
  static
  {
    DataRewinderRegistry.1 local1 = new com/bumptech/glide/load/data/DataRewinderRegistry$1;
    local1.<init>();
    DEFAULT_FACTORY = local1;
  }
  
  public DataRewinderRegistry()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.rewinders = localHashMap;
  }
  
  public DataRewinder build(Object paramObject)
  {
    try
    {
      Preconditions.checkNotNull(paramObject);
      Object localObject1 = this.rewinders;
      Object localObject3 = paramObject.getClass();
      localObject1 = ((Map)localObject1).get(localObject3);
      localObject1 = (DataRewinder.Factory)localObject1;
      if (localObject1 == null)
      {
        localObject3 = this.rewinders;
        localObject3 = ((Map)localObject3).values();
        Iterator localIterator = ((Collection)localObject3).iterator();
        boolean bool2;
        do
        {
          boolean bool1 = localIterator.hasNext();
          if (!bool1) {
            break;
          }
          localObject3 = localIterator.next();
          localObject3 = (DataRewinder.Factory)localObject3;
          Class localClass1 = ((DataRewinder.Factory)localObject3).getDataClass();
          Class localClass2 = paramObject.getClass();
          bool2 = localClass1.isAssignableFrom(localClass2);
        } while (!bool2);
        localObject1 = localObject3;
      }
      if (localObject1 == null) {
        localObject1 = DEFAULT_FACTORY;
      }
      localObject1 = ((DataRewinder.Factory)localObject1).build(paramObject);
      return (DataRewinder)localObject1;
    }
    finally {}
  }
  
  public void register(DataRewinder.Factory paramFactory)
  {
    try
    {
      Map localMap = this.rewinders;
      Class localClass = paramFactory.getDataClass();
      localMap.put(localClass, paramFactory);
      return;
    }
    finally {}
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\data\DataRewinderRegistry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */