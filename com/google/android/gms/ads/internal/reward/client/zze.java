package com.google.android.gms.ads.internal.reward.client;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.reward.RewardItem;

public class zze
  implements RewardItem
{
  private final zza zzKz;
  
  public zze(zza paramzza)
  {
    this.zzKz = paramzza;
  }
  
  public int getAmount()
  {
    int i = 0;
    zza localzza = this.zzKz;
    if (localzza == null) {}
    for (;;)
    {
      return i;
      try
      {
        localzza = this.zzKz;
        i = localzza.getAmount();
      }
      catch (RemoteException localRemoteException)
      {
        String str = "Could not forward getAmount to RewardItem";
        zzb.zzd(str, localRemoteException);
      }
    }
  }
  
  public String getType()
  {
    String str1 = null;
    zza localzza = this.zzKz;
    if (localzza == null) {}
    for (;;)
    {
      return str1;
      try
      {
        localzza = this.zzKz;
        str1 = localzza.getType();
      }
      catch (RemoteException localRemoteException)
      {
        String str2 = "Could not forward getType to RewardItem";
        zzb.zzd(str2, localRemoteException);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\reward\client\zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */