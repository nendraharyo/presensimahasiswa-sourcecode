package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.CapabilityApi.GetCapabilityResult;
import com.google.android.gms.wearable.CapabilityInfo;

public class zzj$zze
  implements CapabilityApi.GetCapabilityResult
{
  private final Status zzUX;
  private final CapabilityInfo zzbrU;
  
  public zzj$zze(Status paramStatus, CapabilityInfo paramCapabilityInfo)
  {
    this.zzUX = paramStatus;
    this.zzbrU = paramCapabilityInfo;
  }
  
  public CapabilityInfo getCapability()
  {
    return this.zzbrU;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzj$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */