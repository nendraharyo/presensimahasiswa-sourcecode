package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;

public class zzkm
  extends zzj
{
  private final String zzUW;
  
  public zzkm(Context paramContext, Looper paramLooper, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener, zzf paramzzf)
  {
    super(paramContext, paramLooper, 77, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    localObject = paramzzf.zzqv();
    this.zzUW = ((String)localObject);
  }
  
  private Bundle zzmm()
  {
    Bundle localBundle = new android/os/Bundle;
    localBundle.<init>();
    String str = this.zzUW;
    localBundle.putString("authPackage", str);
    return localBundle;
  }
  
  public void zza(zzko paramzzko)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzkp)localObject;
      ((zzkp)localObject).zza(paramzzko);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  public void zza(zzko paramzzko, String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzkp)localObject;
      ((zzkp)localObject).zza(paramzzko, paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  protected zzkp zzaj(IBinder paramIBinder)
  {
    return zzkp.zza.zzal(paramIBinder);
  }
  
  public void zzb(zzko paramzzko, String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzkp)localObject;
      ((zzkp)localObject).zzb(paramzzko, paramString);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;) {}
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.appinvite.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.appinvite.internal.IAppInviteService";
  }
  
  protected Bundle zzml()
  {
    return zzmm();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */