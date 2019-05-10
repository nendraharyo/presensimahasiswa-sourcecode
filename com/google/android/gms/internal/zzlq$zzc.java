package com.google.android.gms.internal;

import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplay.CastRemoteDisplaySessionResult;
import com.google.android.gms.common.api.Status;

final class zzlq$zzc
  implements CastRemoteDisplay.CastRemoteDisplaySessionResult
{
  private final Status zzUX;
  private final Display zzaar;
  
  public zzlq$zzc(Display paramDisplay)
  {
    Status localStatus = Status.zzagC;
    this.zzUX = localStatus;
    this.zzaar = paramDisplay;
  }
  
  public zzlq$zzc(Status paramStatus)
  {
    this.zzUX = paramStatus;
    this.zzaar = null;
  }
  
  public Display getPresentationDisplay()
  {
    return this.zzaar;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlq$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */