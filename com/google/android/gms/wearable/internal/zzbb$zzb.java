package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.Node;
import com.google.android.gms.wearable.NodeApi.GetLocalNodeResult;

public class zzbb$zzb
  implements NodeApi.GetLocalNodeResult
{
  private final Status zzUX;
  private final Node zzbsX;
  
  public zzbb$zzb(Status paramStatus, Node paramNode)
  {
    this.zzUX = paramStatus;
    this.zzbsX = paramNode;
  }
  
  public Node getNode()
  {
    return this.zzbsX;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzbb$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */