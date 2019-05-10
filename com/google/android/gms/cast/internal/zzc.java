package com.google.android.gms.cast.internal;

import android.os.Handler;
import android.os.Looper;

public abstract class zzc
  extends zzd
{
  protected final Handler mHandler;
  protected final long zzadq;
  protected final Runnable zzadr;
  protected boolean zzads;
  
  public zzc(String paramString1, String paramString2, String paramString3)
  {
    this(paramString1, paramString2, paramString3, 1000L);
  }
  
  public zzc(String paramString1, String paramString2, String paramString3, long paramLong)
  {
    super(paramString1, paramString2, paramString3);
    Object localObject = new android/os/Handler;
    Looper localLooper = Looper.getMainLooper();
    ((Handler)localObject).<init>(localLooper);
    this.mHandler = ((Handler)localObject);
    localObject = new com/google/android/gms/cast/internal/zzc$zza;
    ((zzc.zza)localObject).<init>(this, null);
    this.zzadr = ((Runnable)localObject);
    this.zzadq = paramLong;
    zzW(false);
  }
  
  protected final void zzW(boolean paramBoolean)
  {
    boolean bool = this.zzads;
    Handler localHandler;
    Runnable localRunnable;
    if (bool != paramBoolean)
    {
      this.zzads = paramBoolean;
      if (!paramBoolean) {
        break label46;
      }
      localHandler = this.mHandler;
      localRunnable = this.zzadr;
      long l = this.zzadq;
      localHandler.postDelayed(localRunnable, l);
    }
    for (;;)
    {
      return;
      label46:
      localHandler = this.mHandler;
      localRunnable = this.zzadr;
      localHandler.removeCallbacks(localRunnable);
    }
  }
  
  public void zzof()
  {
    zzW(false);
  }
  
  protected abstract boolean zzz(long paramLong);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\cast\internal\zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */