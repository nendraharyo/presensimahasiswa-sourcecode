package com.google.android.gms.vision.face.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class zzd$zza
  extends Binder
  implements zzd
{
  public static zzd zzeh(IBinder paramIBinder)
  {
    Object localObject;
    if (paramIBinder == null) {
      localObject = null;
    }
    for (;;)
    {
      return (zzd)localObject;
      localObject = paramIBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
      if (localObject != null)
      {
        boolean bool = localObject instanceof zzd;
        if (bool)
        {
          localObject = (zzd)localObject;
          continue;
        }
      }
      localObject = new com/google/android/gms/vision/face/internal/client/zzd$zza$zza;
      ((zzd.zza.zza)localObject).<init>(paramIBinder);
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
        localObject = "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator";
        paramParcel2.writeString((String)localObject);
      }
    }
    paramParcel1.enforceInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    Object localObject = paramParcel1.readStrongBinder();
    com.google.android.gms.dynamic.zzd localzzd = com.google.android.gms.dynamic.zzd.zza.zzbs((IBinder)localObject);
    int j = paramParcel1.readInt();
    if (j != 0) {}
    for (localObject = FaceSettingsParcel.CREATOR.zzhl(paramParcel1);; localObject = null)
    {
      localObject = zza(localzzd, (FaceSettingsParcel)localObject);
      paramParcel2.writeNoException();
      if (localObject != null) {
        localIBinder = ((zzc)localObject).asBinder();
      }
      paramParcel2.writeStrongBinder(localIBinder);
      j = i;
      break;
      j = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */