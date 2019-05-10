package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;

class v$a
  implements w
{
  v a;
  boolean b;
  
  v$a(v paramv)
  {
    this.a = paramv;
  }
  
  public void onAnimationCancel(View paramView)
  {
    int i = 2113929216;
    Object localObject = paramView.getTag(i);
    boolean bool = localObject instanceof w;
    if (bool) {}
    for (localObject = (w)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((w)localObject).onAnimationCancel(paramView);
      }
      return;
      i = 0;
    }
  }
  
  public void onAnimationEnd(View paramView)
  {
    int i = -1;
    Object localObject = this.a;
    int j = ((v)localObject).c;
    if (j > i)
    {
      j = this.a.c;
      paramView.setLayerType(j, null);
      localObject = this.a;
      ((v)localObject).c = i;
    }
    j = Build.VERSION.SDK_INT;
    i = 16;
    int k;
    if (j < i)
    {
      boolean bool2 = this.b;
      if (bool2) {}
    }
    else
    {
      localObject = this.a.b;
      if (localObject != null)
      {
        localObject = this.a.b;
        v localv = this.a;
        localv.b = null;
        ((Runnable)localObject).run();
      }
      k = 2113929216;
      localObject = paramView.getTag(k);
      boolean bool1 = localObject instanceof w;
      if (!bool1) {
        break label154;
      }
    }
    for (localObject = (w)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((w)localObject).onAnimationEnd(paramView);
      }
      k = 1;
      this.b = k;
      return;
      label154:
      k = 0;
    }
  }
  
  public void onAnimationStart(View paramView)
  {
    this.b = false;
    Object localObject = this.a;
    int i = ((v)localObject).c;
    int j = -1;
    if (i > j)
    {
      i = 2;
      paramView.setLayerType(i, null);
    }
    localObject = this.a.a;
    if (localObject != null)
    {
      localObject = this.a.a;
      v localv = this.a;
      localv.a = null;
      ((Runnable)localObject).run();
    }
    i = 2113929216;
    localObject = paramView.getTag(i);
    boolean bool = localObject instanceof w;
    if (bool) {}
    for (localObject = (w)localObject;; localObject = null)
    {
      if (localObject != null) {
        ((w)localObject).onAnimationStart(paramView);
      }
      return;
      i = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\v$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */