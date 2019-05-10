package com.google.android.gms.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.request.ClaimBleDeviceRequest;
import com.google.android.gms.fitness.request.ListClaimedBleDevicesRequest;
import com.google.android.gms.fitness.request.StartBleScanRequest;
import com.google.android.gms.fitness.request.StopBleScanRequest;
import com.google.android.gms.fitness.request.UnclaimBleDeviceRequest;

public abstract class zzok$zza
  extends Binder
  implements zzok
{
  public static zzok zzbF(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzok)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzok;
        if (bool)
        {
          localObject = (zzok)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/internal/zzok$zza$zza;
      ((zzok.zza.zza)localObject).<init>(paramIBinder);
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
      localObject = "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
      paramParcel2.writeString((String)localObject);
      bool1 = bool2;
      continue;
      String str = "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
      paramParcel1.enforceInterface(str);
      int i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (StartBleScanRequest)StartBleScanRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StartBleScanRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (StopBleScanRequest)StopBleScanRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((StopBleScanRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ClaimBleDeviceRequest)ClaimBleDeviceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ClaimBleDeviceRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (UnclaimBleDeviceRequest)UnclaimBleDeviceRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((UnclaimBleDeviceRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
      continue;
      str = "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
      paramParcel1.enforceInterface(str);
      i = paramParcel1.readInt();
      if (i != 0) {
        localObject = (ListClaimedBleDevicesRequest)ListClaimedBleDevicesRequest.CREATOR.createFromParcel(paramParcel1);
      }
      zza((ListClaimedBleDevicesRequest)localObject);
      paramParcel2.writeNoException();
      bool1 = bool2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzok$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */