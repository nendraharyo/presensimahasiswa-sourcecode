package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.google.android.gms.internal.zziu;

final class zzd$zzb
  extends RelativeLayout
{
  zziu zzrU;
  
  public zzd$zzb(Context paramContext, String paramString)
  {
    super(paramContext);
    zziu localzziu = new com/google/android/gms/internal/zziu;
    localzziu.<init>(paramContext, paramString);
    this.zzrU = localzziu;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.zzrU.zze(paramMotionEvent);
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzd$zzb.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */