package com.google.android.gms.location.places;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.common.internal.zzw.zza;
import com.google.android.gms.location.places.internal.zzb;

public class AutocompletePredictionBuffer
  extends AbstractDataBuffer
  implements Result
{
  public AutocompletePredictionBuffer(DataHolder paramDataHolder)
  {
    super(paramDataHolder);
  }
  
  public AutocompletePrediction get(int paramInt)
  {
    zzb localzzb = new com/google/android/gms/location/places/internal/zzb;
    DataHolder localDataHolder = this.zzahi;
    localzzb.<init>(localDataHolder, paramInt);
    return localzzb;
  }
  
  public Status getStatus()
  {
    return PlacesStatusCodes.zzhU(this.zzahi.getStatusCode());
  }
  
  public String toString()
  {
    zzw.zza localzza = zzw.zzy(this);
    Status localStatus = getStatus();
    return localzza.zzg("status", localStatus).toString();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\AutocompletePredictionBuffer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */