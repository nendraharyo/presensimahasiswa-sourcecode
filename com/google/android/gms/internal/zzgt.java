package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

public class zzgt
  extends zzgs
{
  private Object zzGv;
  private PopupWindow zzGw;
  private boolean zzGx;
  
  zzgt(Context paramContext, zzif.zza paramzza, zzjp paramzzjp, zzgr.zza paramzza1)
  {
    super(paramContext, paramzza, paramzzjp, paramzza1);
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.zzGv = localObject;
    this.zzGx = false;
  }
  
  private void zzgj()
  {
    Object localObject1 = this.zzGv;
    boolean bool = true;
    try
    {
      this.zzGx = bool;
      Object localObject2 = this.mContext;
      bool = localObject2 instanceof Activity;
      if (bool)
      {
        localObject2 = this.mContext;
        localObject2 = (Activity)localObject2;
        bool = ((Activity)localObject2).isDestroyed();
        if (bool)
        {
          bool = false;
          localObject2 = null;
          this.zzGw = null;
        }
      }
      localObject2 = this.zzGw;
      if (localObject2 != null)
      {
        localObject2 = this.zzGw;
        bool = ((PopupWindow)localObject2).isShowing();
        if (bool)
        {
          localObject2 = this.zzGw;
          ((PopupWindow)localObject2).dismiss();
        }
        bool = false;
        localObject2 = null;
        this.zzGw = null;
      }
      return;
    }
    finally {}
  }
  
  public void cancel()
  {
    zzgj();
    super.cancel();
  }
  
  protected void zzC(int paramInt)
  {
    zzgj();
    super.zzC(paramInt);
  }
  
  protected void zzgi()
  {
    boolean bool1 = false;
    Object localObject1 = null;
    int i = -1;
    Object localObject4 = this.mContext;
    boolean bool3 = localObject4 instanceof Activity;
    if (bool3) {
      localObject1 = ((Activity)this.mContext).getWindow();
    }
    for (localObject4 = localObject1;; localObject4 = null)
    {
      if (localObject4 != null)
      {
        localObject1 = ((Window)localObject4).getDecorView();
        if (localObject1 != null) {
          break label54;
        }
      }
      for (;;)
      {
        return;
        label54:
        localObject1 = (Activity)this.mContext;
        bool1 = ((Activity)localObject1).isDestroyed();
        boolean bool2;
        PopupWindow localPopupWindow;
        int j;
        int k;
        Object localObject2;
        if (!bool1)
        {
          localObject1 = new android/widget/FrameLayout;
          ??? = this.mContext;
          ((FrameLayout)localObject1).<init>((Context)???);
          ??? = new android/view/ViewGroup$LayoutParams;
          ((ViewGroup.LayoutParams)???).<init>(i, i);
          ((FrameLayout)localObject1).setLayoutParams((ViewGroup.LayoutParams)???);
          ??? = this.zzpD.getView();
          ((FrameLayout)localObject1).addView((View)???, i, i);
          synchronized (this.zzGv)
          {
            bool2 = this.zzGx;
            if (!bool2) {}
          }
          localPopupWindow = new android/widget/PopupWindow;
          j = 1;
          k = 1;
          localPopupWindow.<init>(localView, j, k, false);
          this.zzGw = localPopupWindow;
          localObject2 = this.zzGw;
          bool2 = true;
          ((PopupWindow)localObject2).setOutsideTouchable(bool2);
          localObject2 = this.zzGw;
          bool2 = false;
          localPopupWindow = null;
          ((PopupWindow)localObject2).setClippingEnabled(false);
          localObject2 = "Displaying the 1x1 popup off the screen.";
          zzin.zzaI((String)localObject2);
        }
        try
        {
          localObject2 = this.zzGw;
          localObject4 = ((Window)localObject4).getDecorView();
          bool2 = false;
          localPopupWindow = null;
          j = -1;
          k = -1;
          ((PopupWindow)localObject2).showAtLocation((View)localObject4, 0, j, k);
        }
        catch (Exception localException)
        {
          for (;;)
          {
            bool1 = false;
            Object localObject3 = null;
            this.zzGw = null;
          }
        }
      }
      bool3 = false;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzgt.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */