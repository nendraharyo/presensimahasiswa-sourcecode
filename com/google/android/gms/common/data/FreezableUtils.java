package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.Iterator;

public final class FreezableUtils
{
  public static ArrayList freeze(ArrayList paramArrayList)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayList.size();
    localArrayList.<init>(i);
    i = 0;
    Object localObject = null;
    int j = paramArrayList.size();
    for (int k = 0; k < j; k = i)
    {
      localObject = ((Freezable)paramArrayList.get(k)).freeze();
      localArrayList.add(localObject);
      i = k + 1;
    }
    return localArrayList;
  }
  
  public static ArrayList freeze(Freezable[] paramArrayOfFreezable)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramArrayOfFreezable.length;
    localArrayList.<init>(i);
    i = 0;
    for (;;)
    {
      int j = paramArrayOfFreezable.length;
      if (i >= j) {
        break;
      }
      Object localObject = paramArrayOfFreezable[i].freeze();
      localArrayList.add(localObject);
      i += 1;
    }
    return localArrayList;
  }
  
  public static ArrayList freezeIterable(Iterable paramIterable)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = paramIterable.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      Object localObject = ((Freezable)localIterator.next()).freeze();
      localArrayList.add(localObject);
    }
    return localArrayList;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\FreezableUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */