package android.support.v7.widget;

import android.support.v4.view.b;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class ActivityChooserView$2
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  ActivityChooserView$2(ActivityChooserView paramActivityChooserView) {}
  
  public void onGlobalLayout()
  {
    Object localObject = this.this$0;
    boolean bool1 = ((ActivityChooserView)localObject).isShowingPopup();
    if (bool1)
    {
      localObject = this.this$0;
      bool1 = ((ActivityChooserView)localObject).isShown();
      if (bool1) {
        break label41;
      }
      localObject = this.this$0.getListPopupWindow();
      ((ListPopupWindow)localObject).dismiss();
    }
    for (;;)
    {
      return;
      label41:
      this.this$0.getListPopupWindow().show();
      localObject = this.this$0.mProvider;
      if (localObject != null)
      {
        localObject = this.this$0.mProvider;
        boolean bool2 = true;
        ((b)localObject).subUiVisibilityChanged(bool2);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */