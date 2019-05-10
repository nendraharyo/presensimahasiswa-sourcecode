package com.bumptech.glide.request;

public class ThumbnailRequestCoordinator
  implements Request, RequestCoordinator
{
  private Request full;
  private boolean isRunning;
  private final RequestCoordinator parent;
  private Request thumb;
  
  ThumbnailRequestCoordinator()
  {
    this(null);
  }
  
  public ThumbnailRequestCoordinator(RequestCoordinator paramRequestCoordinator)
  {
    this.parent = paramRequestCoordinator;
  }
  
  private boolean parentCanNotifyCleared()
  {
    RequestCoordinator localRequestCoordinator = this.parent;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.parent;
      bool = localRequestCoordinator.canNotifyCleared(this);
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
      localRequestCoordinator = null;
    }
  }
  
  private boolean parentCanNotifyStatusChanged()
  {
    RequestCoordinator localRequestCoordinator = this.parent;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.parent;
      bool = localRequestCoordinator.canNotifyStatusChanged(this);
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
      localRequestCoordinator = null;
    }
  }
  
  private boolean parentCanSetImage()
  {
    RequestCoordinator localRequestCoordinator = this.parent;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.parent;
      bool = localRequestCoordinator.canSetImage(this);
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
      localRequestCoordinator = null;
    }
  }
  
  private boolean parentIsAnyResourceSet()
  {
    RequestCoordinator localRequestCoordinator = this.parent;
    boolean bool;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.parent;
      bool = localRequestCoordinator.isAnyResourceSet();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequestCoordinator = null;
    }
  }
  
  public void begin()
  {
    this.isRunning = true;
    Request localRequest = this.full;
    boolean bool = localRequest.isComplete();
    if (!bool)
    {
      localRequest = this.thumb;
      bool = localRequest.isRunning();
      if (!bool)
      {
        localRequest = this.thumb;
        localRequest.begin();
      }
    }
    bool = this.isRunning;
    if (bool)
    {
      localRequest = this.full;
      bool = localRequest.isRunning();
      if (!bool)
      {
        localRequest = this.full;
        localRequest.begin();
      }
    }
  }
  
  public boolean canNotifyCleared(Request paramRequest)
  {
    boolean bool = parentCanNotifyCleared();
    Request localRequest;
    if (bool)
    {
      localRequest = this.full;
      bool = paramRequest.equals(localRequest);
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequest = null;
    }
  }
  
  public boolean canNotifyStatusChanged(Request paramRequest)
  {
    boolean bool = parentCanNotifyStatusChanged();
    Request localRequest;
    if (bool)
    {
      localRequest = this.full;
      bool = paramRequest.equals(localRequest);
      if (bool)
      {
        bool = isAnyResourceSet();
        if (!bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequest = null;
    }
  }
  
  public boolean canSetImage(Request paramRequest)
  {
    boolean bool = parentCanSetImage();
    Request localRequest;
    if (bool)
    {
      localRequest = this.full;
      bool = paramRequest.equals(localRequest);
      if (!bool)
      {
        localRequest = this.full;
        bool = localRequest.isResourceSet();
        if (bool) {}
      }
      else
      {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localRequest = null;
    }
  }
  
  public void clear()
  {
    this.isRunning = false;
    this.thumb.clear();
    this.full.clear();
  }
  
  public boolean isAnyResourceSet()
  {
    boolean bool = parentIsAnyResourceSet();
    if (!bool)
    {
      bool = isResourceSet();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isCleared()
  {
    return this.full.isCleared();
  }
  
  public boolean isComplete()
  {
    Request localRequest = this.full;
    boolean bool = localRequest.isComplete();
    if (!bool)
    {
      localRequest = this.thumb;
      bool = localRequest.isComplete();
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
      localRequest = null;
    }
  }
  
  public boolean isEquivalentTo(Request paramRequest)
  {
    boolean bool1 = false;
    boolean bool2 = paramRequest instanceof ThumbnailRequestCoordinator;
    Request localRequest1;
    if (bool2)
    {
      paramRequest = (ThumbnailRequestCoordinator)paramRequest;
      localRequest1 = this.full;
      if (localRequest1 != null) {
        break label64;
      }
      localRequest1 = paramRequest.full;
      if (localRequest1 == null)
      {
        localRequest1 = this.thumb;
        if (localRequest1 != null) {
          break label93;
        }
        localRequest1 = paramRequest.thumb;
        if (localRequest1 != null) {}
      }
    }
    for (;;)
    {
      bool1 = true;
      label64:
      label93:
      do
      {
        do
        {
          return bool1;
          localRequest1 = this.full;
          localRequest2 = paramRequest.full;
          bool2 = localRequest1.isEquivalentTo(localRequest2);
        } while (!bool2);
        break;
        localRequest1 = this.thumb;
        Request localRequest2 = paramRequest.thumb;
        bool2 = localRequest1.isEquivalentTo(localRequest2);
      } while (!bool2);
    }
  }
  
  public boolean isFailed()
  {
    return this.full.isFailed();
  }
  
  public boolean isResourceSet()
  {
    Request localRequest = this.full;
    boolean bool = localRequest.isResourceSet();
    if (!bool)
    {
      localRequest = this.thumb;
      bool = localRequest.isResourceSet();
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
      localRequest = null;
    }
  }
  
  public boolean isRunning()
  {
    return this.full.isRunning();
  }
  
  public void onRequestFailed(Request paramRequest)
  {
    Object localObject = this.full;
    boolean bool = paramRequest.equals(localObject);
    if (!bool) {}
    for (;;)
    {
      return;
      localObject = this.parent;
      if (localObject != null)
      {
        localObject = this.parent;
        ((RequestCoordinator)localObject).onRequestFailed(this);
      }
    }
  }
  
  public void onRequestSuccess(Request paramRequest)
  {
    Object localObject = this.thumb;
    boolean bool = paramRequest.equals(localObject);
    if (bool) {}
    for (;;)
    {
      return;
      localObject = this.parent;
      if (localObject != null)
      {
        localObject = this.parent;
        ((RequestCoordinator)localObject).onRequestSuccess(this);
      }
      localObject = this.thumb;
      bool = ((Request)localObject).isComplete();
      if (!bool)
      {
        localObject = this.thumb;
        ((Request)localObject).clear();
      }
    }
  }
  
  public void recycle()
  {
    this.full.recycle();
    this.thumb.recycle();
  }
  
  public void setRequests(Request paramRequest1, Request paramRequest2)
  {
    this.full = paramRequest1;
    this.thumb = paramRequest2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\ThumbnailRequestCoordinator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */