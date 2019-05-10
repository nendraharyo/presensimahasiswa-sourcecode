package android.support.design.widget;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;

class FloatingActionButton$b
  implements k
{
  FloatingActionButton$b(FloatingActionButton paramFloatingActionButton) {}
  
  public float a()
  {
    return this.a.getSizeDimension() / 2.0F;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a.c.set(paramInt1, paramInt2, paramInt3, paramInt4);
    FloatingActionButton localFloatingActionButton = this.a;
    int i = this.a.a + paramInt1;
    int j = this.a.a + paramInt2;
    int k = this.a.a + paramInt3;
    int m = this.a.a + paramInt4;
    localFloatingActionButton.setPadding(i, j, k, m);
  }
  
  public void a(Drawable paramDrawable)
  {
    FloatingActionButton.a(this.a, paramDrawable);
  }
  
  public boolean b()
  {
    return this.a.b;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\FloatingActionButton$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */