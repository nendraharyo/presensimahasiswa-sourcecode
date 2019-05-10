package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

public final class v
{
  Runnable a = null;
  Runnable b = null;
  int c = -1;
  private WeakReference d;
  
  v(View paramView)
  {
    WeakReference localWeakReference = new java/lang/ref/WeakReference;
    localWeakReference.<init>(paramView);
    this.d = localWeakReference;
  }
  
  private void a(View paramView, w paramw)
  {
    ViewPropertyAnimator localViewPropertyAnimator;
    v.1 local1;
    if (paramw != null)
    {
      localViewPropertyAnimator = paramView.animate();
      local1 = new android/support/v4/view/v$1;
      local1.<init>(this, paramw, paramView);
      localViewPropertyAnimator.setListener(local1);
    }
    for (;;)
    {
      return;
      localViewPropertyAnimator = paramView.animate();
      local1 = null;
      localViewPropertyAnimator.setListener(null);
    }
  }
  
  public long a()
  {
    Object localObject = (View)this.d.get();
    if (localObject != null) {
      localObject = ((View)localObject).animate();
    }
    for (long l = ((ViewPropertyAnimator)localObject).getDuration();; l = 0L) {
      return l;
    }
  }
  
  public v a(float paramFloat)
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).alpha(paramFloat);
    }
    return this;
  }
  
  public v a(long paramLong)
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).setDuration(paramLong);
    }
    return this;
  }
  
  public v a(w paramw)
  {
    View localView = (View)this.d.get();
    int i;
    if (localView != null)
    {
      i = Build.VERSION.SDK_INT;
      int j = 16;
      if (i < j) {
        break label37;
      }
      a(localView, paramw);
    }
    for (;;)
    {
      return this;
      label37:
      i = 2113929216;
      localView.setTag(i, paramw);
      v.a locala = new android/support/v4/view/v$a;
      locala.<init>(this);
      a(localView, locala);
    }
  }
  
  public v a(y paramy)
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      int i = Build.VERSION.SDK_INT;
      int j = 19;
      if (i >= j)
      {
        i = 0;
        v.2 local2 = null;
        if (paramy != null)
        {
          local2 = new android/support/v4/view/v$2;
          local2.<init>(this, paramy, (View)localObject);
        }
        localObject = ((View)localObject).animate();
        ((ViewPropertyAnimator)localObject).setUpdateListener(local2);
      }
    }
    return this;
  }
  
  public v a(Interpolator paramInterpolator)
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).setInterpolator(paramInterpolator);
    }
    return this;
  }
  
  public v b(float paramFloat)
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).translationY(paramFloat);
    }
    return this;
  }
  
  public v b(long paramLong)
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).setStartDelay(paramLong);
    }
    return this;
  }
  
  public void b()
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).cancel();
    }
  }
  
  public void c()
  {
    Object localObject = (View)this.d.get();
    if (localObject != null)
    {
      localObject = ((View)localObject).animate();
      ((ViewPropertyAnimator)localObject).start();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\v.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */