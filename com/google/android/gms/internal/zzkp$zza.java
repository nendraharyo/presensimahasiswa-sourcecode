package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzkp$zza
  extends Binder
  implements zzkp
{
  public static zzkp zzal(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzkp)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzkp;
        if (bool)
        {
          localObject = (zzkp)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzkp$zza$zza;
      ((zzkp.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.appinvite.internal.IAppInviteService";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
      localObject = zzko.zza.zzak(paramParcel1.readStrongBinder());
      String str = paramParcel1.readString();
      zzb((zzko)localObject, str);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
      localObject = zzko.zza.zzak(paramParcel1.readStrongBinder());
      str = paramParcel1.readString();
      zza((zzko)localObject, str);
      paramParcel2.writeNoException();
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.appinvite.internal.IAppInviteService");
      localObject = zzko.zza.zzak(paramParcel1.readStrongBinder());
      zza((zzko)localObject);
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkp$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */