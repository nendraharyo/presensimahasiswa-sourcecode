package com.google.android.gms.internal;

import android.view.View;
import android.view.WindowId;

public class zzis$zze
  extends zzis.zzd
{
  public boolean isAttachedToWindow(View paramView)
  {
    boolean bool = super.isAttachedToWindow(paramView);
    WindowId localWindowId;
    if (!bool)
    {
      localWindowId = paramView.getWindowId();
      if (localWindowId == null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localWindowId = null;
    }
  }
  
  public int zzhx()
  {
    return 14;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzis$zze.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */