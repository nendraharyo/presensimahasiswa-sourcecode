package android.support.v7.widget.helper;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;

class ItemTouchHelper$RecoverAnimation
  implements Animator.AnimatorListener
{
  final int mActionState;
  final int mAnimationType;
  boolean mEnded = false;
  private float mFraction;
  public boolean mIsPendingCleanup;
  boolean mOverridden = false;
  final float mStartDx;
  final float mStartDy;
  final float mTargetX;
  final float mTargetY;
  private final ValueAnimator mValueAnimator;
  final RecyclerView.ViewHolder mViewHolder;
  float mX;
  float mY;
  
  ItemTouchHelper$RecoverAnimation(RecyclerView.ViewHolder paramViewHolder, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    this.mActionState = paramInt2;
    this.mAnimationType = paramInt1;
    this.mViewHolder = paramViewHolder;
    this.mStartDx = paramFloat1;
    this.mStartDy = paramFloat2;
    this.mTargetX = paramFloat3;
    this.mTargetY = paramFloat4;
    Object localObject1 = new float[2];
    Object tmp60_58 = localObject1;
    tmp60_58[0] = 0.0F;
    tmp60_58[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.mValueAnimator = ((ValueAnimator)localObject1);
    localObject1 = this.mValueAnimator;
    Object localObject2 = new android/support/v7/widget/helper/ItemTouchHelper$RecoverAnimation$1;
    ((ItemTouchHelper.RecoverAnimation.1)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    localObject1 = this.mValueAnimator;
    localObject2 = paramViewHolder.itemView;
    ((ValueAnimator)localObject1).setTarget(localObject2);
    this.mValueAnimator.addListener(this);
    setFraction(0.0F);
  }
  
  public void cancel()
  {
    this.mValueAnimator.cancel();
  }
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    setFraction(1.0F);
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool1 = true;
    boolean bool2 = this.mEnded;
    if (!bool2)
    {
      RecyclerView.ViewHolder localViewHolder = this.mViewHolder;
      localViewHolder.setIsRecyclable(bool1);
    }
    this.mEnded = bool1;
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void setDuration(long paramLong)
  {
    this.mValueAnimator.setDuration(paramLong);
  }
  
  public void setFraction(float paramFloat)
  {
    this.mFraction = paramFloat;
  }
  
  public void start()
  {
    this.mViewHolder.setIsRecyclable(false);
    this.mValueAnimator.start();
  }
  
  public void update()
  {
    float f1 = this.mStartDx;
    float f2 = this.mTargetX;
    boolean bool = f1 < f2;
    if (!bool)
    {
      View localView = this.mViewHolder.itemView;
      f1 = localView.getTranslationX();
      this.mX = f1;
      f1 = this.mStartDy;
      f2 = this.mTargetY;
      bool = f1 < f2;
      if (bool) {
        break label123;
      }
      localView = this.mViewHolder.itemView;
      f1 = localView.getTranslationY();
    }
    for (this.mY = f1;; this.mY = f1)
    {
      return;
      f1 = this.mStartDx;
      f2 = this.mFraction;
      float f3 = this.mTargetX;
      float f4 = this.mStartDx;
      f3 -= f4;
      f2 *= f3;
      f1 += f2;
      this.mX = f1;
      break;
      label123:
      f1 = this.mStartDy;
      f2 = this.mFraction;
      f3 = this.mTargetY;
      f4 = this.mStartDy;
      f3 -= f4;
      f2 *= f3;
      f1 += f2;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\helper\ItemTouchHelper$RecoverAnimation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */