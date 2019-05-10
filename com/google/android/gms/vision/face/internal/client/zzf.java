package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;

class zzf
  extends zzg
{
  private static zzf zzboa;
  
  zzf()
  {
    super("com.google.android.gms.vision.client.DynamiteNativeFaceDetectorCreator");
  }
  
  static zzc zza(Context paramContext, FaceSettingsParcel paramFaceSettingsParcel)
  {
    zzf localzzf = zzboa;
    if (localzzf == null)
    {
      localzzf = new com/google/android/gms/vision/face/internal/client/zzf;
      localzzf.<init>();
      zzboa = localzzf;
    }
    return zzboa.zzb(paramContext, paramFaceSettingsParcel);
  }
  
  private zzc zzb(Context paramContext, FaceSettingsParcel paramFaceSettingsParcel)
  {
    try
    {
      localObject1 = zze.zzC(paramContext);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzd)localObject2;
      localObject2 = ((zzd)localObject2).zza((com.google.android.gms.dynamic.zzd)localObject1, paramFaceSettingsParcel);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        Object localObject1 = "FaceDetectorHandle";
        String str = "Could not create native face detector";
        Log.e((String)localObject1, str, localException);
        Object localObject3 = null;
      }
    }
    return (zzc)localObject2;
  }
  
  protected zzd zzei(IBinder paramIBinder)
  {
    return zzd.zza.zzeh(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\face\internal\client\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */