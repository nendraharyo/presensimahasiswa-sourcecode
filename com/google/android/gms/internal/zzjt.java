package com.google.android.gms.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

class zzjt
  extends WebView
  implements ViewTreeObserver.OnGlobalLayoutListener, DownloadListener, zzjp
{
  private AdSizeParcel zzCh;
  private int zzDC;
  private int zzDD;
  private int zzDF;
  private int zzDG;
  private String zzEY;
  private Boolean zzLB;
  private final zzjt.zza zzNP;
  private zzjq zzNQ;
  private com.google.android.gms.ads.internal.overlay.zzd zzNR;
  private boolean zzNS;
  private boolean zzNT;
  private boolean zzNU;
  private boolean zzNV;
  private int zzNW;
  private boolean zzNX;
  private zzbz zzNY;
  private zzbz zzNZ;
  private zzbz zzOa;
  private zzca zzOb;
  private WeakReference zzOc;
  private com.google.android.gms.ads.internal.overlay.zzd zzOd;
  private Map zzOe;
  private final VersionInfoParcel zzpT;
  private final Object zzpV;
  private final com.google.android.gms.ads.internal.zzd zzpm;
  private zzjc zzrV;
  private final WindowManager zzsb;
  private final zzan zzyt;
  
  protected zzjt(zzjt.zza paramzza, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    super(paramzza);
    Object localObject1 = new java/lang/Object;
    localObject1.<init>();
    this.zzpV = localObject1;
    this.zzNX = bool1;
    this.zzEY = "";
    this.zzDD = j;
    this.zzDC = j;
    this.zzDF = j;
    this.zzDG = j;
    this.zzNP = paramzza;
    this.zzCh = paramAdSizeParcel;
    this.zzNU = paramBoolean1;
    this.zzNW = j;
    this.zzyt = paramzzan;
    this.zzpT = paramVersionInfoParcel;
    this.zzpm = paramzzd;
    localObject1 = getContext();
    Object localObject2 = "window";
    localObject1 = (WindowManager)((Context)localObject1).getSystemService((String)localObject2);
    this.zzsb = ((WindowManager)localObject1);
    setBackgroundColor(0);
    localObject1 = getSettings();
    ((WebSettings)localObject1).setAllowFileAccess(false);
    ((WebSettings)localObject1).setJavaScriptEnabled(bool1);
    ((WebSettings)localObject1).setSavePassword(false);
    ((WebSettings)localObject1).setSupportMultipleWindows(bool1);
    ((WebSettings)localObject1).setJavaScriptCanOpenWindowsAutomatically(bool1);
    j = Build.VERSION.SDK_INT;
    int i = 21;
    if (j >= i) {
      ((WebSettings)localObject1).setMixedContentMode(0);
    }
    localObject2 = zzr.zzbC();
    Object localObject3 = paramVersionInfoParcel.afmaVersion;
    ((zzir)localObject2).zza(paramzza, (String)localObject3, (WebSettings)localObject1);
    localObject2 = zzr.zzbE();
    localObject3 = getContext();
    ((zzis)localObject2).zza((Context)localObject3, (WebSettings)localObject1);
    setDownloadListener(this);
    zziq();
    boolean bool2 = zzne.zzsi();
    if (bool2)
    {
      localObject1 = new com/google/android/gms/internal/zzju;
      ((zzju)localObject1).<init>(this);
      localObject2 = "googleAdsJsInterface";
      addJavascriptInterface(localObject1, (String)localObject2);
    }
    localObject1 = new com/google/android/gms/internal/zzjc;
    localObject2 = this.zzNP.zzhP();
    ((zzjc)localObject1).<init>((Activity)localObject2, this, null);
    this.zzrV = ((zzjc)localObject1);
    zzd(paramzzcb);
  }
  
  static zzjt zzb(Context paramContext, AdSizeParcel paramAdSizeParcel, boolean paramBoolean1, boolean paramBoolean2, zzan paramzzan, VersionInfoParcel paramVersionInfoParcel, zzcb paramzzcb, com.google.android.gms.ads.internal.zzd paramzzd)
  {
    zzjt.zza localzza = new com/google/android/gms/internal/zzjt$zza;
    localzza.<init>(paramContext);
    zzjt localzzjt = new com/google/android/gms/internal/zzjt;
    localzzjt.<init>(localzza, paramAdSizeParcel, paramBoolean1, paramBoolean2, paramzzan, paramVersionInfoParcel, paramzzcb, paramzzd);
    return localzzjt;
  }
  
  private void zzd(zzcb paramzzcb)
  {
    zziu();
    Object localObject = new com/google/android/gms/internal/zzca;
    zzcb localzzcb = new com/google/android/gms/internal/zzcb;
    String str = this.zzCh.zzuh;
    localzzcb.<init>(true, "make_wv", str);
    ((zzca)localObject).<init>(localzzcb);
    this.zzOb = ((zzca)localObject);
    this.zzOb.zzdA().zzc(paramzzcb);
    localObject = zzbx.zzb(this.zzOb.zzdA());
    this.zzNZ = ((zzbz)localObject);
    localObject = this.zzOb;
    zzbz localzzbz = this.zzNZ;
    ((zzca)localObject).zza("native:view_create", localzzbz);
    this.zzOa = null;
    this.zzNY = null;
  }
  
  private void zzio()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = zzr.zzbF();
      localObject2 = ((zzih)localObject2).zzhg();
      this.zzLB = ((Boolean)localObject2);
      localObject2 = this.zzLB;
      if (localObject2 == null) {
        localObject2 = "(function(){})()";
      }
      try
      {
        evaluateJavascript((String)localObject2, null);
        bool = true;
        localObject2 = Boolean.valueOf(bool);
        zzb((Boolean)localObject2);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          boolean bool = false;
          Boolean localBoolean = null;
          localBoolean = Boolean.valueOf(false);
          zzb(localBoolean);
        }
      }
      return;
    }
  }
  
  private void zzip()
  {
    zzcb localzzcb = this.zzOb.zzdA();
    zzbz localzzbz = this.zzNY;
    String[] arrayOfString = new String[1];
    arrayOfString[0] = "aeh";
    zzbx.zza(localzzcb, localzzbz, arrayOfString);
  }
  
  private void zziq()
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        boolean bool = this.zzNU;
        Object localObject2;
        if (!bool)
        {
          localObject2 = this.zzCh;
          bool = ((AdSizeParcel)localObject2).zzui;
          if (!bool) {}
        }
        else
        {
          i = Build.VERSION.SDK_INT;
          j = 14;
          if (i < j)
          {
            localObject2 = "Disabling hardware acceleration on an overlay.";
            zzin.zzaI((String)localObject2);
            zzir();
            return;
          }
          localObject2 = "Enabling hardware acceleration on an overlay.";
          zzin.zzaI((String)localObject2);
          zzis();
        }
      }
      int i = Build.VERSION.SDK_INT;
      int j = 18;
      String str;
      if (i < j)
      {
        str = "Disabling hardware acceleration on an AdView.";
        zzin.zzaI(str);
        zzir();
      }
      else
      {
        str = "Enabling hardware acceleration on an AdView.";
        zzin.zzaI(str);
        zzis();
      }
    }
  }
  
  private void zzir()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNV;
      if (!bool)
      {
        zzis localzzis = zzr.zzbE();
        localzzis.zzn(this);
      }
      bool = true;
      this.zzNV = bool;
      return;
    }
  }
  
  private void zzis()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNV;
      if (bool)
      {
        localzzis = zzr.zzbE();
        localzzis.zzm(this);
      }
      bool = false;
      zzis localzzis = null;
      this.zzNV = false;
      return;
    }
  }
  
  private void zzit()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzOe;
      if (localObject2 != null)
      {
        localObject2 = this.zzOe;
        localObject2 = ((Map)localObject2).values();
        Iterator localIterator = ((Collection)localObject2).iterator();
        boolean bool = localIterator.hasNext();
        if (bool)
        {
          localObject2 = localIterator.next();
          localObject2 = (zzdr)localObject2;
          ((zzdr)localObject2).release();
        }
      }
    }
  }
  
  private void zziu()
  {
    Object localObject = this.zzOb;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = this.zzOb.zzdA();
      if (localObject != null)
      {
        zzbv localzzbv = zzr.zzbF().zzhb();
        if (localzzbv != null)
        {
          localzzbv = zzr.zzbF().zzhb();
          localzzbv.zza((zzcb)localObject);
        }
      }
    }
  }
  
  public void destroy()
  {
    synchronized (this.zzpV)
    {
      zziu();
      Object localObject2 = this.zzrV;
      ((zzjc)localObject2).zzhF();
      localObject2 = this.zzNR;
      if (localObject2 != null)
      {
        localObject2 = this.zzNR;
        ((com.google.android.gms.ads.internal.overlay.zzd)localObject2).close();
        localObject2 = this.zzNR;
        ((com.google.android.gms.ads.internal.overlay.zzd)localObject2).onDestroy();
        bool = false;
        localObject2 = null;
        this.zzNR = null;
      }
      localObject2 = this.zzNQ;
      ((zzjq)localObject2).reset();
      boolean bool = this.zzNT;
      if (bool) {
        return;
      }
      localObject2 = zzr.zzbR();
      ((zzdq)localObject2).zzd(this);
      zzit();
      bool = true;
      this.zzNT = bool;
      localObject2 = "Initiating WebView self destruct sequence in 3...";
      zzin.v((String)localObject2);
      localObject2 = this.zzNQ;
      ((zzjq)localObject2).zzii();
    }
  }
  
  public void evaluateJavascript(String paramString, ValueCallback paramValueCallback)
  {
    synchronized (this.zzpV)
    {
      boolean bool = isDestroyed();
      if (bool)
      {
        String str = "The webview is destroyed. Ignoring action.";
        zzin.zzaK(str);
        if (paramValueCallback != null)
        {
          bool = false;
          str = null;
          paramValueCallback.onReceiveValue(null);
        }
        return;
      }
      super.evaluateJavascript(paramString, paramValueCallback);
    }
  }
  
  protected void finalize()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNT;
      if (!bool)
      {
        zzdq localzzdq = zzr.zzbR();
        localzzdq.zzd(this);
        zzit();
      }
      super.finalize();
      return;
    }
  }
  
  public String getRequestId()
  {
    synchronized (this.zzpV)
    {
      String str = this.zzEY;
      return str;
    }
  }
  
  public int getRequestedOrientation()
  {
    synchronized (this.zzpV)
    {
      int i = this.zzNW;
      return i;
    }
  }
  
  public View getView()
  {
    return this;
  }
  
  public WebView getWebView()
  {
    return this;
  }
  
  public boolean isDestroyed()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNT;
      return bool;
    }
  }
  
  public void loadData(String paramString1, String paramString2, String paramString3)
  {
    synchronized (this.zzpV)
    {
      boolean bool = isDestroyed();
      if (!bool)
      {
        super.loadData(paramString1, paramString2, paramString3);
        return;
      }
      String str = "The webview is destroyed. Ignoring action.";
      zzin.zzaK(str);
    }
  }
  
  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    synchronized (this.zzpV)
    {
      boolean bool = isDestroyed();
      if (!bool)
      {
        super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
        return;
      }
      String str = "The webview is destroyed. Ignoring action.";
      zzin.zzaK(str);
    }
  }
  
  public void loadUrl(String paramString)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        boolean bool = isDestroyed();
        if (!bool) {
          try
          {
            super.loadUrl(paramString);
            return;
          }
          finally
          {
            localObject2 = finally;
            StringBuilder localStringBuilder = new java/lang/StringBuilder;
            localStringBuilder.<init>();
            String str2 = "Could not call loadUrl. ";
            localStringBuilder = localStringBuilder.append(str2);
            Object localObject3 = localStringBuilder.append(localObject2);
            localObject3 = ((StringBuilder)localObject3).toString();
            zzin.zzaK((String)localObject3);
            continue;
          }
        }
      }
      String str1 = "The webview is destroyed. Ignoring action.";
      zzin.zzaK(str1);
    }
  }
  
  protected void onAttachedToWindow()
  {
    synchronized (this.zzpV)
    {
      super.onAttachedToWindow();
      boolean bool = isDestroyed();
      if (!bool)
      {
        zzjc localzzjc = this.zzrV;
        localzzjc.onAttachedToWindow();
      }
      return;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    synchronized (this.zzpV)
    {
      boolean bool = isDestroyed();
      if (!bool)
      {
        zzjc localzzjc = this.zzrV;
        localzzjc.onDetachedFromWindow();
      }
      super.onDetachedFromWindow();
      return;
    }
  }
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    try
    {
      Intent localIntent = new android/content/Intent;
      localObject2 = "android.intent.action.VIEW";
      localIntent.<init>((String)localObject2);
      localObject2 = Uri.parse(paramString1);
      localIntent.setDataAndType((Uri)localObject2, paramString4);
      localObject2 = zzr.zzbC();
      Context localContext = getContext();
      ((zzir)localObject2).zzb(localContext, localIntent);
      return;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
      for (;;)
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Couldn't find an Activity to view url/mimetype: ").append(paramString1);
        Object localObject2 = " / ";
        localObject1 = (String)localObject2 + paramString4;
        zzin.zzaI((String)localObject1);
      }
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    boolean bool1 = isDestroyed();
    if (bool1) {}
    for (;;)
    {
      return;
      int i = Build.VERSION.SDK_INT;
      int j = 21;
      if (i == j)
      {
        boolean bool2 = paramCanvas.isHardwareAccelerated();
        if (bool2)
        {
          bool2 = isAttachedToWindow();
          if (!bool2) {
            continue;
          }
        }
      }
      super.onDraw(paramCanvas);
    }
  }
  
  public void onGlobalLayout()
  {
    boolean bool = zzin();
    com.google.android.gms.ads.internal.overlay.zzd localzzd = zzhS();
    if ((localzzd != null) && (bool)) {
      localzzd.zzfq();
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = -1 >>> 1;
    float f1 = 0.0F / 0.0F;
    int j = 1073741824;
    int k = 8;
    int m = -1 << -1;
    float f2;
    Object localObject5;
    label148:
    Object localObject4;
    for (;;)
    {
      synchronized (this.zzpV)
      {
        bool = isDestroyed();
        if (bool)
        {
          i = 0;
          f1 = 0.0F;
          Object localObject2 = null;
          bool = false;
          f2 = 0.0F;
          localObject5 = null;
          setMeasuredDimension(0, 0);
          return;
        }
        bool = isInEditMode();
        if (!bool)
        {
          bool = this.zzNU;
          if (!bool)
          {
            localObject5 = this.zzCh;
            bool = ((AdSizeParcel)localObject5).zzuk;
            if (!bool)
            {
              localObject5 = this.zzCh;
              bool = ((AdSizeParcel)localObject5).zzul;
              if (!bool) {
                break label148;
              }
            }
          }
        }
        super.onMeasure(paramInt1, paramInt2);
      }
      localObject5 = this.zzCh;
      boolean bool = ((AdSizeParcel)localObject5).zzui;
      if (!bool) {
        break;
      }
      localObject4 = new android/util/DisplayMetrics;
      ((DisplayMetrics)localObject4).<init>();
      localObject5 = this.zzsb;
      localObject5 = ((WindowManager)localObject5).getDefaultDisplay();
      ((Display)localObject5).getMetrics((DisplayMetrics)localObject4);
      n = ((DisplayMetrics)localObject4).widthPixels;
      i = ((DisplayMetrics)localObject4).heightPixels;
      setMeasuredDimension(n, i);
    }
    int i1 = View.MeasureSpec.getMode(paramInt1);
    int i2 = View.MeasureSpec.getSize(paramInt1);
    int i3 = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    if ((i1 == m) || (i1 == j)) {}
    for (i1 = i2;; i1 = i)
    {
      if ((i3 == m) || (i3 == j)) {
        i = n;
      }
      Object localObject6 = this.zzCh;
      i3 = ((AdSizeParcel)localObject6).widthPixels;
      Object localObject7;
      if (i3 <= i1)
      {
        localObject7 = this.zzCh;
        i1 = ((AdSizeParcel)localObject7).heightPixels;
        if (i1 <= i) {}
      }
      else
      {
        localObject4 = this.zzNP;
        localObject4 = ((zzjt.zza)localObject4).getResources();
        localObject4 = ((Resources)localObject4).getDisplayMetrics();
        f1 = ((DisplayMetrics)localObject4).density;
        localObject7 = new java/lang/StringBuilder;
        ((StringBuilder)localObject7).<init>();
        localObject6 = "Not enough space to show ad. Needs ";
        localObject7 = ((StringBuilder)localObject7).append((String)localObject6);
        localObject6 = this.zzCh;
        float f3 = ((AdSizeParcel)localObject6).widthPixels / f1;
        i3 = (int)f3;
        localObject7 = ((StringBuilder)localObject7).append(i3);
        localObject6 = "x";
        localObject7 = ((StringBuilder)localObject7).append((String)localObject6);
        localObject6 = this.zzCh;
        f3 = ((AdSizeParcel)localObject6).heightPixels / f1;
        i3 = (int)f3;
        localObject7 = ((StringBuilder)localObject7).append(i3);
        localObject6 = " dp, but only has ";
        localObject7 = ((StringBuilder)localObject7).append((String)localObject6);
        float f4 = i2 / f1;
        i2 = (int)f4;
        localObject7 = ((StringBuilder)localObject7).append(i2);
        String str = "x";
        localObject7 = ((StringBuilder)localObject7).append(str);
        f2 = n;
        f1 = f2 / f1;
        i = (int)f1;
        localObject4 = ((StringBuilder)localObject7).append(i);
        localObject5 = " dp.";
        localObject4 = ((StringBuilder)localObject4).append((String)localObject5);
        localObject4 = ((StringBuilder)localObject4).toString();
        zzin.zzaK((String)localObject4);
        i = getVisibility();
        if (i != k)
        {
          i = 4;
          f1 = 5.6E-45F;
          setVisibility(i);
        }
        i = 0;
        f1 = 0.0F;
        localObject4 = null;
        n = 0;
        f2 = 0.0F;
        localObject5 = null;
        setMeasuredDimension(0, 0);
      }
      for (;;)
      {
        break;
        i = getVisibility();
        if (i != k)
        {
          i = 0;
          f1 = 0.0F;
          localObject4 = null;
          setVisibility(0);
        }
        localObject4 = this.zzCh;
        i = ((AdSizeParcel)localObject4).widthPixels;
        localObject5 = this.zzCh;
        n = ((AdSizeParcel)localObject5).heightPixels;
        setMeasuredDimension(i, n);
      }
    }
  }
  
  public void onPause()
  {
    boolean bool = isDestroyed();
    if (bool) {}
    for (;;)
    {
      return;
      try
      {
        bool = zzne.zzsd();
        if (bool) {
          super.onPause();
        }
      }
      catch (Exception localException)
      {
        String str = "Could not pause webview.";
        zzin.zzb(str, localException);
      }
    }
  }
  
  public void onResume()
  {
    boolean bool = isDestroyed();
    if (bool) {}
    for (;;)
    {
      return;
      try
      {
        bool = zzne.zzsd();
        if (bool) {
          super.onResume();
        }
      }
      catch (Exception localException)
      {
        String str = "Could not resume webview.";
        zzin.zzb(str, localException);
      }
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    zzan localzzan = this.zzyt;
    if (localzzan != null)
    {
      localzzan = this.zzyt;
      localzzan.zza(paramMotionEvent);
    }
    boolean bool = isDestroyed();
    if (bool)
    {
      bool = false;
      localzzan = null;
    }
    for (;;)
    {
      return bool;
      bool = super.onTouchEvent(paramMotionEvent);
    }
  }
  
  public void setContext(Context paramContext)
  {
    this.zzNP.setBaseContext(paramContext);
    zzjc localzzjc = this.zzrV;
    Activity localActivity = this.zzNP.zzhP();
    localzzjc.zzi(localActivity);
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnClickListener);
    this.zzOc = localWeakReference;
    super.setOnClickListener(paramOnClickListener);
  }
  
  public void setRequestedOrientation(int paramInt)
  {
    synchronized (this.zzpV)
    {
      this.zzNW = paramInt;
      com.google.android.gms.ads.internal.overlay.zzd localzzd = this.zzNR;
      if (localzzd != null)
      {
        localzzd = this.zzNR;
        int i = this.zzNW;
        localzzd.setRequestedOrientation(i);
      }
      return;
    }
  }
  
  public void setWebViewClient(WebViewClient paramWebViewClient)
  {
    super.setWebViewClient(paramWebViewClient);
    boolean bool = paramWebViewClient instanceof zzjq;
    if (bool)
    {
      paramWebViewClient = (zzjq)paramWebViewClient;
      this.zzNQ = paramWebViewClient;
    }
  }
  
  public void stopLoading()
  {
    boolean bool = isDestroyed();
    if (bool) {}
    for (;;)
    {
      return;
      try
      {
        super.stopLoading();
      }
      catch (Exception localException)
      {
        String str = "Could not stop loading webview.";
        zzin.zzb(str, localException);
      }
    }
  }
  
  public void zzD(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzNU = paramBoolean;
      zziq();
      return;
    }
  }
  
  public void zzE(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      com.google.android.gms.ads.internal.overlay.zzd localzzd = this.zzNR;
      if (localzzd != null)
      {
        localzzd = this.zzNR;
        zzjq localzzjq = this.zzNQ;
        boolean bool = localzzjq.zzcv();
        localzzd.zza(bool, paramBoolean);
        return;
      }
      this.zzNS = paramBoolean;
    }
  }
  
  public void zzF(boolean paramBoolean)
  {
    synchronized (this.zzpV)
    {
      this.zzNX = paramBoolean;
      return;
    }
  }
  
  public void zza(Context paramContext, AdSizeParcel paramAdSizeParcel, zzcb paramzzcb)
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzrV;
      ((zzjc)localObject2).zzhF();
      setContext(paramContext);
      int i = 0;
      localObject2 = null;
      this.zzNR = null;
      this.zzCh = paramAdSizeParcel;
      i = 0;
      localObject2 = null;
      this.zzNU = false;
      i = 0;
      localObject2 = null;
      this.zzNS = false;
      localObject2 = "";
      this.zzEY = ((String)localObject2);
      i = -1;
      this.zzNW = i;
      localObject2 = zzr.zzbE();
      ((zzis)localObject2).zzj(this);
      localObject2 = "about:blank";
      loadUrl((String)localObject2);
      localObject2 = this.zzNQ;
      ((zzjq)localObject2).reset();
      i = 0;
      localObject2 = null;
      setOnTouchListener(null);
      i = 0;
      localObject2 = null;
      setOnClickListener(null);
      i = 1;
      this.zzNX = i;
      zzd(paramzzcb);
      return;
    }
  }
  
  public void zza(AdSizeParcel paramAdSizeParcel)
  {
    synchronized (this.zzpV)
    {
      this.zzCh = paramAdSizeParcel;
      requestLayout();
      return;
    }
  }
  
  public void zza(zzau paramzzau, boolean paramBoolean)
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    String str1 = "isVisible";
    if (paramBoolean) {}
    for (String str2 = "1";; str2 = "0")
    {
      localHashMap.put(str1, str2);
      zza("onAdVisibilityChanged", localHashMap);
      return;
    }
  }
  
  protected void zza(String paramString, ValueCallback paramValueCallback)
  {
    synchronized (this.zzpV)
    {
      boolean bool = isDestroyed();
      if (!bool) {
        evaluateJavascript(paramString, paramValueCallback);
      }
      do
      {
        return;
        str = "The webview is destroyed. Ignoring action.";
        zzin.zzaK(str);
      } while (paramValueCallback == null);
      bool = false;
      String str = null;
      paramValueCallback.onReceiveValue(null);
    }
  }
  
  public void zza(String paramString, zzdf paramzzdf)
  {
    zzjq localzzjq = this.zzNQ;
    if (localzzjq != null)
    {
      localzzjq = this.zzNQ;
      localzzjq.zza(paramString, paramzzdf);
    }
  }
  
  public void zza(String paramString, Map paramMap)
  {
    try
    {
      Object localObject = zzr.zzbC();
      localObject = ((zzir)localObject).zzG(paramMap);
      zzb(paramString, (JSONObject)localObject);
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        String str = "Could not convert parameters to JSON.";
        zzin.zzaK(str);
      }
    }
  }
  
  public void zza(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
    }
    String str = paramJSONObject.toString();
    zze(paramString, str);
  }
  
  /* Error */
  public void zzaL(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 69	com/google/android/gms/internal/zzjt:zzpV	Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: aload_1
    //   9: invokespecial 445	android/webkit/WebView:loadUrl	(Ljava/lang/String;)V
    //   12: aload_2
    //   13: monitorexit
    //   14: return
    //   15: astore_3
    //   16: new 447	java/lang/StringBuilder
    //   19: astore 4
    //   21: aload 4
    //   23: invokespecial 448	java/lang/StringBuilder:<init>	()V
    //   26: ldc_w 450
    //   29: astore 5
    //   31: aload 4
    //   33: aload 5
    //   35: invokevirtual 454	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: astore 4
    //   40: aload 4
    //   42: aload_3
    //   43: invokevirtual 457	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   46: astore_3
    //   47: aload_3
    //   48: invokevirtual 461	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   51: astore_3
    //   52: aload_3
    //   53: invokestatic 424	com/google/android/gms/internal/zzin:zzaK	(Ljava/lang/String;)V
    //   56: goto -44 -> 12
    //   59: astore_3
    //   60: aload_2
    //   61: monitorexit
    //   62: aload_3
    //   63: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	64	0	this	zzjt
    //   0	64	1	paramString	String
    //   4	57	2	localObject1	Object
    //   15	28	3	localObject2	Object
    //   46	7	3	localObject3	Object
    //   59	4	3	localObject4	Object
    //   19	22	4	localStringBuilder	StringBuilder
    //   29	5	5	str	String
    // Exception table:
    //   from	to	target	type
    //   8	12	15	finally
    //   12	14	59	finally
    //   16	19	59	finally
    //   21	26	59	finally
    //   33	38	59	finally
    //   42	46	59	finally
    //   47	51	59	finally
    //   52	56	59	finally
    //   60	62	59	finally
  }
  
  public void zzaM(String paramString)
  {
    Object localObject1 = this.zzpV;
    if (paramString == null) {
      paramString = "";
    }
    try
    {
      this.zzEY = paramString;
      return;
    }
    finally {}
  }
  
  public AdSizeParcel zzaN()
  {
    synchronized (this.zzpV)
    {
      AdSizeParcel localAdSizeParcel = this.zzCh;
      return localAdSizeParcel;
    }
  }
  
  protected void zzaO(String paramString)
  {
    synchronized (this.zzpV)
    {
      boolean bool = isDestroyed();
      if (!bool)
      {
        loadUrl(paramString);
        return;
      }
      String str = "The webview is destroyed. Ignoring action.";
      zzin.zzaK(str);
    }
  }
  
  protected void zzaP(String paramString)
  {
    boolean bool = zzne.zzsk();
    Object localObject;
    if (bool)
    {
      localObject = zzhg();
      if (localObject == null) {
        zzio();
      }
      localObject = zzhg();
      bool = ((Boolean)localObject).booleanValue();
      if (bool)
      {
        bool = false;
        localObject = null;
        zza(paramString, null);
      }
    }
    for (;;)
    {
      return;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      String str = "javascript:";
      localObject = str + paramString;
      zzaO((String)localObject);
      continue;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      str = "javascript:";
      localObject = str + paramString;
      zzaO((String)localObject);
    }
  }
  
  public void zzb(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      this.zzNR = paramzzd;
      return;
    }
  }
  
  void zzb(Boolean paramBoolean)
  {
    this.zzLB = paramBoolean;
    zzr.zzbF().zzb(paramBoolean);
  }
  
  public void zzb(String paramString, zzdf paramzzdf)
  {
    zzjq localzzjq = this.zzNQ;
    if (localzzjq != null)
    {
      localzzjq = this.zzNQ;
      localzzjq.zzb(paramString, paramzzdf);
    }
  }
  
  public void zzb(String paramString, JSONObject paramJSONObject)
  {
    if (paramJSONObject == null)
    {
      paramJSONObject = new org/json/JSONObject;
      paramJSONObject.<init>();
    }
    Object localObject = paramJSONObject.toString();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("AFMA_ReceiveMessage('");
    localStringBuilder.append(paramString);
    localStringBuilder.append("'");
    localStringBuilder.append(",");
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(");");
    localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = ((StringBuilder)localObject).append("Dispatching AFMA event: ");
    String str = localStringBuilder.toString();
    zzin.v(str);
    localObject = localStringBuilder.toString();
    zzaP((String)localObject);
  }
  
  public void zzc(com.google.android.gms.ads.internal.overlay.zzd paramzzd)
  {
    synchronized (this.zzpV)
    {
      this.zzOd = paramzzd;
      return;
    }
  }
  
  public void zze(String paramString1, String paramString2)
  {
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    localObject = paramString1 + "(" + paramString2 + ");";
    zzaP((String)localObject);
  }
  
  public boolean zzfL()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzOb;
      localObject2 = ((zzca)localObject2).zzdA();
      zzbz localzzbz = this.zzNY;
      int i = 1;
      String[] arrayOfString = new String[i];
      String str = "aebb";
      arrayOfString[0] = str;
      zzbx.zza((zzcb)localObject2, localzzbz, arrayOfString);
      boolean bool = this.zzNX;
      return bool;
    }
  }
  
  public void zzfr()
  {
    int i = 1;
    Object localObject1 = this.zzNY;
    if (localObject1 == null)
    {
      localObject1 = this.zzOb.zzdA();
      Object localObject2 = this.zzOa;
      localObject3 = new String[i];
      String str = "aes";
      localObject3[0] = str;
      zzbx.zza((zzcb)localObject1, (zzbz)localObject2, (String[])localObject3);
      localObject1 = zzbx.zzb(this.zzOb.zzdA());
      this.zzNY = ((zzbz)localObject1);
      localObject1 = this.zzOb;
      localObject2 = "native:view_show";
      localObject3 = this.zzNY;
      ((zzca)localObject1).zza((String)localObject2, (zzbz)localObject3);
    }
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>(i);
    Object localObject3 = this.zzpT.afmaVersion;
    ((HashMap)localObject1).put("version", localObject3);
    zza("onshow", (Map)localObject1);
  }
  
  public void zzhN()
  {
    zzip();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(1);
    String str = this.zzpT.afmaVersion;
    localHashMap.put("version", str);
    zza("onhide", localHashMap);
  }
  
  public void zzhO()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(2);
    Object localObject = String.valueOf(zzr.zzbC().zzbt());
    localHashMap.put("app_volume", localObject);
    localObject = zzr.zzbC();
    Context localContext = getContext();
    localObject = String.valueOf(((zzir)localObject).zzQ(localContext));
    localHashMap.put("device_volume", localObject);
    zza("volume", localHashMap);
  }
  
  public Activity zzhP()
  {
    return this.zzNP.zzhP();
  }
  
  public Context zzhQ()
  {
    return this.zzNP.zzhQ();
  }
  
  public com.google.android.gms.ads.internal.zzd zzhR()
  {
    return this.zzpm;
  }
  
  public com.google.android.gms.ads.internal.overlay.zzd zzhS()
  {
    synchronized (this.zzpV)
    {
      com.google.android.gms.ads.internal.overlay.zzd localzzd = this.zzNR;
      return localzzd;
    }
  }
  
  public com.google.android.gms.ads.internal.overlay.zzd zzhT()
  {
    synchronized (this.zzpV)
    {
      com.google.android.gms.ads.internal.overlay.zzd localzzd = this.zzOd;
      return localzzd;
    }
  }
  
  public zzjq zzhU()
  {
    return this.zzNQ;
  }
  
  public boolean zzhV()
  {
    return this.zzNS;
  }
  
  public zzan zzhW()
  {
    return this.zzyt;
  }
  
  public VersionInfoParcel zzhX()
  {
    return this.zzpT;
  }
  
  public boolean zzhY()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzNU;
      return bool;
    }
  }
  
  public void zzhZ()
  {
    Object localObject1 = this.zzpV;
    Object localObject2 = "Destroying WebView!";
    try
    {
      zzin.v((String)localObject2);
      localObject2 = zzir.zzMc;
      zzjt.1 local1 = new com/google/android/gms/internal/zzjt$1;
      local1.<init>(this);
      ((Handler)localObject2).post(local1);
      return;
    }
    finally {}
  }
  
  Boolean zzhg()
  {
    synchronized (this.zzpV)
    {
      Boolean localBoolean = this.zzLB;
      return localBoolean;
    }
  }
  
  public zzjo zzia()
  {
    return null;
  }
  
  public zzbz zzib()
  {
    return this.zzOa;
  }
  
  public zzca zzic()
  {
    return this.zzOb;
  }
  
  public void zzid()
  {
    this.zzrV.zzhE();
  }
  
  public void zzie()
  {
    Object localObject = this.zzOa;
    if (localObject == null)
    {
      localObject = zzbx.zzb(this.zzOb.zzdA());
      this.zzOa = ((zzbz)localObject);
      localObject = this.zzOb;
      String str = "native:view_load";
      zzbz localzzbz = this.zzOa;
      ((zzca)localObject).zza(str, localzzbz);
    }
  }
  
  public View.OnClickListener zzif()
  {
    return (View.OnClickListener)this.zzOc.get();
  }
  
  public boolean zzin()
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    boolean bool1 = false;
    zzfs localzzfs = null;
    Object localObject1 = zzhU();
    boolean bool2 = ((zzjq)localObject1).zzcv();
    if (!bool2) {}
    Object localObject3;
    int k;
    int j;
    int m;
    Object localObject4;
    Object localObject5;
    int n;
    label127:
    do
    {
      return bool1;
      localObject1 = zzr.zzbC();
      Object localObject2 = this.zzsb;
      localObject3 = ((zzir)localObject1).zza((WindowManager)localObject2);
      localObject1 = zzn.zzcS();
      k = ((DisplayMetrics)localObject3).widthPixels;
      j = ((zza)localObject1).zzb((DisplayMetrics)localObject3, k);
      localObject2 = zzn.zzcS();
      m = ((DisplayMetrics)localObject3).heightPixels;
      k = ((zza)localObject2).zzb((DisplayMetrics)localObject3, m);
      localObject4 = zzhP();
      if (localObject4 != null)
      {
        localObject5 = ((Activity)localObject4).getWindow();
        if (localObject5 != null) {
          break label289;
        }
      }
      n = k;
      m = j;
      i1 = this.zzDC;
      if (i1 != j) {
        break;
      }
      i1 = this.zzDD;
      if (i1 != k) {
        break;
      }
      i1 = this.zzDF;
      if (i1 != m) {
        break;
      }
      i1 = this.zzDG;
    } while (i1 == n);
    int i1 = this.zzDC;
    if (i1 == j)
    {
      i1 = this.zzDD;
      if (i1 == k) {}
    }
    else
    {
      i1 = i;
    }
    for (;;)
    {
      this.zzDC = j;
      this.zzDD = k;
      this.zzDF = m;
      this.zzDG = n;
      localzzfs = new com/google/android/gms/internal/zzfs;
      localzzfs.<init>(this);
      f = ((DisplayMetrics)localObject3).density;
      localObject3 = this.zzsb.getDefaultDisplay();
      int i2 = ((Display)localObject3).getRotation();
      localzzfs.zza(j, k, m, n, f, i2);
      bool1 = i1;
      break;
      label289:
      localObject5 = zzr.zzbC().zze((Activity)localObject4);
      localObject4 = zzn.zzcS();
      i1 = localObject5[0];
      m = ((zza)localObject4).zzb((DisplayMetrics)localObject3, i1);
      zza localzza = zzn.zzcS();
      n = localObject5[i];
      n = localzza.zzb((DisplayMetrics)localObject3, n);
      break label127;
      i1 = 0;
      localzza = null;
    }
  }
  
  public void zzy(int paramInt)
  {
    zzip();
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>(2);
    String str = String.valueOf(paramInt);
    localHashMap.put("closetype", str);
    str = this.zzpT.afmaVersion;
    localHashMap.put("version", str);
    zza("onhide", localHashMap);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */