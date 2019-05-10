package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzx$zza
  extends Binder
  implements zzx
{
  public zzx$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
  }
  
  public static zzx zzn(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzx)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzx;
        if (bool)
        {
          localObject = (zzx)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzx$zza$zza;
      ((zzx.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.ads.internal.client.ICorrelationIdProvider";
      paramParcel1.enforceInterface(str);
      long l = getValue();
      paramParcel2.writeNoException();
      paramParcel2.writeLong(l);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */