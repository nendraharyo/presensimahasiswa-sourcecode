package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.query.Query;

class zzs$1
  extends zzs.zzh
{
  zzs$1(zzs paramzzs, GoogleApiClient paramGoogleApiClient, Query paramQuery)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    QueryRequest localQueryRequest = new com/google/android/gms/drive/internal/QueryRequest;
    Object localObject = this.zzaqC;
    localQueryRequest.<init>((Query)localObject);
    localObject = new com/google/android/gms/drive/internal/zzs$zzi;
    ((zzs.zzi)localObject).<init>(this);
    localzzam.zza(localQueryRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzs$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */