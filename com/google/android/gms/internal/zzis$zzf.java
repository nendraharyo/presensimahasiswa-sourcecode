package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.Window;
import android.webkit.WebSettings;

public class zzis$zzf
  extends zzis.zzc
{
  public void zza(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public void zza(ViewTreeObserver paramViewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    paramViewTreeObserver.removeOnGlobalLayoutListener(paramOnGlobalLayoutListener);
  }
  
  public boolean zza(Context paramContext, WebSettings paramWebSettings)
  {
    super.zza(paramContext, paramWebSettings);
    paramWebSettings.setAllowFileAccessFromFileURLs(false);
    paramWebSettings.setAllowUniversalAccessFromFileURLs(false);
    return true;
  }
  
  public void zzb(Activity paramActivity, ViewTreeObserver.OnGlobalLayoutListener paramOnGlobalLayoutListener)
  {
    Object localObject1 = paramActivity.getWindow();
    if (localObject1 != null)
    {
      Object localObject2 = ((Window)localObject1).getDecorView();
      if (localObject2 != null)
      {
        localObject2 = ((Window)localObject1).getDecorView().getViewTreeObserver();
        if (localObject2 != null)
        {
          localObject1 = ((Window)localObject1).getDecorView().getViewTreeObserver();
          zza((ViewTreeObserver)localObject1, paramOnGlobalLayoutListener);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\google\android\gms\internal\zzis$zzf.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */