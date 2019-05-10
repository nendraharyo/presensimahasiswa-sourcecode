package android.support.design.widget;

import android.support.v4.view.r;
import android.view.View;

class q
{
  private final View a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public q(View paramView)
  {
    this.a = paramView;
  }
  
  private void c()
  {
    View localView = this.a;
    int i = this.d;
    int j = this.a.getTop();
    int k = this.b;
    j -= k;
    i -= j;
    r.c(localView, i);
    localView = this.a;
    i = this.e;
    j = this.a.getLeft();
    k = this.c;
    j -= k;
    i -= j;
    r.d(localView, i);
  }
  
  public void a()
  {
    int i = this.a.getTop();
    this.b = i;
    i = this.a.getLeft();
    this.c = i;
    c();
  }
  
  public boolean a(int paramInt)
  {
    int i = this.d;
    if (i != paramInt)
    {
      this.d = paramInt;
      c();
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
  
  public int b()
  {
    return this.d;
  }
  
  public boolean b(int paramInt)
  {
    int i = this.e;
    if (i != paramInt)
    {
      this.e = paramInt;
      c();
    }
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\q.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */