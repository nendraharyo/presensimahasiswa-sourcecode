package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$4
  extends AnimatorListenerAdapter
{
  DefaultItemAnimator$4(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, ViewPropertyAnimator paramViewPropertyAnimator, View paramView) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$animation.setListener(null);
    this.val$view.setAlpha(1.0F);
    Object localObject = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$holder;
    ((DefaultItemAnimator)localObject).dispatchRemoveFinished(localViewHolder);
    localObject = this.this$0.mRemoveAnimations;
    localViewHolder = this.val$holder;
    ((ArrayList)localObject).remove(localViewHolder);
    this.this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    DefaultItemAnimator localDefaultItemAnimator = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$holder;
    localDefaultItemAnimator.dispatchRemoveStarting(localViewHolder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */