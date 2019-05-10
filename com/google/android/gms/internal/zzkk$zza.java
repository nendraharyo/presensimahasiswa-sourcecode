package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.appdatasearch.UsageInfo;
import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndexApi.ActionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

final class zzkk$zza
  implements AppIndexApi.ActionResult
{
  private zzkk zzUD;
  private PendingResult zzUE;
  private Action zzUF;
  
  zzkk$zza(zzkk paramzzkk, PendingResult paramPendingResult, Action paramAction)
  {
    this.zzUD = paramzzkk;
    this.zzUE = paramPendingResult;
    this.zzUF = paramAction;
  }
  
  public PendingResult end(GoogleApiClient paramGoogleApiClient)
  {
    Object localObject = paramGoogleApiClient.getContext().getPackageName();
    long l = System.currentTimeMillis();
    localObject = zzkj.zza(this.zzUF, l, (String)localObject, 2);
    zzkk localzzkk = this.zzUD;
    UsageInfo[] arrayOfUsageInfo = new UsageInfo[1];
    arrayOfUsageInfo[0] = localObject;
    return localzzkk.zza(paramGoogleApiClient, arrayOfUsageInfo);
  }
  
  public PendingResult getPendingResult()
  {
    return this.zzUE;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkk$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */