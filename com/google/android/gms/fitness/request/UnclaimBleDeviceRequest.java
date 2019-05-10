package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class UnclaimBleDeviceRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzaAB;
  private final zzow zzaAD;
  
  static
  {
    zzag localzzag = new com/google/android/gms/fitness/request/zzag;
    localzzag.<init>();
    CREATOR = localzzag;
  }
  
  UnclaimBleDeviceRequest(int paramInt, String paramString, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzaAB = paramString;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public UnclaimBleDeviceRequest(String paramString, zzow paramzzow)
  {
    this.mVersionCode = 5;
    this.zzaAB = paramString;
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
    Object[] arrayOfObject = new Object[1];
    String str = this.zzaAB;
    arrayOfObject[0] = str;
    return String.format("UnclaimBleDeviceRequest{%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzag.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\UnclaimBleDeviceRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */