package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$8
  extends AnimatorListenerAdapter
{
  DefaultItemAnimator$8(DefaultItemAnimator paramDefaultItemAnimator, DefaultItemAnimator.ChangeInfo paramChangeInfo, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$newViewAnimation.setListener(null);
    this.val$newView.setAlpha(1.0F);
    this.val$newView.setTranslationX(0.0F);
    this.val$newView.setTranslationY(0.0F);
    Object localObject = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$changeInfo.newHolder;
    ((DefaultItemAnimator)localObject).dispatchChangeFinished(localViewHolder, false);
    localObject = this.this$0.mChangeAnimations;
    localViewHolder = this.val$changeInfo.newHolder;
    ((ArrayList)localObject).remove(localViewHolder);
    this.this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    DefaultItemAnimator localDefaultItemAnimator = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$changeInfo.newHolder;
    localDefaultItemAnimator.dispatchChangeStarting(localViewHolder, false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$8.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */