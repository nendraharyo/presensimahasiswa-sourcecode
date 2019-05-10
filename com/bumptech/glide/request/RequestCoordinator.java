package com.bumptech.glide.request;

public abstract interface RequestCoordinator
{
  public abstract boolean canNotifyCleared(Request paramRequest);
  
  public abstract boolean canNotifyStatusChanged(Request paramRequest);
  
  public abstract boolean canSetImage(Request paramRequest);
  
  public abstract boolean isAnyResourceSet();
  
  public abstract void onRequestFailed(Request paramRequest);
  
  public abstract void onRequestSuccess(Request paramRequest);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\RequestCoordinator.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */