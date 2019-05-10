package android.support.design.widget;

import android.view.MotionEvent;
import android.view.View;

final class b$b
  extends SwipeDismissBehavior
{
  b$b(b paramb) {}
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, b.f paramf, MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    switch (i)
    {
    }
    for (;;)
    {
      return super.a(paramCoordinatorLayout, paramf, paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int j = (int)f2;
      boolean bool = paramCoordinatorLayout.a(paramf, i, j);
      if (bool)
      {
        l locall = l.a();
        l.a locala = this.a.c;
        locall.c(locala);
        continue;
        locall = l.a();
        locala = this.a.c;
        locall.d(locala);
      }
    }
  }
  
  public boolean a(View paramView)
  {
    return paramView instanceof b.f;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\b$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */