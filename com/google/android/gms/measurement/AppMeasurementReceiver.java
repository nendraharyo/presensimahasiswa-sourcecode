package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrp;
import com.google.android.gms.measurement.internal.zzaj;
import com.google.android.gms.measurement.internal.zzd;
import com.google.android.gms.measurement.internal.zzp;
import com.google.android.gms.measurement.internal.zzp.zza;
import com.google.android.gms.measurement.internal.zzw;

public final class AppMeasurementReceiver
  extends BroadcastReceiver
{
  static zzrp zzOM;
  static Boolean zzON;
  static final Object zzqy;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    zzqy = localObject;
  }
  
  public static boolean zzY(Context paramContext)
  {
    zzx.zzz(paramContext);
    Object localObject = zzON;
    boolean bool;
    if (localObject != null)
    {
      localObject = zzON;
      bool = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool;
      localObject = AppMeasurementReceiver.class;
      bool = zzaj.zza(paramContext, (Class)localObject, false);
      Boolean localBoolean = Boolean.valueOf(bool);
      zzON = localBoolean;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = zzw.zzaT(paramContext);
    localObject3 = ((zzw)localObject1).zzAo();
    Object localObject4 = paramIntent.getAction();
    localObject1 = ((zzw)localObject1).zzCp();
    boolean bool = ((zzd)localObject1).zzkr();
    if (bool)
    {
      localObject1 = ((zzp)localObject3).zzCK();
      ??? = "Device AppMeasurementReceiver got";
      ((zzp.zza)localObject1).zzj((String)???, localObject4);
    }
    for (;;)
    {
      localObject1 = "com.google.android.gms.measurement.UPLOAD";
      bool = ((String)localObject1).equals(localObject4);
      if (bool)
      {
        bool = AppMeasurementService.zzZ(paramContext);
        localObject4 = new android/content/Intent;
        ((Intent)localObject4).<init>(paramContext, AppMeasurementService.class);
        ((Intent)localObject4).setAction("com.google.android.gms.measurement.UPLOAD");
      }
      synchronized (zzqy)
      {
        paramContext.startService((Intent)localObject4);
        if (!bool)
        {
          return;
          localObject1 = ((zzp)localObject3).zzCK();
          ??? = "Local AppMeasurementReceiver got";
          ((zzp.zza)localObject1).zzj((String)???, localObject4);
          continue;
        }
        try
        {
          localObject1 = zzOM;
          if (localObject1 == null)
          {
            localObject1 = new com/google/android/gms/internal/zzrp;
            int i = 1;
            String str = "AppMeasurement WakeLock";
            ((zzrp)localObject1).<init>(paramContext, i, str);
            zzOM = (zzrp)localObject1;
            localObject1 = zzOM;
            i = 0;
            localObject4 = null;
            ((zzrp)localObject1).setReferenceCounted(false);
          }
          localObject1 = zzOM;
          long l = 1000L;
          ((zzrp)localObject1).acquire(l);
        }
        catch (SecurityException localSecurityException)
        {
          for (;;)
          {
            zzp.zza localzza = ((zzp)localObject3).zzCF();
            localObject3 = "AppMeasurementService at risk of not starting. For more reliable app measurements, add the WAKE_LOCK permission to your manifest.";
            localzza.zzfg((String)localObject3);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\AppMeasurementReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */