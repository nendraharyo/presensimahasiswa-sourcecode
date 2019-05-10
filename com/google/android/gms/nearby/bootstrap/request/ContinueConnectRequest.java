package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;

public class ContinueConnectRequest
  implements SafeParcelable
{
  public static final zzb CREATOR;
  final int versionCode;
  private final zzqg zzbaV;
  private final String zzbaW;
  
  static
  {
    zzb localzzb = new com/google/android/gms/nearby/bootstrap/request/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  ContinueConnectRequest(int paramInt, String paramString, IBinder paramIBinder)
  {
    this.versionCode = paramInt;
    Object localObject = (String)zzx.zzz(paramString);
    this.zzbaW = ((String)localObject);
    localObject = zzqg.zza.zzds(paramIBinder);
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
  
  public String getToken()
  {
    return this.zzbaW;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\ContinueConnectRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */