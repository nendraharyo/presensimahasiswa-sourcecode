package com.google.android.gms.internal;

import com.google.android.gms.auth.api.proxy.ProxyApi.ProxyResult;
import com.google.android.gms.auth.api.proxy.ProxyResponse;
import com.google.android.gms.common.api.Status;

class zzle
  implements ProxyApi.ProxyResult
{
  private Status zzUX;
  private ProxyResponse zzWK;
  
  public zzle(ProxyResponse paramProxyResponse)
  {
    this.zzWK = paramProxyResponse;
    Status localStatus = Status.zzagC;
    this.zzUX = localStatus;
  }
  
  public zzle(Status paramStatus)
  {
    this.zzUX = paramStatus;
  }
  
  public ProxyResponse getResponse()
  {
    return this.zzWK;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */