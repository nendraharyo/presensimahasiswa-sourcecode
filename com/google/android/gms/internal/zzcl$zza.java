package com.google.android.gms.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import java.util.List;

public abstract class zzcl$zza
  extends Binder
  implements zzcl
{
  public zzcl$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
  }
  
  public static zzcl zzw(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzcl)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzcl;
        if (bool)
        {
          localObject = (zzcl)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzcl$zza$zza;
      ((zzcl.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    Object localObject1 = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      Object localObject2 = zzdL();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((zzd)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getHeadline();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getImages();
      paramParcel2.writeNoException();
      paramParcel2.writeList((List)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getBody();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject2 = zzdK();
      paramParcel2.writeNoException();
      if (localObject2 != null) {
        localObject1 = ((zzch)localObject2).asBinder();
      }
      paramParcel2.writeStrongBinder((IBinder)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getCallToAction();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
      paramParcel1.enforceInterface((String)localObject1);
      double d = getStarRating();
      paramParcel2.writeNoException();
      paramParcel2.writeDouble(d);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getStore();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getPrice();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject1);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
      localObject1 = getExtras();
      paramParcel2.writeNoException();
      if (localObject1 != null)
      {
        paramParcel2.writeInt(i);
        ((Bundle)localObject1).writeToParcel(paramParcel2, i);
      }
      for (;;)
      {
        bool = i;
        break;
        bool = false;
        localObject1 = null;
        paramParcel2.writeInt(0);
      }
      localObject1 = "com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd";
      paramParcel1.enforceInterface((String)localObject1);
      destroy();
      paramParcel2.writeNoException();
      bool = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzcl$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */