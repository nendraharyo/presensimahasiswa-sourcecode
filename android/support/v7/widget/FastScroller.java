package android.support.v7.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.support.v4.view.r;
import android.view.MotionEvent;

class FastScroller
  extends RecyclerView.ItemDecoration
  implements RecyclerView.OnItemTouchListener
{
  private static final int ANIMATION_STATE_FADING_IN = 1;
  private static final int ANIMATION_STATE_FADING_OUT = 3;
  private static final int ANIMATION_STATE_IN = 2;
  private static final int ANIMATION_STATE_OUT = 0;
  private static final int DRAG_NONE = 0;
  private static final int DRAG_X = 1;
  private static final int DRAG_Y = 2;
  private static final int[] EMPTY_STATE_SET = new int[0];
  private static final int HIDE_DELAY_AFTER_DRAGGING_MS = 1200;
  private static final int HIDE_DELAY_AFTER_VISIBLE_MS = 1500;
  private static final int HIDE_DURATION_MS = 500;
  private static final int[] PRESSED_STATE_SET;
  private static final int SCROLLBAR_FULL_OPAQUE = 255;
  private static final int SHOW_DURATION_MS = 500;
  private static final int STATE_DRAGGING = 2;
  private static final int STATE_HIDDEN = 0;
  private static final int STATE_VISIBLE = 1;
  private int mAnimationState;
  private int mDragState = 0;
  private final Runnable mHideRunnable;
  float mHorizontalDragX;
  private final int[] mHorizontalRange;
  int mHorizontalThumbCenterX;
  private final StateListDrawable mHorizontalThumbDrawable;
  private final int mHorizontalThumbHeight;
  int mHorizontalThumbWidth;
  private final Drawable mHorizontalTrackDrawable;
  private final int mHorizontalTrackHeight;
  private final int mMargin;
  private boolean mNeedHorizontalScrollbar = false;
  private boolean mNeedVerticalScrollbar = false;
  private final RecyclerView.OnScrollListener mOnScrollListener;
  private RecyclerView mRecyclerView;
  private int mRecyclerViewHeight = 0;
  private int mRecyclerViewWidth = 0;
  private final int mScrollbarMinimumRange;
  private final ValueAnimator mShowHideAnimator;
  private int mState = 0;
  float mVerticalDragY;
  private final int[] mVerticalRange;
  int mVerticalThumbCenterY;
  private final StateListDrawable mVerticalThumbDrawable;
  int mVerticalThumbHeight;
  private final int mVerticalThumbWidth;
  private final Drawable mVerticalTrackDrawable;
  private final int mVerticalTrackWidth;
  
  static
  {
    int[] arrayOfInt = new int[1];
    arrayOfInt[0] = 16842919;
    PRESSED_STATE_SET = arrayOfInt;
  }
  
  FastScroller(RecyclerView paramRecyclerView, StateListDrawable paramStateListDrawable1, Drawable paramDrawable1, StateListDrawable paramStateListDrawable2, Drawable paramDrawable2, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject1 = new int[j];
    this.mVerticalRange = ((int[])localObject1);
    localObject1 = new int[j];
    this.mHorizontalRange = ((int[])localObject1);
    localObject1 = new float[j];
    Object tmp74_72 = localObject1;
    tmp74_72[0] = 0.0F;
    tmp74_72[1] = 1.0F;
    localObject1 = ValueAnimator.ofFloat((float[])localObject1);
    this.mShowHideAnimator = ((ValueAnimator)localObject1);
    this.mAnimationState = 0;
    localObject1 = new android/support/v7/widget/FastScroller$1;
    ((FastScroller.1)localObject1).<init>(this);
    this.mHideRunnable = ((Runnable)localObject1);
    localObject1 = new android/support/v7/widget/FastScroller$2;
    ((FastScroller.2)localObject1).<init>(this);
    this.mOnScrollListener = ((RecyclerView.OnScrollListener)localObject1);
    this.mVerticalThumbDrawable = paramStateListDrawable1;
    this.mVerticalTrackDrawable = paramDrawable1;
    this.mHorizontalThumbDrawable = paramStateListDrawable2;
    this.mHorizontalTrackDrawable = paramDrawable2;
    int k = paramStateListDrawable1.getIntrinsicWidth();
    k = Math.max(paramInt1, k);
    this.mVerticalThumbWidth = k;
    k = paramDrawable1.getIntrinsicWidth();
    k = Math.max(paramInt1, k);
    this.mVerticalTrackWidth = k;
    k = paramStateListDrawable2.getIntrinsicWidth();
    k = Math.max(paramInt1, k);
    this.mHorizontalThumbHeight = k;
    k = paramDrawable2.getIntrinsicWidth();
    k = Math.max(paramInt1, k);
    this.mHorizontalTrackHeight = k;
    this.mScrollbarMinimumRange = paramInt2;
    this.mMargin = paramInt3;
    this.mVerticalThumbDrawable.setAlpha(i);
    this.mVerticalTrackDrawable.setAlpha(i);
    localObject1 = this.mShowHideAnimator;
    Object localObject2 = new android/support/v7/widget/FastScroller$AnimatorListener;
    ((FastScroller.AnimatorListener)localObject2).<init>(this, null);
    ((ValueAnimator)localObject1).addListener((Animator.AnimatorListener)localObject2);
    localObject1 = this.mShowHideAnimator;
    localObject2 = new android/support/v7/widget/FastScroller$AnimatorUpdater;
    ((FastScroller.AnimatorUpdater)localObject2).<init>(this, null);
    ((ValueAnimator)localObject1).addUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject2);
    attachToRecyclerView(paramRecyclerView);
  }
  
  private void cancelHide()
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    Runnable localRunnable = this.mHideRunnable;
    localRecyclerView.removeCallbacks(localRunnable);
  }
  
  private void destroyCallbacks()
  {
    this.mRecyclerView.removeItemDecoration(this);
    this.mRecyclerView.removeOnItemTouchListener(this);
    RecyclerView localRecyclerView = this.mRecyclerView;
    RecyclerView.OnScrollListener localOnScrollListener = this.mOnScrollListener;
    localRecyclerView.removeOnScrollListener(localOnScrollListener);
    cancelHide();
  }
  
  private void drawHorizontalScrollbar(Canvas paramCanvas)
  {
    int i = this.mRecyclerViewHeight;
    int j = this.mHorizontalThumbHeight;
    i -= j;
    j = this.mHorizontalThumbCenterX;
    int k = this.mHorizontalThumbWidth / 2;
    j -= k;
    Object localObject = this.mHorizontalThumbDrawable;
    int m = this.mHorizontalThumbWidth;
    int n = this.mHorizontalThumbHeight;
    ((StateListDrawable)localObject).setBounds(0, 0, m, n);
    localObject = this.mHorizontalTrackDrawable;
    m = this.mRecyclerViewWidth;
    n = this.mHorizontalTrackHeight;
    ((Drawable)localObject).setBounds(0, 0, m, n);
    float f1 = i;
    paramCanvas.translate(0.0F, f1);
    this.mHorizontalTrackDrawable.draw(paramCanvas);
    f1 = j;
    paramCanvas.translate(f1, 0.0F);
    this.mHorizontalThumbDrawable.draw(paramCanvas);
    float f2 = -j;
    float f3 = -i;
    paramCanvas.translate(f2, f3);
  }
  
  private void drawVerticalScrollbar(Canvas paramCanvas)
  {
    float f1 = 1.0F;
    int i = this.mRecyclerViewWidth;
    int j = this.mVerticalThumbWidth;
    i -= j;
    j = this.mVerticalThumbCenterY;
    int k = this.mVerticalThumbHeight / 2;
    j -= k;
    Object localObject = this.mVerticalThumbDrawable;
    int m = this.mVerticalThumbWidth;
    int n = this.mVerticalThumbHeight;
    ((StateListDrawable)localObject).setBounds(0, 0, m, n);
    localObject = this.mVerticalTrackDrawable;
    m = this.mVerticalTrackWidth;
    n = this.mRecyclerViewHeight;
    ((Drawable)localObject).setBounds(0, 0, m, n);
    boolean bool = isLayoutRTL();
    float f2;
    float f3;
    float f4;
    if (bool)
    {
      this.mVerticalTrackDrawable.draw(paramCanvas);
      f2 = this.mVerticalThumbWidth;
      f3 = j;
      paramCanvas.translate(f2, f3);
      paramCanvas.scale(-1.0F, f1);
      StateListDrawable localStateListDrawable = this.mVerticalThumbDrawable;
      localStateListDrawable.draw(paramCanvas);
      paramCanvas.scale(f1, f1);
      i = -this.mVerticalThumbWidth;
      f2 = i;
      j = -j;
      f4 = j;
      paramCanvas.translate(f2, f4);
    }
    for (;;)
    {
      return;
      f3 = i;
      paramCanvas.translate(f3, 0.0F);
      this.mVerticalTrackDrawable.draw(paramCanvas);
      f3 = j;
      paramCanvas.translate(0.0F, f3);
      localObject = this.mVerticalThumbDrawable;
      ((StateListDrawable)localObject).draw(paramCanvas);
      i = -i;
      f2 = i;
      j = -j;
      f4 = j;
      paramCanvas.translate(f2, f4);
    }
  }
  
  private int[] getHorizontalRange()
  {
    int[] arrayOfInt = this.mHorizontalRange;
    int i = this.mMargin;
    arrayOfInt[0] = i;
    arrayOfInt = this.mHorizontalRange;
    i = this.mRecyclerViewWidth;
    int j = this.mMargin;
    i -= j;
    arrayOfInt[1] = i;
    return this.mHorizontalRange;
  }
  
  private int[] getVerticalRange()
  {
    int[] arrayOfInt = this.mVerticalRange;
    int i = this.mMargin;
    arrayOfInt[0] = i;
    arrayOfInt = this.mVerticalRange;
    i = this.mRecyclerViewHeight;
    int j = this.mMargin;
    i -= j;
    arrayOfInt[1] = i;
    return this.mVerticalRange;
  }
  
  private void horizontalScrollTo(float paramFloat)
  {
    int[] arrayOfInt = getHorizontalRange();
    float f1 = arrayOfInt[0];
    float f2 = Math.min(arrayOfInt[1], paramFloat);
    float f3 = Math.max(f1, f2);
    f1 = Math.abs(this.mHorizontalThumbCenterX - f3);
    f2 = 2.0F;
    boolean bool = f1 < f2;
    if (bool) {}
    for (;;)
    {
      return;
      f2 = this.mHorizontalDragX;
      int j = this.mRecyclerView.computeHorizontalScrollRange();
      int k = this.mRecyclerView.computeHorizontalScrollOffset();
      int m = this.mRecyclerViewWidth;
      int i = scrollTo(f2, f3, arrayOfInt, j, k, m);
      if (i != 0)
      {
        RecyclerView localRecyclerView = this.mRecyclerView;
        localRecyclerView.scrollBy(i, 0);
      }
      this.mHorizontalDragX = f3;
    }
  }
  
  private boolean isLayoutRTL()
  {
    int i = 1;
    RecyclerView localRecyclerView = this.mRecyclerView;
    int j = r.e(localRecyclerView);
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private void requestRedraw()
  {
    this.mRecyclerView.invalidate();
  }
  
  private void resetHideDelay(int paramInt)
  {
    cancelHide();
    RecyclerView localRecyclerView = this.mRecyclerView;
    Runnable localRunnable = this.mHideRunnable;
    long l = paramInt;
    localRecyclerView.postDelayed(localRunnable, l);
  }
  
  private int scrollTo(float paramFloat1, float paramFloat2, int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    float f1 = Float.MIN_VALUE;
    int j = paramArrayOfInt[1];
    int k = paramArrayOfInt[0];
    j -= k;
    if (j == 0) {}
    for (;;)
    {
      return i;
      float f2 = paramFloat2 - paramFloat1;
      f1 = j;
      f1 = f2 / f1;
      k = paramInt1 - paramInt3;
      float f3 = k;
      f1 *= f3;
      j = (int)f1;
      int m = paramInt2 + j;
      if ((m < k) && (m >= 0)) {
        i = j;
      }
    }
  }
  
  private void setState(int paramInt)
  {
    int i = 2;
    int j;
    StateListDrawable localStateListDrawable;
    int[] arrayOfInt;
    if (paramInt == i)
    {
      j = this.mState;
      if (j != i)
      {
        localStateListDrawable = this.mVerticalThumbDrawable;
        arrayOfInt = PRESSED_STATE_SET;
        localStateListDrawable.setState(arrayOfInt);
        cancelHide();
      }
    }
    if (paramInt == 0)
    {
      requestRedraw();
      j = this.mState;
      if ((j != i) || (paramInt == i)) {
        break label104;
      }
      localStateListDrawable = this.mVerticalThumbDrawable;
      arrayOfInt = EMPTY_STATE_SET;
      localStateListDrawable.setState(arrayOfInt);
      j = 1200;
      resetHideDelay(j);
    }
    for (;;)
    {
      this.mState = paramInt;
      return;
      show();
      break;
      label104:
      j = 1;
      if (paramInt == j)
      {
        j = 1500;
        resetHideDelay(j);
      }
    }
  }
  
  private void setupCallbacks()
  {
    this.mRecyclerView.addItemDecoration(this);
    this.mRecyclerView.addOnItemTouchListener(this);
    RecyclerView localRecyclerView = this.mRecyclerView;
    RecyclerView.OnScrollListener localOnScrollListener = this.mOnScrollListener;
    localRecyclerView.addOnScrollListener(localOnScrollListener);
  }
  
  private void verticalScrollTo(float paramFloat)
  {
    int[] arrayOfInt = getVerticalRange();
    float f1 = arrayOfInt[0];
    float f2 = Math.min(arrayOfInt[1], paramFloat);
    float f3 = Math.max(f1, f2);
    f1 = Math.abs(this.mVerticalThumbCenterY - f3);
    f2 = 2.0F;
    boolean bool = f1 < f2;
    if (bool) {}
    for (;;)
    {
      return;
      f2 = this.mVerticalDragY;
      int j = this.mRecyclerView.computeVerticalScrollRange();
      int k = this.mRecyclerView.computeVerticalScrollOffset();
      int m = this.mRecyclerViewHeight;
      int i = scrollTo(f2, f3, arrayOfInt, j, k, m);
      if (i != 0)
      {
        RecyclerView localRecyclerView = this.mRecyclerView;
        localRecyclerView.scrollBy(0, i);
      }
      this.mVerticalDragY = f3;
    }
  }
  
  public void attachToRecyclerView(RecyclerView paramRecyclerView)
  {
    RecyclerView localRecyclerView = this.mRecyclerView;
    if (localRecyclerView == paramRecyclerView) {}
    for (;;)
    {
      return;
      localRecyclerView = this.mRecyclerView;
      if (localRecyclerView != null) {
        destroyCallbacks();
      }
      this.mRecyclerView = paramRecyclerView;
      localRecyclerView = this.mRecyclerView;
      if (localRecyclerView != null) {
        setupCallbacks();
      }
    }
  }
  
  Drawable getHorizontalThumbDrawable()
  {
    return this.mHorizontalThumbDrawable;
  }
  
  Drawable getHorizontalTrackDrawable()
  {
    return this.mHorizontalTrackDrawable;
  }
  
  Drawable getVerticalThumbDrawable()
  {
    return this.mVerticalThumbDrawable;
  }
  
  Drawable getVerticalTrackDrawable()
  {
    return this.mVerticalTrackDrawable;
  }
  
  public void hide()
  {
    hide(0);
  }
  
  void hide(int paramInt)
  {
    int i = this.mAnimationState;
    switch (i)
    {
    }
    for (;;)
    {
      return;
      ValueAnimator localValueAnimator1 = this.mShowHideAnimator;
      localValueAnimator1.cancel();
      this.mAnimationState = 3;
      ValueAnimator localValueAnimator2 = this.mShowHideAnimator;
      float[] arrayOfFloat = new float[2];
      float f = ((Float)this.mShowHideAnimator.getAnimatedValue()).floatValue();
      arrayOfFloat[0] = f;
      i = 1;
      f = Float.MIN_VALUE;
      arrayOfFloat[i] = 0.0F;
      localValueAnimator2.setFloatValues(arrayOfFloat);
      localValueAnimator1 = this.mShowHideAnimator;
      long l = paramInt;
      localValueAnimator1.setDuration(l);
      localValueAnimator1 = this.mShowHideAnimator;
      localValueAnimator1.start();
    }
  }
  
  public boolean isDragging()
  {
    int i = this.mState;
    int k = 2;
    if (i == k) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isHidden()
  {
    int i = this.mState;
    if (i == 0) {}
    int j;
    for (i = 1;; j = 0) {
      return i;
    }
  }
  
  boolean isPointInsideHorizontalThumb(float paramFloat1, float paramFloat2)
  {
    int i = this.mRecyclerViewHeight;
    int m = this.mHorizontalThumbHeight;
    float f = i - m;
    boolean bool1 = paramFloat2 < f;
    boolean bool3;
    if (!bool1)
    {
      int j = this.mHorizontalThumbCenterX;
      m = this.mHorizontalThumbWidth / 2;
      f = j - m;
      boolean bool2 = paramFloat1 < f;
      if (!bool2)
      {
        int k = this.mHorizontalThumbCenterX;
        m = this.mHorizontalThumbWidth / 2;
        f = k + m;
        bool3 = paramFloat1 < f;
        if (!bool3) {
          bool3 = true;
        }
      }
    }
    for (f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool3;
      bool3 = false;
    }
  }
  
  boolean isPointInsideVerticalThumb(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = isLayoutRTL();
    int m;
    boolean bool3;
    if (bool1)
    {
      f = this.mVerticalThumbWidth / 2;
      bool1 = paramFloat1 < f;
      if (bool1) {
        break label120;
      }
      int i = this.mVerticalThumbCenterY;
      m = this.mVerticalThumbHeight / 2;
      f = i - m;
      boolean bool2 = paramFloat2 < f;
      if (bool2) {
        break label120;
      }
      int j = this.mVerticalThumbCenterY;
      m = this.mVerticalThumbHeight / 2;
      f = j + m;
      bool3 = paramFloat2 < f;
      if (bool3) {
        break label120;
      }
      bool3 = true;
    }
    for (float f = Float.MIN_VALUE;; f = 0.0F)
    {
      return bool3;
      int k = this.mRecyclerViewWidth;
      m = this.mVerticalThumbWidth;
      f = k - m;
      boolean bool4 = paramFloat1 < f;
      if (!bool4) {
        break;
      }
      label120:
      bool4 = false;
    }
  }
  
  boolean isVisible()
  {
    int i = 1;
    int j = this.mState;
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public void onDrawOver(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.State paramState)
  {
    int i = this.mRecyclerViewWidth;
    RecyclerView localRecyclerView = this.mRecyclerView;
    int j = localRecyclerView.getWidth();
    if (i == j)
    {
      i = this.mRecyclerViewHeight;
      localRecyclerView = this.mRecyclerView;
      j = localRecyclerView.getHeight();
      if (i == j) {}
    }
    else
    {
      i = this.mRecyclerView.getWidth();
      this.mRecyclerViewWidth = i;
      i = this.mRecyclerView.getHeight();
      this.mRecyclerViewHeight = i;
      i = 0;
      setState(0);
    }
    for (;;)
    {
      return;
      i = this.mAnimationState;
      if (i != 0)
      {
        boolean bool = this.mNeedVerticalScrollbar;
        if (bool) {
          drawVerticalScrollbar(paramCanvas);
        }
        bool = this.mNeedHorizontalScrollbar;
        if (bool) {
          drawHorizontalScrollbar(paramCanvas);
        }
      }
    }
  }
  
  public boolean onInterceptTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    int i = 0;
    float f1 = 0.0F;
    int j = 2;
    int k = 1;
    int m = this.mState;
    boolean bool1;
    if (m == k)
    {
      float f2 = paramMotionEvent.getX();
      float f3 = paramMotionEvent.getY();
      bool1 = isPointInsideVerticalThumb(f2, f3);
      f3 = paramMotionEvent.getX();
      float f4 = paramMotionEvent.getY();
      boolean bool2 = isPointInsideHorizontalThumb(f3, f4);
      int i1 = paramMotionEvent.getAction();
      if ((i1 == 0) && ((bool1) || (bool2))) {
        if (bool2)
        {
          this.mDragState = k;
          i = (int)paramMotionEvent.getX();
          f1 = i;
          this.mHorizontalDragX = f1;
          setState(j);
        }
      }
    }
    for (;;)
    {
      return k;
      if (!bool1) {
        break;
      }
      this.mDragState = j;
      i = (int)paramMotionEvent.getY();
      f1 = i;
      this.mVerticalDragY = f1;
      break;
      k = 0;
      continue;
      int n = this.mState;
      if (n != j) {
        k = 0;
      }
    }
  }
  
  public void onRequestDisallowInterceptTouchEvent(boolean paramBoolean) {}
  
  public void onTouchEvent(RecyclerView paramRecyclerView, MotionEvent paramMotionEvent)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    int i = 1;
    int j = 2;
    int k = this.mState;
    if (k == 0) {}
    for (;;)
    {
      return;
      k = paramMotionEvent.getAction();
      float f2;
      int m;
      if (k == 0)
      {
        f2 = paramMotionEvent.getX();
        f1 = paramMotionEvent.getY();
        boolean bool2 = isPointInsideVerticalThumb(f2, f1);
        f1 = paramMotionEvent.getX();
        float f3 = paramMotionEvent.getY();
        bool1 = isPointInsideHorizontalThumb(f1, f3);
        if ((bool2) || (bool1))
        {
          if (bool1)
          {
            this.mDragState = i;
            m = (int)paramMotionEvent.getX();
            f2 = m;
            this.mHorizontalDragX = f2;
          }
          for (;;)
          {
            setState(j);
            break;
            if (m != 0)
            {
              this.mDragState = j;
              m = (int)paramMotionEvent.getY();
              f2 = m;
              this.mVerticalDragY = f2;
            }
          }
        }
      }
      else
      {
        m = paramMotionEvent.getAction();
        if (m == i)
        {
          m = this.mState;
          if (m == j)
          {
            this.mVerticalDragY = 0.0F;
            this.mHorizontalDragX = 0.0F;
            setState(i);
            m = 0;
            f2 = 0.0F;
            this.mDragState = 0;
            continue;
          }
        }
        m = paramMotionEvent.getAction();
        if (m == j)
        {
          m = this.mState;
          if (m == j)
          {
            show();
            m = this.mDragState;
            if (m == i)
            {
              f2 = paramMotionEvent.getX();
              horizontalScrollTo(f2);
            }
            m = this.mDragState;
            if (m == j)
            {
              f2 = paramMotionEvent.getY();
              verticalScrollTo(f2);
            }
          }
        }
      }
    }
  }
  
  public void show()
  {
    int i = 1;
    int j = this.mAnimationState;
    switch (j)
    {
    }
    for (;;)
    {
      return;
      ValueAnimator localValueAnimator1 = this.mShowHideAnimator;
      localValueAnimator1.cancel();
      this.mAnimationState = i;
      ValueAnimator localValueAnimator2 = this.mShowHideAnimator;
      float[] arrayOfFloat = new float[2];
      float f = ((Float)this.mShowHideAnimator.getAnimatedValue()).floatValue();
      arrayOfFloat[0] = f;
      j = 1065353216;
      f = 1.0F;
      arrayOfFloat[i] = f;
      localValueAnimator2.setFloatValues(arrayOfFloat);
      this.mShowHideAnimator.setDuration(500L);
      localValueAnimator1 = this.mShowHideAnimator;
      long l = 0L;
      localValueAnimator1.setStartDelay(l);
      localValueAnimator1 = this.mShowHideAnimator;
      localValueAnimator1.start();
    }
  }
  
  void updateScrollPosition(int paramInt1, int paramInt2)
  {
    float f1 = 2.0F;
    float f2 = 0.0F;
    int i = 1;
    float f3 = Float.MIN_VALUE;
    RecyclerView localRecyclerView = this.mRecyclerView;
    int j = localRecyclerView.computeVerticalScrollRange();
    int k = this.mRecyclerViewHeight;
    int m = j - k;
    int i3;
    float f4;
    int i4;
    label136:
    int n;
    if (m > 0)
    {
      m = this.mRecyclerViewHeight;
      i3 = this.mScrollbarMinimumRange;
      if (m >= i3)
      {
        m = i;
        f4 = f3;
        this.mNeedVerticalScrollbar = m;
        localRecyclerView = this.mRecyclerView;
        i3 = localRecyclerView.computeHorizontalScrollRange();
        i4 = this.mRecyclerViewWidth;
        m = i3 - i4;
        if (m <= 0) {
          break label193;
        }
        m = this.mRecyclerViewWidth;
        int i5 = this.mScrollbarMinimumRange;
        if (m < i5) {
          break label193;
        }
        m = i;
        f4 = f3;
        this.mNeedHorizontalScrollbar = m;
        boolean bool1 = this.mNeedVerticalScrollbar;
        if (bool1) {
          break label205;
        }
        bool1 = this.mNeedHorizontalScrollbar;
        if (bool1) {
          break label205;
        }
        n = this.mState;
        if (n != 0) {
          setState(0);
        }
      }
    }
    for (;;)
    {
      return;
      n = 0;
      localRecyclerView = null;
      f4 = 0.0F;
      break;
      label193:
      n = 0;
      localRecyclerView = null;
      f4 = 0.0F;
      break label136;
      label205:
      boolean bool2 = this.mNeedVerticalScrollbar;
      if (bool2)
      {
        f4 = paramInt2;
        f2 = k / f1;
        f4 += f2;
        f2 = k;
        f4 *= f2;
        f2 = j;
        f4 /= f2;
        int i1 = (int)f4;
        this.mVerticalThumbCenterY = i1;
        i1 = k * k / j;
        i1 = Math.min(k, i1);
        this.mVerticalThumbHeight = i1;
      }
      boolean bool3 = this.mNeedHorizontalScrollbar;
      if (bool3)
      {
        f4 = paramInt1;
        f2 = i4 / f1;
        f4 += f2;
        f2 = i4;
        f4 *= f2;
        f2 = i3;
        f4 /= f2;
        i2 = (int)f4;
        this.mHorizontalThumbCenterX = i2;
        i2 = i4 * i4 / i3;
        i2 = Math.min(i4, i2);
        this.mHorizontalThumbWidth = i2;
      }
      int i2 = this.mState;
      if (i2 != 0)
      {
        i2 = this.mState;
        if (i2 != i) {}
      }
      else
      {
        setState(i);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\FastScroller.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */