package com.google.android.gms.internal;

import android.content.Context;

class zzir$1
  implements Runnable
{
  zzir$1(zzir paramzzir, Context paramContext) {}
  
  public void run()
  {
    Object localObject1 = this.zzMf;
    synchronized (zzir.zza((zzir)localObject1))
    {
      localObject1 = this.zzMf;
      Object localObject4 = this.zzMf;
      Context localContext = this.zzxh;
      localObject4 = ((zzir)localObject4).zzK(localContext);
      zzir.zza((zzir)localObject1, (String)localObject4);
      localObject1 = this.zzMf;
      localObject1 = zzir.zza((zzir)localObject1);
      localObject1.notifyAll();
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzir$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */