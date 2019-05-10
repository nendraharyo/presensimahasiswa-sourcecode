package com.google.android.gms.internal;

import android.app.Activity;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.ads.internal.zzr;

public final class zzjc
{
  private Activity zzMM;
  private boolean zzMN;
  private boolean zzMO;
  private boolean zzMP;
  private ViewTreeObserver.OnGlobalLayoutListener zzMQ;
  private ViewTreeObserver.OnScrollChangedListener zzMR;
  
  public zzjc(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    this.zzMM = paramActivity;
    this.zzMQ = paramOnGlobalLayoutListener;
    this.zzMR = paramOnScrollChangedListener;
  }
  
  private void zzhG()
  {
    Object localObject1 = this.zzMM;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      boolean bool = this.zzMN;
      if (!bool)
      {
        localObject1 = this.zzMQ;
        Activity localActivity;
        Object localObject2;
        if (localObject1 != null)
        {
          localObject1 = zzr.zzbC();
          localActivity = this.zzMM;
          localObject2 = this.zzMQ;
          ((zzir)localObject1).zza(localActivity, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        }
        localObject1 = this.zzMR;
        if (localObject1 != null)
        {
          localObject1 = zzr.zzbC();
          localActivity = this.zzMM;
          localObject2 = this.zzMR;
          ((zzir)localObject1).zza(localActivity, (ViewTreeObserver.OnScrollChangedListener)localObject2);
        }
        bool = true;
        this.zzMN = bool;
      }
    }
  }
  
  private void zzhH()
  {
    Object localObject1 = this.zzMM;
    if (localObject1 == null) {}
    for (;;)
    {
      return;
      boolean bool = this.zzMN;
      if (bool)
      {
        localObject1 = this.zzMQ;
        Activity localActivity;
        Object localObject2;
        if (localObject1 != null)
        {
          localObject1 = zzr.zzbE();
          localActivity = this.zzMM;
          localObject2 = this.zzMQ;
          ((zzis)localObject1).zzb(localActivity, (ViewTreeObserver.OnGlobalLayoutListener)localObject2);
        }
        localObject1 = this.zzMR;
        if (localObject1 != null)
        {
          localObject1 = zzr.zzbC();
          localActivity = this.zzMM;
          localObject2 = this.zzMR;
          ((zzir)localObject1).zzb(localActivity, (ViewTreeObserver.OnScrollChangedListener)localObject2);
        }
        bool = false;
        localObject1 = null;
        this.zzMN = false;
      }
    }
  }
  
  public void onAttachedToWindow()
  {
    this.zzMO = true;
    boolean bool = this.zzMP;
    if (bool) {
      zzhG();
    }
  }
  
  public void onDetachedFromWindow()
  {
    this.zzMO = false;
    zzhH();
  }
  
  public void zzhE()
  {
    this.zzMP = true;
    boolean bool = this.zzMO;
    if (bool) {
      zzhG();
    }
  }
  
  public void zzhF()
  {
    this.zzMP = false;
    zzhH();
  }
  
  public void zzi(Activity paramActivity)
  {
    this.zzMM = paramActivity;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzjc.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */