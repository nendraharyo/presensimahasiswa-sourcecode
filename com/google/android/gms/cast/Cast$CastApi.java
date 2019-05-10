package com.google.android.gms.cast;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Cast$CastApi
{
  public abstract int getActiveInputState(GoogleApiClient paramGoogleApiClient);
  
  public abstract ApplicationMetadata getApplicationMetadata(GoogleApiClient paramGoogleApiClient);
  
  public abstract String getApplicationStatus(GoogleApiClient paramGoogleApiClient);
  
  public abstract int getStandbyState(GoogleApiClient paramGoogleApiClient);
  
  public abstract double getVolume(GoogleApiClient paramGoogleApiClient);
  
  public abstract boolean isMute(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult joinApplication(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult joinApplication(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult joinApplication(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);
  
  public abstract PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, LaunchOptions paramLaunchOptions);
  
  public abstract PendingResult launchApplication(GoogleApiClient paramGoogleApiClient, String paramString, boolean paramBoolean);
  
  public abstract PendingResult leaveApplication(GoogleApiClient paramGoogleApiClient);
  
  public abstract void removeMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract void requestStatus(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult sendMessage(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2);
  
  public abstract void setMessageReceivedCallbacks(GoogleApiClient paramGoogleApiClient, String paramString, Cast.MessageReceivedCallback paramMessageReceivedCallback);
  
  public abstract void setMute(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  public abstract void setVolume(GoogleApiClient paramGoogleApiClient, double paramDouble);
  
  public abstract PendingResult stopApplication(GoogleApiClient paramGoogleApiClient);
  
  public abstract PendingResult stopApplication(GoogleApiClient paramGoogleApiClient, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\Cast$CastApi.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */