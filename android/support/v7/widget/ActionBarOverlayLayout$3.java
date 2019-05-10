package android.support.v7.widget;

import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;

class ActionBarOverlayLayout$3
  implements Runnable
{
  ActionBarOverlayLayout$3(ActionBarOverlayLayout paramActionBarOverlayLayout) {}
  
  public void run()
  {
    this.this$0.haltActionBarHideOffsetAnimations();
    ActionBarOverlayLayout localActionBarOverlayLayout = this.this$0;
    ViewPropertyAnimator localViewPropertyAnimator = this.this$0.mActionBarTop.animate();
    float f = -this.this$0.mActionBarTop.getHeight();
    localViewPropertyAnimator = localViewPropertyAnimator.translationY(f);
    AnimatorListenerAdapter localAnimatorListenerAdapter = this.this$0.mTopAnimatorListener;
    localViewPropertyAnimator = localViewPropertyAnimator.setListener(localAnimatorListenerAdapter);
    localActionBarOverlayLayout.mCurrentActionBarTopAnimator = localViewPropertyAnimator;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarOverlayLayout$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */