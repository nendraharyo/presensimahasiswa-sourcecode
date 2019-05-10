package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer.ReliableMessageSentCallback;

final class GamesClientImpl$RealTimeMessageSentNotifier
  implements zzq.zzb
{
  private final String zzaFf;
  private final int zzaFg;
  private final int zzade;
  
  GamesClientImpl$RealTimeMessageSentNotifier(int paramInt1, int paramInt2, String paramString)
  {
    this.zzade = paramInt1;
    this.zzaFg = paramInt2;
    this.zzaFf = paramString;
  }
  
  public void zza(RealTimeMultiplayer.ReliableMessageSentCallback paramReliableMessageSentCallback)
  {
    if (paramReliableMessageSentCallback != null)
    {
      int i = this.zzade;
      int j = this.zzaFg;
      String str = this.zzaFf;
      paramReliableMessageSentCallback.onRealTimeMessageSent(i, j, str);
    }
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RealTimeMessageSentNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */