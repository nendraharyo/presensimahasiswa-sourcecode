package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.internal.zzir;

class zzu
  implements Runnable
{
  private boolean mCancelled = false;
  private zzk zzFo;
  
  zzu(zzk paramzzk)
  {
    this.zzFo = paramzzk;
  }
  
  public void cancel()
  {
    this.mCancelled = true;
    zzir.zzMc.removeCallbacks(this);
  }
  
  public void run()
  {
    boolean bool = this.mCancelled;
    if (!bool)
    {
      zzk localzzk = this.zzFo;
      localzzk.zzfF();
      zzfQ();
    }
  }
  
  public void zzfQ()
  {
    zzir.zzMc.postDelayed(this, 250L);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */