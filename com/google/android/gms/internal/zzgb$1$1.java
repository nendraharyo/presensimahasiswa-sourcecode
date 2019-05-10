package com.google.android.gms.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Set;

class zzgb$1$1
  extends WebViewClient
{
  zzgb$1$1(zzgb.1 param1, WebView paramWebView) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    zzin.zzaI("Loading assets have finished");
    Set localSet = this.zzFv.zzFu.zzFr;
    WebView localWebView = this.zztj;
    localSet.remove(localWebView);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    zzin.zzaK("Loading assets have failed.");
    Set localSet = this.zzFv.zzFu.zzFr;
    WebView localWebView = this.zztj;
    localSet.remove(localWebView);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgb$1$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */