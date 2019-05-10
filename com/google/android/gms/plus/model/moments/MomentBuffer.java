package com.google.android.gms.plus.model.moments;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.plus.internal.model.moments.zzc;

public final class MomentBuffer
  extends AbstractDataBuffer
{
  public MomentBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public Moment get(int paramInt)
  {
    zzc localzzc = new com/google/android/gms/plus/internal/model/moments/zzc;
    DataHolder localDataHolder = this.zzahi;
    localzzc.<init>(localDataHolder, paramInt);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\plus\model\moments\MomentBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */