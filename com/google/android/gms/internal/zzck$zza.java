package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzck$zza
  extends Binder
  implements zzck
{
  public static zzck zzv(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzck)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzck;
        if (bool)
        {
          localObject = (zzck)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzck$zza$zza;
      ((zzck.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzd localzzd1 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzd localzzd2 = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      localObject = zza((zzd)localObject, localzzd1, localzzd2, i);
      paramParcel2.writeNoException();
      paramParcel2.writeStrongBinder((IBinder)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzck$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */