package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

class zzqp$zza$zza
  implements zzqp
{
  private IBinder zzoz;
  
  zzqp$zza$zza(IBinder paramIBinder)
  {
    this.zzoz = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.zzoz;
  }
  
  public void zza(zzqo paramzzqo, Uri paramUri, Bundle paramBundle, boolean paramBoolean)
  {
    int i = 0;
    IBinder localIBinder1 = null;
    int j = 1;
    int k = 0;
    Parcel localParcel = Parcel.obtain();
    String str = "com.google.android.gms.panorama.internal.IPanoramaService";
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken(str);
        if (paramzzqo != null) {
          localIBinder1 = paramzzqo.asBinder();
        }
        localParcel.writeStrongBinder(localIBinder1);
        if (paramUri != null)
        {
          i = 1;
          localParcel.writeInt(i);
          i = 0;
          localIBinder1 = null;
          paramUri.writeToParcel(localParcel, 0);
          if (paramBundle != null)
          {
            i = 1;
            localParcel.writeInt(i);
            i = 0;
            localIBinder1 = null;
            paramBundle.writeToParcel(localParcel, 0);
            if (!paramBoolean) {
              break label192;
            }
            localParcel.writeInt(j);
            IBinder localIBinder2 = this.zzoz;
            k = 1;
            i = 0;
            localIBinder1 = null;
            int m = 1;
            localIBinder2.transact(k, localParcel, null, m);
          }
        }
        else
        {
          i = 0;
          localIBinder1 = null;
          localParcel.writeInt(0);
          continue;
        }
        i = 0;
      }
      finally
      {
        localParcel.recycle();
      }
      localIBinder1 = null;
      localParcel.writeInt(0);
      continue;
      label192:
      j = 0;
      Object localObject2 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqp$zza$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */