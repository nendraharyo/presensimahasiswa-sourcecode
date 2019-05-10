package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class zzjw
  extends zzjq
{
  public zzjw(zzjp paramzzjp, boolean paramBoolean)
  {
    super(paramzzjp, paramBoolean);
  }
  
  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    for (;;)
    {
      try
      {
        localObject1 = new java/io/File;
        ((File)localObject1).<init>(paramString);
        localObject1 = ((File)localObject1).getName();
        localObject3 = "mraid.js";
        bool1 = ((String)localObject3).equalsIgnoreCase((String)localObject1);
        if (bool1) {
          continue;
        }
        localObject1 = super.shouldInterceptRequest(paramWebView, paramString);
      }
      catch (InterruptedException localInterruptedException)
      {
        Object localObject1;
        boolean bool1;
        Object localObject4;
        boolean bool2;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject5 = "Could not fetch MRAID JS. ";
        localObject3 = ((StringBuilder)localObject3).append((String)localObject5);
        Object localObject2 = localInterruptedException.getMessage();
        zzin.zzaK((String)localObject2);
        localObject2 = super.shouldInterceptRequest((WebView)paramWebView, paramString);
        continue;
      }
      catch (ExecutionException localExecutionException)
      {
        continue;
      }
      catch (IOException localIOException)
      {
        continue;
      }
      catch (TimeoutException localTimeoutException)
      {
        continue;
      }
      return (WebResourceResponse)localObject1;
      bool1 = paramWebView instanceof zzjp;
      if (bool1) {
        continue;
      }
      localObject1 = "Tried to intercept request from a WebView that wasn't an AdWebView.";
      zzin.zzaK((String)localObject1);
      localObject1 = super.shouldInterceptRequest(paramWebView, paramString);
    }
    localObject4 = paramWebView;
    localObject4 = (zzjp)paramWebView;
    localObject1 = localObject4;
    localObject3 = ((zzjp)localObject4).zzhU();
    ((zzjq)localObject3).zzfo();
    localObject3 = ((zzjp)localObject4).zzaN();
    bool2 = ((AdSizeParcel)localObject3).zzui;
    if (bool2)
    {
      localObject3 = zzbt.zzwf;
      localObject3 = ((zzbp)localObject3).get();
      localObject3 = (String)localObject3;
    }
    for (;;)
    {
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      String str = "shouldInterceptRequest(";
      localObject5 = ((StringBuilder)localObject5).append(str);
      localObject5 = ((StringBuilder)localObject5).append((String)localObject3);
      str = ")";
      localObject5 = ((StringBuilder)localObject5).append(str);
      localObject5 = ((StringBuilder)localObject5).toString();
      zzin.v((String)localObject5);
      localObject1 = ((zzjp)localObject1).getContext();
      localObject5 = this.zzpD;
      localObject5 = ((zzjp)localObject5).zzhX();
      localObject5 = ((VersionInfoParcel)localObject5).afmaVersion;
      localObject1 = zzd((Context)localObject1, (String)localObject5, (String)localObject3);
      break;
      bool2 = ((zzjp)localObject4).zzhY();
      if (bool2)
      {
        localObject3 = zzbt.zzwe;
        localObject3 = ((zzbp)localObject3).get();
        localObject3 = (String)localObject3;
      }
      else
      {
        localObject3 = zzbt.zzwd;
        localObject3 = ((zzbp)localObject3).get();
        localObject3 = (String)localObject3;
      }
    }
  }
  
  protected WebResourceResponse zzd(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    String str1 = zzr.zzbC().zze(paramContext, paramString1);
    ((Map)localObject1).put("User-Agent", str1);
    str1 = "max-stale=3600";
    ((Map)localObject1).put("Cache-Control", str1);
    Object localObject2 = new com/google/android/gms/internal/zziw;
    ((zziw)localObject2).<init>(paramContext);
    localObject1 = ((zziw)localObject2).zzb(paramString2, (Map)localObject1);
    long l = 60;
    localObject2 = TimeUnit.SECONDS;
    localObject1 = (String)((zzjg)localObject1).get(l, (TimeUnit)localObject2);
    if (localObject1 == null) {}
    for (localObject1 = null;; localObject1 = localObject2)
    {
      return (WebResourceResponse)localObject1;
      localObject2 = new android/webkit/WebResourceResponse;
      str1 = "application/javascript";
      String str2 = "UTF-8";
      ByteArrayInputStream localByteArrayInputStream = new java/io/ByteArrayInputStream;
      String str3 = "UTF-8";
      localObject1 = ((String)localObject1).getBytes(str3);
      localByteArrayInputStream.<init>((byte[])localObject1);
      ((WebResourceResponse)localObject2).<init>(str1, str2, localByteArrayInputStream);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjw.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */