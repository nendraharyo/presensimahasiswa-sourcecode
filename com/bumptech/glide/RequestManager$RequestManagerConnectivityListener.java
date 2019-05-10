package com.bumptech.glide;

import com.bumptech.glide.manager.ConnectivityMonitor.ConnectivityListener;
import com.bumptech.glide.manager.RequestTracker;

class RequestManager$RequestManagerConnectivityListener
  implements ConnectivityMonitor.ConnectivityListener
{
  private final RequestTracker requestTracker;
  
  RequestManager$RequestManagerConnectivityListener(RequestTracker paramRequestTracker)
  {
    this.requestTracker = paramRequestTracker;
  }
  
  public void onConnectivityChanged(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      RequestTracker localRequestTracker = this.requestTracker;
      localRequestTracker.restartRequests();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\RequestManager$RequestManagerConnectivityListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */