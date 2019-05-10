package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.Auth.zza;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import java.util.Set;

public final class zzkz
  extends zzj
{
  private final Bundle zzVN;
  
  public zzkz(Context paramContext, Looper paramLooper, zzf paramzzf, Auth.zza paramzza, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, i, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    if (paramzza == null)
    {
      localObject = new android/os/Bundle;
      ((Bundle)localObject).<init>();
    }
    for (;;)
    {
      this.zzVN = ((Bundle)localObject);
      return;
      localObject = paramzza.zzms();
    }
  }
  
  protected zzlb zzay(IBinder paramIBinder)
  {
    return zzlb.zza.zzaA(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.auth.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.auth.api.internal.IAuthService";
  }
  
  public boolean zzmE()
  {
    Object localObject1 = zzqH();
    Object localObject2 = ((zzf)localObject1).getAccountName();
    boolean bool1 = TextUtils.isEmpty((CharSequence)localObject2);
    boolean bool2;
    if (!bool1)
    {
      localObject2 = Auth.PROXY_API;
      localObject1 = ((zzf)localObject1).zzb((Api)localObject2);
      bool2 = ((Set)localObject1).isEmpty();
      if (!bool2) {
        bool2 = true;
      }
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      localObject1 = null;
    }
  }
  
  protected Bundle zzml()
  {
    return this.zzVN;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkz.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */