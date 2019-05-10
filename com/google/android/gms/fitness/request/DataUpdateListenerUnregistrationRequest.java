package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DataUpdateListenerUnregistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  
  static
  {
    zzl localzzl = new com/google/android/gms/fitness/request/zzl;
    localzzl.<init>();
    CREATOR = localzzl;
  }
  
  DataUpdateListenerUnregistrationRequest(int paramInt, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.mPendingIntent = paramPendingIntent;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  private boolean zzb(DataUpdateListenerUnregistrationRequest paramDataUpdateListenerUnregistrationRequest)
  {
    PendingIntent localPendingIntent1 = this.mPendingIntent;
    PendingIntent localPendingIntent2 = paramDataUpdateListenerUnregistrationRequest.mPendingIntent;
    return zzw.equal(localPendingIntent1, localPendingIntent2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataUpdateListenerUnregistrationRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataUpdateListenerUnregistrationRequest)paramObject;
      bool = zzb((DataUpdateListenerUnregistrationRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
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
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    PendingIntent localPendingIntent = this.mPendingIntent;
    arrayOfObject[0] = localPendingIntent;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[0];
    return String.format("DataUpdateListenerUnregistrationRequest", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzl.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataUpdateListenerUnregistrationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */