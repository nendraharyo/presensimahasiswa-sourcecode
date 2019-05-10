package com.google.android.gms.cast.internal;

import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.Cast.ApplicationConnectionResult;
import com.google.android.gms.common.api.Status;

final class zze$zza
  implements Cast.ApplicationConnectionResult
{
  private final String zzLq;
  private final Status zzUX;
  private final ApplicationMetadata zzadR;
  private final String zzadS;
  private final boolean zzadT;
  
  public zze$zza(Status paramStatus)
  {
    this(paramStatus, null, null, null, false);
  }
  
  public zze$zza(Status paramStatus, ApplicationMetadata paramApplicationMetadata, String paramString1, String paramString2, boolean paramBoolean)
  {
    this.zzUX = paramStatus;
    this.zzadR = paramApplicationMetadata;
    this.zzadS = paramString1;
    this.zzLq = paramString2;
    this.zzadT = paramBoolean;
  }
  
  public ApplicationMetadata getApplicationMetadata()
  {
    return this.zzadR;
  }
  
  public String getApplicationStatus()
  {
    return this.zzadS;
  }
  
  public String getSessionId()
  {
    return this.zzLq;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public boolean getWasLaunched()
  {
    return this.zzadT;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zze$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */