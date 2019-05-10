package com.google.android.gms.games.internal.api;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl
  implements Quests
{
  public PendingResult accept(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    QuestsImpl.1 local1 = new com/google/android/gms/games/internal/api/QuestsImpl$1;
    local1.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb(local1);
  }
  
  public PendingResult claim(GoogleApiClient paramGoogleApiClient, String paramString1, String paramString2)
  {
    QuestsImpl.2 local2 = new com/google/android/gms/games/internal/api/QuestsImpl$2;
    local2.<init>(this, paramGoogleApiClient, paramString1, paramString2);
    return paramGoogleApiClient.zzb(local2);
  }
  
  public Intent getQuestIntent(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    return Games.zzh(paramGoogleApiClient).zzdI(paramString);
  }
  
  public Intent getQuestsIntent(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt)
  {
    return Games.zzh(paramGoogleApiClient).zzb(paramArrayOfInt);
  }
  
  public PendingResult load(GoogleApiClient paramGoogleApiClient, int[] paramArrayOfInt, int paramInt, boolean paramBoolean)
  {
    QuestsImpl.3 local3 = new com/google/android/gms/games/internal/api/QuestsImpl$3;
    local3.<init>(this, paramGoogleApiClient, paramArrayOfInt, paramInt, paramBoolean);
    return paramGoogleApiClient.zza(local3);
  }
  
  public PendingResult loadByIds(GoogleApiClient paramGoogleApiClient, boolean paramBoolean, String... paramVarArgs)
  {
    QuestsImpl.4 local4 = new com/google/android/gms/games/internal/api/QuestsImpl$4;
    local4.<init>(this, paramGoogleApiClient, paramBoolean, paramVarArgs);
    return paramGoogleApiClient.zza(local4);
  }
  
  public void registerQuestUpdateListener(GoogleApiClient paramGoogleApiClient, QuestUpdateListener paramQuestUpdateListener)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null)
    {
      zzq localzzq = paramGoogleApiClient.zzr(paramQuestUpdateListener);
      localGamesClientImpl.zzc(localzzq);
    }
  }
  
  public void showStateChangedPopup(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzdJ(paramString);
    }
  }
  
  public void unregisterQuestUpdateListener(GoogleApiClient paramGoogleApiClient)
  {
    GamesClientImpl localGamesClientImpl = Games.zzb(paramGoogleApiClient, false);
    if (localGamesClientImpl != null) {
      localGamesClientImpl.zzwF();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\QuestsImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */