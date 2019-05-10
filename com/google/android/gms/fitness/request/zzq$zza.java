package com.google.android.gms.fitness.request;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.fitness.data.BleDevice;

public abstract class zzq$zza
  extends Binder
  implements zzq
{
  public zzq$zza()
  {
    attachInterface(this, "com.google.android.gms.fitness.request.IBleScanCallback");
  }
  
  public static zzq zzbU(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzq)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.fitness.request.IBleScanCallback");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzq;
        if (bool)
        {
          localObject = (zzq)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/fitness/request/zzq$zza$zza;
      ((zzq.zza.zza)localObject).<init>(paramIBinder);
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
      Object localObject = "com.google.android.gms.fitness.request.IBleScanCallback";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      localObject = "com.google.android.gms.fitness.request.IBleScanCallback";
      paramParcel1.enforceInterface((String)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = (BleDevice)BleDevice.CREATOR.createFromParcel(paramParcel1);; localObject = null)
      {
        onDeviceFound((BleDevice)localObject);
        j = i;
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.fitness.request.IBleScanCallback";
      paramParcel1.enforceInterface((String)localObject);
      onScanStopped();
      j = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\request\zzq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */