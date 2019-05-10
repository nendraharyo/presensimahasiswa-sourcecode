package com.bumptech.glide.request.target;

import android.util.Log;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.lang.ref.WeakReference;

final class CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener
  implements ViewTreeObserver.OnPreDrawListener
{
  private final WeakReference sizeDeterminerRef;
  
  CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener(CustomViewTarget.SizeDeterminer paramSizeDeterminer)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramSizeDeterminer);
    this.sizeDeterminerRef = localWeakReference;
  }
  
  public boolean onPreDraw()
  {
    Object localObject1 = "CustomViewTarget";
    int i = 2;
    boolean bool = Log.isLoggable((String)localObject1, i);
    if (bool)
    {
      localObject1 = "CustomViewTarget";
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      String str = "OnGlobalLayoutListener called attachStateListener=";
      localObject2 = str + this;
      Log.v((String)localObject1, (String)localObject2);
    }
    localObject1 = (CustomViewTarget.SizeDeterminer)this.sizeDeterminerRef.get();
    if (localObject1 != null) {
      ((CustomViewTarget.SizeDeterminer)localObject1).checkCurrentDimens();
    }
    return true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\CustomViewTarget$SizeDeterminer$SizeDeterminerLayoutListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */