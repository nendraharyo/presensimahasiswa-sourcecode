package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public final class BinderWrapper
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  private IBinder zzakD = null;
  
  static
  {
    BinderWrapper.1 local1 = new com/google/android/gms/common/internal/BinderWrapper$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BinderWrapper() {}
  
  public BinderWrapper(IBinder paramIBinder)
  {
    this.zzakD = paramIBinder;
  }
  
  private BinderWrapper(Parcel paramParcel)
  {
    IBinder localIBinder = paramParcel.readStrongBinder();
    this.zzakD = localIBinder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    IBinder localIBinder = this.zzakD;
    paramParcel.writeStrongBinder(localIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\BinderWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */