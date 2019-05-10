package com.google.android.gms.plus.internal.model.people;

import android.os.Parcel;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class PersonEntity
  extends FastSafeParcelableJsonResponse
  implements Person
{
  public static final zza CREATOR;
  private static final HashMap zzbeM;
  final int mVersionCode;
  String zzF;
  String zzWQ;
  String zzaaL;
  final Set zzbeN;
  String zzbfL;
  PersonEntity.AgeRangeEntity zzbfM;
  String zzbfN;
  String zzbfO;
  int zzbfP;
  PersonEntity.CoverEntity zzbfQ;
  String zzbfR;
  PersonEntity.ImageEntity zzbfS;
  boolean zzbfT;
  PersonEntity.NameEntity zzbfU;
  String zzbfV;
  int zzbfW;
  List zzbfX;
  List zzbfY;
  int zzbfZ;
  int zzbga;
  String zzbgb;
  List zzbgc;
  boolean zzbgd;
  int zztT;
  String zzyv;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    Object localObject = new com/google/android/gms/plus/internal/model/people/zza;
    ((zza)localObject).<init>();
    CREATOR = (zza)localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    zzbeM = (HashMap)localObject;
    localObject = zzbeM;
    FastJsonResponse.Field localField = FastJsonResponse.Field.zzl("aboutMe", k);
    ((HashMap)localObject).put("aboutMe", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("ageRange", j, PersonEntity.AgeRangeEntity.class);
    ((HashMap)localObject).put("ageRange", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("birthday", i);
    ((HashMap)localObject).put("birthday", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("braggingRights", 5);
    ((HashMap)localObject).put("braggingRights", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzi("circledByCount", 6);
    ((HashMap)localObject).put("circledByCount", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("cover", 7, PersonEntity.CoverEntity.class);
    ((HashMap)localObject).put("cover", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("currentLocation", 8);
    ((HashMap)localObject).put("currentLocation", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("displayName", 9);
    ((HashMap)localObject).put("displayName", localField);
    localObject = zzbeM;
    StringToIntConverter localStringToIntConverter = new com/google/android/gms/common/server/converter/StringToIntConverter;
    localStringToIntConverter.<init>();
    localStringToIntConverter = localStringToIntConverter.zzh("male", 0).zzh("female", m).zzh("other", k);
    localField = FastJsonResponse.Field.zza("gender", 12, localStringToIntConverter, false);
    ((HashMap)localObject).put("gender", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("id", 14);
    ((HashMap)localObject).put("id", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("image", 15, PersonEntity.ImageEntity.class);
    ((HashMap)localObject).put("image", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzk("isPlusUser", 16);
    ((HashMap)localObject).put("isPlusUser", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("language", 18);
    ((HashMap)localObject).put("language", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zza("name", 19, PersonEntity.NameEntity.class);
    ((HashMap)localObject).put("name", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("nickname", 20);
    ((HashMap)localObject).put("nickname", localField);
    localObject = zzbeM;
    localStringToIntConverter = new com/google/android/gms/common/server/converter/StringToIntConverter;
    localStringToIntConverter.<init>();
    localStringToIntConverter = localStringToIntConverter.zzh("person", 0).zzh("page", m);
    localField = FastJsonResponse.Field.zza("objectType", 21, localStringToIntConverter, false);
    ((HashMap)localObject).put("objectType", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("organizations", 22, PersonEntity.OrganizationsEntity.class);
    ((HashMap)localObject).put("organizations", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("placesLived", 23, PersonEntity.PlacesLivedEntity.class);
    ((HashMap)localObject).put("placesLived", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzi("plusOneCount", 24);
    ((HashMap)localObject).put("plusOneCount", localField);
    localObject = zzbeM;
    localStringToIntConverter = new com/google/android/gms/common/server/converter/StringToIntConverter;
    localStringToIntConverter.<init>();
    localStringToIntConverter = localStringToIntConverter.zzh("single", 0).zzh("in_a_relationship", m).zzh("engaged", k).zzh("married", j).zzh("its_complicated", i).zzh("open_relationship", 5).zzh("widowed", 6).zzh("in_domestic_partnership", 7).zzh("in_civil_union", 8);
    localField = FastJsonResponse.Field.zza("relationshipStatus", 25, localStringToIntConverter, false);
    ((HashMap)localObject).put("relationshipStatus", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("tagline", 26);
    ((HashMap)localObject).put("tagline", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzl("url", 27);
    ((HashMap)localObject).put("url", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzb("urls", 28, PersonEntity.UrlsEntity.class);
    ((HashMap)localObject).put("urls", localField);
    localObject = zzbeM;
    localField = FastJsonResponse.Field.zzk("verified", 29);
    ((HashMap)localObject).put("verified", localField);
  }
  
  public PersonEntity()
  {
    this.mVersionCode = 1;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.zzbeN = localHashSet;
  }
  
  public PersonEntity(String paramString1, String paramString2, PersonEntity.ImageEntity paramImageEntity, int paramInt, String paramString3)
  {
    this.mVersionCode = 1;
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzbeN = ((Set)localObject);
    this.zzWQ = paramString1;
    localObject = this.zzbeN;
    Integer localInteger = Integer.valueOf(9);
    ((Set)localObject).add(localInteger);
    this.zzyv = paramString2;
    localObject = this.zzbeN;
    localInteger = Integer.valueOf(14);
    ((Set)localObject).add(localInteger);
    this.zzbfS = paramImageEntity;
    localObject = this.zzbeN;
    localInteger = Integer.valueOf(15);
    ((Set)localObject).add(localInteger);
    this.zzbfW = paramInt;
    localObject = this.zzbeN;
    localInteger = Integer.valueOf(21);
    ((Set)localObject).add(localInteger);
    this.zzF = paramString3;
    localObject = this.zzbeN;
    localInteger = Integer.valueOf(27);
    ((Set)localObject).add(localInteger);
  }
  
  PersonEntity(Set paramSet, int paramInt1, String paramString1, PersonEntity.AgeRangeEntity paramAgeRangeEntity, String paramString2, String paramString3, int paramInt2, PersonEntity.CoverEntity paramCoverEntity, String paramString4, String paramString5, int paramInt3, String paramString6, PersonEntity.ImageEntity paramImageEntity, boolean paramBoolean1, String paramString7, PersonEntity.NameEntity paramNameEntity, String paramString8, int paramInt4, List paramList1, List paramList2, int paramInt5, int paramInt6, String paramString9, String paramString10, List paramList3, boolean paramBoolean2)
  {
    this.zzbeN = paramSet;
    this.mVersionCode = paramInt1;
    this.zzbfL = paramString1;
    this.zzbfM = paramAgeRangeEntity;
    this.zzbfN = paramString2;
    this.zzbfO = paramString3;
    this.zzbfP = paramInt2;
    this.zzbfQ = paramCoverEntity;
    this.zzbfR = paramString4;
    this.zzWQ = paramString5;
    this.zztT = paramInt3;
    this.zzyv = paramString6;
    this.zzbfS = paramImageEntity;
    this.zzbfT = paramBoolean1;
    this.zzaaL = paramString7;
    this.zzbfU = paramNameEntity;
    this.zzbfV = paramString8;
    this.zzbfW = paramInt4;
    this.zzbfX = paramList1;
    this.zzbfY = paramList2;
    this.zzbfZ = paramInt5;
    this.zzbga = paramInt6;
    this.zzbgb = paramString9;
    this.zzF = paramString10;
    this.zzbgc = paramList3;
    this.zzbgd = paramBoolean2;
  }
  
  public static PersonEntity zzv(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    int i = paramArrayOfByte.length;
    localParcel.unmarshall(paramArrayOfByte, 0, i);
    localParcel.setDataPosition(0);
    PersonEntity localPersonEntity = CREATOR.zzgE(localParcel);
    localParcel.recycle();
    return localPersonEntity;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    boolean bool2 = paramObject instanceof PersonEntity;
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
        paramObject = (PersonEntity)paramObject;
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
            bool3 = ((PersonEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
            if (!bool3) {
              break;
            }
            Object localObject2 = zzb((FastJsonResponse.Field)localObject1);
            localObject1 = ((PersonEntity)paramObject).zzb((FastJsonResponse.Field)localObject1);
            bool2 = localObject2.equals(localObject1);
          } while (bool2);
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = false;
          localObject1 = null;
          break;
          bool2 = ((PersonEntity)paramObject).zza((FastJsonResponse.Field)localObject1);
        } while (!bool2);
        bool2 = false;
        localObject1 = null;
        continue;
        label163:
        bool2 = bool1;
      }
    }
  }
  
  public String getAboutMe()
  {
    return this.zzbfL;
  }
  
  public Person.AgeRange getAgeRange()
  {
    return this.zzbfM;
  }
  
  public String getBirthday()
  {
    return this.zzbfN;
  }
  
  public String getBraggingRights()
  {
    return this.zzbfO;
  }
  
  public int getCircledByCount()
  {
    return this.zzbfP;
  }
  
  public Person.Cover getCover()
  {
    return this.zzbfQ;
  }
  
  public String getCurrentLocation()
  {
    return this.zzbfR;
  }
  
  public String getDisplayName()
  {
    return this.zzWQ;
  }
  
  public int getGender()
  {
    return this.zztT;
  }
  
  public String getId()
  {
    return this.zzyv;
  }
  
  public Person.Image getImage()
  {
    return this.zzbfS;
  }
  
  public String getLanguage()
  {
    return this.zzaaL;
  }
  
  public Person.Name getName()
  {
    return this.zzbfU;
  }
  
  public String getNickname()
  {
    return this.zzbfV;
  }
  
  public int getObjectType()
  {
    return this.zzbfW;
  }
  
  public List getOrganizations()
  {
    return (ArrayList)this.zzbfX;
  }
  
  public List getPlacesLived()
  {
    return (ArrayList)this.zzbfY;
  }
  
  public int getPlusOneCount()
  {
    return this.zzbfZ;
  }
  
  public int getRelationshipStatus()
  {
    return this.zzbga;
  }
  
  public String getTagline()
  {
    return this.zzbgb;
  }
  
  public String getUrl()
  {
    return this.zzF;
  }
  
  public List getUrls()
  {
    return (ArrayList)this.zzbgc;
  }
  
  public boolean hasAboutMe()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(2);
    return localSet.contains(localInteger);
  }
  
  public boolean hasAgeRange()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(3);
    return localSet.contains(localInteger);
  }
  
  public boolean hasBirthday()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(4);
    return localSet.contains(localInteger);
  }
  
  public boolean hasBraggingRights()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(5);
    return localSet.contains(localInteger);
  }
  
  public boolean hasCircledByCount()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(6);
    return localSet.contains(localInteger);
  }
  
  public boolean hasCover()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(7);
    return localSet.contains(localInteger);
  }
  
  public boolean hasCurrentLocation()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(8);
    return localSet.contains(localInteger);
  }
  
  public boolean hasDisplayName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(9);
    return localSet.contains(localInteger);
  }
  
  public boolean hasGender()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(12);
    return localSet.contains(localInteger);
  }
  
  public boolean hasId()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(14);
    return localSet.contains(localInteger);
  }
  
  public boolean hasImage()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(15);
    return localSet.contains(localInteger);
  }
  
  public boolean hasIsPlusUser()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(16);
    return localSet.contains(localInteger);
  }
  
  public boolean hasLanguage()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(18);
    return localSet.contains(localInteger);
  }
  
  public boolean hasName()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(19);
    return localSet.contains(localInteger);
  }
  
  public boolean hasNickname()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(20);
    return localSet.contains(localInteger);
  }
  
  public boolean hasObjectType()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(21);
    return localSet.contains(localInteger);
  }
  
  public boolean hasOrganizations()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(22);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPlacesLived()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(23);
    return localSet.contains(localInteger);
  }
  
  public boolean hasPlusOneCount()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(24);
    return localSet.contains(localInteger);
  }
  
  public boolean hasRelationshipStatus()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(25);
    return localSet.contains(localInteger);
  }
  
  public boolean hasTagline()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(26);
    return localSet.contains(localInteger);
  }
  
  public boolean hasUrl()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(27);
    return localSet.contains(localInteger);
  }
  
  public boolean hasUrls()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(28);
    return localSet.contains(localInteger);
  }
  
  public boolean hasVerified()
  {
    Set localSet = this.zzbeN;
    Integer localInteger = Integer.valueOf(29);
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
  
  public boolean isPlusUser()
  {
    return this.zzbfT;
  }
  
  public boolean isVerified()
  {
    return this.zzbgd;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public HashMap zzFl()
  {
    return zzbeM;
  }
  
  public PersonEntity zzFp()
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
    case 10: 
    case 11: 
    case 13: 
    case 17: 
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
      localObject1 = this.zzbfL;
    }
    for (;;)
    {
      return localObject1;
      localObject1 = this.zzbfM;
      continue;
      localObject1 = this.zzbfN;
      continue;
      localObject1 = this.zzbfO;
      continue;
      i = this.zzbfP;
      localObject1 = Integer.valueOf(i);
      continue;
      localObject1 = this.zzbfQ;
      continue;
      localObject1 = this.zzbfR;
      continue;
      localObject1 = this.zzWQ;
      continue;
      i = this.zztT;
      localObject1 = Integer.valueOf(i);
      continue;
      localObject1 = this.zzyv;
      continue;
      localObject1 = this.zzbfS;
      continue;
      boolean bool1 = this.zzbfT;
      localObject1 = Boolean.valueOf(bool1);
      continue;
      localObject1 = this.zzaaL;
      continue;
      localObject1 = this.zzbfU;
      continue;
      localObject1 = this.zzbfV;
      continue;
      int j = this.zzbfW;
      localObject1 = Integer.valueOf(j);
      continue;
      localObject1 = this.zzbfX;
      continue;
      localObject1 = this.zzbfY;
      continue;
      j = this.zzbfZ;
      localObject1 = Integer.valueOf(j);
      continue;
      j = this.zzbga;
      localObject1 = Integer.valueOf(j);
      continue;
      localObject1 = this.zzbgb;
      continue;
      localObject1 = this.zzF;
      continue;
      localObject1 = this.zzbgc;
      continue;
      boolean bool2 = this.zzbgd;
      localObject1 = Boolean.valueOf(bool2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\PersonEntity.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */