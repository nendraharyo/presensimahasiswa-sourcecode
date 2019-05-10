package com.google.android.gms.internal;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;

public class zzbe
  implements Application.ActivityLifecycleCallbacks
{
  private Activity mActivity;
  private Context mContext;
  private final Object zzpV;
  
  public zzbe(Application paramApplication, Activity paramActivity)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    paramApplication.registerActivityLifecycleCallbacks(this);
    setActivity(paramActivity);
    localObject = paramApplication.getApplicationContext();
    this.mContext = ((Context)localObject);
  }
  
  private void setActivity(Activity paramActivity)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = paramActivity.getClass();
      localObject2 = ((Class)localObject2).getName();
      String str = "com.google.android.gms.ads";
      boolean bool = ((String)localObject2).startsWith(str);
      if (!bool) {
        this.mActivity = paramActivity;
      }
      return;
    }
  }
  
  public Activity getActivity()
  {
    return this.mActivity;
  }
  
  public Context getContext()
  {
    return this.mContext;
  }
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    synchronized (this.zzpV)
    {
      Activity localActivity = this.mActivity;
      if (localActivity == null) {
        return;
      }
      localActivity = this.mActivity;
      boolean bool = localActivity.equals(paramActivity);
      if (bool)
      {
        bool = false;
        localActivity = null;
        this.mActivity = null;
      }
    }
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    setActivity(paramActivity);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    setActivity(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity)
  {
    setActivity(paramActivity);
  }
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbe.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */