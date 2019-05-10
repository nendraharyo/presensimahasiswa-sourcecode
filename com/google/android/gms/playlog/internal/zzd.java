package com.google.android.gms.playlog.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.internal.zzqu.zza;

public class zzd
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  private final zzqu.zza zzbdJ;
  private boolean zzbdK;
  private zzf zzbdy;
  
  public zzd(zzqu.zza paramzza)
  {
    this.zzbdJ = paramzza;
    this.zzbdy = null;
    this.zzbdK = true;
  }
  
  public void onConnected(Bundle paramBundle)
  {
    Object localObject = this.zzbdy;
    ((zzf)localObject).zzau(false);
    boolean bool = this.zzbdK;
    if (bool)
    {
      localObject = this.zzbdJ;
      if (localObject != null)
      {
        localObject = this.zzbdJ;
        ((zzqu.zza)localObject).zzES();
      }
    }
    this.zzbdK = false;
  }
  
  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    Object localObject = this.zzbdy;
    boolean bool1 = true;
    ((zzf)localObject).zzau(bool1);
    boolean bool2 = this.zzbdK;
    if (bool2)
    {
      localObject = this.zzbdJ;
      if (localObject != null)
      {
        bool2 = paramConnectionResult.hasResolution();
        if (!bool2) {
          break label68;
        }
        localObject = this.zzbdJ;
        PendingIntent localPendingIntent = paramConnectionResult.getResolution();
        ((zzqu.zza)localObject).zzc(localPendingIntent);
      }
    }
    for (;;)
    {
      this.zzbdK = false;
      return;
      label68:
      localObject = this.zzbdJ;
      ((zzqu.zza)localObject).zzET();
    }
  }
  
  public void onConnectionSuspended(int paramInt)
  {
    this.zzbdy.zzau(true);
  }
  
  public void zza(zzf paramzzf)
  {
    this.zzbdy = paramzzf;
  }
  
  public void zzat(boolean paramBoolean)
  {
    this.zzbdK = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\playlog\internal\zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */