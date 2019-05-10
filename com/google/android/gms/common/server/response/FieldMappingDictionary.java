package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FieldMappingDictionary
  implements SafeParcelable
{
  public static final zzc CREATOR;
  private final int mVersionCode;
  private final HashMap zzamV;
  private final ArrayList zzamW;
  private final String zzamX;
  
  static
  {
    zzc localzzc = new com/google/android/gms/common/server/response/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  FieldMappingDictionary(int paramInt, ArrayList paramArrayList, String paramString)
  {
    this.mVersionCode = paramInt;
    this.zzamW = null;
    Object localObject = zze(paramArrayList);
    this.zzamV = ((HashMap)localObject);
    localObject = (String)zzx.zzz(paramString);
    this.zzamX = ((String)localObject);
    zzry();
  }
  
  public FieldMappingDictionary(Class paramClass)
  {
    this.mVersionCode = 1;
    this.zzamW = null;
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzamV = ((HashMap)localObject);
    localObject = paramClass.getCanonicalName();
    this.zzamX = ((String)localObject);
  }
  
  private static HashMap zze(ArrayList paramArrayList)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i = paramArrayList.size();
    int j = 0;
    Object localObject = null;
    for (int k = 0; k < i; k = j)
    {
      localObject = (FieldMappingDictionary.Entry)paramArrayList.get(k);
      String str = ((FieldMappingDictionary.Entry)localObject).className;
      localObject = ((FieldMappingDictionary.Entry)localObject).zzrC();
      localHashMap.put(str, localObject);
      j = k + 1;
    }
    return localHashMap;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder1 = new java/lang/StringBuilder;
    localStringBuilder1.<init>();
    Object localObject1 = this.zzamV.keySet();
    Iterator localIterator1 = ((Set)localObject1).iterator();
    boolean bool1 = localIterator1.hasNext();
    if (bool1)
    {
      localObject1 = (String)localIterator1.next();
      localStringBuilder1.append((String)localObject1).append(":\n");
      localObject1 = (Map)this.zzamV.get(localObject1);
      Object localObject2 = ((Map)localObject1).keySet();
      Iterator localIterator2 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)localIterator2.next();
        StringBuilder localStringBuilder2 = localStringBuilder1.append("  ").append((String)localObject2);
        String str = ": ";
        localStringBuilder2.append(str);
        localObject2 = ((Map)localObject1).get(localObject2);
        localStringBuilder1.append(localObject2);
      }
    }
    return localStringBuilder1.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public void zza(Class paramClass, Map paramMap)
  {
    HashMap localHashMap = this.zzamV;
    String str = paramClass.getCanonicalName();
    localHashMap.put(str, paramMap);
  }
  
  public boolean zzb(Class paramClass)
  {
    HashMap localHashMap = this.zzamV;
    String str = paramClass.getCanonicalName();
    return localHashMap.containsKey(str);
  }
  
  public Map zzcR(String paramString)
  {
    return (Map)this.zzamV.get(paramString);
  }
  
  ArrayList zzrA()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzamV.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      FieldMappingDictionary.Entry localEntry = new com/google/android/gms/common/server/response/FieldMappingDictionary$Entry;
      Map localMap = (Map)this.zzamV.get(localObject);
      localEntry.<init>((String)localObject, localMap);
      localArrayList.add(localEntry);
    }
    return localArrayList;
  }
  
  public String zzrB()
  {
    return this.zzamX;
  }
  
  public void zzry()
  {
    Object localObject1 = this.zzamV.keySet();
    Iterator localIterator1 = ((Set)localObject1).iterator();
    boolean bool1 = localIterator1.hasNext();
    if (bool1)
    {
      localObject1 = (String)localIterator1.next();
      localObject1 = (Map)this.zzamV.get(localObject1);
      Object localObject2 = ((Map)localObject1).keySet();
      Iterator localIterator2 = ((Set)localObject2).iterator();
      for (;;)
      {
        boolean bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        localObject2 = (String)localIterator2.next();
        localObject2 = (FastJsonResponse.Field)((Map)localObject1).get(localObject2);
        ((FastJsonResponse.Field)localObject2).zza(this);
      }
    }
  }
  
  public void zzrz()
  {
    Object localObject1 = this.zzamV.keySet();
    Iterator localIterator1 = ((Set)localObject1).iterator();
    for (;;)
    {
      boolean bool1 = localIterator1.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (String)localIterator1.next();
      Object localObject2 = (Map)this.zzamV.get(localObject1);
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      Object localObject3 = ((Map)localObject2).keySet();
      Iterator localIterator2 = ((Set)localObject3).iterator();
      for (;;)
      {
        boolean bool2 = localIterator2.hasNext();
        if (!bool2) {
          break;
        }
        localObject3 = (String)localIterator2.next();
        FastJsonResponse.Field localField = ((FastJsonResponse.Field)((Map)localObject2).get(localObject3)).zzro();
        localHashMap.put(localObject3, localField);
      }
      localObject2 = this.zzamV;
      ((HashMap)localObject2).put(localObject1, localHashMap);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\FieldMappingDictionary.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */