package com.loopj.android.http;

import android.os.Looper;
import java.lang.ref.WeakReference;

public class RequestHandle
{
  private final WeakReference request;
  
  public RequestHandle(AsyncHttpRequest paramAsyncHttpRequest)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramAsyncHttpRequest);
    this.request = localWeakReference;
  }
  
  public boolean cancel(boolean paramBoolean)
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    boolean bool;
    if (localAsyncHttpRequest != null)
    {
      Object localObject1 = Looper.myLooper();
      Object localObject2 = Looper.getMainLooper();
      if (localObject1 == localObject2)
      {
        localObject1 = new java/lang/Thread;
        localObject2 = new com/loopj/android/http/RequestHandle$1;
        ((RequestHandle.1)localObject2).<init>(this, localAsyncHttpRequest, paramBoolean);
        ((Thread)localObject1).<init>((Runnable)localObject2);
        ((Thread)localObject1).start();
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = localAsyncHttpRequest.cancel(paramBoolean);
      continue;
      bool = false;
      localAsyncHttpRequest = null;
    }
  }
  
  public Object getTag()
  {
    Object localObject = (AsyncHttpRequest)this.request.get();
    if (localObject == null) {}
    for (localObject = null;; localObject = ((AsyncHttpRequest)localObject).getTag()) {
      return localObject;
    }
  }
  
  public boolean isCancelled()
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    boolean bool;
    if (localAsyncHttpRequest != null)
    {
      bool = localAsyncHttpRequest.isCancelled();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAsyncHttpRequest = null;
    }
  }
  
  public boolean isFinished()
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    boolean bool;
    if (localAsyncHttpRequest != null)
    {
      bool = localAsyncHttpRequest.isDone();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localAsyncHttpRequest = null;
    }
  }
  
  public RequestHandle setTag(Object paramObject)
  {
    AsyncHttpRequest localAsyncHttpRequest = (AsyncHttpRequest)this.request.get();
    if (localAsyncHttpRequest != null) {
      localAsyncHttpRequest.setRequestTag(paramObject);
    }
    return this;
  }
  
  public boolean shouldBeGarbageCollected()
  {
    boolean bool = isCancelled();
    if (!bool)
    {
      bool = isFinished();
      if (!bool) {
        break label35;
      }
    }
    label35:
    for (bool = true;; bool = false)
    {
      if (bool)
      {
        WeakReference localWeakReference = this.request;
        localWeakReference.clear();
      }
      return bool;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\loopj\android\http\RequestHandle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */