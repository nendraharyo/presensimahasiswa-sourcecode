package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;
import com.google.android.gms.nearby.bootstrap.Device;

public class DisconnectRequest
  implements SafeParcelable
{
  public static final zzd CREATOR;
  final int versionCode;
  private final Device zzbaS;
  private final zzqg zzbaV;
  
  static
  {
    zzd localzzd = new com/google/android/gms/nearby/bootstrap/request/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  DisconnectRequest(int paramInt, Device paramDevice, IBinder paramIBinder)
  {
    this.versionCode = paramInt;
    Object localObject = (Device)zzx.zzz(paramDevice);
    this.zzbaS = ((Device)localObject);
    zzx.zzz(paramIBinder);
    localObject = zzqg.zza.zzds(paramIBinder);
    this.zzbaV = ((zzqg)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    return this.zzbaV.asBinder();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public Device zzEd()
  {
    return this.zzbaS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\DisconnectRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */