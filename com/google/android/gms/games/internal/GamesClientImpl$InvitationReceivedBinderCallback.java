package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;

final class GamesClientImpl$InvitationReceivedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zzq zzari;
  
  GamesClientImpl$InvitationReceivedBinderCallback(zzq paramzzq)
  {
    this.zzari = paramzzq;
  }
  
  public void onInvitationRemoved(String paramString)
  {
    zzq localzzq = this.zzari;
    GamesClientImpl.InvitationRemovedNotifier localInvitationRemovedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$InvitationRemovedNotifier;
    localInvitationRemovedNotifier.<init>(paramString);
    localzzq.zza(localInvitationRemovedNotifier);
  }
  
  public void zzs(DataHolder paramDataHolder)
  {
    Object localObject1 = new com/google/android/gms/games/multiplayer/InvitationBuffer;
    ((InvitationBuffer)localObject1).<init>(paramDataHolder);
    Object localObject2 = null;
    try
    {
      int i = ((InvitationBuffer)localObject1).getCount();
      if (i > 0)
      {
        localObject2 = null;
        localObject2 = ((InvitationBuffer)localObject1).get(0);
        localObject2 = (Invitation)localObject2;
        localObject2 = ((Invitation)localObject2).freeze();
        localObject2 = (Invitation)localObject2;
      }
      ((InvitationBuffer)localObject1).release();
      if (localObject2 != null)
      {
        localObject1 = this.zzari;
        GamesClientImpl.InvitationReceivedNotifier localInvitationReceivedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedNotifier;
        localInvitationReceivedNotifier.<init>((Invitation)localObject2);
        ((zzq)localObject1).zza(localInvitationReceivedNotifier);
      }
      return;
    }
    finally
    {
      ((InvitationBuffer)localObject1).release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$InvitationReceivedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */