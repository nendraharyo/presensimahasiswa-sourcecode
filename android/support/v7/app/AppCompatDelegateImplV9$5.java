package android.support.v7.app;

import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.w;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatDelegateImplV9$5
  implements Runnable
{
  AppCompatDelegateImplV9$5(AppCompatDelegateImplV9 paramAppCompatDelegateImplV9) {}
  
  public void run()
  {
    float f = 1.0F;
    Object localObject1 = this.this$0.mActionModePopup;
    Object localObject2 = this.this$0.mActionModeView;
    int i = 55;
    ((PopupWindow)localObject1).showAtLocation((View)localObject2, i, 0, 0);
    this.this$0.endOnGoingFadeAnimation();
    localObject1 = this.this$0;
    boolean bool = ((AppCompatDelegateImplV9)localObject1).shouldAnimateActionModeView();
    if (bool)
    {
      this.this$0.mActionModeView.setAlpha(0.0F);
      localObject1 = this.this$0;
      localObject2 = r.k(this.this$0.mActionModeView).a(f);
      ((AppCompatDelegateImplV9)localObject1).mFadeAnim = ((v)localObject2);
      localObject1 = this.this$0.mFadeAnim;
      localObject2 = new android/support/v7/app/AppCompatDelegateImplV9$5$1;
      ((AppCompatDelegateImplV9.5.1)localObject2).<init>(this);
      ((v)localObject1).a((w)localObject2);
    }
    for (;;)
    {
      return;
      this.this$0.mActionModeView.setAlpha(f);
      localObject1 = this.this$0.mActionModeView;
      ((ActionBarContextView)localObject1).setVisibility(0);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */