package id.ac.ugm.presensi.presensimahasiswa.utils;

import android.content.Context;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.b;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;

public class BottomNavigationBehavior
  extends CoordinatorLayout.b
{
  public BottomNavigationBehavior() {}
  
  public BottomNavigationBehavior(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  private void a(BottomNavigationView paramBottomNavigationView)
  {
    ViewPropertyAnimator localViewPropertyAnimator = paramBottomNavigationView.animate();
    float f = paramBottomNavigationView.getHeight();
    localViewPropertyAnimator.translationY(f);
  }
  
  private void b(BottomNavigationView paramBottomNavigationView)
  {
    paramBottomNavigationView.animate().translationY(0.0F);
  }
  
  public void a(CoordinatorLayout paramCoordinatorLayout, BottomNavigationView paramBottomNavigationView, View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    if (paramInt2 < 0) {
      b(paramBottomNavigationView);
    }
    for (;;)
    {
      return;
      if (paramInt2 > 0) {
        a(paramBottomNavigationView);
      }
    }
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, BottomNavigationView paramBottomNavigationView, View paramView)
  {
    return paramView instanceof FrameLayout;
  }
  
  public boolean a(CoordinatorLayout paramCoordinatorLayout, BottomNavigationView paramBottomNavigationView, View paramView1, View paramView2, int paramInt)
  {
    int i = 2;
    if (paramInt == i) {}
    for (i = 1;; i = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasisw\\utils\BottomNavigationBehavior.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */