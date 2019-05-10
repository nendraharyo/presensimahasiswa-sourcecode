package com.google.android.gms.internal;

import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

abstract class zzjn
{
  private final WeakReference zzNw;
  
  public zzjn(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.zzNw = localWeakReference;
  }
  
  public final void detach()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver != null) {
      zzb(localViewTreeObserver);
    }
  }
  
  protected ViewTreeObserver getViewTreeObserver()
  {
    Object localObject = (View)this.zzNw.get();
    if (localObject == null) {
      localObject = null;
    }
    for (;;)
    {
      return (ViewTreeObserver)localObject;
      localObject = ((View)localObject).getViewTreeObserver();
      if (localObject != null)
      {
        boolean bool = ((ViewTreeObserver)localObject).isAlive();
        if (bool) {}
      }
      else
      {
        localObject = null;
      }
    }
  }
  
  protected abstract void zza(ViewTreeObserver paramViewTreeObserver);
  
  protected abstract void zzb(ViewTreeObserver paramViewTreeObserver);
  
  public final void zzhL()
  {
    ViewTreeObserver localViewTreeObserver = getViewTreeObserver();
    if (localViewTreeObserver != null) {
      zza(localViewTreeObserver);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjn.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */