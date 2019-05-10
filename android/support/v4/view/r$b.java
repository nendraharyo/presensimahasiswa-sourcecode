package android.support.v4.view;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;

class r$b
  extends r.a
{
  public void a(View paramView, int paramInt)
  {
    int i = 4;
    if (paramInt == i) {
      paramInt = 2;
    }
    paramView.setImportantForAccessibility(paramInt);
  }
  
  public void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
  
  public void a(View paramView, Runnable paramRunnable, long paramLong)
  {
    paramView.postOnAnimationDelayed(paramRunnable, paramLong);
  }
  
  public void a(View paramView, boolean paramBoolean)
  {
    paramView.setHasTransientState(paramBoolean);
  }
  
  public boolean b(View paramView)
  {
    return paramView.hasTransientState();
  }
  
  public void c(View paramView)
  {
    paramView.postInvalidateOnAnimation();
  }
  
  public int d(View paramView)
  {
    return paramView.getImportantForAccessibility();
  }
  
  public ViewParent e(View paramView)
  {
    return paramView.getParentForAccessibility();
  }
  
  public int f(View paramView)
  {
    return paramView.getMinimumWidth();
  }
  
  public int g(View paramView)
  {
    return paramView.getMinimumHeight();
  }
  
  public void h(View paramView)
  {
    paramView.requestFitSystemWindows();
  }
  
  public boolean i(View paramView)
  {
    return paramView.getFitsSystemWindows();
  }
  
  public boolean j(View paramView)
  {
    return paramView.hasOverlappingRendering();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\r$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */