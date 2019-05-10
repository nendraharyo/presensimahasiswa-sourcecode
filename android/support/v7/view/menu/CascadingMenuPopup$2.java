package android.support.v7.view.menu;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class CascadingMenuPopup$2
  implements View.OnAttachStateChangeListener
{
  CascadingMenuPopup$2(CascadingMenuPopup paramCascadingMenuPopup) {}
  
  public void onViewAttachedToWindow(View paramView) {}
  
  public void onViewDetachedFromWindow(View paramView)
  {
    Object localObject1 = CascadingMenuPopup.access$000(this.this$0);
    if (localObject1 != null)
    {
      localObject1 = CascadingMenuPopup.access$000(this.this$0);
      boolean bool = ((ViewTreeObserver)localObject1).isAlive();
      if (!bool)
      {
        localObject1 = this.this$0;
        localObject2 = paramView.getViewTreeObserver();
        CascadingMenuPopup.access$002((CascadingMenuPopup)localObject1, (ViewTreeObserver)localObject2);
      }
      localObject1 = CascadingMenuPopup.access$000(this.this$0);
      Object localObject2 = CascadingMenuPopup.access$100(this.this$0);
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
    }
    paramView.removeOnAttachStateChangeListener(this);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\CascadingMenuPopup$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */