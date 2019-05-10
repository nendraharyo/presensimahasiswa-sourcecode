package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;

public class SessionInsertRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final List zzaBs;
  private final Session zzavX;
  private final List zzawg;
  
  static
  {
    zzx localzzx = new com/google/android/gms/fitness/request/zzx;
    localzzx.<init>();
    CREATOR = localzzx;
  }
  
  SessionInsertRequest(int paramInt, Session paramSession, List paramList1, List paramList2, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzavX = paramSession;
    Object localObject = Collections.unmodifiableList(paramList1);
    this.zzawg = ((List)localObject);
    localObject = Collections.unmodifiableList(paramList2);
    this.zzaBs = ((List)localObject);
    localObject = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = ((zzow)localObject);
  }
  
  public SessionInsertRequest(Session paramSession, List paramList1, List paramList2, zzow paramzzow)
  {
    this.mVersionCode = 3;
    this.zzavX = paramSession;
    List localList = Collections.unmodifiableList(paramList1);
    this.zzawg = localList;
    localList = Collections.unmodifiableList(paramList2);
    this.zzaBs = localList;
    this.zzaAD = paramzzow;
  }
  
  private SessionInsertRequest(SessionInsertRequest.Builder paramBuilder)
  {
    this(localSession, localList1, localList2, null);
  }
  
  public SessionInsertRequest(SessionInsertRequest paramSessionInsertRequest, zzow paramzzow)
  {
    this(localSession, localList1, localList2, paramzzow);
  }
  
  private boolean zzb(SessionInsertRequest paramSessionInsertRequest)
  {
    Object localObject1 = this.zzavX;
    Object localObject2 = paramSessionInsertRequest.zzavX;
    boolean bool = zzw.equal(localObject1, localObject2);
    if (bool)
    {
      localObject1 = this.zzawg;
      localObject2 = paramSessionInsertRequest.zzawg;
      bool = zzw.equal(localObject1, localObject2);
      if (bool)
      {
        localObject1 = this.zzaBs;
        localObject2 = paramSessionInsertRequest.zzaBs;
        bool = zzw.equal(localObject1, localObject2);
        if (bool) {
          bool = true;
        }
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
    if (paramObject != this)
    {
      bool = paramObject instanceof SessionInsertRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionInsertRequest)paramObject;
      bool = zzb((SessionInsertRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getAggregateDataPoints()
  {
    return this.zzaBs;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAD;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAD.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public List getDataSets()
  {
    return this.zzawg;
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
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzavX;
    arrayOfObject[0] = localObject;
    localObject = this.zzawg;
    arrayOfObject[1] = localObject;
    localObject = this.zzaBs;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzavX;
    localzza = localzza.zzg("session", localObject);
    localObject = this.zzawg;
    localzza = localzza.zzg("dataSets", localObject);
    localObject = this.zzaBs;
    return localzza.zzg("aggregateDataPoints", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzx.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionInsertRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */