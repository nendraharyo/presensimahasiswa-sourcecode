package com.google.android.gms.nearby.bootstrap.request;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzqg;
import com.google.android.gms.internal.zzqg.zza;
import com.google.android.gms.nearby.bootstrap.Device;

public class SendDataRequest
  implements SafeParcelable
{
  public static final zzf CREATOR;
  private final byte[] data;
  final int versionCode;
  private final Device zzbaS;
  private final zzqg zzbaV;
  
  static
  {
    zzf localzzf = new com/google/android/gms/nearby/bootstrap/request/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  SendDataRequest(int paramInt, Device paramDevice, byte[] paramArrayOfByte, IBinder paramIBinder)
  {
    this.versionCode = paramInt;
    Object localObject = (Device)zzx.zzz(paramDevice);
    this.zzbaS = ((Device)localObject);
    localObject = (byte[])zzx.zzz(paramArrayOfByte);
    this.data = ((byte[])localObject);
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
    Object localObject = this.zzbaV;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbaV.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public byte[] getData()
  {
    return this.data;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public Device zzEd()
  {
    return this.zzbaS;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\bootstrap\request\SendDataRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */