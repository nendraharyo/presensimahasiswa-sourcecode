package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzce$zza
  extends Binder
  implements zzce
{
  public zzce$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
  }
  
  public static zzce zzr(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzce)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzce;
        if (bool)
        {
          localObject = (zzce)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzce$zza$zza;
      ((zzce.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
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
      Object localObject = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      localObject = zzdF();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      localObject = getContent();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd");
      localObject = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      zzb((zzd)localObject);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd";
      paramParcel1.enforceInterface((String)localObject);
      recordClick();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.customrenderedad.client.ICustomRenderedAd";
      paramParcel1.enforceInterface((String)localObject);
      recordImpression();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzce$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */