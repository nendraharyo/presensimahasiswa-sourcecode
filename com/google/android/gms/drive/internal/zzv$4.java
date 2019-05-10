package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;

class zzv$4
  extends zzt.zza
{
  zzv$4(zzv paramzzv, GoogleApiClient paramGoogleApiClient)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    CloseContentsRequest localCloseContentsRequest = new com/google/android/gms/drive/internal/CloseContentsRequest;
    int i = zzv.zza(this.zzard).getRequestId();
    localCloseContentsRequest.<init>(i, false);
    zzbu localzzbu = new com/google/android/gms/drive/internal/zzbu;
    localzzbu.<init>(this);
    localzzam.zza(localCloseContentsRequest, localzzbu);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzv$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */