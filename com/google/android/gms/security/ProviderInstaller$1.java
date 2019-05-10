package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.zzc;

final class ProviderInstaller$1
  extends AsyncTask
{
  ProviderInstaller$1(Context paramContext, ProviderInstaller.ProviderInstallListener paramProviderInstallListener) {}
  
  protected Integer zzc(Void... paramVarArgs)
  {
    try
    {
      localObject = this.zzxh;
      ProviderInstaller.installIfNeeded((Context)localObject);
      i = 0;
      localObject = Integer.valueOf(0);
    }
    catch (GooglePlayServicesRepairableException localGooglePlayServicesRepairableException)
    {
      for (;;)
      {
        i = localGooglePlayServicesRepairableException.getConnectionStatusCode();
        localObject = Integer.valueOf(i);
      }
    }
    catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
    {
      for (;;)
      {
        int i = localGooglePlayServicesNotAvailableException.errorCode;
        Object localObject = Integer.valueOf(i);
      }
    }
    return (Integer)localObject;
  }
  
  protected void zze(Integer paramInteger)
  {
    int i = paramInteger.intValue();
    Object localObject1;
    if (i == 0)
    {
      localObject1 = this.zzbgR;
      ((ProviderInstaller.ProviderInstallListener)localObject1).onProviderInstalled();
    }
    for (;;)
    {
      return;
      localObject1 = ProviderInstaller.zzFE();
      Object localObject2 = this.zzxh;
      int j = paramInteger.intValue();
      String str = "pi";
      localObject1 = ((zzc)localObject1).zza((Context)localObject2, j, str);
      localObject2 = this.zzbgR;
      j = paramInteger.intValue();
      ((ProviderInstaller.ProviderInstallListener)localObject2).onProviderInstallFailed(j, (Intent)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\security\ProviderInstaller$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */