package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzou;
import com.google.android.gms.internal.zzou.zza;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SessionReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final String zzLq;
  private final long zzRD;
  private final List zzaAF;
  private final boolean zzaAQ;
  private final String zzaBu;
  private boolean zzaBv;
  private final List zzaBw;
  private final zzou zzaBx;
  private final long zzavV;
  private final List zzawe;
  
  static
  {
    zzy localzzy = new com/google/android/gms/fitness/request/zzy;
    localzzy.<init>();
    CREATOR = localzzy;
  }
  
  SessionReadRequest(int paramInt, String paramString1, String paramString2, long paramLong1, long paramLong2, List paramList1, List paramList2, boolean paramBoolean1, boolean paramBoolean2, List paramList3, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzaBu = paramString1;
    this.zzLq = paramString2;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.zzawe = paramList1;
    this.zzaAF = paramList2;
    this.zzaBv = paramBoolean1;
    this.zzaAQ = paramBoolean2;
    this.zzaBw = paramList3;
    zzou localzzou = zzou.zza.zzbP(paramIBinder);
    this.zzaBx = localzzou;
  }
  
  private SessionReadRequest(SessionReadRequest.Builder paramBuilder)
  {
    this(str1, str2, l1, l2, localList1, localList2, bool1, bool2, localList3, null);
  }
  
  public SessionReadRequest(SessionReadRequest paramSessionReadRequest, zzou paramzzou)
  {
    this(str1, str2, l1, l2, localList1, localList2, bool1, bool2, localList3, paramzzou);
  }
  
  public SessionReadRequest(String paramString1, String paramString2, long paramLong1, long paramLong2, List paramList1, List paramList2, boolean paramBoolean1, boolean paramBoolean2, List paramList3, zzou paramzzou) {}
  
  private boolean zzb(SessionReadRequest paramSessionReadRequest)
  {
    Object localObject1 = this.zzaBu;
    Object localObject2 = paramSessionReadRequest.zzaBu;
    boolean bool1 = zzw.equal(localObject1, localObject2);
    if (bool1)
    {
      localObject1 = this.zzLq;
      localObject2 = paramSessionReadRequest.zzLq;
      bool1 = ((String)localObject1).equals(localObject2);
      if (bool1)
      {
        long l1 = this.zzRD;
        long l2 = paramSessionReadRequest.zzRD;
        bool1 = l1 < l2;
        if (!bool1)
        {
          l1 = this.zzavV;
          l2 = paramSessionReadRequest.zzavV;
          bool1 = l1 < l2;
          if (!bool1)
          {
            localObject1 = this.zzawe;
            localObject2 = paramSessionReadRequest.zzawe;
            bool1 = zzw.equal(localObject1, localObject2);
            if (bool1)
            {
              localObject1 = this.zzaAF;
              localObject2 = paramSessionReadRequest.zzaAF;
              bool1 = zzw.equal(localObject1, localObject2);
              if (bool1)
              {
                bool1 = this.zzaBv;
                boolean bool2 = paramSessionReadRequest.zzaBv;
                if (bool1 == bool2)
                {
                  localObject1 = this.zzaBw;
                  localObject2 = paramSessionReadRequest.zzaBw;
                  bool1 = ((List)localObject1).equals(localObject2);
                  if (bool1)
                  {
                    bool1 = this.zzaAQ;
                    bool2 = paramSessionReadRequest.zzaAQ;
                    if (bool1 == bool2) {
                      bool1 = true;
                    }
                  }
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
      bool = paramObject instanceof SessionReadRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SessionReadRequest)paramObject;
      bool = zzb((SessionReadRequest)paramObject);
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
    Object localObject = this.zzaBx;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaBx.asBinder()) {
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
  
  public List getExcludedPackages()
  {
    return this.zzaBw;
  }
  
  public String getSessionId()
  {
    return this.zzLq;
  }
  
  public String getSessionName()
  {
    return this.zzaBu;
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
    Object[] arrayOfObject = new Object[4];
    Object localObject = this.zzaBu;
    arrayOfObject[0] = localObject;
    localObject = this.zzLq;
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzRD);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzavV);
    arrayOfObject[3] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public boolean includeSessionsFromAllApps()
  {
    return this.zzaBv;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzaBu;
    localzza = localzza.zzg("sessionName", localObject);
    localObject = this.zzLq;
    localzza = localzza.zzg("sessionId", localObject);
    localObject = Long.valueOf(this.zzRD);
    localzza = localzza.zzg("startTimeMillis", localObject);
    localObject = Long.valueOf(this.zzavV);
    localzza = localzza.zzg("endTimeMillis", localObject);
    localObject = this.zzawe;
    localzza = localzza.zzg("dataTypes", localObject);
    localObject = this.zzaAF;
    localzza = localzza.zzg("dataSources", localObject);
    localObject = Boolean.valueOf(this.zzaBv);
    localzza = localzza.zzg("sessionsFromAllApps", localObject);
    localObject = this.zzaBw;
    localzza = localzza.zzg("excludedPackages", localObject);
    localObject = Boolean.valueOf(this.zzaAQ);
    return localzza.zzg("useServer", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzy.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return this.zzRD;
  }
  
  public boolean zzuP()
  {
    return this.zzaAQ;
  }
  
  public long zzud()
  {
    return this.zzavV;
  }
  
  public boolean zzve()
  {
    return this.zzaBv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SessionReadRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */