package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Image;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$ImageEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Image
{
  public static final zzf CREATOR;
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzF;
  final Set zzbeN;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzf;
    ((zzf)localObject).<init>();
    CREATOR = (zzf)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzl("url", 2);
    ((HashMap)localObject).put("url", localField);
  }
  
  public PersonEntity$ImageEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  public PersonEntity$ImageEntity(String paramString)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzbeN = ((Set)localObject);
    this.mVersionCode = 1;
    this.zzF = paramString;
    localObject = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    ((Set)localObject).add(localInteger);
  }
  
  PersonEntity$ImageEntity(Set paramSet, int paramInt, String paramString)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt;
    this.zzF = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof ImageEntity;
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
        paramObject = (ImageEntity)paramObject;
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
            bool3 = ((ImageEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((ImageEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((ImageEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getUrl()
  {
    return this.zzF;
  }
  
  public boolean hasUrl()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
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
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public ImageEntity zzFu()
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
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("Unknown safe parcelable id=");
      int j = paramField.zzrs();
      localObject = j;
      localIllegalStateException.<init>((String)localObject);
      throw localIllegalStateException;
    }
    return this.zzF;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$ImageEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */