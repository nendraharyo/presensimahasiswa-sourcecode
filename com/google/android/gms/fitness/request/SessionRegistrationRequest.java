package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class SessionRegistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final int zzaBy;
  
  static
  {
    zzz localzzz = new com/google/android/gms/fitness/request/zzz;
    localzzz.<init>();
    CREATOR = localzzz;
  }
  
  SessionRegistrationRequest(int paramInt1, PendingIntent paramPendingIntent, IBinder paramIBinder, int paramInt2)
  {
    this.mVersionCode = paramInt1;
    this.mPendingIntent = paramPendingIntent;
    if (paramIBinder == null) {}
    for (zzow localzzow = null;; localzzow = zzow.zza.zzbR(paramIBinder))
    {
      this.zzaAD = localzzow;
      this.zzaBy = paramInt2;
      return;
    }
  }
  
  public SessionRegistrationRequest(PendingIntent paramPendingIntent, zzow paramzzow, int paramInt)
  {
    this.mVersionCode = 6;
    this.mPendingIntent = paramPendingIntent;
    this.zzaAD = paramzzow;
    this.zzaBy = paramInt;
  }
  
  private boolean zzb(SessionRegistrationRequest paramSessionRegistrationRequest)
  {
    int i = this.zzaBy;
    int j = paramSessionRegistrationRequest.zzaBy;
    PendingIntent localPendingIntent1;
    boolean bool;
    if (i == j)
    {
      localPendingIntent1 = this.mPendingIntent;
      PendingIntent localPendingIntent2 = paramSessionRegistrationRequest.mPendingIntent;
      bool = zzw.equal(localPendingIntent1, localPendingIntent2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localPendingIntent1 = null;
    }
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this != paramObject)
    {
      bool = paramObject instanceof SessionRegistrationRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionRegistrationRequest)paramObject;
      bool = zzb((SessionRegistrationRequest)paramObject);
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
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.mPendingIntent;
    arrayOfObject[0] = localObject;
    localObject = Integer.valueOf(this.zzaBy);
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.mPendingIntent;
    localzza = localzza.zzg("pendingIntent", localObject);
    localObject = Integer.valueOf(this.zzaBy);
    return localzza.zzg("sessionRegistrationOption", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzz.zza(this, paramParcel, paramInt);
  }
  
  public int zzvf()
  {
    return this.zzaBy;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionRegistrationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */