package com.google.android.gms.internal;

import android.os.Process;

class zznl
  implements Runnable
{
  private final int mPriority;
  private final Runnable zzx;
  
  public zznl(Runnable paramRunnable, int paramInt)
  {
    this.zzx = paramRunnable;
    this.mPriority = paramInt;
  }
  
  public void run()
  {
    Process.setThreadPriority(this.mPriority);
    this.zzx.run();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zznl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */