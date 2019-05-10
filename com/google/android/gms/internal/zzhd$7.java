package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.request.zzk;
import com.google.android.gms.ads.internal.zzr;

class zzhd$7
  implements Runnable
{
  zzhd$7(zzhd paramzzhd, AdRequestInfoParcel paramAdRequestInfoParcel, zzk paramzzk) {}
  
  public void run()
  {
    localObject1 = null;
    try
    {
      localObject2 = this.zzJe;
      localObject4 = this.zzIV;
      localObject2 = ((zzhd)localObject2).zzd((AdRequestInfoParcel)localObject4);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        try
        {
          Object localObject2;
          localObject1 = this.zzJf;
          ((zzk)localObject1).zzb((AdResponseParcel)localObject2);
          return;
        }
        catch (RemoteException localRemoteException)
        {
          Object localObject4;
          boolean bool;
          Object localObject3;
          localObject1 = "Fail to forward ad response.";
          zzin.zzd((String)localObject1, localRemoteException);
          continue;
        }
        localException = localException;
        localObject4 = zzr.zzbF();
        bool = true;
        ((zzih)localObject4).zzb(localException, bool);
        localObject4 = "Could not fetch ad response due to an Exception.";
        zzin.zzd((String)localObject4, localException);
        localObject3 = null;
      }
    }
    if (localObject2 == null)
    {
      localObject2 = new com/google/android/gms/ads/internal/request/AdResponseParcel;
      localObject1 = null;
      ((AdResponseParcel)localObject2).<init>(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhd$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */