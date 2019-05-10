package com.google.android.gms.games.internal;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.zza;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.BinderWrapper;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games.BaseGamesApiMethodImpl;
import com.google.android.gms.games.Games.GamesOptions;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBuffer;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomConfig;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMatchConfig;
import com.google.android.gms.games.snapshot.Snapshot;
import com.google.android.gms.games.snapshot.SnapshotContents;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.signin.internal.zzh;
import java.io.File;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

public final class GamesClientImpl
  extends zzj
{
  EventIncrementManager zzaDZ;
  private final String zzaEa;
  private PlayerEntity zzaEb;
  private GameEntity zzaEc;
  private final PopupManager zzaEd;
  private boolean zzaEe;
  private final Binder zzaEf;
  private final long zzaEg;
  private final Games.GamesOptions zzaEh;
  
  public GamesClientImpl(Context paramContext, Looper paramLooper, zzf paramzzf, Games.GamesOptions paramGamesOptions, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 1, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject = new com/google/android/gms/games/internal/GamesClientImpl$1;
    ((GamesClientImpl.1)localObject).<init>(this);
    this.zzaDZ = ((EventIncrementManager)localObject);
    this.zzaEe = false;
    localObject = paramzzf.zzqv();
    this.zzaEa = ((String)localObject);
    localObject = new android/os/Binder;
    ((Binder)localObject).<init>();
    this.zzaEf = ((Binder)localObject);
    int i = paramzzf.zzqr();
    localObject = PopupManager.zza(this, i);
    this.zzaEd = ((PopupManager)localObject);
    localObject = paramzzf.zzqx();
    zzo((View)localObject);
    long l = hashCode();
    this.zzaEg = l;
    this.zzaEh = paramGamesOptions;
  }
  
  private static Room zzY(DataHolder paramDataHolder)
  {
    RoomBuffer localRoomBuffer = new com/google/android/gms/games/multiplayer/realtime/RoomBuffer;
    localRoomBuffer.<init>(paramDataHolder);
    Object localObject1 = null;
    try
    {
      int i = localRoomBuffer.getCount();
      if (i > 0)
      {
        localObject1 = null;
        localObject1 = localRoomBuffer.get(0);
        localObject1 = (Room)localObject1;
        localObject1 = ((Room)localObject1).freeze();
        localObject1 = (Room)localObject1;
      }
      return (Room)localObject1;
    }
    finally
    {
      localRoomBuffer.release();
    }
  }
  
  private void zzb(RemoteException paramRemoteException)
  {
    GamesLog.zzb("GamesClientImpl", "service died", paramRemoteException);
  }
  
  private void zzwv()
  {
    this.zzaEb = null;
    this.zzaEc = null;
  }
  
  public void disconnect()
  {
    Object localObject1 = null;
    this.zzaEe = false;
    boolean bool = isConnected();
    if (bool) {}
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      ((IGamesService)localObject1).zzwR();
      localObject2 = this.zzaDZ;
      ((EventIncrementManager)localObject2).flush();
      long l = this.zzaEg;
      ((IGamesService)localObject1).zzF(l);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str = "GamesClientImpl";
        Object localObject2 = "Failed to notify client disconnect.";
        GamesLog.zzz(str, (String)localObject2);
      }
    }
    super.disconnect();
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    super.onConnectionFailed(paramConnectionResult);
    this.zzaEe = false;
  }
  
  public int zza(zzq paramzzq, byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      GamesClientImpl.RealTimeReliableMessageBinderCallbacks localRealTimeReliableMessageBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RealTimeReliableMessageBinderCallbacks;
      localRealTimeReliableMessageBinderCallbacks.<init>(paramzzq);
      i = ((IGamesService)localObject).zza(localRealTimeReliableMessageBinderCallbacks, paramArrayOfByte, paramString1, paramString2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int i = -1;
      }
    }
    return i;
  }
  
  public int zza(byte[] paramArrayOfByte, String paramString, String[] paramArrayOfString)
  {
    Object localObject = "Participant IDs must not be null";
    zzx.zzb(paramArrayOfString, localObject);
    try
    {
      localObject = zzqJ();
      localObject = (IGamesService)localObject;
      i = ((IGamesService)localObject).zzb(paramArrayOfByte, paramString, paramArrayOfString);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int i = -1;
      }
    }
    return i;
  }
  
  public Intent zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, Bitmap paramBitmap, String paramString)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zza(paramInt1, paramArrayOfByte, paramInt2, paramString);
      String str = "Must provide a non null icon";
      zzx.zzb(paramBitmap, str);
      str = "com.google.android.gms.games.REQUEST_ITEM_ICON";
      ((Intent)localObject1).putExtra(str, paramBitmap);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zza(PlayerEntity paramPlayerEntity)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zza(paramPlayerEntity);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zza(Room paramRoom, int paramInt)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      Object localObject3 = paramRoom.freeze();
      localObject3 = (RoomEntity)localObject3;
      localObject1 = ((IGamesService)localObject1).zza((RoomEntity)localObject3, paramInt);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zza(String paramString, boolean paramBoolean1, boolean paramBoolean2, int paramInt)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zza(paramString, paramBoolean1, paramBoolean2, paramInt);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  protected void zza(int paramInt1, IBinder paramIBinder, Bundle paramBundle, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramBundle != null))
    {
      Object localObject = GamesClientImpl.class.getClassLoader();
      paramBundle.setClassLoader((ClassLoader)localObject);
      boolean bool = paramBundle.getBoolean("show_welcome_popup");
      this.zzaEe = bool;
      localObject = (PlayerEntity)paramBundle.getParcelable("com.google.android.gms.games.current_player");
      this.zzaEb = ((PlayerEntity)localObject);
      localObject = (GameEntity)paramBundle.getParcelable("com.google.android.gms.games.current_game");
      this.zzaEc = ((GameEntity)localObject);
    }
    super.zza(paramInt1, paramIBinder, paramBundle, paramInt2);
  }
  
  public void zza(IBinder paramIBinder, Bundle paramBundle)
  {
    boolean bool = isConnected();
    if (bool) {}
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      ((IGamesService)localObject).zza(paramIBinder, paramBundle);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zza(GoogleApiClient.zza paramzza)
  {
    zzwv();
    super.zza(paramzza);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.InvitationsLoadedBinderCallback localInvitationsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;
    localInvitationsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localInvitationsLoadedBinderCallback, paramInt);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt1, int paramInt2, int paramInt3)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestsLoadedBinderCallbacks localRequestsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;
    localRequestsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localRequestsLoadedBinderCallbacks, paramInt1, paramInt2, paramInt3);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt, String paramString, String[] paramArrayOfString, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.AppContentLoadedBinderCallbacks localAppContentLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$AppContentLoadedBinderCallbacks;
    localAppContentLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localAppContentLoadedBinderCallbacks, paramInt, paramString, paramArrayOfString, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localPlayersLoadedBinderCallback, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zza(zza.zzb paramzzb, int paramInt, int[] paramArrayOfInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks localTurnBasedMatchesLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;
    localTurnBasedMatchesLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localTurnBasedMatchesLoadedBinderCallbacks, paramInt, paramArrayOfInt);
  }
  
  public void zza(zza.zzb paramzzb, LeaderboardScoreBuffer paramLeaderboardScoreBuffer, int paramInt1, int paramInt2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardScoresLoadedBinderCallback localLeaderboardScoresLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;
    localLeaderboardScoresLoadedBinderCallback.<init>(paramzzb);
    Bundle localBundle = paramLeaderboardScoreBuffer.zzxJ().asBundle();
    localIGamesService.zza(localLeaderboardScoresLoadedBinderCallback, localBundle, paramInt1, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, TurnBasedMatchConfig paramTurnBasedMatchConfig)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks localTurnBasedMatchInitiatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;
    localTurnBasedMatchInitiatedBinderCallbacks.<init>(paramzzb);
    int i = paramTurnBasedMatchConfig.getVariant();
    int j = paramTurnBasedMatchConfig.zzxP();
    String[] arrayOfString = paramTurnBasedMatchConfig.getInvitedPlayerIds();
    Bundle localBundle = paramTurnBasedMatchConfig.getAutoMatchCriteria();
    localIGamesService.zza(localTurnBasedMatchInitiatedBinderCallbacks, i, j, arrayOfString, localBundle);
  }
  
  public void zza(zza.zzb paramzzb, Snapshot paramSnapshot, SnapshotMetadataChange paramSnapshotMetadataChange)
  {
    Object localObject1 = paramSnapshot.getSnapshotContents();
    boolean bool = ((SnapshotContents)localObject1).isClosed();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      Object localObject2 = "Snapshot already closed";
      zzx.zza(bool, localObject2);
      Object localObject3 = paramSnapshotMetadataChange.zzxU();
      if (localObject3 != null)
      {
        localObject2 = getContext().getCacheDir();
        ((BitmapTeleporter)localObject3).zzc((File)localObject2);
      }
      localObject2 = ((SnapshotContents)localObject1).zzsx();
      ((SnapshotContents)localObject1).close();
      localObject3 = (IGamesService)zzqJ();
      localObject1 = new com/google/android/gms/games/internal/GamesClientImpl$SnapshotCommittedBinderCallbacks;
      ((GamesClientImpl.SnapshotCommittedBinderCallbacks)localObject1).<init>(paramzzb);
      String str = paramSnapshot.getMetadata().getSnapshotId();
      paramSnapshotMetadataChange = (SnapshotMetadataChangeEntity)paramSnapshotMetadataChange;
      ((IGamesService)localObject3).zza((IGamesCallbacks)localObject1, str, paramSnapshotMetadataChange, (Contents)localObject2);
      return;
      bool = false;
      localObject3 = null;
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString)
  {
    Object localObject1;
    if (paramzzb == null) {
      localObject1 = null;
    }
    for (Object localObject2 = null;; localObject2 = localObject1)
    {
      localObject1 = (IGamesService)zzqJ();
      IBinder localIBinder = this.zzaEd.zzxj();
      Bundle localBundle = this.zzaEd.zzxi();
      ((IGamesService)localObject1).zza((IGamesCallbacks)localObject2, paramString, localIBinder, localBundle);
      return;
      localObject1 = new com/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;
      ((GamesClientImpl.AchievementUpdatedBinderCallback)localObject1).<init>(paramzzb);
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString, int paramInt)
  {
    Object localObject;
    if (paramzzb == null) {
      localObject = null;
    }
    for (;;)
    {
      IGamesService localIGamesService = (IGamesService)zzqJ();
      IBinder localIBinder = this.zzaEd.zzxj();
      Bundle localBundle = this.zzaEd.zzxi();
      localIGamesService.zza((IGamesCallbacks)localObject, paramString, paramInt, localIBinder, localBundle);
      return;
      localObject = new com/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;
      ((GamesClientImpl.AchievementUpdatedBinderCallback)localObject).<init>(paramzzb);
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardScoresLoadedBinderCallback localLeaderboardScoresLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;
    localLeaderboardScoresLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localLeaderboardScoresLoadedBinderCallback, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -1;
    int j = paramString.hashCode();
    switch (j)
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Invalid player collection: " + paramString;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        localObject2 = "played_with";
        boolean bool = paramString.equals(localObject2);
        if (bool)
        {
          i = 0;
          localObject1 = null;
        }
        break;
      }
    }
    Object localObject1 = (IGamesService)zzqJ();
    Object localObject2 = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    ((GamesClientImpl.PlayersLoadedBinderCallback)localObject2).<init>(paramzzb);
    ((IGamesService)localObject1).zzd((IGamesCallbacks)localObject2, paramString, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, int paramInt, int[] paramArrayOfInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchesLoadedBinderCallbacks localTurnBasedMatchesLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchesLoadedBinderCallbacks;
    localTurnBasedMatchesLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localTurnBasedMatchesLoadedBinderCallbacks, paramString, paramInt, paramArrayOfInt);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, long paramLong, String paramString2)
  {
    Object localObject;
    if (paramzzb == null) {
      localObject = null;
    }
    for (;;)
    {
      ((IGamesService)zzqJ()).zza((IGamesCallbacks)localObject, paramString1, paramLong, paramString2);
      return;
      localObject = new com/google/android/gms/games/internal/GamesClientImpl$SubmitScoreBinderCallbacks;
      ((GamesClientImpl.SubmitScoreBinderCallbacks)localObject).<init>(paramzzb);
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchLeftBinderCallbacks localTurnBasedMatchLeftBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;
    localTurnBasedMatchLeftBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzc(localTurnBasedMatchLeftBinderCallbacks, paramString1, paramString2);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayerLeaderboardScoreLoadedBinderCallback localPlayerLeaderboardScoreLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayerLeaderboardScoreLoadedBinderCallback;
    localPlayerLeaderboardScoreLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localPlayerLeaderboardScoreLoadedBinderCallback, paramString1, paramString2, paramInt1, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestsLoadedBinderCallbacks localRequestsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestsLoadedBinderCallbacks;
    localRequestsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localRequestsLoadedBinderCallbacks, paramString1, paramString2, paramInt1, paramInt2, paramInt3);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardScoresLoadedBinderCallback localLeaderboardScoresLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;
    localLeaderboardScoresLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localLeaderboardScoresLoadedBinderCallback, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = -1;
    int j = paramString1.hashCode();
    switch (j)
    {
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        localObject1 = new java/lang/IllegalArgumentException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = "Invalid player collection: " + paramString1;
        ((IllegalArgumentException)localObject1).<init>((String)localObject2);
        throw ((Throwable)localObject1);
        localObject2 = "circled";
        boolean bool = paramString1.equals(localObject2);
        if (bool)
        {
          i = 0;
          localObject1 = null;
          continue;
          localObject2 = "played_with";
          bool = paramString1.equals(localObject2);
          if (bool)
          {
            i = 1;
            continue;
            localObject2 = "nearby";
            bool = paramString1.equals(localObject2);
            if (bool) {
              i = 2;
            }
          }
        }
        break;
      }
    }
    Object localObject1 = (IGamesService)zzqJ();
    Object localObject2 = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    ((GamesClientImpl.PlayersLoadedBinderCallback)localObject2).<init>(paramzzb);
    ((IGamesService)localObject1).zza((IGamesCallbacks)localObject2, paramString1, paramString2, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, SnapshotMetadataChange paramSnapshotMetadataChange, SnapshotContents paramSnapshotContents)
  {
    boolean bool = paramSnapshotContents.isClosed();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      Object localObject1 = "SnapshotContents already closed";
      zzx.zza(bool, localObject1);
      Object localObject2 = paramSnapshotMetadataChange.zzxU();
      if (localObject2 != null)
      {
        localObject1 = getContext().getCacheDir();
        ((BitmapTeleporter)localObject2).zzc((File)localObject1);
      }
      Contents localContents = paramSnapshotContents.zzsx();
      paramSnapshotContents.close();
      localObject2 = (IGamesService)zzqJ();
      localObject1 = new com/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;
      ((GamesClientImpl.SnapshotOpenedBinderCallbacks)localObject1).<init>(paramzzb);
      Object localObject3 = paramSnapshotMetadataChange;
      localObject3 = (SnapshotMetadataChangeEntity)paramSnapshotMetadataChange;
      ((IGamesService)localObject2).zza((IGamesCallbacks)localObject1, paramString1, paramString2, (SnapshotMetadataChangeEntity)localObject3, localContents);
      return;
      bool = false;
      localObject2 = null;
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardsLoadedBinderCallback localLeaderboardsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;
    localLeaderboardsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localLeaderboardsLoadedBinderCallback, paramString1, paramString2, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean, String[] paramArrayOfString)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.QuestsLoadedBinderCallbacks localQuestsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;
    localQuestsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localQuestsLoadedBinderCallbacks, paramString1, paramString2, paramArrayOfString, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.QuestsLoadedBinderCallbacks localQuestsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;
    localQuestsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localQuestsLoadedBinderCallbacks, paramString1, paramString2, paramArrayOfInt, paramInt, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, String[] paramArrayOfString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestsUpdatedBinderCallbacks localRequestsUpdatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;
    localRequestsUpdatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localRequestsUpdatedBinderCallbacks, paramString1, paramString2, paramArrayOfString);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzf(localPlayersLoadedBinderCallback, paramString, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, boolean paramBoolean, int paramInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.SnapshotOpenedBinderCallbacks localSnapshotOpenedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$SnapshotOpenedBinderCallbacks;
    localSnapshotOpenedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localSnapshotOpenedBinderCallbacks, paramString, paramBoolean, paramInt);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, byte[] paramArrayOfByte, String paramString2, ParticipantResult[] paramArrayOfParticipantResult)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchUpdatedBinderCallbacks localTurnBasedMatchUpdatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;
    localTurnBasedMatchUpdatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localTurnBasedMatchUpdatedBinderCallbacks, paramString1, paramArrayOfByte, paramString2, paramArrayOfParticipantResult);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, byte[] paramArrayOfByte, ParticipantResult[] paramArrayOfParticipantResult)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchUpdatedBinderCallbacks localTurnBasedMatchUpdatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchUpdatedBinderCallbacks;
    localTurnBasedMatchUpdatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localTurnBasedMatchUpdatedBinderCallbacks, paramString, paramArrayOfByte, paramArrayOfParticipantResult);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, String[] paramArrayOfString, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestSentBinderCallbacks localRequestSentBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestSentBinderCallbacks;
    localRequestSentBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localRequestSentBinderCallbacks, paramString, paramArrayOfString, paramInt1, paramArrayOfByte, paramInt2);
  }
  
  public void zza(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzc(localPlayersLoadedBinderCallback, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, boolean paramBoolean, Bundle paramBundle)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.ContactSettingsUpdatedBinderCallback localContactSettingsUpdatedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$ContactSettingsUpdatedBinderCallback;
    localContactSettingsUpdatedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localContactSettingsUpdatedBinderCallback, paramBoolean, paramBundle);
  }
  
  public void zza(zza.zzb paramzzb, boolean paramBoolean, String... paramVarArgs)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.EventsLoadedBinderCallback localEventsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;
    localEventsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localEventsLoadedBinderCallback, paramBoolean, paramVarArgs);
  }
  
  public void zza(zza.zzb paramzzb, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.QuestsLoadedBinderCallbacks localQuestsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;
    localQuestsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localQuestsLoadedBinderCallbacks, paramArrayOfInt, paramInt, paramBoolean);
  }
  
  public void zza(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzc(localPlayersLoadedBinderCallback, paramArrayOfString);
  }
  
  public void zza(zzq paramzzq)
  {
    try
    {
      GamesClientImpl.InvitationReceivedBinderCallback localInvitationReceivedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$InvitationReceivedBinderCallback;
      localInvitationReceivedBinderCallback.<init>(paramzzq);
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zza(localInvitationReceivedBinderCallback, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zza(zzq paramzzq1, zzq paramzzq2, zzq paramzzq3, RoomConfig paramRoomConfig)
  {
    try
    {
      GamesClientImpl.RoomBinderCallbacks localRoomBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;
      localRoomBinderCallbacks.<init>(paramzzq1, paramzzq2, paramzzq3);
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      Binder localBinder = this.zzaEf;
      int i = paramRoomConfig.getVariant();
      String[] arrayOfString = paramRoomConfig.getInvitedPlayerIds();
      Bundle localBundle = paramRoomConfig.getAutoMatchCriteria();
      long l = this.zzaEg;
      ((IGamesService)localObject).zza(localRoomBinderCallbacks, localBinder, i, arrayOfString, localBundle, false, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zza(zzq paramzzq, String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      GamesClientImpl.RoomBinderCallbacks localRoomBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;
      localRoomBinderCallbacks.<init>(paramzzq);
      ((IGamesService)localObject).zzc(localRoomBinderCallbacks, paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zza(Games.BaseGamesApiMethodImpl paramBaseGamesApiMethodImpl, String paramString1, String paramString2, VideoConfiguration paramVideoConfiguration)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.StartRecordingBinderCallback localStartRecordingBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$StartRecordingBinderCallback;
    localStartRecordingBinderCallback.<init>(paramBaseGamesApiMethodImpl);
    localIGamesService.zza(localStartRecordingBinderCallback, paramString1, paramString2, paramVideoConfiguration);
  }
  
  public void zza(IGamesService paramIGamesService)
  {
    super.zza(paramIGamesService);
    boolean bool = this.zzaEe;
    if (bool)
    {
      this.zzaEd.zzxh();
      bool = false;
      localGamesOptions = null;
      this.zzaEe = false;
    }
    Games.GamesOptions localGamesOptions = this.zzaEh;
    bool = localGamesOptions.zzaCE;
    if (!bool) {
      zzb(paramIGamesService);
    }
  }
  
  public void zza(Snapshot paramSnapshot)
  {
    SnapshotContents localSnapshotContents = paramSnapshot.getSnapshotContents();
    boolean bool = localSnapshotContents.isClosed();
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      zzx.zza(bool, "Snapshot already closed");
      Contents localContents = localSnapshotContents.zzsx();
      localSnapshotContents.close();
      try
      {
        localObject = zzqJ();
        localObject = (IGamesService)localObject;
        ((IGamesService)localObject).zza(localContents);
        return;
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          Object localObject;
          zzb(localRemoteException);
        }
      }
      bool = false;
      localObject = null;
    }
  }
  
  public String zzah(boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      localObject1 = this.zzaEb;
      if (localObject1 != null) {
        localObject1 = this.zzaEb.getPlayerId();
      }
    }
    for (;;)
    {
      return (String)localObject1;
      try
      {
        localObject1 = zzqJ();
        localObject1 = (IGamesService)localObject1;
        localObject1 = ((IGamesService)localObject1).zzwT();
      }
      catch (RemoteException localRemoteException)
      {
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
  }
  
  public Intent zzb(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzb(paramInt1, paramInt2, paramBoolean);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zzb(int[] paramArrayOfInt)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzb(paramArrayOfInt);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  protected Set zzb(Set paramSet)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    String str1 = null;
    Object localObject1 = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject1).<init>("https://www.googleapis.com/auth/games");
    Scope localScope = new com/google/android/gms/common/api/Scope;
    Object localObject2 = "https://www.googleapis.com/auth/games.firstparty";
    localScope.<init>((String)localObject2);
    Iterator localIterator = paramSet.iterator();
    int j = 0;
    Object localObject3 = null;
    float f2 = 0.0F;
    int k = 0;
    Object[] arrayOfObject = null;
    float f3 = 0.0F;
    int m = localIterator.hasNext();
    float f4;
    if (m != 0)
    {
      localObject2 = (Scope)localIterator.next();
      boolean bool = ((Scope)localObject2).equals(localObject1);
      if (bool)
      {
        m = j;
        f4 = f2;
        j = i;
        f2 = f1;
      }
    }
    for (;;)
    {
      k = j;
      f3 = f2;
      j = m;
      f2 = f4;
      break;
      m = ((Scope)localObject2).equals(localScope);
      if (m != 0)
      {
        m = i;
        f4 = f1;
        j = k;
        f2 = f3;
        continue;
        if (j != 0) {
          if (k == 0)
          {
            m = i;
            f4 = f1;
            localObject3 = "Cannot have both %s and %s!";
            k = 2;
            f3 = 2.8E-45F;
            arrayOfObject = new Object[k];
            localObject1 = "https://www.googleapis.com/auth/games";
            arrayOfObject[0] = localObject1;
            str1 = "https://www.googleapis.com/auth/games.firstparty";
            arrayOfObject[i] = str1;
            zzx.zza(m, (String)localObject3, arrayOfObject);
          }
        }
        for (;;)
        {
          return paramSet;
          m = 0;
          localObject2 = null;
          f4 = 0.0F;
          break;
          localObject2 = "Games APIs requires %s to function.";
          localObject3 = new Object[i];
          String str2 = "https://www.googleapis.com/auth/games";
          localObject3[0] = str2;
          zzx.zza(k, (String)localObject2, (Object[])localObject3);
        }
      }
      else
      {
        m = j;
        f4 = f2;
        j = k;
        f2 = f3;
      }
    }
  }
  
  public void zzb(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localPlayersLoadedBinderCallback, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString)
  {
    Object localObject1;
    if (paramzzb == null) {
      localObject1 = null;
    }
    for (Object localObject2 = null;; localObject2 = localObject1)
    {
      localObject1 = (IGamesService)zzqJ();
      IBinder localIBinder = this.zzaEd.zzxj();
      Bundle localBundle = this.zzaEd.zzxi();
      ((IGamesService)localObject1).zzb((IGamesCallbacks)localObject2, paramString, localIBinder, localBundle);
      return;
      localObject1 = new com/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;
      ((GamesClientImpl.AchievementUpdatedBinderCallback)localObject1).<init>(paramzzb);
    }
  }
  
  public void zzb(zza.zzb paramzzb, String paramString, int paramInt)
  {
    Object localObject;
    if (paramzzb == null) {
      localObject = null;
    }
    for (;;)
    {
      IGamesService localIGamesService = (IGamesService)zzqJ();
      IBinder localIBinder = this.zzaEd.zzxj();
      Bundle localBundle = this.zzaEd.zzxi();
      localIGamesService.zzb((IGamesCallbacks)localObject, paramString, paramInt, localIBinder, localBundle);
      return;
      localObject = new com/google/android/gms/games/internal/GamesClientImpl$AchievementUpdatedBinderCallback;
      ((GamesClientImpl.AchievementUpdatedBinderCallback)localObject).<init>(paramzzb);
    }
  }
  
  public void zzb(zza.zzb paramzzb, String paramString, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardScoresLoadedBinderCallback localLeaderboardScoresLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;
    localLeaderboardScoresLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localLeaderboardScoresLoadedBinderCallback, paramString, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localPlayersLoadedBinderCallback, paramString, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.QuestMilestoneClaimBinderCallbacks localQuestMilestoneClaimBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$QuestMilestoneClaimBinderCallbacks;
    localQuestMilestoneClaimBinderCallbacks.<init>(paramzzb, paramString2);
    localIGamesService.zzf(localQuestMilestoneClaimBinderCallbacks, paramString1, paramString2);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardScoresLoadedBinderCallback localLeaderboardScoresLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardScoresLoadedBinderCallback;
    localLeaderboardScoresLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localLeaderboardScoresLoadedBinderCallback, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramBoolean);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString1, String paramString2, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localPlayersLoadedBinderCallback, paramString1, paramString2, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.AchievementsLoadedBinderCallback localAchievementsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;
    localAchievementsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localAchievementsLoadedBinderCallback, paramString1, paramString2, paramBoolean);
  }
  
  public void zzb(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardsLoadedBinderCallback localLeaderboardsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;
    localLeaderboardsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzc(localLeaderboardsLoadedBinderCallback, paramString, paramBoolean);
  }
  
  public void zzb(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardsLoadedBinderCallback localLeaderboardsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;
    localLeaderboardsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localLeaderboardsLoadedBinderCallback, paramBoolean);
  }
  
  public void zzb(zza.zzb paramzzb, boolean paramBoolean, String[] paramArrayOfString)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.QuestsLoadedBinderCallbacks localQuestsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$QuestsLoadedBinderCallbacks;
    localQuestsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localQuestsLoadedBinderCallbacks, paramArrayOfString, paramBoolean);
  }
  
  public void zzb(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestsUpdatedBinderCallbacks localRequestsUpdatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;
    localRequestsUpdatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localRequestsUpdatedBinderCallbacks, paramArrayOfString);
  }
  
  public void zzb(zzq paramzzq)
  {
    try
    {
      GamesClientImpl.MatchUpdateReceivedBinderCallback localMatchUpdateReceivedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$MatchUpdateReceivedBinderCallback;
      localMatchUpdateReceivedBinderCallback.<init>(paramzzq);
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzb(localMatchUpdateReceivedBinderCallback, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzb(zzq paramzzq1, zzq paramzzq2, zzq paramzzq3, RoomConfig paramRoomConfig)
  {
    try
    {
      GamesClientImpl.RoomBinderCallbacks localRoomBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RoomBinderCallbacks;
      localRoomBinderCallbacks.<init>(paramzzq1, paramzzq2, paramzzq3);
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      Binder localBinder = this.zzaEf;
      String str = paramRoomConfig.getInvitationId();
      long l = this.zzaEg;
      ((IGamesService)localObject).zza(localRoomBinderCallbacks, localBinder, str, false, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzb(IGamesService paramIGamesService)
  {
    try
    {
      GamesClientImpl.PopupLocationInfoBinderCallbacks localPopupLocationInfoBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$PopupLocationInfoBinderCallbacks;
      PopupManager localPopupManager = this.zzaEd;
      localPopupLocationInfoBinderCallbacks.<init>(localPopupManager);
      long l = this.zzaEg;
      paramIGamesService.zza(localPopupLocationInfoBinderCallbacks, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzb(String paramString, zza.zzb paramzzb)
  {
    zzx.zzh(paramString, "Please provide a valid serverClientId");
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GetServerAuthCodeBinderCallbacks localGetServerAuthCodeBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$GetServerAuthCodeBinderCallbacks;
    localGetServerAuthCodeBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(paramString, localGetServerAuthCodeBinderCallbacks);
  }
  
  protected IGamesService zzbV(IBinder paramIBinder)
  {
    return IGamesService.Stub.zzbY(paramIBinder);
  }
  
  public Intent zzc(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzc(paramInt1, paramInt2, paramBoolean);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public void zzc(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzc(localPlayersLoadedBinderCallback, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zzc(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks localTurnBasedMatchInitiatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;
    localTurnBasedMatchInitiatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzl(localTurnBasedMatchInitiatedBinderCallbacks, paramString);
  }
  
  public void zzc(zza.zzb paramzzb, String paramString, int paramInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayerXpStreamLoadedBinderCallback localPlayerXpStreamLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;
    localPlayerXpStreamLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localPlayerXpStreamLoadedBinderCallback, paramString, paramInt);
  }
  
  public void zzc(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks localTurnBasedMatchInitiatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;
    localTurnBasedMatchInitiatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzd(localTurnBasedMatchInitiatedBinderCallbacks, paramString1, paramString2);
  }
  
  public void zzc(zza.zzb paramzzb, String paramString1, String paramString2, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.SnapshotsLoadedBinderCallbacks localSnapshotsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;
    localSnapshotsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzc(localSnapshotsLoadedBinderCallbacks, paramString1, paramString2, paramBoolean);
  }
  
  public void zzc(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.LeaderboardsLoadedBinderCallback localLeaderboardsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$LeaderboardsLoadedBinderCallback;
    localLeaderboardsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzd(localLeaderboardsLoadedBinderCallback, paramString, paramBoolean);
  }
  
  public void zzc(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.AchievementsLoadedBinderCallback localAchievementsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$AchievementsLoadedBinderCallback;
    localAchievementsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localAchievementsLoadedBinderCallback, paramBoolean);
  }
  
  public void zzc(zza.zzb paramzzb, String[] paramArrayOfString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestsUpdatedBinderCallbacks localRequestsUpdatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestsUpdatedBinderCallbacks;
    localRequestsUpdatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzb(localRequestsUpdatedBinderCallbacks, paramArrayOfString);
  }
  
  public void zzc(zzq paramzzq)
  {
    try
    {
      GamesClientImpl.QuestUpdateBinderCallback localQuestUpdateBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$QuestUpdateBinderCallback;
      localQuestUpdateBinderCallback.<init>(paramzzq);
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzd(localQuestUpdateBinderCallback, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public int zzd(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      i = ((IGamesService)localObject).zzb(paramArrayOfByte, paramString, null);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int i = -1;
      }
    }
    return i;
  }
  
  public void zzd(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GetAuthTokenBinderCallbacks localGetAuthTokenBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$GetAuthTokenBinderCallbacks;
    localGetAuthTokenBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzk(localGetAuthTokenBinderCallbacks);
  }
  
  public void zzd(zza.zzb paramzzb, int paramInt, boolean paramBoolean1, boolean paramBoolean2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayersLoadedBinderCallback localPlayersLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayersLoadedBinderCallback;
    localPlayersLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zze(localPlayersLoadedBinderCallback, paramInt, paramBoolean1, paramBoolean2);
  }
  
  public void zzd(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks localTurnBasedMatchInitiatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;
    localTurnBasedMatchInitiatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzm(localTurnBasedMatchInitiatedBinderCallbacks, paramString);
  }
  
  public void zzd(zza.zzb paramzzb, String paramString, int paramInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayerXpStreamLoadedBinderCallback localPlayerXpStreamLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayerXpStreamLoadedBinderCallback;
    localPlayerXpStreamLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzc(localPlayerXpStreamLoadedBinderCallback, paramString, paramInt);
  }
  
  public void zzd(zza.zzb paramzzb, String paramString1, String paramString2)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchInitiatedBinderCallbacks localTurnBasedMatchInitiatedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchInitiatedBinderCallbacks;
    localTurnBasedMatchInitiatedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zze(localTurnBasedMatchInitiatedBinderCallbacks, paramString1, paramString2);
  }
  
  public void zzd(zza.zzb paramzzb, String paramString, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GameMuteStatusChangedBinderCallback localGameMuteStatusChangedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusChangedBinderCallback;
    localGameMuteStatusChangedBinderCallback.<init>(paramzzb);
    localIGamesService.zza(localGameMuteStatusChangedBinderCallback, paramString, paramBoolean);
  }
  
  public void zzd(zza.zzb paramzzb, boolean paramBoolean)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.EventsLoadedBinderCallback localEventsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$EventsLoadedBinderCallback;
    localEventsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzf(localEventsLoadedBinderCallback, paramBoolean);
  }
  
  public void zzd(zzq paramzzq)
  {
    try
    {
      GamesClientImpl.RequestReceivedBinderCallback localRequestReceivedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$RequestReceivedBinderCallback;
      localRequestReceivedBinderCallback.<init>(paramzzq);
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzc(localRequestReceivedBinderCallback, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzdH(String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      ((IGamesService)localObject).zzdP(paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public Intent zzdI(String paramString)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzdI(paramString);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public void zzdJ(String paramString)
  {
    try
    {
      Object localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      Object localObject2 = this.zzaEd;
      localObject2 = ((PopupManager)localObject2).zzxj();
      Object localObject3 = this.zzaEd;
      localObject3 = ((PopupManager)localObject3).zzxi();
      ((IGamesService)localObject1).zza(paramString, (IBinder)localObject2, (Bundle)localObject3);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zze(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GamesLoadedBinderCallback localGamesLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$GamesLoadedBinderCallback;
    localGamesLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzd(localGamesLoadedBinderCallback);
  }
  
  public void zze(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchLeftBinderCallbacks localTurnBasedMatchLeftBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLeftBinderCallbacks;
    localTurnBasedMatchLeftBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzo(localTurnBasedMatchLeftBinderCallbacks, paramString);
  }
  
  public void zze(zza.zzb paramzzb, String paramString, int paramInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.InvitationsLoadedBinderCallback localInvitationsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;
    localInvitationsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzb(localInvitationsLoadedBinderCallback, paramString, paramInt, false);
  }
  
  public void zze(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayerStatsLoadedBinderCallbacks localPlayerStatsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$PlayerStatsLoadedBinderCallbacks;
    localPlayerStatsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzi(localPlayerStatsLoadedBinderCallbacks, paramBoolean);
  }
  
  public void zzf(zza.zzb paramzzb)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.SignOutCompleteBinderCallbacks localSignOutCompleteBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$SignOutCompleteBinderCallbacks;
    localSignOutCompleteBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localSignOutCompleteBinderCallbacks);
  }
  
  public void zzf(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchCanceledBinderCallbacks localTurnBasedMatchCanceledBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchCanceledBinderCallbacks;
    localTurnBasedMatchCanceledBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzn(localTurnBasedMatchCanceledBinderCallbacks, paramString);
  }
  
  public void zzf(zza.zzb paramzzb, String paramString, int paramInt)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.RequestSummariesLoadedBinderCallbacks localRequestSummariesLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$RequestSummariesLoadedBinderCallbacks;
    localRequestSummariesLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zza(localRequestSummariesLoadedBinderCallbacks, paramString, paramInt);
  }
  
  public void zzf(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.SnapshotsLoadedBinderCallbacks localSnapshotsLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$SnapshotsLoadedBinderCallbacks;
    localSnapshotsLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzd(localSnapshotsLoadedBinderCallbacks, paramBoolean);
  }
  
  public void zzg(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.VideoRecordingCapabilitiesBinderCallback localVideoRecordingCapabilitiesBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$VideoRecordingCapabilitiesBinderCallback;
    localVideoRecordingCapabilitiesBinderCallback.<init>(paramzzb);
    localIGamesService.zzm(localVideoRecordingCapabilitiesBinderCallback);
  }
  
  public void zzg(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.TurnBasedMatchLoadedBinderCallbacks localTurnBasedMatchLoadedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$TurnBasedMatchLoadedBinderCallbacks;
    localTurnBasedMatchLoadedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzp(localTurnBasedMatchLoadedBinderCallbacks, paramString);
  }
  
  public void zzg(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.ProfileSettingsLoadedBinderCallback localProfileSettingsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsLoadedBinderCallback;
    localProfileSettingsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzg(localProfileSettingsLoadedBinderCallback, paramBoolean);
  }
  
  public void zzgs(int paramInt)
  {
    this.zzaEd.setGravity(paramInt);
  }
  
  public void zzgt(int paramInt)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      ((IGamesService)localObject).zzgt(paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.games.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.games.internal.IGamesService";
  }
  
  public void zzh(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.VideoRecordingAvailableBinderCallback localVideoRecordingAvailableBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$VideoRecordingAvailableBinderCallback;
    localVideoRecordingAvailableBinderCallback.<init>(paramzzb);
    localIGamesService.zzn(localVideoRecordingAvailableBinderCallback);
  }
  
  public void zzh(zza.zzb paramzzb, String paramString)
  {
    this.zzaDZ.flush();
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.QuestAcceptedBinderCallbacks localQuestAcceptedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$QuestAcceptedBinderCallbacks;
    localQuestAcceptedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzu(localQuestAcceptedBinderCallbacks, paramString);
  }
  
  public void zzh(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.ProfileSettingsUpdatedBinderCallback localProfileSettingsUpdatedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$ProfileSettingsUpdatedBinderCallback;
    localProfileSettingsUpdatedBinderCallback.<init>(paramzzb);
    localIGamesService.zzh(localProfileSettingsUpdatedBinderCallback, paramBoolean);
  }
  
  public void zzi(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.ListVideosBinderCallback localListVideosBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$ListVideosBinderCallback;
    localListVideosBinderCallback.<init>(paramzzb);
    localIGamesService.zzl(localListVideosBinderCallback);
  }
  
  public void zzi(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.SnapshotDeletedBinderCallbacks localSnapshotDeletedBinderCallbacks = new com/google/android/gms/games/internal/GamesClientImpl$SnapshotDeletedBinderCallbacks;
    localSnapshotDeletedBinderCallbacks.<init>(paramzzb);
    localIGamesService.zzr(localSnapshotDeletedBinderCallbacks, paramString);
  }
  
  public void zzi(zza.zzb paramzzb, boolean paramBoolean)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.ContactSettingsLoadedBinderCallback localContactSettingsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$ContactSettingsLoadedBinderCallback;
    localContactSettingsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zze(localContactSettingsLoadedBinderCallback, paramBoolean);
  }
  
  public void zzj(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.NotifyAclLoadedBinderCallback localNotifyAclLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$NotifyAclLoadedBinderCallback;
    localNotifyAclLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzh(localNotifyAclLoadedBinderCallback);
  }
  
  public void zzj(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GameInstancesLoadedBinderCallback localGameInstancesLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$GameInstancesLoadedBinderCallback;
    localGameInstancesLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzf(localGameInstancesLoadedBinderCallback, paramString);
  }
  
  public void zzk(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.InboxCountsLoadedBinderCallback localInboxCountsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$InboxCountsLoadedBinderCallback;
    localInboxCountsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzt(localInboxCountsLoadedBinderCallback, null);
  }
  
  public void zzk(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GameSearchSuggestionsLoadedBinderCallback localGameSearchSuggestionsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$GameSearchSuggestionsLoadedBinderCallback;
    localGameSearchSuggestionsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzq(localGameSearchSuggestionsLoadedBinderCallback, paramString);
  }
  
  public Intent zzl(String paramString, int paramInt1, int paramInt2)
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzm(paramString, paramInt1, paramInt2);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public void zzl(zza.zzb paramzzb)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.ExperimentsLoadedBinderCallback localExperimentsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$ExperimentsLoadedBinderCallback;
    localExperimentsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzo(localExperimentsLoadedBinderCallback);
  }
  
  public void zzl(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.PlayerXpForGameCategoriesLoadedBinderCallback localPlayerXpForGameCategoriesLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$PlayerXpForGameCategoriesLoadedBinderCallback;
    localPlayerXpForGameCategoriesLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzs(localPlayerXpForGameCategoriesLoadedBinderCallback, paramString);
  }
  
  public void zzm(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.InvitationsLoadedBinderCallback localInvitationsLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$InvitationsLoadedBinderCallback;
    localInvitationsLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzk(localInvitationsLoadedBinderCallback, paramString);
  }
  
  public boolean zzmE()
  {
    return true;
  }
  
  protected Bundle zzml()
  {
    String str = getContext().getResources().getConfiguration().locale.toString();
    Bundle localBundle = this.zzaEh.zzvD();
    Object localObject1 = this.zzaEa;
    localBundle.putString("com.google.android.gms.games.key.gamePackageName", (String)localObject1);
    localBundle.putString("com.google.android.gms.games.key.desiredLocale", str);
    Object localObject2 = new com/google/android/gms/common/internal/BinderWrapper;
    localObject1 = this.zzaEd.zzxj();
    ((BinderWrapper)localObject2).<init>((IBinder)localObject1);
    localBundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", (Parcelable)localObject2);
    localBundle.putInt("com.google.android.gms.games.key.API_VERSION", 3);
    localObject2 = zzh.zza(zzqH());
    localBundle.putBundle("com.google.android.gms.games.key.signInOptions", (Bundle)localObject2);
    return localBundle;
  }
  
  public void zzn(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.NotifyAclUpdatedBinderCallback localNotifyAclUpdatedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$NotifyAclUpdatedBinderCallback;
    localNotifyAclUpdatedBinderCallback.<init>(paramzzb);
    localIGamesService.zzj(localNotifyAclUpdatedBinderCallback, paramString);
  }
  
  public void zzo(View paramView)
  {
    this.zzaEd.zzp(paramView);
  }
  
  public void zzo(zza.zzb paramzzb, String paramString)
  {
    IGamesService localIGamesService = (IGamesService)zzqJ();
    GamesClientImpl.GameMuteStatusLoadedBinderCallback localGameMuteStatusLoadedBinderCallback = new com/google/android/gms/games/internal/GamesClientImpl$GameMuteStatusLoadedBinderCallback;
    localGameMuteStatusLoadedBinderCallback.<init>(paramzzb);
    localIGamesService.zzi(localGameMuteStatusLoadedBinderCallback, paramString);
  }
  
  public Bundle zzoi()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzoi();
      if (localObject1 != null)
      {
        Object localObject3 = GamesClientImpl.class;
        localObject3 = ((Class)localObject3).getClassLoader();
        ((Bundle)localObject1).setClassLoader((ClassLoader)localObject3);
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Bundle)localObject1;
  }
  
  public void zzp(String paramString, int paramInt)
  {
    this.zzaDZ.zzp(paramString, paramInt);
  }
  
  public void zzq(String paramString, int paramInt)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      ((IGamesService)localObject).zzq(paramString, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzr(String paramString, int paramInt)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      ((IGamesService)localObject).zzr(paramString, paramInt);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public Intent zzwA()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwA();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zzwB()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwB();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zzwC()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwC();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public void zzwD()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzG(l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzwE()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzH(l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzwF()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzJ(l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public void zzwG()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      long l = this.zzaEg;
      ((IGamesService)localObject).zzI(l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public Intent zzwH()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwH();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public Intent zzwI()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwI();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public int zzwJ()
  {
    i = 4368;
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      j = ((IGamesService)localObject).zzwJ();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int j = i;
      }
    }
    return j;
  }
  
  public String zzwK()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwK();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  public int zzwL()
  {
    i = -1;
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      j = ((IGamesService)localObject).zzwL();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int j = i;
      }
    }
    return j;
  }
  
  public Intent zzwM()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwM();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
  
  public int zzwN()
  {
    i = -1;
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      j = ((IGamesService)localObject).zzwN();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int j = i;
      }
    }
    return j;
  }
  
  public int zzwO()
  {
    i = -1;
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      j = ((IGamesService)localObject).zzwO();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int j = i;
      }
    }
    return j;
  }
  
  public int zzwP()
  {
    i = -1;
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      j = ((IGamesService)localObject).zzwP();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int j = i;
      }
    }
    return j;
  }
  
  public int zzwQ()
  {
    i = -1;
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      j = ((IGamesService)localObject).zzwQ();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
        int j = i;
      }
    }
    return j;
  }
  
  public void zzwR()
  {
    boolean bool = isConnected();
    if (bool) {}
    try
    {
      Object localObject = zzqJ();
      localObject = (IGamesService)localObject;
      ((IGamesService)localObject).zzwR();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        zzb(localRemoteException);
      }
    }
  }
  
  public String zzww()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzww();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (String)localObject1;
  }
  
  /* Error */
  public com.google.android.gms.games.Player zzwx()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1043	com/google/android/gms/games/internal/GamesClientImpl:zzqI	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 120	com/google/android/gms/games/internal/GamesClientImpl:zzaEb	Lcom/google/android/gms/games/PlayerEntity;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +69 -> 81
    //   15: new 1045	com/google/android/gms/games/PlayerBuffer
    //   18: astore_2
    //   19: aload_0
    //   20: invokevirtual 130	com/google/android/gms/games/internal/GamesClientImpl:zzqJ	()Landroid/os/IInterface;
    //   23: astore_1
    //   24: aload_1
    //   25: checkcast 132	com/google/android/gms/games/internal/IGamesService
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 1049 1 0
    //   35: astore_1
    //   36: aload_2
    //   37: aload_1
    //   38: invokespecial 1050	com/google/android/gms/games/PlayerBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   41: aload_2
    //   42: invokevirtual 1051	com/google/android/gms/games/PlayerBuffer:getCount	()I
    //   45: istore_3
    //   46: iload_3
    //   47: ifle +30 -> 77
    //   50: iconst_0
    //   51: istore_3
    //   52: aconst_null
    //   53: astore_1
    //   54: aload_2
    //   55: iconst_0
    //   56: invokevirtual 1054	com/google/android/gms/games/PlayerBuffer:get	(I)Lcom/google/android/gms/games/Player;
    //   59: astore_1
    //   60: aload_1
    //   61: invokeinterface 1057 1 0
    //   66: astore_1
    //   67: aload_1
    //   68: checkcast 231	com/google/android/gms/games/PlayerEntity
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: putfield 120	com/google/android/gms/games/internal/GamesClientImpl:zzaEb	Lcom/google/android/gms/games/PlayerEntity;
    //   77: aload_2
    //   78: invokevirtual 1058	com/google/android/gms/games/PlayerBuffer:release	()V
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_0
    //   84: getfield 120	com/google/android/gms/games/internal/GamesClientImpl:zzaEb	Lcom/google/android/gms/games/PlayerEntity;
    //   87: areturn
    //   88: astore_1
    //   89: aload_2
    //   90: invokevirtual 1058	com/google/android/gms/games/PlayerBuffer:release	()V
    //   93: aload_1
    //   94: athrow
    //   95: astore_1
    //   96: aload_0
    //   97: aload_1
    //   98: invokespecial 109	com/google/android/gms/games/internal/GamesClientImpl:zzb	(Landroid/os/RemoteException;)V
    //   101: goto -20 -> 81
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	GamesClientImpl
    //   10	64	1	localObject1	Object
    //   88	6	1	localObject2	Object
    //   95	3	1	localRemoteException	RemoteException
    //   104	4	1	localObject3	Object
    //   18	72	2	localPlayerBuffer	com.google.android.gms.games.PlayerBuffer
    //   45	7	3	i	int
    // Exception table:
    //   from	to	target	type
    //   41	45	88	finally
    //   55	59	88	finally
    //   60	66	88	finally
    //   67	71	88	finally
    //   73	77	88	finally
    //   15	18	95	android/os/RemoteException
    //   19	23	95	android/os/RemoteException
    //   24	28	95	android/os/RemoteException
    //   29	35	95	android/os/RemoteException
    //   37	41	95	android/os/RemoteException
    //   77	81	95	android/os/RemoteException
    //   89	93	95	android/os/RemoteException
    //   93	95	95	android/os/RemoteException
    //   6	10	104	finally
    //   15	18	104	finally
    //   19	23	104	finally
    //   24	28	104	finally
    //   29	35	104	finally
    //   37	41	104	finally
    //   77	81	104	finally
    //   81	83	104	finally
    //   89	93	104	finally
    //   93	95	104	finally
    //   97	101	104	finally
    //   105	107	104	finally
  }
  
  /* Error */
  public com.google.android.gms.games.Game zzwy()
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 1043	com/google/android/gms/games/internal/GamesClientImpl:zzqI	()V
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield 122	com/google/android/gms/games/internal/GamesClientImpl:zzaEc	Lcom/google/android/gms/games/GameEntity;
    //   10: astore_1
    //   11: aload_1
    //   12: ifnonnull +69 -> 81
    //   15: new 1060	com/google/android/gms/games/GameBuffer
    //   18: astore_2
    //   19: aload_0
    //   20: invokevirtual 130	com/google/android/gms/games/internal/GamesClientImpl:zzqJ	()Landroid/os/IInterface;
    //   23: astore_1
    //   24: aload_1
    //   25: checkcast 132	com/google/android/gms/games/internal/IGamesService
    //   28: astore_1
    //   29: aload_1
    //   30: invokeinterface 1063 1 0
    //   35: astore_1
    //   36: aload_2
    //   37: aload_1
    //   38: invokespecial 1064	com/google/android/gms/games/GameBuffer:<init>	(Lcom/google/android/gms/common/data/DataHolder;)V
    //   41: aload_2
    //   42: invokevirtual 1065	com/google/android/gms/games/GameBuffer:getCount	()I
    //   45: istore_3
    //   46: iload_3
    //   47: ifle +30 -> 77
    //   50: iconst_0
    //   51: istore_3
    //   52: aconst_null
    //   53: astore_1
    //   54: aload_2
    //   55: iconst_0
    //   56: invokevirtual 1068	com/google/android/gms/games/GameBuffer:get	(I)Lcom/google/android/gms/games/Game;
    //   59: astore_1
    //   60: aload_1
    //   61: invokeinterface 1071 1 0
    //   66: astore_1
    //   67: aload_1
    //   68: checkcast 235	com/google/android/gms/games/GameEntity
    //   71: astore_1
    //   72: aload_0
    //   73: aload_1
    //   74: putfield 122	com/google/android/gms/games/internal/GamesClientImpl:zzaEc	Lcom/google/android/gms/games/GameEntity;
    //   77: aload_2
    //   78: invokevirtual 1072	com/google/android/gms/games/GameBuffer:release	()V
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_0
    //   84: getfield 122	com/google/android/gms/games/internal/GamesClientImpl:zzaEc	Lcom/google/android/gms/games/GameEntity;
    //   87: areturn
    //   88: astore_1
    //   89: aload_2
    //   90: invokevirtual 1072	com/google/android/gms/games/GameBuffer:release	()V
    //   93: aload_1
    //   94: athrow
    //   95: astore_1
    //   96: aload_0
    //   97: aload_1
    //   98: invokespecial 109	com/google/android/gms/games/internal/GamesClientImpl:zzb	(Landroid/os/RemoteException;)V
    //   101: goto -20 -> 81
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	GamesClientImpl
    //   10	64	1	localObject1	Object
    //   88	6	1	localObject2	Object
    //   95	3	1	localRemoteException	RemoteException
    //   104	4	1	localObject3	Object
    //   18	72	2	localGameBuffer	com.google.android.gms.games.GameBuffer
    //   45	7	3	i	int
    // Exception table:
    //   from	to	target	type
    //   41	45	88	finally
    //   55	59	88	finally
    //   60	66	88	finally
    //   67	71	88	finally
    //   73	77	88	finally
    //   15	18	95	android/os/RemoteException
    //   19	23	95	android/os/RemoteException
    //   24	28	95	android/os/RemoteException
    //   29	35	95	android/os/RemoteException
    //   37	41	95	android/os/RemoteException
    //   77	81	95	android/os/RemoteException
    //   89	93	95	android/os/RemoteException
    //   93	95	95	android/os/RemoteException
    //   6	10	104	finally
    //   15	18	104	finally
    //   19	23	104	finally
    //   24	28	104	finally
    //   29	35	104	finally
    //   37	41	104	finally
    //   77	81	104	finally
    //   81	83	104	finally
    //   89	93	104	finally
    //   93	95	104	finally
    //   97	101	104	finally
    //   105	107	104	finally
  }
  
  public Intent zzwz()
  {
    try
    {
      localObject1 = zzqJ();
      localObject1 = (IGamesService)localObject1;
      localObject1 = ((IGamesService)localObject1).zzwz();
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1;
        zzb(localRemoteException);
        Object localObject2 = null;
      }
    }
    return (Intent)localObject1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */