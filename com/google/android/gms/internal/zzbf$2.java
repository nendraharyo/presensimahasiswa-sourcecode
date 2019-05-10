package com.google.android.gms.internal;

import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;

class zzbf$2
  implements Runnable
{
  ValueCallback zzth;
  
  zzbf$2(zzbf paramzzbf, zzbc paramzzbc, WebView paramWebView, boolean paramBoolean)
  {
    zzbf.2.1 local1 = new com/google/android/gms/internal/zzbf$2$1;
    local1.<init>(this);
    this.zzth = local1;
  }
  
  public void run()
  {
    Object localObject1 = this.zztj.getSettings();
    boolean bool = ((WebSettings)localObject1).getJavaScriptEnabled();
    if (bool) {}
    try
    {
      localObject1 = this.zztj;
      str = "(function() { return  {text:document.body.innerText}})();";
      ValueCallback localValueCallback2 = this.zzth;
      ((WebView)localObject1).evaluateJavascript(str, localValueCallback2);
      return;
    }
    finally
    {
      for (;;)
      {
        ValueCallback localValueCallback1 = this.zzth;
        String str = "";
        localValueCallback1.onReceiveValue(str);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzbf$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */