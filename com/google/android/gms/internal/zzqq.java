package com.google.android.gms.internal;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.panorama.PanoramaApi;

public class zzqq
  implements PanoramaApi
{
  private static void zza(Context paramContext, Uri paramUri)
  {
    paramContext.revokeUriPermission(paramUri, 1);
  }
  
  private static void zza(Context paramContext, zzqp paramzzqp, zzqo paramzzqo, Uri paramUri, Bundle paramBundle)
  {
    paramContext.grantUriPermission("com.google.android.gms", paramUri, 1);
    zzqq.3 local3 = new com/google/android/gms/internal/zzqq$3;
    local3.<init>(paramContext, paramUri, paramzzqo);
    boolean bool = true;
    try
    {
      paramzzqp.zza(local3, paramUri, paramBundle, bool);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zza(paramContext, paramUri);
      throw localRemoteException;
    }
    catch (RuntimeException localRuntimeException)
    {
      zza(paramContext, paramUri);
      throw localRuntimeException;
    }
  }
  
  public PendingResult loadPanoramaInfo(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    zzqq.1 local1 = new com/google/android/gms/internal/zzqq$1;
    local1.<init>(this, paramGoogleApiClient, paramUri);
    return paramGoogleApiClient.zza(local1);
  }
  
  public PendingResult loadPanoramaInfoAndGrantAccess(GoogleApiClient paramGoogleApiClient, Uri paramUri)
  {
    zzqq.2 local2 = new com/google/android/gms/internal/zzqq$2;
    local2.<init>(this, paramGoogleApiClient, paramUri);
    return paramGoogleApiClient.zza(local2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzqq.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */