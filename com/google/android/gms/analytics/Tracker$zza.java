package com.google.android.gms.analytics;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.analytics.internal.zzal;
import com.google.android.gms.analytics.internal.zzd;
import com.google.android.gms.analytics.internal.zzf;
import com.google.android.gms.internal.zzmq;
import java.util.HashMap;
import java.util.Map;

class Tracker$zza
  extends zzd
  implements GoogleAnalytics.zza
{
  private boolean zzPG;
  private int zzPH;
  private long zzPI = -1;
  private boolean zzPJ;
  private long zzPK;
  
  protected Tracker$zza(Tracker paramTracker, zzf paramzzf)
  {
    super(paramzzf);
  }
  
  private void zziN()
  {
    long l1 = this.zzPI;
    long l2 = 0L;
    boolean bool = l1 < l2;
    GoogleAnalytics localGoogleAnalytics;
    zza localzza;
    if (bool)
    {
      bool = this.zzPG;
      if (!bool) {}
    }
    else
    {
      localGoogleAnalytics = zziC();
      localzza = Tracker.zza(this.zzPF);
      localGoogleAnalytics.zza(localzza);
    }
    for (;;)
    {
      return;
      localGoogleAnalytics = zziC();
      localzza = Tracker.zza(this.zzPF);
      localGoogleAnalytics.zzb(localzza);
    }
  }
  
  public void enableAutoActivityTracking(boolean paramBoolean)
  {
    this.zzPG = paramBoolean;
    zziN();
  }
  
  public void setSessionTimeout(long paramLong)
  {
    this.zzPI = paramLong;
    zziN();
  }
  
  protected void zziJ() {}
  
  public boolean zziM()
  {
    try
    {
      boolean bool = this.zzPJ;
      this.zzPJ = false;
      return bool;
    }
    finally {}
  }
  
  boolean zziO()
  {
    zzmq localzzmq = zzjl();
    long l1 = localzzmq.elapsedRealtime();
    long l2 = this.zzPK;
    long l3 = this.zzPI;
    long l4 = Math.max(1000L, l3);
    l2 += l4;
    boolean bool = l1 < l2;
    if (!bool) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localzzmq = null;
    }
  }
  
  public void zzl(Activity paramActivity)
  {
    int i = this.zzPH;
    if (i == 0)
    {
      boolean bool1 = zziO();
      if (bool1)
      {
        bool1 = true;
        this.zzPJ = bool1;
      }
    }
    int j = this.zzPH + 1;
    this.zzPH = j;
    boolean bool2 = this.zzPG;
    Object localObject2;
    Object localObject3;
    String str;
    if (bool2)
    {
      localObject1 = paramActivity.getIntent();
      if (localObject1 != null)
      {
        localObject2 = this.zzPF;
        localObject1 = ((Intent)localObject1).getData();
        ((Tracker)localObject2).setCampaignParamsOnNextHit((Uri)localObject1);
      }
      localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      ((Map)localObject2).put("&t", "screenview");
      localObject3 = this.zzPF;
      str = "&cd";
      localObject1 = Tracker.zzk(this.zzPF);
      if (localObject1 == null) {
        break label201;
      }
    }
    label201:
    for (Object localObject1 = Tracker.zzk(this.zzPF).zzo(paramActivity);; localObject1 = paramActivity.getClass().getCanonicalName())
    {
      ((Tracker)localObject3).set(str, (String)localObject1);
      localObject1 = (CharSequence)((Map)localObject2).get("&dr");
      bool2 = TextUtils.isEmpty((CharSequence)localObject1);
      if (bool2)
      {
        localObject1 = Tracker.zzn(paramActivity);
        boolean bool3 = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool3)
        {
          localObject3 = "&dr";
          ((Map)localObject2).put(localObject3, localObject1);
        }
      }
      localObject1 = this.zzPF;
      ((Tracker)localObject1).send((Map)localObject2);
      return;
    }
  }
  
  public void zzm(Activity paramActivity)
  {
    int i = this.zzPH + -1;
    this.zzPH = i;
    zzmq localzzmq = null;
    int j = this.zzPH;
    i = Math.max(0, j);
    this.zzPH = i;
    i = this.zzPH;
    if (i == 0)
    {
      localzzmq = zzjl();
      long l = localzzmq.elapsedRealtime();
      this.zzPK = l;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\Tracker$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */