package com.google.android.gms.location.places.personalized;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.zzx;

public final class zzd
  extends com.google.android.gms.common.data.zzd
  implements Result
{
  private final Status zzUX;
  
  public zzd(DataHolder paramDataHolder)
  {
    this(paramDataHolder, localStatus);
  }
  
  private zzd(DataHolder paramDataHolder, Status paramStatus)
  {
    super(paramDataHolder, localzze);
    int i;
    if (paramDataHolder != null)
    {
      i = paramDataHolder.getStatusCode();
      int k = paramStatus.getStatusCode();
      if (i != k) {}
    }
    else
    {
      i = 1;
    }
    for (;;)
    {
      zzx.zzac(i);
      this.zzUX = paramStatus;
      return;
      int j = 0;
      localzze = null;
    }
  }
  
  public static zzd zzaZ(Status paramStatus)
  {
    zzd localzzd = new com/google/android/gms/location/places/personalized/zzd;
    localzzd.<init>(null, paramStatus);
    return localzzd;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\location\places\personalized\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */