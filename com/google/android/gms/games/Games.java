package com.google.android.gms.games;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.StatsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.api.VideosImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;

public final class Games
{
  public static final Api API;
  public static final Achievements Achievements;
  public static final String EXTRA_PLAYER_IDS = "players";
  public static final String EXTRA_STATUS = "status";
  public static final Events Events;
  public static final GamesMetadata GamesMetadata;
  public static final Invitations Invitations;
  public static final Leaderboards Leaderboards;
  public static final Notifications Notifications;
  public static final Players Players;
  public static final Quests Quests;
  public static final RealTimeMultiplayer RealTimeMultiplayer;
  public static final Requests Requests;
  public static final Scope SCOPE_GAMES;
  public static final Snapshots Snapshots;
  public static final Stats Stats;
  public static final TurnBasedMultiplayer TurnBasedMultiplayer;
  static final Api.zzc zzUI;
  private static final Api.zza zzUJ;
  public static final Videos zzaCA;
  public static final Acls zzaCB;
  private static final Api.zza zzaCv;
  public static final Scope zzaCw;
  public static final Api zzaCx;
  public static final AppContents zzaCy;
  public static final Multiplayer zzaCz;
  
  static
  {
    Object localObject = new com/google/android/gms/common/api/Api$zzc;
    ((Api.zzc)localObject).<init>();
    zzUI = (Api.zzc)localObject;
    localObject = new com/google/android/gms/games/Games$1;
    ((Games.1)localObject).<init>();
    zzUJ = (Api.zza)localObject;
    localObject = new com/google/android/gms/games/Games$2;
    ((Games.2)localObject).<init>();
    zzaCv = (Api.zza)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("https://www.googleapis.com/auth/games");
    SCOPE_GAMES = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    Api.zza localzza = zzUJ;
    Api.zzc localzzc = zzUI;
    ((Api)localObject).<init>("Games.API", localzza, localzzc);
    API = (Api)localObject;
    localObject = new com/google/android/gms/common/api/Scope;
    ((Scope)localObject).<init>("https://www.googleapis.com/auth/games.firstparty");
    zzaCw = (Scope)localObject;
    localObject = new com/google/android/gms/common/api/Api;
    localzza = zzaCv;
    localzzc = zzUI;
    ((Api)localObject).<init>("Games.API_1P", localzza, localzzc);
    zzaCx = (Api)localObject;
    localObject = new com/google/android/gms/games/internal/api/GamesMetadataImpl;
    ((GamesMetadataImpl)localObject).<init>();
    GamesMetadata = (GamesMetadata)localObject;
    localObject = new com/google/android/gms/games/internal/api/AchievementsImpl;
    ((AchievementsImpl)localObject).<init>();
    Achievements = (Achievements)localObject;
    localObject = new com/google/android/gms/games/internal/api/AppContentsImpl;
    ((AppContentsImpl)localObject).<init>();
    zzaCy = (AppContents)localObject;
    localObject = new com/google/android/gms/games/internal/api/EventsImpl;
    ((EventsImpl)localObject).<init>();
    Events = (Events)localObject;
    localObject = new com/google/android/gms/games/internal/api/LeaderboardsImpl;
    ((LeaderboardsImpl)localObject).<init>();
    Leaderboards = (Leaderboards)localObject;
    localObject = new com/google/android/gms/games/internal/api/InvitationsImpl;
    ((InvitationsImpl)localObject).<init>();
    Invitations = (Invitations)localObject;
    localObject = new com/google/android/gms/games/internal/api/TurnBasedMultiplayerImpl;
    ((TurnBasedMultiplayerImpl)localObject).<init>();
    TurnBasedMultiplayer = (TurnBasedMultiplayer)localObject;
    localObject = new com/google/android/gms/games/internal/api/RealTimeMultiplayerImpl;
    ((RealTimeMultiplayerImpl)localObject).<init>();
    RealTimeMultiplayer = (RealTimeMultiplayer)localObject;
    localObject = new com/google/android/gms/games/internal/api/MultiplayerImpl;
    ((MultiplayerImpl)localObject).<init>();
    zzaCz = (Multiplayer)localObject;
    localObject = new com/google/android/gms/games/internal/api/PlayersImpl;
    ((PlayersImpl)localObject).<init>();
    Players = (Players)localObject;
    localObject = new com/google/android/gms/games/internal/api/NotificationsImpl;
    ((NotificationsImpl)localObject).<init>();
    Notifications = (Notifications)localObject;
    localObject = new com/google/android/gms/games/internal/api/QuestsImpl;
    ((QuestsImpl)localObject).<init>();
    Quests = (Quests)localObject;
    localObject = new com/google/android/gms/games/internal/api/RequestsImpl;
    ((RequestsImpl)localObject).<init>();
    Requests = (Requests)localObject;
    localObject = new com/google/android/gms/games/internal/api/SnapshotsImpl;
    ((SnapshotsImpl)localObject).<init>();
    Snapshots = (Snapshots)localObject;
    localObject = new com/google/android/gms/games/internal/api/StatsImpl;
    ((StatsImpl)localObject).<init>();
    Stats = (Stats)localObject;
    localObject = new com/google/android/gms/games/internal/api/VideosImpl;
    ((VideosImpl)localObject).<init>();
    zzaCA = (Videos)localObject;
    localObject = new com/google/android/gms/games/internal/api/AclsImpl;
    ((AclsImpl)localObject).<init>();
    zzaCB = (Acls)localObject;
  }
  
  public static String getAppId(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzwK();
  }
  
  public static String getCurrentAccountName(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzww();
  }
  
  public static PendingResult getGamesServerAuthCode(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzx.zzh(paramString, "Please provide a valid serverClientId");
    Games.4 local4 = new com/google/android/gms/games/Games$4;
    local4.<init>(paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local4);
  }
  
  public static int getSdkVariant(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzwJ();
  }
  
  public static Intent getSettingsIntent(GoogleApiClient paramGoogleApiClient)
  {
    return zzh(paramGoogleApiClient).zzwI();
  }
  
  public static void setGravityForPopups(GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    GamesClientImpl localGamesClientImpl = zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzgs(paramInt);
    }
  }
  
  public static void setViewForPopups(GoogleApiClient paramGoogleApiClient, View paramView)
  {
    zzx.zzz(paramView);
    GamesClientImpl localGamesClientImpl = zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzo(paramView);
    }
  }
  
  public static PendingResult signOut(GoogleApiClient paramGoogleApiClient)
  {
    Games.5 local5 = new com/google/android/gms/games/Games$5;
    local5.<init>(paramGoogleApiClient);
    return paramGoogleApiClient.zzb(local5);
  }
  
  public static GamesClientImpl zzb(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    if (paramGoogleApiClient != null) {}
    for (boolean bool = true;; bool = false)
    {
      zzx.zzb(bool, "GoogleApiClient parameter is required.");
      zzx.zza(paramGoogleApiClient.isConnected(), "GoogleApiClient must be connected.");
      return zzc(paramGoogleApiClient, paramBoolean);
    }
  }
  
  public static GamesClientImpl zzc(GoogleApiClient paramGoogleApiClient, boolean paramBoolean)
  {
    Object localObject = API;
    boolean bool = paramGoogleApiClient.zza((Api)localObject);
    String str = "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.";
    zzx.zza(bool, str);
    localObject = API;
    bool = paramGoogleApiClient.hasConnectedApi((Api)localObject);
    if ((paramBoolean) && (!bool))
    {
      localObject = new java/lang/IllegalStateException;
      ((IllegalStateException)localObject).<init>("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
      throw ((Throwable)localObject);
    }
    if (bool) {
      localObject = zzUI;
    }
    for (localObject = (GamesClientImpl)paramGoogleApiClient.zza((Api.zzc)localObject);; localObject = null)
    {
      return (GamesClientImpl)localObject;
      bool = false;
    }
  }
  
  public static GamesClientImpl zzh(GoogleApiClient paramGoogleApiClient)
  {
    return zzb(paramGoogleApiClient, true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\Games.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */