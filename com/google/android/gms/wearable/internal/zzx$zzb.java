package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DeleteDataItemsResult;

public class zzx$zzb
  implements DataApi.DeleteDataItemsResult
{
  private final Status zzUX;
  private final int zzbsw;
  
  public zzx$zzb(Status paramStatus, int paramInt)
  {
    this.zzUX = paramStatus;
    this.zzbsw = paramInt;
  }
  
  public int getNumDeleted()
  {
    return this.zzbsw;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */