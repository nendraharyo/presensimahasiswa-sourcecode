package com.google.android.gms.games.appcontent;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzc;

public final class AppContentTupleRef
  extends zzc
  implements AppContentTuple
{
  AppContentTupleRef(DataHolder paramDataHolder, int paramInt)
  {
    super(paramDataHolder, paramInt);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    return AppContentTupleEntity.zza(this, paramObject);
  }
  
  public String getName()
  {
    return getString("tuple_name");
  }
  
  public String getValue()
  {
    return getString("tuple_value");
  }
  
  public int hashCode()
  {
    return AppContentTupleEntity.zza(this);
  }
  
  public String toString()
  {
    return AppContentTupleEntity.zzb(this);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ((AppContentTupleEntity)zzwq()).writeToParcel(paramParcel, paramInt);
  }
  
  public AppContentTuple zzwq()
  {
    AppContentTupleEntity localAppContentTupleEntity = new com/google/android/gms/games/appcontent/AppContentTupleEntity;
    localAppContentTupleEntity.<init>(this);
    return localAppContentTupleEntity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\appcontent\AppContentTupleRef.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */