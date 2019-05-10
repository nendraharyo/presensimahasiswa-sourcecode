package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.proxy.ProxyGrpcRequest;
import com.google.android.gms.auth.api.proxy.ProxyRequest;

public abstract class zzlb$zza
  extends Binder
  implements zzlb
{
  public static zzlb zzaA(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzlb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzlb;
        if (bool)
        {
          localObject = (zzlb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzlb$zza$zza;
      ((zzlb.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool1 = false;
    Object localObject = null;
    boolean bool2 = true;
    switch (paramInt1)
    {
    default: 
      bool1 = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool1;
      localObject = "com.google.android.gms.auth.api.internal.IAuthService";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
      zzla localzzla = zzla.zza.zzaz(paramParcel1.readStrongBinder());
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ProxyRequest)ProxyRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzla, (ProxyRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.auth.api.internal.IAuthService");
      localzzla = zzla.zza.zzaz(paramParcel1.readStrongBinder());
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ProxyGrpcRequest)ProxyGrpcRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza(localzzla, (ProxyGrpcRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */