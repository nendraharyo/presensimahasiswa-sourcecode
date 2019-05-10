package com.google.android.gms.games.stats;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public abstract interface PlayerStats
  extends Parcelable, Freezable
{
  public static final float UNSET_VALUE = -1.0F;
  
  public abstract float getAverageSessionLength();
  
  public abstract float getChurnProbability();
  
  public abstract int getDaysSinceLastPlayed();
  
  public abstract int getNumberOfPurchases();
  
  public abstract int getNumberOfSessions();
  
  public abstract float getSessionPercentile();
  
  public abstract float getSpendPercentile();
  
  public abstract float getSpendProbability();
  
  public abstract Bundle zzxV();
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\stats\PlayerStats.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */