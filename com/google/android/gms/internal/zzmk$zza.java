package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzmk$zza
  extends Binder
  implements zzmk
{
  public zzmk$zza()
  {
    attachInterface(this, "com.google.android.gms.common.internal.service.ICommonCallbacks");
  }
  
  public static zzmk zzaX(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzmk)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.common.internal.service.ICommonCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzmk;
        if (bool)
        {
          localObject = (zzmk)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzmk$zza$zza;
      ((zzmk.zza.zza)localObject).<init>(paramIBinder);
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
      String str = "com.google.android.gms.common.internal.service.ICommonCallbacks";
      paramParcel2.writeString(str);
      continue;
      str = "com.google.android.gms.common.internal.service.ICommonCallbacks";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      zzcb(i);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzmk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */