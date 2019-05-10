package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class SensorUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final zzk zzaBh;
  
  static
  {
    zzw localzzw = new com/google/android/gms/fitness/request/zzw;
    localzzw.<init>();
    CREATOR = localzzw;
  }
  
  SensorUnregistrationRequest(int paramInt, IBinder paramIBinder1, PendingIntent paramPendingIntent, IBinder paramIBinder2)
  {
    this.mVersionCode = paramInt;
    if (paramIBinder1 == null) {}
    for (Object localObject = null;; localObject = zzk.zza.zzbt(paramIBinder1))
    {
      this.zzaBh = ((zzk)localObject);
      this.mPendingIntent = paramPendingIntent;
      localObject = zzow.zza.zzbR(paramIBinder2);
      this.zzaAD = ((zzow)localObject);
      return;
    }
  }
  
  public SensorUnregistrationRequest(zzk paramzzk, PendingIntent paramPendingIntent, zzow paramzzow)
  {
    this.mVersionCode = 4;
    this.zzaBh = paramzzk;
    this.mPendingIntent = paramPendingIntent;
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
  
  public PendingIntent getIntent()
  {
    return this.mPendingIntent;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    zzk localzzk = this.zzaBh;
    arrayOfObject[0] = localzzk;
    return String.format("SensorUnregistrationRequest{%s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzw.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzvb()
  {
    Object localObject = this.zzaBh;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaBh.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SensorUnregistrationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */