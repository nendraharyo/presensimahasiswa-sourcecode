package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.PlacesLived;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$PlacesLivedEntity
  extends FastSafeParcelableJsonResponse
  implements Person.PlacesLived
{
  public static final zzi CREATOR;
  private static final HashMap zzbeM;
  String mValue;
  final int mVersionCode;
  final Set zzbeN;
  boolean zzbgr;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzi;
    ((zzi)localObject).<init>();
    CREATOR = (zzi)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzk("primary", 2);
    ((HashMap)localObject).put("primary", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("value", 3);
    ((HashMap)localObject).put("value", localField);
  }
  
  public PersonEntity$PlacesLivedEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  PersonEntity$PlacesLivedEntity(Set paramSet, int paramInt, boolean paramBoolean, String paramString)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt;
    this.zzbgr = paramBoolean;
    this.mValue = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof PlacesLivedEntity;
    Object localObject1;
    if (!bool2)
    {
      bool2 = false;
      localObject1 = null;
    }
    for (;;)
    {
      return bool2;
      if (this == paramObject)
      {
        bool2 = bool1;
      }
      else
      {
        paramObject = (PlacesLivedEntity)paramObject;
        localObject1 = zzbeM.values();
        Iterator localIterator = ((Collection)localObject1).iterator();
        label144:
        do
        {
          do
          {
            bool2 = localIterator.hasNext();
            if (!bool2) {
              break label163;
            }
            localObject1 = (FastJsonResponse.Field)localIterator.next();
            boolean bool3 = zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break label144;
            }
            bool3 = ((PlacesLivedEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((PlacesLivedEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((PlacesLivedEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public boolean hasPrimary()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasValue()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(3);
    return localSet.contains(localInteger);
  }
  
  public int hashCode()
  {
    boolean bool1 = false;
    Object localObject = null;
    Iterator localIterator = zzbeM.values().iterator();
    int j = 0;
    bool1 = localIterator.hasNext();
    if (bool1)
    {
      localObject = (FastJsonResponse.Field)localIterator.next();
      boolean bool2 = zza((FastJsonResponse.Field)localObject);
      if (!bool2) {
        break label88;
      }
      int k = ((FastJsonResponse.Field)localObject).zzrs();
      j += k;
      localObject = zzb((FastJsonResponse.Field)localObject);
    }
    label88:
    for (int i = localObject.hashCode() + j;; i = j)
    {
      j = i;
      break;
      return j;
    }
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public boolean isPrimary()
  {
    return this.zzbgr;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzi.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public PlacesLivedEntity zzFx()
  {
    return this;
  }
  
  protected boolean zza(FastJsonResponse.Field paramField)
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(paramField.zzrs());
    return localSet.contains(localInteger);
  }
  
  protected Object zzb(FastJsonResponse.Field paramField)
  {
    int i = paramField.zzrs();
    boolean bool;
    switch (i)
    {
    default: 
      localObject1 = new java/lang/IllegalStateException;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = ((StringBuilder)localObject2).append("Unknown safe parcelable id=");
      int j = paramField.zzrs();
      localObject2 = j;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 2: 
      bool = this.zzbgr;
    }
    for (Object localObject1 = Boolean.valueOf(bool);; localObject1 = this.mValue) {
      return localObject1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$PlacesLivedEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */