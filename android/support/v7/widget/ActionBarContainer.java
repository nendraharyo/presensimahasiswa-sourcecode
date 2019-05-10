package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;

public class ActionBarContainer
  extends FrameLayout
{
  private View mActionBarView;
  Drawable mBackground;
  private View mContextView;
  private int mHeight;
  boolean mIsSplit;
  boolean mIsStacked;
  private boolean mIsTransitioning;
  Drawable mSplitBackground;
  Drawable mStackedBackground;
  private View mTabContainer;
  
  public ActionBarContainer(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    boolean bool2;
    if (i >= j)
    {
      localObject = new android/support/v7/widget/ActionBarBackgroundDrawableV21;
      ((ActionBarBackgroundDrawableV21)localObject).<init>(this);
      r.a(this, (Drawable)localObject);
      localObject = R.styleable.ActionBar;
      localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
      j = R.styleable.ActionBar_background;
      Drawable localDrawable = ((TypedArray)localObject).getDrawable(j);
      this.mBackground = localDrawable;
      j = R.styleable.ActionBar_backgroundStacked;
      localDrawable = ((TypedArray)localObject).getDrawable(j);
      this.mStackedBackground = localDrawable;
      j = R.styleable.ActionBar_height;
      j = ((TypedArray)localObject).getDimensionPixelSize(j, -1);
      this.mHeight = j;
      j = getId();
      int k = R.id.split_action_bar;
      if (j == k)
      {
        this.mIsSplit = bool1;
        j = R.styleable.ActionBar_backgroundSplit;
        localDrawable = ((TypedArray)localObject).getDrawable(j);
        this.mSplitBackground = localDrawable;
      }
      ((TypedArray)localObject).recycle();
      bool2 = this.mIsSplit;
      if (!bool2) {
        break label219;
      }
      localObject = this.mSplitBackground;
      if (localObject != null) {
        break label210;
      }
      bool2 = bool1;
    }
    for (;;)
    {
      setWillNotDraw(bool2);
      return;
      localObject = new android/support/v7/widget/ActionBarBackgroundDrawable;
      ((ActionBarBackgroundDrawable)localObject).<init>(this);
      break;
      label210:
      bool2 = false;
      localObject = null;
      continue;
      label219:
      localObject = this.mBackground;
      if (localObject == null)
      {
        localObject = this.mStackedBackground;
        if (localObject == null)
        {
          bool2 = bool1;
          continue;
        }
      }
      bool2 = false;
      localObject = null;
    }
  }
  
  private int getMeasuredHeightWithMargins(View paramView)
  {
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)paramView.getLayoutParams();
    int i = paramView.getMeasuredHeight();
    int j = localLayoutParams.topMargin;
    i += j;
    return localLayoutParams.bottomMargin + i;
  }
  
  private boolean isCollapsed(View paramView)
  {
    if (paramView != null)
    {
      i = paramView.getVisibility();
      int k = 8;
      if (i != k)
      {
        i = paramView.getMeasuredHeight();
        if (i != 0) {
          break label30;
        }
      }
    }
    label30:
    int j;
    for (int i = 1;; j = 0) {
      return i;
    }
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    Drawable localDrawable = this.mBackground;
    boolean bool;
    int[] arrayOfInt;
    if (localDrawable != null)
    {
      localDrawable = this.mBackground;
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.mBackground;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = this.mStackedBackground;
    if (localDrawable != null)
    {
      localDrawable = this.mStackedBackground;
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.mStackedBackground;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
    localDrawable = this.mSplitBackground;
    if (localDrawable != null)
    {
      localDrawable = this.mSplitBackground;
      bool = localDrawable.isStateful();
      if (bool)
      {
        localDrawable = this.mSplitBackground;
        arrayOfInt = getDrawableState();
        localDrawable.setState(arrayOfInt);
      }
    }
  }
  
  public View getTabContainer()
  {
    return this.mTabContainer;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = this.mBackground;
    if (localDrawable != null)
    {
      localDrawable = this.mBackground;
      localDrawable.jumpToCurrentState();
    }
    localDrawable = this.mStackedBackground;
    if (localDrawable != null)
    {
      localDrawable = this.mStackedBackground;
      localDrawable.jumpToCurrentState();
    }
    localDrawable = this.mSplitBackground;
    if (localDrawable != null)
    {
      localDrawable = this.mSplitBackground;
      localDrawable.jumpToCurrentState();
    }
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    int i = R.id.action_bar;
    View localView = findViewById(i);
    this.mActionBarView = localView;
    i = R.id.action_context_bar;
    localView = findViewById(i);
    this.mContextView = localView;
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    super.onHoverEvent(paramMotionEvent);
    return true;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = this.mIsTransitioning;
    if (!bool)
    {
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      if (!bool) {
        break label23;
      }
    }
    label23:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 8;
    int j = 1;
    float f1 = Float.MIN_VALUE;
    int k = 0;
    Object localObject1 = null;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    View localView1 = this.mTabContainer;
    int i1;
    Object localObject2;
    int i2;
    int i3;
    int i4;
    if (localView1 != null)
    {
      int m = localView1.getVisibility();
      if (m != i)
      {
        i1 = j;
        if (localView1 != null)
        {
          m = localView1.getVisibility();
          if (m != i)
          {
            i = getMeasuredHeight();
            localObject2 = (FrameLayout.LayoutParams)localView1.getLayoutParams();
            i2 = localView1.getMeasuredHeight();
            i2 = i - i2;
            i3 = ((FrameLayout.LayoutParams)localObject2).bottomMargin;
            i2 -= i3;
            m = ((FrameLayout.LayoutParams)localObject2).bottomMargin;
            m = i - m;
            localView1.layout(paramInt1, i2, paramInt3, m);
          }
        }
        boolean bool = this.mIsSplit;
        if (!bool) {
          break label213;
        }
        localObject2 = this.mSplitBackground;
        if (localObject2 == null) {
          break label537;
        }
        localObject2 = this.mSplitBackground;
        i1 = getMeasuredWidth();
        i4 = getMeasuredHeight();
        ((Drawable)localObject2).setBounds(0, 0, i1, i4);
      }
    }
    for (;;)
    {
      if (j != 0) {
        invalidate();
      }
      return;
      i1 = 0;
      break;
      label213:
      localObject2 = this.mBackground;
      int n;
      View localView2;
      View localView3;
      View localView4;
      if (localObject2 != null)
      {
        localObject2 = this.mActionBarView;
        n = ((View)localObject2).getVisibility();
        if (n == 0)
        {
          localObject2 = this.mBackground;
          localObject1 = this.mActionBarView;
          k = ((View)localObject1).getLeft();
          localView2 = this.mActionBarView;
          i = localView2.getTop();
          localView3 = this.mActionBarView;
          i2 = localView3.getRight();
          localView4 = this.mActionBarView;
          i3 = localView4.getBottom();
          ((Drawable)localObject2).setBounds(k, i, i2, i3);
          label313:
          n = j;
        }
      }
      for (float f2 = f1;; f2 = 0.0F)
      {
        this.mIsStacked = i1;
        if (i1 != 0)
        {
          localObject1 = this.mStackedBackground;
          if (localObject1 != null)
          {
            localObject2 = this.mStackedBackground;
            k = localView1.getLeft();
            i1 = localView1.getTop();
            i = localView1.getRight();
            i4 = localView1.getBottom();
            ((Drawable)localObject2).setBounds(k, i1, i, i4);
            break;
            localObject2 = this.mContextView;
            if (localObject2 != null)
            {
              localObject2 = this.mContextView;
              n = ((View)localObject2).getVisibility();
              if (n == 0)
              {
                localObject2 = this.mBackground;
                localObject1 = this.mContextView;
                k = ((View)localObject1).getLeft();
                localView2 = this.mContextView;
                i = localView2.getTop();
                localView3 = this.mContextView;
                i2 = localView3.getRight();
                localView4 = this.mContextView;
                i3 = localView4.getBottom();
                ((Drawable)localObject2).setBounds(k, i, i2, i3);
                break label313;
              }
            }
            localObject2 = this.mBackground;
            ((Drawable)localObject2).setBounds(0, 0, 0, 0);
            break label313;
          }
        }
        j = n;
        f1 = f2;
        break;
        n = 0;
        localObject2 = null;
      }
      label537:
      j = 0;
      f1 = 0.0F;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = -1 << -1;
    View localView1 = this.mActionBarView;
    int j;
    int n;
    if (localView1 == null)
    {
      j = View.MeasureSpec.getMode(paramInt2);
      if (j == i)
      {
        j = this.mHeight;
        if (j >= 0)
        {
          j = this.mHeight;
          n = View.MeasureSpec.getSize(paramInt2);
          j = Math.min(j, n);
          paramInt2 = View.MeasureSpec.makeMeasureSpec(j, i);
        }
      }
    }
    super.onMeasure(paramInt1, paramInt2);
    localView1 = this.mActionBarView;
    if (localView1 == null) {}
    int i1;
    do
    {
      do
      {
        do
        {
          return;
          i1 = View.MeasureSpec.getMode(paramInt2);
          localView1 = this.mTabContainer;
        } while (localView1 == null);
        localView1 = this.mTabContainer;
        j = localView1.getVisibility();
        n = 8;
      } while (j == n);
      j = 1073741824;
    } while (i1 == j);
    localView1 = this.mActionBarView;
    boolean bool1 = isCollapsed(localView1);
    if (!bool1)
    {
      localView1 = this.mActionBarView;
      k = getMeasuredHeightWithMargins(localView1);
      n = k;
      label173:
      if (i1 != i) {
        break label282;
      }
    }
    int m;
    label282:
    for (int k = View.MeasureSpec.getSize(paramInt2);; m = -1 >>> 1)
    {
      i1 = getMeasuredWidth();
      View localView2 = this.mTabContainer;
      i = getMeasuredHeightWithMargins(localView2);
      n += i;
      k = Math.min(n, k);
      setMeasuredDimension(i1, k);
      break;
      localView1 = this.mContextView;
      boolean bool2 = isCollapsed(localView1);
      if (!bool2)
      {
        localView1 = this.mContextView;
        m = getMeasuredHeightWithMargins(localView1);
        n = m;
        break label173;
      }
      m = 0;
      localView1 = null;
      n = 0;
      break label173;
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    super.onTouchEvent(paramMotionEvent);
    return true;
  }
  
  public void setPrimaryBackground(Drawable paramDrawable)
  {
    boolean bool1 = true;
    Object localObject = this.mBackground;
    int i;
    View localView1;
    if (localObject != null)
    {
      localObject = this.mBackground;
      i = 0;
      localView1 = null;
      ((Drawable)localObject).setCallback(null);
      localObject = this.mBackground;
      unscheduleDrawable((Drawable)localObject);
    }
    this.mBackground = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      localObject = this.mActionBarView;
      if (localObject != null)
      {
        localObject = this.mBackground;
        localView1 = this.mActionBarView;
        i = localView1.getLeft();
        View localView2 = this.mActionBarView;
        int j = localView2.getTop();
        View localView3 = this.mActionBarView;
        int k = localView3.getRight();
        View localView4 = this.mActionBarView;
        int m = localView4.getBottom();
        ((Drawable)localObject).setBounds(i, j, k, m);
      }
    }
    boolean bool2 = this.mIsSplit;
    if (bool2)
    {
      localObject = this.mSplitBackground;
      if (localObject != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      invalidate();
      return;
      bool1 = false;
      continue;
      localObject = this.mBackground;
      if (localObject == null)
      {
        localObject = this.mStackedBackground;
        if (localObject == null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void setSplitBackground(Drawable paramDrawable)
  {
    boolean bool1 = true;
    Drawable localDrawable = this.mSplitBackground;
    int i;
    if (localDrawable != null)
    {
      localDrawable = this.mSplitBackground;
      i = 0;
      localDrawable.setCallback(null);
      localDrawable = this.mSplitBackground;
      unscheduleDrawable(localDrawable);
    }
    this.mSplitBackground = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      bool2 = this.mIsSplit;
      if (bool2)
      {
        localDrawable = this.mSplitBackground;
        if (localDrawable != null)
        {
          localDrawable = this.mSplitBackground;
          i = getMeasuredWidth();
          int j = getMeasuredHeight();
          localDrawable.setBounds(0, 0, i, j);
        }
      }
    }
    boolean bool2 = this.mIsSplit;
    if (bool2)
    {
      localDrawable = this.mSplitBackground;
      if (localDrawable != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      invalidate();
      return;
      bool1 = false;
      continue;
      localDrawable = this.mBackground;
      if (localDrawable == null)
      {
        localDrawable = this.mStackedBackground;
        if (localDrawable == null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void setStackedBackground(Drawable paramDrawable)
  {
    boolean bool1 = true;
    Drawable localDrawable = this.mStackedBackground;
    int i;
    View localView1;
    if (localDrawable != null)
    {
      localDrawable = this.mStackedBackground;
      i = 0;
      localView1 = null;
      localDrawable.setCallback(null);
      localDrawable = this.mStackedBackground;
      unscheduleDrawable(localDrawable);
    }
    this.mStackedBackground = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      bool2 = this.mIsStacked;
      if (bool2)
      {
        localDrawable = this.mStackedBackground;
        if (localDrawable != null)
        {
          localDrawable = this.mStackedBackground;
          localView1 = this.mTabContainer;
          i = localView1.getLeft();
          View localView2 = this.mTabContainer;
          int j = localView2.getTop();
          View localView3 = this.mTabContainer;
          int k = localView3.getRight();
          View localView4 = this.mTabContainer;
          int m = localView4.getBottom();
          localDrawable.setBounds(i, j, k, m);
        }
      }
    }
    boolean bool2 = this.mIsSplit;
    if (bool2)
    {
      localDrawable = this.mSplitBackground;
      if (localDrawable != null) {}
    }
    for (;;)
    {
      setWillNotDraw(bool1);
      invalidate();
      return;
      bool1 = false;
      continue;
      localDrawable = this.mBackground;
      if (localDrawable == null)
      {
        localDrawable = this.mStackedBackground;
        if (localDrawable == null) {}
      }
      else
      {
        bool1 = false;
      }
    }
  }
  
  public void setTabContainer(ScrollingTabContainerView paramScrollingTabContainerView)
  {
    Object localObject = this.mTabContainer;
    if (localObject != null)
    {
      localObject = this.mTabContainer;
      removeView((View)localObject);
    }
    this.mTabContainer = paramScrollingTabContainerView;
    if (paramScrollingTabContainerView != null)
    {
      addView(paramScrollingTabContainerView);
      localObject = paramScrollingTabContainerView.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = -1;
      int i = -2;
      ((ViewGroup.LayoutParams)localObject).height = i;
      localObject = null;
      paramScrollingTabContainerView.setAllowCollapse(false);
    }
  }
  
  public void setTransitioning(boolean paramBoolean)
  {
    this.mIsTransitioning = paramBoolean;
    if (paramBoolean) {}
    for (int i = 393216;; i = 262144)
    {
      setDescendantFocusability(i);
      return;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    super.setVisibility(paramInt);
    if (paramInt == 0) {}
    for (boolean bool = true;; bool = false)
    {
      Drawable localDrawable = this.mBackground;
      if (localDrawable != null)
      {
        localDrawable = this.mBackground;
        localDrawable.setVisible(bool, false);
      }
      localDrawable = this.mStackedBackground;
      if (localDrawable != null)
      {
        localDrawable = this.mStackedBackground;
        localDrawable.setVisible(bool, false);
      }
      localDrawable = this.mSplitBackground;
      if (localDrawable != null)
      {
        localDrawable = this.mSplitBackground;
        localDrawable.setVisible(bool, false);
      }
      return;
    }
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public ActionMode startActionModeForChild(View paramView, ActionMode.Callback paramCallback, int paramInt)
  {
    if (paramInt != 0) {}
    for (ActionMode localActionMode = super.startActionModeForChild(paramView, paramCallback, paramInt);; localActionMode = null) {
      return localActionMode;
    }
  }
  
  protected boolean verifyDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mBackground;
    if (paramDrawable == localDrawable)
    {
      bool = this.mIsSplit;
      if (!bool) {}
    }
    else
    {
      localDrawable = this.mStackedBackground;
      if (paramDrawable == localDrawable)
      {
        bool = this.mIsStacked;
        if (bool) {}
      }
      else
      {
        localDrawable = this.mSplitBackground;
        if (paramDrawable == localDrawable)
        {
          bool = this.mIsSplit;
          if (bool) {}
        }
        else
        {
          bool = super.verifyDrawable(paramDrawable);
          if (!bool) {
            break label71;
          }
        }
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label71:
      bool = false;
      localDrawable = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarContainer.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */