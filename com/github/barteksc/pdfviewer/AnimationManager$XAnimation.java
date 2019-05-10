package com.github.barteksc.pdfviewer;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

class AnimationManager$XAnimation
  implements ValueAnimator.AnimatorUpdateListener
{
  AnimationManager$XAnimation(AnimationManager paramAnimationManager) {}
  
  public void onAnimationUpdate(ValueAnimator paramValueAnimator)
  {
    float f1 = ((Float)paramValueAnimator.getAnimatedValue()).floatValue();
    PDFView localPDFView = AnimationManager.access$000(this.this$0);
    float f2 = AnimationManager.access$000(this.this$0).getCurrentYOffset();
    localPDFView.moveTo(f1, f2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\AnimationManager$XAnimation.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */