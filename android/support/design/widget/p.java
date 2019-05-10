package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class p
  extends CoordinatorLayout.b
{
  private q a;
  private int b = 0;
  private int c = 0;
  
  public p() {}
  
  public p(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public boolean a(int paramInt)
  {
    q localq = this.a;
    boolean bool;
    if (localq != null)
    {
      localq = this.a;
      bool = localq.a(paramInt);
    }
    for (;;)
    {
      return bool;
      this.b = paramInt;
      bool = false;
      localq = null;
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    b(paramCoordinatorLayout, paramView, paramInt);
    q localq = this.a;
    if (localq == null)
    {
      localq = new android/support/design/widget/q;
      localq.<init>(paramView);
      this.a = localq;
    }
    localq = this.a;
    localq.a();
    int i = this.b;
    int j;
    if (i != 0)
    {
      localq = this.a;
      j = this.b;
      localq.a(j);
      this.b = 0;
    }
    i = this.c;
    if (i != 0)
    {
      localq = this.a;
      j = this.c;
      localq.b(j);
      this.c = 0;
    }
    return true;
  }
  
  public int b()
  {
    q localq = this.a;
    int i;
    if (localq != null)
    {
      localq = this.a;
      i = localq.b();
    }
    for (;;)
    {
      return i;
      i = 0;
      localq = null;
    }
  }
  
  protected void b(CoordinatorLayout paramCoordinatorLayout, View paramView, int paramInt)
  {
    paramCoordinatorLayout.a(paramView, paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\p.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */