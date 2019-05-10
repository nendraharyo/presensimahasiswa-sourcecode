package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.internal.zzoi;
import com.google.android.gms.internal.zzoi.zza;
import java.util.ArrayList;
import java.util.List;

public class DataSourcesRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final List zzaAV;
  private final boolean zzaAW;
  private final zzoi zzaAX;
  private final List zzawe;
  
  static
  {
    zzh localzzh = new com/google/android/gms/fitness/request/zzh;
    localzzh.<init>();
    CREATOR = localzzh;
  }
  
  DataSourcesRequest(int paramInt, List paramList1, List paramList2, boolean paramBoolean, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzawe = paramList1;
    this.zzaAV = paramList2;
    this.zzaAW = paramBoolean;
    zzoi localzzoi = zzoi.zza.zzbD(paramIBinder);
    this.zzaAX = localzzoi;
  }
  
  private DataSourcesRequest(DataSourcesRequest.Builder paramBuilder)
  {
    this(localArrayList, localList, bool, null);
  }
  
  public DataSourcesRequest(DataSourcesRequest paramDataSourcesRequest, zzoi paramzzoi)
  {
    this(localList1, localList2, bool, paramzzoi);
  }
  
  public DataSourcesRequest(List paramList1, List paramList2, boolean paramBoolean, zzoi paramzzoi)
  {
    this.mVersionCode = 4;
    this.zzawe = paramList1;
    this.zzaAV = paramList2;
    this.zzaAW = paramBoolean;
    this.zzaAX = paramzzoi;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaAX;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaAX.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public List getDataTypes()
  {
    return this.zzawe;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzawe;
    localzza = localzza.zzg("dataTypes", localObject);
    String str = "sourceTypes";
    localObject = this.zzaAV;
    localzza = localzza.zzg(str, localObject);
    boolean bool = this.zzaAW;
    if (bool)
    {
      str = "includeDbOnlySources";
      localObject = "true";
      localzza.zzg(str, localObject);
    }
    return localzza.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public List zzuT()
  {
    return this.zzaAV;
  }
  
  public boolean zzuU()
  {
    return this.zzaAW;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataSourcesRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */