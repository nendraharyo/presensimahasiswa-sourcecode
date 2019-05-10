package com.google.android.gms.nearby.sharing.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class TrustedDevicesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int versionCode;
  public zzc zzbdo;
  public String zzbdq;
  public byte[] zzbdr;
  
  static
  {
    zzk localzzk = new com/google/android/gms/nearby/sharing/internal/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  TrustedDevicesRequest(int paramInt, String paramString, byte[] paramArrayOfByte, IBinder paramIBinder)
  {
    this.versionCode = paramInt;
    Object localObject = (String)zzx.zzz(paramString);
    this.zzbdq = ((String)localObject);
    localObject = (byte[])zzx.zzz(paramArrayOfByte);
    this.zzbdr = ((byte[])localObject);
    localObject = zzc.zza.zzdH(paramIBinder);
    this.zzbdo = ((zzc)localObject);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzED()
  {
    return this.zzbdo.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\sharing\internal\TrustedDevicesRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */