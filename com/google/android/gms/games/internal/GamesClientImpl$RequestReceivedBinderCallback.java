package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestBuffer;

final class GamesClientImpl$RequestReceivedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$RequestReceivedBinderCallback(zzq paramzzq)
  {
    this.zzari = paramzzq;
  }
  
  public void onRequestRemoved(String paramString)
  {
    zzq localzzq = this.zzari;
    GamesClientImpl.RequestRemovedNotifier localRequestRemovedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RequestRemovedNotifier;
    localRequestRemovedNotifier.<init>(paramString);
    localzzq.zza(localRequestRemovedNotifier);
  }
  
  public void zzt(DataHolder paramDataHolder)
  {
    Object localObject1 = new com/google/android/gms/games/request/GameRequestBuffer;
    ((GameRequestBuffer)localObject1).<init>(paramDataHolder);
    Object localObject2 = null;
    try
    {
      int i = ((GameRequestBuffer)localObject1).getCount();
      if (i > 0)
      {
        localObject2 = null;
        localObject2 = ((GameRequestBuffer)localObject1).get(0);
        localObject2 = (GameRequest)localObject2;
        localObject2 = ((GameRequest)localObject2).freeze();
        localObject2 = (GameRequest)localObject2;
      }
      ((GameRequestBuffer)localObject1).release();
      if (localObject2 != null)
      {
        localObject1 = this.zzari;
        GamesClientImpl.RequestReceivedNotifier localRequestReceivedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RequestReceivedNotifier;
        localRequestReceivedNotifier.<init>((GameRequest)localObject2);
        ((zzq)localObject1).zza(localRequestReceivedNotifier);
      }
      return;
    }
    finally
    {
      ((GameRequestBuffer)localObject1).release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RequestReceivedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */