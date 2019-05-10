package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.google.android.gms.ads.internal.zzr;
import java.lang.ref.WeakReference;

class zzjl
  extends zzjn
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  private final WeakReference zzNv;
  
  public zzjl(View paramView, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    super(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnGlobalLayoutListener);
    this.zzNv = localWeakReference;
  }
  
  public void onGlobalLayout()
  {
    ViewTreeObserver.OnGlobalLayoutListener localOnGlobalLayoutListener = (ViewTreeObserver.OnGlobalLayoutListener)this.zzNv.get();
    if (localOnGlobalLayoutListener != null) {
      localOnGlobalLayoutListener.onGlobalLayout();
    }
    for (;;)
    {
      return;
      detach();
    }
  }
  
  protected void zza(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnGlobalLayoutListener(this);
  }
  
  protected void zzb(ViewTreeObserver paramViewTreeObserver)
  {
    zzr.zzbE().zza(paramViewTreeObserver, this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjl.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */