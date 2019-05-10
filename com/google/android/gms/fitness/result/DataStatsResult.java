package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class DataStatsResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaBL;
  
  static
  {
    zzf localzzf = new com/google/android/gms/fitness/result/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  DataStatsResult(int paramInt, Status paramStatus, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    this.zzaBL = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  List zzvn()
  {
    return this.zzaBL;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\DataStatsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */