package com.google.android.gms.games.internal;

import android.app.Activity;
import android.os.IBinder;
import android.view.Display;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import com.google.android.gms.internal.zzne;
import java.lang.ref.WeakReference;

final class PopupManager$PopupManagerHCMR1
  extends PopupManager
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener
{
  private boolean zzaEe = false;
  private WeakReference zzaFN;
  
  protected PopupManager$PopupManagerHCMR1(GamesClientImpl paramGamesClientImpl, int paramInt)
  {
    super(paramGamesClientImpl, paramInt, null);
  }
  
  private void zzq(View paramView)
  {
    int i = 1;
    int j = -1;
    boolean bool2 = zzne.zzsi();
    if (bool2)
    {
      localObject = paramView.getDisplay();
      if (localObject != null) {
        j = ((Display)localObject).getDisplayId();
      }
    }
    Object localObject = paramView.getWindowToken();
    int m = 2;
    int[] arrayOfInt = new int[m];
    paramView.getLocationInWindow(arrayOfInt);
    int n = paramView.getWidth();
    int i1 = paramView.getHeight();
    PopupManager.PopupLocationInfo localPopupLocationInfo1 = this.zzaFK;
    localPopupLocationInfo1.zzaFM = j;
    this.zzaFK.zzaFL = ((IBinder)localObject);
    PopupManager.PopupLocationInfo localPopupLocationInfo2 = this.zzaFK;
    int k = arrayOfInt[0];
    localPopupLocationInfo2.left = k;
    localPopupLocationInfo2 = this.zzaFK;
    k = arrayOfInt[i];
    localPopupLocationInfo2.top = k;
    localPopupLocationInfo2 = this.zzaFK;
    k = arrayOfInt[0] + n;
    localPopupLocationInfo2.right = k;
    localPopupLocationInfo2 = this.zzaFK;
    k = arrayOfInt[i] + i1;
    localPopupLocationInfo2.bottom = k;
    boolean bool1 = this.zzaEe;
    if (bool1)
    {
      zzxh();
      this.zzaEe = false;
    }
  }
  
  public void onGlobalLayout()
  {
    Object localObject = this.zzaFN;
    if (localObject == null) {}
    for (;;)
    {
      return;
      localObject = (View)this.zzaFN.get();
      if (localObject != null) {
        zzq((View)localObject);
      }
    }
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    zzq(paramView);
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    this.zzaFJ.zzwR();
    paramView.removeOnAttachStateChangeListener(this);
  }
  
  protected void zzgv(int paramInt)
  {
    PopupManager.PopupLocationInfo localPopupLocationInfo = new com/google/android/gms/games/internal/PopupManager$PopupLocationInfo;
    localPopupLocationInfo.<init>(paramInt, null, null);
    this.zzaFK = localPopupLocationInfo;
  }
  
  public void zzp(View paramView)
  {
    this.zzaFJ.zzwR();
    Object localObject1 = this.zzaFN;
    if (localObject1 != null)
    {
      localObject1 = (View)this.zzaFN.get();
      localObject2 = this.zzaFJ.getContext();
      if (localObject1 == null)
      {
        boolean bool1 = localObject2 instanceof Activity;
        if (bool1)
        {
          localObject1 = localObject2;
          localObject1 = ((Activity)localObject2).getWindow().getDecorView();
        }
      }
      if (localObject1 != null)
      {
        ((View)localObject1).removeOnAttachStateChangeListener(this);
        localObject1 = ((View)localObject1).getViewTreeObserver();
        boolean bool2 = zzne.zzsh();
        if (!bool2) {
          break label214;
        }
        ((ViewTreeObserver)localObject1).removeOnGlobalLayoutListener(this);
      }
    }
    boolean bool3 = false;
    this.zzaFN = null;
    localObject1 = this.zzaFJ;
    Object localObject2 = ((GamesClientImpl)localObject1).getContext();
    if (paramView == null)
    {
      bool3 = localObject2 instanceof Activity;
      if (bool3)
      {
        localObject1 = localObject2;
        localObject1 = (Activity)localObject2;
        int i = 16908290;
        localObject1 = ((Activity)localObject1).findViewById(i);
        if (localObject1 == null)
        {
          localObject2 = (Activity)localObject2;
          localObject1 = ((Activity)localObject2).getWindow().getDecorView();
        }
        localObject2 = "PopupManager";
        String str = "You have not specified a View to use as content view for popups. Falling back to the Activity content view. Note that this may not work as expected in multi-screen environments";
        GamesLog.zzz((String)localObject2, str);
        paramView = (View)localObject1;
      }
    }
    if (paramView != null)
    {
      zzq(paramView);
      localObject1 = new java/lang/ref/WeakReference;
      ((WeakReference)localObject1).<init>(paramView);
      this.zzaFN = ((WeakReference)localObject1);
      paramView.addOnAttachStateChangeListener(this);
      localObject1 = paramView.getViewTreeObserver();
      ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener(this);
    }
    for (;;)
    {
      return;
      label214:
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener(this);
      break;
      localObject1 = "PopupManager";
      localObject2 = "No content view usable to display popups. Popups will not be displayed in response to this client's calls. Use setViewForPopups() to set your content view.";
      GamesLog.zzA((String)localObject1, (String)localObject2);
    }
  }
  
  public void zzxh()
  {
    Object localObject = this.zzaFK.zzaFL;
    if (localObject != null)
    {
      super.zzxh();
      return;
    }
    localObject = this.zzaFN;
    boolean bool;
    if (localObject != null) {
      bool = true;
    }
    for (;;)
    {
      this.zzaEe = bool;
      break;
      bool = false;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\games\internal\PopupManager$PopupManagerHCMR1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */