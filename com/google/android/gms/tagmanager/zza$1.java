package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.ads.identifier.AdvertisingIdClient.Info;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

class zza$1
  implements zza.zza
{
  zza$1(zza paramzza) {}
  
  public AdvertisingIdClient.Info zzFV()
  {
    AdvertisingIdClient.Info localInfo = null;
    try
    {
      Object localObject = this.zzbhB;
      localObject = zza.zza((zza)localObject);
      localInfo = AdvertisingIdClient.getAdvertisingIdInfo((Context)localObject);
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;)
      {
        str = "IllegalStateException getting Advertising Id Info";
        zzbg.zzd(str, localIllegalStateException);
      }
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      for (;;)
      {
        str = "GooglePlayServicesRepairableException getting Advertising Id Info";
        zzbg.zzd(str, localGooglePlayServicesRepairableException);
      }
    }
    catch (IOException localIOException)
    {
      for (;;)
      {
        str = "IOException getting Ad Id Info";
        zzbg.zzd(str, localIOException);
      }
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;)
      {
        str = "GooglePlayServicesNotAvailableException getting Advertising Id Info";
        zzbg.zzd(str, localGooglePlayServicesNotAvailableException);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        String str = "Unknown exception. Could not get the Advertising Id Info.";
        zzbg.zzd(str, localException);
      }
    }
    return localInfo;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\tagmanager\zza$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */