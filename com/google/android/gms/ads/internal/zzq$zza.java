package com.google.android.gms.ads.internal;

import android.os.Handler;

public class zzq$zza
{
  private final Handler mHandler;
  
  public zzq$zza(Handler paramHandler)
  {
    this.mHandler = paramHandler;
  }
  
  public boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    return this.mHandler.postDelayed(paramRunnable, paramLong);
  }
  
  public void removeCallbacks(Runnable paramRunnable)
  {
    this.mHandler.removeCallbacks(paramRunnable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzq$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */