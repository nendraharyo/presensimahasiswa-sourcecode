package com.google.android.gms.games.request;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public abstract interface Requests$LoadRequestsResult
  extends Releasable, Result
{
  public abstract GameRequestBuffer getRequests(int paramInt);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\Requests$LoadRequestsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */