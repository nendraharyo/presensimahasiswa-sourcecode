package com.google.android.gms.internal;

import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import java.io.File;
import java.util.Set;
import java.util.concurrent.Callable;

public class zzis$zzb
  extends zzis.zza
{
  public boolean zza(DownloadManager.Request paramRequest)
  {
    int i = 1;
    paramRequest.allowScanningByMediaScanner();
    paramRequest.setNotificationVisibility(i);
    return i;
  }
  
  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    boolean bool = true;
    super.zza(paramContext, paramWebSettings);
    Object localObject = new com/google/android/gms/internal/zzis$zzb$1;
    ((zzis.zzb.1)localObject).<init>(this, paramContext);
    localObject = (File)zzjb.zzb((Callable)localObject);
    if (localObject != null)
    {
      localObject = paramContext.getCacheDir().getAbsolutePath();
      paramWebSettings.setAppCachePath((String)localObject);
      long l = 0L;
      paramWebSettings.setAppCacheMaxSize(l);
      paramWebSettings.setAppCacheEnabled(bool);
    }
    localObject = paramContext.getDatabasePath("com.google.android.gms.ads.db").getAbsolutePath();
    paramWebSettings.setDatabasePath((String)localObject);
    paramWebSettings.setDatabaseEnabled(bool);
    paramWebSettings.setDomStorageEnabled(bool);
    paramWebSettings.setDisplayZoomControls(false);
    paramWebSettings.setBuiltInZoomControls(bool);
    paramWebSettings.setSupportZoom(bool);
    paramWebSettings.setAllowContentAccess(false);
    return bool;
  }
  
  public boolean zza(Window paramWindow)
  {
    int i = 16777216;
    paramWindow.setFlags(i, i);
    return true;
  }
  
  public zzjq zzb(zzjp paramzzjp, boolean paramBoolean)
  {
    zzjw localzzjw = new com/google/android/gms/internal/zzjw;
    localzzjw.<init>(paramzzjp, paramBoolean);
    return localzzjw;
  }
  
  public Set zzf(Uri paramUri)
  {
    return paramUri.getQueryParameterNames();
  }
  
  public WebChromeClient zzk(zzjp paramzzjp)
  {
    zzjv localzzjv = new com/google/android/gms/internal/zzjv;
    localzzjv.<init>(paramzzjp);
    return localzzjv;
  }
  
  public boolean zzm(View paramView)
  {
    paramView.setLayerType(0, null);
    return true;
  }
  
  public boolean zzn(View paramView)
  {
    int i = 1;
    paramView.setLayerType(i, null);
    return i;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzis$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */