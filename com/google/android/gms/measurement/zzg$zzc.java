package com.google.android.gms.measurement;

import android.os.Process;

class zzg$zzc
  extends Thread
{
  zzg$zzc(Runnable paramRunnable, String paramString)
  {
    super(paramRunnable, paramString);
  }
  
  public void run()
  {
    Process.setThreadPriority(10);
    super.run();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\measurement\zzg$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */