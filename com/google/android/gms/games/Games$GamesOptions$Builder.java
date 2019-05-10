package com.google.android.gms.games;

import java.util.ArrayList;

public final class Games$GamesOptions$Builder
{
  boolean zzaCE = false;
  boolean zzaCF = true;
  int zzaCG = 17;
  boolean zzaCH = false;
  int zzaCI = 4368;
  String zzaCJ = null;
  ArrayList zzaCK;
  boolean zzaCL;
  
  private Games$GamesOptions$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaCK = localArrayList;
    this.zzaCL = false;
  }
  
  public Games.GamesOptions build()
  {
    Games.GamesOptions localGamesOptions = new com/google/android/gms/games/Games$GamesOptions;
    localGamesOptions.<init>(this, null);
    return localGamesOptions;
  }
  
  public Builder setRequireGooglePlus(boolean paramBoolean)
  {
    this.zzaCL = paramBoolean;
    return this;
  }
  
  public Builder setSdkVariant(int paramInt)
  {
    this.zzaCI = paramInt;
    return this;
  }
  
  public Builder setShowConnectingPopup(boolean paramBoolean)
  {
    this.zzaCF = paramBoolean;
    this.zzaCG = 17;
    return this;
  }
  
  public Builder setShowConnectingPopup(boolean paramBoolean, int paramInt)
  {
    this.zzaCF = paramBoolean;
    this.zzaCG = paramInt;
    return this;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Games$GamesOptions$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */