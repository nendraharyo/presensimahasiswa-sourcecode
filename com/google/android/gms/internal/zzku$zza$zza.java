package com.google.android.gms.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;

class zzku$zza$zza
  implements zzku
{
  private IBinder zzoz;
  
  zzku$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(Account paramAccount, int paramInt, zzkt paramzzkt)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject3;
    for (Object localObject1 = "com.google.android.gms.auth.api.accountstatus.internal.IAccountStatusService";; localObject3 = null) {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramAccount != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramAccount.writeToParcel(localParcel1, 0);
        }
        for (;;)
        {
          localParcel1.writeInt(paramInt);
          if (paramzzkt == null) {
            break;
          }
          localObject1 = paramzzkt.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          localObject1 = this.zzoz;
          int j = 1;
          ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
          localParcel2.readException();
          return;
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzku$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */