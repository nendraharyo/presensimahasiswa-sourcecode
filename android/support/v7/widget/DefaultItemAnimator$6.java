package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;

class DefaultItemAnimator$6
  extends AnimatorListenerAdapter
{
  DefaultItemAnimator$6(DefaultItemAnimator paramDefaultItemAnimator, RecyclerView.ViewHolder paramViewHolder, int paramInt1, View paramView, int paramInt2, ViewPropertyAnimator paramViewPropertyAnimator) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    int i = this.val$deltaX;
    View localView;
    if (i != 0)
    {
      localView = this.val$view;
      localView.setTranslationX(0.0F);
    }
    i = this.val$deltaY;
    if (i != 0)
    {
      localView = this.val$view;
      localView.setTranslationY(0.0F);
    }
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.val$animation.setListener(null);
    Object localObject = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$holder;
    ((DefaultItemAnimator)localObject).dispatchMoveFinished(localViewHolder);
    localObject = this.this$0.mMoveAnimations;
    localViewHolder = this.val$holder;
    ((ArrayList)localObject).remove(localViewHolder);
    this.this$0.dispatchFinishedWhenDone();
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    DefaultItemAnimator localDefaultItemAnimator = this.this$0;
    RecyclerView.ViewHolder localViewHolder = this.val$holder;
    localDefaultItemAnimator.dispatchMoveStarting(localViewHolder);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DefaultItemAnimator$6.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */