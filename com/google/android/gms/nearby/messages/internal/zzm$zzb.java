package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

class zzm$zzb
  implements Application.ActivityLifecycleCallbacks
{
  private final Activity zzbcA;
  private final zzm zzbcB;
  
  private zzm$zzb(Activity paramActivity, zzm paramzzm)
  {
    this.zzbcA = paramActivity;
    this.zzbcB = paramzzm;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    Object localObject = this.zzbcA;
    if (paramActivity == localObject)
    {
      int i = 1;
      Object[] arrayOfObject = new Object[i];
      String str1 = paramActivity.getPackageName();
      arrayOfObject[0] = str1;
      String str2 = String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", arrayOfObject);
      Log.v("NearbyMessagesClient", str2);
      localObject = paramActivity.getApplication();
      ((Application)localObject).unregisterActivityLifecycleCallbacks(this);
    }
  }
  
  public void onActivityPaused(Activity paramActivity) {}
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity)
  {
    int i = 1;
    Object localObject = this.zzbcA;
    if (paramActivity == localObject) {}
    try
    {
      localObject = this.zzbcB;
      int j = 1;
      ((zzm)localObject).zzjq(j);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str2 = "NearbyMessagesClient";
        String str3 = "Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s";
        int k = 2;
        Object[] arrayOfObject = new Object[k];
        String str4 = paramActivity.getPackageName();
        arrayOfObject[0] = str4;
        arrayOfObject[i] = localRemoteException;
        String str1 = String.format(str3, arrayOfObject);
        Log.v(str2, str1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */