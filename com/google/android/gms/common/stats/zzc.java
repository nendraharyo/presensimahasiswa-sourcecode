package com.google.android.gms.common.stats;

import com.google.android.gms.internal.zzlz;

public final class zzc
{
  public static zzlz zzanx;
  public static zzlz zzany;
  
  static
  {
    int i = 100;
    Integer localInteger = Integer.valueOf(i);
    zzanx = zzlz.zza("gms:common:stats:max_num_of_events", localInteger);
    localInteger = Integer.valueOf(i);
    zzany = zzlz.zza("gms:common:stats:max_chunk_size", localInteger);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\stats\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */