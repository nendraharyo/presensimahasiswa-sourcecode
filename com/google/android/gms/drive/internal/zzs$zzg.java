package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.DriveApi.MetadataBufferResult;
import com.google.android.gms.drive.MetadataBuffer;

class zzs$zzg
  implements DriveApi.MetadataBufferResult
{
  private final Status zzUX;
  private final MetadataBuffer zzaqI;
  private final boolean zzaqJ;
  
  public zzs$zzg(Status paramStatus, MetadataBuffer paramMetadataBuffer, boolean paramBoolean)
  {
    this.zzUX = paramStatus;
    this.zzaqI = paramMetadataBuffer;
    this.zzaqJ = paramBoolean;
  }
  
  public MetadataBuffer getMetadataBuffer()
  {
    return this.zzaqI;
  }
  
  public Status getStatus()
  {
    return this.zzUX;
  }
  
  public void release()
  {
    MetadataBuffer localMetadataBuffer = this.zzaqI;
    if (localMetadataBuffer != null)
    {
      localMetadataBuffer = this.zzaqI;
      localMetadataBuffer.release();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */