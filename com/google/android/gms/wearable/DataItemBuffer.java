package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.zzf;
import com.google.android.gms.wearable.internal.zzaf;

public class DataItemBuffer
  extends zzf
  implements Result
{
  private final Status zzUX;
  
  public DataItemBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
    Status localStatus = new com/google/android/gms/common/api/Status;
    int i = paramDataHolder.getStatusCode();
    localStatus.<init>(i);
    this.zzUX = localStatus;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  protected String zzqg()
  {
    return "path";
  }
  
  protected DataItem zzx(int paramInt1, int paramInt2)
  {
    zzaf localzzaf = new com/google/android/gms/wearable/internal/zzaf;
    DataHolder localDataHolder = this.zzahi;
    localzzaf.<init>(localDataHolder, paramInt1, paramInt2);
    return localzzaf;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\DataItemBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */