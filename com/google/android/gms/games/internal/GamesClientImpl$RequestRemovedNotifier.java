package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq.zzb;
import com.google.android.gms.games.request.OnRequestReceivedListener;

final class GamesClientImpl$RequestRemovedNotifier
  implements zzq.zzb
{
  private final String zzEY;
  
  GamesClientImpl$RequestRemovedNotifier(String paramString)
  {
    this.zzEY = paramString;
  }
  
  public void zza(OnRequestReceivedListener paramOnRequestReceivedListener)
  {
    String str = this.zzEY;
    paramOnRequestReceivedListener.onRequestRemoved(str);
  }
  
  public void zzpr() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestRemovedNotifier.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */