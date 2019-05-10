package com.google.android.gms.vision.barcode.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;

class zzd$zza
  extends zzg
{
  private static zza zzbny;
  
  zzd$zza()
  {
    super("com.google.android.gms.vision.client.DynamiteNativeBarcodeDetectorCreator");
  }
  
  static zzb zza(Context paramContext, BarcodeDetectorOptions paramBarcodeDetectorOptions)
  {
    zza localzza = zzbny;
    if (localzza == null)
    {
      localzza = new com/google/android/gms/vision/barcode/internal/client/zzd$zza;
      localzza.<init>();
      zzbny = localzza;
    }
    return zzbny.zzb(paramContext, paramBarcodeDetectorOptions);
  }
  
  private zzb zzb(Context paramContext, BarcodeDetectorOptions paramBarcodeDetectorOptions)
  {
    try
    {
      localObject1 = zze.zzC(paramContext);
      localObject2 = zzaB(paramContext);
      localObject2 = (zzc)localObject2;
      localObject2 = ((zzc)localObject2).zza((zzd)localObject1, paramBarcodeDetectorOptions);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2;
        localObject1 = "NativeBarcodeDetectorHandle";
        str = "Error creating native barcode detector";
        Log.e((String)localObject1, str, localRemoteException);
        Object localObject3 = null;
      }
    }
    catch (zzg.zza localzza)
    {
      for (;;)
      {
        Object localObject1 = "NativeBarcodeDetectorHandle";
        String str = "Error creating native barcode detector";
        Log.e((String)localObject1, str, localzza);
      }
    }
    return (zzb)localObject2;
  }
  
  protected zzc zzef(IBinder paramIBinder)
  {
    return zzc.zza.zzee(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\vision\barcode\internal\client\zzd$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */