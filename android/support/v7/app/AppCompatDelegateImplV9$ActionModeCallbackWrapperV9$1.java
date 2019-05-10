package android.support.v7.app;

import android.support.v4.view.r;
import android.support.v4.view.v;
import android.support.v4.view.x;
import android.support.v7.widget.ActionBarContextView;
import android.view.View;
import android.widget.PopupWindow;

class AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1
  extends x
{
  AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1(AppCompatDelegateImplV9.ActionModeCallbackWrapperV9 paramActionModeCallbackWrapperV9) {}
  
  public void onAnimationEnd(View paramView)
  {
    Object localObject = this.this$1.this$0.mActionModeView;
    int i = 8;
    ((ActionBarContextView)localObject).setVisibility(i);
    localObject = this.this$1.this$0.mActionModePopup;
    if (localObject != null)
    {
      localObject = this.this$1.this$0.mActionModePopup;
      ((PopupWindow)localObject).dismiss();
    }
    for (;;)
    {
      this.this$1.this$0.mActionModeView.removeAllViews();
      this.this$1.this$0.mFadeAnim.a(null);
      this.this$1.this$0.mFadeAnim = null;
      return;
      localObject = this.this$1.this$0.mActionModeView.getParent();
      boolean bool = localObject instanceof View;
      if (bool)
      {
        localObject = (View)this.this$1.this$0.mActionModeView.getParent();
        r.o((View)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AppCompatDelegateImplV9$ActionModeCallbackWrapperV9$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */