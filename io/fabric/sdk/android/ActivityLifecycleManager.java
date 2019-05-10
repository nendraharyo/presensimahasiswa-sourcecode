package io.fabric.sdk.android;

import android.app.Application;
import android.content.Context;
import android.os.Build.VERSION;

public class ActivityLifecycleManager
{
  private final Application application;
  private ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper callbacksWrapper;
  
  public ActivityLifecycleManager(Context paramContext)
  {
    Object localObject = (Application)paramContext.getApplicationContext();
    this.application = ((Application)localObject);
    int i = Build.VERSION.SDK_INT;
    int j = 14;
    if (i >= j)
    {
      localObject = new io/fabric/sdk/android/ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper;
      Application localApplication = this.application;
      ((ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper)localObject).<init>(localApplication);
      this.callbacksWrapper = ((ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper)localObject);
    }
  }
  
  public boolean registerCallbacks(ActivityLifecycleManager.Callbacks paramCallbacks)
  {
    ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper localActivityLifecycleCallbacksWrapper = this.callbacksWrapper;
    boolean bool;
    if (localActivityLifecycleCallbacksWrapper != null)
    {
      localActivityLifecycleCallbacksWrapper = this.callbacksWrapper;
      bool = ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.access$000(localActivityLifecycleCallbacksWrapper, paramCallbacks);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActivityLifecycleCallbacksWrapper = null;
    }
  }
  
  public void resetCallbacks()
  {
    ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper localActivityLifecycleCallbacksWrapper = this.callbacksWrapper;
    if (localActivityLifecycleCallbacksWrapper != null)
    {
      localActivityLifecycleCallbacksWrapper = this.callbacksWrapper;
      ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.access$100(localActivityLifecycleCallbacksWrapper);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\ActivityLifecycleManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */