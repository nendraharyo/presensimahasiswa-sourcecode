package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.h.a;
import android.view.View;

final class q$3
  implements Runnable
{
  q$3(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, a parama, View paramView, s params, Rect paramRect) {}
  
  public void run()
  {
    Object localObject1 = this.a;
    Object localObject2 = this.b;
    boolean bool = this.c;
    a locala = this.d;
    q.a((Fragment)localObject1, (Fragment)localObject2, bool, locala, false);
    localObject1 = this.e;
    if (localObject1 != null)
    {
      localObject1 = this.f;
      localObject2 = this.e;
      Rect localRect = this.g;
      ((s)localObject1).a((View)localObject2, localRect);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\q$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */