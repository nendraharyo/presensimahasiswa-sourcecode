package io.fabric.sdk.android.services.concurrency;

import java.util.Collection;

public abstract interface Dependency
{
  public abstract void addDependency(Object paramObject);
  
  public abstract boolean areDependenciesMet();
  
  public abstract Collection getDependencies();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\io\fabric\sdk\android\services\concurrency\Dependency.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */