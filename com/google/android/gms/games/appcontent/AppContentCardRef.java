package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentCardRef
  extends MultiDataBufferRef
  implements AppContentCard
{
  AppContentCardRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 0, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return AppContentCardEntity.zza(this, paramObject);
  }
  
  public List getActions()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zza(localDataHolder, localArrayList, "card_actions", i);
  }
  
  public String getDescription()
  {
    return getString("card_description");
  }
  
  public Bundle getExtras()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzd(localDataHolder, localArrayList, "card_data", i);
  }
  
  public String getId()
  {
    return getString("card_id");
  }
  
  public String getTitle()
  {
    return getString("card_title");
  }
  
  public String getType()
  {
    return getString("card_type");
  }
  
  public int hashCode()
  {
    return AppContentCardEntity.zza(this);
  }
  
  public String toString()
  {
    return AppContentCardEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentCardEntity)zzwe()).writeToParcel(paramParcel, paramInt);
  }
  
  public List zzvP()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzc(localDataHolder, localArrayList, "card_conditions", i);
  }
  
  public String zzvQ()
  {
    return getString("card_content_description");
  }
  
  public List zzwa()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzb(localDataHolder, localArrayList, "card_annotations", i);
  }
  
  public int zzwb()
  {
    return getInteger("card_current_steps");
  }
  
  public String zzwc()
  {
    return getString("card_subtitle");
  }
  
  public int zzwd()
  {
    return getInteger("card_total_steps");
  }
  
  public AppContentCard zzwe()
  {
    AppContentCardEntity localAppContentCardEntity = new com/google/android/gms/games/appcontent/AppContentCardEntity;
    localAppContentCardEntity.<init>(this);
    return localAppContentCardEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentCardRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */