package android.support.design.widget;

import android.support.v4.view.r;
import android.view.View;
import android.widget.OverScroller;

class h$a
  implements Runnable
{
  private final CoordinatorLayout b;
  private final View c;
  
  h$a(h paramh, CoordinatorLayout paramCoordinatorLayout, View paramView)
  {
    this.b = paramCoordinatorLayout;
    this.c = paramView;
  }
  
  public void run()
  {
    Object localObject = this.c;
    CoordinatorLayout localCoordinatorLayout;
    View localView;
    if (localObject != null)
    {
      localObject = this.a.a;
      if (localObject != null)
      {
        localObject = this.a.a;
        boolean bool = ((OverScroller)localObject).computeScrollOffset();
        if (!bool) {
          break label91;
        }
        localObject = this.a;
        localCoordinatorLayout = this.b;
        localView = this.c;
        OverScroller localOverScroller = this.a.a;
        int i = localOverScroller.getCurrY();
        ((h)localObject).a_(localCoordinatorLayout, localView, i);
        localObject = this.c;
        r.a((View)localObject, this);
      }
    }
    for (;;)
    {
      return;
      label91:
      localObject = this.a;
      localCoordinatorLayout = this.b;
      localView = this.c;
      ((h)localObject).a(localCoordinatorLayout, localView);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\h$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */