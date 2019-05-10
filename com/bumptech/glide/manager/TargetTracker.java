package com.bumptech.glide.manager;

import com.bumptech.glide.request.target.Target;
import com.bumptech.glide.util.Util;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public final class TargetTracker
  implements LifecycleListener
{
  private final Set targets;
  
  public TargetTracker()
  {
    Object localObject = new java/util/WeakHashMap;
    ((WeakHashMap)localObject).<init>();
    localObject = Collections.newSetFromMap((Map)localObject);
    this.targets = ((Set)localObject);
  }
  
  public void clear()
  {
    this.targets.clear();
  }
  
  public List getAll()
  {
    return Util.getSnapshot(this.targets);
  }
  
  public void onDestroy()
  {
    Object localObject = Util.getSnapshot(this.targets);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Target)localIterator.next();
      ((Target)localObject).onDestroy();
    }
  }
  
  public void onStart()
  {
    Object localObject = Util.getSnapshot(this.targets);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Target)localIterator.next();
      ((Target)localObject).onStart();
    }
  }
  
  public void onStop()
  {
    Object localObject = Util.getSnapshot(this.targets);
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Target)localIterator.next();
      ((Target)localObject).onStop();
    }
  }
  
  public void track(Target paramTarget)
  {
    this.targets.add(paramTarget);
  }
  
  public void untrack(Target paramTarget)
  {
    this.targets.remove(paramTarget);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\TargetTracker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */