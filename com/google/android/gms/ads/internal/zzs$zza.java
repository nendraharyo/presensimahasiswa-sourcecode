package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import android.widget.ViewSwitcher;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzjc;
import com.google.android.gms.internal.zzjp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class zzs$zza
  extends ViewSwitcher
{
  private final zziu zzrU;
  private final zzjc zzrV;
  
  public zzs$zza(Context paramContext, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener paramOnScrollChangedListener)
  {
    super(paramContext);
    Object localObject = new com/google/android/gms/internal/zziu;
    ((zziu)localObject).<init>(paramContext);
    this.zzrU = ((zziu)localObject);
    boolean bool = paramContext instanceof Activity;
    if (bool)
    {
      localObject = new com/google/android/gms/internal/zzjc;
      paramContext = (Activity)paramContext;
      ((zzjc)localObject).<init>(paramContext, paramOnGlobalLayoutListener, paramOnScrollChangedListener);
      this.zzrV = ((zzjc)localObject);
      localObject = this.zzrV;
      ((zzjc)localObject).zzhE();
    }
    for (;;)
    {
      return;
      bool = false;
      localObject = null;
      this.zzrV = null;
    }
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    zzjc localzzjc = this.zzrV;
    if (localzzjc != null)
    {
      localzzjc = this.zzrV;
      localzzjc.onAttachedToWindow();
    }
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    zzjc localzzjc = this.zzrV;
    if (localzzjc != null)
    {
      localzzjc = this.zzrV;
      localzzjc.onDetachedFromWindow();
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    this.zzrU.zze(paramMotionEvent);
    return false;
  }
  
  public void removeAllViews()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    Object localObject = null;
    int j = 0;
    Iterator localIterator = null;
    for (;;)
    {
      i = getChildCount();
      if (j >= i) {
        break;
      }
      localObject = getChildAt(j);
      if (localObject != null)
      {
        boolean bool2 = localObject instanceof zzjp;
        if (bool2)
        {
          localObject = (zzjp)localObject;
          localArrayList.add(localObject);
        }
      }
      i = j + 1;
      j = i;
    }
    super.removeAllViews();
    localIterator = localArrayList.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject = (zzjp)localIterator.next();
      ((zzjp)localObject).destroy();
    }
  }
  
  public void zzbY()
  {
    zzin.v("Disable position monitoring on adFrame.");
    zzjc localzzjc = this.zzrV;
    if (localzzjc != null)
    {
      localzzjc = this.zzrV;
      localzzjc.zzhF();
    }
  }
  
  public zziu zzcc()
  {
    return this.zzrU;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\ads\internal\zzs$zza.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */