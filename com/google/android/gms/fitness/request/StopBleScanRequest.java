package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class StopBleScanRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final zzq zzaBA;
  
  static
  {
    zzae localzzae = new com/google/android/gms/fitness/request/zzae;
    localzzae.<init>();
    CREATOR = localzzae;
  }
  
  StopBleScanRequest(int paramInt, IBinder paramIBinder1, IBinder paramIBinder2)
  {
    this.mVersionCode = paramInt;
    Object localObject = zzq.zza.zzbU(paramIBinder1);
    this.zzaBA = ((zzq)localObject);
    localObject = zzow.zza.zzbR(paramIBinder2);
    this.zzaAD = ((zzow)localObject);
  }
  
  public StopBleScanRequest(BleScanCallback paramBleScanCallback, zzow paramzzow)
  {
    this(localzza, paramzzow);
  }
  
  public StopBleScanRequest(zzq paramzzq, zzow paramzzow)
  {
    this.mVersionCode = 3;
    this.zzaBA = paramzzq;
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
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzae.zza(this, paramParcel, paramInt);
  }
  
  public IBinder zzvg()
  {
    return this.zzaBA.asBinder();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\StopBleScanRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */