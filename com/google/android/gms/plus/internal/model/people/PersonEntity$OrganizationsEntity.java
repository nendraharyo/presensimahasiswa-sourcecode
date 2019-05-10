package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person.Organizations;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class PersonEntity$OrganizationsEntity
  extends FastSafeParcelableJsonResponse
  implements Person.Organizations
{
  public static final zzh CREATOR;
  private static final HashMap zzbeM;
  String mName;
  final int mVersionCode;
  int zzabB;
  String zzapg;
  String zzaxl;
  final Set zzbeN;
  String zzbfA;
  String zzbfk;
  String zzbgp;
  String zzbgq;
  boolean zzbgr;
  
  static
  {
    Object localObject = new com/google/android/gms/plus/internal/model/people/zzh;
    ((zzh)localObject).<init>();
    CREATOR = (zzh)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzl("department", 2);
    ((HashMap)localObject).put("department", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("description", 3);
    ((HashMap)localObject).put("description", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("endDate", 4);
    ((HashMap)localObject).put("endDate", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("location", 5);
    ((HashMap)localObject).put("location", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("name", 6);
    ((HashMap)localObject).put("name", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzk("primary", 7);
    ((HashMap)localObject).put("primary", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("startDate", 8);
    ((HashMap)localObject).put("startDate", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("title", 9);
    ((HashMap)localObject).put("title", localField);
    localObject = zzbeM;
    StringToIntConverter localStringToIntConverter = new com/google/android/gms/common/server/converter/StringToIntConverter;
    localStringToIntConverter.<init>();
    localStringToIntConverter = localStringToIntConverter.zzh("work", 0).zzh("school", 1);
    localField = FastJsonResponse.Field.zza("type", 10, localStringToIntConverter, false);
    ((HashMap)localObject).put("type", localField);
  }
  
  public PersonEntity$OrganizationsEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  PersonEntity$OrganizationsEntity(Set paramSet, int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, boolean paramBoolean, String paramString6, String paramString7, int paramInt2)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt1;
    this.zzbgp = paramString1;
    this.zzaxl = paramString2;
    this.zzbfk = paramString3;
    this.zzbgq = paramString4;
    this.mName = paramString5;
    this.zzbgr = paramBoolean;
    this.zzbfA = paramString6;
    this.zzapg = paramString7;
    this.zzabB = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof OrganizationsEntity;
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
        paramObject = (OrganizationsEntity)paramObject;
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
            bool3 = ((OrganizationsEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((OrganizationsEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((OrganizationsEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getDepartment()
  {
    return this.zzbgp;
  }
  
  public String getDescription()
  {
    return this.zzaxl;
  }
  
  public String getEndDate()
  {
    return this.zzbfk;
  }
  
  public String getLocation()
  {
    return this.zzbgq;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public String getStartDate()
  {
    return this.zzbfA;
  }
  
  public String getTitle()
  {
    return this.zzapg;
  }
  
  public int getType()
  {
    return this.zzabB;
  }
  
  public boolean hasDepartment()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDescription()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(3);
    return localSet.contains(localInteger);
  }
  
  public boolean hasEndDate()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
    return localSet.contains(localInteger);
  }
  
  public boolean hasLocation()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    return localSet.contains(localInteger);
  }
  
  public boolean hasName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPrimary()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(7);
    return localSet.contains(localInteger);
  }
  
  public boolean hasStartDate()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(8);
    return localSet.contains(localInteger);
  }
  
  public boolean hasTitle()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(9);
    return localSet.contains(localInteger);
  }
  
  public boolean hasType()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(10);
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
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public OrganizationsEntity zzFw()
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
      int k = paramField.zzrs();
      localObject2 = k;
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    case 2: 
      localObject1 = this.zzbgp;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzaxl;
      continue;
      localObject1 = this.zzbfk;
      continue;
      localObject1 = this.zzbgq;
      continue;
      localObject1 = this.mName;
      continue;
      boolean bool = this.zzbgr;
      localObject1 = Boolean.valueOf(bool);
      continue;
      localObject1 = this.zzbfA;
      continue;
      localObject1 = this.zzapg;
      continue;
      int j = this.zzabB;
      localObject1 = Integer.valueOf(j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity$OrganizationsEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */