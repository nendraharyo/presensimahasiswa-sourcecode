package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import java.util.List;

class zzu$5
  extends zzt.zza
{
  zzu$5(zzu paramzzu, GoogleApiClient paramGoogleApiClient, List paramList)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    CancelPendingActionsRequest localCancelPendingActionsRequest = new com/google/android/gms/drive/internal/CancelPendingActionsRequest;
    Object localObject = this.zzaqZ;
    localCancelPendingActionsRequest.<init>((List)localObject);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localCancelPendingActionsRequest, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzu$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */