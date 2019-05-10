package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzs$3
  extends zzs.zzf
{
  zzs$3(zzs paramzzs, GoogleApiClient paramGoogleApiClient, String paramString)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    GetMetadataRequest localGetMetadataRequest = new com/google/android/gms/drive/internal/GetMetadataRequest;
    Object localObject = DriveId.zzcW(this.zzaqF);
    localGetMetadataRequest.<init>((DriveId)localObject, false);
    localObject = new com/google/android/gms/drive/internal/zzs$zzd;
    ((zzs.zzd)localObject).<init>(this);
    localzzam.zza(localGetMetadataRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */