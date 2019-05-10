package com.bumptech.glide.manager;

import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

class ActivityFragmentLifecycle
  implements Lifecycle
{
  private boolean isDestroyed;
  private boolean isStarted;
  private final Set lifecycleListeners;
  
  ActivityFragmentLifecycle()
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    localObject = Collections.newSetFromMap((Map)localObject);
    this.lifecycleListeners = ((Set)localObject);
  }
  
  public void addListener(LifecycleListener paramLifecycleListener)
  {
    Set localSet = this.lifecycleListeners;
    localSet.add(paramLifecycleListener);
    boolean bool = this.isDestroyed;
    if (bool) {
      paramLifecycleListener.onDestroy();
    }
    for (;;)
    {
      return;
      bool = this.isStarted;
      if (bool) {
        paramLifecycleListener.onStart();
      } else {
        paramLifecycleListener.onStop();
      }
    }
  }
  
  void onDestroy()
  {
    boolean bool = true;
    this.isDestroyed = bool;
    Object localObject = Util.getSnapshot(this.lifecycleListeners);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (LifecycleListener)localIterator.next();
      ((LifecycleListener)localObject).onDestroy();
    }
  }
  
  void onStart()
  {
    boolean bool = true;
    this.isStarted = bool;
    Object localObject = Util.getSnapshot(this.lifecycleListeners);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (LifecycleListener)localIterator.next();
      ((LifecycleListener)localObject).onStart();
    }
  }
  
  void onStop()
  {
    boolean bool = false;
    this.isStarted = false;
    Object localObject = Util.getSnapshot(this.lifecycleListeners);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (LifecycleListener)localIterator.next();
      ((LifecycleListener)localObject).onStop();
    }
  }
  
  public void removeListener(LifecycleListener paramLifecycleListener)
  {
    this.lifecycleListeners.remove(paramLifecycleListener);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\ActivityFragmentLifecycle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */