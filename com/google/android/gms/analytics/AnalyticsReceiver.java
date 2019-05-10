package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrp;

public final class AnalyticsReceiver
  extends BroadcastReceiver
{
  static zzrp zzOM;
  static Boolean zzON;
  static Object zzqy;
  
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
      localObject = AnalyticsReceiver.class;
      bool = zzam.zza(paramContext, (Class)localObject, false);
      Boolean localBoolean = Boolean.valueOf(bool);
      zzON = localBoolean;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = zzf.zzaa(paramContext);
    localzzaf = ((zzf)localObject1).zzjm();
    Object localObject3 = paramIntent.getAction();
    localObject1 = ((zzf)localObject1).zzjn();
    boolean bool = ((zzr)localObject1).zzkr();
    if (bool)
    {
      localObject1 = "Device AnalyticsReceiver got";
      localzzaf.zza((String)localObject1, localObject3);
    }
    for (;;)
    {
      localObject1 = "com.google.android.gms.analytics.ANALYTICS_DISPATCH";
      bool = ((String)localObject1).equals(localObject3);
      if (bool)
      {
        bool = AnalyticsService.zzZ(paramContext);
        localObject3 = new android/content/Intent;
        ((Intent)localObject3).<init>(paramContext, AnalyticsService.class);
        ((Intent)localObject3).setAction("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
      }
      synchronized (zzqy)
      {
        paramContext.startService((Intent)localObject3);
        if (!bool)
        {
          return;
          localObject1 = "Local AnalyticsReceiver got";
          localzzaf.zza((String)localObject1, localObject3);
          continue;
        }
        try
        {
          localObject1 = zzOM;
          if (localObject1 == null)
          {
            localObject1 = new com/google/android/gms/internal/zzrp;
            int i = 1;
            String str2 = "Analytics WakeLock";
            ((zzrp)localObject1).<init>(paramContext, i, str2);
            zzOM = (zzrp)localObject1;
            localObject1 = zzOM;
            i = 0;
            localObject3 = null;
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
            String str1 = "Analytics service at risk of not starting. For more reliable analytics, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.";
            localzzaf.zzbg(str1);
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\AnalyticsReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */