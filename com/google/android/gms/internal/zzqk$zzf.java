package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult;

final class zzqk$zzf
  implements Connections.StartAdvertisingResult
{
  private final Status zzUX;
  private final String zzbbm;
  
  zzqk$zzf(Status paramStatus, String paramString)
  {
    this.zzUX = paramStatus;
    this.zzbbm = paramString;
  }
  
  public String getLocalEndpointName()
  {
    return this.zzbbm;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */