package com.bumptech.glide.load.engine.prefill;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class PreFillQueue
{
  private final Map bitmapsPerType;
  private int bitmapsRemaining;
  private int keyIndex;
  private final List keyList;
  
  public PreFillQueue(Map paramMap)
  {
    this.bitmapsPerType = paramMap;
    Object localObject1 = new java/util/ArrayList;
    Object localObject2 = paramMap.keySet();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    this.keyList = ((List)localObject1);
    localObject1 = paramMap.values();
    localObject2 = ((Collection)localObject1).iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (Integer)((Iterator)localObject2).next();
      int j = this.bitmapsRemaining;
      int i = ((Integer)localObject1).intValue() + j;
      this.bitmapsRemaining = i;
    }
  }
  
  public int getSize()
  {
    return this.bitmapsRemaining;
  }
  
  public boolean isEmpty()
  {
    int i = this.bitmapsRemaining;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public PreFillType remove()
  {
    Object localObject1 = this.keyList;
    int i = this.keyIndex;
    localObject1 = (PreFillType)((List)localObject1).get(i);
    Object localObject2 = (Integer)this.bitmapsPerType.get(localObject1);
    int m = ((Integer)localObject2).intValue();
    int n = 1;
    int j;
    if (m == n)
    {
      this.bitmapsPerType.remove(localObject1);
      localObject2 = this.keyList;
      m = this.keyIndex;
      ((List)localObject2).remove(m);
      i = this.bitmapsRemaining + -1;
      this.bitmapsRemaining = i;
      localObject2 = this.keyList;
      j = ((List)localObject2).isEmpty();
      if (j == 0) {
        break label152;
      }
      j = 0;
      localObject2 = null;
    }
    for (;;)
    {
      this.keyIndex = j;
      return (PreFillType)localObject1;
      Object localObject3 = this.bitmapsPerType;
      int k = ((Integer)localObject2).intValue() + -1;
      localObject2 = Integer.valueOf(k);
      ((Map)localObject3).put(localObject1, localObject2);
      break;
      label152:
      k = this.keyIndex + 1;
      localObject3 = this.keyList;
      m = ((List)localObject3).size();
      k %= m;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\prefill\PreFillQueue.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */