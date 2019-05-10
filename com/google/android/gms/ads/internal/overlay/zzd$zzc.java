package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.google.android.gms.internal.zzjp;

public class zzd$zzc
{
  public final Context context;
  public final int index;
  public final ViewGroup.LayoutParams zzEw;
  public final ViewGroup zzEx;
  
  public zzd$zzc(zzjp paramzzjp)
  {
    Object localObject1 = paramzzjp.getLayoutParams();
    this.zzEw = ((ViewGroup.LayoutParams)localObject1);
    localObject1 = paramzzjp.getParent();
    Object localObject2 = paramzzjp.zzhQ();
    this.context = ((Context)localObject2);
    if (localObject1 != null)
    {
      boolean bool = localObject1 instanceof ViewGroup;
      if (bool)
      {
        localObject1 = (ViewGroup)localObject1;
        this.zzEx = ((ViewGroup)localObject1);
        localObject1 = this.zzEx;
        localObject2 = paramzzjp.getView();
        int i = ((ViewGroup)localObject1).indexOfChild((View)localObject2);
        this.index = i;
        localObject1 = this.zzEx;
        localObject2 = paramzzjp.getView();
        ((ViewGroup)localObject1).removeView((View)localObject2);
        paramzzjp.zzD(true);
        return;
      }
    }
    localObject1 = new com/google/android/gms/ads/internal/overlay/zzd$zza;
    ((zzd.zza)localObject1).<init>("Could not get the parent of the WebView for an overlay.");
    throw ((Throwable)localObject1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\overlay\zzd$zzc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */