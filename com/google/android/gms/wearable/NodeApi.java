package com.google.android.gms.wearable;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface NodeApi
{
  public abstract PendingResult addListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener);
  
  public abstract PendingResult getConnectedNodes(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult getLocalNode(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult removeListener(GoogleApiClient paramGoogleApiClient, NodeApi.NodeListener paramNodeListener);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\NodeApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */