package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzr;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzrp;

public class CampaignTrackingReceiver
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
    boolean bool1;
    if (localObject != null)
    {
      localObject = zzON;
      bool1 = ((Boolean)localObject).booleanValue();
    }
    for (;;)
    {
      return bool1;
      localObject = CampaignTrackingReceiver.class;
      boolean bool2 = true;
      bool1 = zzam.zza(paramContext, (Class)localObject, bool2);
      Boolean localBoolean = Boolean.valueOf(bool1);
      zzON = localBoolean;
    }
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Object localObject1 = zzf.zzaa(paramContext);
    localzzaf = ((zzf)localObject1).zzjm();
    ??? = paramIntent.getStringExtra("referrer");
    String str2 = paramIntent.getAction();
    localzzaf.zza("CampaignTrackingReceiver received", str2);
    Object localObject4 = "com.android.vending.INSTALL_REFERRER";
    int i = ((String)localObject4).equals(str2);
    if (i != 0)
    {
      i = TextUtils.isEmpty((CharSequence)???);
      if (i == 0) {}
    }
    else
    {
      localObject1 = "CampaignTrackingReceiver received unexpected intent without referrer extra";
      localzzaf.zzbg((String)localObject1);
    }
    for (;;)
    {
      return;
      i = CampaignTrackingService.zzZ(paramContext);
      if (i == 0)
      {
        localObject4 = "CampaignTrackingService not registered or disabled. Installation tracking not possible. See http://goo.gl/8Rd3yj for instructions.";
        localzzaf.zzbg((String)localObject4);
      }
      zzaV((String)???);
      localObject1 = ((zzf)localObject1).zzjn();
      boolean bool = ((zzr)localObject1).zzkr();
      if (bool)
      {
        localObject1 = "Received unexpected installation campaign on package side";
        localzzaf.zzbh((String)localObject1);
      }
      else
      {
        localObject1 = zziB();
        zzx.zzz(localObject1);
        localObject4 = new android/content/Intent;
        ((Intent)localObject4).<init>(paramContext, (Class)localObject1);
        localObject1 = "referrer";
        ((Intent)localObject4).putExtra((String)localObject1, (String)???);
        synchronized (zzqy)
        {
          paramContext.startService((Intent)localObject4);
          if (i != 0) {}
        }
      }
      try
      {
        zzrp localzzrp = zzOM;
        if (localzzrp == null)
        {
          localzzrp = new com/google/android/gms/internal/zzrp;
          i = 1;
          localObject4 = "Analytics campaign WakeLock";
          localzzrp.<init>(paramContext, i, (String)localObject4);
          zzOM = localzzrp;
          localzzrp = zzOM;
          int j = 0;
          str2 = null;
          localzzrp.setReferenceCounted(false);
        }
        localzzrp = zzOM;
        long l = 1000L;
        localzzrp.acquire(l);
      }
      catch (SecurityException localSecurityException)
      {
        for (;;)
        {
          String str1 = "CampaignTrackingService service at risk of not starting. For more reliable installation campaign reports, add the WAKE_LOCK permission to your manifest. See http://goo.gl/8Rd3yj for instructions.";
          localzzaf.zzbg(str1);
        }
      }
    }
  }
  
  protected void zzaV(String paramString) {}
  
  protected Class zziB()
  {
    return CampaignTrackingService.class;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\CampaignTrackingReceiver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */