package com.google.android.gms.internal;

import android.view.View;
import com.google.android.gms.ads.internal.formats.zzh;
import java.lang.ref.WeakReference;

public class zzau$zza
  implements zzbb
{
  private WeakReference zzsq;
  
  public zzau$zza(zzh paramzzh)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramzzh);
    this.zzsq = localWeakReference;
  }
  
  public View zzco()
  {
    Object localObject = (zzh)this.zzsq.get();
    if (localObject != null) {}
    for (localObject = ((zzh)localObject).zzdS();; localObject = null) {
      return (View)localObject;
    }
  }
  
  public boolean zzcp()
  {
    Object localObject = this.zzsq.get();
    boolean bool;
    if (localObject == null) {
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
    zzau.zzb localzzb = new com/google/android/gms/internal/zzau$zzb;
    zzh localzzh = (zzh)this.zzsq.get();
    localzzb.<init>(localzzh);
    return localzzb;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzau$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */