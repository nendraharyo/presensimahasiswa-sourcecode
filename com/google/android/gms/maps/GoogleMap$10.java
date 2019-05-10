package com.google.android.gms.maps;

import android.graphics.Bitmap;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.maps.internal.zzab.zza;

class GoogleMap$10
  extends zzab.zza
{
  GoogleMap$10(GoogleMap paramGoogleMap, GoogleMap.SnapshotReadyCallback paramSnapshotReadyCallback) {}
  
  public void onSnapshotReady(Bitmap paramBitmap)
  {
    this.zzaRD.onSnapshotReady(paramBitmap);
  }
  
  public void zzr(zzd paramzzd)
  {
    GoogleMap.SnapshotReadyCallback localSnapshotReadyCallback = this.zzaRD;
    Bitmap localBitmap = (Bitmap)zze.zzp(paramzzd);
    localSnapshotReadyCallback.onSnapshotReady(localBitmap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$10.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */