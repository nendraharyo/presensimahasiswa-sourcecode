package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.DataApi.DataItemResult;
import com.google.android.gms.wearable.DataItem;

public class zzx$zza
  implements DataApi.DataItemResult
{
  private final Status zzUX;
  private final DataItem zzbsv;
  
  public zzx$zza(Status paramStatus, DataItem paramDataItem)
  {
    this.zzUX = paramStatus;
    this.zzbsv = paramDataItem;
  }
  
  public DataItem getDataItem()
  {
    return this.zzbsv;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzx$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */