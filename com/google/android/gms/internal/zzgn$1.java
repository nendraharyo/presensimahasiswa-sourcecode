package com.google.android.gms.internal;

import java.util.concurrent.atomic.AtomicBoolean;

class zzgn$1
  implements Runnable
{
  zzgn$1(zzgn paramzzgn) {}
  
  public void run()
  {
    Object localObject = zzgn.zza(this.zzGi);
    boolean bool = ((AtomicBoolean)localObject).get();
    if (!bool) {}
    for (;;)
    {
      return;
      zzin.e("Timed out waiting for WebView to finish loading.");
      localObject = this.zzGi;
      ((zzgn)localObject).cancel();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgn$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */