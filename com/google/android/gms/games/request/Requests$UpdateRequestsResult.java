package com.google.android.gms.games.request;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.util.Set;

public abstract interface Requests$UpdateRequestsResult
  extends Releasable, Result
{
  public abstract Set getRequestIds();
  
  public abstract int getRequestOutcome(String paramString);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\request\Requests$UpdateRequestsResult.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */