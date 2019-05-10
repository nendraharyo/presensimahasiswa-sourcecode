package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzab
{
  private final List zzSJ;
  private final long zzSK;
  private final long zzSL;
  private final int zzSM;
  private final boolean zzSN;
  private final String zzSO;
  private final Map zzxA;
  
  public zzab(zzc paramzzc, Map paramMap, long paramLong, boolean paramBoolean)
  {
    this(paramzzc, paramMap, paramLong, paramBoolean, 0L, 0, null);
  }
  
  public zzab(zzc paramzzc, Map paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt)
  {
    this(paramzzc, paramMap, paramLong1, paramBoolean, paramLong2, paramInt, null);
  }
  
  public zzab(zzc paramzzc, Map paramMap, long paramLong1, boolean paramBoolean, long paramLong2, int paramInt, List paramList)
  {
    zzx.zzz(paramzzc);
    zzx.zzz(paramMap);
    this.zzSL = paramLong1;
    this.zzSN = paramBoolean;
    this.zzSK = paramLong2;
    this.zzSM = paramInt;
    if (paramList != null) {}
    HashMap localHashMap;
    Object localObject3;
    boolean bool2;
    for (Object localObject1 = paramList;; localObject1 = Collections.EMPTY_LIST)
    {
      this.zzSJ = ((List)localObject1);
      localObject1 = zzp(paramList);
      this.zzSO = ((String)localObject1);
      localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      localObject1 = paramMap.entrySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        localObject3 = ((Map.Entry)localObject1).getKey();
        bool2 = zzk(localObject3);
        if (bool2)
        {
          localObject3 = ((Map.Entry)localObject1).getKey();
          localObject3 = zza(paramzzc, localObject3);
          if (localObject3 != null)
          {
            localObject1 = ((Map.Entry)localObject1).getValue();
            localObject1 = zzb(paramzzc, localObject1);
            localHashMap.put(localObject3, localObject1);
          }
        }
      }
    }
    localObject1 = paramMap.entrySet();
    Object localObject2 = ((Set)localObject1).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject2).hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (Map.Entry)((Iterator)localObject2).next();
      localObject3 = ((Map.Entry)localObject1).getKey();
      bool2 = zzk(localObject3);
      if (!bool2)
      {
        localObject3 = ((Map.Entry)localObject1).getKey();
        localObject3 = zza(paramzzc, localObject3);
        if (localObject3 != null)
        {
          localObject1 = ((Map.Entry)localObject1).getValue();
          localObject1 = zzb(paramzzc, localObject1);
          localHashMap.put(localObject3, localObject1);
        }
      }
    }
    localObject1 = this.zzSO;
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject1);
    if (!bool1)
    {
      localObject2 = this.zzSO;
      zzam.zzc(localHashMap, "_v", (String)localObject2);
      localObject1 = this.zzSO;
      localObject2 = "ma4.0.0";
      bool1 = ((String)localObject1).equals(localObject2);
      if (!bool1)
      {
        localObject1 = this.zzSO;
        localObject2 = "ma4.0.1";
        bool1 = ((String)localObject1).equals(localObject2);
        if (!bool1) {}
      }
      else
      {
        localObject1 = "adid";
        localHashMap.remove(localObject1);
      }
    }
    localObject1 = Collections.unmodifiableMap(localHashMap);
    this.zzxA = ((Map)localObject1);
  }
  
  public static zzab zza(zzc paramzzc, zzab paramzzab, Map paramMap)
  {
    zzab localzzab = new com/google/android/gms/analytics/internal/zzab;
    long l1 = paramzzab.zzlr();
    boolean bool = paramzzab.zzlt();
    long l2 = paramzzab.zzlq();
    int i = paramzzab.zzlp();
    List localList = paramzzab.zzls();
    localzzab.<init>(paramzzc, paramMap, l1, bool, l2, i, localList);
    return localzzab;
  }
  
  private static String zza(zzc paramzzc, Object paramObject)
  {
    int i = 256;
    String str1;
    if (paramObject == null) {
      str1 = null;
    }
    for (;;)
    {
      return str1;
      str1 = paramObject.toString();
      Object localObject = "&";
      int j = str1.startsWith((String)localObject);
      if (j != 0)
      {
        j = 1;
        str1 = str1.substring(j);
      }
      int k = str1.length();
      if (k > i)
      {
        str1 = str1.substring(0, i);
        String str2 = "Hit param name is too long and will be trimmed";
        localObject = Integer.valueOf(k);
        paramzzc.zzc(str2, localObject, str1);
      }
      boolean bool = TextUtils.isEmpty(str1);
      if (bool) {
        str1 = null;
      }
    }
  }
  
  private static String zzb(zzc paramzzc, Object paramObject)
  {
    int i = 8192;
    if (paramObject == null) {}
    for (String str1 = "";; str1 = paramObject.toString())
    {
      int j = str1.length();
      if (j > i)
      {
        str1 = str1.substring(0, i);
        String str2 = "Hit param value is too long and will be trimmed";
        Integer localInteger = Integer.valueOf(j);
        paramzzc.zzc(str2, localInteger, str1);
      }
      return str1;
    }
  }
  
  private static boolean zzk(Object paramObject)
  {
    boolean bool;
    String str1;
    if (paramObject == null)
    {
      bool = false;
      str1 = null;
    }
    for (;;)
    {
      return bool;
      str1 = paramObject.toString();
      String str2 = "&";
      bool = str1.startsWith(str2);
    }
  }
  
  private String zzm(String paramString1, String paramString2)
  {
    zzx.zzcM(paramString1);
    String str1 = "&";
    boolean bool = paramString1.startsWith(str1);
    if (!bool)
    {
      bool = true;
      String str2 = "Short param name required";
      zzx.zzb(bool, str2);
      str1 = (String)this.zzxA.get(paramString1);
      if (str1 == null) {
        break label62;
      }
    }
    for (;;)
    {
      return str1;
      bool = false;
      str1 = null;
      break;
      label62:
      str1 = paramString2;
    }
  }
  
  private static String zzp(List paramList)
  {
    Object localObject1 = null;
    boolean bool1;
    if (paramList != null)
    {
      Iterator localIterator = paramList.iterator();
      boolean bool2;
      do
      {
        bool1 = localIterator.hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (Command)localIterator.next();
        String str1 = "appendVersion";
        String str2 = ((Command)localObject2).getId();
        bool2 = str1.equals(str2);
      } while (!bool2);
    }
    for (Object localObject2 = ((Command)localObject2).getValue();; localObject2 = null)
    {
      boolean bool3 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool3) {}
      for (;;)
      {
        return (String)localObject1;
        localObject1 = localObject2;
      }
      bool1 = false;
    }
  }
  
  public String toString()
  {
    long l1 = 0L;
    StringBuffer localStringBuffer = new java/lang/StringBuffer;
    localStringBuffer.<init>();
    Object localObject1 = localStringBuffer.append("ht=");
    long l2 = this.zzSL;
    ((StringBuffer)localObject1).append(l2);
    l2 = this.zzSK;
    boolean bool = l2 < l1;
    if (bool)
    {
      localObject1 = localStringBuffer.append(", dbId=");
      l2 = this.zzSK;
      ((StringBuffer)localObject1).append(l2);
    }
    l2 = this.zzSM;
    bool = l2 < l1;
    if (bool)
    {
      localObject1 = localStringBuffer.append(", appUID=");
      int i = this.zzSM;
      ((StringBuffer)localObject1).append(i);
    }
    localObject1 = new java/util/ArrayList;
    Object localObject2 = this.zzxA.keySet();
    ((ArrayList)localObject1).<init>((Collection)localObject2);
    Collections.sort((List)localObject1);
    localObject2 = ((List)localObject1).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject2).hasNext();
      if (!bool) {
        break;
      }
      localObject1 = (String)((Iterator)localObject2).next();
      localStringBuffer.append(", ");
      localStringBuffer.append((String)localObject1);
      localStringBuffer.append("=");
      Map localMap = this.zzxA;
      localObject1 = (String)localMap.get(localObject1);
      localStringBuffer.append((String)localObject1);
    }
    return localStringBuffer.toString();
  }
  
  public int zzlp()
  {
    return this.zzSM;
  }
  
  public long zzlq()
  {
    return this.zzSK;
  }
  
  public long zzlr()
  {
    return this.zzSL;
  }
  
  public List zzls()
  {
    return this.zzSJ;
  }
  
  public boolean zzlt()
  {
    return this.zzSN;
  }
  
  public long zzlu()
  {
    return zzam.zzbt(zzm("_s", "0"));
  }
  
  public String zzlv()
  {
    return zzm("_m", "");
  }
  
  public Map zzn()
  {
    return this.zzxA;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzab.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */