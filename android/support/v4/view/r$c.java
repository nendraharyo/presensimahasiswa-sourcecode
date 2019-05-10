package android.support.v4.view;

import android.view.Display;
import android.view.View;

class r$c
  extends r.b
{
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramView.setPaddingRelative(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public int k(View paramView)
  {
    return paramView.getLayoutDirection();
  }
  
  public int l(View paramView)
  {
    return paramView.getPaddingStart();
  }
  
  public int m(View paramView)
  {
    return paramView.getPaddingEnd();
  }
  
  public int n(View paramView)
  {
    return paramView.getWindowSystemUiVisibility();
  }
  
  public boolean o(View paramView)
  {
    return paramView.isPaddingRelative();
  }
  
  public Display p(View paramView)
  {
    return paramView.getDisplay();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\r$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */