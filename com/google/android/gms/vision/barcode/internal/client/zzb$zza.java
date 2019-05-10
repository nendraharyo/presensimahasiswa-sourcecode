package com.google.android.gms.vision.barcode.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.internal.client.zza;

public abstract class zzb$zza
  extends Binder
  implements zzb
{
  public static zzb zzed(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzb)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzb;
        if (bool)
        {
          localObject = (zzb)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/vision/barcode/internal/client/zzb$zza$zza;
      ((zzb.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    boolean bool = false;
    Object localObject = null;
    int i = 1;
    switch (paramInt1)
    {
    default: 
      bool = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return bool;
      localObject = "com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector";
      paramParcel2.writeString((String)localObject);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
      zzd localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      int j = paramParcel1.readInt();
      if (j != 0) {
        localObject = FrameMetadataParcel.CREATOR.zzhn(paramParcel1);
      }
      localObject = zza(localzzd, (FrameMetadataParcel)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedArray((Parcelable[])localObject, i);
      bool = i;
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.vision.barcode.internal.client.INativeBarcodeDetector");
      localzzd = zzd.zza.zzbs(paramParcel1.readStrongBinder());
      j = paramParcel1.readInt();
      if (j != 0) {
        localObject = FrameMetadataParcel.CREATOR.zzhn(paramParcel1);
      }
      localObject = zzb(localzzd, (FrameMetadataParcel)localObject);
      paramParcel2.writeNoException();
      paramParcel2.writeTypedArray((Parcelable[])localObject, i);
      bool = i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\zzb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */