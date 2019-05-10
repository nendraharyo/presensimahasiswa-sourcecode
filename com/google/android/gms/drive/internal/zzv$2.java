package com.google.android.gms.drive.internal;

import android.content.Context;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.DriveId;
import com.google.android.gms.drive.MetadataChangeSet;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import com.google.android.gms.drive.zzi;

class zzv$2
  extends zzt.zza
{
  zzv$2(zzv paramzzv, GoogleApiClient paramGoogleApiClient, MetadataChangeSet paramMetadataChangeSet, zzi paramzzi)
  {
    super(paramGoogleApiClient);
  }
  
  protected void zza(zzu paramzzu)
  {
    Object localObject1 = this.zzare.zzsL();
    Object localObject2 = paramzzu.getContext();
    ((MetadataBundle)localObject1).setContext((Context)localObject2);
    zzam localzzam = paramzzu.zzte();
    localObject1 = new com/google/android/gms/drive/internal/CloseContentsAndUpdateMetadataRequest;
    localObject2 = zzv.zza(this.zzard).getDriveId();
    MetadataBundle localMetadataBundle = this.zzare.zzsL();
    int i = zzv.zza(this.zzard).getRequestId();
    boolean bool = zzv.zza(this.zzard).zzsv();
    zzi localzzi = this.zzarf;
    ((CloseContentsAndUpdateMetadataRequest)localObject1).<init>((DriveId)localObject2, localMetadataBundle, i, bool, localzzi);
    localObject2 = new com/google/android/gms/drive/internal/zzbu;
    ((zzbu)localObject2).<init>(this);
    localzzam.zza((CloseContentsAndUpdateMetadataRequest)localObject1, (zzan)localObject2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\drive\internal\zzv$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */