package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.request.Requests.UpdateRequestsResult;
import java.util.Set;

class RequestsImpl$UpdateRequestsImpl$1
  implements Requests.UpdateRequestsResult
{
  RequestsImpl$UpdateRequestsImpl$1(RequestsImpl.UpdateRequestsImpl paramUpdateRequestsImpl, Status paramStatus) {}
  
  public Set getRequestIds()
  {
    return null;
  }
  
  public int getRequestOutcome(String paramString)
  {
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = "Unknown request ID " + paramString;
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public Status getStatus()
  {
    return this.zzZR;
  }
  
  public void release() {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\api\RequestsImpl$UpdateRequestsImpl$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */