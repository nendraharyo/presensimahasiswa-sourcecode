package com.google.android.gms.internal;

import android.app.Activity;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.dynamic.zzc;
import com.google.android.gms.dynamic.zzd;
import com.google.android.gms.dynamic.zze;
import com.google.android.gms.dynamic.zzg;
import com.google.android.gms.dynamic.zzg.zza;
import com.google.android.gms.wallet.fragment.WalletFragmentOptions;

public class zzsf
  extends zzg
{
  private static zzsf zzbqD;
  
  protected zzsf()
  {
    super("com.google.android.gms.wallet.dynamite.WalletDynamiteCreatorImpl");
  }
  
  private static zzsf zzIq()
  {
    zzsf localzzsf = zzbqD;
    if (localzzsf == null)
    {
      localzzsf = new com/google/android/gms/internal/zzsf;
      localzzsf.<init>();
      zzbqD = localzzsf;
    }
    return zzbqD;
  }
  
  public static zzrx zza(Activity paramActivity, zzc paramzzc, WalletFragmentOptions paramWalletFragmentOptions, zzry paramzzry)
  {
    int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(paramActivity);
    Object localObject1;
    if (i != 0)
    {
      localObject1 = new com/google/android/gms/common/GooglePlayServicesNotAvailableException;
      ((GooglePlayServicesNotAvailableException)localObject1).<init>(i);
      throw ((Throwable)localObject1);
    }
    try
    {
      Object localObject2 = zzIq();
      localObject2 = ((zzsf)localObject2).zzaB(paramActivity);
      localObject2 = (zzsa)localObject2;
      localObject1 = zze.zzC(paramActivity);
      return ((zzsa)localObject2).zza((zzd)localObject1, paramzzc, paramWalletFragmentOptions, paramzzry);
    }
    catch (RemoteException localRemoteException)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localRemoteException);
      throw ((Throwable)localObject1);
    }
    catch (zzg.zza localzza)
    {
      localObject1 = new java/lang/RuntimeException;
      ((RuntimeException)localObject1).<init>(localzza);
      throw ((Throwable)localObject1);
    }
  }
  
  protected zzsa zzeq(IBinder paramIBinder)
  {
    return zzsa.zza.zzem(paramIBinder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzsf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */