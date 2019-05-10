package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzp$zza
  extends Binder
  implements zzp
{
  public zzp$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAdClickListener");
  }
  
  public static zzp zzf(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzp;
        if (bool)
        {
          localObject = (zzp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzp$zza$zza;
      ((zzp.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.ads.internal.client.IAdClickListener";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.client.IAdClickListener";
      paramParcel1.enforceInterface(str);
      onAdClicked();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */