package android.support.v7.app;

import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.x;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

class AppCompatDelegateImplV9$6
  extends x
{
  AppCompatDelegateImplV9$6(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public void onAnimationEnd(View paramView)
  {
    this.this$0.mActionModeView.setAlpha(1.0F);
    this.this$0.mFadeAnim.a(null);
    this.this$0.mFadeAnim = null;
  }
  
  public void onAnimationStart(View paramView)
  {
    this.this$0.mActionModeView.setVisibility(0);
    Object localObject = this.this$0.mActionModeView;
    int i = 32;
    ((ActionBarContextView)localObject).sendAccessibilityEvent(i);
    localObject = this.this$0.mActionModeView.getParent();
    boolean bool = localObject instanceof View;
    if (bool)
    {
      localObject = (View)this.this$0.mActionModeView.getParent();
      r.o((View)localObject);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */