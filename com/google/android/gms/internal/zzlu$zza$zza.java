package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzlu$zza$zza
  implements zzlu
{
  private IBinder zzoz;
  
  zzlu$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zzbp(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.cast.remote_display.ICastRemoteDisplaySessionCallbacks";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 1;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlu$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */