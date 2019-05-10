package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;

public abstract class zzch$zza
  extends Binder
  implements zzch
{
  public zzch$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAdImage");
  }
  
  public static zzch zzt(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzch)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzch;
        if (bool)
        {
          localObject = (zzch)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzch$zza$zza;
      ((zzch.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      localObject = zzdJ();
      paramParcel2.writeNoException();
      if (localObject != null) {}
      for (localObject = ((zzd)localObject).asBinder();; localObject = null)
      {
        paramParcel2.writeStrongBinder((IBinder)localObject);
        bool = i;
        break;
        bool = false;
      }
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
      localObject = getUri();
      paramParcel2.writeNoException();
      if (localObject != null)
      {
        paramParcel2.writeInt(i);
        ((Uri)localObject).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        bool = false;
        localObject = null;
        paramParcel2.writeInt(0);
      }
      localObject = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
      paramParcel1.enforceInterface((String)localObject);
      double d = getScale();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      bool = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzch$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */