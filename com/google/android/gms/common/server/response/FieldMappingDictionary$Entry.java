package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class FieldMappingDictionary$Entry
  implements SafeParcelable
{
  public static final zzd CREATOR;
  final String className;
  final int versionCode;
  final ArrayList zzamY;
  
  static
  {
    zzd localzzd = new com/google/android/gms/common/server/response/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  FieldMappingDictionary$Entry(int paramInt, String paramString, ArrayList paramArrayList)
  {
    this.versionCode = paramInt;
    this.className = paramString;
    this.zzamY = paramArrayList;
  }
  
  FieldMappingDictionary$Entry(String paramString, Map paramMap)
  {
    this.versionCode = 1;
    this.className = paramString;
    ArrayList localArrayList = zzM(paramMap);
    this.zzamY = localArrayList;
  }
  
  private static ArrayList zzM(Map paramMap)
  {
    boolean bool;
    if (paramMap == null) {
      bool = false;
    }
    ArrayList localArrayList;
    for (Object localObject = null;; localObject = localArrayList)
    {
      return (ArrayList)localObject;
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      localObject = paramMap.keySet();
      Iterator localIterator = ((Set)localObject).iterator();
      for (;;)
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = (String)localIterator.next();
        FieldMappingDictionary.FieldMapPair localFieldMapPair = new com/google/android/gms/common/server/response/FieldMappingDictionary$FieldMapPair;
        FastJsonResponse.Field localField = (FastJsonResponse.Field)paramMap.get(localObject);
        localFieldMapPair.<init>((String)localObject, localField);
        localArrayList.add(localFieldMapPair);
      }
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  HashMap zzrC()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    int i = this.zzamY.size();
    int j = 0;
    Object localObject = null;
    for (int k = 0; k < i; k = j)
    {
      localObject = (FieldMappingDictionary.FieldMapPair)this.zzamY.get(k);
      String str = ((FieldMappingDictionary.FieldMapPair)localObject).key;
      localObject = ((FieldMappingDictionary.FieldMapPair)localObject).zzamZ;
      localHashMap.put(str, localObject);
      j = k + 1;
    }
    return localHashMap;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\response\FieldMappingDictionary$Entry.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */