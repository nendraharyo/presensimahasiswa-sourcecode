package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import java.util.Collections;
import java.util.List;

public class SessionStopResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaAG;
  
  static
  {
    zzk localzzk = new com/google/android/gms/fitness/result/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  SessionStopResult(int paramInt, Status paramStatus, List paramList)
  {
    this.mVersionCode = paramInt;
    this.zzUX = paramStatus;
    List localList = Collections.unmodifiableList(paramList);
    this.zzaAG = localList;
  }
  
  public SessionStopResult(Status paramStatus, List paramList)
  {
    this.mVersionCode = 3;
    this.zzUX = paramStatus;
    List localList = Collections.unmodifiableList(paramList);
    this.zzaAG = localList;
  }
  
  public static SessionStopResult zzV(Status paramStatus)
  {
    SessionStopResult localSessionStopResult = new com/google/android/gms/fitness/result/SessionStopResult;
    List localList = Collections.emptyList();
    localSessionStopResult.<init>(paramStatus, localList);
    return localSessionStopResult;
  }
  
  private boolean zzb(SessionStopResult paramSessionStopResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramSessionStopResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaAG;
      localObject2 = paramSessionStopResult.zzaAG;
      bool = zzw.equal(localObject1, localObject2);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject1 = null;
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
      bool = paramObject instanceof SessionStopResult;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionStopResult)paramObject;
      bool = zzb((SessionStopResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getSessions()
  {
    return this.zzaAG;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzUX;
    arrayOfObject[0] = localObject;
    localObject = this.zzaAG;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaAG;
    return localzza.zzg("sessions", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\SessionStopResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */