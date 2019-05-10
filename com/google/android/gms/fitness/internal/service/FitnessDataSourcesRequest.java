package com.google.android.gms.fitness.internal.service;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collections;
import java.util.List;

public class FitnessDataSourcesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzawe;
  
  static
  {
    zza localzza = new com/google/android/gms/fitness/internal/service/zza;
    localzza.<init>();
    CREATOR = localzza;
  }
  
  FitnessDataSourcesRequest(int paramInt, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzawe = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public List getDataTypes()
  {
    return Collections.unmodifiableList(this.zzawe);
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    List localList = this.zzawe;
    return localzza.zzg("dataTypes", localList).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\internal\service\FitnessDataSourcesRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */