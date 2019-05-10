package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.internal.zzor;
import com.google.android.gms.internal.zzor.zza;

public class ListSubscriptionsRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  private final int mVersionCode;
  private final zzor zzaBd;
  private final DataType zzavT;
  
  static
  {
    zzs localzzs = new com/google/android/gms/fitness/request/zzs;
    localzzs.<init>();
    CREATOR = localzzs;
  }
  
  ListSubscriptionsRequest(int paramInt, DataType paramDataType, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    this.zzavT = paramDataType;
    zzor localzzor = zzor.zza.zzbM(paramIBinder);
    this.zzaBd = localzzor;
  }
  
  public ListSubscriptionsRequest(DataType paramDataType, zzor paramzzor)
  {
    this.mVersionCode = 3;
    this.zzavT = paramDataType;
    this.zzaBd = paramzzor;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getCallbackBinder()
  {
    Object localObject = this.zzaBd;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzaBd.asBinder()) {
      return (IBinder)localObject;
    }
  }
  
  public DataType getDataType()
  {
    return this.zzavT;
  }
  
  int getVersionCode()
  {
    return this.mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzs.zza(this, paramParcel, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\ListSubscriptionsRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */