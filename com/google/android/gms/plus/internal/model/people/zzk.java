package com.google.android.gms.plus.internal.model.people;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.plus.model.people.Person.AgeRange;
import com.google.android.gms.plus.model.people.Person.Cover;
import com.google.android.gms.plus.model.people.Person.Image;
import com.google.android.gms.plus.model.people.Person.Name;
import java.util.ArrayList;

public final class zzk
  extends zzc
  implements Person
{
  public zzk(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public String getAboutMe()
  {
    return null;
  }
  
  public Person.AgeRange getAgeRange()
  {
    return null;
  }
  
  public String getBirthday()
  {
    return null;
  }
  
  public String getBraggingRights()
  {
    return null;
  }
  
  public int getCircledByCount()
  {
    return 0;
  }
  
  public Person.Cover getCover()
  {
    return null;
  }
  
  public String getCurrentLocation()
  {
    return null;
  }
  
  public String getDisplayName()
  {
    return getString("displayName");
  }
  
  public int getGender()
  {
    return 0;
  }
  
  public String getId()
  {
    return getString("personId");
  }
  
  public Person.Image getImage()
  {
    PersonEntity.ImageEntity localImageEntity = new com/google/android/gms/plus/internal/model/people/PersonEntity$ImageEntity;
    String str = getString("image");
    localImageEntity.<init>(str);
    return localImageEntity;
  }
  
  public String getLanguage()
  {
    return null;
  }
  
  public Person.Name getName()
  {
    return null;
  }
  
  public String getNickname()
  {
    return null;
  }
  
  public int getObjectType()
  {
    return PersonEntity.zza.zzfH(getString("objectType"));
  }
  
  public int getPlusOneCount()
  {
    return 0;
  }
  
  public int getRelationshipStatus()
  {
    return 0;
  }
  
  public String getTagline()
  {
    return null;
  }
  
  public String getUrl()
  {
    return getString("url");
  }
  
  public boolean hasAboutMe()
  {
    return false;
  }
  
  public boolean hasAgeRange()
  {
    return false;
  }
  
  public boolean hasBirthday()
  {
    return false;
  }
  
  public boolean hasBraggingRights()
  {
    return false;
  }
  
  public boolean hasCircledByCount()
  {
    return false;
  }
  
  public boolean hasCover()
  {
    return false;
  }
  
  public boolean hasCurrentLocation()
  {
    return false;
  }
  
  public boolean hasDisplayName()
  {
    return true;
  }
  
  public boolean hasGender()
  {
    return false;
  }
  
  public boolean hasId()
  {
    return true;
  }
  
  public boolean hasImage()
  {
    return true;
  }
  
  public boolean hasIsPlusUser()
  {
    return false;
  }
  
  public boolean hasLanguage()
  {
    return false;
  }
  
  public boolean hasName()
  {
    return false;
  }
  
  public boolean hasNickname()
  {
    return false;
  }
  
  public boolean hasObjectType()
  {
    return true;
  }
  
  public boolean hasOrganizations()
  {
    return false;
  }
  
  public boolean hasPlacesLived()
  {
    return false;
  }
  
  public boolean hasPlusOneCount()
  {
    return false;
  }
  
  public boolean hasRelationshipStatus()
  {
    return false;
  }
  
  public boolean hasTagline()
  {
    return false;
  }
  
  public boolean hasUrl()
  {
    return true;
  }
  
  public boolean hasUrls()
  {
    return false;
  }
  
  public boolean hasVerified()
  {
    return false;
  }
  
  public boolean isPlusUser()
  {
    return false;
  }
  
  public boolean isVerified()
  {
    return false;
  }
  
  public ArrayList zzFA()
  {
    return null;
  }
  
  public ArrayList zzFB()
  {
    return null;
  }
  
  public ArrayList zzFC()
  {
    return null;
  }
  
  public Person zzFD()
  {
    PersonEntity localPersonEntity = new com/google/android/gms/plus/internal/model/people/PersonEntity;
    String str1 = getDisplayName();
    String str2 = getId();
    PersonEntity.ImageEntity localImageEntity = (PersonEntity.ImageEntity)getImage();
    int i = getObjectType();
    String str3 = getUrl();
    localPersonEntity.<init>(str1, str2, localImageEntity, i, str3);
    return localPersonEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\internal\model\people\zzk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */