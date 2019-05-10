package com.github.barteksc.pdfviewer;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.animation.DecelerateInterpolator;
import android.widget.OverScroller;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;

class AnimationManager
{
  private ValueAnimator animation;
  private boolean flinging = false;
  private PDFView pdfView;
  private OverScroller scroller;
  
  public AnimationManager(PDFView paramPDFView)
  {
    this.pdfView = paramPDFView;
    OverScroller localOverScroller = new android/widget/OverScroller;
    Context localContext = paramPDFView.getContext();
    localOverScroller.<init>(localContext);
    this.scroller = localOverScroller;
  }
  
  private void hideHandle()
  {
    ScrollHandle localScrollHandle = this.pdfView.getScrollHandle();
    if (localScrollHandle != null)
    {
      localScrollHandle = this.pdfView.getScrollHandle();
      localScrollHandle.hideDelayed();
    }
  }
  
  void computeFling()
  {
    Object localObject = this.scroller;
    boolean bool = ((OverScroller)localObject).computeScrollOffset();
    if (bool)
    {
      localObject = this.pdfView;
      OverScroller localOverScroller1 = this.scroller;
      int i = localOverScroller1.getCurrX();
      float f1 = i;
      OverScroller localOverScroller2 = this.scroller;
      int j = localOverScroller2.getCurrY();
      float f2 = j;
      ((PDFView)localObject).moveTo(f1, f2);
      localObject = this.pdfView;
      ((PDFView)localObject).loadPageByOffset();
    }
    for (;;)
    {
      return;
      bool = this.flinging;
      if (bool)
      {
        bool = false;
        this.flinging = false;
        localObject = this.pdfView;
        ((PDFView)localObject).loadPages();
        hideHandle();
      }
    }
  }
  
  public void startFlingAnimation(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    stopAll();
    this.flinging = true;
    this.scroller.fling(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public void startXAnimation(float paramFloat1, float paramFloat2)
  {
    stopAll();
    Object localObject1 = new float[2];
    localObject1[0] = paramFloat1;
    localObject1[1] = paramFloat2;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.animation = ((ValueAnimator)localObject1);
    localObject1 = this.animation;
    Object localObject2 = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject2).<init>();
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject1 = this.animation;
    localObject2 = new com/github/barteksc/pdfviewer/AnimationManager$XAnimation;
    ((AnimationManager.XAnimation)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    this.animation.setDuration(400L);
    this.animation.start();
  }
  
  public void startYAnimation(float paramFloat1, float paramFloat2)
  {
    stopAll();
    Object localObject1 = new float[2];
    localObject1[0] = paramFloat1;
    localObject1[1] = paramFloat2;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.animation = ((ValueAnimator)localObject1);
    localObject1 = this.animation;
    Object localObject2 = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject2).<init>();
    ((ValueAnimator)localObject1).setInterpolator((TimeInterpolator)localObject2);
    localObject1 = this.animation;
    localObject2 = new com/github/barteksc/pdfviewer/AnimationManager$YAnimation;
    ((AnimationManager.YAnimation)localObject2).<init>(this);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    this.animation.setDuration(400L);
    this.animation.start();
  }
  
  public void startZoomAnimation(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    stopAll();
    Object localObject = new float[2];
    localObject[0] = paramFloat3;
    localObject[1] = paramFloat4;
    localObject = ValueAnimator.ofFloat((float[])localObject);
    this.animation = ((ValueAnimator)localObject);
    localObject = this.animation;
    DecelerateInterpolator localDecelerateInterpolator = new android/view/animation/DecelerateInterpolator;
    localDecelerateInterpolator.<init>();
    ((ValueAnimator)localObject).setInterpolator(localDecelerateInterpolator);
    localObject = new com/github/barteksc/pdfviewer/AnimationManager$ZoomAnimation;
    ((AnimationManager.ZoomAnimation)localObject).<init>(this, paramFloat1, paramFloat2);
    this.animation.addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject);
    this.animation.addListener((Animator.AnimatorListener)localObject);
    this.animation.setDuration(400L);
    this.animation.start();
  }
  
  public void stopAll()
  {
    ValueAnimator localValueAnimator = this.animation;
    if (localValueAnimator != null)
    {
      this.animation.cancel();
      localValueAnimator = null;
      this.animation = null;
    }
    stopFling();
  }
  
  public void stopFling()
  {
    this.flinging = false;
    this.scroller.forceFinished(true);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\AnimationManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */