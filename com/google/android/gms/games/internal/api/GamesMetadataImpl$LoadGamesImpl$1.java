package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesMetadata.LoadGamesResult;

class GamesMetadataImpl$LoadGamesImpl$1
  implements GamesMetadata.LoadGamesResult
{
  GamesMetadataImpl$LoadGamesImpl$1(GamesMetadataImpl.LoadGamesImpl paramLoadGamesImpl, Status paramStatus) {}
  
  public GameBuffer getGames()
  {
    GameBuffer localGameBuffer = new com/google/android/gms/games/GameBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(14);
    localGameBuffer.<init>(localDataHolder);
    return localGameBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\GamesMetadataImpl$LoadGamesImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */