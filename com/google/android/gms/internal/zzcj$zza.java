package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzcj$zza
  extends Binder
  implements zzcj
{
  public zzcj$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
  }
  
  public static zzcj zzu(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzcj)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzcj;
        if (bool)
        {
          localObject = (zzcj)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzcj$zza$zza;
      ((zzcj.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2;
    switch (paramInt1)
    {
    default: 
      bool2 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool2;
      Object localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
      paramParcel2.writeString((String)localObject);
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = paramParcel1.readString();
      zzd localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zza((String)localObject, localzzd);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = paramParcel1.readString();
      localObject = zzK((String)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((zzd)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool2 = bool1;
        break;
        bool2 = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zza((zzd)localObject);
      paramParcel2.writeNoException();
      bool2 = bool1;
      continue;
      localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate";
      paramParcel1.enforceInterface((String)localObject);
      destroy();
      paramParcel2.writeNoException();
      bool2 = bool1;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcj$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */