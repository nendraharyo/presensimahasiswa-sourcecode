package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Name;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$NameEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Name
{
  public static final zzg CREATOR;
  private static final HashMap zzbeM;
  final int mVersionCode;
  final Set zzbeN;
  String zzbfl;
  String zzbfo;
  String zzbgl;
  String zzbgm;
  String zzbgn;
  String zzbgo;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzg;
    ((zzg)localObject).<init>();
    CREATOR = (zzg)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzl("familyName", 2);
    ((HashMap)localObject).put("familyName", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("formatted", 3);
    ((HashMap)localObject).put("formatted", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("givenName", 4);
    ((HashMap)localObject).put("givenName", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("honorificPrefix", 5);
    ((HashMap)localObject).put("honorificPrefix", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("honorificSuffix", 6);
    ((HashMap)localObject).put("honorificSuffix", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("middleName", 7);
    ((HashMap)localObject).put("middleName", localField);
  }
  
  public PersonEntity$NameEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  PersonEntity$NameEntity(Set paramSet, int paramInt, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt;
    this.zzbfl = paramString1;
    this.zzbgl = paramString2;
    this.zzbfo = paramString3;
    this.zzbgm = paramString4;
    this.zzbgn = paramString5;
    this.zzbgo = paramString6;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof NameEntity;
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
        paramObject = (NameEntity)paramObject;
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
            bool3 = ((NameEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((NameEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((NameEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getFamilyName()
  {
    return this.zzbfl;
  }
  
  public String getFormatted()
  {
    return this.zzbgl;
  }
  
  public String getGivenName()
  {
    return this.zzbfo;
  }
  
  public String getHonorificPrefix()
  {
    return this.zzbgm;
  }
  
  public String getHonorificSuffix()
  {
    return this.zzbgn;
  }
  
  public String getMiddleName()
  {
    return this.zzbgo;
  }
  
  public boolean hasFamilyName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasFormatted()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(3);
    return localSet.contains(localInteger);
  }
  
  public boolean hasGivenName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
    return localSet.contains(localInteger);
  }
  
  public boolean hasHonorificPrefix()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    return localSet.contains(localInteger);
  }
  
  public boolean hasHonorificSuffix()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    return localSet.contains(localInteger);
  }
  
  public boolean hasMiddleName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(7);
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
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public NameEntity zzFv()
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
      localObject1 = this.zzbfl;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzbgl;
      continue;
      localObject1 = this.zzbfo;
      continue;
      localObject1 = this.zzbgm;
      continue;
      localObject1 = this.zzbgn;
      continue;
      localObject1 = this.zzbgo;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$NameEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */