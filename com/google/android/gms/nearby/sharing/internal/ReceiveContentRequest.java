package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ReceiveContentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public String packageName;
  final int versionCode;
  public IBinder zzbdk;
  public zzc zzbdo;
  public zza zzbdp;
  
  static
  {
    zzg localzzg = new com/google/android/gms/nearby/sharing/internal/zzg;
    localzzg.<init>();
    CREATOR = localzzg;
  }
  
  ReceiveContentRequest()
  {
    this.versionCode = 1;
  }
  
  ReceiveContentRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2, String paramString, IBinder paramIBinder3)
  {
    this.versionCode = paramInt;
    this.zzbdk = paramIBinder1;
    Object localObject = zza.zza.zzdF(paramIBinder2);
    this.zzbdp = ((zza)localObject);
    this.packageName = paramString;
    localObject = zzc.zza.zzdH(paramIBinder3);
    this.zzbdo = ((zzc)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzg.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbdo.asBinder();
  }
  
  IBinder zzEQ()
  {
    Object localObject = this.zzbdp;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbdp.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\ReceiveContentRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */