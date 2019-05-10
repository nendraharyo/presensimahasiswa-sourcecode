package android.support.v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

class z
  implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener
{
  private final View a;
  private ViewTreeObserver b;
  private final Runnable c;
  
  private z(View paramView, Runnable paramRunnable)
  {
    this.a = paramView;
    ViewTreeObserver localViewTreeObserver = paramView.getViewTreeObserver();
    this.b = localViewTreeObserver;
    this.c = paramRunnable;
  }
  
  public static z a(View paramView, Runnable paramRunnable)
  {
    z localz = new android/support/v4/app/z;
    localz.<init>(paramView, paramRunnable);
    paramView.getViewTreeObserver().addOnPreDrawListener(localz);
    paramView.addOnAttachStateChangeListener(localz);
    return localz;
  }
  
  public void a()
  {
    ViewTreeObserver localViewTreeObserver = this.b;
    boolean bool = localViewTreeObserver.isAlive();
    if (bool)
    {
      localViewTreeObserver = this.b;
      localViewTreeObserver.removeOnPreDrawListener(this);
    }
    for (;;)
    {
      this.a.removeOnAttachStateChangeListener(this);
      return;
      localViewTreeObserver = this.a.getViewTreeObserver();
      localViewTreeObserver.removeOnPreDrawListener(this);
    }
  }
  
  public boolean onPreDraw()
  {
    a();
    this.c.run();
    return true;
  }
  
  public void onViewAttachedToWindow(View paramView)
  {
    ViewTreeObserver localViewTreeObserver = paramView.getViewTreeObserver();
    this.b = localViewTreeObserver;
  }
  
  public void onViewDetachedFromWindow(View paramView)
  {
    a();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\z.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */