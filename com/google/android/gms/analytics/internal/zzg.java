package com.google.android.gms.analytics.internal;

import android.content.Context;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;

public class zzg
{
  private final Context zzQC;
  private final Context zzsa;
  
  public zzg(Context paramContext)
  {
    zzx.zzz(paramContext);
    Context localContext = paramContext.getApplicationContext();
    zzx.zzb(localContext, "Application context can't be null");
    this.zzsa = localContext;
    this.zzQC = localContext;
  }
  
  public Context getApplicationContext()
  {
    return this.zzsa;
  }
  
  protected zzu zza(zzf paramzzf)
  {
    zzu localzzu = new com/google/android/gms/analytics/internal/zzu;
    localzzu.<init>(paramzzf);
    return localzzu;
  }
  
  protected com.google.android.gms.measurement.zzg zzab(Context paramContext)
  {
    return com.google.android.gms.measurement.zzg.zzaS(paramContext);
  }
  
  protected zzk zzb(zzf paramzzf)
  {
    zzk localzzk = new com/google/android/gms/analytics/internal/zzk;
    localzzk.<init>(paramzzf);
    return localzzk;
  }
  
  protected zza zzc(zzf paramzzf)
  {
    zza localzza = new com/google/android/gms/analytics/internal/zza;
    localzza.<init>(paramzzf);
    return localzza;
  }
  
  protected zzn zzd(zzf paramzzf)
  {
    zzn localzzn = new com/google/android/gms/analytics/internal/zzn;
    localzzn.<init>(paramzzf);
    return localzzn;
  }
  
  protected zzan zze(zzf paramzzf)
  {
    zzan localzzan = new com/google/android/gms/analytics/internal/zzan;
    localzzan.<init>(paramzzf);
    return localzzan;
  }
  
  protected zzaf zzf(zzf paramzzf)
  {
    zzaf localzzaf = new com/google/android/gms/analytics/internal/zzaf;
    localzzaf.<init>(paramzzf);
    return localzzaf;
  }
  
  protected zzr zzg(zzf paramzzf)
  {
    zzr localzzr = new com/google/android/gms/analytics/internal/zzr;
    localzzr.<init>(paramzzf);
    return localzzr;
  }
  
  protected zzmq zzh(zzf paramzzf)
  {
    return zzmt.zzsc();
  }
  
  protected GoogleAnalytics zzi(zzf paramzzf)
  {
    GoogleAnalytics localGoogleAnalytics = new com/google/android/gms/analytics/GoogleAnalytics;
    localGoogleAnalytics.<init>(paramzzf);
    return localGoogleAnalytics;
  }
  
  zzl zzj(zzf paramzzf)
  {
    zzl localzzl = new com/google/android/gms/analytics/internal/zzl;
    localzzl.<init>(paramzzf, this);
    return localzzl;
  }
  
  public Context zzjx()
  {
    return this.zzQC;
  }
  
  zzag zzk(zzf paramzzf)
  {
    zzag localzzag = new com/google/android/gms/analytics/internal/zzag;
    localzzag.<init>(paramzzf);
    return localzzag;
  }
  
  protected zzb zzl(zzf paramzzf)
  {
    zzb localzzb = new com/google/android/gms/analytics/internal/zzb;
    localzzb.<init>(paramzzf, this);
    return localzzb;
  }
  
  public zzj zzm(zzf paramzzf)
  {
    zzj localzzj = new com/google/android/gms/analytics/internal/zzj;
    localzzj.<init>(paramzzf);
    return localzzj;
  }
  
  public zzah zzn(zzf paramzzf)
  {
    zzah localzzah = new com/google/android/gms/analytics/internal/zzah;
    localzzah.<init>(paramzzf);
    return localzzah;
  }
  
  public zzi zzo(zzf paramzzf)
  {
    zzi localzzi = new com/google/android/gms/analytics/internal/zzi;
    localzzi.<init>(paramzzf);
    return localzzi;
  }
  
  public zzv zzp(zzf paramzzf)
  {
    zzv localzzv = new com/google/android/gms/analytics/internal/zzv;
    localzzv.<init>(paramzzf);
    return localzzv;
  }
  
  public zzai zzq(zzf paramzzf)
  {
    zzai localzzai = new com/google/android/gms/analytics/internal/zzai;
    localzzai.<init>(paramzzf);
    return localzzai;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\analytics\internal\zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */