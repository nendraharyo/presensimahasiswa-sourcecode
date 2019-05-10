package com.github.barteksc.pdfviewer;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.PointF;

class AnimationManager$ZoomAnimation
  implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener
{
  private final float centerX;
  private final float centerY;
  
  public AnimationManager$ZoomAnimation(AnimationManager paramAnimationManager, float paramFloat1, float paramFloat2)
  {
    this.centerX = paramFloat1;
    this.centerY = paramFloat2;
  }
  
  public void onAnimationCancel(Animator paramAnimator) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    AnimationManager.access$000(this.this$0).loadPages();
    AnimationManager.access$100(this.this$0);
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationStart(Animator paramAnimator) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    PDFView localPDFView = AnimationManager.access$000(this.this$0);
    PointF localPointF = new android/graphics/PointF;
    float f2 = this.centerX;
    float f3 = this.centerY;
    localPointF.<init>(f2, f3);
    localPDFView.zoomCenteredTo(f1, localPointF);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\AnimationManager$ZoomAnimation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */