package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;

class zzs$2
  extends zzs.zzc
{
  zzs$2(zzs paramzzs, GoogleApiClient paramGoogleApiClient, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    CreateContentsRequest localCreateContentsRequest = new com/google/android/gms/drive/internal/CreateContentsRequest;
    int i = this.zzaqE;
    localCreateContentsRequest.<init>(i);
    zzs.zza localzza = new com/google/android/gms/drive/internal/zzs$zza;
    localzza.<init>(this);
    localzzam.zza(localCreateContentsRequest, localzza);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */