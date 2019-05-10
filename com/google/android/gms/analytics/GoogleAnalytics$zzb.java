package com.google.android.gms.analytics;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

class GoogleAnalytics$zzb
  implements Application.ActivityLifecycleCallbacks
{
  GoogleAnalytics$zzb(GoogleAnalytics paramGoogleAnalytics) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    this.zzPl.zzj(paramActivity);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    this.zzPl.zzk(paramActivity);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\GoogleAnalytics$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */