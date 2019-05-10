package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$QuestMilestoneClaimBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFc;
  private final String zzaFd;
  
  public GamesClientImpl$QuestMilestoneClaimBinderCallbacks(zza.zzb paramzzb, String paramString)
  {
    Object localObject = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFc = ((zza.zzb)localObject);
    localObject = (String)zzx.zzb(paramString, "MilestoneId must not be null");
    this.zzaFd = ((String)localObject);
  }
  
  public void zzP(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFc;
    GamesClientImpl.ClaimMilestoneResultImpl localClaimMilestoneResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$ClaimMilestoneResultImpl;
    String str = this.zzaFd;
    localClaimMilestoneResultImpl.<init>(paramDataHolder, str);
    localzzb.zzs(localClaimMilestoneResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$QuestMilestoneClaimBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */