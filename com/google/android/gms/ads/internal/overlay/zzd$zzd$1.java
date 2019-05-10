package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.Window;

class zzd$zzd$1
  implements Runnable
{
  zzd$zzd$1(zzd.zzd paramzzd, Drawable paramDrawable) {}
  
  public void run()
  {
    Window localWindow = zzd.zza(this.zzEz.zzEv).getWindow();
    Drawable localDrawable = this.zzEy;
    localWindow.setBackgroundDrawable(localDrawable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzd$zzd$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */