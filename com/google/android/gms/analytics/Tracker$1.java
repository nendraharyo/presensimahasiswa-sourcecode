package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zza;
import com.google.android.gms.analytics.internal.zzab;
import com.google.android.gms.analytics.internal.zzad;
import com.google.android.gms.analytics.internal.zzaf;
import com.google.android.gms.analytics.internal.zzam;
import com.google.android.gms.analytics.internal.zzb;
import com.google.android.gms.analytics.internal.zzc;
import com.google.android.gms.analytics.internal.zze;
import com.google.android.gms.analytics.internal.zzh;
import com.google.android.gms.analytics.internal.zzk;
import com.google.android.gms.analytics.internal.zzu;
import com.google.android.gms.internal.zzpq;
import com.google.android.gms.internal.zzps;
import java.util.HashMap;
import java.util.Map;

class Tracker$1
  implements Runnable
{
  Tracker$1(Tracker paramTracker, Map paramMap, boolean paramBoolean1, String paramString1, long paramLong, boolean paramBoolean2, boolean paramBoolean3, String paramString2) {}
  
  public void run()
  {
    boolean bool1 = true;
    Object localObject1 = null;
    long l1 = 0L;
    Object localObject2 = Tracker.zza(this.zzPF);
    boolean bool2 = ((Tracker.zza)localObject2).zziM();
    if (bool2)
    {
      localObject2 = this.zzPy;
      localObject3 = "sc";
      localObject4 = "start";
      ((Map)localObject2).put(localObject3, localObject4);
    }
    localObject2 = this.zzPy;
    Object localObject4 = this.zzPF.zziC().getClientId();
    zzam.zzd((Map)localObject2, "cid", (String)localObject4);
    localObject2 = this.zzPy;
    Object localObject3 = "sf";
    localObject2 = (String)((Map)localObject2).get(localObject3);
    String str1;
    if (localObject2 != null)
    {
      double d = zzam.zza((String)localObject2, 100.0D);
      localObject2 = this.zzPy;
      str1 = "cid";
      localObject2 = (String)((Map)localObject2).get(str1);
      bool2 = zzam.zza(d, (String)localObject2);
      if (bool2)
      {
        localObject2 = this.zzPF;
        localObject1 = "Sampling enabled. Hit sampled out. sample rate";
        localObject3 = Double.valueOf(d);
        ((Tracker)localObject2).zzb((String)localObject1, localObject3);
      }
    }
    label250:
    label585:
    label594:
    long l2;
    boolean bool5;
    for (;;)
    {
      return;
      localObject2 = Tracker.zzb(this.zzPF);
      boolean bool3 = this.zzPz;
      if (bool3)
      {
        localObject3 = this.zzPy;
        boolean bool4 = ((zza)localObject2).zziU();
        zzam.zzb((Map)localObject3, "ate", bool4);
        localObject3 = this.zzPy;
        localObject4 = "adid";
        localObject2 = ((zza)localObject2).zziY();
        zzam.zzc((Map)localObject3, (String)localObject4, (String)localObject2);
        localObject2 = Tracker.zzc(this.zzPF).zzjS();
        localObject3 = this.zzPy;
        str1 = ((zzpq)localObject2).zzlg();
        zzam.zzc((Map)localObject3, "an", str1);
        localObject3 = this.zzPy;
        str1 = ((zzpq)localObject2).zzli();
        zzam.zzc((Map)localObject3, "av", str1);
        localObject3 = this.zzPy;
        str1 = ((zzpq)localObject2).zzwK();
        zzam.zzc((Map)localObject3, "aid", str1);
        localObject3 = this.zzPy;
        localObject2 = ((zzpq)localObject2).zzAJ();
        zzam.zzc((Map)localObject3, "aiid", (String)localObject2);
        this.zzPy.put("v", "1");
        localObject2 = this.zzPy;
        localObject4 = zze.zzQm;
        ((Map)localObject2).put("_v", localObject4);
        localObject2 = this.zzPy;
        localObject4 = Tracker.zzd(this.zzPF).zzkZ().getLanguage();
        zzam.zzc((Map)localObject2, "ul", (String)localObject4);
        localObject2 = this.zzPy;
        localObject4 = Tracker.zze(this.zzPF).zzla();
        zzam.zzc((Map)localObject2, "sr", (String)localObject4);
        localObject2 = this.zzPA;
        localObject3 = "transaction";
        bool2 = ((String)localObject2).equals(localObject3);
        if (!bool2)
        {
          localObject2 = this.zzPA;
          localObject3 = "item";
          bool2 = ((String)localObject2).equals(localObject3);
          if (!bool2) {
            break label585;
          }
        }
        bool2 = bool1;
      }
      for (;;)
      {
        if (bool2) {
          break label594;
        }
        localObject2 = Tracker.zzf(this.zzPF);
        bool2 = ((zzad)localObject2).zzlw();
        if (bool2) {
          break label594;
        }
        localObject2 = Tracker.zzg(this.zzPF);
        localObject1 = this.zzPy;
        localObject3 = "Too many hits sent too quickly, rate limiting invoked";
        ((zzaf)localObject2).zzh((Map)localObject1, (String)localObject3);
        break;
        this.zzPy.remove("ate");
        localObject2 = this.zzPy;
        localObject3 = "adid";
        ((Map)localObject2).remove(localObject3);
        break label250;
        bool2 = false;
        localObject2 = null;
      }
      localObject2 = this.zzPy;
      localObject3 = "ht";
      localObject2 = (String)((Map)localObject2).get(localObject3);
      l2 = zzam.zzbt((String)localObject2);
      bool2 = l2 < l1;
      if (!bool2) {
        l2 = this.zzPB;
      }
      bool2 = this.zzPC;
      if (!bool2) {
        break;
      }
      localObject1 = new com/google/android/gms/analytics/internal/zzab;
      localObject3 = this.zzPF;
      localObject4 = this.zzPy;
      bool5 = this.zzPD;
      ((zzab)localObject1).<init>((zzc)localObject3, (Map)localObject4, l2, bool5);
      localObject2 = Tracker.zzh(this.zzPF);
      localObject3 = "Dry run enabled. Would have sent hit";
      ((zzaf)localObject2).zzc((String)localObject3, localObject1);
    }
    String str2 = (String)this.zzPy.get("cid");
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    localObject3 = this.zzPy;
    zzam.zza(localHashMap, "uid", (Map)localObject3);
    localObject3 = this.zzPy;
    zzam.zza(localHashMap, "an", (Map)localObject3);
    localObject3 = this.zzPy;
    zzam.zza(localHashMap, "aid", (Map)localObject3);
    localObject3 = this.zzPy;
    zzam.zza(localHashMap, "av", (Map)localObject3);
    localObject3 = this.zzPy;
    zzam.zza(localHashMap, "aiid", (Map)localObject3);
    zzh localzzh = new com/google/android/gms/analytics/internal/zzh;
    String str3 = this.zzPE;
    localObject2 = this.zzPy;
    localObject3 = "adid";
    localObject2 = (CharSequence)((Map)localObject2).get(localObject3);
    bool2 = TextUtils.isEmpty((CharSequence)localObject2);
    if (!bool2) {}
    for (;;)
    {
      localzzh.<init>(l1, str2, str3, bool1, l1, localHashMap);
      long l3 = Tracker.zzi(this.zzPF).zza(localzzh);
      localObject3 = this.zzPy;
      localObject2 = String.valueOf(l3);
      ((Map)localObject3).put("_s", localObject2);
      localObject1 = new com/google/android/gms/analytics/internal/zzab;
      localObject3 = this.zzPF;
      localObject4 = this.zzPy;
      bool5 = this.zzPD;
      ((zzab)localObject1).<init>((zzc)localObject3, (Map)localObject4, l2, bool5);
      localObject2 = Tracker.zzj(this.zzPF);
      ((zzb)localObject2).zza((zzab)localObject1);
      break;
      bool1 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\Tracker$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */