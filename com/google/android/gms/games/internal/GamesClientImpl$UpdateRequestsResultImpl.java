package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.request.RequestUpdateOutcomes;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import java.util.Set;

final class GamesClientImpl$UpdateRequestsResultImpl
  extends GamesClientImpl.GamesDataHolderResult
  implements Requests.UpdateRequestsResult
{
  private final RequestUpdateOutcomes zzaFB;
  
  GamesClientImpl$UpdateRequestsResultImpl(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    RequestUpdateOutcomes localRequestUpdateOutcomes = RequestUpdateOutcomes.zzab(paramDataHolder);
    this.zzaFB = localRequestUpdateOutcomes;
  }
  
  public Set getRequestIds()
  {
    return this.zzaFB.getRequestIds();
  }
  
  public int getRequestOutcome(String paramString)
  {
    return this.zzaFB.getRequestOutcome(paramString);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$UpdateRequestsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */