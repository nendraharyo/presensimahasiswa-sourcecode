package com.google.android.gms.internal;

import android.os.IBinder;
import android.os.Parcel;

class zzqf$zza$zza
  implements zzqf
{
  private IBinder zzoz;
  
  zzqf$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IDataListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeInt(paramInt);
      localObject1 = this.zzoz;
      int i = 2;
      int j = 1;
      ((IBinder)localObject1).transact(i, localParcel, null, j);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void zzs(byte[] paramArrayOfByte)
  {
    Parcel localParcel = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.nearby.bootstrap.internal.IDataListener";
    try
    {
      localParcel.writeInterfaceToken((String)localObject1);
      localParcel.writeByteArray(paramArrayOfByte);
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


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqf$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */