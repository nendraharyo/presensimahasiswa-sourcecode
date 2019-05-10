package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.google.android.gms.internal.zzmq;

public class zzai
  extends zzd
{
  private SharedPreferences zzTh;
  private long zzTi;
  private long zzTj = -1;
  private final zzai.zza zzTk;
  
  protected zzai(zzf paramzzf)
  {
    super(paramzzf);
    zzai.zza localzza = new com/google/android/gms/analytics/internal/zzai$zza;
    long l = zzjn().zzkX();
    localzza.<init>(this, "monitoring", l, null);
    this.zzTk = localzza;
  }
  
  public void zzbp(String paramString)
  {
    zzjk();
    zzjv();
    Object localObject = this.zzTh.edit();
    boolean bool1 = TextUtils.isEmpty(paramString);
    String str;
    if (bool1)
    {
      str = "installation_campaign";
      ((SharedPreferences.Editor)localObject).remove(str);
    }
    for (;;)
    {
      boolean bool2 = ((SharedPreferences.Editor)localObject).commit();
      if (!bool2)
      {
        localObject = "Failed to commit campaign data";
        zzbg((String)localObject);
      }
      return;
      str = "installation_campaign";
      ((SharedPreferences.Editor)localObject).putString(str, paramString);
    }
  }
  
  protected void zziJ()
  {
    SharedPreferences localSharedPreferences = getContext().getSharedPreferences("com.google.android.gms.analytics.prefs", 0);
    this.zzTh = localSharedPreferences;
  }
  
  public long zzlF()
  {
    long l1 = 0L;
    zzjk();
    zzjv();
    long l2 = this.zzTi;
    boolean bool1 = l2 < l1;
    Object localObject1;
    boolean bool2;
    if (!bool1)
    {
      localObject1 = this.zzTh;
      String str1 = "first_run";
      l2 = ((SharedPreferences)localObject1).getLong(str1, l1);
      bool2 = l2 < l1;
      if (!bool2) {
        break label66;
      }
    }
    for (this.zzTi = l2;; this.zzTi = l2)
    {
      return this.zzTi;
      label66:
      localObject1 = zzjl();
      l2 = ((zzmq)localObject1).currentTimeMillis();
      Object localObject2 = this.zzTh.edit();
      String str2 = "first_run";
      ((SharedPreferences.Editor)localObject2).putLong(str2, l2);
      bool2 = ((SharedPreferences.Editor)localObject2).commit();
      if (!bool2)
      {
        localObject2 = "Failed to commit first run time";
        zzbg((String)localObject2);
      }
    }
  }
  
  public zzaj zzlG()
  {
    zzaj localzzaj = new com/google/android/gms/analytics/internal/zzaj;
    zzmq localzzmq = zzjl();
    long l = zzlF();
    localzzaj.<init>(localzzmq, l);
    return localzzaj;
  }
  
  public long zzlH()
  {
    zzjk();
    zzjv();
    long l1 = this.zzTj;
    long l2 = -1;
    boolean bool = l1 < l2;
    if (!bool)
    {
      SharedPreferences localSharedPreferences = this.zzTh;
      String str = "last_dispatch";
      l2 = 0L;
      l1 = localSharedPreferences.getLong(str, l2);
      this.zzTj = l1;
    }
    return this.zzTj;
  }
  
  public void zzlI()
  {
    zzjk();
    zzjv();
    long l = zzjl().currentTimeMillis();
    SharedPreferences.Editor localEditor = this.zzTh.edit();
    localEditor.putLong("last_dispatch", l);
    localEditor.apply();
    this.zzTj = l;
  }
  
  public String zzlJ()
  {
    Object localObject1 = null;
    zzjk();
    zzjv();
    Object localObject2 = this.zzTh;
    String str = "installation_campaign";
    localObject2 = ((SharedPreferences)localObject2).getString(str, null);
    boolean bool = TextUtils.isEmpty((CharSequence)localObject2);
    if (bool) {}
    for (;;)
    {
      return (String)localObject1;
      localObject1 = localObject2;
    }
  }
  
  public zzai.zza zzlK()
  {
    return this.zzTk;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzai.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */