package com.google.android.gms.drive.metadata.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.metadata.CustomPropertyKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AppVisibleCustomProperties
  implements SafeParcelable, Iterable
{
  public static final Parcelable.Creator CREATOR;
  public static final AppVisibleCustomProperties zzasK;
  final int mVersionCode;
  final List zzasL;
  
  static
  {
    Object localObject = new com/google/android/gms/drive/metadata/internal/zza;
    ((zza)localObject).<init>();
    CREATOR = (Parcelable.Creator)localObject;
    localObject = new com/google/android/gms/drive/metadata/internal/AppVisibleCustomProperties$zza;
    ((AppVisibleCustomProperties.zza)localObject).<init>();
    zzasK = ((AppVisibleCustomProperties.zza)localObject).zztA();
  }
  
  AppVisibleCustomProperties(int paramInt, Collection paramCollection)
  {
    this.mVersionCode = paramInt;
    zzx.zzz(paramCollection);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>(paramCollection);
    this.zzasL = localArrayList;
  }
  
  private AppVisibleCustomProperties(Collection paramCollection)
  {
    this(1, paramCollection);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool;
    if (this == paramObject) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      if (paramObject != null)
      {
        localObject1 = paramObject.getClass();
        localObject2 = getClass();
        if (localObject1 == localObject2) {}
      }
      else
      {
        bool = false;
        localObject1 = null;
        continue;
      }
      Object localObject1 = zztz();
      paramObject = (AppVisibleCustomProperties)paramObject;
      Object localObject2 = ((AppVisibleCustomProperties)paramObject).zztz();
      bool = ((Map)localObject1).equals(localObject2);
    }
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    List localList = this.zzasL;
    arrayOfObject[0] = localList;
    return zzw.hashCode(arrayOfObject);
  }
  
  public Iterator iterator()
  {
    return this.zzasL.iterator();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Map zztz()
  {
    HashMap localHashMap = new java/util/HashMap;
    int i = this.zzasL.size();
    localHashMap.<init>(i);
    Object localObject = this.zzasL;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (CustomProperty)localIterator.next();
      CustomPropertyKey localCustomPropertyKey = ((CustomProperty)localObject).zztB();
      localObject = ((CustomProperty)localObject).getValue();
      localHashMap.put(localCustomPropertyKey, localObject);
    }
    return Collections.unmodifiableMap(localHashMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\metadata\internal\AppVisibleCustomProperties.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */