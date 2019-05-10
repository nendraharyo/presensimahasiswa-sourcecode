package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

class ActionBarOverlayLayout$2
  implements Runnable
{
  ActionBarOverlayLayout$2(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void run()
  {
    this.this$0.haltActionBarHideOffsetAnimations();
    ActionBarOverlayLayout localActionBarOverlayLayout = this.this$0;
    ViewPropertyAnimator localViewPropertyAnimator = this.this$0.mActionBarTop.animate().translationY(0.0F);
    AnimatorListenerAdapter localAnimatorListenerAdapter = this.this$0.mTopAnimatorListener;
    localViewPropertyAnimator = localViewPropertyAnimator.setListener(localAnimatorListenerAdapter);
    localActionBarOverlayLayout.mCurrentActionBarTopAnimator = localViewPropertyAnimator;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarOverlayLayout$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */