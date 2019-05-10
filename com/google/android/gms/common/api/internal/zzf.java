package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public abstract class zzf
  implements Releasable, Result
{
  protected final Status zzUX;
  protected final DataHolder zzahi;
  
  protected zzf(DataHolder paramDataHolder, Status paramStatus)
  {
    this.zzUX = paramStatus;
    this.zzahi = paramDataHolder;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    DataHolder localDataHolder = this.zzahi;
    if (localDataHolder != null)
    {
      localDataHolder = this.zzahi;
      localDataHolder.close();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */