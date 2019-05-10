package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.data.SessionDataSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SessionReadResult
  implements Result, SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final Status zzUX;
  private final List zzaAG;
  private final List zzaBO;
  
  static
  {
    zzj localzzj = new com/google/android/gms/fitness/result/zzj;
    localzzj.<init>();
    CREATOR = localzzj;
  }
  
  SessionReadResult(int paramInt, List paramList1, List paramList2, Status paramStatus)
  {
    this.mVersionCode = paramInt;
    this.zzaAG = paramList1;
    List localList = Collections.unmodifiableList(paramList2);
    this.zzaBO = localList;
    this.zzUX = paramStatus;
  }
  
  public SessionReadResult(List paramList1, List paramList2, Status paramStatus)
  {
    this.mVersionCode = 3;
    this.zzaAG = paramList1;
    List localList = Collections.unmodifiableList(paramList2);
    this.zzaBO = localList;
    this.zzUX = paramStatus;
  }
  
  public static SessionReadResult zzU(Status paramStatus)
  {
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    SessionReadResult localSessionReadResult = new com/google/android/gms/fitness/result/SessionReadResult;
    localSessionReadResult.<init>(localArrayList1, localArrayList2, paramStatus);
    return localSessionReadResult;
  }
  
  private boolean zzb(SessionReadResult paramSessionReadResult)
  {
    Object localObject1 = this.zzUX;
    Object localObject2 = paramSessionReadResult.zzUX;
    boolean bool = ((Status)localObject1).equals(localObject2);
    if (bool)
    {
      localObject1 = this.zzaAG;
      localObject2 = paramSessionReadResult.zzaAG;
      bool = zzw.equal(localObject1, localObject2);
      if (bool)
      {
        localObject1 = this.zzaBO;
        localObject2 = paramSessionReadResult.zzaBO;
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
    if (this != paramObject)
    {
      bool = paramObject instanceof SessionReadResult;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionReadResult)paramObject;
      bool = zzb((SessionReadResult)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public List getDataSet(Session paramSession)
  {
    boolean bool1 = this.zzaAG.contains(paramSession);
    int i = 1;
    Object localObject1 = new Object[i];
    boolean bool2 = false;
    Session localSession = null;
    localObject1[0] = paramSession;
    zzx.zzb(bool1, "Attempting to read data for session %s which was not returned", (Object[])localObject1);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject2 = this.zzaBO;
    localObject1 = ((List)localObject2).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject2 = (SessionDataSet)((Iterator)localObject1).next();
      localSession = ((SessionDataSet)localObject2).getSession();
      bool2 = zzw.equal(paramSession, localSession);
      if (bool2)
      {
        localObject2 = ((SessionDataSet)localObject2).getDataSet();
        localArrayList.add(localObject2);
      }
    }
    return localArrayList;
  }
  
  public List getDataSet(Session paramSession, DataType paramDataType)
  {
    boolean bool1 = this.zzaAG.contains(paramSession);
    int i = 1;
    Object localObject1 = new Object[i];
    boolean bool2 = false;
    Object localObject2 = null;
    localObject1[0] = paramSession;
    zzx.zzb(bool1, "Attempting to read data for session %s which was not returned", (Object[])localObject1);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Object localObject3 = this.zzaBO;
    localObject1 = ((List)localObject3).iterator();
    for (;;)
    {
      bool1 = ((Iterator)localObject1).hasNext();
      if (!bool1) {
        break;
      }
      localObject3 = (SessionDataSet)((Iterator)localObject1).next();
      localObject2 = ((SessionDataSet)localObject3).getSession();
      bool2 = zzw.equal(paramSession, localObject2);
      if (bool2)
      {
        localObject2 = ((SessionDataSet)localObject3).getDataSet().getDataType();
        bool2 = paramDataType.equals(localObject2);
        if (bool2)
        {
          localObject3 = ((SessionDataSet)localObject3).getDataSet();
          localArrayList.add(localObject3);
        }
      }
    }
    return localArrayList;
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
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzUX;
    arrayOfObject[0] = localObject;
    localObject = this.zzaAG;
    arrayOfObject[1] = localObject;
    localObject = this.zzaBO;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzUX;
    localzza = localzza.zzg("status", localObject);
    localObject = this.zzaAG;
    localzza = localzza.zzg("sessions", localObject);
    localObject = this.zzaBO;
    return localzza.zzg("sessionDataSets", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzj.zza(this, paramParcel, paramInt);
  }
  
  public List zzvp()
  {
    return this.zzaBO;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\result\SessionReadResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */