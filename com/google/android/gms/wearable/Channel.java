package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Channel
  extends Parcelable
{
  public abstract PendingResult addListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);
  
  public abstract PendingResult close(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult close(GoogleApiClient paramGoogleApiClient, int paramInt);
  
  public abstract PendingResult getInputStream(GoogleApiClient paramGoogleApiClient);
  
  public abstract String getNodeId();
  
  public abstract PendingResult getOutputStream(GoogleApiClient paramGoogleApiClient);
  
  public abstract String getPath();
  
  public abstract PendingResult receiveFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, boolean paramBoolean);
  
  public abstract PendingResult removeListener(GoogleApiClient paramGoogleApiClient, ChannelApi.ChannelListener paramChannelListener);
  
  public abstract PendingResult sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri);
  
  public abstract PendingResult sendFile(GoogleApiClient paramGoogleApiClient, Uri paramUri, long paramLong1, long paramLong2);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\Channel.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */