package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzex.zza;

public abstract class zzt$zza
  extends Binder
  implements zzt
{
  public static zzt zzj(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzt)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzt;
        if (bool)
        {
          localObject = (zzt)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzt$zza$zza;
      ((zzt.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = true;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      String str = paramParcel1.readString();
      zzex localzzex = zzex.zza.zzE(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      localObject = zza((zzd)localObject, str, localzzex, i);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzt$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */