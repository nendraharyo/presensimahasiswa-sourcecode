package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzw$zza
  extends Binder
  implements zzw
{
  public zzw$zza()
  {
    attachInterface(this, "com.google.android.gms.ads.internal.client.IAppEventListener");
  }
  
  public static zzw zzm(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzw)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzw;
        if (bool)
        {
          localObject = (zzw)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/ads/internal/client/zzw$zza$zza;
      ((zzw.zza.zza)localObject).<init>(paramIBinder);
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
      String str1 = "com.google.android.gms.ads.internal.client.IAppEventListener";
      paramParcel2.writeString(str1);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
      str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      onAppEvent(str1, str2);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzw$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */