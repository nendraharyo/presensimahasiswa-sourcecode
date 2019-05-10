package io.fabric.sdk.android;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

class ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1
  implements Application.ActivityLifecycleCallbacks
{
  ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1(ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper paramActivityLifecycleCallbacksWrapper, ActivityLifecycleManager.Callbacks paramCallbacks) {}
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
  {
    this.val$callbacks.onActivityCreated(paramActivity, paramBundle);
  }
  
  public void onActivityDestroyed(Activity paramActivity)
  {
    this.val$callbacks.onActivityDestroyed(paramActivity);
  }
  
  public void onActivityPaused(Activity paramActivity)
  {
    this.val$callbacks.onActivityPaused(paramActivity);
  }
  
  public void onActivityResumed(Activity paramActivity)
  {
    this.val$callbacks.onActivityResumed(paramActivity);
  }
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
  {
    this.val$callbacks.onActivitySaveInstanceState(paramActivity, paramBundle);
  }
  
  public void onActivityStarted(Activity paramActivity)
  {
    this.val$callbacks.onActivityStarted(paramActivity);
  }
  
  public void onActivityStopped(Activity paramActivity)
  {
    this.val$callbacks.onActivityStopped(paramActivity);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */