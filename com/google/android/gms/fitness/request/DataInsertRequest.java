package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DataInsertRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final boolean zzaAJ;
  private final DataSet zzaxn;
  
  static
  {
    zze localzze = new com/google/android/gms/fitness/request/zze;
    localzze.<init>();
    CREATOR = localzze;
  }
  
  DataInsertRequest(int paramInt, DataSet paramDataSet, IBinder paramIBinder, boolean paramBoolean)
  {
    this.mVersionCode = paramInt;
    this.zzaxn = paramDataSet;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
    this.zzaAJ = paramBoolean;
  }
  
  public DataInsertRequest(DataSet paramDataSet, zzow paramzzow, boolean paramBoolean)
  {
    this.mVersionCode = 4;
    this.zzaxn = paramDataSet;
    this.zzaAD = paramzzow;
    this.zzaAJ = paramBoolean;
  }
  
  private boolean zzc(DataInsertRequest paramDataInsertRequest)
  {
    DataSet localDataSet1 = this.zzaxn;
    DataSet localDataSet2 = paramDataInsertRequest.zzaxn;
    return zzw.equal(localDataSet1, localDataSet2);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject != this)
    {
      bool = paramObject instanceof DataInsertRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataInsertRequest)paramObject;
      bool = zzc((DataInsertRequest)paramObject);
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
  
  public DataSet getDataSet()
  {
    return this.zzaxn;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    DataSet localDataSet = this.zzaxn;
    arrayOfObject[0] = localDataSet;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    DataSet localDataSet = this.zzaxn;
    return localzza.zzg("dataSet", localDataSet).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
  
  public boolean zzuO()
  {
    return this.zzaAJ;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataInsertRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */