package com.google.android.gms.internal;

import android.view.View;
import java.lang.ref.WeakReference;

public class zzau$zzd
  implements zzbb
{
  private final WeakReference zzst;
  private final WeakReference zzsu;
  
  public zzau$zzd(View paramView, zzif paramzzif)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.zzst = localWeakReference;
    localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzzif);
    this.zzsu = localWeakReference;
  }
  
  public View zzco()
  {
    return (View)this.zzst.get();
  }
  
  public boolean zzcp()
  {
    Object localObject = this.zzst.get();
    boolean bool;
    if (localObject != null)
    {
      localObject = this.zzsu.get();
      if (localObject != null) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public zzbb zzcq()
  {
    zzau.zzc localzzc = new com/google/android/gms/internal/zzau$zzc;
    View localView = (View)this.zzst.get();
    zzif localzzif = (zzif)this.zzsu.get();
    localzzc.<init>(localView, localzzif);
    return localzzc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzau$zzd.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */