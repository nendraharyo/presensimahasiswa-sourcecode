package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class DataUpdateListenerRegistrationRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final PendingIntent mPendingIntent;
  private final int mVersionCode;
  private final zzow zzaAD;
  private DataType zzavT;
  private DataSource zzavU;
  
  static
  {
    zzk localzzk = new com/google/android/gms/fitness/request/zzk;
    localzzk.<init>();
    CREATOR = localzzk;
  }
  
  DataUpdateListenerRegistrationRequest(int paramInt, DataSource paramDataSource, DataType paramDataType, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzavU = paramDataSource;
    this.zzavT = paramDataType;
    this.mPendingIntent = paramPendingIntent;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public DataUpdateListenerRegistrationRequest(DataSource paramDataSource, DataType paramDataType, PendingIntent paramPendingIntent, IBinder paramIBinder)
  {
    this.mVersionCode = 1;
    this.zzavU = paramDataSource;
    this.zzavT = paramDataType;
    this.mPendingIntent = paramPendingIntent;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  private DataUpdateListenerRegistrationRequest(DataUpdateListenerRegistrationRequest.Builder paramBuilder)
  {
    this(localDataSource, localDataType, localPendingIntent, null);
  }
  
  private boolean zzb(DataUpdateListenerRegistrationRequest paramDataUpdateListenerRegistrationRequest)
  {
    Object localObject1 = this.zzavU;
    Object localObject2 = paramDataUpdateListenerRegistrationRequest.zzavU;
    boolean bool = zzw.equal(localObject1, localObject2);
    if (bool)
    {
      localObject1 = this.zzavT;
      localObject2 = paramDataUpdateListenerRegistrationRequest.zzavT;
      bool = zzw.equal(localObject1, localObject2);
      if (bool)
      {
        localObject1 = this.mPendingIntent;
        localObject2 = paramDataUpdateListenerRegistrationRequest.mPendingIntent;
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
      bool = paramObject instanceof DataUpdateListenerRegistrationRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (DataUpdateListenerRegistrationRequest)paramObject;
      bool = zzb((DataUpdateListenerRegistrationRequest)paramObject);
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
    Object[] arrayOfObject = new Object[3];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = this.zzavT;
    arrayOfObject[1] = localObject;
    localObject = this.mPendingIntent;
    arrayOfObject[2] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Object localObject = this.zzavU;
    localzza = localzza.zzg("dataSource", localObject);
    localObject = this.zzavT;
    localzza = localzza.zzg("dataType", localObject);
    localObject = this.mPendingIntent;
    return localzza.zzg("pendingIntent", localObject).toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzk.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\DataUpdateListenerRegistrationRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */