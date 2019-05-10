package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.request.GameRequestBuffer;
import com.google.android.gms.games.request.Requests.LoadRequestsResult;

class RequestsImpl$LoadRequestsImpl$1
  implements Requests.LoadRequestsResult
{
  RequestsImpl$LoadRequestsImpl$1(RequestsImpl.LoadRequestsImpl paramLoadRequestsImpl, Status paramStatus) {}
  
  public GameRequestBuffer getRequests(int paramInt)
  {
    int i = this.zzZR.getStatusCode();
    GameRequestBuffer localGameRequestBuffer = new com/google/android/gms/games/request/GameRequestBuffer;
    DataHolder localDataHolder = DataHolder.zzbI(i);
    localGameRequestBuffer.<init>(localDataHolder);
    return localGameRequestBuffer;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\RequestsImpl$LoadRequestsImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */