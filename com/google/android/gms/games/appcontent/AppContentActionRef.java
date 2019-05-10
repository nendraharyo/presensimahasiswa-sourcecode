package com.google.android.gms.games.appcontent;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.List;

public final class AppContentActionRef
  extends MultiDataBufferRef
  implements AppContentAction
{
  AppContentActionRef(ArrayList paramArrayList, int paramInt)
  {
    super(paramArrayList, 1, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return AppContentActionEntity.zza(this, paramObject);
  }
  
  public Bundle getExtras()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzd(localDataHolder, localArrayList, "action_data", i);
  }
  
  public String getId()
  {
    return getString("action_id");
  }
  
  public String getType()
  {
    return getString("action_type");
  }
  
  public int hashCode()
  {
    return AppContentActionEntity.zza(this);
  }
  
  public String toString()
  {
    return AppContentActionEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentActionEntity)zzvS()).writeToParcel(paramParcel, paramInt);
  }
  
  public AppContentAnnotation zzvO()
  {
    Object localObject = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    String str = "action_annotation";
    int i = this.zzaje;
    localObject = AppContentUtils.zzb((DataHolder)localObject, localArrayList, str, i);
    int j = ((List)localObject).size();
    int k = 1;
    if (j == k)
    {
      j = 0;
      localArrayList = null;
    }
    for (localObject = (AppContentAnnotation)((List)localObject).get(0);; localObject = null) {
      return (AppContentAnnotation)localObject;
    }
  }
  
  public List zzvP()
  {
    DataHolder localDataHolder = this.zzahi;
    ArrayList localArrayList = this.zzaDN;
    int i = this.zzaje;
    return AppContentUtils.zzc(localDataHolder, localArrayList, "action_conditions", i);
  }
  
  public String zzvQ()
  {
    return getString("action_content_description");
  }
  
  public String zzvR()
  {
    return getString("overflow_text");
  }
  
  public AppContentAction zzvS()
  {
    AppContentActionEntity localAppContentActionEntity = new com/google/android/gms/games/appcontent/AppContentActionEntity;
    localAppContentActionEntity.<init>(this);
    return localAppContentActionEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentActionRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */