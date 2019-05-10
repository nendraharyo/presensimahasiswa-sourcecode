package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.Bucket;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzoh;
import com.google.android.gms.internal.zzoh.zza;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class DataReadRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  public static final int NO_LIMIT;
  private final int mVersionCode;
  private final long zzRD;
  private final List zzaAF;
  private final List zzaAK;
  private final List zzaAL;
  private final long zzaAM;
  private final DataSource zzaAN;
  private final int zzaAO;
  private final boolean zzaAP;
  private final boolean zzaAQ;
  private final zzoh zzaAR;
  private final List zzaAS;
  private final long zzavV;
  private final List zzawe;
  private final int zzawh;
  
  static
  {
    zzf localzzf = new com/google/android/gms/fitness/request/zzf;
    localzzf.<init>();
    CREATOR = localzzf;
  }
  
  DataReadRequest(int paramInt1, List paramList1, List paramList2, long paramLong1, long paramLong2, List paramList3, List paramList4, int paramInt2, long paramLong3, DataSource paramDataSource, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, IBinder paramIBinder, List paramList5)
  {
    this.mVersionCode = paramInt1;
    this.zzawe = paramList1;
    this.zzaAF = paramList2;
    this.zzRD = paramLong1;
    this.zzavV = paramLong2;
    this.zzaAK = paramList3;
    this.zzaAL = paramList4;
    this.zzawh = paramInt2;
    this.zzaAM = paramLong3;
    this.zzaAN = paramDataSource;
    this.zzaAO = paramInt3;
    this.zzaAP = paramBoolean1;
    this.zzaAQ = paramBoolean2;
    if (paramIBinder == null) {}
    for (zzoh localzzoh = null;; localzzoh = zzoh.zza.zzbC(paramIBinder))
    {
      this.zzaAR = localzzoh;
      if (paramList5 == null) {
        paramList5 = Collections.emptyList();
      }
      this.zzaAS = paramList5;
      return;
    }
  }
  
  private DataReadRequest(DataReadRequest.Builder paramBuilder)
  {
    this(localList1, localList2, l1, l2, localList3, localList4, i, l3, localDataSource, j, bool1, bool2, null, localList5);
  }
  
  public DataReadRequest(DataReadRequest paramDataReadRequest, zzoh paramzzoh)
  {
    this(localList1, localList2, l1, l2, localList3, localList4, i, l3, localDataSource, j, bool1, bool2, paramzzoh, (List)localObject);
  }
  
  public DataReadRequest(List paramList1, List paramList2, long paramLong1, long paramLong2, List paramList3, List paramList4, int paramInt1, long paramLong3, DataSource paramDataSource, int paramInt2, boolean paramBoolean1, boolean paramBoolean2, zzoh paramzzoh, List paramList5) {}
  
  private boolean zzb(DataReadRequest paramDataReadRequest)
  {
    Object localObject1 = this.zzawe;
    Object localObject2 = paramDataReadRequest.zzawe;
    boolean bool1 = ((List)localObject1).equals(localObject2);
    boolean bool2;
    if (bool1)
    {
      localObject1 = this.zzaAF;
      localObject2 = paramDataReadRequest.zzaAF;
      bool1 = ((List)localObject1).equals(localObject2);
      if (bool1)
      {
        long l1 = this.zzRD;
        long l2 = paramDataReadRequest.zzRD;
        bool1 = l1 < l2;
        if (!bool1)
        {
          l1 = this.zzavV;
          l2 = paramDataReadRequest.zzavV;
          bool1 = l1 < l2;
          if (!bool1)
          {
            int i = this.zzawh;
            int j = paramDataReadRequest.zzawh;
            if (i == j)
            {
              localObject1 = this.zzaAL;
              localObject2 = paramDataReadRequest.zzaAL;
              bool2 = ((List)localObject1).equals(localObject2);
              if (bool2)
              {
                localObject1 = this.zzaAK;
                localObject2 = paramDataReadRequest.zzaAK;
                bool2 = ((List)localObject1).equals(localObject2);
                if (bool2)
                {
                  localObject1 = this.zzaAN;
                  localObject2 = paramDataReadRequest.zzaAN;
                  bool2 = zzw.equal(localObject1, localObject2);
                  if (bool2)
                  {
                    l1 = this.zzaAM;
                    l2 = paramDataReadRequest.zzaAM;
                    bool2 = l1 < l2;
                    if (!bool2)
                    {
                      bool2 = this.zzaAQ;
                      boolean bool3 = paramDataReadRequest.zzaAQ;
                      if (bool2 == bool3) {
                        bool2 = true;
                      }
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
      bool = paramObject instanceof DataReadRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataReadRequest)paramObject;
      bool = zzb((DataReadRequest)paramObject);
      if (!bool) {
        break label33;
      }
    }
    label33:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public DataSource getActivityDataSource()
  {
    return this.zzaAN;
  }
  
  public List getAggregatedDataSources()
  {
    return this.zzaAL;
  }
  
  public List getAggregatedDataTypes()
  {
    return this.zzaAK;
  }
  
  public long getBucketDuration(TimeUnit paramTimeUnit)
  {
    long l = this.zzaAM;
    TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
    return paramTimeUnit.convert(l, localTimeUnit);
  }
  
  public int getBucketType()
  {
    return this.zzawh;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAR;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAR.asBinder()) {
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
  
  public int getLimit()
  {
    return this.zzaAO;
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
    Object[] arrayOfObject = new Object[3];
    Object localObject = Integer.valueOf(this.zzawh);
    arrayOfObject[0] = localObject;
    localObject = Long.valueOf(this.zzRD);
    arrayOfObject[1] = localObject;
    localObject = Long.valueOf(this.zzavV);
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("DataReadRequest{");
    Object localObject1 = this.zzawe;
    boolean bool1 = ((List)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = this.zzawe;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((DataType)((Iterator)localObject2).next()).zzuo();
        localObject1 = localStringBuilder.append((String)localObject1);
        str = " ";
        ((StringBuilder)localObject1).append(str);
      }
    }
    localObject1 = this.zzaAF;
    bool1 = ((List)localObject1).isEmpty();
    if (!bool1)
    {
      localObject1 = this.zzaAF;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = ((DataSource)((Iterator)localObject2).next()).toDebugString();
        localObject1 = localStringBuilder.append((String)localObject1);
        str = " ";
        ((StringBuilder)localObject1).append(str);
      }
    }
    int i = this.zzawh;
    if (i != 0)
    {
      localObject1 = localStringBuilder.append("bucket by ");
      j = this.zzawh;
      localObject2 = Bucket.zzeM(j);
      ((StringBuilder)localObject1).append((String)localObject2);
      long l1 = this.zzaAM;
      l2 = 0L;
      bool2 = l1 < l2;
      if (bool2)
      {
        localObject1 = localStringBuilder.append(" >");
        l1 = this.zzaAM;
        localObject1 = ((StringBuilder)localObject1).append(l1);
        localObject2 = "ms";
        ((StringBuilder)localObject1).append((String)localObject2);
      }
      localObject1 = ": ";
      localStringBuilder.append((String)localObject1);
    }
    localObject1 = this.zzaAK;
    boolean bool2 = ((List)localObject1).isEmpty();
    if (!bool2)
    {
      localObject1 = this.zzaAK;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = ((DataType)((Iterator)localObject2).next()).zzuo();
        localObject1 = localStringBuilder.append((String)localObject1);
        str = " ";
        ((StringBuilder)localObject1).append(str);
      }
    }
    localObject1 = this.zzaAL;
    bool2 = ((List)localObject1).isEmpty();
    if (!bool2)
    {
      localObject1 = this.zzaAL;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool2 = ((Iterator)localObject2).hasNext();
        if (!bool2) {
          break;
        }
        localObject1 = ((DataSource)((Iterator)localObject2).next()).toDebugString();
        localObject1 = localStringBuilder.append((String)localObject1);
        str = " ";
        ((StringBuilder)localObject1).append(str);
      }
    }
    int j = 4;
    Object localObject2 = new Object[j];
    String str = null;
    Long localLong = Long.valueOf(this.zzRD);
    localObject2[0] = localLong;
    localLong = Long.valueOf(this.zzRD);
    localObject2[1] = localLong;
    localLong = Long.valueOf(this.zzavV);
    localObject2[2] = localLong;
    int k = 3;
    long l2 = this.zzavV;
    localLong = Long.valueOf(l2);
    localObject2[k] = localLong;
    localObject1 = String.format("(%tF %tT - %tF %tT)", (Object[])localObject2);
    localStringBuilder.append((String)localObject1);
    localObject1 = this.zzaAN;
    if (localObject1 != null)
    {
      localObject1 = localStringBuilder.append("activities: ");
      localObject2 = this.zzaAN.toDebugString();
      ((StringBuilder)localObject1).append((String)localObject2);
    }
    bool2 = this.zzaAQ;
    if (bool2)
    {
      localObject1 = " +server";
      localStringBuilder.append((String)localObject1);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public long zzlO()
  {
    return this.zzRD;
  }
  
  public boolean zzuP()
  {
    return this.zzaAQ;
  }
  
  public boolean zzuQ()
  {
    return this.zzaAP;
  }
  
  public long zzuR()
  {
    return this.zzaAM;
  }
  
  public List zzuS()
  {
    return this.zzaAS;
  }
  
  public long zzud()
  {
    return this.zzavV;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataReadRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */