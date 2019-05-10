package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.BleDevice;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class ClaimBleDeviceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzaAB;
  private final BleDevice zzaAC;
  private final zzow zzaAD;
  
  static
  {
    zzb localzzb = new com/google/android/gms/fitness/request/zzb;
    localzzb.<init>();
    CREATOR = localzzb;
  }
  
  ClaimBleDeviceRequest(int paramInt, String paramString, BleDevice paramBleDevice, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzaAB = paramString;
    this.zzaAC = paramBleDevice;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public ClaimBleDeviceRequest(String paramString, BleDevice paramBleDevice, zzow paramzzow)
  {
    this.mVersionCode = 4;
    this.zzaAB = paramString;
    this.zzaAC = paramBleDevice;
    this.zzaAD = paramzzow;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAD;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAD.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public String getDeviceAddress()
  {
    return this.zzaAB;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzaAB;
    arrayOfObject[0] = localObject;
    localObject = this.zzaAC;
    arrayOfObject[1] = localObject;
    return String.format("ClaimBleDeviceRequest{%s %s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public BleDevice zzuK()
  {
    return this.zzaAC;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\ClaimBleDeviceRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */