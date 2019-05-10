package com.google.android.gms.internal;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class zzau
  implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener
{
  protected final Object zzpV;
  private boolean zzqJ;
  private zziz zzrQ;
  private final WeakReference zzrW;
  private WeakReference zzrX;
  private final zzbb zzrY;
  protected final zzaw zzrZ;
  private final Context zzsa;
  private final WindowManager zzsb;
  private final PowerManager zzsc;
  private final KeyguardManager zzsd;
  private zzay zzse;
  private boolean zzsf;
  private boolean zzsg;
  private boolean zzsh;
  private boolean zzsi;
  private boolean zzsj;
  BroadcastReceiver zzsk;
  private final HashSet zzsl;
  private final zzdf zzsm;
  private final zzdf zzsn;
  private final zzdf zzso;
  
  public zzau(Context paramContext, AdSizeParcel paramAdSizeParcel, zzif paramzzif, VersionInfoParcel paramVersionInfoParcel, zzbb paramzzbb)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzpV = localObject;
    this.zzqJ = false;
    this.zzsg = false;
    localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.zzsl = ((HashSet)localObject);
    localObject = new com/google/android/gms/internal/zzau$2;
    ((zzau.2)localObject).<init>(this);
    this.zzsm = ((zzdf)localObject);
    localObject = new com/google/android/gms/internal/zzau$3;
    ((zzau.3)localObject).<init>(this);
    this.zzsn = ((zzdf)localObject);
    localObject = new com/google/android/gms/internal/zzau$4;
    ((zzau.4)localObject).<init>(this);
    this.zzso = ((zzdf)localObject);
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(paramzzif);
    this.zzrW = ((WeakReference)localObject);
    this.zzrY = paramzzbb;
    localObject = new java/lang/ref/WeakReference;
    ((WeakReference)localObject).<init>(null);
    this.zzrX = ((WeakReference)localObject);
    this.zzsh = true;
    this.zzsj = false;
    localObject = new com/google/android/gms/internal/zziz;
    ((zziz)localObject).<init>(200L);
    this.zzrQ = ((zziz)localObject);
    localObject = new com/google/android/gms/internal/zzaw;
    String str1 = UUID.randomUUID().toString();
    String str2 = paramAdSizeParcel.zzuh;
    JSONObject localJSONObject = paramzzif.zzKT;
    boolean bool1 = paramzzif.zzcv();
    boolean bool2 = paramAdSizeParcel.zzuk;
    ((zzaw)localObject).<init>(str1, paramVersionInfoParcel, str2, localJSONObject, bool1, bool2);
    this.zzrZ = ((zzaw)localObject);
    localObject = (WindowManager)paramContext.getSystemService("window");
    this.zzsb = ((WindowManager)localObject);
    localObject = (PowerManager)paramContext.getApplicationContext().getSystemService("power");
    this.zzsc = ((PowerManager)localObject);
    localObject = (KeyguardManager)paramContext.getSystemService("keyguard");
    this.zzsd = ((KeyguardManager)localObject);
    this.zzsa = paramContext;
  }
  
  protected void destroy()
  {
    synchronized (this.zzpV)
    {
      zzcj();
      zzce();
      Object localObject2 = null;
      this.zzsh = false;
      zzcg();
      return;
    }
  }
  
  boolean isScreenOn()
  {
    return this.zzsc.isScreenOn();
  }
  
  public void onGlobalLayout()
  {
    zzh(false);
  }
  
  public void onScrollChanged()
  {
    zzh(true);
  }
  
  public void pause()
  {
    Object localObject1 = this.zzpV;
    boolean bool = true;
    try
    {
      this.zzqJ = bool;
      bool = false;
      Object localObject2 = null;
      zzh(false);
      return;
    }
    finally {}
  }
  
  public void resume()
  {
    Object localObject1 = this.zzpV;
    Object localObject2 = null;
    try
    {
      this.zzqJ = false;
      localObject2 = null;
      zzh(false);
      return;
    }
    finally {}
  }
  
  public void stop()
  {
    Object localObject1 = this.zzpV;
    boolean bool = true;
    try
    {
      this.zzsg = bool;
      bool = false;
      Object localObject2 = null;
      zzh(false);
      return;
    }
    finally {}
  }
  
  protected int zza(int paramInt, DisplayMetrics paramDisplayMetrics)
  {
    float f = paramDisplayMetrics.density;
    return (int)(paramInt / f);
  }
  
  protected void zza(View paramView, Map paramMap)
  {
    zzh(false);
  }
  
  public void zza(zzav paramzzav)
  {
    this.zzsl.add(paramzzav);
  }
  
  public void zza(zzay paramzzay)
  {
    synchronized (this.zzpV)
    {
      this.zzse = paramzzay;
      return;
    }
  }
  
  protected void zza(JSONObject paramJSONObject)
  {
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>();
      localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>();
      localJSONArray.put(paramJSONObject);
      String str = "units";
      ((JSONObject)localObject).put(str, localJSONArray);
      zzb((JSONObject)localObject);
      return;
    }
    finally
    {
      for (;;)
      {
        Object localObject = "Skipping active view message.";
        zzin.zzb((String)localObject, localThrowable);
      }
    }
  }
  
  protected void zzb(zzeh paramzzeh)
  {
    zzdf localzzdf = this.zzsm;
    paramzzeh.zza("/updateActiveView", localzzdf);
    localzzdf = this.zzsn;
    paramzzeh.zza("/untrackActiveViewUnit", localzzdf);
    localzzdf = this.zzso;
    paramzzeh.zza("/visibilityChanged", localzzdf);
  }
  
  protected abstract void zzb(JSONObject paramJSONObject);
  
  protected boolean zzb(Map paramMap)
  {
    boolean bool1 = false;
    if (paramMap == null) {
      return bool1;
    }
    String str1 = (String)paramMap.get("hashCode");
    boolean bool2 = TextUtils.isEmpty(str1);
    boolean bool3;
    if (!bool2)
    {
      String str2 = this.zzrZ.zzcu();
      bool3 = str1.equals(str2);
      if (bool3) {
        bool3 = true;
      }
    }
    for (;;)
    {
      bool1 = bool3;
      break;
      bool3 = false;
      str1 = null;
    }
  }
  
  protected void zzc(zzeh paramzzeh)
  {
    zzdf localzzdf = this.zzso;
    paramzzeh.zzb("/visibilityChanged", localzzdf);
    localzzdf = this.zzsn;
    paramzzeh.zzb("/untrackActiveViewUnit", localzzdf);
    localzzdf = this.zzsm;
    paramzzeh.zzb("/updateActiveView", localzzdf);
  }
  
  protected void zzcd()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsk;
      if (localObject2 != null) {
        return;
      }
      localObject2 = new android/content/IntentFilter;
      ((IntentFilter)localObject2).<init>();
      Object localObject4 = "android.intent.action.SCREEN_ON";
      ((IntentFilter)localObject2).addAction((String)localObject4);
      localObject4 = "android.intent.action.SCREEN_OFF";
      ((IntentFilter)localObject2).addAction((String)localObject4);
      localObject4 = new com/google/android/gms/internal/zzau$1;
      ((zzau.1)localObject4).<init>(this);
      this.zzsk = ((BroadcastReceiver)localObject4);
      localObject4 = this.zzsa;
      BroadcastReceiver localBroadcastReceiver = this.zzsk;
      ((Context)localObject4).registerReceiver(localBroadcastReceiver, (IntentFilter)localObject2);
    }
  }
  
  protected void zzce()
  {
    synchronized (this.zzpV)
    {
      Object localObject2 = this.zzsk;
      if (localObject2 != null) {}
      try
      {
        localObject2 = this.zzsa;
        localObject4 = this.zzsk;
        ((Context)localObject2).unregisterReceiver((BroadcastReceiver)localObject4);
      }
      catch (IllegalStateException localIllegalStateException)
      {
        for (;;)
        {
          localObject4 = "Failed trying to unregister the receiver";
          zzin.zzb((String)localObject4, localIllegalStateException);
        }
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject4 = zzr.zzbF();
          boolean bool = true;
          ((zzih)localObject4).zzb(localException, bool);
        }
      }
      localObject2 = null;
      this.zzsk = null;
      return;
    }
  }
  
  public void zzcf()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzsh;
      if (bool)
      {
        bool = true;
        this.zzsi = bool;
      }
      try
      {
        localObject2 = zzcn();
        zza((JSONObject)localObject2);
      }
      catch (JSONException localJSONException)
      {
        for (;;)
        {
          Object localObject2;
          localObject4 = "JSON failure while processing active view data.";
          zzin.zzb((String)localObject4, localJSONException);
        }
        localObject3 = finally;
        throw ((Throwable)localObject3);
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          Object localObject4 = "Failure while processing active view data.";
          zzin.zzb((String)localObject4, localRuntimeException);
        }
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject4 = "Untracking ad unit: ";
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject4 = this.zzrZ;
      localObject4 = ((zzaw)localObject4).zzcu();
      localObject2 = ((StringBuilder)localObject2).append((String)localObject4);
      localObject2 = ((StringBuilder)localObject2).toString();
      zzin.zzaI((String)localObject2);
      return;
    }
  }
  
  protected void zzcg()
  {
    zzay localzzay = this.zzse;
    if (localzzay != null)
    {
      localzzay = this.zzse;
      localzzay.zza(this);
    }
  }
  
  public boolean zzch()
  {
    synchronized (this.zzpV)
    {
      boolean bool = this.zzsh;
      return bool;
    }
  }
  
  protected void zzci()
  {
    Object localObject1 = this.zzrY.zzcq();
    Object localObject2 = ((zzbb)localObject1).zzco();
    if (localObject2 == null) {}
    for (;;)
    {
      return;
      localObject1 = (ViewTreeObserver)this.zzrX.get();
      localObject2 = ((View)localObject2).getViewTreeObserver();
      if (localObject2 != localObject1)
      {
        zzcj();
        boolean bool1 = this.zzsf;
        boolean bool2;
        if (bool1)
        {
          if (localObject1 != null)
          {
            bool2 = ((ViewTreeObserver)localObject1).isAlive();
            if (!bool2) {}
          }
        }
        else
        {
          bool2 = true;
          this.zzsf = bool2;
          ((ViewTreeObserver)localObject2).addOnScrollChangedListener(this);
          ((ViewTreeObserver)localObject2).addOnGlobalLayoutListener(this);
        }
        localObject1 = new java/lang/ref/WeakReference;
        ((WeakReference)localObject1).<init>(localObject2);
        this.zzrX = ((WeakReference)localObject1);
      }
    }
  }
  
  protected void zzcj()
  {
    ViewTreeObserver localViewTreeObserver = (ViewTreeObserver)this.zzrX.get();
    if (localViewTreeObserver != null)
    {
      boolean bool = localViewTreeObserver.isAlive();
      if (bool) {
        break label25;
      }
    }
    for (;;)
    {
      return;
      label25:
      localViewTreeObserver.removeOnScrollChangedListener(this);
      localViewTreeObserver.removeGlobalOnLayoutListener(this);
    }
  }
  
  protected JSONObject zzck()
  {
    JSONObject localJSONObject1 = new org/json/JSONObject;
    localJSONObject1.<init>();
    String str = this.zzrZ.zzcs();
    JSONObject localJSONObject2 = localJSONObject1.put("afmaVersion", str);
    Object localObject = this.zzrZ.zzct();
    localJSONObject2 = localJSONObject2.put("activeViewJSON", localObject);
    long l = zzr.zzbG().elapsedRealtime();
    localJSONObject2 = localJSONObject2.put("timestamp", l);
    localObject = this.zzrZ.zzcr();
    localJSONObject2 = localJSONObject2.put("adFormat", localObject);
    localObject = this.zzrZ.zzcu();
    localJSONObject2 = localJSONObject2.put("hashCode", localObject);
    boolean bool = this.zzrZ.zzcv();
    localJSONObject2 = localJSONObject2.put("isMraid", bool);
    bool = this.zzsg;
    localJSONObject2 = localJSONObject2.put("isStopped", bool);
    bool = this.zzqJ;
    localJSONObject2 = localJSONObject2.put("isPaused", bool);
    bool = isScreenOn();
    localJSONObject2 = localJSONObject2.put("isScreenOn", bool);
    bool = this.zzrZ.zzcw();
    localJSONObject2.put("isNative", bool);
    return localJSONObject1;
  }
  
  protected abstract boolean zzcl();
  
  protected JSONObject zzcm()
  {
    JSONObject localJSONObject = zzck().put("isAttachedToWindow", false);
    boolean bool = isScreenOn();
    return localJSONObject.put("isScreenOn", bool).put("isVisible", false);
  }
  
  protected JSONObject zzcn()
  {
    JSONObject localJSONObject = zzck();
    localJSONObject.put("doneReasonCode", "u");
    return localJSONObject;
  }
  
  protected JSONObject zzd(View paramView)
  {
    int i = 2;
    float f = 2.8E-45F;
    Object localObject1;
    if (paramView == null) {
      localObject1 = zzcm();
    }
    for (;;)
    {
      return (JSONObject)localObject1;
      boolean bool2 = zzr.zzbE().isAttachedToWindow(paramView);
      Object localObject2 = new int[i];
      localObject1 = new int[i];
      try
      {
        paramView.getLocationOnScreen((int[])localObject2);
        paramView.getLocationInWindow((int[])localObject1);
      }
      catch (Exception localException)
      {
        for (;;)
        {
          Object localObject4;
          int j;
          int k;
          Object localObject5;
          boolean bool3;
          Rect localRect1;
          boolean bool4;
          Rect localRect2;
          int n;
          JSONObject localJSONObject;
          Object localObject6;
          int i1;
          String str;
          Object localObject7;
          int i2;
          int i3;
          int i4;
          int m;
          double d;
          boolean bool1;
          Object localObject3 = "Failure getting view location.";
          zzin.zzb((String)localObject3, localException);
        }
      }
      localObject3 = paramView.getContext().getResources().getDisplayMetrics();
      localObject4 = new android/graphics/Rect;
      ((Rect)localObject4).<init>();
      j = localObject2[0];
      ((Rect)localObject4).left = j;
      j = localObject2[1];
      ((Rect)localObject4).top = j;
      j = ((Rect)localObject4).left;
      k = paramView.getWidth();
      j += k;
      ((Rect)localObject4).right = j;
      j = ((Rect)localObject4).top;
      k = paramView.getHeight();
      j += k;
      ((Rect)localObject4).bottom = j;
      localObject2 = new android/graphics/Rect;
      ((Rect)localObject2).<init>();
      j = this.zzsb.getDefaultDisplay().getWidth();
      ((Rect)localObject2).right = j;
      j = this.zzsb.getDefaultDisplay().getHeight();
      ((Rect)localObject2).bottom = j;
      localObject5 = new android/graphics/Rect;
      ((Rect)localObject5).<init>();
      j = 0;
      bool3 = paramView.getGlobalVisibleRect((Rect)localObject5, null);
      localRect1 = new android/graphics/Rect;
      localRect1.<init>();
      bool4 = paramView.getLocalVisibleRect(localRect1);
      localRect2 = new android/graphics/Rect;
      localRect2.<init>();
      paramView.getHitRect(localRect2);
      localObject1 = zzck();
      n = paramView.getWindowVisibility();
      localJSONObject = ((JSONObject)localObject1).put("windowVisibility", n).put("isAttachedToWindow", bool2);
      localObject6 = new org/json/JSONObject;
      ((JSONObject)localObject6).<init>();
      i1 = ((Rect)localObject2).top;
      i1 = zza(i1, (DisplayMetrics)localObject3);
      localObject6 = ((JSONObject)localObject6).put("top", i1);
      i1 = ((Rect)localObject2).bottom;
      i1 = zza(i1, (DisplayMetrics)localObject3);
      localObject6 = ((JSONObject)localObject6).put("bottom", i1);
      i1 = ((Rect)localObject2).left;
      i1 = zza(i1, (DisplayMetrics)localObject3);
      localObject6 = ((JSONObject)localObject6).put("left", i1);
      str = "right";
      k = ((Rect)localObject2).right;
      k = zza(k, (DisplayMetrics)localObject3);
      localObject2 = ((JSONObject)localObject6).put(str, k);
      localJSONObject = localJSONObject.put("viewBox", localObject2);
      localObject7 = new org/json/JSONObject;
      ((JSONObject)localObject7).<init>();
      i2 = ((Rect)localObject4).top;
      i2 = zza(i2, (DisplayMetrics)localObject3);
      localObject7 = ((JSONObject)localObject7).put("top", i2);
      i2 = ((Rect)localObject4).bottom;
      i2 = zza(i2, (DisplayMetrics)localObject3);
      localObject7 = ((JSONObject)localObject7).put("bottom", i2);
      i2 = ((Rect)localObject4).left;
      i2 = zza(i2, (DisplayMetrics)localObject3);
      localObject7 = ((JSONObject)localObject7).put("left", i2);
      localObject6 = "right";
      i3 = ((Rect)localObject4).right;
      i3 = zza(i3, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject7).put((String)localObject6, i3);
      localJSONObject = localJSONObject.put("adBox", localObject4);
      localObject4 = new org/json/JSONObject;
      ((JSONObject)localObject4).<init>();
      n = ((Rect)localObject5).top;
      n = zza(n, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("top", n);
      n = ((Rect)localObject5).bottom;
      n = zza(n, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("bottom", n);
      n = ((Rect)localObject5).left;
      n = zza(n, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("left", n);
      localObject7 = "right";
      i4 = ((Rect)localObject5).right;
      i4 = zza(i4, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put((String)localObject7, i4);
      localJSONObject = localJSONObject.put("globalVisibleBox", localObject4).put("globalVisibleBoxVisible", bool3);
      localObject4 = new org/json/JSONObject;
      ((JSONObject)localObject4).<init>();
      m = localRect1.top;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("top", m);
      m = localRect1.bottom;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("bottom", m);
      m = localRect1.left;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("left", m);
      m = localRect1.right;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("right", m);
      localJSONObject = localJSONObject.put("localVisibleBox", localObject4).put("localVisibleBoxVisible", bool4);
      localObject4 = new org/json/JSONObject;
      ((JSONObject)localObject4).<init>();
      m = localRect2.top;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("top", m);
      m = localRect2.bottom;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("bottom", m);
      m = localRect2.left;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("left", m);
      m = localRect2.right;
      m = zza(m, (DisplayMetrics)localObject3);
      localObject4 = ((JSONObject)localObject4).put("right", m);
      localJSONObject = localJSONObject.put("hitBox", localObject4);
      f = ((DisplayMetrics)localObject3).density;
      d = f;
      localJSONObject = localJSONObject.put("screenDensity", d);
      localObject2 = "isVisible";
      localObject3 = zzr.zzbC();
      localObject4 = this.zzsc;
      localObject5 = this.zzsd;
      bool1 = ((zzir)localObject3).zza(paramView, (PowerManager)localObject4, (KeyguardManager)localObject5);
      localJSONObject.put((String)localObject2, bool1);
    }
  }
  
  protected void zzg(boolean paramBoolean)
  {
    Object localObject = this.zzsl;
    Iterator localIterator = ((HashSet)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (zzav)localIterator.next();
      ((zzav)localObject).zza(this, paramBoolean);
    }
  }
  
  protected void zzh(boolean paramBoolean)
  {
    for (;;)
    {
      synchronized (this.zzpV)
      {
        bool1 = zzcl();
        if (bool1)
        {
          bool1 = this.zzsh;
          if (bool1) {}
        }
        else
        {
          return;
        }
        Object localObject2 = this.zzrY;
        localObject5 = ((zzbb)localObject2).zzco();
        if (localObject5 != null)
        {
          localObject2 = zzr.zzbC();
          Object localObject6 = this.zzsc;
          KeyguardManager localKeyguardManager = this.zzsd;
          bool1 = ((zzir)localObject2).zza((View)localObject5, (PowerManager)localObject6, localKeyguardManager);
          if (bool1)
          {
            localObject2 = new android/graphics/Rect;
            ((Rect)localObject2).<init>();
            boolean bool2 = false;
            localObject6 = null;
            bool1 = ((View)localObject5).getGlobalVisibleRect((Rect)localObject2, null);
            if (bool1)
            {
              bool1 = true;
              if (!paramBoolean) {
                break label166;
              }
              localObject6 = this.zzrQ;
              bool2 = ((zziz)localObject6).tryAcquire();
              if (bool2) {
                break label166;
              }
              bool2 = this.zzsj;
              if (bool1 != bool2) {
                break label166;
              }
            }
          }
        }
      }
      boolean bool1 = false;
      Object localObject4 = null;
      continue;
      label166:
      this.zzsj = bool1;
      localObject4 = this.zzrY;
      bool1 = ((zzbb)localObject4).zzcp();
      if (bool1) {
        zzcf();
      }
      try
      {
        localObject4 = zzd((View)localObject5);
        zza((JSONObject)localObject4);
      }
      catch (RuntimeException localRuntimeException)
      {
        for (;;)
        {
          localObject5 = "Active view update failed.";
          zzin.zza((String)localObject5, localRuntimeException);
        }
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
      zzci();
      zzcg();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzau.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */