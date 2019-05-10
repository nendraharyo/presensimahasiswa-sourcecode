package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;

final class GamesClientImpl$RealTimeReliableMessageBinderCallbacks
  extends AbstractGamesCallbacks
{
  final zzq zzaFh;
  
  public GamesClientImpl$RealTimeReliableMessageBinderCallbacks(zzq paramzzq)
  {
    this.zzaFh = paramzzq;
  }
  
  public void zzb(int paramInt1, int paramInt2, String paramString)
  {
    zzq localzzq = this.zzaFh;
    if (localzzq != null)
    {
      localzzq = this.zzaFh;
      GamesClientImpl.RealTimeMessageSentNotifier localRealTimeMessageSentNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RealTimeMessageSentNotifier;
      localRealTimeMessageSentNotifier.<init>(paramInt1, paramInt2, paramString);
      localzzq.zza(localRealTimeMessageSentNotifier);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RealTimeReliableMessageBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */