package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzan;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzn;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.measurement.zzg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

public class Tracker
  extends zzd
{
  private boolean zzPs;
  private final Map zzPt;
  private final zzad zzPu;
  private final Tracker.zza zzPv;
  private ExceptionReporter zzPw;
  private zzal zzPx;
  private final Map zzxA;
  
  Tracker(zzf paramzzf, String paramString, zzad paramzzad)
  {
    super(paramzzf);
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzxA = ((Map)localObject1);
    localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.zzPt = ((Map)localObject1);
    if (paramString != null)
    {
      localObject1 = this.zzxA;
      str = "&tid";
      ((Map)localObject1).put(str, paramString);
    }
    this.zzxA.put("useSecure", "1");
    localObject1 = this.zzxA;
    String str = "&a";
    Object localObject2 = new java/util/Random;
    ((Random)localObject2).<init>();
    int i = -1 >>> 1;
    int j = ((Random)localObject2).nextInt(i) + 1;
    localObject2 = Integer.toString(j);
    ((Map)localObject1).put(str, localObject2);
    if (paramzzad == null)
    {
      localObject1 = new com/google/android/gms/analytics/internal/zzad;
      str = "tracking";
      localObject2 = zzjl();
      ((zzad)localObject1).<init>(str, (zzmq)localObject2);
    }
    for (this.zzPu = ((zzad)localObject1);; this.zzPu = paramzzad)
    {
      localObject1 = new com/google/android/gms/analytics/Tracker$zza;
      ((Tracker.zza)localObject1).<init>(this, paramzzf);
      this.zzPv = ((Tracker.zza)localObject1);
      return;
    }
  }
  
  private static boolean zza(Map.Entry paramEntry)
  {
    String str1 = (String)paramEntry.getKey();
    String str2 = (String)paramEntry.getValue();
    str2 = "&";
    boolean bool = str1.startsWith(str2);
    int j;
    if (bool)
    {
      j = str1.length();
      int i = 2;
      if (j >= i) {}
    }
    else
    {
      j = 0;
      str1 = null;
    }
    for (;;)
    {
      return j;
      int k = 1;
    }
  }
  
  private static String zzb(Map.Entry paramEntry)
  {
    boolean bool = zza(paramEntry);
    if (!bool) {
      bool = false;
    }
    int i;
    for (String str = null;; str = str.substring(i))
    {
      return str;
      str = (String)paramEntry.getKey();
      i = 1;
    }
  }
  
  private static void zzb(Map paramMap1, Map paramMap2)
  {
    zzx.zzz(paramMap2);
    if (paramMap1 == null) {
      return;
    }
    Object localObject = paramMap1.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = zzb((Map.Entry)localObject);
      if (str != null)
      {
        localObject = ((Map.Entry)localObject).getValue();
        paramMap2.put(str, localObject);
      }
    }
  }
  
  private static void zzc(Map paramMap1, Map paramMap2)
  {
    zzx.zzz(paramMap2);
    if (paramMap1 == null) {
      return;
    }
    Object localObject = paramMap1.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      String str = zzb((Map.Entry)localObject);
      if (str != null)
      {
        boolean bool2 = paramMap2.containsKey(str);
        if (!bool2)
        {
          localObject = ((Map.Entry)localObject).getValue();
          paramMap2.put(str, localObject);
        }
      }
    }
  }
  
  private boolean zziK()
  {
    ExceptionReporter localExceptionReporter = this.zzPw;
    boolean bool;
    if (localExceptionReporter != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localExceptionReporter = null;
    }
  }
  
  static String zzn(Activity paramActivity)
  {
    Object localObject1 = null;
    zzx.zzz(paramActivity);
    Object localObject2 = paramActivity.getIntent();
    if (localObject2 == null) {}
    for (;;)
    {
      return (String)localObject1;
      String str = "android.intent.extra.REFERRER_NAME";
      localObject2 = ((Intent)localObject2).getStringExtra(str);
      boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
      if (!bool) {
        localObject1 = localObject2;
      }
    }
  }
  
  public void enableAdvertisingIdCollection(boolean paramBoolean)
  {
    this.zzPs = paramBoolean;
  }
  
  public void enableAutoActivityTracking(boolean paramBoolean)
  {
    this.zzPv.enableAutoActivityTracking(paramBoolean);
  }
  
  public void enableExceptionReporting(boolean paramBoolean)
  {
    for (;;)
    {
      try
      {
        boolean bool = zziK();
        if (bool == paramBoolean) {
          return;
        }
        if (paramBoolean)
        {
          Object localObject1 = getContext();
          Thread.UncaughtExceptionHandler localUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
          ExceptionReporter localExceptionReporter = new com/google/android/gms/analytics/ExceptionReporter;
          localExceptionReporter.<init>(this, localUncaughtExceptionHandler, (Context)localObject1);
          this.zzPw = localExceptionReporter;
          localObject1 = this.zzPw;
          Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject1);
          localObject1 = "Uncaught exceptions will be reported to Google Analytics";
          zzbd((String)localObject1);
          continue;
        }
        localObject3 = this.zzPw;
      }
      finally {}
      Object localObject3 = ((ExceptionReporter)localObject3).zziD();
      Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)localObject3);
      localObject3 = "Uncaught exceptions will not be reported to Google Analytics";
      zzbd((String)localObject3);
    }
  }
  
  public String get(String paramString)
  {
    String str = null;
    zzjv();
    boolean bool = TextUtils.isEmpty(paramString);
    if (bool) {}
    for (;;)
    {
      return str;
      Object localObject = this.zzxA;
      bool = ((Map)localObject).containsKey(paramString);
      if (bool)
      {
        str = (String)this.zzxA.get(paramString);
      }
      else
      {
        localObject = "&ul";
        bool = paramString.equals(localObject);
        if (bool)
        {
          str = zzam.zza(Locale.getDefault());
        }
        else
        {
          localObject = "&cid";
          bool = paramString.equals(localObject);
          if (bool)
          {
            str = zzjr().zzkk();
          }
          else
          {
            localObject = "&sr";
            bool = paramString.equals(localObject);
            if (bool)
            {
              str = zzju().zzla();
            }
            else
            {
              localObject = "&aid";
              bool = paramString.equals(localObject);
              if (bool)
              {
                str = zzjt().zzjS().zzwK();
              }
              else
              {
                localObject = "&an";
                bool = paramString.equals(localObject);
                if (bool)
                {
                  str = zzjt().zzjS().zzlg();
                }
                else
                {
                  localObject = "&av";
                  bool = paramString.equals(localObject);
                  if (bool)
                  {
                    str = zzjt().zzjS().zzli();
                  }
                  else
                  {
                    localObject = "&aiid";
                    bool = paramString.equals(localObject);
                    if (bool) {
                      str = zzjt().zzjS().zzAJ();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  public void send(Map paramMap)
  {
    int i = 1;
    long l = zzjl().currentTimeMillis();
    Object localObject1 = zziC();
    boolean bool1 = ((GoogleAnalytics)localObject1).getAppOptOut();
    if (bool1)
    {
      localObject1 = "AppOptOut is set to true. Not sending Google Analytics hit";
      zzbe((String)localObject1);
    }
    for (;;)
    {
      return;
      boolean bool2 = zziC().isDryRunEnabled();
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      zzb(this.zzxA, localHashMap);
      zzb(paramMap, localHashMap);
      localObject1 = this.zzxA;
      Object localObject3 = "useSecure";
      boolean bool3 = zzam.zzh((String)((Map)localObject1).get(localObject3), i);
      zzc(this.zzPt, localHashMap);
      this.zzPt.clear();
      localObject1 = "t";
      String str1 = (String)localHashMap.get(localObject1);
      bool1 = TextUtils.isEmpty(str1);
      Object localObject4;
      if (bool1)
      {
        localObject1 = zzjm();
        localObject4 = "Missing hit type parameter";
        ((zzaf)localObject1).zzh(localHashMap, (String)localObject4);
        continue;
      }
      localObject1 = "tid";
      String str2 = (String)localHashMap.get(localObject1);
      bool1 = TextUtils.isEmpty(str2);
      if (bool1)
      {
        localObject1 = zzjm();
        localObject4 = "Missing tracking id parameter";
        ((zzaf)localObject1).zzh(localHashMap, (String)localObject4);
        continue;
      }
      boolean bool4 = zziL();
      localObject1 = "screenview";
      try
      {
        bool1 = ((String)localObject1).equalsIgnoreCase(str1);
        if (!bool1)
        {
          localObject1 = "pageview";
          bool1 = ((String)localObject1).equalsIgnoreCase(str1);
          if (!bool1)
          {
            localObject1 = "appview";
            bool1 = ((String)localObject1).equalsIgnoreCase(str1);
            if (!bool1)
            {
              bool1 = TextUtils.isEmpty(str1);
              if (!bool1) {
                break label388;
              }
            }
          }
        }
        localObject1 = this.zzxA;
        localObject3 = "&a";
        localObject1 = ((Map)localObject1).get(localObject3);
        localObject1 = (String)localObject1;
        int j = Integer.parseInt((String)localObject1) + 1;
        int k = -1 >>> 1;
        if (j >= k) {
          j = i;
        }
        localObject4 = this.zzxA;
        localObject3 = "&a";
        localObject1 = Integer.toString(j);
        ((Map)localObject4).put(localObject3, localObject1);
        label388:
        localObject1 = zzjo();
        localObject4 = new com/google/android/gms/analytics/Tracker$1;
        localObject3 = this;
        ((Tracker.1)localObject4).<init>(this, localHashMap, bool4, str1, l, bool2, bool3, str2);
        ((zzg)localObject1).zzf((Runnable)localObject4);
      }
      finally {}
    }
  }
  
  public void set(String paramString1, String paramString2)
  {
    Object localObject = "Key should be non-null";
    zzx.zzb(paramString1, localObject);
    boolean bool = TextUtils.isEmpty(paramString1);
    if (bool) {}
    for (;;)
    {
      return;
      localObject = this.zzxA;
      ((Map)localObject).put(paramString1, paramString2);
    }
  }
  
  public void setAnonymizeIp(boolean paramBoolean)
  {
    String str = zzam.zzK(paramBoolean);
    set("&aip", str);
  }
  
  public void setAppId(String paramString)
  {
    set("&aid", paramString);
  }
  
  public void setAppInstallerId(String paramString)
  {
    set("&aiid", paramString);
  }
  
  public void setAppName(String paramString)
  {
    set("&an", paramString);
  }
  
  public void setAppVersion(String paramString)
  {
    set("&av", paramString);
  }
  
  public void setCampaignParamsOnNextHit(Uri paramUri)
  {
    if (paramUri != null)
    {
      boolean bool1 = paramUri.isOpaque();
      if (!bool1) {
        break label14;
      }
    }
    for (;;)
    {
      return;
      label14:
      Object localObject1 = paramUri.getQueryParameter("referrer");
      boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool2)
      {
        Object localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        Object localObject3 = "http://hostname/?";
        localObject1 = Uri.parse((String)localObject3 + (String)localObject1);
        localObject2 = ((Uri)localObject1).getQueryParameter("utm_id");
        String str;
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&ci";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("anid");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&anid";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("utm_campaign");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&cn";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("utm_content");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&cc";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("utm_medium");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&cm";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("utm_source");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&cs";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("utm_term");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&ck";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("dclid");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&dclid";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = ((Uri)localObject1).getQueryParameter("gclid");
        if (localObject2 != null)
        {
          localObject3 = this.zzPt;
          str = "&gclid";
          ((Map)localObject3).put(str, localObject2);
        }
        localObject2 = "aclid";
        localObject1 = ((Uri)localObject1).getQueryParameter((String)localObject2);
        if (localObject1 != null)
        {
          localObject2 = this.zzPt;
          localObject3 = "&aclid";
          ((Map)localObject2).put(localObject3, localObject1);
        }
      }
    }
  }
  
  public void setClientId(String paramString)
  {
    set("&cid", paramString);
  }
  
  public void setEncoding(String paramString)
  {
    set("&de", paramString);
  }
  
  public void setHostname(String paramString)
  {
    set("&dh", paramString);
  }
  
  public void setLanguage(String paramString)
  {
    set("&ul", paramString);
  }
  
  public void setLocation(String paramString)
  {
    set("&dl", paramString);
  }
  
  public void setPage(String paramString)
  {
    set("&dp", paramString);
  }
  
  public void setReferrer(String paramString)
  {
    set("&dr", paramString);
  }
  
  public void setSampleRate(double paramDouble)
  {
    String str = Double.toString(paramDouble);
    set("&sf", str);
  }
  
  public void setScreenColors(String paramString)
  {
    set("&sd", paramString);
  }
  
  public void setScreenName(String paramString)
  {
    set("&cd", paramString);
  }
  
  public void setScreenResolution(int paramInt1, int paramInt2)
  {
    String str1;
    if ((paramInt1 < 0) && (paramInt2 < 0))
    {
      str1 = "Invalid width or height. The values should be non-negative.";
      zzbg(str1);
    }
    for (;;)
    {
      return;
      str1 = "&sr";
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramInt1);
      String str2 = "x";
      localObject = str2 + paramInt2;
      set(str1, (String)localObject);
    }
  }
  
  public void setSessionTimeout(long paramLong)
  {
    Tracker.zza localzza = this.zzPv;
    long l = 1000L * paramLong;
    localzza.setSessionTimeout(l);
  }
  
  public void setTitle(String paramString)
  {
    set("&dt", paramString);
  }
  
  public void setUseSecure(boolean paramBoolean)
  {
    String str = zzam.zzK(paramBoolean);
    set("useSecure", str);
  }
  
  public void setViewportSize(String paramString)
  {
    set("&vp", paramString);
  }
  
  void zza(zzal paramzzal)
  {
    zzbd("Loading Tracker config values");
    this.zzPx = paramzzal;
    Object localObject = this.zzPx;
    boolean bool1 = ((zzal)localObject).zzlT();
    String str1;
    if (bool1)
    {
      localObject = this.zzPx.getTrackingId();
      set("&tid", (String)localObject);
      str1 = "trackingId loaded";
      zza(str1, localObject);
    }
    localObject = this.zzPx;
    bool1 = ((zzal)localObject).zzlU();
    if (bool1)
    {
      double d = this.zzPx.zzlV();
      localObject = Double.toString(d);
      set("&sf", (String)localObject);
      str1 = "Sample frequency loaded";
      zza(str1, localObject);
    }
    localObject = this.zzPx;
    bool1 = ((zzal)localObject).zzlW();
    if (bool1)
    {
      int i = this.zzPx.getSessionTimeout();
      long l = i;
      setSessionTimeout(l);
      str1 = "Session timeout loaded";
      localObject = Integer.valueOf(i);
      zza(str1, localObject);
    }
    localObject = this.zzPx;
    boolean bool2 = ((zzal)localObject).zzlX();
    if (bool2)
    {
      bool2 = this.zzPx.zzlY();
      enableAutoActivityTracking(bool2);
      str1 = "Auto activity tracking loaded";
      localObject = Boolean.valueOf(bool2);
      zza(str1, localObject);
    }
    localObject = this.zzPx;
    bool2 = ((zzal)localObject).zzlZ();
    if (bool2)
    {
      localObject = this.zzPx;
      bool2 = ((zzal)localObject).zzma();
      if (bool2)
      {
        str1 = "&aip";
        String str2 = "1";
        set(str1, str2);
      }
      str1 = "Anonymize ip loaded";
      localObject = Boolean.valueOf(bool2);
      zza(str1, localObject);
    }
    bool2 = this.zzPx.zzmb();
    enableExceptionReporting(bool2);
  }
  
  protected void zziJ()
  {
    this.zzPv.zza();
    String str1 = zziI().zzlg();
    String str2;
    if (str1 != null)
    {
      str2 = "&an";
      set(str2, str1);
    }
    str1 = zziI().zzli();
    if (str1 != null)
    {
      str2 = "&av";
      set(str2, str1);
    }
  }
  
  boolean zziL()
  {
    return this.zzPs;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\Tracker.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */