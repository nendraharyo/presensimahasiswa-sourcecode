package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzq$zza
  extends Binder
  implements zzq
{
  public zzq$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdListener");
  }
  
  public static zzq zzg(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzq)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzq;
        if (bool)
        {
          localObject = (zzq)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzq$zza$zza;
      ((zzq.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.ads.internal.client.IAdListener";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdListener";
      paramParcel1.enforceInterface(str);
      onAdClosed();
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdListener";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      onAdFailedToLoad(i);
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdListener";
      paramParcel1.enforceInterface(str);
      onAdLeftApplication();
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdListener";
      paramParcel1.enforceInterface(str);
      onAdLoaded();
      paramParcel2.writeNoException();
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdListener";
      paramParcel1.enforceInterface(str);
      onAdOpened();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */