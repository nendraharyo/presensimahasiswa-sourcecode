package com.google.android.gms.internal;

import java.util.concurrent.Future;

public abstract class zzim
  implements zzit
{
  private volatile Thread zzLM;
  private boolean zzLN;
  private final Runnable zzx;
  
  public zzim()
  {
    zzim.1 local1 = new com/google/android/gms/internal/zzim$1;
    local1.<init>(this);
    this.zzx = local1;
    this.zzLN = false;
  }
  
  public zzim(boolean paramBoolean)
  {
    zzim.1 local1 = new com/google/android/gms/internal/zzim$1;
    local1.<init>(this);
    this.zzx = local1;
    this.zzLN = paramBoolean;
  }
  
  public final void cancel()
  {
    onStop();
    Thread localThread = this.zzLM;
    if (localThread != null)
    {
      localThread = this.zzLM;
      localThread.interrupt();
    }
  }
  
  public abstract void onStop();
  
  public abstract void zzbr();
  
  public final Future zzhn()
  {
    int i = this.zzLN;
    Runnable localRunnable;
    if (i != 0)
    {
      i = 1;
      localRunnable = this.zzx;
    }
    for (zzjg localzzjg = zziq.zza(i, localRunnable);; localzzjg = zziq.zza(this.zzx)) {
      return localzzjg;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzim.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */