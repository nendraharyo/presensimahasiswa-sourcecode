package com.google.android.gms.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.panorama.PanoramaApi.PanoramaResult;

class zzqs
  implements PanoramaApi.PanoramaResult
{
  private final Status zzUX;
  private final Intent zzbdv;
  
  public zzqs(Status paramStatus, Intent paramIntent)
  {
    Status localStatus = (Status)zzx.zzz(paramStatus);
    this.zzUX = localStatus;
    this.zzbdv = paramIntent;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public Intent getViewerIntent()
  {
    return this.zzbdv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqs.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */