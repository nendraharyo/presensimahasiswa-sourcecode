package android.support.v4.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;

final class q$2
  implements Runnable
{
  q$2(Object paramObject1, s params, View paramView, Fragment paramFragment, ArrayList paramArrayList1, ArrayList paramArrayList2, ArrayList paramArrayList3, Object paramObject2) {}
  
  public void run()
  {
    Object localObject1 = this.a;
    Object localObject2;
    Object localObject3;
    ArrayList localArrayList;
    if (localObject1 != null)
    {
      localObject1 = this.b;
      localObject2 = this.a;
      localObject3 = this.c;
      ((s)localObject1).c(localObject2, (View)localObject3);
      localObject1 = this.b;
      localObject2 = this.a;
      localObject3 = this.d;
      localArrayList = this.e;
      View localView = this.c;
      localObject1 = q.a((s)localObject1, localObject2, (Fragment)localObject3, localArrayList, localView);
      localObject2 = this.f;
      ((ArrayList)localObject2).addAll((Collection)localObject1);
    }
    localObject1 = this.g;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      if (localObject1 != null)
      {
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        localObject2 = this.c;
        ((ArrayList)localObject1).add(localObject2);
        localObject2 = this.b;
        localObject3 = this.h;
        localArrayList = this.g;
        ((s)localObject2).b(localObject3, localArrayList, (ArrayList)localObject1);
      }
      this.g.clear();
      localObject1 = this.g;
      localObject2 = this.c;
      ((ArrayList)localObject1).add(localObject2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\q$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */