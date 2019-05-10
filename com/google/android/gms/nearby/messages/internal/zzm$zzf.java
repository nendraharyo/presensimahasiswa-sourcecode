package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.SubscribeCallback;

class zzm$zzf
  extends zzi.zza
{
  private final SubscribeCallback zzbcK;
  
  private zzm$zzf(SubscribeCallback paramSubscribeCallback)
  {
    this.zzbcK = paramSubscribeCallback;
  }
  
  private static zzf zza(SubscribeCallback paramSubscribeCallback)
  {
    zzf localzzf;
    if (paramSubscribeCallback == null) {
      localzzf = null;
    }
    for (;;)
    {
      return localzzf;
      localzzf = new com/google/android/gms/nearby/messages/internal/zzm$zzf;
      localzzf.<init>(paramSubscribeCallback);
    }
  }
  
  public void onExpired()
  {
    this.zzbcK.onExpired();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\nearby\messages\internal\zzm$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */