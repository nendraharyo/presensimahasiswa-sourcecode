package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public final class zzj$zzg
  extends zzj.zza
{
  public final IBinder zzalP;
  
  public zzj$zzg(zzj paramzzj, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramzzj, paramInt, paramBundle);
    this.zzalP = paramIBinder;
  }
  
  protected void zzj(ConnectionResult paramConnectionResult)
  {
    GoogleApiClient.OnConnectionFailedListener localOnConnectionFailedListener = zzj.zzf(this.zzalL);
    if (localOnConnectionFailedListener != null)
    {
      localOnConnectionFailedListener = zzj.zzf(this.zzalL);
      localOnConnectionFailedListener.onConnectionFailed(paramConnectionResult);
    }
    this.zzalL.onConnectionFailed(paramConnectionResult);
  }
  
  protected boolean zzqL()
  {
    bool1 = false;
    localBundle = null;
    try
    {
      Object localObject1 = this.zzalP;
      localObject1 = ((IBinder)localObject1).getInterfaceDescriptor();
      localObject3 = this.zzalL.zzgv();
      boolean bool2 = ((String)localObject3).equals(localObject1);
      if (bool2) {
        break label129;
      }
      localObject3 = "GmsClient";
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      localStringBuilder = localStringBuilder.append("service descriptor mismatch: ");
      String str = this.zzalL.zzgv();
      localStringBuilder = localStringBuilder.append(str);
      str = " vs. ";
      localStringBuilder = localStringBuilder.append(str);
      localObject1 = (String)localObject1;
      Log.e((String)localObject3, (String)localObject1);
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        Object localObject2 = "GmsClient";
        Object localObject3 = "service probably died";
        Log.w((String)localObject2, (String)localObject3);
        continue;
        localObject2 = this.zzalL;
        localObject3 = this.zzalP;
        localObject2 = ((zzj)localObject2).zzW((IBinder)localObject3);
        if (localObject2 != null)
        {
          localObject3 = this.zzalL;
          int i = 2;
          int j = 3;
          boolean bool3 = zzj.zza((zzj)localObject3, i, j, (IInterface)localObject2);
          if (bool3)
          {
            localBundle = this.zzalL.zzoi();
            localObject2 = zzj.zzc(this.zzalL);
            if (localObject2 != null)
            {
              localObject2 = zzj.zzc(this.zzalL);
              ((GoogleApiClient.ConnectionCallbacks)localObject2).onConnected(localBundle);
            }
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\internal\zzj$zzg.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */