package com.google.android.gms.games.internal;

import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMessage;

final class GamesClientImpl$RoomBinderCallbacks
  extends AbstractGamesCallbacks
{
  private final zzq zzaFn;
  private final zzq zzaFo;
  private final zzq zzaFp;
  
  public GamesClientImpl$RoomBinderCallbacks(zzq paramzzq)
  {
    zzq localzzq = (zzq)zzx.zzb(paramzzq, "Callbacks must not be null");
    this.zzaFn = localzzq;
    this.zzaFo = null;
    this.zzaFp = null;
  }
  
  public GamesClientImpl$RoomBinderCallbacks(zzq paramzzq1, zzq paramzzq2, zzq paramzzq3)
  {
    zzq localzzq = (zzq)zzx.zzb(paramzzq1, "Callbacks must not be null");
    this.zzaFn = localzzq;
    this.zzaFo = paramzzq2;
    this.zzaFp = paramzzq3;
  }
  
  public void onLeftRoom(int paramInt, String paramString)
  {
    zzq localzzq = this.zzaFn;
    GamesClientImpl.LeftRoomNotifier localLeftRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$LeftRoomNotifier;
    localLeftRoomNotifier.<init>(paramInt, paramString);
    localzzq.zza(localLeftRoomNotifier);
  }
  
  public void onP2PConnected(String paramString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.P2PConnectedNotifier localP2PConnectedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$P2PConnectedNotifier;
      localP2PConnectedNotifier.<init>(paramString);
      localzzq.zza(localP2PConnectedNotifier);
    }
  }
  
  public void onP2PDisconnected(String paramString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.P2PDisconnectedNotifier localP2PDisconnectedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$P2PDisconnectedNotifier;
      localP2PDisconnectedNotifier.<init>(paramString);
      localzzq.zza(localP2PDisconnectedNotifier);
    }
  }
  
  public void onRealTimeMessageReceived(RealTimeMessage paramRealTimeMessage)
  {
    zzq localzzq = this.zzaFp;
    if (localzzq != null)
    {
      localzzq = this.zzaFp;
      GamesClientImpl.MessageReceivedNotifier localMessageReceivedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$MessageReceivedNotifier;
      localMessageReceivedNotifier.<init>(paramRealTimeMessage);
      localzzq.zza(localMessageReceivedNotifier);
    }
  }
  
  public void zzA(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFn;
    GamesClientImpl.JoinedRoomNotifier localJoinedRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$JoinedRoomNotifier;
    localJoinedRoomNotifier.<init>(paramDataHolder);
    localzzq.zza(localJoinedRoomNotifier);
  }
  
  public void zzB(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.RoomConnectingNotifier localRoomConnectingNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RoomConnectingNotifier;
      localRoomConnectingNotifier.<init>(paramDataHolder);
      localzzq.zza(localRoomConnectingNotifier);
    }
  }
  
  public void zzC(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.RoomAutoMatchingNotifier localRoomAutoMatchingNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RoomAutoMatchingNotifier;
      localRoomAutoMatchingNotifier.<init>(paramDataHolder);
      localzzq.zza(localRoomAutoMatchingNotifier);
    }
  }
  
  public void zzD(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFn;
    GamesClientImpl.RoomConnectedNotifier localRoomConnectedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RoomConnectedNotifier;
    localRoomConnectedNotifier.<init>(paramDataHolder);
    localzzq.zza(localRoomConnectedNotifier);
  }
  
  public void zzE(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.ConnectedToRoomNotifier localConnectedToRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$ConnectedToRoomNotifier;
      localConnectedToRoomNotifier.<init>(paramDataHolder);
      localzzq.zza(localConnectedToRoomNotifier);
    }
  }
  
  public void zzF(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.DisconnectedFromRoomNotifier localDisconnectedFromRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$DisconnectedFromRoomNotifier;
      localDisconnectedFromRoomNotifier.<init>(paramDataHolder);
      localzzq.zza(localDisconnectedFromRoomNotifier);
    }
  }
  
  public void zza(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.PeerInvitedToRoomNotifier localPeerInvitedToRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$PeerInvitedToRoomNotifier;
      localPeerInvitedToRoomNotifier.<init>(paramDataHolder, paramArrayOfString);
      localzzq.zza(localPeerInvitedToRoomNotifier);
    }
  }
  
  public void zzb(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.PeerJoinedRoomNotifier localPeerJoinedRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$PeerJoinedRoomNotifier;
      localPeerJoinedRoomNotifier.<init>(paramDataHolder, paramArrayOfString);
      localzzq.zza(localPeerJoinedRoomNotifier);
    }
  }
  
  public void zzc(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.PeerLeftRoomNotifier localPeerLeftRoomNotifier = new com/google/android/gms/games/internal/GamesClientImpl$PeerLeftRoomNotifier;
      localPeerLeftRoomNotifier.<init>(paramDataHolder, paramArrayOfString);
      localzzq.zza(localPeerLeftRoomNotifier);
    }
  }
  
  public void zzd(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.PeerDeclinedNotifier localPeerDeclinedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$PeerDeclinedNotifier;
      localPeerDeclinedNotifier.<init>(paramDataHolder, paramArrayOfString);
      localzzq.zza(localPeerDeclinedNotifier);
    }
  }
  
  public void zze(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.PeerConnectedNotifier localPeerConnectedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$PeerConnectedNotifier;
      localPeerConnectedNotifier.<init>(paramDataHolder, paramArrayOfString);
      localzzq.zza(localPeerConnectedNotifier);
    }
  }
  
  public void zzf(DataHolder paramDataHolder, String[] paramArrayOfString)
  {
    zzq localzzq = this.zzaFo;
    if (localzzq != null)
    {
      localzzq = this.zzaFo;
      GamesClientImpl.PeerDisconnectedNotifier localPeerDisconnectedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$PeerDisconnectedNotifier;
      localPeerDisconnectedNotifier.<init>(paramDataHolder, paramArrayOfString);
      localzzq.zza(localPeerDisconnectedNotifier);
    }
  }
  
  public void zzz(DataHolder paramDataHolder)
  {
    zzq localzzq = this.zzaFn;
    GamesClientImpl.RoomCreatedNotifier localRoomCreatedNotifier = new com/google/android/gms/games/internal/GamesClientImpl$RoomCreatedNotifier;
    localRoomCreatedNotifier.<init>(paramDataHolder);
    localzzq.zza(localRoomCreatedNotifier);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$RoomBinderCallbacks.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */