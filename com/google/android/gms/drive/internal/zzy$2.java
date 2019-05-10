package com.google.android.gms.drive.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;

class zzy$2
  extends zzy.zzf
{
  zzy$2(zzy paramzzy, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    Object localObject1 = this.zzarm.zzsL();
    Object localObject2 = paramzzu.getContext();
    ((MetadataBundle)localObject1).setContext((Context)localObject2);
    localObject1 = paramzzu.zzte();
    localObject2 = new com/google/android/gms/drive/internal/CreateFolderRequest;
    Object localObject3 = this.zzarq.getDriveId();
    MetadataBundle localMetadataBundle = this.zzarm.zzsL();
    ((CreateFolderRequest)localObject2).<init>((DriveId)localObject3, localMetadataBundle);
    localObject3 = new com/google/android/gms/drive/internal/zzy$zzb;
    ((zzy.zzb)localObject3).<init>(this);
    ((zzam)localObject1).zza((CreateFolderRequest)localObject2, (zzan)localObject3);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzy$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */