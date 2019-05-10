package com.google.android.gms.drive.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzh;

class zzy$1
  extends zzy.zzd
{
  zzy$1(zzy paramzzy, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, int paramInt1, int paramInt2, zzh paramzzh)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    Object localObject1 = this.zzarm.zzsL();
    Object localObject2 = paramzzu.getContext();
    ((MetadataBundle)localObject1).setContext((Context)localObject2);
    localObject1 = new com/google/android/gms/drive/internal/CreateFileRequest;
    localObject2 = this.zzarq.getDriveId();
    Object localObject3 = this.zzarm.zzsL();
    int i = this.zzarn;
    int j = this.zzaro;
    zzh localzzh = this.zzarp;
    ((CreateFileRequest)localObject1).<init>((DriveId)localObject2, (MetadataBundle)localObject3, i, j, localzzh);
    localObject2 = paramzzu.zzte();
    localObject3 = new com/google/android/gms/drive/internal/zzy$zza;
    ((zzy.zza)localObject3).<init>(this);
    ((zzam)localObject2).zza((CreateFileRequest)localObject1, (zzan)localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */