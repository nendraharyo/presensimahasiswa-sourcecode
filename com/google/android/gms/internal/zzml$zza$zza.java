package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzml$zza$zza
  implements zzml
{
  private IBinder zzoz;
  
  zzml$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(zzmk paramzzmk)
  {
    IBinder localIBinder = null;
    Parcel localParcel = Parcel.obtain();
    String str = "com.google.android.gms.common.internal.service.ICommonService";
    try
    {
      localParcel.writeInterfaceToken(str);
      if (paramzzmk != null) {
        localIBinder = paramzzmk.asBinder();
      }
      localParcel.writeStrongBinder(localIBinder);
      localIBinder = this.zzoz;
      int i = 1;
      int j = 1;
      localIBinder.transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzml$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */