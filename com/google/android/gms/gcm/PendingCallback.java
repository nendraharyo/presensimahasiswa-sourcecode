package com.google.android.gms.gcm;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class PendingCallback
  implements Parcelable
{
  public static final Parcelable.Creator CREATOR;
  final IBinder zzakD;
  
  static
  {
    PendingCallback.1 local1 = new com/google/android/gms/gcm/PendingCallback$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public PendingCallback(Parcel paramParcel)
  {
    IBinder localIBinder = paramParcel.readStrongBinder();
    this.zzakD = localIBinder;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public IBinder getIBinder()
  {
    return this.zzakD;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    IBinder localIBinder = this.zzakD;
    paramParcel.writeStrongBinder(localIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\gcm\PendingCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */