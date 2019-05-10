package com.google.android.gms.ads.internal.request;

class zzb$1
  implements Runnable
{
  zzb$1(zzb paramzzb) {}
  
  public void run()
  {
    Object localObject1 = this.zzHj;
    synchronized (zzb.zza((zzb)localObject1))
    {
      localObject1 = this.zzHj;
      localObject1 = ((zzb)localObject1).zzHi;
      if (localObject1 == null) {
        return;
      }
      localObject1 = this.zzHj;
      ((zzb)localObject1).onStop();
      localObject1 = this.zzHj;
      int i = 2;
      String str = "Timed out waiting for ad response.";
      zzb.zza((zzb)localObject1, i, str);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzb$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */