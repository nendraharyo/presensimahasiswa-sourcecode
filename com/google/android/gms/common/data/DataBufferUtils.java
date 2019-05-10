package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

public final class DataBufferUtils
{
  public static ArrayList freezeAndClose(DataBuffer paramDataBuffer)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    int i = paramDataBuffer.getCount();
    localArrayList.<init>(i);
    try
    {
      Iterator localIterator = paramDataBuffer.iterator();
      for (;;)
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        Object localObject1 = localIterator.next();
        localObject1 = (Freezable)localObject1;
        localObject1 = ((Freezable)localObject1).freeze();
        localArrayList.add(localObject1);
      }
    }
    finally
    {
      paramDataBuffer.close();
    }
    return localArrayList;
  }
  
  public static boolean hasData(DataBuffer paramDataBuffer)
  {
    if (paramDataBuffer != null)
    {
      i = paramDataBuffer.getCount();
      if (i <= 0) {}
    }
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  public static boolean hasNextPage(DataBuffer paramDataBuffer)
  {
    Object localObject = paramDataBuffer.zzpZ();
    boolean bool;
    if (localObject != null)
    {
      String str = "next_page_token";
      localObject = ((Bundle)localObject).getString(str);
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public static boolean hasPrevPage(DataBuffer paramDataBuffer)
  {
    Object localObject = paramDataBuffer.zzpZ();
    boolean bool;
    if (localObject != null)
    {
      String str = "prev_page_token";
      localObject = ((Bundle)localObject).getString(str);
      if (localObject != null) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\data\DataBufferUtils.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */