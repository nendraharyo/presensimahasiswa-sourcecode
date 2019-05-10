package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import java.lang.ref.WeakReference;

class zzjm
  extends zzjn
  implements ViewTreeObserver.OnScrollChangedListener
{
  private final WeakReference zzNv;
  
  public zzjm(View paramView, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramView);
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramOnScrollChangedListener);
    this.zzNv = localWeakReference;
  }
  
  public void onScrollChanged()
  {
    ViewTreeObserver.OnScrollChangedListener localOnScrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)this.zzNv.get();
    if (localOnScrollChangedListener != null) {
      localOnScrollChangedListener.onScrollChanged();
    }
    for (;;)
    {
      return;
      detach();
    }
  }
  
  protected void zza(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.addOnScrollChangedListener(this);
  }
  
  protected void zzb(ViewTreeObserver paramViewTreeObserver)
  {
    paramViewTreeObserver.removeOnScrollChangedListener(this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjm.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */