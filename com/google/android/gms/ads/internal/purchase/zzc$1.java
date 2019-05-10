package com.google.android.gms.ads.internal.purchase;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.internal.zzgg;
import com.google.android.gms.internal.zzgh;
import com.google.android.gms.internal.zzin;

class zzc$1
  implements Runnable
{
  zzc$1(zzc paramzzc, zzf paramzzf, Intent paramIntent) {}
  
  public void run()
  {
    for (;;)
    {
      try
      {
        localObject1 = this.zzFH;
        localObject1 = zzc.zza((zzc)localObject1);
        localObject2 = this.zzFG;
        localObject2 = ((zzf)localObject2).zzFQ;
        int i = -1;
        localIntent1 = this.val$intent;
        boolean bool1 = ((zzk)localObject1).zza((String)localObject2, i, localIntent1);
        if (bool1)
        {
          localObject1 = this.zzFH;
          localzzgh = zzc.zzc((zzc)localObject1);
          localObject1 = new com/google/android/gms/ads/internal/purchase/zzg;
          localObject2 = this.zzFH;
          localObject2 = zzc.zzb((zzc)localObject2);
          localObject3 = this.zzFG;
          localObject3 = ((zzf)localObject3).zzFR;
          bool2 = true;
          j = -1;
          localIntent2 = this.val$intent;
          localzzf = this.zzFG;
          ((zzg)localObject1).<init>((Context)localObject2, (String)localObject3, bool2, j, localIntent2, localzzf);
          localzzgh.zza((zzgg)localObject1);
          return;
        }
      }
      catch (RemoteException localRemoteException)
      {
        Object localObject1;
        Object localObject2;
        Intent localIntent1;
        zzgh localzzgh;
        Object localObject3;
        boolean bool2;
        int j;
        Intent localIntent2;
        zzf localzzf;
        String str = "Fail to verify and dispatch pending transaction";
        zzin.zzaK(str);
        continue;
      }
      localObject1 = this.zzFH;
      localzzgh = zzc.zzc((zzc)localObject1);
      localObject1 = new com/google/android/gms/ads/internal/purchase/zzg;
      localObject2 = this.zzFH;
      localObject2 = zzc.zzb((zzc)localObject2);
      localObject3 = this.zzFG;
      localObject3 = ((zzf)localObject3).zzFR;
      bool2 = false;
      localIntent1 = null;
      j = -1;
      localIntent2 = this.val$intent;
      localzzf = this.zzFG;
      ((zzg)localObject1).<init>((Context)localObject2, (String)localObject3, false, j, localIntent2, localzzf);
      localzzgh.zza((zzgg)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\purchase\zzc$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */