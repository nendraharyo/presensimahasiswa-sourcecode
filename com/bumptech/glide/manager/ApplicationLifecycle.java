package com.bumptech.glide.manager;

class ApplicationLifecycle
  implements Lifecycle
{
  public void addListener(LifecycleListener paramLifecycleListener)
  {
    paramLifecycleListener.onStart();
  }
  
  public void removeListener(LifecycleListener paramLifecycleListener) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\manager\ApplicationLifecycle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */