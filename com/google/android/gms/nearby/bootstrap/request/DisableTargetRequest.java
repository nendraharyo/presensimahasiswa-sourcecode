package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;

public class DisableTargetRequest
  implements SafeParcelable
{
  public static final zzc CREATOR;
  final int versionCode;
  private final zzqg zzbaV;
  
  static
  {
    zzc localzzc = new com/google/android/gms/nearby/bootstrap/request/zzc;
    localzzc.<init>();
    CREATOR = localzzc;
  }
  
  DisableTargetRequest(int paramInt, IBinder paramIBinder)
  {
    this.versionCode = paramInt;
    zzx.zzz(paramIBinder);
    zzqg localzzqg = zzqg.zza.zzds(paramIBinder);
    this.zzbaV = localzzqg;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzbaV;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbaV.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\DisableTargetRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */