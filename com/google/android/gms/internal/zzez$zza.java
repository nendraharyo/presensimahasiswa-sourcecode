package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzez$zza
  extends Binder
  implements zzez
{
  public zzez$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
  }
  
  public static zzez zzG(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzez)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzez;
        if (bool)
        {
          localObject = (zzez)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzez$zza$zza;
      ((zzez.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      onAdClicked();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      onAdClosed();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      int i = paramParcel1.readInt();
      onAdFailedToLoad(i);
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      onAdLeftApplication();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      onAdOpened();
      paramParcel2.writeNoException();
      continue;
      localObject = "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener";
      paramParcel1.enforceInterface((String)localObject);
      onAdLoaded();
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
      localObject = zzfa.zza.zzH(paramParcel1.readStrongBinder());
      zza((zzfa)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzez$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */