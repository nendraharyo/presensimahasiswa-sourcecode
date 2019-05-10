package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzg$zza$zza
  implements zzg
{
  private IBinder zzoz;
  
  zzg$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void onExpired()
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.messages.internal.IPublishCallback";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzg$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */