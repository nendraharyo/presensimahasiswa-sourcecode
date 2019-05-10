package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Urls;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$UrlsEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Urls
{
  public static final zzj CREATOR;
  private static final HashMap zzbeM;
  String mValue;
  final int mVersionCode;
  String zzaUO;
  int zzabB;
  final Set zzbeN;
  private final int zzbgs = 4;
  
  static
  {
    int i = 6;
    int j = 5;
    int k = 4;
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzj;
    ((zzj)localObject).<init>();
    CREATOR = (zzj)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzl("label", j);
    ((HashMap)localObject).put("label", localField);
    localObject = zzbeM;
    StringToIntConverter localStringToIntConverter = new com/google/android/gms/common/server/converter/StringToIntConverter;
    localStringToIntConverter.<init>();
    localStringToIntConverter = localStringToIntConverter.zzh("home", 0).zzh("work", 1).zzh("blog", 2).zzh("profile", 3).zzh("other", k).zzh("otherProfile", j).zzh("contributor", i).zzh("website", 7);
    localField = FastJsonResponse.Field.zza("type", i, localStringToIntConverter, false);
    ((HashMap)localObject).put("type", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("value", k);
    ((HashMap)localObject).put("value", localField);
  }
  
  public PersonEntity$UrlsEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  PersonEntity$UrlsEntity(Set paramSet, int paramInt1, String paramString1, int paramInt2, String paramString2, int paramInt3)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt1;
    this.zzaUO = paramString1;
    this.zzabB = paramInt2;
    this.mValue = paramString2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof UrlsEntity;
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
        paramObject = (UrlsEntity)paramObject;
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
            bool3 = ((UrlsEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((UrlsEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((UrlsEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getLabel()
  {
    return this.zzaUO;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public String getValue()
  {
    return this.mValue;
  }
  
  public boolean hasLabel()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    return localSet.contains(localInteger);
  }
  
  public boolean hasType()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    return localSet.contains(localInteger);
  }
  
  public boolean hasValue()
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
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public int zzFy()
  {
    return 4;
  }
  
  public UrlsEntity zzFz()
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
    case 5: 
      localObject1 = this.zzaUO;
    }
    for (;;)
    {
      return localObject1;
      i = this.zzabB;
      localObject1 = Integer.valueOf(i);
      continue;
      localObject1 = this.mValue;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$UrlsEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */