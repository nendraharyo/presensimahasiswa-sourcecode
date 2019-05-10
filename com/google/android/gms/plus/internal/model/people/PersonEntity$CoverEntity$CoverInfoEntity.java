package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$CoverEntity$CoverInfoEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Cover.CoverInfo
{
  public static final zzd CREATOR;
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  int zzbgj;
  int zzbgk;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzd;
    ((zzd)localObject).<init>();
    CREATOR = (zzd)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzi("leftImageOffset", 2);
    ((HashMap)localObject).put("leftImageOffset", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzi("topImageOffset", 3);
    ((HashMap)localObject).put("topImageOffset", localField);
  }
  
  public PersonEntity$CoverEntity$CoverInfoEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  PersonEntity$CoverEntity$CoverInfoEntity(Set paramSet, int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt1;
    this.zzbgj = paramInt2;
    this.zzbgk = paramInt3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof CoverInfoEntity;
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
        paramObject = (CoverInfoEntity)paramObject;
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
            bool3 = ((CoverInfoEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((CoverInfoEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((CoverInfoEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public int getLeftImageOffset()
  {
    return this.zzbgj;
  }
  
  public int getTopImageOffset()
  {
    return this.zzbgk;
  }
  
  public boolean hasLeftImageOffset()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasTopImageOffset()
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
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public CoverInfoEntity zzFs()
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
      i = this.zzbgj;
    }
    for (Object localObject1 = Integer.valueOf(i);; localObject1 = Integer.valueOf(i))
    {
      return localObject1;
      i = this.zzbgk;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$CoverEntity$CoverInfoEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */