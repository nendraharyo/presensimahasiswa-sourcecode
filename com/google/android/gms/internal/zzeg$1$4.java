package com.google.android.gms.internal;

class zzeg$1$4
  implements Runnable
{
  zzeg$1$4(zzeg.1 param1, zzed paramzzed) {}
  
  public void run()
  {
    Object localObject1 = this.zzBg.zzBe;
    synchronized (zzeg.zzc((zzeg)localObject1))
    {
      localObject1 = this.zzBg;
      localObject1 = ((zzeg.1)localObject1).zzBd;
      int i = ((zzeg.zze)localObject1).getStatus();
      int j = -1;
      if (i != j)
      {
        localObject1 = this.zzBg;
        localObject1 = ((zzeg.1)localObject1).zzBd;
        i = ((zzeg.zze)localObject1).getStatus();
        j = 1;
        if (i != j) {}
      }
      else
      {
        return;
      }
      localObject1 = this.zzBg;
      localObject1 = ((zzeg.1)localObject1).zzBd;
      ((zzeg.zze)localObject1).reject();
      localObject1 = new com/google/android/gms/internal/zzeg$1$4$1;
      ((zzeg.1.4.1)localObject1).<init>(this);
      zzir.runOnUiThread((Runnable)localObject1);
      localObject1 = "Could not receive loaded message in a timely manner. Rejecting.";
      zzin.v((String)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzeg$1$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */