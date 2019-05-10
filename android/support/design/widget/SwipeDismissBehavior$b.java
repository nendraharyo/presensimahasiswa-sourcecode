package android.support.design.widget;

import android.support.v4.view.r;
import android.support.v4.widget.q;
import android.view.View;

class SwipeDismissBehavior$b
  implements Runnable
{
  private final View b;
  private final boolean c;
  
  SwipeDismissBehavior$b(SwipeDismissBehavior paramSwipeDismissBehavior, View paramView, boolean paramBoolean)
  {
    this.b = paramView;
    this.c = paramBoolean;
  }
  
  public void run()
  {
    Object localObject = this.a.b;
    boolean bool2;
    if (localObject != null)
    {
      localObject = this.a.b;
      boolean bool1 = true;
      bool2 = ((q)localObject).a(bool1);
      if (bool2)
      {
        localObject = this.b;
        r.a((View)localObject, this);
      }
    }
    for (;;)
    {
      return;
      bool2 = this.c;
      if (bool2)
      {
        localObject = this.a.c;
        if (localObject != null)
        {
          localObject = this.a.c;
          View localView = this.b;
          ((SwipeDismissBehavior.a)localObject).a(localView);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\SwipeDismissBehavior$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */