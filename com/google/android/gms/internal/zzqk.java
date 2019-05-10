package com.google.android.gms.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.internal.zza.zzb;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import com.google.android.gms.nearby.connection.AppMetadata;

public final class zzqk
  extends zzj
{
  private final long zzaEg;
  
  public zzqk(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 54, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    long l = hashCode();
    this.zzaEg = l;
  }
  
  public void disconnect()
  {
    boolean bool = isConnected();
    if (bool) {}
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zzF(l);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Failed to notify client disconnect.";
        Log.w(str1, str2, localRemoteException);
      }
    }
    super.disconnect();
  }
  
  public String zzEj()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      return ((zzqn)localObject).zzaj(l);
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public String zzEk()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      return ((zzqn)localObject).zzEk();
    }
    catch (RemoteException localRemoteException)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>(localRemoteException);
      throw localRuntimeException;
    }
  }
  
  public void zzEl()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zzag(l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Couldn't stop advertising";
        Log.w(str1, str2, localRemoteException);
      }
    }
  }
  
  public void zzEm()
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zzai(l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Couldn't stop all endpoints";
        Log.w(str1, str2, localRemoteException);
      }
    }
  }
  
  public void zza(zza.zzb paramzzb, String paramString, long paramLong, zzq paramzzq)
  {
    zzqn localzzqn = (zzqn)zzqJ();
    zzqk.zzg localzzg = new com/google/android/gms/internal/zzqk$zzg;
    localzzg.<init>(paramzzb, paramzzq);
    long l = this.zzaEg;
    localzzqn.zza(localzzg, paramString, paramLong, l);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, AppMetadata paramAppMetadata, long paramLong, zzq paramzzq)
  {
    zzqn localzzqn = (zzqn)zzqJ();
    zzqk.zze localzze = new com/google/android/gms/internal/zzqk$zze;
    localzze.<init>(paramzzb, paramzzq);
    long l = this.zzaEg;
    localzzqn.zza(localzze, paramString, paramAppMetadata, paramLong, l);
  }
  
  public void zza(zza.zzb paramzzb, String paramString1, String paramString2, byte[] paramArrayOfByte, zzq paramzzq1, zzq paramzzq2)
  {
    zzqn localzzqn = (zzqn)zzqJ();
    zzqk.zzd localzzd = new com/google/android/gms/internal/zzqk$zzd;
    localzzd.<init>(paramzzb, paramzzq1, paramzzq2);
    long l = this.zzaEg;
    localzzqn.zza(localzzd, paramString1, paramString2, paramArrayOfByte, l);
  }
  
  public void zza(zza.zzb paramzzb, String paramString, byte[] paramArrayOfByte, zzq paramzzq)
  {
    zzqn localzzqn = (zzqn)zzqJ();
    zzqk.zza localzza = new com/google/android/gms/internal/zzqk$zza;
    localzza.<init>(paramzzb, paramzzq);
    long l = this.zzaEg;
    localzzqn.zza(localzza, paramString, paramArrayOfByte, l);
  }
  
  public void zza(String[] paramArrayOfString, byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zza(paramArrayOfString, paramArrayOfByte, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Couldn't send reliable message";
        Log.w(str1, str2, localRemoteException);
      }
    }
  }
  
  public void zzb(String[] paramArrayOfString, byte[] paramArrayOfByte)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zzb(paramArrayOfString, paramArrayOfByte, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Couldn't send unreliable message";
        Log.w(str1, str2, localRemoteException);
      }
    }
  }
  
  protected zzqn zzdv(IBinder paramIBinder)
  {
    return zzqn.zza.zzdx(paramIBinder);
  }
  
  public void zzfA(String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zzi(paramString, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Couldn't disconnect from endpoint";
        Log.w(str1, str2, localRemoteException);
      }
    }
  }
  
  public void zzfz(String paramString)
  {
    try
    {
      Object localObject = zzqJ();
      localObject = (zzqn)localObject;
      long l = this.zzaEg;
      ((zzqn)localObject).zzh(paramString, l);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        String str1 = "NearbyConnectionsClient";
        String str2 = "Couldn't stop discovery";
        Log.w(str1, str2, localRemoteException);
      }
    }
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.nearby.connection.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
  }
  
  public void zzp(zza.zzb paramzzb, String paramString)
  {
    zzqn localzzqn = (zzqn)zzqJ();
    zzqk.zzc localzzc = new com/google/android/gms/internal/zzqk$zzc;
    localzzc.<init>(paramzzb);
    long l = this.zzaEg;
    localzzqn.zza(localzzc, paramString, l);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqk.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */