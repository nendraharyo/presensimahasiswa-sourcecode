package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.appinvite.AppInviteApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;

public class zzkl
  implements AppInviteApi
{
  public PendingResult convertInvitation(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzkl.zzd localzzd = new com/google/android/gms/internal/zzkl$zzd;
    localzzd.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(localzzd);
  }
  
  public PendingResult getInvitation(GoogleApiClient paramGoogleApiClient, Activity paramActivity, boolean paramBoolean)
  {
    zzkl.zze localzze = new com/google/android/gms/internal/zzkl$zze;
    localzze.<init>(this, paramGoogleApiClient, paramActivity, paramBoolean);
    return paramGoogleApiClient.zza(localzze);
  }
  
  public PendingResult updateInvitationOnInstall(GoogleApiClient paramGoogleApiClient, String paramString)
  {
    zzkl.zzc localzzc = new com/google/android/gms/internal/zzkl$zzc;
    localzzc.<init>(this, paramGoogleApiClient, paramString);
    return paramGoogleApiClient.zza(localzzc);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */