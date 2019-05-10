package android.support.v4.widget;

import android.support.v4.view.r;
import android.view.View;

class a$b
  implements Runnable
{
  a$b(a parama) {}
  
  public void run()
  {
    a locala1 = null;
    Object localObject = this.a;
    boolean bool1 = ((a)localObject).e;
    if (!bool1) {}
    for (;;)
    {
      return;
      localObject = this.a;
      bool1 = ((a)localObject).c;
      if (bool1)
      {
        this.a.c = false;
        localObject = this.a.a;
        ((a.a)localObject).a();
      }
      localObject = this.a.a;
      boolean bool2 = ((a.a)localObject).c();
      if (!bool2)
      {
        locala2 = this.a;
        bool2 = locala2.a();
        if (bool2) {}
      }
      else
      {
        localObject = this.a;
        ((a)localObject).e = false;
        continue;
      }
      a locala2 = this.a;
      bool2 = locala2.d;
      if (bool2)
      {
        this.a.d = false;
        locala2 = this.a;
        locala2.b();
      }
      ((a.a)localObject).d();
      int j = ((a.a)localObject).g();
      int i = ((a.a)localObject).h();
      locala1 = this.a;
      locala1.a(j, i);
      localObject = this.a.b;
      r.a((View)localObject, this);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */