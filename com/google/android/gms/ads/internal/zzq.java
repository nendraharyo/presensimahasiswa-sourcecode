package com.google.android.gms.ads.internal;

import android.os.Handler;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.internal.zzin;
import java.lang.ref.WeakReference;

public class zzq
{
  private final zzq.zza zzqG;
  private AdRequestParcel zzqH;
  private boolean zzqI = false;
  private boolean zzqJ = false;
  private long zzqK = 0L;
  private final Runnable zzx;
  
  public zzq(zza paramzza)
  {
    this(paramzza, localzza);
  }
  
  zzq(zza paramzza, zzq.zza paramzza1)
  {
    this.zzqG = paramzza1;
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzza);
    zzq.1 local1 = new com/google/android/gms/ads/internal/zzq$1;
    local1.<init>(this, localWeakReference);
    this.zzx = local1;
  }
  
  public void cancel()
  {
    this.zzqI = false;
    zzq.zza localzza = this.zzqG;
    Runnable localRunnable = this.zzx;
    localzza.removeCallbacks(localRunnable);
  }
  
  public void pause()
  {
    this.zzqJ = true;
    boolean bool = this.zzqI;
    if (bool)
    {
      zzq.zza localzza = this.zzqG;
      Runnable localRunnable = this.zzx;
      localzza.removeCallbacks(localRunnable);
    }
  }
  
  public void resume()
  {
    this.zzqJ = false;
    boolean bool = this.zzqI;
    if (bool)
    {
      this.zzqI = false;
      AdRequestParcel localAdRequestParcel = this.zzqH;
      long l = this.zzqK;
      zza(localAdRequestParcel, l);
    }
  }
  
  public void zza(AdRequestParcel paramAdRequestParcel, long paramLong)
  {
    boolean bool = this.zzqI;
    Object localObject;
    if (bool)
    {
      localObject = "An ad refresh is already scheduled.";
      zzin.zzaK((String)localObject);
    }
    for (;;)
    {
      return;
      this.zzqH = paramAdRequestParcel;
      this.zzqI = true;
      this.zzqK = paramLong;
      bool = this.zzqJ;
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        zzin.zzaJ("Scheduling ad refresh " + paramLong + " milliseconds from now.");
        localObject = this.zzqG;
        Runnable localRunnable = this.zzx;
        ((zzq.zza)localObject).postDelayed(localRunnable, paramLong);
      }
    }
  }
  
  public boolean zzbw()
  {
    return this.zzqI;
  }
  
  public void zzg(AdRequestParcel paramAdRequestParcel)
  {
    zza(paramAdRequestParcel, 60000L);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */