package com.google.android.gms.maps;

import com.google.android.gms.maps.internal.zzb.zza;

final class GoogleMap$zza
  extends zzb.zza
{
  private final GoogleMap.CancelableCallback zzaRO;
  
  GoogleMap$zza(GoogleMap.CancelableCallback paramCancelableCallback)
  {
    this.zzaRO = paramCancelableCallback;
  }
  
  public void onCancel()
  {
    this.zzaRO.onCancel();
  }
  
  public void onFinish()
  {
    this.zzaRO.onFinish();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\maps\GoogleMap$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */