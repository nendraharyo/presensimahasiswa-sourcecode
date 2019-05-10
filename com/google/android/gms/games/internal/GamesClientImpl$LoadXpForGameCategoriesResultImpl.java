package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Players.LoadXpForGameCategoriesResult;
import java.util.ArrayList;
import java.util.List;

final class GamesClientImpl$LoadXpForGameCategoriesResultImpl
  implements Players.LoadXpForGameCategoriesResult
{
  private final Status zzUX;
  private final List zzaEO;
  private final Bundle zzaEP;
  
  GamesClientImpl$LoadXpForGameCategoriesResultImpl(Status paramStatus, Bundle paramBundle)
  {
    this.zzUX = paramStatus;
    ArrayList localArrayList = paramBundle.getStringArrayList("game_category_list");
    this.zzaEO = localArrayList;
    this.zzaEP = paramBundle;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadXpForGameCategoriesResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */