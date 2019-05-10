package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.formats.zza;
import java.util.List;

class zzgw$4
  implements zzjf.zza
{
  zzgw$4(zzgw paramzzgw, String paramString, Integer paramInteger1, Integer paramInteger2, int paramInt1, int paramInt2, int paramInt3) {}
  
  public zza zzh(List paramList)
  {
    Object localObject = null;
    if (paramList != null) {}
    for (;;)
    {
      try
      {
        boolean bool = paramList.isEmpty();
        if (!bool) {
          continue;
        }
        bool = false;
        localzza = null;
        localObject = localzza;
      }
      catch (RemoteException localRemoteException)
      {
        zza localzza;
        List localList;
        Integer localInteger1;
        Integer localInteger2;
        int j;
        int k;
        String str = "Could not get attribution icon";
        zzin.zzb(str, localRemoteException);
        continue;
        int i = 0;
        Integer localInteger3 = null;
        continue;
      }
      return (zza)localObject;
      localzza = new com/google/android/gms/ads/internal/formats/zza;
      str = this.zzGT;
      localList = zzgw.zzg(paramList);
      localInteger1 = this.zzGU;
      localInteger2 = this.zzGV;
      i = this.zzGW;
      if (i <= 0) {
        continue;
      }
      i = this.zzGW;
      localInteger3 = Integer.valueOf(i);
      j = this.zzGX;
      k = this.zzGY;
      j += k;
      localzza.<init>(str, localList, localInteger1, localInteger2, localInteger3, j);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgw$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */