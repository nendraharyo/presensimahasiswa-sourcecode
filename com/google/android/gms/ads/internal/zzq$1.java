package com.google.android.gms.ads.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import java.lang.ref.WeakReference;

class zzq$1
  implements Runnable
{
  zzq$1(zzq paramzzq, WeakReference paramWeakReference) {}
  
  public void run()
  {
    Object localObject = this.zzqM;
    AdRequestParcel localAdRequestParcel = null;
    zzq.zza((zzq)localObject, false);
    localObject = (zza)this.zzqL.get();
    if (localObject != null)
    {
      localAdRequestParcel = zzq.zza(this.zzqM);
      ((zza)localObject).zzd(localAdRequestParcel);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzq$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */