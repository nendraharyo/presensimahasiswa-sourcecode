package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class ButtonBarLayout
  extends LinearLayout
{
  private static final int PEEK_BUTTON_DP = 16;
  private boolean mAllowStacking;
  private int mLastWidthSize = -1;
  private int mMinimumHeight = 0;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    Object localObject = R.styleable.ButtonBarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = R.styleable.ButtonBarLayout_allowStacking;
    boolean bool = ((TypedArray)localObject).getBoolean(i, true);
    this.mAllowStacking = bool;
    ((TypedArray)localObject).recycle();
  }
  
  private int getNextVisibleChildIndex(int paramInt)
  {
    int i = getChildCount();
    int j = paramInt;
    if (j < i)
    {
      View localView = getChildAt(j);
      int k = localView.getVisibility();
      if (k != 0) {}
    }
    for (;;)
    {
      return j;
      j += 1;
      break;
      j = -1;
    }
  }
  
  private boolean isStacked()
  {
    int i = 1;
    int j = getOrientation();
    if (j == i) {}
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  private void setStacked(boolean paramBoolean)
  {
    label17:
    View localView;
    if (paramBoolean)
    {
      i = 1;
      setOrientation(i);
      if (!paramBoolean) {
        break label83;
      }
      i = 5;
      setGravity(i);
      i = R.id.spacer;
      localView = findViewById(i);
      if (localView != null) {
        if (!paramBoolean) {
          break label89;
        }
      }
    }
    label83:
    label89:
    for (int i = 8;; i = 4)
    {
      localView.setVisibility(i);
      i = getChildCount() + -2;
      while (i >= 0)
      {
        localView = getChildAt(i);
        bringChildToFront(localView);
        i += -1;
      }
      i = 0;
      break;
      i = 80;
      break label17;
    }
  }
  
  public int getMinimumHeight()
  {
    int i = this.mMinimumHeight;
    int j = super.getMinimumHeight();
    return Math.max(i, j);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    float f2 = 0.0F;
    DisplayMetrics localDisplayMetrics = null;
    int m = View.MeasureSpec.getSize(paramInt1);
    boolean bool3 = this.mAllowStacking;
    if (bool3)
    {
      int i1 = this.mLastWidthSize;
      if (m > i1)
      {
        bool4 = isStacked();
        if (bool4) {
          setStacked(false);
        }
      }
      this.mLastWidthSize = m;
    }
    boolean bool4 = isStacked();
    int i2;
    int n;
    label157:
    LinearLayout.LayoutParams localLayoutParams;
    View localView2;
    if (!bool4)
    {
      i2 = View.MeasureSpec.getMode(paramInt1);
      int i3 = 1073741824;
      if (i2 == i3)
      {
        m = View.MeasureSpec.makeMeasureSpec(m, -1 << -1);
        i2 = i;
        super.onMeasure(m, paramInt2);
        boolean bool2 = this.mAllowStacking;
        if (bool2)
        {
          bool2 = isStacked();
          if (!bool2)
          {
            n = getMeasuredWidthAndState() & 0xFF000000;
            i3 = 16777216;
            if (n != i3) {
              break label364;
            }
            n = i;
            if (n != 0)
            {
              setStacked(i);
              i2 = i;
            }
          }
        }
        if (i2 != 0) {
          super.onMeasure(paramInt1, paramInt2);
        }
        i2 = getNextVisibleChildIndex(0);
        if (i2 < 0) {
          break label389;
        }
        View localView1 = getChildAt(i2);
        localLayoutParams = (LinearLayout.LayoutParams)localView1.getLayoutParams();
        i3 = getPaddingTop();
        int j = localView1.getMeasuredHeight() + i3;
        i3 = localLayoutParams.topMargin;
        j += i3;
        n = localLayoutParams.bottomMargin + j + 0;
        boolean bool1 = isStacked();
        if (!bool1) {
          break label373;
        }
        i2 += 1;
        i2 = getNextVisibleChildIndex(i2);
        if (i2 >= 0)
        {
          localView2 = getChildAt(i2);
          i2 = localView2.getPaddingTop();
          localDisplayMetrics = getResources().getDisplayMetrics();
          f2 = localDisplayMetrics.density;
          f1 = 16.0F * f2;
          int k = (int)f1;
          i2 += k;
          n += i2;
        }
      }
    }
    for (;;)
    {
      i2 = r.j(this);
      if (i2 != n) {
        setMinimumHeight(n);
      }
      return;
      n = paramInt1;
      i2 = 0;
      localView2 = null;
      break;
      label364:
      n = 0;
      localLayoutParams = null;
      break label157;
      label373:
      i2 = getPaddingBottom();
      n += i2;
      continue;
      label389:
      n = 0;
      localLayoutParams = null;
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    boolean bool = this.mAllowStacking;
    if (bool != paramBoolean)
    {
      this.mAllowStacking = paramBoolean;
      bool = this.mAllowStacking;
      if (!bool)
      {
        int i = getOrientation();
        int j = 1;
        if (i == j)
        {
          i = 0;
          setStacked(false);
        }
      }
      requestLayout();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ButtonBarLayout.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */