package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;

class zzab$zza
  implements Application.ActivityLifecycleCallbacks
{
  private zzab$zza(zzab paramzzab) {}
  
  private boolean zzfo(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    zzab localzzab;
    if (!bool)
    {
      localzzab = this.zzaYH;
      String str1 = "auto";
      String str2 = "_ldl";
      localzzab.zza(str1, str2, paramString);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzab = null;
    }
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzaYH;
        localObject1 = ((zzab)localObject1).zzAo();
        localObject1 = ((zzp)localObject1).zzCK();
        localObject3 = "onActivityCreated";
        ((zzp.zza)localObject1).zzfg((String)localObject3);
        localObject1 = paramActivity.getIntent();
        if (localObject1 != null)
        {
          localObject1 = ((Intent)localObject1).getData();
          if (localObject1 != null)
          {
            bool = ((Uri)localObject1).isHierarchical();
            if (bool)
            {
              localObject3 = "referrer";
              localObject1 = ((Uri)localObject1).getQueryParameter((String)localObject3);
              bool = TextUtils.isEmpty((CharSequence)localObject1);
              if (!bool) {
                continue;
              }
            }
          }
        }
        return;
      }
      finally
      {
        Object localObject1;
        boolean bool;
        Object localObject3 = this.zzaYH.zzAo().zzCE();
        String str = "Throwable caught in onActivityCreated";
        ((zzp.zza)localObject3).zzj(str, localObject2);
        continue;
        localObject3 = this.zzaYH;
        localObject3 = ((zzab)localObject3).zzAo();
        localObject3 = ((zzp)localObject3).zzCJ();
        str = "Activity created with referrer";
        ((zzp.zza)localObject3).zzj(str, localObject2);
        zzfo((String)localObject2);
        continue;
      }
      localObject3 = "gclid";
      bool = ((String)localObject1).contains((CharSequence)localObject3);
      if (bool) {
        continue;
      }
      localObject1 = this.zzaYH;
      localObject1 = ((zzab)localObject1).zzAo();
      localObject1 = ((zzp)localObject1).zzCJ();
      localObject3 = "Activity created with data 'referrer' param without gclid";
      ((zzp.zza)localObject1).zzfg((String)localObject3);
    }
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity)
  {
    this.zzaYH.zzCm().zzDw();
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.zzaYH.zzCm().zzDu();
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\internal\zzab$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */