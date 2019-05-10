package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetAllCapabilitiesResult;
import java.util.Map;

public class zzj$zzd
  implements CapabilityApi.GetAllCapabilitiesResult
{
  private final Status zzUX;
  private final Map zzbrT;
  
  public zzj$zzd(Status paramStatus, Map paramMap)
  {
    this.zzUX = paramStatus;
    this.zzbrT = paramMap;
  }
  
  public Map getAllCapabilities()
  {
    return this.zzbrT;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */