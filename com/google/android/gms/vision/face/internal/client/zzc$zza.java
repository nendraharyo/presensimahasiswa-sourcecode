package com.google.android.gms.vision.face.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zzd.zza;
import com.google.android.gms.vision.internal.client.FrameMetadataParcel;
import com.google.android.gms.vision.internal.client.zza;

public abstract class zzc$zza
  extends Binder
  implements zzc
{
  public static zzc zzeg(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzc)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzc;
        if (bool)
        {
          localObject = (zzc)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/vision/face/internal/client/zzc$zza$zza;
      ((zzc.zza.zza)localObject).<init>(paramIBinder);
    }
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    int i = 1;
    switch (paramInt1)
    {
    default: 
      i = super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    }
    for (;;)
    {
      return i;
      Object localObject = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector";
      paramParcel2.writeString((String)localObject);
      continue;
      paramParcel1.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      localObject = paramParcel1.readStrongBinder();
      zzd localzzd = zzd.zza.zzbs((IBinder)localObject);
      int j = paramParcel1.readInt();
      if (j != 0) {}
      for (localObject = FrameMetadataParcel.CREATOR.zzhn(paramParcel1);; localObject = null)
      {
        localObject = zzc(localzzd, (FrameMetadataParcel)localObject);
        paramParcel2.writeNoException();
        paramParcel2.writeTypedArray((Parcelable[])localObject, i);
        break;
        j = 0;
      }
      localObject = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector";
      paramParcel1.enforceInterface((String)localObject);
      j = paramParcel1.readInt();
      int k = zzkJ(j);
      paramParcel2.writeNoException();
      if (k != 0) {
        k = i;
      }
      for (;;)
      {
        paramParcel2.writeInt(k);
        break;
        int m = 0;
        localObject = null;
      }
      localObject = "com.google.android.gms.vision.face.internal.client.INativeFaceDetector";
      paramParcel1.enforceInterface((String)localObject);
      zzIh();
      paramParcel2.writeNoException();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */