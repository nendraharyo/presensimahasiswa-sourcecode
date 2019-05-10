package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;
import java.util.List;

class zzab$3
  extends zzt.zza
{
  zzab$3(zzab paramzzab, GoogleApiClient paramGoogleApiClient, List paramList)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    SetResourceParentsRequest localSetResourceParentsRequest = new com/google/android/gms/drive/internal/SetResourceParentsRequest;
    Object localObject = this.zzary.zzaoz;
    List localList = this.zzarz;
    localSetResourceParentsRequest.<init>((DriveId)localObject, localList);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localSetResourceParentsRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzab$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */