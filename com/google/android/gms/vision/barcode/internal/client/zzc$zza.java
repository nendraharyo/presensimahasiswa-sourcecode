package com.google.android.gms.vision.barcode.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzee(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzc;
        if (bool)
        {
          localObject = (zzc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/vision/barcode/internal/client/zzc$zza$zza;
      ((zzc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    IBinder localIBinder = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
    case 1598968902: 
      for (boolean bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);; bool = i)
      {
        return bool;
        localObject = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator";
        paramParcel2.writeString((String)localObject);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetectorCreator");
    Object localObject = paramParcel1.readStrongBinder();
    zzd localzzd = zzd.zza.zzbs((IBinder)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = BarcodeDetectorOptions.CREATOR.zzhj(paramParcel1);; localObject = null)
    {
      localObject = zza(localzzd, (BarcodeDetectorOptions)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzb)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */