package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.appinvite.AppInviteInvitationResult;
import com.google.android.gms.appinvite.AppInviteReferral;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

final class zzkl$zze
  extends zzkl.zzb
{
  private final Activity zzUS;
  private final boolean zzUT;
  private final Intent zzUU;
  
  public zzkl$zze(zzkl paramzzkl, GoogleApiClient paramGoogleApiClient, Activity paramActivity, boolean paramBoolean)
  {
    super(paramGoogleApiClient);
    this.zzUS = paramActivity;
    this.zzUT = paramBoolean;
    Object localObject = this.zzUS;
    if (localObject != null) {}
    for (localObject = this.zzUS.getIntent();; localObject = null)
    {
      this.zzUU = ((Intent)localObject);
      return;
    }
  }
  
  protected void zza(zzkm paramzzkm)
  {
    Object localObject = this.zzUU;
    boolean bool = AppInviteReferral.hasReferral((Intent)localObject);
    if (bool)
    {
      localObject = new com/google/android/gms/internal/zzkn;
      Status localStatus = Status.zzagC;
      Intent localIntent = this.zzUU;
      ((zzkn)localObject).<init>(localStatus, localIntent);
      zza((Result)localObject);
    }
    for (;;)
    {
      return;
      localObject = new com/google/android/gms/internal/zzkl$zze$1;
      ((zzkl.zze.1)localObject).<init>(this);
      paramzzkm.zza((zzko)localObject);
    }
  }
  
  protected AppInviteInvitationResult zze(Status paramStatus)
  {
    zzkn localzzkn = new com/google/android/gms/internal/zzkn;
    Intent localIntent = new android/content/Intent;
    localIntent.<init>();
    localzzkn.<init>(paramStatus, localIntent);
    return localzzkn;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzkl$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */