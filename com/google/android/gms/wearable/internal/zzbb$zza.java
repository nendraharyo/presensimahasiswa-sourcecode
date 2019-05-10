package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.NodeApi.GetConnectedNodesResult;
import java.util.List;

public class zzbb$zza
  implements NodeApi.GetConnectedNodesResult
{
  private final Status zzUX;
  private final List zzbsW;
  
  public zzbb$zza(Status paramStatus, List paramList)
  {
    this.zzUX = paramStatus;
    this.zzbsW = paramList;
  }
  
  public List getNodes()
  {
    return this.zzbsW;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbb$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */