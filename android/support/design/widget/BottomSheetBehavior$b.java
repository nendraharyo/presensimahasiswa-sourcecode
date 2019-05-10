package android.support.design.widget;

import android.support.v4.view.r;
import android.support.v4.widget.q;
import android.view.View;

class BottomSheetBehavior$b
  implements Runnable
{
  private final View b;
  private final int c;
  
  BottomSheetBehavior$b(BottomSheetBehavior paramBottomSheetBehavior, View paramView, int paramInt)
  {
    this.b = paramView;
    this.c = paramInt;
  }
  
  public void run()
  {
    Object localObject = this.a.e;
    if (localObject != null)
    {
      localObject = this.a.e;
      boolean bool1 = true;
      boolean bool2 = ((q)localObject).a(bool1);
      if (bool2)
      {
        localObject = this.b;
        r.a((View)localObject, this);
      }
    }
    for (;;)
    {
      return;
      localObject = this.a;
      int i = this.c;
      ((BottomSheetBehavior)localObject).b(i);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\BottomSheetBehavior$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */