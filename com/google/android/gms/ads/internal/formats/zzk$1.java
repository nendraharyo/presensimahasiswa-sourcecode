package com.google.android.gms.ads.internal.formats;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.internal.zzjp;

class zzk$1
  implements Runnable
{
  zzk$1(zzk paramzzk, zzi paramzzi) {}
  
  public void run()
  {
    Object localObject = this.zzyJ.zzdR();
    if (localObject != null)
    {
      FrameLayout localFrameLayout = zzk.zza(this.zzyK);
      localObject = ((zzjp)localObject).getView();
      localFrameLayout.addView((View)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\formats\zzk$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */