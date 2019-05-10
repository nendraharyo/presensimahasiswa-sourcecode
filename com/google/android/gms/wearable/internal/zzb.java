package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zzq;
import com.google.android.gms.common.internal.zzx;

final class zzb
  extends zzi
{
  private Object mListener;
  private zzq zzbbi;
  private zzb.zza zzbrA;
  
  private zzb(GoogleApiClient paramGoogleApiClient, Object paramObject, zzq paramzzq, zzb.zza paramzza)
  {
    super(paramGoogleApiClient);
    Object localObject = zzx.zzz(paramObject);
    this.mListener = localObject;
    localObject = (zzq)zzx.zzz(paramzzq);
    this.zzbbi = ((zzq)localObject);
    localObject = (zzb.zza)zzx.zzz(paramzza);
    this.zzbrA = ((zzb.zza)localObject);
  }
  
  static PendingResult zza(GoogleApiClient paramGoogleApiClient, zzb.zza paramzza, Object paramObject)
  {
    zzq localzzq = paramGoogleApiClient.zzr(paramObject);
    zzb localzzb = new com/google/android/gms/wearable/internal/zzb;
    localzzb.<init>(paramGoogleApiClient, paramObject, localzzq, paramzza);
    return paramGoogleApiClient.zza(localzzb);
  }
  
  protected void zza(zzbp paramzzbp)
  {
    zzb.zza localzza = this.zzbrA;
    Object localObject = this.mListener;
    zzq localzzq = this.zzbbi;
    localzza.zza(paramzzbp, this, localObject, localzzq);
    this.mListener = null;
    this.zzbbi = null;
  }
  
  protected Status zzb(Status paramStatus)
  {
    this.mListener = null;
    this.zzbbi = null;
    return paramStatus;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\wearable\internal\zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */