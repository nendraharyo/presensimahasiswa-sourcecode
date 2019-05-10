package com.bumptech.glide.load.engine;

import android.os.Looper;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;

class EngineResource
  implements Resource
{
  private int acquired;
  private final boolean isCacheable;
  private final boolean isRecyclable;
  private boolean isRecycled;
  private Key key;
  private EngineResource.ResourceListener listener;
  private final Resource resource;
  
  EngineResource(Resource paramResource, boolean paramBoolean1, boolean paramBoolean2)
  {
    Resource localResource = (Resource)Preconditions.checkNotNull(paramResource);
    this.resource = localResource;
    this.isCacheable = paramBoolean1;
    this.isRecyclable = paramBoolean2;
  }
  
  void acquire()
  {
    boolean bool = this.isRecycled;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot acquire a recycled resource");
      throw ((Throwable)localObject);
    }
    Object localObject = Looper.getMainLooper();
    Looper localLooper = Looper.myLooper();
    bool = localObject.equals(localLooper);
    if (!bool)
    {
      localObject = new java/lang/IllegalThreadStateException;
      ((IllegalThreadStateException)localObject).<init>("Must call acquire on the main thread");
      throw ((Throwable)localObject);
    }
    int i = this.acquired + 1;
    this.acquired = i;
  }
  
  public Object get()
  {
    return this.resource.get();
  }
  
  Resource getResource()
  {
    return this.resource;
  }
  
  public Class getResourceClass()
  {
    return this.resource.getResourceClass();
  }
  
  public int getSize()
  {
    return this.resource.getSize();
  }
  
  boolean isCacheable()
  {
    return this.isCacheable;
  }
  
  public void recycle()
  {
    int i = this.acquired;
    Object localObject;
    if (i > 0)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot recycle a resource while it is still acquired");
      throw ((Throwable)localObject);
    }
    boolean bool = this.isRecycled;
    if (bool)
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("Cannot recycle a resource that has already been recycled");
      throw ((Throwable)localObject);
    }
    this.isRecycled = true;
    bool = this.isRecyclable;
    if (bool)
    {
      localObject = this.resource;
      ((Resource)localObject).recycle();
    }
  }
  
  void release()
  {
    int i = this.acquired;
    if (i <= 0)
    {
      localObject1 = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject1).<init>("Cannot release a recycled or not yet acquired resource");
      throw ((Throwable)localObject1);
    }
    Object localObject1 = Looper.getMainLooper();
    Object localObject2 = Looper.myLooper();
    boolean bool = localObject1.equals(localObject2);
    if (!bool)
    {
      localObject1 = new java/lang/IllegalThreadStateException;
      ((IllegalThreadStateException)localObject1).<init>("Must call release on the main thread");
      throw ((Throwable)localObject1);
    }
    int j = this.acquired + -1;
    this.acquired = j;
    if (j == 0)
    {
      localObject1 = this.listener;
      localObject2 = this.key;
      ((EngineResource.ResourceListener)localObject1).onResourceReleased((Key)localObject2, this);
    }
  }
  
  void setResourceListener(Key paramKey, EngineResource.ResourceListener paramResourceListener)
  {
    this.key = paramKey;
    this.listener = paramResourceListener;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder = localStringBuilder.append("EngineResource{isCacheable=");
    boolean bool1 = this.isCacheable;
    localStringBuilder = localStringBuilder.append(bool1).append(", listener=");
    Object localObject = this.listener;
    localStringBuilder = localStringBuilder.append(localObject).append(", key=");
    localObject = this.key;
    localStringBuilder = localStringBuilder.append(localObject).append(", acquired=");
    int i = this.acquired;
    localStringBuilder = localStringBuilder.append(i).append(", isRecycled=");
    boolean bool2 = this.isRecycled;
    localStringBuilder = localStringBuilder.append(bool2).append(", resource=");
    localObject = this.resource;
    return localObject + '}';
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\load\engine\EngineResource.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */