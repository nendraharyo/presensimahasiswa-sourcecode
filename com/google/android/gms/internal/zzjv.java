package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.pm.PackageManager;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.ConsoleMessage.MessageLevel;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzd;
import com.google.android.gms.ads.internal.zzr;

public class zzjv
  extends WebChromeClient
{
  private final zzjp zzpD;
  
  public zzjv(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }
  
  private final Context zza(WebView paramWebView)
  {
    boolean bool = paramWebView instanceof zzjp;
    Object localObject;
    if (!bool) {
      localObject = paramWebView.getContext();
    }
    for (;;)
    {
      return (Context)localObject;
      paramWebView = (zzjp)paramWebView;
      localObject = paramWebView.zzhP();
      if (localObject == null) {
        localObject = paramWebView.getContext();
      }
    }
  }
  
  private static void zza(AlertDialog.Builder paramBuilder, String paramString, JsResult paramJsResult)
  {
    AlertDialog.Builder localBuilder = paramBuilder.setMessage(paramString);
    Object localObject = new com/google/android/gms/internal/zzjv$3;
    ((zzjv.3)localObject).<init>(paramJsResult);
    localBuilder = localBuilder.setPositiveButton(17039370, (DialogInterface.OnClickListener)localObject);
    localObject = new com/google/android/gms/internal/zzjv$2;
    ((zzjv.2)localObject).<init>(paramJsResult);
    localBuilder = localBuilder.setNegativeButton(17039360, (DialogInterface.OnClickListener)localObject);
    zzjv.1 local1 = new com/google/android/gms/internal/zzjv$1;
    local1.<init>(paramJsResult);
    localBuilder.setOnCancelListener(local1).create().show();
  }
  
  private static void zza(Context paramContext, AlertDialog.Builder paramBuilder, String paramString1, String paramString2, JsPromptResult paramJsPromptResult)
  {
    Object localObject1 = new android/widget/LinearLayout;
    ((LinearLayout)localObject1).<init>(paramContext);
    ((LinearLayout)localObject1).setOrientation(1);
    Object localObject2 = new android/widget/TextView;
    ((TextView)localObject2).<init>(paramContext);
    ((TextView)localObject2).setText(paramString1);
    Object localObject3 = new android/widget/EditText;
    ((EditText)localObject3).<init>(paramContext);
    ((EditText)localObject3).setText(paramString2);
    ((LinearLayout)localObject1).addView((View)localObject2);
    ((LinearLayout)localObject1).addView((View)localObject3);
    localObject1 = paramBuilder.setView((View)localObject1);
    zzjv.6 local6 = new com/google/android/gms/internal/zzjv$6;
    local6.<init>(paramJsPromptResult, (EditText)localObject3);
    localObject1 = ((AlertDialog.Builder)localObject1).setPositiveButton(17039370, local6);
    localObject3 = new com/google/android/gms/internal/zzjv$5;
    ((zzjv.5)localObject3).<init>(paramJsPromptResult);
    localObject1 = ((AlertDialog.Builder)localObject1).setNegativeButton(17039360, (DialogInterface.OnClickListener)localObject3);
    localObject2 = new com/google/android/gms/internal/zzjv$4;
    ((zzjv.4)localObject2).<init>(paramJsPromptResult);
    ((AlertDialog.Builder)localObject1).setOnCancelListener((DialogInterface.OnCancelListener)localObject2).create().show();
  }
  
  private final boolean zziv()
  {
    zzir localzzir = zzr.zzbC();
    PackageManager localPackageManager = this.zzpD.getContext().getPackageManager();
    String str1 = this.zzpD.getContext().getPackageName();
    String str2 = "android.permission.ACCESS_FINE_LOCATION";
    boolean bool = localzzir.zza(localPackageManager, str1, str2);
    if (!bool)
    {
      localzzir = zzr.zzbC();
      localPackageManager = this.zzpD.getContext().getPackageManager();
      str1 = this.zzpD.getContext().getPackageName();
      str2 = "android.permission.ACCESS_COARSE_LOCATION";
      bool = localzzir.zza(localPackageManager, str1, str2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzir = null;
    }
  }
  
  public final void onCloseWindow(WebView paramWebView)
  {
    boolean bool = paramWebView instanceof zzjp;
    Object localObject;
    if (!bool)
    {
      localObject = "Tried to close a WebView that wasn't an AdWebView.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      paramWebView = (zzjp)paramWebView;
      localObject = paramWebView.zzhS();
      if (localObject == null)
      {
        localObject = "Tried to close an AdWebView not associated with an overlay.";
        zzin.zzaK((String)localObject);
      }
      else
      {
        ((zzd)localObject).close();
      }
    }
  }
  
  public final boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    localObject1 = ((StringBuilder)localObject1).append("JS: ");
    Object localObject2 = paramConsoleMessage.message();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(" (");
    localObject2 = paramConsoleMessage.sourceId();
    localObject1 = ((StringBuilder)localObject1).append((String)localObject2).append(":");
    int i = paramConsoleMessage.lineNumber();
    localObject1 = i + ")";
    localObject2 = "Application Cache";
    boolean bool1 = ((String)localObject1).contains((CharSequence)localObject2);
    boolean bool2;
    if (bool1)
    {
      bool2 = super.onConsoleMessage(paramConsoleMessage);
      return bool2;
    }
    localObject2 = zzjv.7.zzOk;
    ConsoleMessage.MessageLevel localMessageLevel = paramConsoleMessage.messageLevel();
    int k = localMessageLevel.ordinal();
    int j = localObject2[k];
    switch (j)
    {
    default: 
      zzin.zzaJ((String)localObject1);
    }
    for (;;)
    {
      bool2 = super.onConsoleMessage(paramConsoleMessage);
      break;
      zzin.e((String)localObject1);
      continue;
      zzin.zzaK((String)localObject1);
      continue;
      zzin.zzaJ((String)localObject1);
      continue;
      zzin.zzaI((String)localObject1);
    }
  }
  
  public final boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    WebView.WebViewTransport localWebViewTransport = (WebView.WebViewTransport)paramMessage.obj;
    WebView localWebView = new android/webkit/WebView;
    Object localObject = paramWebView.getContext();
    localWebView.<init>((Context)localObject);
    localObject = this.zzpD.zzhU();
    localWebView.setWebViewClient((WebViewClient)localObject);
    localWebViewTransport.setWebView(localWebView);
    paramMessage.sendToTarget();
    return true;
  }
  
  public final void onExceededDatabaseQuota(String paramString1, String paramString2, long paramLong1, long paramLong2, long paramLong3, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong3;
    long l2 = 0L;
    boolean bool1 = l1 < l2;
    if (!bool1)
    {
      paramQuotaUpdater.updateQuota(paramLong1);
      return;
    }
    l2 = 0L;
    bool1 = paramLong1 < l2;
    boolean bool2;
    if (!bool1)
    {
      bool2 = paramLong2 < l1;
      if (!bool2)
      {
        l1 = 1048576L;
        bool2 = paramLong2 < l1;
        if (bool2) {}
      }
    }
    for (;;)
    {
      paramQuotaUpdater.updateQuota(paramLong2);
      break;
      paramLong2 = 0L;
      continue;
      l2 = 0L;
      bool1 = paramLong2 < l2;
      if (!bool1)
      {
        l1 = Math.min(131072L, l1) + paramLong1;
        l2 = 1048576L;
        paramLong2 = Math.min(l1, l2);
      }
      else
      {
        l2 = 1048576L - paramLong1;
        l1 = Math.min(l2, l1);
        bool2 = paramLong2 < l1;
        if (!bool2) {
          paramLong1 += paramLong2;
        }
        paramLong2 = paramLong1;
      }
    }
  }
  
  public final void onGeolocationPermissionsShowPrompt(String paramString, GeolocationPermissions.Callback paramCallback)
  {
    if (paramCallback != null)
    {
      boolean bool1 = zziv();
      boolean bool2 = true;
      paramCallback.invoke(paramString, bool1, bool2);
    }
  }
  
  public final void onHideCustomView()
  {
    Object localObject = this.zzpD.zzhS();
    if (localObject == null)
    {
      localObject = "Could not get ad overlay when hiding custom view.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      ((zzd)localObject).zzfl();
    }
  }
  
  public final boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    Context localContext = zza(paramWebView);
    return zza(localContext, paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    Context localContext = zza(paramWebView);
    return zza(localContext, paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    Context localContext = zza(paramWebView);
    return zza(localContext, paramString1, paramString2, null, paramJsResult, null, false);
  }
  
  public final boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    Context localContext = zza(paramWebView);
    return zza(localContext, paramString1, paramString2, paramString3, null, paramJsPromptResult, true);
  }
  
  public final void onReachedMaxAppCacheSize(long paramLong1, long paramLong2, WebStorage.QuotaUpdater paramQuotaUpdater)
  {
    long l1 = 5242880L - paramLong2;
    long l2 = 131072L + paramLong1;
    boolean bool = l1 < l2;
    if (bool)
    {
      l1 = 0L;
      paramQuotaUpdater.updateQuota(l1);
    }
    for (;;)
    {
      return;
      paramQuotaUpdater.updateQuota(l2);
    }
  }
  
  public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    zza(paramView, -1, paramCustomViewCallback);
  }
  
  protected final void zza(View paramView, int paramInt, WebChromeClient.CustomViewCallback paramCustomViewCallback)
  {
    Object localObject = this.zzpD.zzhS();
    if (localObject == null)
    {
      localObject = "Could not get ad overlay when showing custom view.";
      zzin.zzaK((String)localObject);
      paramCustomViewCallback.onCustomViewHidden();
    }
    for (;;)
    {
      return;
      ((zzd)localObject).zza(paramView, paramCustomViewCallback);
      ((zzd)localObject).setRequestedOrientation(paramInt);
    }
  }
  
  protected boolean zza(Context paramContext, String paramString1, String paramString2, String paramString3, JsResult paramJsResult, JsPromptResult paramJsPromptResult, boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        localBuilder = new android/app/AlertDialog$Builder;
        localBuilder.<init>(paramContext);
        localBuilder.setTitle(paramString1);
        if (!paramBoolean) {
          continue;
        }
        zza(paramContext, localBuilder, paramString2, paramString3, paramJsPromptResult);
      }
      catch (WindowManager.BadTokenException localBadTokenException)
      {
        AlertDialog.Builder localBuilder;
        String str = "Fail to display Dialog.";
        zzin.zzd(str, localBadTokenException);
        continue;
      }
      return true;
      zza(localBuilder, paramString2, paramJsResult);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjv.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */