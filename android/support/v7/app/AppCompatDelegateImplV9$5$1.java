package android.support.v7.app;

import android.support.v4.view.v;
import android.support.v4.view.x;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;

class AppCompatDelegateImplV9$5$1
  extends x
{
  AppCompatDelegateImplV9$5$1(AppCompatDelegateImplV9.5 param5) {}
  
  public void onAnimationEnd(View paramView)
  {
    this.this$1.this$0.mActionModeView.setAlpha(1.0F);
    this.this$1.this$0.mFadeAnim.a(null);
    this.this$1.this$0.mFadeAnim = null;
  }
  
  public void onAnimationStart(View paramView)
  {
    this.this$1.this$0.mActionModeView.setVisibility(0);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$5$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */