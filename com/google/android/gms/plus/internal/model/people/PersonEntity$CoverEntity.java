package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Cover.CoverInfo;
import com.google.android.gms.plus.model.people.Person.Cover.CoverPhoto;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$CoverEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Cover
{
  public static final zzc CREATOR;
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  PersonEntity.CoverEntity.CoverInfoEntity zzbgg;
  PersonEntity.CoverEntity.CoverPhotoEntity zzbgh;
  int zzbgi;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzc;
    ((zzc)localObject).<init>();
    CREATOR = (zzc)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zza("coverInfo", 2, PersonEntity.CoverEntity.CoverInfoEntity.class);
    ((HashMap)localObject).put("coverInfo", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("coverPhoto", 3, PersonEntity.CoverEntity.CoverPhotoEntity.class);
    ((HashMap)localObject).put("coverPhoto", localField);
    localObject = zzbeM;
    StringToIntConverter localStringToIntConverter = new com/google/android/gms/common/server/converter/StringToIntConverter;
    localStringToIntConverter.<init>();
    localStringToIntConverter = localStringToIntConverter.zzh("banner", 0);
    localField = FastJsonResponse.Field.zza("layout", 4, localStringToIntConverter, false);
    ((HashMap)localObject).put("layout", localField);
  }
  
  public PersonEntity$CoverEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  PersonEntity$CoverEntity(Set paramSet, int paramInt1, PersonEntity.CoverEntity.CoverInfoEntity paramCoverInfoEntity, PersonEntity.CoverEntity.CoverPhotoEntity paramCoverPhotoEntity, int paramInt2)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt1;
    this.zzbgg = paramCoverInfoEntity;
    this.zzbgh = paramCoverPhotoEntity;
    this.zzbgi = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof CoverEntity;
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
        paramObject = (CoverEntity)paramObject;
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
            bool3 = ((CoverEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((CoverEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((CoverEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public Person.Cover.CoverInfo getCoverInfo()
  {
    return this.zzbgg;
  }
  
  public Person.Cover.CoverPhoto getCoverPhoto()
  {
    return this.zzbgh;
  }
  
  public int getLayout()
  {
    return this.zzbgi;
  }
  
  public boolean hasCoverInfo()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasCoverPhoto()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(3);
    return localSet.contains(localInteger);
  }
  
  public boolean hasLayout()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
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
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public CoverEntity zzFr()
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
    Object localObject1;
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
      localObject1 = this.zzbgg;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzbgh;
      continue;
      i = this.zzbgi;
      localObject1 = Integer.valueOf(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$CoverEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */