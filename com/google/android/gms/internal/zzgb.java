package com.google.android.gms.internal;

import android.content.Context;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class zzgb
  implements zzfz
{
  private final Context mContext;
  final Set zzFr;
  
  public zzgb(Context paramContext)
  {
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    localObject = Collections.synchronizedSet((Set)localObject);
    this.zzFr = ((Set)localObject);
    this.mContext = paramContext;
  }
  
  public void zza(String paramString1, String paramString2, String paramString3)
  {
    zzin.zzaI("Fetching assets for the given html");
    Handler localHandler = zzir.zzMc;
    zzgb.1 local1 = new com/google/android/gms/internal/zzgb$1;
    local1.<init>(this, paramString2, paramString3);
    localHandler.post(local1);
  }
  
  public WebView zzfR()
  {
    WebView localWebView = new android/webkit/WebView;
    Context localContext = this.mContext;
    localWebView.<init>(localContext);
    localWebView.getSettings().setJavaScriptEnabled(true);
    return localWebView;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */