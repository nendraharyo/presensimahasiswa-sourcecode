package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$AchievementUpdatedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$AchievementUpdatedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzh(int paramInt, String paramString)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.UpdateAchievementResultImpl localUpdateAchievementResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$UpdateAchievementResultImpl;
    localUpdateAchievementResultImpl.<init>(paramInt, paramString);
    localzzb.zzs(localUpdateAchievementResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$AchievementUpdatedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */