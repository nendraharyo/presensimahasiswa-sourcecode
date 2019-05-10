package com.google.android.gms.nearby.messages;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Messages
{
  public abstract PendingResult getPermissionStatus(GoogleApiClient paramGoogleApiClient);
  
  public abstract void handleIntent(Intent paramIntent, MessageListener paramMessageListener);
  
  public abstract PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage);
  
  public abstract PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, PublishOptions paramPublishOptions);
  
  public abstract PendingResult publish(GoogleApiClient paramGoogleApiClient, Message paramMessage, Strategy paramStrategy);
  
  public abstract PendingResult registerStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent, SubscribeOptions paramSubscribeOptions);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, Strategy paramStrategy);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, Strategy paramStrategy, MessageFilter paramMessageFilter);
  
  public abstract PendingResult subscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener, SubscribeOptions paramSubscribeOptions);
  
  public abstract PendingResult unpublish(GoogleApiClient paramGoogleApiClient, Message paramMessage);
  
  public abstract PendingResult unregisterStatusCallback(GoogleApiClient paramGoogleApiClient, StatusCallback paramStatusCallback);
  
  public abstract PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, PendingIntent paramPendingIntent);
  
  public abstract PendingResult unsubscribe(GoogleApiClient paramGoogleApiClient, MessageListener paramMessageListener);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\Messages.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */