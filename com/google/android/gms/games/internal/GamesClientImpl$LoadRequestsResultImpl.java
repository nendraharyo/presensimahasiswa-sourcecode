package com.google.android.gms.games.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.RequestType;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;
import java.util.Iterator;
import java.util.Set;

final class GamesClientImpl$LoadRequestsResultImpl
  implements Requests.LoadRequestsResult
{
  private final Status zzUX;
  private final Bundle zzaEL;
  
  GamesClientImpl$LoadRequestsResultImpl(Status paramStatus, Bundle paramBundle)
  {
    this.zzUX = paramStatus;
    this.zzaEL = paramBundle;
  }
  
  public GameRequestBuffer getRequests(int paramInt)
  {
    Object localObject1 = RequestType.zzgw(paramInt);
    Object localObject2 = this.zzaEL;
    boolean bool = ((Bundle)localObject2).containsKey((String)localObject1);
    if (!bool) {}
    for (localObject1 = null;; localObject1 = localObject2)
    {
      return (GameRequestBuffer)localObject1;
      localObject1 = (DataHolder)this.zzaEL.get((String)localObject1);
      localObject2 = new com/google/android/gms/games/request/GameRequestBuffer;
      ((GameRequestBuffer)localObject2).<init>((DataHolder)localObject1);
    }
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    Object localObject = this.zzaEL.keySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      Bundle localBundle = this.zzaEL;
      localObject = (DataHolder)localBundle.getParcelable((String)localObject);
      if (localObject != null) {
        ((DataHolder)localObject).close();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\GamesClientImpl$LoadRequestsResultImpl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */