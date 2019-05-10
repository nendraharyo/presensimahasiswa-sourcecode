package com.google.android.gms.fitness.data;

import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.fitness.request.OnDataPointListener;

public class zzl
  extends zzk.zza
{
  private final OnDataPointListener zzaxb;
  
  private zzl(OnDataPointListener paramOnDataPointListener)
  {
    OnDataPointListener localOnDataPointListener = (OnDataPointListener)zzx.zzz(paramOnDataPointListener);
    this.zzaxb = localOnDataPointListener;
  }
  
  public void zzc(DataPoint paramDataPoint)
  {
    this.zzaxb.onDataPoint(paramDataPoint);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\fitness\data\zzl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */