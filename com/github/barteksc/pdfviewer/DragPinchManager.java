package com.github.barteksc.pdfviewer;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ScaleGestureDetector.OnScaleGestureListener;
import android.view.View;
import android.view.View.OnTouchListener;
import com.github.barteksc.pdfviewer.listener.OnTapListener;
import com.github.barteksc.pdfviewer.scroll.ScrollHandle;
import com.github.barteksc.pdfviewer.util.Constants.Pinch;

class DragPinchManager
  implements GestureDetector.OnDoubleTapListener, GestureDetector.OnGestureListener, ScaleGestureDetector.OnScaleGestureListener, View.OnTouchListener
{
  private AnimationManager animationManager;
  private GestureDetector gestureDetector;
  private boolean isSwipeEnabled;
  private PDFView pdfView;
  private ScaleGestureDetector scaleGestureDetector;
  private boolean scaling = false;
  private boolean scrolling = false;
  private boolean swipeVertical;
  
  public DragPinchManager(PDFView paramPDFView, AnimationManager paramAnimationManager)
  {
    this.pdfView = paramPDFView;
    this.animationManager = paramAnimationManager;
    this.isSwipeEnabled = false;
    boolean bool = paramPDFView.isSwipeVertical();
    this.swipeVertical = bool;
    Object localObject = new android/view/GestureDetector;
    Context localContext = paramPDFView.getContext();
    ((GestureDetector)localObject).<init>(localContext, this);
    this.gestureDetector = ((GestureDetector)localObject);
    localObject = new android/view/ScaleGestureDetector;
    localContext = paramPDFView.getContext();
    ((ScaleGestureDetector)localObject).<init>(localContext, this);
    this.scaleGestureDetector = ((ScaleGestureDetector)localObject);
    paramPDFView.setOnTouchListener(this);
  }
  
  private void hideHandle()
  {
    ScrollHandle localScrollHandle = this.pdfView.getScrollHandle();
    if (localScrollHandle != null)
    {
      localScrollHandle = this.pdfView.getScrollHandle();
      boolean bool = localScrollHandle.shown();
      if (bool)
      {
        localScrollHandle = this.pdfView.getScrollHandle();
        localScrollHandle.hideDelayed();
      }
    }
  }
  
  private boolean isPageChange(float paramFloat)
  {
    float f1 = Math.abs(paramFloat);
    PDFView localPDFView1 = this.pdfView;
    boolean bool = this.swipeVertical;
    PDFView localPDFView2;
    float f2;
    if (bool)
    {
      localPDFView2 = this.pdfView;
      f2 = localPDFView2.getOptimalPageHeight();
      f2 = localPDFView1.toCurrentScale(f2);
      float f3 = 2.0F;
      f2 = Math.abs(f2 / f3);
      bool = f1 < f2;
      if (!bool) {
        break label93;
      }
      bool = true;
      f2 = Float.MIN_VALUE;
    }
    for (;;)
    {
      return bool;
      localPDFView2 = this.pdfView;
      f2 = localPDFView2.getOptimalPageWidth();
      break;
      label93:
      bool = false;
      f2 = 0.0F;
      localPDFView2 = null;
    }
  }
  
  public void enableDoubletap(boolean paramBoolean)
  {
    GestureDetector localGestureDetector;
    if (paramBoolean)
    {
      localGestureDetector = this.gestureDetector;
      localGestureDetector.setOnDoubleTapListener(this);
    }
    for (;;)
    {
      return;
      localGestureDetector = this.gestureDetector;
      localGestureDetector.setOnDoubleTapListener(null);
    }
  }
  
  public boolean isZooming()
  {
    return this.pdfView.isZooming();
  }
  
  public boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    PDFView localPDFView1 = this.pdfView;
    float f1 = localPDFView1.getZoom();
    PDFView localPDFView2 = this.pdfView;
    float f2 = localPDFView2.getMidZoom();
    boolean bool = f1 < f2;
    float f3;
    PDFView localPDFView3;
    float f4;
    if (bool)
    {
      localPDFView1 = this.pdfView;
      f2 = paramMotionEvent.getX();
      f3 = paramMotionEvent.getY();
      localPDFView3 = this.pdfView;
      f4 = localPDFView3.getMidZoom();
      localPDFView1.zoomWithAnimation(f2, f3, f4);
    }
    for (;;)
    {
      return true;
      localPDFView1 = this.pdfView;
      f1 = localPDFView1.getZoom();
      localPDFView2 = this.pdfView;
      f2 = localPDFView2.getMaxZoom();
      bool = f1 < f2;
      if (bool)
      {
        localPDFView1 = this.pdfView;
        f2 = paramMotionEvent.getX();
        f3 = paramMotionEvent.getY();
        localPDFView3 = this.pdfView;
        f4 = localPDFView3.getMaxZoom();
        localPDFView1.zoomWithAnimation(f2, f3, f4);
      }
      else
      {
        localPDFView1 = this.pdfView;
        localPDFView1.resetZoomWithAnimation();
      }
    }
  }
  
  public boolean onDoubleTapEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onDown(MotionEvent paramMotionEvent)
  {
    this.animationManager.stopFling();
    return true;
  }
  
  public boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    int i = (int)this.pdfView.getCurrentXOffset();
    float f1 = this.pdfView.getCurrentYOffset();
    int j = (int)f1;
    Object localObject = this.pdfView;
    boolean bool = ((PDFView)localObject).isSwipeVertical();
    float f2;
    PDFView localPDFView1;
    int k;
    PDFView localPDFView2;
    int m;
    float f3;
    float f4;
    if (bool)
    {
      localObject = this.pdfView;
      f2 = this.pdfView.getOptimalPageWidth();
      f1 = ((PDFView)localObject).toCurrentScale(f2);
      localPDFView1 = this.pdfView;
      k = localPDFView1.getWidth();
      f2 = k;
      f2 = -(f1 - f2);
      localObject = this.pdfView;
      f1 = ((PDFView)localObject).calculateDocLength();
      localPDFView2 = this.pdfView;
      m = localPDFView2.getHeight();
      f3 = m;
      f1 = -(f1 - f3);
      f4 = f1;
    }
    for (float f5 = f2;; f5 = f2)
    {
      localObject = this.animationManager;
      k = (int)paramFloat1;
      m = (int)paramFloat2;
      int n = (int)f5;
      int i1 = (int)f4;
      ((AnimationManager)localObject).startFlingAnimation(i, j, k, m, n, 0, i1, 0);
      return true;
      f1 = this.pdfView.calculateDocLength();
      localPDFView1 = this.pdfView;
      k = localPDFView1.getWidth();
      f2 = k;
      f2 = -(f1 - f2);
      localObject = this.pdfView;
      f3 = this.pdfView.getOptimalPageHeight();
      f1 = ((PDFView)localObject).toCurrentScale(f3);
      localPDFView2 = this.pdfView;
      m = localPDFView2.getHeight();
      f3 = m;
      f1 = -(f1 - f3);
      f4 = f1;
    }
  }
  
  public void onLongPress(MotionEvent paramMotionEvent) {}
  
  public boolean onScale(ScaleGestureDetector paramScaleGestureDetector)
  {
    float f1 = paramScaleGestureDetector.getScaleFactor();
    PDFView localPDFView = this.pdfView;
    float f2 = localPDFView.getZoom() * f1;
    float f3 = Constants.Pinch.MINIMUM_ZOOM;
    boolean bool1 = f2 < f3;
    if (bool1)
    {
      f1 = Constants.Pinch.MINIMUM_ZOOM;
      localPDFView = this.pdfView;
      f2 = localPDFView.getZoom();
      f1 /= f2;
    }
    for (;;)
    {
      localPDFView = this.pdfView;
      PointF localPointF = new android/graphics/PointF;
      float f4 = paramScaleGestureDetector.getFocusX();
      float f5 = paramScaleGestureDetector.getFocusY();
      localPointF.<init>(f4, f5);
      localPDFView.zoomCenteredRelativeTo(f1, localPointF);
      return true;
      f3 = Constants.Pinch.MAXIMUM_ZOOM;
      boolean bool2 = f2 < f3;
      if (bool2)
      {
        f1 = Constants.Pinch.MAXIMUM_ZOOM;
        localPDFView = this.pdfView;
        f2 = localPDFView.getZoom();
        f1 /= f2;
      }
    }
  }
  
  public boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector)
  {
    boolean bool = true;
    this.scaling = bool;
    return bool;
  }
  
  public void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector)
  {
    this.pdfView.loadPages();
    hideHandle();
    this.scaling = false;
  }
  
  public boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    this.scrolling = bool1;
    boolean bool2 = isZooming();
    PDFView localPDFView;
    if (!bool2)
    {
      bool2 = this.isSwipeEnabled;
      if (!bool2) {}
    }
    else
    {
      localPDFView = this.pdfView;
      float f1 = -paramFloat1;
      float f2 = -paramFloat2;
      localPDFView.moveRelativeTo(f1, f2);
    }
    bool2 = this.scaling;
    if (bool2)
    {
      localPDFView = this.pdfView;
      bool2 = localPDFView.doRenderDuringScale();
      if (!bool2) {}
    }
    else
    {
      localPDFView = this.pdfView;
      localPDFView.loadPageByOffset();
    }
    return bool1;
  }
  
  public void onScrollEnd(MotionEvent paramMotionEvent)
  {
    this.pdfView.loadPages();
    hideHandle();
  }
  
  public void onShowPress(MotionEvent paramMotionEvent) {}
  
  public boolean onSingleTapConfirmed(MotionEvent paramMotionEvent)
  {
    Object localObject = this.pdfView.getOnTapListener();
    if (localObject != null)
    {
      boolean bool1 = ((OnTapListener)localObject).onTap(paramMotionEvent);
      if (bool1) {}
    }
    else
    {
      localObject = this.pdfView.getScrollHandle();
      if (localObject != null)
      {
        PDFView localPDFView = this.pdfView;
        boolean bool2 = localPDFView.documentFitsView();
        if (!bool2)
        {
          bool2 = ((ScrollHandle)localObject).shown();
          if (bool2) {
            break label83;
          }
          ((ScrollHandle)localObject).show();
        }
      }
    }
    for (;;)
    {
      this.pdfView.performClick();
      return true;
      label83:
      ((ScrollHandle)localObject).hide();
    }
  }
  
  public boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    return false;
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i = 1;
    ScaleGestureDetector localScaleGestureDetector = this.scaleGestureDetector;
    boolean bool1 = localScaleGestureDetector.onTouchEvent(paramMotionEvent);
    GestureDetector localGestureDetector = this.gestureDetector;
    boolean bool2 = localGestureDetector.onTouchEvent(paramMotionEvent);
    if ((bool2) || (bool1)) {
      bool1 = i;
    }
    for (;;)
    {
      int j = paramMotionEvent.getAction();
      if (j == i)
      {
        i = this.scrolling;
        if (i != 0)
        {
          this.scrolling = false;
          onScrollEnd(paramMotionEvent);
        }
      }
      return bool1;
      bool1 = false;
      localScaleGestureDetector = null;
    }
  }
  
  public void setSwipeEnabled(boolean paramBoolean)
  {
    this.isSwipeEnabled = paramBoolean;
  }
  
  public void setSwipeVertical(boolean paramBoolean)
  {
    this.swipeVertical = paramBoolean;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\DragPinchManager.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */