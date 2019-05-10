package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.zzk;
import com.google.android.gms.fitness.data.zzk.zza;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SensorRegistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private zzk zzaBh;
  int zzaBi;
  int zzaBj;
  private final long zzaBk;
  private final long zzaBl;
  private final List zzaBm;
  private final long zzaBn;
  private final List zzaBo;
  private DataType zzavT;
  private DataSource zzavU;
  private final long zzaxo;
  private final int zzaxp;
  
  static
  {
    zzv localzzv = new com/google/android/gms/fitness/request/zzv;
    localzzv.<init>();
    CREATOR = localzzv;
  }
  
  SensorRegistrationRequest(int paramInt1, DataSource paramDataSource, DataType paramDataType, IBinder paramIBinder1, int paramInt2, int paramInt3, long paramLong1, long paramLong2, PendingIntent paramPendingIntent, long paramLong3, int paramInt4, List paramList, long paramLong4, IBinder paramIBinder2)
  {
    this.mVersionCode = paramInt1;
    this.zzavU = paramDataSource;
    this.zzavT = paramDataType;
    boolean bool;
    if (paramIBinder1 == null) {
      bool = false;
    }
    for (Object localObject = null;; localObject = zzk.zza.zzbt(paramIBinder1))
    {
      this.zzaBh = ((zzk)localObject);
      long l = 0L;
      bool = paramLong1 < l;
      if (!bool) {
        paramLong1 = paramInt2;
      }
      this.zzaxo = paramLong1;
      this.zzaBl = paramLong3;
      l = 0L;
      bool = paramLong2 < l;
      if (!bool) {
        paramLong2 = paramInt3;
      }
      this.zzaBk = paramLong2;
      this.zzaBm = paramList;
      this.mPendingIntent = paramPendingIntent;
      this.zzaxp = paramInt4;
      localObject = Collections.emptyList();
      this.zzaBo = ((List)localObject);
      this.zzaBn = paramLong4;
      localObject = zzow.zza.zzbR(paramIBinder2);
      this.zzaAD = ((zzow)localObject);
      return;
    }
  }
  
  public SensorRegistrationRequest(DataSource paramDataSource, DataType paramDataType, zzk paramzzk, PendingIntent paramPendingIntent, long paramLong1, long paramLong2, long paramLong3, int paramInt, List paramList1, List paramList2, long paramLong4, zzow paramzzow)
  {
    this.mVersionCode = 6;
    this.zzavU = paramDataSource;
    this.zzavT = paramDataType;
    this.zzaBh = paramzzk;
    this.mPendingIntent = paramPendingIntent;
    this.zzaxo = paramLong1;
    this.zzaBl = paramLong2;
    this.zzaBk = paramLong3;
    this.zzaxp = paramInt;
    this.zzaBm = paramList1;
    this.zzaBo = paramList2;
    this.zzaBn = paramLong4;
    this.zzaAD = paramzzow;
  }
  
  public SensorRegistrationRequest(SensorRequest paramSensorRequest, zzk paramzzk, PendingIntent paramPendingIntent, zzow paramzzow)
  {
    this(localDataSource, localDataType, paramzzk, paramPendingIntent, l1, l2, l3, i, null, localList, l4, paramzzow);
  }
  
  private boolean zzb(SensorRegistrationRequest paramSensorRegistrationRequest)
  {
    Object localObject1 = this.zzavU;
    Object localObject2 = paramSensorRegistrationRequest.zzavU;
    boolean bool1 = zzw.equal(localObject1, localObject2);
    boolean bool2;
    if (bool1)
    {
      localObject1 = this.zzavT;
      localObject2 = paramSensorRegistrationRequest.zzavT;
      bool1 = zzw.equal(localObject1, localObject2);
      if (bool1)
      {
        long l1 = this.zzaxo;
        long l2 = paramSensorRegistrationRequest.zzaxo;
        bool1 = l1 < l2;
        if (!bool1)
        {
          l1 = this.zzaBl;
          l2 = paramSensorRegistrationRequest.zzaBl;
          bool1 = l1 < l2;
          if (!bool1)
          {
            l1 = this.zzaBk;
            l2 = paramSensorRegistrationRequest.zzaBk;
            bool1 = l1 < l2;
            if (!bool1)
            {
              int i = this.zzaxp;
              int j = paramSensorRegistrationRequest.zzaxp;
              if (i == j)
              {
                localObject1 = this.zzaBm;
                localObject2 = paramSensorRegistrationRequest.zzaBm;
                bool2 = zzw.equal(localObject1, localObject2);
                if (bool2) {
                  bool2 = true;
                }
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
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
      bool = paramObject instanceof SensorRegistrationRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (SensorRegistrationRequest)paramObject;
      bool = zzb((SensorRegistrationRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int getAccuracyMode()
  {
    return this.zzaxp;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAD;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAD.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public DataSource getDataSource()
  {
    return this.zzavU;
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
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
    Object[] arrayOfObject = new Object[8];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = this.zzavT;
    arrayOfObject[1] = localObject;
    localObject = this.zzaBh;
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzaxo);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzaBl);
    arrayOfObject[4] = localObject;
    localObject = Long.valueOf(this.zzaBk);
    arrayOfObject[5] = localObject;
    localObject = Integer.valueOf(this.zzaxp);
    arrayOfObject[6] = localObject;
    localObject = this.zzaBm;
    arrayOfObject[7] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    Object[] arrayOfObject = new Object[5];
    Object localObject = this.zzavT;
    arrayOfObject[0] = localObject;
    localObject = this.zzavU;
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzaxo);
    arrayOfObject[2] = localObject;
    localObject = Long.valueOf(this.zzaBl);
    arrayOfObject[3] = localObject;
    localObject = Long.valueOf(this.zzaBk);
    arrayOfObject[4] = localObject;
    return String.format("SensorRegistrationRequest{type %s source %s interval %s fastest %s latency %s}", arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzv.zza(this, paramParcel, paramInt);
  }
  
  public long zzuX()
  {
    return this.zzaBl;
  }
  
  public long zzuY()
  {
    return this.zzaBk;
  }
  
  public List zzuZ()
  {
    return this.zzaBm;
  }
  
  public long zzux()
  {
    return this.zzaxo;
  }
  
  public long zzva()
  {
    return this.zzaBn;
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\SensorRegistrationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */