package com.google.android.gms.wearable;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface MessageApi
{
  public static final String ACTION_MESSAGE_RECEIVED = "com.google.android.gms.wearable.MESSAGE_RECEIVED";
  public static final int FILTER_LITERAL = 0;
  public static final int FILTER_PREFIX = 1;
  public static final int UNKNOWN_REQUEST_ID = 255;
  
  public abstract PendingResult addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener);
  
  public abstract PendingResult addListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener, Uri paramUri, int paramInt);
  
  public abstract PendingResult removeListener(GoogleApiClient paramGoogleApiClient, MessageApi.MessageListener paramMessageListener);
  
  public abstract PendingResult sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2, byte[] paramArrayOfByte);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\MessageApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */