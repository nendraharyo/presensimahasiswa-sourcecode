package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;

class zzgb$1
  implements Runnable
{
  zzgb$1(zzgb paramzzgb, String paramString1, String paramString2) {}
  
  public void run()
  {
    WebView localWebView = this.zzFu.zzfR();
    Object localObject = new com/google/android/gms/internal/zzgb$1$1;
    ((zzgb.1.1)localObject).<init>(this, localWebView);
    localWebView.setWebViewClient((WebViewClient)localObject);
    this.zzFu.zzFr.add(localWebView);
    localObject = this.zzFs;
    String str = this.zzFt;
    localWebView.loadDataWithBaseURL((String)localObject, str, "text/html", "UTF-8", null);
    zzin.zzaI("Fetching assets finished.");
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */