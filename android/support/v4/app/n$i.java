package android.support.v4.app;

import java.util.ArrayList;

class n$i
  implements Fragment.c
{
  private final boolean a;
  private final d b;
  private int c;
  
  n$i(d paramd, boolean paramBoolean)
  {
    this.a = paramBoolean;
    this.b = paramd;
  }
  
  public void a()
  {
    int i = this.c + -1;
    this.c = i;
    i = this.c;
    if (i != 0) {}
    for (;;)
    {
      return;
      n localn = this.b.a;
      n.a(localn);
    }
  }
  
  public void b()
  {
    int i = this.c + 1;
    this.c = i;
  }
  
  public boolean c()
  {
    int i = this.c;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  public void d()
  {
    boolean bool1 = true;
    boolean bool2 = false;
    int i = this.c;
    if (i > 0) {}
    for (boolean bool3 = bool1;; bool3 = false)
    {
      n localn = this.b.a;
      localObject = localn.e;
      int j = ((ArrayList)localObject).size();
      int k = 0;
      locald = null;
      while (k < j)
      {
        localObject = (Fragment)localn.e.get(k);
        boolean bool4 = false;
        ((Fragment)localObject).setOnStartEnterTransitionListener(null);
        if (bool3)
        {
          bool4 = ((Fragment)localObject).isPostponed();
          if (bool4) {
            ((Fragment)localObject).startPostponedEnterTransition();
          }
        }
        i = k + 1;
        k = i;
      }
    }
    Object localObject = this.b.a;
    d locald = this.b;
    boolean bool5 = this.a;
    if (!bool3) {
      bool2 = bool1;
    }
    n.a((n)localObject, locald, bool5, bool2, bool1);
  }
  
  public void e()
  {
    n localn = this.b.a;
    d locald = this.b;
    boolean bool = this.a;
    n.a(localn, locald, bool, false, false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */