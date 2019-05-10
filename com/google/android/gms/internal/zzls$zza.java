package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.view.Surface;

public abstract class zzls$zza
  extends Binder
  implements zzls
{
  public zzls$zza()
  {
    attachInterface(this, "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
  }
  
  public static zzls zzaH(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzls)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzls;
        if (bool)
        {
          localObject = (zzls)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzls$zza$zza;
      ((zzls.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    boolean bool;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      Object localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
      paramParcel1.enforceInterface((String)localObject);
      int k = paramParcel1.readInt();
      int m = paramParcel1.readInt();
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (Surface)Surface.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        zza(k, m, (Surface)localObject);
        paramParcel2.writeNoException();
        j = i;
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      onError(j);
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
      paramParcel1.enforceInterface((String)localObject);
      onDisconnected();
      paramParcel2.writeNoException();
      j = i;
      continue;
      localObject = "com.google.android.gms.cast.remote_display.ICastRemoteDisplayCallbacks";
      paramParcel1.enforceInterface((String)localObject);
      zzoD();
      paramParcel2.writeNoException();
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzls$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */