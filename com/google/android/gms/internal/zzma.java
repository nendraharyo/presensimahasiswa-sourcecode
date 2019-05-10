package com.google.android.gms.internal;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.SystemClock;

public final class zzma
  extends Drawable
  implements Drawable.Callback
{
  private int mFrom;
  private long zzRD;
  private boolean zzajT = true;
  private int zzaka = 0;
  private int zzakb;
  private int zzakc = 255;
  private int zzakd;
  private int zzake = 0;
  private boolean zzakf;
  private zzma.zzb zzakg;
  private Drawable zzakh;
  private Drawable zzaki;
  private boolean zzakj;
  private boolean zzakk;
  private boolean zzakl;
  private int zzakm;
  
  public zzma(Drawable paramDrawable1, Drawable paramDrawable2)
  {
    this(null);
    if (paramDrawable1 == null) {
      paramDrawable1 = zzma.zza.zzqo();
    }
    this.zzakh = paramDrawable1;
    paramDrawable1.setCallback(this);
    localzzb = this.zzakg;
    int i = localzzb.zzakq;
    int j = paramDrawable1.getChangingConfigurations();
    i |= j;
    localzzb.zzakq = i;
    if (paramDrawable2 == null) {
      paramDrawable2 = zzma.zza.zzqo();
    }
    this.zzaki = paramDrawable2;
    paramDrawable2.setCallback(this);
    localzzb = this.zzakg;
    i = localzzb.zzakq;
    j = paramDrawable2.getChangingConfigurations();
    i |= j;
    localzzb.zzakq = i;
  }
  
  zzma(zzma.zzb paramzzb)
  {
    zzma.zzb localzzb = new com/google/android/gms/internal/zzma$zzb;
    localzzb.<init>(paramzzb);
    this.zzakg = localzzb;
  }
  
  public boolean canConstantState()
  {
    boolean bool1 = true;
    boolean bool2 = this.zzakj;
    Drawable.ConstantState localConstantState;
    if (!bool2)
    {
      localConstantState = this.zzakh.getConstantState();
      if (localConstantState == null) {
        break label52;
      }
      localConstantState = this.zzaki.getConstantState();
      if (localConstantState == null) {
        break label52;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      this.zzakk = bool2;
      this.zzakj = bool1;
      return this.zzakk;
      label52:
      bool2 = false;
      localConstantState = null;
    }
  }
  
  public void draw(Canvas paramCanvas)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    float f2 = 1.0F;
    int j = 0;
    float f3 = 0.0F;
    int k = this.zzaka;
    label50:
    boolean bool1;
    Drawable localDrawable1;
    Drawable localDrawable2;
    switch (k)
    {
    default: 
      j = i;
      f3 = f1;
      i = this.zzake;
      bool1 = this.zzajT;
      localDrawable1 = this.zzakh;
      localDrawable2 = this.zzaki;
      if (j != 0)
      {
        if ((!bool1) || (i == 0)) {
          localDrawable1.draw(paramCanvas);
        }
        j = this.zzakc;
        if (i == j)
        {
          j = this.zzakc;
          localDrawable2.setAlpha(j);
          localDrawable2.draw(paramCanvas);
        }
      }
      break;
    }
    for (;;)
    {
      return;
      long l1 = SystemClock.uptimeMillis();
      this.zzRD = l1;
      i = 2;
      f1 = 2.8E-45F;
      this.zzaka = i;
      break label50;
      l1 = this.zzRD;
      long l2 = 0L;
      bool1 = l1 < l2;
      if (bool1) {
        break;
      }
      l1 = SystemClock.uptimeMillis();
      l2 = this.zzRD;
      l1 -= l2;
      float f4 = (float)l1;
      float f5 = this.zzakd;
      f4 /= f5;
      boolean bool2 = f4 < f2;
      if (!bool2) {}
      int m;
      for (;;)
      {
        if (i != 0) {
          this.zzaka = 0;
        }
        f3 = Math.min(f4, f2);
        m = this.mFrom;
        f4 = m;
        int n = this.zzakb;
        int i1 = this.mFrom;
        n -= i1;
        f5 = n;
        f3 = f3 * f5 + f4;
        j = (int)f3;
        this.zzake = j;
        break;
        i = 0;
        f1 = 0.0F;
      }
      if (m != 0)
      {
        j = this.zzakc - i;
        localDrawable1.setAlpha(j);
      }
      localDrawable1.draw(paramCanvas);
      if (m != 0)
      {
        j = this.zzakc;
        localDrawable1.setAlpha(j);
      }
      if (i > 0)
      {
        localDrawable2.setAlpha(i);
        localDrawable2.draw(paramCanvas);
        j = this.zzakc;
        localDrawable2.setAlpha(j);
      }
      invalidateSelf();
    }
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    int j = this.zzakg.zzakp;
    i |= j;
    j = this.zzakg.zzakq;
    return i | j;
  }
  
  public Drawable.ConstantState getConstantState()
  {
    boolean bool = canConstantState();
    if (bool)
    {
      localzzb = this.zzakg;
      int i = getChangingConfigurations();
      localzzb.zzakp = i;
    }
    for (zzma.zzb localzzb = this.zzakg;; localzzb = null)
    {
      return localzzb;
      bool = false;
    }
  }
  
  public int getIntrinsicHeight()
  {
    int i = this.zzakh.getIntrinsicHeight();
    int j = this.zzaki.getIntrinsicHeight();
    return Math.max(i, j);
  }
  
  public int getIntrinsicWidth()
  {
    int i = this.zzakh.getIntrinsicWidth();
    int j = this.zzaki.getIntrinsicWidth();
    return Math.max(i, j);
  }
  
  public int getOpacity()
  {
    boolean bool = this.zzakl;
    if (!bool)
    {
      Drawable localDrawable1 = this.zzakh;
      int i = localDrawable1.getOpacity();
      Drawable localDrawable2 = this.zzaki;
      int j = localDrawable2.getOpacity();
      i = Drawable.resolveOpacity(i, j);
      this.zzakm = i;
      i = 1;
      this.zzakl = i;
    }
    return this.zzakm;
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    boolean bool = zzne.zzsd();
    if (bool)
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.invalidateDrawable(this);
      }
    }
  }
  
  public Drawable mutate()
  {
    boolean bool = this.zzakf;
    if (!bool)
    {
      Object localObject = super.mutate();
      if (localObject == this)
      {
        bool = canConstantState();
        if (!bool)
        {
          localObject = new java/lang/IllegalStateException;
          ((IllegalStateException)localObject).<init>("One or more children of this LayerDrawable does not have constant state; this drawable cannot be mutated.");
          throw ((Throwable)localObject);
        }
        this.zzakh.mutate();
        localObject = this.zzaki;
        ((Drawable)localObject).mutate();
        bool = true;
        this.zzakf = bool;
      }
    }
    return this;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.zzakh.setBounds(paramRect);
    this.zzaki.setBounds(paramRect);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    boolean bool = zzne.zzsd();
    if (bool)
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.scheduleDrawable(this, paramRunnable, paramLong);
      }
    }
  }
  
  public void setAlpha(int paramInt)
  {
    int i = this.zzake;
    int j = this.zzakc;
    if (i == j) {
      this.zzake = paramInt;
    }
    this.zzakc = paramInt;
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.zzakh.setColorFilter(paramColorFilter);
    this.zzaki.setColorFilter(paramColorFilter);
  }
  
  public void startTransition(int paramInt)
  {
    this.mFrom = 0;
    int i = this.zzakc;
    this.zzakb = i;
    this.zzake = 0;
    this.zzakd = paramInt;
    this.zzaka = 1;
    invalidateSelf();
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    boolean bool = zzne.zzsd();
    if (bool)
    {
      Drawable.Callback localCallback = getCallback();
      if (localCallback != null) {
        localCallback.unscheduleDrawable(this, paramRunnable);
      }
    }
  }
  
  public Drawable zzqn()
  {
    return this.zzaki;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzma.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */