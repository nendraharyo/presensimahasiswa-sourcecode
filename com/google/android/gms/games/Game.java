package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface Game
  extends Parcelable, Freezable
{
  public abstract boolean areSnapshotsEnabled();
  
  public abstract int getAchievementTotalCount();
  
  public abstract String getApplicationId();
  
  public abstract String getDescription();
  
  public abstract void getDescription(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getDeveloperName();
  
  public abstract void getDeveloperName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract String getDisplayName();
  
  public abstract void getDisplayName(CharArrayBuffer paramCharArrayBuffer);
  
  public abstract Uri getFeaturedImageUri();
  
  public abstract String getFeaturedImageUrl();
  
  public abstract Uri getHiResImageUri();
  
  public abstract String getHiResImageUrl();
  
  public abstract Uri getIconImageUri();
  
  public abstract String getIconImageUrl();
  
  public abstract int getLeaderboardCount();
  
  public abstract String getPrimaryCategory();
  
  public abstract String getSecondaryCategory();
  
  public abstract String getThemeColor();
  
  public abstract boolean hasGamepadSupport();
  
  public abstract boolean isMuted();
  
  public abstract boolean isRealTimeMultiplayerEnabled();
  
  public abstract boolean isTurnBasedMultiplayerEnabled();
  
  public abstract String zzvA();
  
  public abstract int zzvB();
  
  public abstract boolean zzvx();
  
  public abstract boolean zzvy();
  
  public abstract boolean zzvz();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Game.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */