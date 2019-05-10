package com.google.android.gms.games.achievement;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public abstract interface Achievements
{
  public abstract Intent getAchievementsIntent(GoogleApiClient paramGoogleApiClient);
  
  public abstract void increment(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);
  
  public abstract PendingResult incrementImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);
  
  public abstract PendingResult load(GoogleApiClient paramGoogleApiClient, boolean paramBoolean);
  
  public abstract void reveal(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult revealImmediate(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract void setSteps(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);
  
  public abstract PendingResult setStepsImmediate(GoogleApiClient paramGoogleApiClient, String paramString, int paramInt);
  
  public abstract void unlock(GoogleApiClient paramGoogleApiClient, String paramString);
  
  public abstract PendingResult unlockImmediate(GoogleApiClient paramGoogleApiClient, String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\achievement\Achievements.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */