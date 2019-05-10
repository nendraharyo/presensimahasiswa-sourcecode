package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$7
  extends AnimatorListenerAdapter
{
  DefaultItemAnimator$7(DefaultItemAnimator paramDefaultItemAnimator, DefaultItemAnimator.ChangeInfo paramChangeInfo, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$oldViewAnim.setListener(null);
    this.val$view.setAlpha(1.0F);
    this.val$view.setTranslationX(0.0F);
    this.val$view.setTranslationY(0.0F);
    Object localObject = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$changeInfo.oldHolder;
    ((DefaultItemAnimator)localObject).dispatchChangeFinished(localViewHolder, true);
    localObject = this.this$0.mChangeAnimations;
    localViewHolder = this.val$changeInfo.oldHolder;
    ((ArrayList)localObject).remove(localViewHolder);
    this.this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    DefaultItemAnimator localDefaultItemAnimator = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$changeInfo.oldHolder;
    localDefaultItemAnimator.dispatchChangeStarting(localViewHolder, true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */