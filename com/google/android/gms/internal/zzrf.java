package com.google.android.gms.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;
import com.google.android.gms.common.internal.zzf;
import com.google.android.gms.common.internal.zzj;
import java.util.List;

public class zzrf
  extends zzj
{
  private final Context mContext;
  
  public zzrf(Context paramContext, Looper paramLooper, zzf paramzzf, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    super(paramContext, paramLooper, 45, paramzzf, paramConnectionCallbacks, paramOnConnectionFailedListener);
    this.mContext = paramContext;
  }
  
  private String zznn()
  {
    for (;;)
    {
      try
      {
        localObject1 = this.mContext;
        localObject1 = ((Context)localObject1).getPackageManager();
        if (localObject1 != null) {
          continue;
        }
        localObject1 = null;
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Object localObject1;
        Object localObject3;
        int i;
        Object localObject2 = null;
        continue;
      }
      return (String)localObject1;
      localObject3 = this.mContext;
      localObject3 = ((Context)localObject3).getPackageName();
      i = 128;
      localObject1 = ((PackageManager)localObject1).getApplicationInfo((String)localObject3, i);
      if (localObject1 == null)
      {
        localObject1 = null;
      }
      else
      {
        localObject1 = ((ApplicationInfo)localObject1).metaData;
        if (localObject1 == null)
        {
          localObject1 = null;
        }
        else
        {
          localObject3 = "com.google.android.safetynet.API_KEY";
          localObject1 = ((Bundle)localObject1).get((String)localObject3);
          localObject1 = (String)localObject1;
        }
      }
    }
  }
  
  public void zza(zzrc paramzzrc, List paramList, int paramInt, String paramString)
  {
    int[] arrayOfInt = new int[paramList.size()];
    int i = 0;
    Object localObject = null;
    for (int j = 0;; j = i)
    {
      i = paramList.size();
      if (j >= i) {
        break;
      }
      localObject = (Integer)paramList.get(j);
      i = ((Integer)localObject).intValue();
      arrayOfInt[j] = i;
      i = j + 1;
    }
    localObject = (zzrd)zzqJ();
    String str = zznn();
    ((zzrd)localObject).zza(paramzzrc, str, arrayOfInt, paramInt, paramString);
  }
  
  public void zza(zzrc paramzzrc, byte[] paramArrayOfByte)
  {
    ((zzrd)zzqJ()).zza(paramzzrc, paramArrayOfByte);
  }
  
  protected zzrd zzdW(IBinder paramIBinder)
  {
    return zzrd.zza.zzdV(paramIBinder);
  }
  
  protected String zzgu()
  {
    return "com.google.android.gms.safetynet.service.START";
  }
  
  protected String zzgv()
  {
    return "com.google.android.gms.safetynet.internal.ISafetyNetService";
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzrf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */