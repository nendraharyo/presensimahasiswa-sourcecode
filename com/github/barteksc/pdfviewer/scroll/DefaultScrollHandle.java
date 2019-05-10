package com.github.barteksc.pdfviewer.scroll;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.a.b;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.github.barteksc.pdfviewer.PDFView;
import com.github.barteksc.pdfviewer.R.drawable;
import com.github.barteksc.pdfviewer.util.Util;

public class DefaultScrollHandle
  extends RelativeLayout
  implements ScrollHandle
{
  private static final int DEFAULT_TEXT_SIZE = 16;
  private static final int HANDLE_LONG = 65;
  private static final int HANDLE_SHORT = 40;
  protected Context context;
  private float currentPos;
  private Handler handler;
  private Runnable hidePageScrollerRunnable;
  private boolean inverted;
  private PDFView pdfView;
  private float relativeHandlerMiddle = 0.0F;
  protected TextView textView;
  
  public DefaultScrollHandle(Context paramContext)
  {
    this(paramContext, false);
  }
  
  public DefaultScrollHandle(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    Object localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.handler = ((Handler)localObject);
    localObject = new com/github/barteksc/pdfviewer/scroll/DefaultScrollHandle$1;
    ((DefaultScrollHandle.1)localObject).<init>(this);
    this.hidePageScrollerRunnable = ((Runnable)localObject);
    this.context = paramContext;
    this.inverted = paramBoolean;
    localObject = new android/widget/TextView;
    ((TextView)localObject).<init>(paramContext);
    this.textView = ((TextView)localObject);
    setVisibility(4);
    setTextColor(-16777216);
    setTextSize(16);
  }
  
  private void calculateMiddle()
  {
    PDFView localPDFView = this.pdfView;
    boolean bool = localPDFView.isSwipeVertical();
    float f1;
    float f2;
    int i;
    if (bool)
    {
      f1 = getY();
      f2 = getHeight();
      localPDFView = this.pdfView;
      i = localPDFView.getHeight();
    }
    for (float f3 = i;; f3 = i)
    {
      float f4 = this.relativeHandlerMiddle;
      f3 = (f1 + f4) / f3 * f2;
      this.relativeHandlerMiddle = f3;
      return;
      f1 = getX();
      f2 = getWidth();
      localPDFView = this.pdfView;
      i = localPDFView.getWidth();
    }
  }
  
  private boolean isPDFViewReady()
  {
    PDFView localPDFView = this.pdfView;
    boolean bool;
    if (localPDFView != null)
    {
      localPDFView = this.pdfView;
      int i = localPDFView.getPageCount();
      if (i > 0)
      {
        localPDFView = this.pdfView;
        bool = localPDFView.documentFitsView();
        if (!bool) {
          bool = true;
        }
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localPDFView = null;
    }
  }
  
  private void setPosition(float paramFloat)
  {
    int i = 40;
    boolean bool1 = false;
    float f1 = 0.0F;
    Object localObject = null;
    boolean bool2 = Float.isInfinite(paramFloat);
    if (!bool2)
    {
      bool2 = Float.isNaN(paramFloat);
      if (!bool2) {}
    }
    else
    {
      return;
    }
    PDFView localPDFView = this.pdfView;
    bool2 = localPDFView.isSwipeVertical();
    int k;
    float f2;
    label70:
    float f3;
    if (bool2)
    {
      localPDFView = this.pdfView;
      k = localPDFView.getHeight();
      f2 = k;
      f3 = this.relativeHandlerMiddle;
      f3 = paramFloat - f3;
      boolean bool3 = f3 < 0.0F;
      if (!bool3) {
        break label156;
      }
      k = 0;
      localPDFView = null;
      f2 = 0.0F;
    }
    for (;;)
    {
      label102:
      localObject = this.pdfView;
      bool1 = ((PDFView)localObject).isSwipeVertical();
      if (bool1) {
        setY(f2);
      }
      for (;;)
      {
        calculateMiddle();
        invalidate();
        break;
        localPDFView = this.pdfView;
        k = localPDFView.getWidth();
        f2 = k;
        break label70;
        label156:
        localObject = this.context;
        f1 = Util.getDP((Context)localObject, i);
        f1 = f2 - f1;
        bool1 = f3 < f1;
        if (!bool1) {
          break label224;
        }
        localObject = this.context;
        int j = Util.getDP((Context)localObject, i);
        f1 = j;
        f2 -= f1;
        break label102;
        setX(f2);
      }
      label224:
      f2 = f3;
    }
  }
  
  public void destroyLayout()
  {
    this.pdfView.removeView(this);
  }
  
  public void hide()
  {
    setVisibility(4);
  }
  
  public void hideDelayed()
  {
    Handler localHandler = this.handler;
    Runnable localRunnable = this.hidePageScrollerRunnable;
    localHandler.postDelayed(localRunnable, 1000L);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    boolean bool2 = isPDFViewReady();
    if (!bool2) {
      bool1 = super.onTouchEvent(paramMotionEvent);
    }
    for (;;)
    {
      return bool1;
      int i = paramMotionEvent.getAction();
      Object localObject;
      boolean bool3;
      float f1;
      float f2;
      switch (i)
      {
      case 4: 
      default: 
        bool1 = super.onTouchEvent(paramMotionEvent);
        break;
      case 0: 
      case 5: 
        this.pdfView.stopFling();
        localObject = this.handler;
        Runnable localRunnable = this.hidePageScrollerRunnable;
        ((Handler)localObject).removeCallbacks(localRunnable);
        localObject = this.pdfView;
        bool3 = ((PDFView)localObject).isSwipeVertical();
        if (bool3)
        {
          f1 = paramMotionEvent.getRawY();
          f2 = getY();
          f1 -= f2;
        }
      case 2: 
        for (this.currentPos = f1;; this.currentPos = f1)
        {
          localObject = this.pdfView;
          bool3 = ((PDFView)localObject).isSwipeVertical();
          if (!bool3) {
            break label267;
          }
          f1 = paramMotionEvent.getRawY();
          f2 = this.currentPos;
          f1 -= f2;
          f2 = this.relativeHandlerMiddle;
          f1 += f2;
          setPosition(f1);
          localObject = this.pdfView;
          f2 = this.relativeHandlerMiddle;
          j = getHeight();
          f3 = j;
          f2 /= f3;
          ((PDFView)localObject).setPositionOffset(f2, false);
          break;
          f1 = paramMotionEvent.getRawX();
          f2 = getX();
          f1 -= f2;
        }
        f1 = paramMotionEvent.getRawX();
        f2 = this.currentPos;
        f1 -= f2;
        f2 = this.relativeHandlerMiddle;
        f1 += f2;
        setPosition(f1);
        localObject = this.pdfView;
        f2 = this.relativeHandlerMiddle;
        int j = getWidth();
        float f3 = j;
        f2 /= f3;
        ((PDFView)localObject).setPositionOffset(f2, false);
        break;
      case 1: 
      case 3: 
      case 6: 
        label267:
        hideDelayed();
      }
    }
  }
  
  public void setPageNum(int paramInt)
  {
    String str = String.valueOf(paramInt);
    Object localObject = this.textView.getText();
    boolean bool = localObject.equals(str);
    if (!bool)
    {
      localObject = this.textView;
      ((TextView)localObject).setText(str);
    }
  }
  
  public void setScroll(float paramFloat)
  {
    boolean bool = shown();
    Object localObject;
    if (!bool)
    {
      show();
      localObject = this.pdfView;
      bool = ((PDFView)localObject).isSwipeVertical();
      if (!bool) {
        break label70;
      }
      localObject = this.pdfView;
    }
    for (int i = ((PDFView)localObject).getHeight();; i = ((PDFView)localObject).getWidth())
    {
      float f = i * paramFloat;
      setPosition(f);
      return;
      localObject = this.handler;
      Runnable localRunnable = this.hidePageScrollerRunnable;
      ((Handler)localObject).removeCallbacks(localRunnable);
      break;
      label70:
      localObject = this.pdfView;
    }
  }
  
  public void setTextColor(int paramInt)
  {
    this.textView.setTextColor(paramInt);
  }
  
  public void setTextSize(int paramInt)
  {
    TextView localTextView = this.textView;
    float f = paramInt;
    localTextView.setTextSize(1, f);
  }
  
  public void setupLayout(PDFView paramPDFView)
  {
    int i = 65;
    float f1 = 9.1E-44F;
    int j = 40;
    float f2 = 5.6E-44F;
    int k = -2;
    boolean bool = paramPDFView.isSwipeVertical();
    int m;
    Object localObject;
    int n;
    if (bool)
    {
      bool = this.inverted;
      if (bool)
      {
        m = 9;
        localObject = this.context;
        n = R.drawable.default_scroll_handle_left;
        localObject = b.a((Context)localObject, n);
        n = Build.VERSION.SDK_INT;
        int i1 = 16;
        if (n >= i1) {
          break label316;
        }
        setBackgroundDrawable((Drawable)localObject);
      }
    }
    for (;;)
    {
      localObject = new android/widget/RelativeLayout$LayoutParams;
      i = Util.getDP(this.context, i);
      j = Util.getDP(this.context, j);
      ((RelativeLayout.LayoutParams)localObject).<init>(i, j);
      ((RelativeLayout.LayoutParams)localObject).setMargins(0, 0, 0, 0);
      RelativeLayout.LayoutParams localLayoutParams = new android/widget/RelativeLayout$LayoutParams;
      localLayoutParams.<init>(k, k);
      localLayoutParams.addRule(13, -1);
      TextView localTextView = this.textView;
      addView(localTextView, localLayoutParams);
      ((RelativeLayout.LayoutParams)localObject).addRule(m);
      paramPDFView.addView(this, (ViewGroup.LayoutParams)localObject);
      this.pdfView = paramPDFView;
      return;
      m = 11;
      localObject = this.context;
      n = R.drawable.default_scroll_handle_right;
      localObject = b.a((Context)localObject, n);
      break;
      bool = this.inverted;
      if (bool)
      {
        m = 10;
        localObject = this.context;
        n = R.drawable.default_scroll_handle_top;
        localObject = b.a((Context)localObject, n);
        i2 = i;
        f3 = f1;
        i = j;
        f1 = f2;
        j = i2;
        f2 = f3;
        break;
      }
      m = 12;
      localObject = this.context;
      n = R.drawable.default_scroll_handle_bottom;
      localObject = b.a((Context)localObject, n);
      int i2 = i;
      float f3 = f1;
      i = j;
      f1 = f2;
      j = i2;
      f2 = f3;
      break;
      label316:
      setBackground((Drawable)localObject);
    }
  }
  
  public void show()
  {
    setVisibility(0);
  }
  
  public boolean shown()
  {
    int i = getVisibility();
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\github\barteksc\pdfviewer\scroll\DefaultScrollHandle.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */