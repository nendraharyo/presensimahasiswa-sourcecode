package com.google.android.gms.ads.internal.request;

import android.os.Handler;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzit;
import com.google.android.gms.internal.zzji;

class zzb$2
  implements Runnable
{
  zzb$2(zzb paramzzb, zzji paramzzji) {}
  
  public void run()
  {
    Object localObject1 = this.zzHj;
    synchronized (zzb.zza((zzb)localObject1))
    {
      localObject1 = this.zzHj;
      Object localObject4 = this.zzHj;
      Object localObject5 = this.zzHj;
      localObject5 = zzb.zzb((zzb)localObject5);
      localObject5 = ((AdRequestInfoParcel.zza)localObject5).zzrl;
      zzji localzzji = this.zzHk;
      localObject4 = ((zzb)localObject4).zza((VersionInfoParcel)localObject5, localzzji);
      ((zzb)localObject1).zzHi = ((zzit)localObject4);
      localObject1 = this.zzHj;
      localObject1 = ((zzb)localObject1).zzHi;
      if (localObject1 == null)
      {
        localObject1 = this.zzHj;
        localObject4 = null;
        localObject5 = "Could not start the ad request service.";
        zzb.zza((zzb)localObject1, 0, (String)localObject5);
        localObject1 = zzir.zzMc;
        localObject4 = this.zzHj;
        localObject4 = zzb.zzc((zzb)localObject4);
        ((Handler)localObject1).removeCallbacks((Runnable)localObject4);
      }
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\request\zzb$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */