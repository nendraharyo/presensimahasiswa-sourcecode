package com.bumptech.glide.load.engine;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Util;
import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

final class ActiveResources
{
  private static final int MSG_CLEAN_REF = 1;
  final Map activeEngineResources;
  private volatile ActiveResources.DequeuedResourceCallback cb;
  private Thread cleanReferenceQueueThread;
  private final boolean isActiveResourceRetentionAllowed;
  private volatile boolean isShutdown;
  private EngineResource.ResourceListener listener;
  private final Handler mainHandler;
  private ReferenceQueue resourceReferenceQueue;
  
  ActiveResources(boolean paramBoolean)
  {
    Object localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ActiveResources.1 local1 = new com/bumptech/glide/load/engine/ActiveResources$1;
    local1.<init>(this);
    ((Handler)localObject).<init>(localLooper, local1);
    this.mainHandler = ((Handler)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.activeEngineResources = ((Map)localObject);
    this.isActiveResourceRetentionAllowed = paramBoolean;
  }
  
  private ReferenceQueue getReferenceQueue()
  {
    Object localObject = this.resourceReferenceQueue;
    if (localObject == null)
    {
      localObject = new java/lang/ref/ReferenceQueue;
      ((ReferenceQueue)localObject).<init>();
      this.resourceReferenceQueue = ((ReferenceQueue)localObject);
      localObject = new java/lang/Thread;
      ActiveResources.2 local2 = new com/bumptech/glide/load/engine/ActiveResources$2;
      local2.<init>(this);
      String str = "glide-active-resources";
      ((Thread)localObject).<init>(local2, str);
      this.cleanReferenceQueueThread = ((Thread)localObject);
      localObject = this.cleanReferenceQueueThread;
      ((Thread)localObject).start();
    }
    return this.resourceReferenceQueue;
  }
  
  void activate(Key paramKey, EngineResource paramEngineResource)
  {
    ActiveResources.ResourceWeakReference localResourceWeakReference = new com/bumptech/glide/load/engine/ActiveResources$ResourceWeakReference;
    Object localObject = getReferenceQueue();
    boolean bool = this.isActiveResourceRetentionAllowed;
    localResourceWeakReference.<init>(paramKey, paramEngineResource, (ReferenceQueue)localObject, bool);
    localObject = this.activeEngineResources;
    localResourceWeakReference = (ActiveResources.ResourceWeakReference)((Map)localObject).put(paramKey, localResourceWeakReference);
    if (localResourceWeakReference != null) {
      localResourceWeakReference.reset();
    }
  }
  
  void cleanReferenceQueue()
  {
    for (;;)
    {
      boolean bool = this.isShutdown;
      if (bool) {
        break;
      }
      try
      {
        Object localObject = this.resourceReferenceQueue;
        localObject = ((ReferenceQueue)localObject).remove();
        localObject = (ActiveResources.ResourceWeakReference)localObject;
        Handler localHandler = this.mainHandler;
        int i = 1;
        localObject = localHandler.obtainMessage(i, localObject);
        ((Message)localObject).sendToTarget();
        localObject = this.cb;
        if (localObject != null) {
          ((ActiveResources.DequeuedResourceCallback)localObject).onResourceDequeued();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread localThread = Thread.currentThread();
        localThread.interrupt();
      }
    }
  }
  
  void cleanupActiveReference(ActiveResources.ResourceWeakReference paramResourceWeakReference)
  {
    Util.assertMainThread();
    Object localObject1 = this.activeEngineResources;
    Object localObject2 = paramResourceWeakReference.key;
    ((Map)localObject1).remove(localObject2);
    boolean bool1 = paramResourceWeakReference.isCacheable;
    if (bool1)
    {
      localObject1 = paramResourceWeakReference.resource;
      if (localObject1 != null) {
        break label42;
      }
    }
    for (;;)
    {
      return;
      label42:
      localObject1 = new com/bumptech/glide/load/engine/EngineResource;
      localObject2 = paramResourceWeakReference.resource;
      boolean bool2 = true;
      ((EngineResource)localObject1).<init>((Resource)localObject2, bool2, false);
      localObject2 = paramResourceWeakReference.key;
      Object localObject3 = this.listener;
      ((EngineResource)localObject1).setResourceListener((Key)localObject2, (EngineResource.ResourceListener)localObject3);
      localObject2 = this.listener;
      localObject3 = paramResourceWeakReference.key;
      ((EngineResource.ResourceListener)localObject2).onResourceReleased((Key)localObject3, (EngineResource)localObject1);
    }
  }
  
  void deactivate(Key paramKey)
  {
    ActiveResources.ResourceWeakReference localResourceWeakReference = (ActiveResources.ResourceWeakReference)this.activeEngineResources.remove(paramKey);
    if (localResourceWeakReference != null) {
      localResourceWeakReference.reset();
    }
  }
  
  EngineResource get(Key paramKey)
  {
    ActiveResources.ResourceWeakReference localResourceWeakReference = (ActiveResources.ResourceWeakReference)this.activeEngineResources.get(paramKey);
    EngineResource localEngineResource;
    if (localResourceWeakReference == null) {
      localEngineResource = null;
    }
    for (;;)
    {
      return localEngineResource;
      localEngineResource = (EngineResource)localResourceWeakReference.get();
      if (localEngineResource == null) {
        cleanupActiveReference(localResourceWeakReference);
      }
    }
  }
  
  void setDequeuedResourceCallback(ActiveResources.DequeuedResourceCallback paramDequeuedResourceCallback)
  {
    this.cb = paramDequeuedResourceCallback;
  }
  
  void setListener(EngineResource.ResourceListener paramResourceListener)
  {
    this.listener = paramResourceListener;
  }
  
  void shutdown()
  {
    boolean bool = true;
    this.isShutdown = bool;
    Object localObject1 = this.cleanReferenceQueueThread;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      localObject1 = this.cleanReferenceQueueThread;
      ((Thread)localObject1).interrupt();
      try
      {
        localObject1 = this.cleanReferenceQueueThread;
        Object localObject2 = TimeUnit.SECONDS;
        long l = 5;
        l = ((TimeUnit)localObject2).toMillis(l);
        ((Thread)localObject1).join(l);
        localObject1 = this.cleanReferenceQueueThread;
        bool = ((Thread)localObject1).isAlive();
        if (bool)
        {
          localObject1 = new java/lang/RuntimeException;
          localObject2 = "Failed to join in time";
          ((RuntimeException)localObject1).<init>((String)localObject2);
          throw ((Throwable)localObject1);
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread localThread = Thread.currentThread();
        localThread.interrupt();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\ActiveResources.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */