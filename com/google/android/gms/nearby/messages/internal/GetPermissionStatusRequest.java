package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetPermissionStatusRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final String zzbbF;
  public final zze zzbcr;
  public final ClientAppContext zzbcs;
  
  static
  {
    zzb localzzb = new com/google/android/gms/nearby/messages/internal/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  GetPermissionStatusRequest(int paramInt, IBinder paramIBinder, String paramString, ClientAppContext paramClientAppContext)
  {
    this.mVersionCode = paramInt;
    zze localzze = zze.zza.zzdz(paramIBinder);
    this.zzbcr = localzze;
    this.zzbbF = paramString;
    if (paramClientAppContext != null) {}
    for (;;)
    {
      this.zzbcs = paramClientAppContext;
      return;
      paramClientAppContext = new com/google/android/gms/nearby/messages/internal/ClientAppContext;
      localzze = null;
      String str = this.zzbbF;
      paramClientAppContext.<init>(null, str);
    }
  }
  
  GetPermissionStatusRequest(IBinder paramIBinder, ClientAppContext paramClientAppContext)
  {
    this(1, paramIBinder, null, paramClientAppContext);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbcr.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\GetPermissionStatusRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */