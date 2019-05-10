package com.bumptech.glide.request;

public final class ErrorRequestCoordinator
  implements Request, RequestCoordinator
{
  private Request error;
  private final RequestCoordinator parent;
  private Request primary;
  
  public ErrorRequestCoordinator(RequestCoordinator paramRequestCoordinator)
  {
    this.parent = paramRequestCoordinator;
  }
  
  private boolean isValidRequest(Request paramRequest)
  {
    Request localRequest = this.primary;
    boolean bool = paramRequest.equals(localRequest);
    if (!bool)
    {
      localRequest = this.primary;
      bool = localRequest.isFailed();
      if (bool)
      {
        localRequest = this.error;
        bool = paramRequest.equals(localRequest);
        if (!bool) {}
      }
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
    Request localRequest = this.primary;
    boolean bool = localRequest.isRunning();
    if (!bool)
    {
      localRequest = this.primary;
      localRequest.begin();
    }
  }
  
  public boolean canNotifyCleared(Request paramRequest)
  {
    boolean bool = parentCanNotifyCleared();
    if (bool)
    {
      bool = isValidRequest(paramRequest);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean canNotifyStatusChanged(Request paramRequest)
  {
    boolean bool = parentCanNotifyStatusChanged();
    if (bool)
    {
      bool = isValidRequest(paramRequest);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean canSetImage(Request paramRequest)
  {
    boolean bool = parentCanSetImage();
    if (bool)
    {
      bool = isValidRequest(paramRequest);
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void clear()
  {
    this.primary.clear();
    Request localRequest = this.error;
    boolean bool = localRequest.isRunning();
    if (bool)
    {
      localRequest = this.error;
      localRequest.clear();
    }
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
    Request localRequest = this.primary;
    boolean bool = localRequest.isFailed();
    if (bool) {
      localRequest = this.error;
    }
    for (bool = localRequest.isCleared();; bool = localRequest.isCleared())
    {
      return bool;
      localRequest = this.primary;
    }
  }
  
  public boolean isComplete()
  {
    Request localRequest = this.primary;
    boolean bool = localRequest.isFailed();
    if (bool) {
      localRequest = this.error;
    }
    for (bool = localRequest.isComplete();; bool = localRequest.isComplete())
    {
      return bool;
      localRequest = this.primary;
    }
  }
  
  public boolean isEquivalentTo(Request paramRequest)
  {
    boolean bool1 = false;
    boolean bool2 = paramRequest instanceof ErrorRequestCoordinator;
    if (bool2)
    {
      paramRequest = (ErrorRequestCoordinator)paramRequest;
      Request localRequest1 = this.primary;
      Request localRequest2 = paramRequest.primary;
      bool2 = localRequest1.isEquivalentTo(localRequest2);
      if (bool2)
      {
        localRequest1 = this.error;
        localRequest2 = paramRequest.error;
        bool2 = localRequest1.isEquivalentTo(localRequest2);
        if (bool2) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public boolean isFailed()
  {
    Request localRequest = this.primary;
    boolean bool = localRequest.isFailed();
    if (bool)
    {
      localRequest = this.error;
      bool = localRequest.isFailed();
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
  
  public boolean isResourceSet()
  {
    Request localRequest = this.primary;
    boolean bool = localRequest.isFailed();
    if (bool) {
      localRequest = this.error;
    }
    for (bool = localRequest.isResourceSet();; bool = localRequest.isResourceSet())
    {
      return bool;
      localRequest = this.primary;
    }
  }
  
  public boolean isRunning()
  {
    Request localRequest = this.primary;
    boolean bool = localRequest.isFailed();
    if (bool) {
      localRequest = this.error;
    }
    for (bool = localRequest.isRunning();; bool = localRequest.isRunning())
    {
      return bool;
      localRequest = this.primary;
    }
  }
  
  public void onRequestFailed(Request paramRequest)
  {
    Object localObject = this.error;
    boolean bool = paramRequest.equals(localObject);
    if (!bool)
    {
      localObject = this.error;
      bool = ((Request)localObject).isRunning();
      if (!bool)
      {
        localObject = this.error;
        ((Request)localObject).begin();
      }
    }
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
    RequestCoordinator localRequestCoordinator = this.parent;
    if (localRequestCoordinator != null)
    {
      localRequestCoordinator = this.parent;
      localRequestCoordinator.onRequestSuccess(this);
    }
  }
  
  public void recycle()
  {
    this.primary.recycle();
    this.error.recycle();
  }
  
  public void setRequests(Request paramRequest1, Request paramRequest2)
  {
    this.primary = paramRequest1;
    this.error = paramRequest2;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\ErrorRequestCoordinator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */