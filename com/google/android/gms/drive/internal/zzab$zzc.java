package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveResource.MetadataResult;
import com.google.android.gms.drive.Metadata;

class zzab$zzc
  implements DriveResource.MetadataResult
{
  private final Status zzUX;
  private final Metadata zzarA;
  
  public zzab$zzc(Status paramStatus, Metadata paramMetadata)
  {
    this.zzUX = paramStatus;
    this.zzarA = paramMetadata;
  }
  
  public Metadata getMetadata()
  {
    return this.zzarA;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */