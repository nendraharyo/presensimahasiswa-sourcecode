package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataSource;

public class FitnessUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final DataSource zzavU;
  
  static
  {
    zzb localzzb = new com/google/android/gms/fitness/internal/service/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  FitnessUnregistrationRequest(int paramInt, DataSource paramDataSource)
  {
    this.mVersionCode = paramInt;
    this.zzavU = paramDataSource;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    DataSource localDataSource = this.zzavU;
    arrayOfObject[0] = localDataSource;
    return String.format("ApplicationUnregistrationRequest{%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\internal\service\FitnessUnregistrationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */