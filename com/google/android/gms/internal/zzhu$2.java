package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;

class zzhu$2
  implements Runnable
{
  zzhu$2(zzhu paramzzhu, zzey paramzzey, AdRequestParcel paramAdRequestParcel, zzhx paramzzhx) {}
  
  public void run()
  {
    try
    {
      zzey localzzey = this.zzKG;
      localObject1 = this.zzKH;
      localObject1 = zzhu.zza((zzhu)localObject1);
      localObject1 = zze.zzC(localObject1);
      localObject2 = this.zzpW;
      Object localObject3 = this.zzKH;
      localObject3 = zzhu.zzb((zzhu)localObject3);
      zzhx localzzhx = this.zzKI;
      Object localObject4 = this.zzKH;
      localObject4 = zzhu.zzc((zzhu)localObject4);
      localzzey.zza((zzd)localObject1, (AdRequestParcel)localObject2, (String)localObject3, localzzhx, (String)localObject4);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject1 = ((StringBuilder)localObject1).append("Fail to initialize adapter ");
        Object localObject2 = zzhu.zzd(this.zzKH);
        zzin.zzd((String)localObject2, localRemoteException);
        zzhu localzzhu = this.zzKH;
        localObject1 = zzhu.zzd(this.zzKH);
        localObject2 = null;
        localzzhu.zza((String)localObject1, 0);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzhu$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */