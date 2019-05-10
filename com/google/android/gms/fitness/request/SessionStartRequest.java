package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.concurrent.TimeUnit;

public class SessionStartRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final Session zzavX;
  
  static
  {
    zzaa localzzaa = new com/google/android/gms/fitness/request/zzaa;
    localzzaa.<init>();
    CREATOR = localzzaa;
  }
  
  SessionStartRequest(int paramInt, Session paramSession, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzavX = paramSession;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public SessionStartRequest(Session paramSession, zzow paramzzow)
  {
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    long l1 = paramSession.getStartTime(localTimeUnit);
    long l2 = System.currentTimeMillis();
    boolean bool = l1 < l2;
    if (bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zzb(bool, "Cannot start a session in the future");
      zzx.zzb(paramSession.isOngoing(), "Cannot start a session which has already ended");
      this.mVersionCode = 3;
      this.zzavX = paramSession;
      this.zzaAD = paramzzow;
      return;
      bool = false;
      localTimeUnit = null;
    }
  }
  
  private boolean zzb(SessionStartRequest paramSessionStartRequest)
  {
    Session localSession1 = this.zzavX;
    Session localSession2 = paramSessionStartRequest.zzavX;
    return zzw.equal(localSession1, localSession2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof SessionStartRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionStartRequest)paramObject;
      bool = zzb((SessionStartRequest)paramObject);
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
  
  public Session getSession()
  {
    return this.zzavX;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    Session localSession = this.zzavX;
    arrayOfObject[0] = localSession;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Session localSession = this.zzavX;
    return localzza.zzg("session", localSession).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaa.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionStartRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */