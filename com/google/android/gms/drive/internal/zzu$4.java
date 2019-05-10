package com.google.android.gms.drive.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;

class zzu$4
  extends zzt.zza
{
  zzu$4(zzu paramzzu, GoogleApiClient paramGoogleApiClient, DriveId paramDriveId, int paramInt)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    zzam localzzam = paramzzu.zzte();
    RemoveEventListenerRequest localRemoveEventListenerRequest = new com/google/android/gms/drive/internal/RemoveEventListenerRequest;
    Object localObject = this.zzaqX;
    int i = this.zzaqY;
    localRemoveEventListenerRequest.<init>((DriveId)localObject, i);
    localObject = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject).<init>(this);
    localzzam.zza(localRemoveEventListenerRequest, null, null, (zzan)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzu$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */