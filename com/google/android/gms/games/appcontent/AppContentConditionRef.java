package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

public final class AppContentConditionRef
  extends MultiDataBufferRef
  implements AppContentCondition
{
  AppContentConditionRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 4, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return AppContentConditionEntity.zza(this, paramObject);
  }
  
  public int hashCode()
  {
    return AppContentConditionEntity.zza(this);
  }
  
  public String toString()
  {
    return AppContentConditionEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentConditionEntity)zzwj()).writeToParcel(paramParcel, paramInt);
  }
  
  public String zzwf()
  {
    return getString("condition_default_value");
  }
  
  public String zzwg()
  {
    return getString("condition_expected_value");
  }
  
  public String zzwh()
  {
    return getString("condition_predicate");
  }
  
  public Bundle zzwi()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzd(localDataHolder, localArrayList, "condition_predicate_parameters", i);
  }
  
  public AppContentCondition zzwj()
  {
    AppContentConditionEntity localAppContentConditionEntity = new com/google/android/gms/games/appcontent/AppContentConditionEntity;
    localAppContentConditionEntity.<init>(this);
    return localAppContentConditionEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentConditionRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */