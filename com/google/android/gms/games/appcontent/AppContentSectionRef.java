package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentSectionRef
  extends MultiDataBufferRef
  implements AppContentSection
{
  private final int zzaDQ;
  
  AppContentSectionRef(ArrayList paramArrayList, int paramInt1, int paramInt2)
  {
    super(paramArrayList, 0, paramInt1);
    this.zzaDQ = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return AppContentSectionEntity.zza(this, paramObject);
  }
  
  public Bundle getExtras()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzd(localDataHolder, localArrayList, "section_data", i);
  }
  
  public String getId()
  {
    return getString("section_id");
  }
  
  public String getTitle()
  {
    return getString("section_title");
  }
  
  public String getType()
  {
    return getString("section_type");
  }
  
  public int hashCode()
  {
    return AppContentSectionEntity.zza(this);
  }
  
  public String toString()
  {
    return AppContentSectionEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentSectionEntity)zzwm()).writeToParcel(paramParcel, paramInt);
  }
  
  public String zzvQ()
  {
    return getString("section_content_description");
  }
  
  public String zzwc()
  {
    return getString("section_subtitle");
  }
  
  public String zzwl()
  {
    return getString("section_card_type");
  }
  
  public AppContentSection zzwm()
  {
    AppContentSectionEntity localAppContentSectionEntity = new com/google/android/gms/games/appcontent/AppContentSectionEntity;
    localAppContentSectionEntity.<init>(this);
    return localAppContentSectionEntity;
  }
  
  public ArrayList zzwn()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zza(localDataHolder, localArrayList, "section_actions", i);
  }
  
  public ArrayList zzwo()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzb(localDataHolder, localArrayList, "section_annotations", i);
  }
  
  public ArrayList zzwp()
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    int i = this.zzaDQ;
    localArrayList1.<init>(i);
    i = 0;
    for (;;)
    {
      int j = this.zzaDQ;
      if (i >= j) {
        break;
      }
      AppContentCardRef localAppContentCardRef = new com/google/android/gms/games/appcontent/AppContentCardRef;
      ArrayList localArrayList2 = this.zzaDN;
      int k = this.zzaje + i;
      localAppContentCardRef.<init>(localArrayList2, k);
      localArrayList1.add(localAppContentCardRef);
      i += 1;
    }
    return localArrayList1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentSectionRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */