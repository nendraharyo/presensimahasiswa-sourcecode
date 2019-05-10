package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzlz;

public final class zzc$zza
{
  public static zzlz zzanA;
  public static zzlz zzanB;
  public static zzlz zzanC;
  public static zzlz zzanD;
  public static zzlz zzanE;
  public static zzlz zzanz;
  
  static
  {
    Object localObject = Integer.valueOf(zzd.LOG_LEVEL_OFF);
    zzanz = zzlz.zza("gms:common:stats:connections:level", (Integer)localObject);
    zzanA = zzlz.zzv("gms:common:stats:connections:ignored_calling_processes", "");
    zzanB = zzlz.zzv("gms:common:stats:connections:ignored_calling_services", "");
    zzanC = zzlz.zzv("gms:common:stats:connections:ignored_target_processes", "");
    zzanD = zzlz.zzv("gms:common:stats:connections:ignored_target_services", "com.google.android.gms.auth.GetToken");
    localObject = Long.valueOf(600000L);
    zzanE = zzlz.zza("gms:common:stats:connections:time_out_duration", (Long)localObject);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzc$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */