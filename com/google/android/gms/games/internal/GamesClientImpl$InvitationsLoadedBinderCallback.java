package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

final class GamesClientImpl$InvitationsLoadedBinderCallback
  extends AbstractGamesCallbacks
{
  private final zza.zzb zzamC;
  
  GamesClientImpl$InvitationsLoadedBinderCallback(zza.zzb paramzzb)
  {
    zza.zzb localzzb = (zza.zzb)zzx.zzb(paramzzb, "Holder must not be null");
    this.zzamC = localzzb;
  }
  
  public void zzr(DataHolder paramDataHolder)
  {
    zza.zzb localzzb = this.zzamC;
    GamesClientImpl.LoadInvitationsResultImpl localLoadInvitationsResultImpl = new com/google/android/gms/games/internal/GamesClientImpl$LoadInvitationsResultImpl;
    localLoadInvitationsResultImpl.<init>(paramDataHolder);
    localzzb.zzs(localLoadInvitationsResultImpl);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$InvitationsLoadedBinderCallback.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */