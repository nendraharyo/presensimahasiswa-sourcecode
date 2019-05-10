package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.internal.zzf;
import java.util.Collections;
import java.util.List;

public abstract class Api$zza
{
  public int getPriority()
  {
    return -1 >>> 1;
  }
  
  public abstract Api.zzb zza(Context paramContext, Looper paramLooper, zzf paramzzf, Object paramObject, GoogleApiClient.ConnectionCallbacks paramConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener paramOnConnectionFailedListener);
  
  public List zzo(Object paramObject)
  {
    return Collections.emptyList();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\common\api\Api$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */