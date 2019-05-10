package com.google.android.gms.maps;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate;
import com.google.android.gms.maps.internal.zzad;
import com.google.android.gms.maps.internal.zzc;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.android.gms.maps.model.internal.zza;

public final class MapsInitializer
{
  private static boolean zznY = false;
  
  public static int initialize(Context paramContext)
  {
    int i = 0;
    Object localObject1 = null;
    Class localClass = MapsInitializer.class;
    Object localObject3 = "Context is null";
    for (;;)
    {
      try
      {
        zzx.zzb(paramContext, localObject3);
        bool = zznY;
        if (!bool) {
          continue;
        }
      }
      finally
      {
        try
        {
          localObject3 = zzad.zzaO(paramContext);
          zza((zzc)localObject3);
          boolean bool = true;
          zznY = bool;
        }
        catch (GooglePlayServicesNotAvailableException localGooglePlayServicesNotAvailableException)
        {
          i = localGooglePlayServicesNotAvailableException.errorCode;
        }
        localObject2 = finally;
      }
      return i;
    }
  }
  
  public static void zza(zzc paramzzc)
  {
    try
    {
      Object localObject = paramzzc.zzAe();
      CameraUpdateFactory.zza((ICameraUpdateFactoryDelegate)localObject);
      localObject = paramzzc.zzAf();
      BitmapDescriptorFactory.zza((zza)localObject);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeRemoteException localRuntimeRemoteException = new com/google/android/gms/maps/model/RuntimeRemoteException;
      localRuntimeRemoteException.<init>(localRemoteException);
      throw localRuntimeRemoteException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\MapsInitializer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */