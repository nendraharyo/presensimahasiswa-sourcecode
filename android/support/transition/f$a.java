package android.support.transition;

import android.graphics.PointF;
import android.view.View;

class f$a
{
  private int a;
  private int b;
  private int c;
  private int d;
  private View e;
  private int f;
  private int g;
  
  f$a(View paramView)
  {
    this.e = paramView;
  }
  
  private void a()
  {
    View localView = this.e;
    int i = this.a;
    int j = this.b;
    int k = this.c;
    int m = this.d;
    am.a(localView, i, j, k, m);
    this.f = 0;
    this.g = 0;
  }
  
  void a(PointF paramPointF)
  {
    int i = Math.round(paramPointF.x);
    this.a = i;
    float f1 = paramPointF.y;
    i = Math.round(f1);
    this.b = i;
    i = this.f + 1;
    this.f = i;
    i = this.f;
    int j = this.g;
    if (i == j) {
      a();
    }
  }
  
  void b(PointF paramPointF)
  {
    int i = Math.round(paramPointF.x);
    this.c = i;
    float f1 = paramPointF.y;
    i = Math.round(f1);
    this.d = i;
    i = this.g + 1;
    this.g = i;
    i = this.f;
    int j = this.g;
    if (i == j) {
      a();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */