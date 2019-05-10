package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.PublishCallback;

class zzm$zzd
  extends zzg.zza
{
  private final PublishCallback zzbcG;
  
  private zzm$zzd(PublishCallback paramPublishCallback)
  {
    this.zzbcG = paramPublishCallback;
  }
  
  private static zzd zza(PublishCallback paramPublishCallback)
  {
    zzd localzzd;
    if (paramPublishCallback == null) {
      localzzd = null;
    }
    for (;;)
    {
      return localzzd;
      localzzd = new com/google/android/gms/nearby/messages/internal/zzm$zzd;
      localzzd.<init>(paramPublishCallback);
    }
  }
  
  public void onExpired()
  {
    this.zzbcG.onExpired();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */