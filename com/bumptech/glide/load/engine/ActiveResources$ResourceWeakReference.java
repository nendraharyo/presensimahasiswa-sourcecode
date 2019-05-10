package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class ActiveResources$ResourceWeakReference
  extends WeakReference
{
  final boolean isCacheable;
  final Key key;
  Resource resource;
  
  ActiveResources$ResourceWeakReference(Key paramKey, EngineResource paramEngineResource, ReferenceQueue paramReferenceQueue, boolean paramBoolean)
  {
    super(paramEngineResource, paramReferenceQueue);
    Object localObject = (Key)Preconditions.checkNotNull(paramKey);
    this.key = ((Key)localObject);
    boolean bool = paramEngineResource.isCacheable();
    if ((bool) && (paramBoolean)) {}
    for (localObject = (Resource)Preconditions.checkNotNull(paramEngineResource.getResource());; localObject = null)
    {
      this.resource = ((Resource)localObject);
      bool = paramEngineResource.isCacheable();
      this.isCacheable = bool;
      return;
      bool = false;
    }
  }
  
  void reset()
  {
    this.resource = null;
    clear();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ActiveResources$ResourceWeakReference.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */