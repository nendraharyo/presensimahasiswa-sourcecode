package com.google.android.gms.internal;

import android.hardware.display.VirtualDisplay;
import android.view.Display;
import com.google.android.gms.cast.CastRemoteDisplayApi;
import com.google.android.gms.cast.internal.zzl;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.internal.zza.zza;

public class zzlq
  implements CastRemoteDisplayApi
{
  private static final zzl zzaaf;
  private Api.zzc zzaeE;
  private VirtualDisplay zzaeF;
  private final zzlu zzaeG;
  
  static
  {
    zzl localzzl = new com/google/android/gms/cast/internal/zzl;
    localzzl.<init>("CastRemoteDisplayApiImpl");
    zzaaf = localzzl;
  }
  
  public zzlq(Api.zzc paramzzc)
  {
    zzlq.1 local1 = new com/google/android/gms/internal/zzlq$1;
    local1.<init>(this);
    this.zzaeG = local1;
    this.zzaeE = paramzzc;
  }
  
  private void zzoB()
  {
    Object localObject1 = this.zzaeF;
    if (localObject1 != null)
    {
      localObject1 = this.zzaeF.getDisplay();
      if (localObject1 != null)
      {
        localObject1 = zzaaf;
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localObject2 = ((StringBuilder)localObject2).append("releasing virtual display: ");
        int i = this.zzaeF.getDisplay().getDisplayId();
        localObject2 = i;
        i = 0;
        Object[] arrayOfObject = new Object[0];
        ((zzl)localObject1).zzb((String)localObject2, arrayOfObject);
      }
      this.zzaeF.release();
      localObject1 = null;
      this.zzaeF = null;
    }
  }
  
  public PendingResult startRemoteDisplay(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    Object localObject = zzaaf;
    Object[] arrayOfObject = new Object[0];
    ((zzl)localObject).zzb("startRemoteDisplay", arrayOfObject);
    localObject = new com/google/android/gms/internal/zzlq$2;
    ((zzlq.2)localObject).<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
  
  public PendingResult stopRemoteDisplay(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = zzaaf;
    Object[] arrayOfObject = new Object[0];
    ((zzl)localObject).zzb("stopRemoteDisplay", arrayOfObject);
    localObject = new com/google/android/gms/internal/zzlq$3;
    ((zzlq.3)localObject).<init>(this, paramGoogleApiClient);
    return paramGoogleApiClient.zzb((zza.zza)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzlq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */