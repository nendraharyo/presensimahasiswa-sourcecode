package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.nearby.bootstrap.request.ConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.ContinueConnectRequest;
import com.google.android.gms.nearby.bootstrap.request.DisableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.DisconnectRequest;
import com.google.android.gms.nearby.bootstrap.request.EnableTargetRequest;
import com.google.android.gms.nearby.bootstrap.request.SendDataRequest;
import com.google.android.gms.nearby.bootstrap.request.StartScanRequest;
import com.google.android.gms.nearby.bootstrap.request.StopScanRequest;
import com.google.android.gms.nearby.bootstrap.request.zza;
import com.google.android.gms.nearby.bootstrap.request.zzb;
import com.google.android.gms.nearby.bootstrap.request.zzc;
import com.google.android.gms.nearby.bootstrap.request.zzd;
import com.google.android.gms.nearby.bootstrap.request.zze;
import com.google.android.gms.nearby.bootstrap.request.zzf;
import com.google.android.gms.nearby.bootstrap.request.zzg;
import com.google.android.gms.nearby.bootstrap.request.zzh;

public abstract class zzqh$zza
  extends Binder
  implements zzqh
{
  public static zzqh zzdt(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzqh)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzqh;
        if (bool)
        {
          localObject = (zzqh)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzqh$zza$zza;
      ((zzqh.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = StartScanRequest.CREATOR.zzfW(paramParcel1);
      }
      zza((StartScanRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = StopScanRequest.CREATOR.zzfX(paramParcel1);
      }
      zza((StopScanRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = EnableTargetRequest.CREATOR.zzfU(paramParcel1);
      }
      zza((EnableTargetRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = DisableTargetRequest.CREATOR.zzfS(paramParcel1);
      }
      zza((DisableTargetRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = ConnectRequest.CREATOR.zzfQ(paramParcel1);
      }
      zza((ConnectRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = DisconnectRequest.CREATOR.zzfT(paramParcel1);
      }
      zza((DisconnectRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = SendDataRequest.CREATOR.zzfV(paramParcel1);
      }
      zza((SendDataRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = ContinueConnectRequest.CREATOR.zzfR(paramParcel1);
      }
      zza((ContinueConnectRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject = getToken();
      paramParcel2.writeNoException();
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
      localObject = zzqg.zza.zzds(paramParcel1.readStrongBinder());
      zza((zzqg)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqh$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */