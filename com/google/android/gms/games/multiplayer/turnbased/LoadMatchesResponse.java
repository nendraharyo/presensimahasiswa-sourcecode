package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TurnBasedMatchTurnStatus;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

public final class LoadMatchesResponse
{
  private final InvitationBuffer zzaKe;
  private final TurnBasedMatchBuffer zzaKf;
  private final TurnBasedMatchBuffer zzaKg;
  private final TurnBasedMatchBuffer zzaKh;
  
  public LoadMatchesResponse(Bundle paramBundle)
  {
    int i = 0;
    DataHolder localDataHolder = zza(paramBundle, 0);
    Object localObject;
    if (localDataHolder != null)
    {
      localObject = new com/google/android/gms/games/multiplayer/InvitationBuffer;
      ((InvitationBuffer)localObject).<init>(localDataHolder);
      this.zzaKe = ((InvitationBuffer)localObject);
      i = 1;
      localDataHolder = zza(paramBundle, i);
      if (localDataHolder == null) {
        break label129;
      }
      localObject = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
      ((TurnBasedMatchBuffer)localObject).<init>(localDataHolder);
      this.zzaKf = ((TurnBasedMatchBuffer)localObject);
      label62:
      i = 2;
      localDataHolder = zza(paramBundle, i);
      if (localDataHolder == null) {
        break label137;
      }
      localObject = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
      ((TurnBasedMatchBuffer)localObject).<init>(localDataHolder);
      this.zzaKg = ((TurnBasedMatchBuffer)localObject);
      label91:
      i = 3;
      localDataHolder = zza(paramBundle, i);
      if (localDataHolder == null) {
        break label145;
      }
      localObject = new com/google/android/gms/games/multiplayer/turnbased/TurnBasedMatchBuffer;
      ((TurnBasedMatchBuffer)localObject).<init>(localDataHolder);
    }
    label129:
    label137:
    label145:
    for (this.zzaKh = ((TurnBasedMatchBuffer)localObject);; this.zzaKh = null)
    {
      return;
      this.zzaKe = null;
      break;
      this.zzaKf = null;
      break label62;
      this.zzaKg = null;
      break label91;
    }
  }
  
  private static DataHolder zza(Bundle paramBundle, int paramInt)
  {
    Object localObject = TurnBasedMatchTurnStatus.zzgw(paramInt);
    boolean bool = paramBundle.containsKey((String)localObject);
    if (!bool) {}
    for (localObject = null;; localObject = (DataHolder)paramBundle.getParcelable((String)localObject)) {
      return (DataHolder)localObject;
    }
  }
  
  public void close()
  {
    release();
  }
  
  public TurnBasedMatchBuffer getCompletedMatches()
  {
    return this.zzaKh;
  }
  
  public InvitationBuffer getInvitations()
  {
    return this.zzaKe;
  }
  
  public TurnBasedMatchBuffer getMyTurnMatches()
  {
    return this.zzaKf;
  }
  
  public TurnBasedMatchBuffer getTheirTurnMatches()
  {
    return this.zzaKg;
  }
  
  public boolean hasData()
  {
    boolean bool = true;
    Object localObject = this.zzaKe;
    int i;
    if (localObject != null)
    {
      localObject = this.zzaKe;
      i = ((InvitationBuffer)localObject).getCount();
      if (i <= 0) {}
    }
    for (;;)
    {
      return bool;
      localObject = this.zzaKf;
      if (localObject != null)
      {
        localObject = this.zzaKf;
        i = ((TurnBasedMatchBuffer)localObject).getCount();
        if (i > 0) {}
      }
      else
      {
        localObject = this.zzaKg;
        if (localObject != null)
        {
          localObject = this.zzaKg;
          i = ((TurnBasedMatchBuffer)localObject).getCount();
          if (i > 0) {}
        }
        else
        {
          localObject = this.zzaKh;
          if (localObject != null)
          {
            localObject = this.zzaKh;
            i = ((TurnBasedMatchBuffer)localObject).getCount();
            if (i > 0) {}
          }
          else
          {
            bool = false;
          }
        }
      }
    }
  }
  
  public void release()
  {
    Object localObject = this.zzaKe;
    if (localObject != null)
    {
      localObject = this.zzaKe;
      ((InvitationBuffer)localObject).release();
    }
    localObject = this.zzaKf;
    if (localObject != null)
    {
      localObject = this.zzaKf;
      ((TurnBasedMatchBuffer)localObject).release();
    }
    localObject = this.zzaKg;
    if (localObject != null)
    {
      localObject = this.zzaKg;
      ((TurnBasedMatchBuffer)localObject).release();
    }
    localObject = this.zzaKh;
    if (localObject != null)
    {
      localObject = this.zzaKh;
      ((TurnBasedMatchBuffer)localObject).release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\multiplayer\turnbased\LoadMatchesResponse.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */