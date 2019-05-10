package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzx;
import java.util.ArrayList;

public final class TurnBasedMatchConfig$Builder
{
  int zzaJJ = -1;
  ArrayList zzaJY;
  Bundle zzaJZ;
  int zzaKi;
  
  private TurnBasedMatchConfig$Builder()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.zzaJY = localArrayList;
    this.zzaJZ = null;
    this.zzaKi = 2;
  }
  
  public Builder addInvitedPlayer(String paramString)
  {
    zzx.zzz(paramString);
    this.zzaJY.add(paramString);
    return this;
  }
  
  public Builder addInvitedPlayers(ArrayList paramArrayList)
  {
    zzx.zzz(paramArrayList);
    this.zzaJY.addAll(paramArrayList);
    return this;
  }
  
  public TurnBasedMatchConfig build()
  {
    TurnBasedMatchConfigImpl localTurnBasedMatchConfigImpl = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchConfigImpl;
    localTurnBasedMatchConfigImpl.<init>(this);
    return localTurnBasedMatchConfigImpl;
  }
  
  public Builder setAutoMatchCriteria(Bundle paramBundle)
  {
    this.zzaJZ = paramBundle;
    return this;
  }
  
  public Builder setVariant(int paramInt)
  {
    int i = -1;
    if ((paramInt == i) || (paramInt > 0)) {}
    for (i = 1;; i = 0)
    {
      zzx.zzb(i, "Variant must be a positive integer or TurnBasedMatch.MATCH_VARIANT_ANY");
      this.zzaJJ = paramInt;
      return this;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchConfig$Builder.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */