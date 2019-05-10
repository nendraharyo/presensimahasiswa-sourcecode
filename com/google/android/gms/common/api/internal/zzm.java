package com.google.android.gms.common.api.internal;

import com.google.android.gms.internal.zznk;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public abstract class zzm
{
  private static final ExecutorService zzaiv;
  
  static
  {
    zznk localzznk = new com/google/android/gms/internal/zznk;
    localzznk.<init>("GAC_Executor");
    zzaiv = Executors.newFixedThreadPool(2, localzznk);
  }
  
  public static ExecutorService zzpN()
  {
    return zzaiv;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\internal\zzm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */