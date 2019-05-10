package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;
import com.google.android.gms.internal.zzqi;
import com.google.android.gms.internal.zzqi.zza;

public class StartScanRequest
  implements SafeParcelable
{
  public static final zzg CREATOR;
  final int versionCode;
  private final zzqg zzbaV;
  private final zzqi zzbaY;
  
  static
  {
    zzg localzzg = new com/google/android/gms/nearby/bootstrap/request/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  StartScanRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this.versionCode = paramInt;
    zzx.zzz(paramIBinder1);
    Object localObject = zzqi.zza.zzdu(paramIBinder1);
    this.zzbaY = ((zzqi)localObject);
    zzx.zzz(paramIBinder2);
    localObject = zzqg.zza.zzds(paramIBinder2);
    this.zzbaV = ((zzqg)localObject);
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
    zzg.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzEi()
  {
    Object localObject = this.zzbaY;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbaY.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\StartScanRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */