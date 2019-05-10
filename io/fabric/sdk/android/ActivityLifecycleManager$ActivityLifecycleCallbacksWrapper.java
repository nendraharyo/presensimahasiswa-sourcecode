package io.fabric.sdk.android;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper
{
  private final Application application;
  private final Set registeredCallbacks;
  
  ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper(Application paramApplication)
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    this.registeredCallbacks = localHashSet;
    this.application = paramApplication;
  }
  
  private void clearCallbacks()
  {
    Object localObject = this.registeredCallbacks;
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Application.ActivityLifecycleCallbacks)localIterator.next();
      Application localApplication = this.application;
      localApplication.unregisterActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
    }
  }
  
  private boolean registerLifecycleCallbacks(ActivityLifecycleManager.Callbacks paramCallbacks)
  {
    Object localObject = this.application;
    boolean bool;
    if (localObject != null)
    {
      localObject = new io/fabric/sdk/android/ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper$1;
      ((ActivityLifecycleManager.ActivityLifecycleCallbacksWrapper.1)localObject).<init>(this, paramCallbacks);
      this.application.registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject);
      Set localSet = this.registeredCallbacks;
      localSet.add(localObject);
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\ActivityLifecycleManager$ActivityLifecycleCallbacksWrapper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */