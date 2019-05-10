package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DataLayer
{
  public static final String EVENT_KEY = "event";
  public static final Object OBJECT_NOT_PRESENT;
  static final String[] zzbir = "gtm.lifetime".toString().split("\\.");
  private static final Pattern zzbis = Pattern.compile("(\\d+)\\s*([smhd]?)");
  private final ConcurrentHashMap zzbit;
  private final Map zzbiu;
  private final ReentrantLock zzbiv;
  private final LinkedList zzbiw;
  private final DataLayer.zzc zzbix;
  private final CountDownLatch zzbiy;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OBJECT_NOT_PRESENT = localObject;
  }
  
  DataLayer()
  {
    this(local1);
  }
  
  DataLayer(DataLayer.zzc paramzzc)
  {
    this.zzbix = paramzzc;
    Object localObject = new java/util/concurrent/ConcurrentHashMap;
    ((ConcurrentHashMap)localObject).<init>();
    this.zzbit = ((ConcurrentHashMap)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzbiu = ((Map)localObject);
    localObject = new java/util/concurrent/locks/ReentrantLock;
    ((ReentrantLock)localObject).<init>();
    this.zzbiv = ((ReentrantLock)localObject);
    localObject = new java/util/LinkedList;
    ((LinkedList)localObject).<init>();
    this.zzbiw = ((LinkedList)localObject);
    localObject = new java/util/concurrent/CountDownLatch;
    ((CountDownLatch)localObject).<init>(1);
    this.zzbiy = ((CountDownLatch)localObject);
    zzGn();
  }
  
  public static List listOf(Object... paramVarArgs)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramVarArgs.length;
      if (i >= j) {
        break;
      }
      Object localObject = paramVarArgs[i];
      localArrayList.add(localObject);
      i += 1;
    }
    return localArrayList;
  }
  
  public static Map mapOf(Object... paramVarArgs)
  {
    int i = paramVarArgs.length % 2;
    if (i != 0)
    {
      localObject1 = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject1).<init>("expected even number of key-value pairs");
      throw ((Throwable)localObject1);
    }
    Object localObject2 = new java/util/HashMap;
    ((HashMap)localObject2).<init>();
    i = 0;
    Object localObject1 = null;
    int k = 0;
    Object localObject3 = null;
    for (;;)
    {
      i = paramVarArgs.length;
      if (k >= i) {
        break;
      }
      localObject1 = paramVarArgs[k];
      boolean bool = localObject1 instanceof String;
      if (!bool)
      {
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("key is not a string: ");
        localObject3 = paramVarArgs[k];
        localObject3 = localObject3;
        ((IllegalArgumentException)localObject1).<init>((String)localObject3);
        throw ((Throwable)localObject1);
      }
      localObject1 = (String)paramVarArgs[k];
      int m = k + 1;
      Object localObject4 = paramVarArgs[m];
      ((Map)localObject2).put(localObject1, localObject4);
      int j = k + 2;
      k = j;
    }
    return (Map)localObject2;
  }
  
  private void zzGn()
  {
    DataLayer.zzc localzzc = this.zzbix;
    DataLayer.2 local2 = new com/google/android/gms/tagmanager/DataLayer$2;
    local2.<init>(this);
    localzzc.zza(local2);
  }
  
  private void zzGo()
  {
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      localObject = (Map)this.zzbiw.poll();
      if (localObject != null)
      {
        zzX((Map)localObject);
        i = j + 1;
        j = 500;
        if (i > j)
        {
          this.zzbiw.clear();
          localObject = new java/lang/RuntimeException;
          ((RuntimeException)localObject).<init>("Seems like an infinite loop of pushing to the data layer");
          throw ((Throwable)localObject);
        }
      }
      else
      {
        return;
      }
    }
  }
  
  private void zzS(Map paramMap)
  {
    Object localObject1 = this.zzbiv;
    ((ReentrantLock)localObject1).lock();
    try
    {
      localObject1 = this.zzbiw;
      ((LinkedList)localObject1).offer(paramMap);
      localObject1 = this.zzbiv;
      int i = ((ReentrantLock)localObject1).getHoldCount();
      int j = 1;
      if (i == j) {
        zzGo();
      }
      zzT(paramMap);
      return;
    }
    finally
    {
      this.zzbiv.unlock();
    }
  }
  
  private void zzT(Map paramMap)
  {
    Long localLong = zzU(paramMap);
    if (localLong == null) {}
    for (;;)
    {
      return;
      List localList = zzW(paramMap);
      localList.remove("gtm.lifetime");
      DataLayer.zzc localzzc = this.zzbix;
      long l = localLong.longValue();
      localzzc.zza(localList, l);
    }
  }
  
  private Long zzU(Map paramMap)
  {
    Object localObject = zzV(paramMap);
    if (localObject == null) {}
    for (localObject = null;; localObject = zzfY(localObject.toString())) {
      return (Long)localObject;
    }
  }
  
  private Object zzV(Map paramMap)
  {
    String[] arrayOfString = zzbir;
    int i = arrayOfString.length;
    int j = 0;
    int k = 0;
    for (Map localMap = paramMap;; localMap = paramMap)
    {
      String str;
      if (k < i)
      {
        str = arrayOfString[k];
        boolean bool = localMap instanceof Map;
        if (!bool)
        {
          j = 0;
          localMap = null;
        }
      }
      else
      {
        return localMap;
      }
      paramMap = ((Map)localMap).get(str);
      j = k + 1;
      k = j;
    }
  }
  
  private List zzW(Map paramMap)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    zza(paramMap, "", localArrayList);
    return localArrayList;
  }
  
  private void zzX(Map paramMap)
  {
    synchronized (this.zzbiu)
    {
      Object localObject1 = paramMap.keySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (String)localObject1;
        Object localObject3 = paramMap.get(localObject1);
        localObject1 = zzn((String)localObject1, localObject3);
        localObject3 = this.zzbiu;
        zzd((Map)localObject1, (Map)localObject3);
      }
    }
    zzY(paramMap);
  }
  
  private void zzY(Map paramMap)
  {
    Object localObject = this.zzbit.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (DataLayer.zzb)localIterator.next();
      ((DataLayer.zzb)localObject).zzQ(paramMap);
    }
  }
  
  private void zza(Map paramMap, String paramString, Collection paramCollection)
  {
    Object localObject1 = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)localIterator.next();
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      Object localObject3 = ((StringBuilder)localObject2).append(paramString);
      int i = paramString.length();
      if (i == 0) {}
      for (localObject2 = "";; localObject2 = ".")
      {
        localObject3 = ((StringBuilder)localObject3).append((String)localObject2);
        localObject2 = (String)((Map.Entry)localObject1).getKey();
        localObject2 = (String)localObject2;
        localObject3 = ((Map.Entry)localObject1).getValue();
        bool2 = localObject3 instanceof Map;
        if (!bool2) {
          break label162;
        }
        localObject1 = (Map)((Map.Entry)localObject1).getValue();
        zza((Map)localObject1, (String)localObject2, paramCollection);
        break;
      }
      label162:
      localObject3 = "gtm.lifetime";
      boolean bool2 = ((String)localObject2).equals(localObject3);
      if (!bool2)
      {
        localObject3 = new com/google/android/gms/tagmanager/DataLayer$zza;
        localObject1 = ((Map.Entry)localObject1).getValue();
        ((DataLayer.zza)localObject3).<init>((String)localObject2, localObject1);
        paramCollection.add(localObject3);
      }
    }
  }
  
  static Long zzfY(String paramString)
  {
    long l1 = 0L;
    Long localLong = null;
    long l2 = 1000L;
    long l3 = 60;
    Object localObject1 = zzbis.matcher(paramString);
    int i = ((Matcher)localObject1).matches();
    String str1;
    if (i == 0)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      str1 = "unknown _lifetime: ";
      localObject1 = str1 + paramString;
      zzbg.zzaJ((String)localObject1);
    }
    for (;;)
    {
      return localLong;
      i = 1;
      try
      {
        str1 = ((Matcher)localObject1).group(i);
        l4 = Long.parseLong(str1);
        boolean bool = l4 < l1;
        if (!bool)
        {
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          str1 = "non-positive _lifetime: ";
          localObject1 = str1 + paramString;
          zzbg.zzaJ((String)localObject1);
        }
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Object localObject2;
        for (;;)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          String str2 = "illegal number in _lifetime value: ";
          localObject2 = str2 + paramString;
          zzbg.zzaK((String)localObject2);
          l4 = l1;
        }
        localObject1 = ((Matcher)localObject1).group(2);
        int j = ((String)localObject1).length();
        if (j == 0)
        {
          localLong = Long.valueOf(l4);
          continue;
        }
        j = 0;
        int k = ((String)localObject1).charAt(0);
        switch (k)
        {
        default: 
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          localObject2 = "unknown units in _lifetime: ";
          localObject1 = (String)localObject2 + paramString;
          zzbg.zzaK((String)localObject1);
        }
      }
      continue;
      long l5 = l4 * l2;
      localLong = Long.valueOf(l5);
      continue;
      l5 = l4 * l2 * l3;
      localLong = Long.valueOf(l5);
      continue;
      l5 = l4 * l2 * l3 * l3;
      localLong = Long.valueOf(l5);
      continue;
      l5 = l4 * l2 * l3 * l3;
      long l4 = 24;
      l5 *= l4;
      localLong = Long.valueOf(l5);
    }
  }
  
  public Object get(String paramString)
  {
    synchronized (this.zzbiu)
    {
      Map localMap2 = this.zzbiu;
      Object localObject1 = "\\.";
      String[] arrayOfString = paramString.split((String)localObject1);
      int i = arrayOfString.length;
      int j = 0;
      localObject1 = localMap2;
      int k = 0;
      localMap2 = null;
      while (k < i)
      {
        Object localObject3 = arrayOfString[k];
        boolean bool = localObject1 instanceof Map;
        if (!bool) {
          j = 0;
        }
        for (localObject1 = null;; localObject1 = null)
        {
          return localObject1;
          localObject1 = (Map)localObject1;
          localObject3 = ((Map)localObject1).get(localObject3);
          if (localObject3 != null) {
            break;
          }
          j = 0;
        }
        j = k + 1;
        k = j;
        localObject1 = localObject3;
      }
    }
  }
  
  public void push(String paramString, Object paramObject)
  {
    Map localMap = zzn(paramString, paramObject);
    push(localMap);
  }
  
  public void push(Map paramMap)
  {
    try
    {
      CountDownLatch localCountDownLatch = this.zzbiy;
      localCountDownLatch.await();
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;)
      {
        String str = "DataLayer.push: unexpected InterruptedException";
        zzbg.zzaK(str);
      }
    }
    zzS(paramMap);
  }
  
  public void pushEvent(String paramString, Map paramMap)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(paramMap);
    localHashMap.put("event", paramString);
    push(localHashMap);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder;
    synchronized (this.zzbiu)
    {
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      Object localObject1 = this.zzbiu;
      localObject1 = ((Map)localObject1).entrySet();
      Iterator localIterator = ((Set)localObject1).iterator();
      boolean bool = localIterator.hasNext();
      if (bool)
      {
        localObject1 = localIterator.next();
        localObject1 = (Map.Entry)localObject1;
        String str2 = "{\n\tKey: %s\n\tValue: %s\n}\n";
        int i = 2;
        Object[] arrayOfObject = new Object[i];
        int j = 0;
        Object localObject3 = ((Map.Entry)localObject1).getKey();
        arrayOfObject[0] = localObject3;
        j = 1;
        localObject1 = ((Map.Entry)localObject1).getValue();
        arrayOfObject[j] = localObject1;
        localObject1 = String.format(str2, arrayOfObject);
        localStringBuilder.append((String)localObject1);
      }
    }
    String str1 = localStringBuilder.toString();
    return str1;
  }
  
  void zza(DataLayer.zzb paramzzb)
  {
    ConcurrentHashMap localConcurrentHashMap = this.zzbit;
    Integer localInteger = Integer.valueOf(0);
    localConcurrentHashMap.put(paramzzb, localInteger);
  }
  
  void zzb(List paramList1, List paramList2)
  {
    for (;;)
    {
      i = paramList2.size();
      int j = paramList1.size();
      if (i >= j) {
        break;
      }
      i = 0;
      localObject1 = null;
      paramList2.add(null);
    }
    int i = 0;
    Object localObject1 = null;
    int k = 0;
    i = paramList1.size();
    if (k < i)
    {
      localObject1 = paramList1.get(k);
      boolean bool = localObject1 instanceof List;
      Object localObject2;
      if (bool)
      {
        localObject2 = paramList2.get(k);
        bool = localObject2 instanceof List;
        if (!bool)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          paramList2.set(k, localObject2);
        }
        localObject1 = (List)localObject1;
        localObject2 = (List)paramList2.get(k);
        zzb((List)localObject1, (List)localObject2);
      }
      for (;;)
      {
        i = k + 1;
        k = i;
        break;
        bool = localObject1 instanceof Map;
        if (bool)
        {
          localObject2 = paramList2.get(k);
          bool = localObject2 instanceof Map;
          if (!bool)
          {
            localObject2 = new java/util/HashMap;
            ((HashMap)localObject2).<init>();
            paramList2.set(k, localObject2);
          }
          localObject1 = (Map)localObject1;
          localObject2 = (Map)paramList2.get(k);
          zzd((Map)localObject1, (Map)localObject2);
        }
        else
        {
          localObject2 = OBJECT_NOT_PRESENT;
          if (localObject1 != localObject2) {
            paramList2.set(k, localObject1);
          }
        }
      }
    }
  }
  
  void zzd(Map paramMap1, Map paramMap2)
  {
    Object localObject1 = paramMap1.keySet();
    Iterator localIterator = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator.next();
      Object localObject2 = paramMap1.get(localObject1);
      boolean bool2 = localObject2 instanceof List;
      Object localObject3;
      if (bool2)
      {
        localObject3 = paramMap2.get(localObject1);
        bool2 = localObject3 instanceof List;
        if (!bool2)
        {
          localObject3 = new java/util/ArrayList;
          ((ArrayList)localObject3).<init>();
          paramMap2.put(localObject1, localObject3);
        }
        localObject2 = (List)localObject2;
        localObject1 = (List)paramMap2.get(localObject1);
        zzb((List)localObject2, (List)localObject1);
      }
      else
      {
        bool2 = localObject2 instanceof Map;
        if (bool2)
        {
          localObject3 = paramMap2.get(localObject1);
          bool2 = localObject3 instanceof Map;
          if (!bool2)
          {
            localObject3 = new java/util/HashMap;
            ((HashMap)localObject3).<init>();
            paramMap2.put(localObject1, localObject3);
          }
          localObject2 = (Map)localObject2;
          localObject1 = (Map)paramMap2.get(localObject1);
          zzd((Map)localObject2, (Map)localObject1);
        }
        else
        {
          paramMap2.put(localObject1, localObject2);
        }
      }
    }
  }
  
  void zzfX(String paramString)
  {
    push(paramString, null);
    this.zzbix.zzfZ(paramString);
  }
  
  Map zzn(String paramString, Object paramObject)
  {
    HashMap localHashMap1 = new java/util/HashMap;
    localHashMap1.<init>();
    String[] arrayOfString = paramString.toString().split("\\.");
    int i = 0;
    String str1 = null;
    HashMap localHashMap2;
    for (Object localObject = localHashMap1;; localObject = localHashMap2)
    {
      int j = arrayOfString.length + -1;
      if (i >= j) {
        break;
      }
      localHashMap2 = new java/util/HashMap;
      localHashMap2.<init>();
      String str2 = arrayOfString[i];
      ((Map)localObject).put(str2, localHashMap2);
      i += 1;
    }
    i = arrayOfString.length + -1;
    str1 = arrayOfString[i];
    ((Map)localObject).put(str1, paramObject);
    return localHashMap1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\DataLayer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */