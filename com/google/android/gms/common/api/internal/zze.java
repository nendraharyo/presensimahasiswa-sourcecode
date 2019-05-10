package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.data.DataHolder;

public abstract class zze
  implements zzq.zzb
{
  private final DataHolder zzahi;
  
  protected zze(DataHolder paramDataHolder)
  {
    this.zzahi = paramDataHolder;
  }
  
  protected abstract void zza(Object paramObject, DataHolder paramDataHolder);
  
  public void zzpr()
  {
    DataHolder localDataHolder = this.zzahi;
    if (localDataHolder != null)
    {
      localDataHolder = this.zzahi;
      localDataHolder.close();
    }
  }
  
  public final void zzt(Object paramObject)
  {
    DataHolder localDataHolder = this.zzahi;
    zza(paramObject, localDataHolder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */