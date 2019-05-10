package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzj
  extends zzw.zza
{
  private final AppEventListener zzun;
  
  public zzj(AppEventListener paramAppEventListener)
  {
    this.zzun = paramAppEventListener;
  }
  
  public void onAppEvent(String paramString1, String paramString2)
  {
    this.zzun.onAppEvent(paramString1, paramString2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\client\zzj.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */