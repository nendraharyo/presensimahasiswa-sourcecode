package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class RemoveListenerRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR;
  final int mVersionCode;
  public final zzaw zzbrB;
  
  static
  {
    zzbg localzzbg = new com/google/android/gms/wearable/internal/zzbg;
    localzzbg.<init>();
    CREATOR = localzzbg;
  }
  
  RemoveListenerRequest(int paramInt, IBinder paramIBinder)
  {
    this.mVersionCode = paramInt;
    zzaw localzzaw;
    if (paramIBinder != null) {
      localzzaw = zzaw.zza.zzet(paramIBinder);
    }
    for (this.zzbrB = localzzaw;; this.zzbrB = null)
    {
      return;
      localzzaw = null;
    }
  }
  
  public RemoveListenerRequest(zzaw paramzzaw)
  {
    this.mVersionCode = 1;
    this.zzbrB = paramzzaw;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzbg.zza(this, paramParcel, paramInt);
  }
  
  IBinder zzIy()
  {
    Object localObject = this.zzbrB;
    if (localObject == null) {}
    for (localObject = null;; localObject = this.zzbrB.asBinder()) {
      return (IBinder)localObject;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\RemoveListenerRequest.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */