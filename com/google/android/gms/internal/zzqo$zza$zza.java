package com.google.android.gms.internal;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class zzqo$zza$zza
  implements zzqo
{
  private IBinder zzoz;
  
  zzqo$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(int paramInt1, Bundle paramBundle, int paramInt2, Intent paramIntent)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    Object localObject1 = "com.google.android.gms.panorama.internal.IPanoramaCallbacks";
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken((String)localObject1);
        localParcel1.writeInt(paramInt1);
        if (paramBundle != null)
        {
          i = 1;
          localParcel1.writeInt(i);
          i = 0;
          localObject1 = null;
          paramBundle.writeToParcel(localParcel1, 0);
          localParcel1.writeInt(paramInt2);
          if (paramIntent != null)
          {
            i = 1;
            localParcel1.writeInt(i);
            i = 0;
            localObject1 = null;
            paramIntent.writeToParcel(localParcel1, 0);
            localObject1 = this.zzoz;
            int j = 1;
            ((IBinder)localObject1).transact(j, localParcel1, localParcel2, 0);
            localParcel2.readException();
          }
        }
        else
        {
          i = 0;
          localObject1 = null;
          localParcel1.writeInt(0);
          continue;
        }
        int i = 0;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
      Object localObject3 = null;
      localParcel1.writeInt(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqo$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */