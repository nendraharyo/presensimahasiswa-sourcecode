package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzlt$zza
  extends Binder
  implements zzlt
{
  public static zzlt zzaI(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzlt)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzlt;
        if (bool)
        {
          localObject = (zzlt)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzlt$zza$zza;
      ((zzlt.zza.zza)localObject).<init>(paramIBinder);
    }
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
      Object localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
      paramParcel2.writeString((String)localObject);
      continue;
      localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
      paramParcel1.enforceInterface((String)localObject);
      destroy();
      continue;
      localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayService";
      paramParcel1.enforceInterface((String)localObject);
      disconnect();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      localObject = zzls.zza.zzaH(paramParcel1.readStrongBinder());
      zzlu localzzlu = zzlu.zza.zzaJ(paramParcel1.readStrongBinder());
      String str1 = paramParcel1.readString();
      String str2 = paramParcel1.readString();
      zza((zzls)localObject, localzzlu, str1, str2);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      localObject = zzls.zza.zzaH(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      zza((zzls)localObject, i);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayService");
      localObject = zzls.zza.zzaH(paramParcel1.readStrongBinder());
      zza((zzls)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlt$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */