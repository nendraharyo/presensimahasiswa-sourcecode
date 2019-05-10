package com.google.android.gms.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

class zzpp$zza$zza
  implements zzpp
{
  private IBinder zzoz;
  
  zzpp$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(zzpo paramzzpo, UserAddressRequest paramUserAddressRequest, Bundle paramBundle)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.identity.intents.internal.IAddressService";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        if (paramzzpo != null)
        {
          localObject1 = paramzzpo.asBinder();
          localParcel1.writeStrongBinder((IBinder)localObject1);
          if (paramUserAddressRequest != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramUserAddressRequest.writeToParcel(localParcel1, 0);
            if (paramBundle == null) {
              break label173;
            }
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramBundle.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 2;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          continue;
        }
        int i = 0;
        localObject1 = null;
        localParcel1.writeInt(0);
        continue;
        i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      label173:
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzpp$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */