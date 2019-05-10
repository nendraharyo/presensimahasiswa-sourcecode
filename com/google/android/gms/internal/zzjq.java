package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzg;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class zzjq
  extends WebViewClient
{
  private static final String[] zzNy;
  private static final String[] zzNz;
  private zzft zzDk;
  private zzjq.zza zzGm;
  private final HashMap zzNA;
  private zzg zzNB;
  private zzjq.zzb zzNC;
  private boolean zzND;
  private boolean zzNE;
  private zzp zzNF;
  private final zzfr zzNG;
  private boolean zzNH;
  private boolean zzNI;
  private boolean zzNJ;
  private int zzNK;
  protected zzjp zzpD;
  private final Object zzpV;
  private boolean zzsz;
  private zza zztz;
  private zzdb zzyW;
  private com.google.android.gms.ads.internal.zze zzzA;
  private zzfn zzzB;
  private zzdh zzzD;
  private zzdj zzzy;
  
  static
  {
    int i = 4;
    int j = 3;
    int k = 2;
    int m = 1;
    String[] arrayOfString = new String[15];
    arrayOfString[0] = "UNKNOWN";
    arrayOfString[m] = "HOST_LOOKUP";
    arrayOfString[k] = "UNSUPPORTED_AUTH_SCHEME";
    arrayOfString[j] = "AUTHENTICATION";
    arrayOfString[i] = "PROXY_AUTHENTICATION";
    arrayOfString[5] = "CONNECT";
    arrayOfString[6] = "IO";
    arrayOfString[7] = "TIMEOUT";
    arrayOfString[8] = "REDIRECT_LOOP";
    arrayOfString[9] = "UNSUPPORTED_SCHEME";
    arrayOfString[10] = "FAILED_SSL_HANDSHAKE";
    arrayOfString[11] = "BAD_URL";
    arrayOfString[12] = "FILE";
    arrayOfString[13] = "FILE_NOT_FOUND";
    arrayOfString[14] = "TOO_MANY_REQUESTS";
    zzNy = arrayOfString;
    arrayOfString = new String[6];
    arrayOfString[0] = "NOT_YET_VALID";
    arrayOfString[m] = "EXPIRED";
    arrayOfString[k] = "ID_MISMATCH";
    arrayOfString[j] = "UNTRUSTED";
    arrayOfString[i] = "DATE_INVALID";
    arrayOfString[5] = "INVALID";
    zzNz = arrayOfString;
  }
  
  public zzjq(zzjp paramzzjp, boolean paramBoolean)
  {
    this(paramzzjp, paramBoolean, localzzfr, null);
  }
  
  zzjq(zzjp paramzzjp, boolean paramBoolean, zzfr paramzzfr, zzfn paramzzfn)
  {
    Object localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.zzNA = ((HashMap)localObject);
    localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzND = false;
    this.zzpD = paramzzjp;
    this.zzsz = paramBoolean;
    this.zzNG = paramzzfr;
    this.zzzB = paramzzfn;
  }
  
  private void zza(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = (Boolean)zzbt.zzwO.get();
    boolean bool1 = ((Boolean)localObject1).booleanValue();
    if (!bool1) {}
    for (;;)
    {
      return;
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("err", paramString1);
      localBundle.putString("code", paramString2);
      Object localObject2 = zzaN(paramString3);
      localBundle.putString("host", (String)localObject2);
      localObject1 = zzr.zzbC();
      String str1 = this.zzpD.zzhX().afmaVersion;
      String str2 = "gmob-apps";
      boolean bool2 = true;
      localObject2 = paramContext;
      ((zzir)localObject1).zza(paramContext, str1, str2, localBundle, bool2);
    }
  }
  
  private String zzaN(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Object localObject;
    if (bool) {
      localObject = "";
    }
    for (;;)
    {
      return (String)localObject;
      localObject = Uri.parse(paramString);
      String str = ((Uri)localObject).getHost();
      if (str != null) {
        localObject = ((Uri)localObject).getHost();
      } else {
        localObject = "";
      }
    }
  }
  
  private static boolean zzg(Uri paramUri)
  {
    String str1 = paramUri.getScheme();
    String str2 = "http";
    boolean bool1 = str2.equalsIgnoreCase(str1);
    boolean bool2;
    if (!bool1)
    {
      str2 = "https";
      bool2 = str2.equalsIgnoreCase(str1);
      if (!bool2) {}
    }
    else
    {
      bool2 = true;
    }
    for (;;)
    {
      return bool2;
      bool2 = false;
      str1 = null;
    }
  }
  
  private void zzij()
  {
    Object localObject1 = this.zzpV;
    int i = 1;
    try
    {
      this.zzNE = i;
      i = this.zzNK + 1;
      this.zzNK = i;
      zzim();
      return;
    }
    finally {}
  }
  
  private void zzik()
  {
    int i = this.zzNK + -1;
    this.zzNK = i;
    zzim();
  }
  
  private void zzil()
  {
    this.zzNJ = true;
    zzim();
  }
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    zzin.v("Loading resource: " + paramString);
    localObject = Uri.parse(paramString);
    String str1 = "gmsg";
    String str2 = ((Uri)localObject).getScheme();
    boolean bool = str1.equalsIgnoreCase(str2);
    if (bool)
    {
      str1 = "mobileads.google.com";
      str2 = ((Uri)localObject).getHost();
      bool = str1.equalsIgnoreCase(str2);
      if (bool) {
        zzh((Uri)localObject);
      }
    }
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNH;
      if (bool)
      {
        Object localObject2 = "Blank page loaded, 1...";
        zzin.v((String)localObject2);
        localObject2 = this.zzpD;
        ((zzjp)localObject2).zzhZ();
        return;
      }
      bool = true;
      this.zzNI = bool;
      zzim();
    }
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Object localObject1;
    int j;
    if (paramInt < 0)
    {
      int i = -paramInt + -1;
      localObject1 = zzNy;
      j = localObject1.length;
      if (i < j)
      {
        localObject2 = zzNy;
        j = -paramInt + -1;
      }
    }
    for (Object localObject2 = localObject2[j];; localObject2 = String.valueOf(paramInt))
    {
      localObject1 = this.zzpD.getContext();
      zza((Context)localObject1, "http_err", (String)localObject2, paramString2);
      super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
      return;
    }
  }
  
  public final void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    int i;
    Object localObject;
    if (paramSslError != null)
    {
      i = paramSslError.getPrimaryError();
      if (i < 0) {
        break label89;
      }
      localObject = zzNz;
      int j = localObject.length;
      if (i >= j) {
        break label89;
      }
      localObject = zzNz;
    }
    label89:
    for (String str1 = localObject[i];; str1 = String.valueOf(i))
    {
      localObject = this.zzpD.getContext();
      String str2 = "ssl_err";
      String str3 = zzr.zzbE().zza(paramSslError);
      zza((Context)localObject, str2, str1, str3);
      super.onReceivedSslError(paramWebView, paramSslErrorHandler, paramSslError);
      return;
    }
  }
  
  public final void reset()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzNA;
      ((HashMap)localObject2).clear();
      localObject2 = null;
      this.zztz = null;
      localObject2 = null;
      this.zzNB = null;
      localObject2 = null;
      this.zzGm = null;
      localObject2 = null;
      this.zzyW = null;
      localObject2 = null;
      this.zzND = false;
      localObject2 = null;
      this.zzsz = false;
      localObject2 = null;
      this.zzNE = false;
      localObject2 = null;
      this.zzzD = null;
      localObject2 = null;
      this.zzNF = null;
      localObject2 = null;
      this.zzNC = null;
      localObject2 = this.zzzB;
      if (localObject2 != null)
      {
        localObject2 = this.zzzB;
        boolean bool = true;
        ((zzfn)localObject2).zzp(bool);
        localObject2 = null;
        this.zzzB = null;
      }
      return;
    }
  }
  
  public boolean shouldOverrideKeyEvent(WebView paramWebView, KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    switch (i)
    {
    }
    int j;
    for (i = 0;; j = 1) {
      return i;
    }
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    zzin.v("AdWebView shouldOverrideUrlLoading: " + paramString);
    localObject1 = Uri.parse(paramString);
    Object localObject2 = "gmsg";
    Object localObject4 = ((Uri)localObject1).getScheme();
    boolean bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject4);
    if (bool1)
    {
      localObject2 = "mobileads.google.com";
      localObject4 = ((Uri)localObject1).getHost();
      bool1 = ((String)localObject2).equalsIgnoreCase((String)localObject4);
      if (bool1) {
        zzh((Uri)localObject1);
      }
    }
    for (;;)
    {
      for (boolean bool2 = true;; bool2 = super.shouldOverrideUrlLoading(paramWebView, paramString))
      {
        return bool2;
        bool1 = this.zzND;
        if (!bool1) {
          break;
        }
        localObject2 = this.zzpD.getWebView();
        if (paramWebView != localObject2) {
          break;
        }
        bool1 = zzg((Uri)localObject1);
        if (!bool1) {
          break;
        }
        localObject1 = this.zztz;
        if (localObject1 != null)
        {
          localObject1 = (Boolean)zzbt.zzww.get();
          bool2 = ((Boolean)localObject1).booleanValue();
          if (bool2)
          {
            localObject1 = this.zztz;
            ((zza)localObject1).onAdClicked();
            this.zztz = null;
          }
        }
      }
      localObject2 = this.zzpD.getWebView();
      bool1 = ((WebView)localObject2).willNotDraw();
      Object localObject3;
      if (!bool1)
      {
        try
        {
          localObject2 = this.zzpD;
          localObject2 = ((zzjp)localObject2).zzhW();
          if (localObject2 != null)
          {
            boolean bool3 = ((zzan)localObject2).zzb((Uri)localObject1);
            if (bool3)
            {
              localObject4 = this.zzpD;
              localObject4 = ((zzjp)localObject4).getContext();
              localObject1 = ((zzan)localObject2).zza((Uri)localObject1, (Context)localObject4);
            }
          }
          localObject4 = localObject1;
        }
        catch (zzao localzzao)
        {
          for (;;)
          {
            localObject3 = new java/lang/StringBuilder;
            ((StringBuilder)localObject3).<init>();
            localObject3 = "Unable to append parameter to URL: " + paramString;
            zzin.zzaK((String)localObject3);
            localObject4 = localObject1;
          }
          localObject1 = this.zzzA;
          ((com.google.android.gms.ads.internal.zze)localObject1).zzq(paramString);
        }
        localObject1 = this.zzzA;
        if (localObject1 != null)
        {
          localObject1 = this.zzzA;
          bool2 = ((com.google.android.gms.ads.internal.zze)localObject1).zzbh();
          if (!bool2) {}
        }
        else
        {
          localObject1 = new com/google/android/gms/ads/internal/overlay/AdLauncherIntentInfoParcel;
          localObject2 = "android.intent.action.VIEW";
          localObject4 = ((Uri)localObject4).toString();
          ((AdLauncherIntentInfoParcel)localObject1).<init>((String)localObject2, (String)localObject4, null, null, null, null, null);
          zza((AdLauncherIntentInfoParcel)localObject1);
          continue;
        }
      }
      else
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject3 = "AdWebView unable to handle URL: ";
        localObject1 = (String)localObject3 + paramString;
        zzin.zzaK((String)localObject1);
      }
    }
  }
  
  public void zzG(boolean paramBoolean)
  {
    this.zzND = paramBoolean;
  }
  
  public void zza(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    this.zzNG.zzf(paramInt1, paramInt2);
    zzfn localzzfn = this.zzzB;
    if (localzzfn != null)
    {
      localzzfn = this.zzzB;
      localzzfn.zza(paramInt1, paramInt2, paramBoolean);
    }
  }
  
  public final void zza(AdLauncherIntentInfoParcel paramAdLauncherIntentInfoParcel)
  {
    zzg localzzg = null;
    boolean bool1 = this.zzpD.zzhY();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    Object localObject;
    if (bool1)
    {
      localObject = this.zzpD.zzaN();
      boolean bool2 = ((AdSizeParcel)localObject).zzui;
      if (!bool2)
      {
        bool2 = false;
        localObject = null;
        if (!bool1) {
          break label100;
        }
      }
    }
    for (;;)
    {
      zzp localzzp = this.zzNF;
      VersionInfoParcel localVersionInfoParcel = this.zzpD.zzhX();
      localAdOverlayInfoParcel.<init>(paramAdLauncherIntentInfoParcel, (zza)localObject, localzzg, localzzp, localVersionInfoParcel);
      zza(localAdOverlayInfoParcel);
      return;
      localObject = this.zztz;
      break;
      label100:
      localzzg = this.zzNB;
    }
  }
  
  public void zza(AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    boolean bool1 = false;
    zzfn localzzfn = this.zzzB;
    boolean bool2;
    if (localzzfn != null)
    {
      localzzfn = this.zzzB;
      bool2 = localzzfn.zzeN();
    }
    for (;;)
    {
      com.google.android.gms.ads.internal.overlay.zze localzze = zzr.zzbA();
      Context localContext = this.zzpD.getContext();
      if (!bool2) {
        bool1 = true;
      }
      localzze.zza(localContext, paramAdOverlayInfoParcel, bool1);
      return;
      bool2 = false;
      localzzfn = null;
    }
  }
  
  public void zza(zzjq.zza paramzza)
  {
    this.zzGm = paramzza;
  }
  
  public void zza(zzjq.zzb paramzzb)
  {
    this.zzNC = paramzzb;
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzNA;
      localObject2 = ((HashMap)localObject2).get(paramString);
      localObject2 = (List)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new java/util/concurrent/CopyOnWriteArrayList;
        ((CopyOnWriteArrayList)localObject2).<init>();
        HashMap localHashMap = this.zzNA;
        localHashMap.put(paramString, localObject2);
      }
      ((List)localObject2).add(paramzzdf);
      return;
    }
  }
  
  public final void zza(boolean paramBoolean, int paramInt)
  {
    boolean bool = this.zzpD.zzhY();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    if (bool)
    {
      localObject = this.zzpD.zzaN();
      bool = ((AdSizeParcel)localObject).zzui;
      if (!bool) {
        bool = false;
      }
    }
    for (Object localObject = null;; localObject = this.zztz)
    {
      zzg localzzg = this.zzNB;
      zzp localzzp = this.zzNF;
      zzjp localzzjp = this.zzpD;
      VersionInfoParcel localVersionInfoParcel = this.zzpD.zzhX();
      localAdOverlayInfoParcel.<init>((zza)localObject, localzzg, localzzp, localzzjp, paramBoolean, paramInt, localVersionInfoParcel);
      zza(localAdOverlayInfoParcel);
      return;
    }
  }
  
  public final void zza(boolean paramBoolean, int paramInt, String paramString)
  {
    Object localObject1 = null;
    boolean bool1 = this.zzpD.zzhY();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    Object localObject2;
    if (bool1)
    {
      localObject2 = this.zzpD.zzaN();
      boolean bool2 = ((AdSizeParcel)localObject2).zzui;
      if (!bool2)
      {
        bool2 = false;
        localObject2 = null;
        if (!bool1) {
          break label131;
        }
      }
    }
    for (;;)
    {
      Object localObject3 = this.zzyW;
      Object localObject4 = this.zzNF;
      zzjp localzzjp = this.zzpD;
      VersionInfoParcel localVersionInfoParcel = this.zzpD.zzhX();
      zzdh localzzdh = this.zzzD;
      localAdOverlayInfoParcel.<init>((zza)localObject2, (zzg)localObject1, (zzdb)localObject3, (zzp)localObject4, localzzjp, paramBoolean, paramInt, paramString, localVersionInfoParcel, localzzdh);
      zza(localAdOverlayInfoParcel);
      return;
      localObject2 = this.zztz;
      break;
      label131:
      localObject1 = new com/google/android/gms/internal/zzjq$zzc;
      localObject3 = this.zzpD;
      localObject4 = this.zzNB;
      ((zzjq.zzc)localObject1).<init>((zzjp)localObject3, (zzg)localObject4);
    }
  }
  
  public final void zza(boolean paramBoolean, int paramInt, String paramString1, String paramString2)
  {
    boolean bool1 = this.zzpD.zzhY();
    AdOverlayInfoParcel localAdOverlayInfoParcel = new com/google/android/gms/ads/internal/overlay/AdOverlayInfoParcel;
    Object localObject1;
    Object localObject2;
    if (bool1)
    {
      localObject1 = this.zzpD.zzaN();
      boolean bool2 = ((AdSizeParcel)localObject1).zzui;
      if (!bool2)
      {
        bool2 = false;
        localObject1 = null;
        if (!bool1) {
          break label136;
        }
        bool1 = false;
        localObject2 = null;
      }
    }
    for (;;)
    {
      Object localObject3 = this.zzyW;
      Object localObject4 = this.zzNF;
      zzjp localzzjp = this.zzpD;
      VersionInfoParcel localVersionInfoParcel = this.zzpD.zzhX();
      zzdh localzzdh = this.zzzD;
      localAdOverlayInfoParcel.<init>((zza)localObject1, (zzg)localObject2, (zzdb)localObject3, (zzp)localObject4, localzzjp, paramBoolean, paramInt, paramString1, paramString2, localVersionInfoParcel, localzzdh);
      zza(localAdOverlayInfoParcel);
      return;
      localObject1 = this.zztz;
      break;
      label136:
      localObject2 = new com/google/android/gms/internal/zzjq$zzc;
      localObject3 = this.zzpD;
      localObject4 = this.zzNB;
      ((zzjq.zzc)localObject2).<init>((zzjp)localObject3, (zzg)localObject4);
    }
  }
  
  public void zzb(zza paramzza, zzg paramzzg, zzdb paramzzdb, zzp paramzzp, boolean paramBoolean, zzdh paramzzdh, zzdj paramzzdj, com.google.android.gms.ads.internal.zze paramzze, zzft paramzzft)
  {
    if (paramzze == null)
    {
      paramzze = new com/google/android/gms/ads/internal/zze;
      localObject1 = null;
      paramzze.<init>(false);
    }
    Object localObject1 = new com/google/android/gms/internal/zzfn;
    Object localObject2 = this.zzpD;
    ((zzfn)localObject1).<init>((zzjp)localObject2, paramzzft);
    this.zzzB = ((zzfn)localObject1);
    localObject2 = new com/google/android/gms/internal/zzda;
    ((zzda)localObject2).<init>(paramzzdb);
    zza("/appEvent", (zzdf)localObject2);
    localObject2 = zzde.zzzh;
    zza("/backButton", (zzdf)localObject2);
    localObject2 = zzde.zzyY;
    zza("/canOpenURLs", (zzdf)localObject2);
    localObject2 = zzde.zzyZ;
    zza("/canOpenIntents", (zzdf)localObject2);
    localObject2 = zzde.zzza;
    zza("/click", (zzdf)localObject2);
    localObject2 = zzde.zzzb;
    zza("/close", (zzdf)localObject2);
    localObject2 = zzde.zzzd;
    zza("/customClose", (zzdf)localObject2);
    localObject2 = zzde.zzzk;
    zza("/instrument", (zzdf)localObject2);
    localObject2 = new com/google/android/gms/internal/zzjq$zzd;
    ((zzjq.zzd)localObject2).<init>(this, null);
    zza("/delayPageLoaded", (zzdf)localObject2);
    localObject2 = zzde.zzze;
    zza("/httpTrack", (zzdf)localObject2);
    localObject2 = zzde.zzzf;
    zza("/log", (zzdf)localObject2);
    localObject2 = new com/google/android/gms/internal/zzdl;
    zzfn localzzfn = this.zzzB;
    ((zzdl)localObject2).<init>(paramzze, localzzfn);
    zza("/mraid", (zzdf)localObject2);
    localObject2 = this.zzNG;
    zza("/mraidLoaded", (zzdf)localObject2);
    localObject2 = new com/google/android/gms/internal/zzdm;
    localzzfn = this.zzzB;
    ((zzdm)localObject2).<init>(paramzzdh, paramzze, localzzfn);
    zza("/open", (zzdf)localObject2);
    localObject2 = zzde.zzzj;
    zza("/precache", (zzdf)localObject2);
    localObject2 = zzde.zzzg;
    zza("/touch", (zzdf)localObject2);
    localObject2 = zzde.zzzi;
    zza("/video", (zzdf)localObject2);
    localObject1 = "/appStreaming";
    localObject2 = zzde.zzzc;
    zza((String)localObject1, (zzdf)localObject2);
    if (paramzzdj != null)
    {
      localObject1 = "/setInterstitialProperties";
      localObject2 = new com/google/android/gms/internal/zzdi;
      ((zzdi)localObject2).<init>(paramzzdj);
      zza((String)localObject1, (zzdf)localObject2);
    }
    this.zztz = paramzza;
    this.zzNB = paramzzg;
    this.zzyW = paramzzdb;
    this.zzzD = paramzzdh;
    this.zzNF = paramzzp;
    this.zzzA = paramzze;
    this.zzDk = paramzzft;
    this.zzzy = paramzzdj;
    zzG(paramBoolean);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzNA;
      localObject2 = ((HashMap)localObject2).get(paramString);
      localObject2 = (List)localObject2;
      if (localObject2 == null) {
        return;
      }
      ((List)localObject2).remove(paramzzdf);
    }
  }
  
  public boolean zzcv()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzsz;
      return bool;
    }
  }
  
  public void zze(int paramInt1, int paramInt2)
  {
    zzfn localzzfn = this.zzzB;
    if (localzzfn != null)
    {
      localzzfn = this.zzzB;
      localzzfn.zze(paramInt1, paramInt2);
    }
  }
  
  public final void zzfo()
  {
    Object localObject1 = this.zzpV;
    boolean bool = false;
    zzjq.1 local1 = null;
    try
    {
      this.zzND = false;
      bool = true;
      this.zzsz = bool;
      local1 = new com/google/android/gms/internal/zzjq$1;
      local1.<init>(this);
      zzir.runOnUiThread(local1);
      return;
    }
    finally {}
  }
  
  public void zzh(Uri paramUri)
  {
    Object localObject1 = paramUri.getPath();
    Object localObject2 = (List)this.zzNA.get(localObject1);
    if (localObject2 != null)
    {
      Map localMap = zzr.zzbC().zze(paramUri);
      boolean bool1 = zzin.zzQ(2);
      Object localObject3;
      if (bool1)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        Object localObject4 = "Received GMSG: ";
        zzin.v((String)localObject4 + (String)localObject1);
        localObject1 = localMap.keySet();
        localObject3 = ((Set)localObject1).iterator();
        for (;;)
        {
          boolean bool2 = ((Iterator)localObject3).hasNext();
          if (!bool2) {
            break;
          }
          localObject1 = (String)((Iterator)localObject3).next();
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          localObject4 = ((StringBuilder)localObject4).append("  ").append((String)localObject1);
          String str = ": ";
          localObject4 = ((StringBuilder)localObject4).append(str);
          localObject1 = (String)localMap.get(localObject1);
          localObject1 = (String)localObject1;
          zzin.v((String)localObject1);
        }
      }
      localObject1 = ((List)localObject2).iterator();
      for (;;)
      {
        boolean bool3 = ((Iterator)localObject1).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (zzdf)((Iterator)localObject1).next();
        localObject3 = this.zzpD;
        ((zzdf)localObject2).zza((zzjp)localObject3, localMap);
      }
    }
    localObject2 = new java/lang/StringBuilder;
    ((StringBuilder)localObject2).<init>();
    localObject1 = "No GMSG handler found for GMSG: ";
    localObject2 = (String)localObject1 + paramUri;
    zzin.v((String)localObject2);
  }
  
  public void zzh(zzjp paramzzjp)
  {
    this.zzpD = paramzzjp;
  }
  
  public com.google.android.gms.ads.internal.zze zzig()
  {
    return this.zzzA;
  }
  
  public boolean zzih()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNE;
      return bool;
    }
  }
  
  public void zzii()
  {
    Object localObject1 = this.zzpV;
    Object localObject2 = "Loading blank page in WebView, 2...";
    try
    {
      zzin.v((String)localObject2);
      boolean bool = true;
      this.zzNH = bool;
      localObject2 = this.zzpD;
      String str = "about:blank";
      ((zzjp)localObject2).zzaL(str);
      return;
    }
    finally {}
  }
  
  public final void zzim()
  {
    zzjq.zza localzza1 = this.zzGm;
    boolean bool2;
    zzjq.zza localzza2;
    zzjp localzzjp;
    if (localzza1 != null)
    {
      boolean bool1 = this.zzNI;
      if (bool1)
      {
        int i = this.zzNK;
        if (i <= 0) {}
      }
      else
      {
        bool2 = this.zzNJ;
        if (!bool2) {
          break label76;
        }
      }
      localzza2 = this.zzGm;
      localzzjp = this.zzpD;
      bool2 = this.zzNJ;
      if (bool2) {
        break label86;
      }
      bool2 = true;
    }
    for (;;)
    {
      localzza2.zza(localzzjp, bool2);
      bool2 = false;
      localzza1 = null;
      this.zzGm = null;
      label76:
      this.zzpD.zzie();
      return;
      label86:
      bool2 = false;
      localzza1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */