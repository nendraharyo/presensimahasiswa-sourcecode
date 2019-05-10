package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$QuestAcceptedBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzaFb;
  
  public GamesClientImpl$QuestAcceptedBinderCallbacks(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzaFb = localzzb;
  }
  
  public void zzQ(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzaFb;
    GamesClientImpl.AcceptQuestResultImpl localAcceptQuestResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$AcceptQuestResultImpl;
    localAcceptQuestResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localAcceptQuestResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$QuestAcceptedBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */