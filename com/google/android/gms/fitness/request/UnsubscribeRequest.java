package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzow;
import com.google.android.gms.internal.zzow.zza;

public class UnsubscribeRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzow zzaAD;
  private final DataType zzavT;
  private final DataSource zzavU;
  
  static
  {
    zzah localzzah = new com/google/android/gms/fitness/request/zzah;
    localzzah.<init>();
    CREATOR = localzzah;
  }
  
  UnsubscribeRequest(int paramInt, DataType paramDataType, DataSource paramDataSource, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzavT = paramDataType;
    this.zzavU = paramDataSource;
    zzow localzzow = zzow.zza.zzbR(paramIBinder);
    this.zzaAD = localzzow;
  }
  
  public UnsubscribeRequest(DataType paramDataType, DataSource paramDataSource, zzow paramzzow)
  {
    this.mVersionCode = 3;
    this.zzavT = paramDataType;
    this.zzavU = paramDataSource;
    this.zzaAD = paramzzow;
  }
  
  private boolean zzb(UnsubscribeRequest paramUnsubscribeRequest)
  {
    Object localObject1 = this.zzavU;
    Object localObject2 = paramUnsubscribeRequest.zzavU;
    boolean bool = zzw.equal(localObject1, localObject2);
    if (bool)
    {
      localObject1 = this.zzavT;
      localObject2 = paramUnsubscribeRequest.zzavT;
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
      bool = paramObject instanceof UnsubscribeRequest;
      if (!bool) {
        break label33;
      }
      paramObject = (UnsubscribeRequest)paramObject;
      bool = zzb((UnsubscribeRequest)paramObject);
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
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    Object localObject = this.zzavU;
    arrayOfObject[0] = localObject;
    localObject = this.zzavT;
    arrayOfObject[1] = localObject;
    return zzw.hashCode(arrayOfObject);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzah.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\UnsubscribeRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */