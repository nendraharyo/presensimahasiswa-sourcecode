package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataDeleteRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final long zzRD;
  private final zzow zzaAD;
  private final List zzaAF;
  private final List zzaAG;
  private final boolean zzaAH;
  private final boolean zzaAI;
  private final long zzavV;
  private final List zzawe;
  
  static
  {
    zzd localzzd = new com/google/android/gms/fitness/request/zzd;
    localzzd.<init>();
    CREATOR = localzzd;
  }
  
  DataDeleteRequest(int paramInt, long paramLong1, long paramLong2, List paramList1, List paramList2, List paramList3, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    Object localObject = Collections.unmodifiableList(paramList1);
    this.zzaAF = ((List)localObject);
    localObject = Collections.unmodifiableList(paramList2);
    this.zzawe = ((List)localObject);
    this.zzaAG = paramList3;
    this.zzaAH = paramBoolean1;
    this.zzaAI = paramBoolean2;
    localObject = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = ((zzow)localObject);
  }
  
  public DataDeleteRequest(long paramLong1, long paramLong2, List paramList1, List paramList2, List paramList3, boolean paramBoolean1, boolean paramBoolean2, zzow paramzzow)
  {
    this.mVersionCode = 3;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    List localList = Collections.unmodifiableList(paramList1);
    this.zzaAF = localList;
    localList = Collections.unmodifiableList(paramList2);
    this.zzawe = localList;
    this.zzaAG = paramList3;
    this.zzaAH = paramBoolean1;
    this.zzaAI = paramBoolean2;
    this.zzaAD = paramzzow;
  }
  
  private DataDeleteRequest(DataDeleteRequest.Builder paramBuilder)
  {
    this(l1, l2, localList1, localList2, localList3, bool1, bool2, null);
  }
  
  public DataDeleteRequest(DataDeleteRequest paramDataDeleteRequest, zzow paramzzow)
  {
    this(l1, l2, localList1, localList2, localList3, bool1, bool2, paramzzow);
  }
  
  private boolean zzb(DataDeleteRequest paramDataDeleteRequest)
  {
    long l1 = this.zzRD;
    long l2 = paramDataDeleteRequest.zzRD;
    boolean bool1 = l1 < l2;
    List localList1;
    if (!bool1)
    {
      l1 = this.zzavV;
      l2 = paramDataDeleteRequest.zzavV;
      bool1 = l1 < l2;
      if (!bool1)
      {
        localList1 = this.zzaAF;
        List localList2 = paramDataDeleteRequest.zzaAF;
        bool1 = zzw.equal(localList1, localList2);
        if (bool1)
        {
          localList1 = this.zzawe;
          localList2 = paramDataDeleteRequest.zzawe;
          bool1 = zzw.equal(localList1, localList2);
          if (bool1)
          {
            localList1 = this.zzaAG;
            localList2 = paramDataDeleteRequest.zzaAG;
            bool1 = zzw.equal(localList1, localList2);
            if (bool1)
            {
              bool1 = this.zzaAH;
              boolean bool2 = paramDataDeleteRequest.zzaAH;
              if (bool1 == bool2)
              {
                bool1 = this.zzaAI;
                bool2 = paramDataDeleteRequest.zzaAI;
                if (bool1 == bool2) {
                  bool1 = true;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localList1 = null;
    }
  }
  
  public boolean deleteAllData()
  {
    return this.zzaAH;
  }
  
  public boolean deleteAllSessions()
  {
    return this.zzaAI;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataDeleteRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataDeleteRequest)paramObject;
      bool = zzb((DataDeleteRequest)paramObject);
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
  
  public List getDataSources()
  {
    return this.zzaAF;
  }
  
  public List getDataTypes()
  {
    return this.zzawe;
  }
  
  public long getEndTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzavV;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public List getSessions()
  {
    return this.zzaAG;
  }
  
  public long getStartTime(TimeUnit paramTimeUnit)
  {
    long l = this.zzRD;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Long localLong = Long.valueOf(this.zzRD);
    arrayOfObject[0] = localLong;
    localLong = Long.valueOf(this.zzavV);
    arrayOfObject[1] = localLong;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = Long.valueOf(this.zzRD);
    localzza = localzza.zzg("startTimeMillis", localObject);
    localObject = Long.valueOf(this.zzavV);
    localzza = localzza.zzg("endTimeMillis", localObject);
    localObject = this.zzaAF;
    localzza = localzza.zzg("dataSources", localObject);
    localObject = this.zzawe;
    localzza = localzza.zzg("dateTypes", localObject);
    localObject = this.zzaAG;
    localzza = localzza.zzg("sessions", localObject);
    localObject = Boolean.valueOf(this.zzaAH);
    localzza = localzza.zzg("deleteAllData", localObject);
    localObject = Boolean.valueOf(this.zzaAI);
    return localzza.zzg("deleteAllSessions", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return this.zzRD;
  }
  
  public boolean zzuL()
  {
    return this.zzaAH;
  }
  
  public boolean zzuM()
  {
    return this.zzaAI;
  }
  
  public long zzud()
  {
    return this.zzavV;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataDeleteRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */