package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class StopProvidingContentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  public long zzbdn;
  public zzc zzbdo;
  
  static
  {
    zzj localzzj = new com/google/android/gms/nearby/sharing/internal/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  StopProvidingContentRequest()
  {
    this.versionCode = 1;
  }
  
  StopProvidingContentRequest(int paramInt, long paramLong, IBinder paramIBinder)
  {
    this.versionCode = paramInt;
    this.zzbdn = paramLong;
    zzc localzzc = zzc.zza.zzdH(paramIBinder);
    this.zzbdo = localzzc;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbdo.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\StopProvidingContentRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */