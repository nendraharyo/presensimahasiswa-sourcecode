package com.google.android.gms.nearby.messages.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzi$zza
  extends Binder
  implements zzi
{
  public zzi$zza()
  {
    attachInterface(this, "com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
  }
  
  public static zzi zzdD(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzi)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.messages.internal.ISubscribeCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzi;
        if (bool)
        {
          localObject = (zzi)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/nearby/messages/internal/zzi$zza$zza;
      ((zzi.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.nearby.messages.internal.ISubscribeCallback";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.nearby.messages.internal.ISubscribeCallback";
      paramParcel1.enforceInterface(str);
      onExpired();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzi$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */