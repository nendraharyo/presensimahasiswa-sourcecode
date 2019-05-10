package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import java.util.ArrayList;

public final class TurnBasedMatchConfigImpl
  extends TurnBasedMatchConfig
{
  private final int zzaJJ;
  private final Bundle zzaJZ;
  private final String[] zzaKa;
  private final int zzaKi;
  
  TurnBasedMatchConfigImpl(TurnBasedMatchConfig.Builder paramBuilder)
  {
    int i = paramBuilder.zzaJJ;
    this.zzaJJ = i;
    i = paramBuilder.zzaKi;
    this.zzaKi = i;
    Object localObject = paramBuilder.zzaJZ;
    this.zzaJZ = ((Bundle)localObject);
    i = paramBuilder.zzaJY.size();
    ArrayList localArrayList = paramBuilder.zzaJY;
    localObject = new String[i];
    localObject = (String[])localArrayList.toArray((Object[])localObject);
    this.zzaKa = ((String[])localObject);
  }
  
  public Bundle getAutoMatchCriteria()
  {
    return this.zzaJZ;
  }
  
  public String[] getInvitedPlayerIds()
  {
    return this.zzaKa;
  }
  
  public int getVariant()
  {
    return this.zzaJJ;
  }
  
  public int zzxP()
  {
    return this.zzaKi;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\TurnBasedMatchConfigImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */