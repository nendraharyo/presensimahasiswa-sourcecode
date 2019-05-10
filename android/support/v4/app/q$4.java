package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.h.a;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

final class q$4
  implements Runnable
{
  q$4(s params, a parama, Object paramObject1, q.a parama1, ArrayList paramArrayList1, View paramView, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, ArrayList paramArrayList2, Object paramObject2, Rect paramRect) {}
  
  public void run()
  {
    Object localObject1 = this.a;
    Object localObject2 = this.b;
    Object localObject3 = this.c;
    Object localObject4 = this.d;
    localObject1 = q.a((s)localObject1, (a)localObject2, localObject3, (q.a)localObject4);
    if (localObject1 != null)
    {
      localObject2 = this.e;
      localObject3 = ((a)localObject1).values();
      ((ArrayList)localObject2).addAll((Collection)localObject3);
      localObject2 = this.e;
      localObject3 = this.f;
      ((ArrayList)localObject2).add(localObject3);
    }
    localObject2 = this.g;
    localObject3 = this.h;
    boolean bool = this.i;
    ArrayList localArrayList = null;
    q.a((Fragment)localObject2, (Fragment)localObject3, bool, (a)localObject1, false);
    localObject2 = this.c;
    if (localObject2 != null)
    {
      localObject2 = this.a;
      localObject3 = this.c;
      localObject4 = this.j;
      localArrayList = this.e;
      ((s)localObject2).a(localObject3, (ArrayList)localObject4, localArrayList);
      localObject2 = this.d;
      localObject3 = this.k;
      bool = this.i;
      localObject1 = q.a((a)localObject1, (q.a)localObject2, localObject3, bool);
      if (localObject1 != null)
      {
        localObject2 = this.a;
        localObject3 = this.l;
        ((s)localObject2).a((View)localObject1, (Rect)localObject3);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\q$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */