package com.google.android.gms.analytics;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.google.android.gms.analytics.ecommerce.Product;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzkb;
import com.google.android.gms.internal.zzkc;
import com.google.android.gms.internal.zzkd;
import com.google.android.gms.internal.zzke;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzpr;
import com.google.android.gms.internal.zzps;
import com.google.android.gms.internal.zzpt;
import com.google.android.gms.internal.zzpu;
import com.google.android.gms.internal.zzpv;
import com.google.android.gms.internal.zzpw;
import com.google.android.gms.internal.zzpx;
import com.google.android.gms.internal.zzpy;
import com.google.android.gms.measurement.zzi;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class zzb
  extends com.google.android.gms.analytics.internal.zzc
  implements zzi
{
  private static DecimalFormat zzOU;
  private final zzf zzOK;
  private final String zzOV;
  private final Uri zzOW;
  private final boolean zzOX;
  private final boolean zzOY;
  
  public zzb(zzf paramzzf, String paramString)
  {
    this(paramzzf, paramString, true, false);
  }
  
  public zzb(zzf paramzzf, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    super(paramzzf);
    zzx.zzcM(paramString);
    this.zzOK = paramzzf;
    this.zzOV = paramString;
    this.zzOX = paramBoolean1;
    this.zzOY = paramBoolean2;
    Uri localUri = zzaU(this.zzOV);
    this.zzOW = localUri;
  }
  
  private static String zzH(Map paramMap)
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = paramMap.entrySet();
    Iterator localIterator = ((Set)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = (Map.Entry)localIterator.next();
      int i = localStringBuilder.length();
      if (i != 0)
      {
        str = ", ";
        localStringBuilder.append(str);
      }
      String str = (String)((Map.Entry)localObject).getKey();
      localStringBuilder.append(str);
      str = "=";
      localStringBuilder.append(str);
      localObject = (String)((Map.Entry)localObject).getValue();
      localStringBuilder.append((String)localObject);
    }
    return localStringBuilder.toString();
  }
  
  private static void zza(Map paramMap, String paramString, double paramDouble)
  {
    double d = 0.0D;
    boolean bool = paramDouble < d;
    if (bool)
    {
      String str = zzb(paramDouble);
      paramMap.put(paramString, str);
    }
  }
  
  private static void zza(Map paramMap, String paramString, int paramInt1, int paramInt2)
  {
    if ((paramInt1 > 0) && (paramInt2 > 0))
    {
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append(paramInt1);
      String str = "x";
      localObject = str + paramInt2;
      paramMap.put(paramString, localObject);
    }
  }
  
  private static void zza(Map paramMap, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      String str = "1";
      paramMap.put(paramString, str);
    }
  }
  
  static Uri zzaU(String paramString)
  {
    zzx.zzcM(paramString);
    Uri.Builder localBuilder = new android/net/Uri$Builder;
    localBuilder.<init>();
    localBuilder.scheme("uri");
    localBuilder.authority("google-analytics.com");
    localBuilder.path(paramString);
    return localBuilder.build();
  }
  
  static String zzb(double paramDouble)
  {
    DecimalFormat localDecimalFormat = zzOU;
    if (localDecimalFormat == null)
    {
      localDecimalFormat = new java/text/DecimalFormat;
      String str = "0.######";
      localDecimalFormat.<init>(str);
      zzOU = localDecimalFormat;
    }
    return zzOU.format(paramDouble);
  }
  
  private static void zzb(Map paramMap, String paramString1, String paramString2)
  {
    boolean bool = TextUtils.isEmpty(paramString2);
    if (!bool) {
      paramMap.put(paramString1, paramString2);
    }
  }
  
  public static Map zzc(com.google.android.gms.measurement.zzc paramzzc)
  {
    int i = 1;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    Object localObject1 = (zzkd)paramzzc.zze(zzkd.class);
    Object localObject2;
    boolean bool1;
    Object localObject3;
    if (localObject1 != null)
    {
      localObject1 = ((zzkd)localObject1).zziR().entrySet();
      localObject2 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject2).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject2).next();
        localObject3 = zzi(((Map.Entry)localObject1).getValue());
        if (localObject3 != null)
        {
          localObject1 = ((Map.Entry)localObject1).getKey();
          localHashMap.put(localObject1, localObject3);
        }
      }
    }
    localObject1 = (zzke)paramzzc.zze(zzke.class);
    double d1;
    if (localObject1 != null)
    {
      localObject3 = ((zzke)localObject1).zziS();
      zzb(localHashMap, "t", (String)localObject3);
      localObject3 = ((zzke)localObject1).getClientId();
      zzb(localHashMap, "cid", (String)localObject3);
      localObject3 = ((zzke)localObject1).getUserId();
      zzb(localHashMap, "uid", (String)localObject3);
      localObject3 = ((zzke)localObject1).zziV();
      zzb(localHashMap, "sc", (String)localObject3);
      d1 = ((zzke)localObject1).zziX();
      zza(localHashMap, "sf", d1);
      boolean bool2 = ((zzke)localObject1).zziW();
      zza(localHashMap, "ni", bool2);
      localObject3 = ((zzke)localObject1).zziT();
      zzb(localHashMap, "adid", (String)localObject3);
      localObject2 = "ate";
      bool1 = ((zzke)localObject1).zziU();
      zza(localHashMap, (String)localObject2, bool1);
    }
    localObject1 = (zzpw)paramzzc.zze(zzpw.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzpw)localObject1).zzBc();
      zzb(localHashMap, "cd", (String)localObject3);
      int k = ((zzpw)localObject1).zzBd();
      d1 = k;
      zza(localHashMap, "a", d1);
      localObject2 = "dr";
      localObject1 = ((zzpw)localObject1).zzBe();
      zzb(localHashMap, (String)localObject2, (String)localObject1);
    }
    localObject1 = (zzpu)paramzzc.zze(zzpu.class);
    long l;
    if (localObject1 != null)
    {
      localObject3 = ((zzpu)localObject1).zzAZ();
      zzb(localHashMap, "ec", (String)localObject3);
      localObject3 = ((zzpu)localObject1).getAction();
      zzb(localHashMap, "ea", (String)localObject3);
      localObject3 = ((zzpu)localObject1).getLabel();
      zzb(localHashMap, "el", (String)localObject3);
      localObject2 = "ev";
      l = ((zzpu)localObject1).getValue();
      d1 = l;
      zza(localHashMap, (String)localObject2, d1);
    }
    localObject1 = (zzpr)paramzzc.zze(zzpr.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzpr)localObject1).getName();
      zzb(localHashMap, "cn", (String)localObject3);
      localObject3 = ((zzpr)localObject1).getSource();
      zzb(localHashMap, "cs", (String)localObject3);
      localObject3 = ((zzpr)localObject1).zzAK();
      zzb(localHashMap, "cm", (String)localObject3);
      localObject3 = ((zzpr)localObject1).zzAL();
      zzb(localHashMap, "ck", (String)localObject3);
      localObject3 = ((zzpr)localObject1).getContent();
      zzb(localHashMap, "cc", (String)localObject3);
      localObject3 = ((zzpr)localObject1).getId();
      zzb(localHashMap, "ci", (String)localObject3);
      localObject3 = ((zzpr)localObject1).zzAM();
      zzb(localHashMap, "anid", (String)localObject3);
      localObject3 = ((zzpr)localObject1).zzAN();
      zzb(localHashMap, "gclid", (String)localObject3);
      localObject3 = ((zzpr)localObject1).zzAO();
      zzb(localHashMap, "dclid", (String)localObject3);
      localObject2 = "aclid";
      localObject1 = ((zzpr)localObject1).zzAP();
      zzb(localHashMap, (String)localObject2, (String)localObject1);
    }
    localObject1 = (zzpv)paramzzc.zze(zzpv.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzpv)localObject1).getDescription();
      zzb(localHashMap, "exd", (String)localObject3);
      localObject2 = "exf";
      bool1 = ((zzpv)localObject1).zzBa();
      zza(localHashMap, (String)localObject2, bool1);
    }
    localObject1 = (zzpx)paramzzc.zze(zzpx.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzpx)localObject1).zzBg();
      zzb(localHashMap, "sn", (String)localObject3);
      localObject3 = ((zzpx)localObject1).getAction();
      zzb(localHashMap, "sa", (String)localObject3);
      localObject2 = "st";
      localObject1 = ((zzpx)localObject1).getTarget();
      zzb(localHashMap, (String)localObject2, (String)localObject1);
    }
    localObject1 = (zzpy)paramzzc.zze(zzpy.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzpy)localObject1).zzBh();
      zzb(localHashMap, "utv", (String)localObject3);
      l = ((zzpy)localObject1).getTimeInMillis();
      d1 = l;
      zza(localHashMap, "utt", d1);
      localObject3 = ((zzpy)localObject1).zzAZ();
      zzb(localHashMap, "utc", (String)localObject3);
      localObject2 = "utl";
      localObject1 = ((zzpy)localObject1).getLabel();
      zzb(localHashMap, (String)localObject2, (String)localObject1);
    }
    localObject1 = (zzkb)paramzzc.zze(zzkb.class);
    int i1;
    int i5;
    if (localObject1 != null)
    {
      localObject1 = ((zzkb)localObject1).zziP().entrySet();
      localObject3 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        i1 = ((Integer)((Map.Entry)localObject1).getKey()).intValue();
        localObject2 = zzc.zzU(i1);
        i5 = TextUtils.isEmpty((CharSequence)localObject2);
        if (i5 == 0)
        {
          localObject1 = ((Map.Entry)localObject1).getValue();
          localHashMap.put(localObject2, localObject1);
        }
      }
    }
    localObject1 = (zzkc)paramzzc.zze(zzkc.class);
    if (localObject1 != null)
    {
      localObject1 = ((zzkc)localObject1).zziQ().entrySet();
      localObject3 = ((Set)localObject1).iterator();
      for (;;)
      {
        bool1 = ((Iterator)localObject3).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject3).next();
        i1 = ((Integer)((Map.Entry)localObject1).getKey()).intValue();
        localObject2 = zzc.zzW(i1);
        i5 = TextUtils.isEmpty((CharSequence)localObject2);
        if (i5 == 0)
        {
          d1 = ((Double)((Map.Entry)localObject1).getValue()).doubleValue();
          localObject1 = zzb(d1);
          localHashMap.put(localObject2, localObject1);
        }
      }
    }
    localObject1 = (zzpt)paramzzc.zze(zzpt.class);
    int j;
    if (localObject1 != null)
    {
      localObject2 = ((zzpt)localObject1).zzAV();
      boolean bool3;
      if (localObject2 != null)
      {
        localObject2 = ((ProductAction)localObject2).build().entrySet();
        localObject4 = ((Set)localObject2).iterator();
        for (;;)
        {
          bool3 = ((Iterator)localObject4).hasNext();
          if (!bool3) {
            break;
          }
          localObject2 = (Map.Entry)((Iterator)localObject4).next();
          localObject3 = (String)((Map.Entry)localObject2).getKey();
          localObject5 = "&";
          m = ((String)localObject3).startsWith((String)localObject5);
          if (m != 0)
          {
            localObject3 = ((String)((Map.Entry)localObject2).getKey()).substring(i);
            localObject2 = ((Map.Entry)localObject2).getValue();
            localHashMap.put(localObject3, localObject2);
          }
          else
          {
            localObject3 = ((Map.Entry)localObject2).getKey();
            localObject2 = ((Map.Entry)localObject2).getValue();
            localHashMap.put(localObject3, localObject2);
          }
        }
      }
      localObject2 = ((zzpt)localObject1).zzAY();
      Object localObject4 = ((List)localObject2).iterator();
      int i2;
      for (int m = i;; m = i2)
      {
        bool3 = ((Iterator)localObject4).hasNext();
        if (!bool3) {
          break;
        }
        localObject2 = (Promotion)((Iterator)localObject4).next();
        localObject5 = zzc.zzaa(m);
        localObject2 = ((Promotion)localObject2).zzba((String)localObject5);
        localHashMap.putAll((Map)localObject2);
        i2 = m + 1;
      }
      localObject2 = ((zzpt)localObject1).zzAW();
      localObject4 = ((List)localObject2).iterator();
      int i3;
      for (m = i;; m = i3)
      {
        boolean bool4 = ((Iterator)localObject4).hasNext();
        if (!bool4) {
          break;
        }
        localObject2 = (Product)((Iterator)localObject4).next();
        localObject5 = zzc.zzY(m);
        localObject2 = ((Product)localObject2).zzba((String)localObject5);
        localHashMap.putAll((Map)localObject2);
        i3 = m + 1;
      }
      localObject1 = ((zzpt)localObject1).zzAX().entrySet();
      Object localObject5 = ((Set)localObject1).iterator();
      for (m = i;; m = j)
      {
        bool1 = ((Iterator)localObject5).hasNext();
        if (!bool1) {
          break;
        }
        localObject1 = (Map.Entry)((Iterator)localObject5).next();
        localObject2 = (List)((Map.Entry)localObject1).getValue();
        String str1 = zzc.zzad(m);
        Iterator localIterator = ((List)localObject2).iterator();
        int i4;
        for (i5 = i;; i5 = i4)
        {
          boolean bool5 = localIterator.hasNext();
          if (!bool5) {
            break;
          }
          localObject2 = (Product)localIterator.next();
          Object localObject6 = new java/lang/StringBuilder;
          ((StringBuilder)localObject6).<init>();
          localObject6 = ((StringBuilder)localObject6).append(str1);
          String str2 = zzc.zzab(i5);
          localObject6 = str2;
          localObject2 = ((Product)localObject2).zzba((String)localObject6);
          localHashMap.putAll((Map)localObject2);
          i4 = i5 + 1;
        }
        localObject2 = (CharSequence)((Map.Entry)localObject1).getKey();
        boolean bool6 = TextUtils.isEmpty((CharSequence)localObject2);
        if (!bool6)
        {
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          localObject2 = ((StringBuilder)localObject2).append(str1);
          localObject4 = "nm";
          localObject2 = (String)localObject4;
          localObject1 = ((Map.Entry)localObject1).getKey();
          localHashMap.put(localObject2, localObject1);
        }
        j = m + 1;
      }
    }
    localObject1 = (zzps)paramzzc.zze(zzps.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzps)localObject1).getLanguage();
      zzb(localHashMap, "ul", (String)localObject3);
      double d2 = ((zzps)localObject1).zzAQ();
      zza(localHashMap, "sd", d2);
      int n = ((zzps)localObject1).zzAR();
      i = ((zzps)localObject1).zzAS();
      zza(localHashMap, "sr", n, i);
      localObject2 = "vp";
      n = ((zzps)localObject1).zzAT();
      j = ((zzps)localObject1).zzAU();
      zza(localHashMap, (String)localObject2, n, j);
    }
    localObject1 = (zzpq)paramzzc.zze(zzpq.class);
    if (localObject1 != null)
    {
      localObject3 = ((zzpq)localObject1).zzlg();
      zzb(localHashMap, "an", (String)localObject3);
      localObject3 = ((zzpq)localObject1).zzwK();
      zzb(localHashMap, "aid", (String)localObject3);
      localObject3 = ((zzpq)localObject1).zzAJ();
      zzb(localHashMap, "aiid", (String)localObject3);
      localObject2 = "av";
      localObject1 = ((zzpq)localObject1).zzli();
      zzb(localHashMap, (String)localObject2, (String)localObject1);
    }
    return localHashMap;
  }
  
  private static String zzi(Object paramObject)
  {
    if (paramObject == null) {
      paramObject = null;
    }
    for (;;)
    {
      return (String)paramObject;
      boolean bool = paramObject instanceof String;
      if (bool)
      {
        paramObject = (String)paramObject;
        bool = TextUtils.isEmpty((CharSequence)paramObject);
        if (bool) {
          paramObject = null;
        }
      }
      else
      {
        bool = paramObject instanceof Double;
        if (bool)
        {
          paramObject = (Double)paramObject;
          double d1 = ((Double)paramObject).doubleValue();
          double d2 = 0.0D;
          bool = d1 < d2;
          if (bool)
          {
            double d3 = ((Double)paramObject).doubleValue();
            paramObject = zzb(d3);
          }
          else
          {
            paramObject = null;
          }
        }
        else
        {
          bool = paramObject instanceof Boolean;
          if (bool)
          {
            Boolean localBoolean = Boolean.FALSE;
            if (paramObject != localBoolean) {
              paramObject = "1";
            } else {
              paramObject = null;
            }
          }
          else
          {
            paramObject = String.valueOf(paramObject);
          }
        }
      }
    }
  }
  
  public void zzb(com.google.android.gms.measurement.zzc paramzzc)
  {
    long l1 = 0L;
    double d1 = 0.0D;
    boolean bool1 = true;
    zzx.zzz(paramzzc);
    zzx.zzb(paramzzc.zzAz(), "Can't deliver not submitted measurement");
    zzx.zzcE("deliver should be called on worker thread");
    Object localObject1 = paramzzc.zzAu();
    Object localObject2 = ((com.google.android.gms.measurement.zzc)localObject1).zzf(zzke.class);
    Object localObject3 = localObject2;
    localObject3 = (zzke)localObject2;
    localObject2 = ((zzke)localObject3).zziS();
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject2);
    Object localObject4;
    Object localObject5;
    if (bool2)
    {
      localObject2 = zzjm();
      localObject4 = zzc((com.google.android.gms.measurement.zzc)localObject1);
      localObject5 = "Ignoring measurement without type";
      ((zzaf)localObject2).zzh((Map)localObject4, (String)localObject5);
    }
    double d2;
    Map localMap;
    for (;;)
    {
      return;
      localObject2 = ((zzke)localObject3).getClientId();
      bool2 = TextUtils.isEmpty((CharSequence)localObject2);
      if (bool2)
      {
        localObject2 = zzjm();
        localObject4 = zzc((com.google.android.gms.measurement.zzc)localObject1);
        localObject5 = "Ignoring measurement without client id";
        ((zzaf)localObject2).zzh((Map)localObject4, (String)localObject5);
      }
      else
      {
        localObject2 = this.zzOK.zzjz();
        bool2 = ((GoogleAnalytics)localObject2).getAppOptOut();
        if (!bool2)
        {
          d2 = ((zzke)localObject3).zziX();
          localObject2 = ((zzke)localObject3).getClientId();
          bool2 = zzam.zza(d2, (String)localObject2);
          if (bool2)
          {
            localObject2 = "Sampling enabled. Hit sampled out. sampling rate";
            localObject4 = Double.valueOf(d2);
            zzb((String)localObject2, localObject4);
          }
          else
          {
            localMap = zzc((com.google.android.gms.measurement.zzc)localObject1);
            localMap.put("v", "1");
            localObject1 = zze.zzQm;
            localMap.put("_v", localObject1);
            localObject1 = this.zzOV;
            localMap.put("tid", localObject1);
            localObject2 = this.zzOK.zzjz();
            bool2 = ((GoogleAnalytics)localObject2).isDryRunEnabled();
            if (!bool2) {
              break;
            }
            localObject2 = zzH(localMap);
            localObject4 = "Dry run is enabled. GoogleAnalytics would have sent";
            zzc((String)localObject4, localObject2);
          }
        }
      }
    }
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localObject1 = ((zzke)localObject3).getUserId();
    zzam.zzc(localHashMap, "uid", (String)localObject1);
    localObject2 = (zzpq)paramzzc.zze(zzpq.class);
    if (localObject2 != null)
    {
      str = ((zzpq)localObject2).zzlg();
      zzam.zzc(localHashMap, "an", str);
      str = ((zzpq)localObject2).zzwK();
      zzam.zzc(localHashMap, "aid", str);
      str = ((zzpq)localObject2).zzli();
      zzam.zzc(localHashMap, "av", str);
      localObject1 = "aiid";
      localObject2 = ((zzpq)localObject2).zzAJ();
      zzam.zzc(localHashMap, (String)localObject1, (String)localObject2);
    }
    localObject2 = new com/google/android/gms/analytics/internal/zzh;
    localObject1 = ((zzke)localObject3).getClientId();
    String str = this.zzOV;
    localObject3 = ((zzke)localObject3).zziT();
    boolean bool3 = TextUtils.isEmpty((CharSequence)localObject3);
    if (!bool3) {
      bool3 = bool1;
    }
    for (;;)
    {
      d2 = d1;
      ((zzh)localObject2).<init>(l1, (String)localObject1, str, bool3, l1, localHashMap);
      long l2 = zziH().zza((zzh)localObject2);
      localObject2 = String.valueOf(l2);
      localMap.put("_s", localObject2);
      localObject4 = new com/google/android/gms/analytics/internal/zzab;
      localObject5 = zzjm();
      long l3 = paramzzc.zzAx();
      localObject1 = localMap;
      ((zzab)localObject4).<init>((com.google.android.gms.analytics.internal.zzc)localObject5, localMap, l3, bool1);
      localObject2 = zziH();
      ((com.google.android.gms.analytics.internal.zzb)localObject2).zza((zzab)localObject4);
      break;
      bool3 = false;
      localObject3 = null;
    }
  }
  
  public Uri zziA()
  {
    return this.zzOW;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */