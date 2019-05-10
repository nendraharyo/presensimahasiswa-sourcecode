package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse.zza;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public final class StringToIntConverter
  implements SafeParcelable, FastJsonResponse.zza
{
  public static final zzb CREATOR;
  private final int mVersionCode;
  private final HashMap zzamG;
  private final HashMap zzamH;
  private final ArrayList zzamI;
  
  static
  {
    zzb localzzb = new com/google/android/gms/common/server/converter/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  public StringToIntConverter()
  {
    this.mVersionCode = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzamG = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzamH = localHashMap;
    this.zzamI = null;
  }
  
  StringToIntConverter(int paramInt, ArrayList paramArrayList)
  {
    this.mVersionCode = paramInt;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzamG = localHashMap;
    localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.zzamH = localHashMap;
    this.zzamI = null;
    zzd(paramArrayList);
  }
  
  private void zzd(ArrayList paramArrayList)
  {
    Iterator localIterator = paramArrayList.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      StringToIntConverter.Entry localEntry = (StringToIntConverter.Entry)localIterator.next();
      String str = localEntry.zzamJ;
      int i = localEntry.zzamK;
      zzh(str, i);
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzb(Integer paramInteger)
  {
    String str1 = (String)this.zzamH.get(paramInteger);
    if (str1 == null)
    {
      HashMap localHashMap = this.zzamG;
      String str2 = "gms_unknown";
      boolean bool = localHashMap.containsKey(str2);
      if (bool) {
        str1 = "gms_unknown";
      }
    }
    return str1;
  }
  
  public StringToIntConverter zzh(String paramString, int paramInt)
  {
    HashMap localHashMap = this.zzamG;
    Integer localInteger = Integer.valueOf(paramInt);
    localHashMap.put(paramString, localInteger);
    localHashMap = this.zzamH;
    localInteger = Integer.valueOf(paramInt);
    localHashMap.put(localInteger, paramString);
    return this;
  }
  
  ArrayList zzri()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject = this.zzamG.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      StringToIntConverter.Entry localEntry = new com/google/android/gms/common/server/converter/StringToIntConverter$Entry;
      Integer localInteger = (Integer)this.zzamG.get(localObject);
      int i = localInteger.intValue();
      localEntry.<init>((String)localObject, i);
      localArrayList.add(localEntry);
    }
    return localArrayList;
  }
  
  public int zzrj()
  {
    return 7;
  }
  
  public int zzrk()
  {
    return 0;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\server\converter\StringToIntConverter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */