package com.bumptech.glide.util;

import android.view.View;
import com.bumptech.glide.ListPreloader.PreloadSizeProvider;
import com.bumptech.glide.request.target.SizeReadyCallback;
import java.util.Arrays;

public class ViewPreloadSizeProvider
  implements ListPreloader.PreloadSizeProvider, SizeReadyCallback
{
  private int[] size;
  private ViewPreloadSizeProvider.SizeViewTarget viewTarget;
  
  public ViewPreloadSizeProvider() {}
  
  public ViewPreloadSizeProvider(View paramView)
  {
    ViewPreloadSizeProvider.SizeViewTarget localSizeViewTarget = new com/bumptech/glide/util/ViewPreloadSizeProvider$SizeViewTarget;
    localSizeViewTarget.<init>(paramView, this);
    this.viewTarget = localSizeViewTarget;
  }
  
  public int[] getPreloadSize(Object paramObject, int paramInt1, int paramInt2)
  {
    int[] arrayOfInt1 = this.size;
    if (arrayOfInt1 == null) {}
    int i;
    for (arrayOfInt1 = null;; arrayOfInt1 = Arrays.copyOf(arrayOfInt1, i))
    {
      return arrayOfInt1;
      arrayOfInt1 = this.size;
      int[] arrayOfInt2 = this.size;
      i = arrayOfInt2.length;
    }
  }
  
  public void onSizeReady(int paramInt1, int paramInt2)
  {
    int[] arrayOfInt = new int[2];
    arrayOfInt[0] = paramInt1;
    arrayOfInt[1] = paramInt2;
    this.size = arrayOfInt;
    this.viewTarget = null;
  }
  
  public void setView(View paramView)
  {
    Object localObject = this.size;
    if (localObject == null)
    {
      localObject = this.viewTarget;
      if (localObject == null) {
        break label19;
      }
    }
    for (;;)
    {
      return;
      label19:
      localObject = new com/bumptech/glide/util/ViewPreloadSizeProvider$SizeViewTarget;
      ((ViewPreloadSizeProvider.SizeViewTarget)localObject).<init>(paramView, this);
      this.viewTarget = ((ViewPreloadSizeProvider.SizeViewTarget)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glid\\util\ViewPreloadSizeProvider.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */