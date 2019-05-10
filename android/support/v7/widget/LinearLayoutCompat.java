package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.styleable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

public class LinearLayoutCompat
  extends ViewGroup
{
  public static final int HORIZONTAL = 0;
  private static final int INDEX_BOTTOM = 2;
  private static final int INDEX_CENTER_VERTICAL = 0;
  private static final int INDEX_FILL = 3;
  private static final int INDEX_TOP = 1;
  public static final int SHOW_DIVIDER_BEGINNING = 1;
  public static final int SHOW_DIVIDER_END = 4;
  public static final int SHOW_DIVIDER_MIDDLE = 2;
  public static final int SHOW_DIVIDER_NONE = 0;
  public static final int VERTICAL = 1;
  private static final int VERTICAL_GRAVITY_COUNT = 4;
  private boolean mBaselineAligned;
  private int mBaselineAlignedChildIndex;
  private int mBaselineChildTop;
  private Drawable mDivider;
  private int mDividerHeight;
  private int mDividerPadding;
  private int mDividerWidth;
  private int mGravity;
  private int[] mMaxAscent;
  private int[] mMaxDescent;
  private int mOrientation;
  private int mShowDividers;
  private int mTotalLength;
  private boolean mUseLargestChild;
  private float mWeightSum;
  
  public LinearLayoutCompat(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.mBaselineAligned = bool1;
    this.mBaselineAlignedChildIndex = i;
    this.mBaselineChildTop = 0;
    int j = 8388659;
    this.mGravity = j;
    Object localObject = R.styleable.LinearLayoutCompat;
    localObject = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    int k = R.styleable.LinearLayoutCompat_android_orientation;
    k = ((TintTypedArray)localObject).getInt(k, i);
    if (k >= 0) {
      setOrientation(k);
    }
    k = R.styleable.LinearLayoutCompat_android_gravity;
    k = ((TintTypedArray)localObject).getInt(k, i);
    if (k >= 0) {
      setGravity(k);
    }
    k = R.styleable.LinearLayoutCompat_android_baselineAligned;
    boolean bool2 = ((TintTypedArray)localObject).getBoolean(k, bool1);
    if (!bool2) {
      setBaselineAligned(bool2);
    }
    int m = R.styleable.LinearLayoutCompat_android_weightSum;
    float f = ((TintTypedArray)localObject).getFloat(m, -1.0F);
    this.mWeightSum = f;
    m = R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex;
    m = ((TintTypedArray)localObject).getInt(m, i);
    this.mBaselineAlignedChildIndex = m;
    m = R.styleable.LinearLayoutCompat_measureWithLargestChild;
    boolean bool3 = ((TintTypedArray)localObject).getBoolean(m, false);
    this.mUseLargestChild = bool3;
    int n = R.styleable.LinearLayoutCompat_divider;
    Drawable localDrawable = ((TintTypedArray)localObject).getDrawable(n);
    setDividerDrawable(localDrawable);
    n = R.styleable.LinearLayoutCompat_showDividers;
    n = ((TintTypedArray)localObject).getInt(n, 0);
    this.mShowDividers = n;
    n = R.styleable.LinearLayoutCompat_dividerPadding;
    n = ((TintTypedArray)localObject).getDimensionPixelSize(n, 0);
    this.mDividerPadding = n;
    ((TintTypedArray)localObject).recycle();
  }
  
  private void forceUniformHeight(int paramInt1, int paramInt2)
  {
    int i = getMeasuredHeight();
    int j = 1073741824;
    int k = View.MeasureSpec.makeMeasureSpec(i, j);
    for (int m = 0; m < paramInt1; m = i)
    {
      View localView = getVirtualChildAt(m);
      i = localView.getVisibility();
      int n = 8;
      if (i != n)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        i = ((LinearLayoutCompat.LayoutParams)localObject2).height;
        n = -1;
        if (i == n)
        {
          int i1 = ((LinearLayoutCompat.LayoutParams)localObject2).width;
          i = localView.getMeasuredWidth();
          ((LinearLayoutCompat.LayoutParams)localObject2).width = i;
          localObject1 = this;
          n = paramInt2;
          measureChildWithMargins(localView, paramInt2, 0, k, 0);
          ((LinearLayoutCompat.LayoutParams)localObject2).width = i1;
        }
      }
      i = m + 1;
    }
  }
  
  private void forceUniformWidth(int paramInt1, int paramInt2)
  {
    int i = getMeasuredWidth();
    int j = 1073741824;
    int k = View.MeasureSpec.makeMeasureSpec(i, j);
    for (int m = 0; m < paramInt1; m = i)
    {
      View localView = getVirtualChildAt(m);
      i = localView.getVisibility();
      int n = 8;
      if (i != n)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        i = ((LinearLayoutCompat.LayoutParams)localObject2).width;
        n = -1;
        if (i == n)
        {
          int i1 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
          i = localView.getMeasuredHeight();
          ((LinearLayoutCompat.LayoutParams)localObject2).height = i;
          localObject1 = this;
          n = paramInt2;
          measureChildWithMargins(localView, k, 0, paramInt2, 0);
          ((LinearLayoutCompat.LayoutParams)localObject2).height = i1;
        }
      }
      i = m + 1;
    }
  }
  
  private void setChildFrame(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 + paramInt3;
    int j = paramInt2 + paramInt4;
    paramView.layout(paramInt1, paramInt2, i, j);
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LinearLayoutCompat.LayoutParams;
  }
  
  void drawDividersHorizontal(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    int j = 0;
    LinearLayoutCompat.LayoutParams localLayoutParams = null;
    int n = 0;
    View localView1 = null;
    if (n < i)
    {
      View localView2 = getVirtualChildAt(n);
      int i2;
      int k;
      if (localView2 != null)
      {
        j = localView2.getVisibility();
        int i1 = 8;
        if (j != i1)
        {
          boolean bool2 = hasDividerBeforeChildAt(n);
          if (bool2)
          {
            localLayoutParams = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
            if (!bool1) {
              break label123;
            }
            i2 = localView2.getRight();
            k = localLayoutParams.rightMargin + i2;
          }
        }
      }
      for (;;)
      {
        drawVerticalDivider(paramCanvas, k);
        k = n + 1;
        n = k;
        break;
        label123:
        i2 = localView2.getLeft();
        k = localLayoutParams.leftMargin;
        k = i2 - k;
        i2 = this.mDividerWidth;
        k -= i2;
      }
    }
    boolean bool3 = hasDividerBeforeChildAt(i);
    int m;
    if (bool3)
    {
      m = i + -1;
      localView1 = getVirtualChildAt(m);
      if (localView1 != null) {
        break label243;
      }
      if (!bool1) {
        break label208;
      }
      m = getPaddingLeft();
    }
    for (;;)
    {
      drawVerticalDivider(paramCanvas, m);
      return;
      label208:
      m = getWidth();
      n = getPaddingRight();
      m -= n;
      n = this.mDividerWidth;
      m -= n;
      continue;
      label243:
      localLayoutParams = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
      if (bool1)
      {
        n = localView1.getLeft();
        m = localLayoutParams.leftMargin;
        m = n - m;
        n = this.mDividerWidth;
        m -= n;
      }
      else
      {
        n = localView1.getRight();
        m = localLayoutParams.rightMargin + n;
      }
    }
  }
  
  void drawDividersVertical(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    int j = 0;
    LinearLayoutCompat.LayoutParams localLayoutParams = null;
    int n = 0;
    View localView1 = null;
    while (n < i)
    {
      View localView2 = getVirtualChildAt(n);
      if (localView2 != null)
      {
        j = localView2.getVisibility();
        int i1 = 8;
        if (j != i1)
        {
          boolean bool1 = hasDividerBeforeChildAt(n);
          if (bool1)
          {
            localLayoutParams = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
            int i2 = localView2.getTop();
            k = localLayoutParams.topMargin;
            k = i2 - k;
            i2 = this.mDividerHeight;
            k -= i2;
            drawHorizontalDivider(paramCanvas, k);
          }
        }
      }
      int k = n + 1;
      n = k;
    }
    boolean bool2 = hasDividerBeforeChildAt(i);
    int m;
    if (bool2)
    {
      m = i + -1;
      localView1 = getVirtualChildAt(m);
      if (localView1 != null) {
        break label178;
      }
      m = getHeight();
      n = getPaddingBottom();
      m -= n;
      n = this.mDividerHeight;
      m -= n;
    }
    for (;;)
    {
      drawHorizontalDivider(paramCanvas, m);
      return;
      label178:
      localLayoutParams = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
      n = localView1.getBottom();
      m = localLayoutParams.bottomMargin + n;
    }
  }
  
  void drawHorizontalDivider(Canvas paramCanvas, int paramInt)
  {
    Drawable localDrawable = this.mDivider;
    int i = getPaddingLeft();
    int j = this.mDividerPadding;
    i += j;
    j = getWidth();
    int k = getPaddingRight();
    j -= k;
    k = this.mDividerPadding;
    j -= k;
    k = this.mDividerHeight + paramInt;
    localDrawable.setBounds(i, paramInt, j, k);
    this.mDivider.draw(paramCanvas);
  }
  
  void drawVerticalDivider(Canvas paramCanvas, int paramInt)
  {
    Drawable localDrawable = this.mDivider;
    int i = getPaddingTop();
    int j = this.mDividerPadding;
    i += j;
    j = this.mDividerWidth + paramInt;
    int k = getHeight();
    int m = getPaddingBottom();
    k -= m;
    m = this.mDividerPadding;
    k -= m;
    localDrawable.setBounds(paramInt, i, j, k);
    this.mDivider.draw(paramCanvas);
  }
  
  protected LinearLayoutCompat.LayoutParams generateDefaultLayoutParams()
  {
    int i = -2;
    int j = this.mOrientation;
    LinearLayoutCompat.LayoutParams localLayoutParams;
    if (j == 0)
    {
      localLayoutParams = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
      localLayoutParams.<init>(i, i);
    }
    for (;;)
    {
      return localLayoutParams;
      j = this.mOrientation;
      int k = 1;
      if (j == k)
      {
        localLayoutParams = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
        k = -1;
        localLayoutParams.<init>(k, i);
      }
      else
      {
        j = 0;
        localLayoutParams = null;
      }
    }
  }
  
  public LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    LinearLayoutCompat.LayoutParams localLayoutParams = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  protected LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    LinearLayoutCompat.LayoutParams localLayoutParams = new android/support/v7/widget/LinearLayoutCompat$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public int getBaseline()
  {
    int i = -1;
    int j = this.mBaselineAlignedChildIndex;
    if (j < 0) {
      i = super.getBaseline();
    }
    View localView;
    int m;
    do
    {
      return i;
      j = getChildCount();
      int k = this.mBaselineAlignedChildIndex;
      if (j <= k)
      {
        localObject = new java/lang/RuntimeException;
        ((RuntimeException)localObject).<init>("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        throw ((Throwable)localObject);
      }
      j = this.mBaselineAlignedChildIndex;
      localView = getChildAt(j);
      m = localView.getBaseline();
      if (m != i) {
        break;
      }
      j = this.mBaselineAlignedChildIndex;
    } while (j == 0);
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
    throw ((Throwable)localObject);
    i = this.mBaselineChildTop;
    j = this.mOrientation;
    int n = 1;
    if (j == n)
    {
      j = this.mGravity & 0x70;
      n = 48;
      if (j == n) {}
    }
    switch (j)
    {
    default: 
      j = i;
    }
    for (;;)
    {
      localObject = (LinearLayoutCompat.LayoutParams)localView.getLayoutParams();
      i = ((LinearLayoutCompat.LayoutParams)localObject).topMargin + j + m;
      break;
      i = getBottom();
      j = getTop();
      i -= j;
      j = getPaddingBottom();
      i -= j;
      j = this.mTotalLength;
      i -= j;
      j = i;
      continue;
      j = getBottom();
      n = getTop();
      j -= n;
      n = getPaddingTop();
      j -= n;
      n = getPaddingBottom();
      j -= n;
      n = this.mTotalLength;
      j = (j - n) / 2;
      i += j;
      j = i;
    }
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return this.mBaselineAlignedChildIndex;
  }
  
  int getChildrenSkipCount(View paramView, int paramInt)
  {
    return 0;
  }
  
  public Drawable getDividerDrawable()
  {
    return this.mDivider;
  }
  
  public int getDividerPadding()
  {
    return this.mDividerPadding;
  }
  
  public int getDividerWidth()
  {
    return this.mDividerWidth;
  }
  
  public int getGravity()
  {
    return this.mGravity;
  }
  
  int getLocationOffset(View paramView)
  {
    return 0;
  }
  
  int getNextLocationOffset(View paramView)
  {
    return 0;
  }
  
  public int getOrientation()
  {
    return this.mOrientation;
  }
  
  public int getShowDividers()
  {
    return this.mShowDividers;
  }
  
  View getVirtualChildAt(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return this.mWeightSum;
  }
  
  protected boolean hasDividerBeforeChildAt(int paramInt)
  {
    boolean bool = true;
    int i;
    if (paramInt == 0)
    {
      i = this.mShowDividers & 0x1;
      if (i == 0) {}
    }
    for (;;)
    {
      return bool;
      bool = false;
      continue;
      i = getChildCount();
      if (paramInt == i)
      {
        i = this.mShowDividers & 0x4;
        if (i == 0) {
          bool = false;
        }
      }
      else
      {
        i = this.mShowDividers & 0x2;
        if (i != 0)
        {
          i = paramInt + -1;
          for (;;)
          {
            if (i < 0) {
              break label106;
            }
            View localView = getChildAt(i);
            int j = localView.getVisibility();
            int k = 8;
            if (j != k) {
              break;
            }
            i += -1;
          }
        }
        bool = false;
        continue;
        label106:
        bool = false;
      }
    }
  }
  
  public boolean isBaselineAligned()
  {
    return this.mBaselineAligned;
  }
  
  public boolean isMeasureWithLargestChildEnabled()
  {
    return this.mUseLargestChild;
  }
  
  void layoutHorizontal(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = ViewUtils.isLayoutRtl(this);
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2;
    int n = getPaddingBottom();
    int i1 = k - n;
    k -= j;
    n = getPaddingBottom();
    int i2 = k - n;
    int i3 = getVirtualChildCount();
    Object localObject1 = this;
    k = this.mGravity & 0x800007;
    int i4 = this.mGravity & 0x70;
    boolean bool3 = this.mBaselineAligned;
    boolean bool4 = bool3;
    int[] arrayOfInt = this.mMaxAscent;
    localObject1 = this;
    localObject1 = this.mMaxDescent;
    Object localObject2 = localObject1;
    n = r.e(this);
    k = d.a(k, n);
    int i5;
    View localView;
    int i6;
    switch (k)
    {
    default: 
      i5 = getPaddingLeft();
      n = 0;
      localView = null;
      k = 1;
      if (bool1)
      {
        n = i3 + -1;
        k = -1;
        i6 = k;
      }
      break;
    }
    for (int i7 = n;; i7 = 0)
    {
      int i8 = 0;
      label192:
      bool3 = i3;
      int i9;
      if (i8 < i3)
      {
        k = i6 * i8;
        i9 = i7 + k;
        localObject1 = this;
        localView = getVirtualChildAt(i9);
        if (localView == null)
        {
          k = measureNullChild(i9);
          i5 += k;
          k = i8;
        }
      }
      label484:
      int m;
      for (;;)
      {
        i8 = k + 1;
        break label192;
        k = getPaddingLeft() + paramInt3 - paramInt1;
        localObject1 = this;
        n = this.mTotalLength;
        i5 = k - n;
        break;
        k = getPaddingLeft();
        n = paramInt3 - paramInt1;
        localObject1 = this;
        int i10 = this.mTotalLength;
        n = (n - i10) / 2;
        i5 = k + n;
        break;
        k = localView.getVisibility();
        int i = 8;
        float f = 1.1E-44F;
        if (k != i)
        {
          int i11 = localView.getMeasuredWidth();
          int i12 = localView.getMeasuredHeight();
          i = -1;
          f = 0.0F / 0.0F;
          Object localObject3 = localView.getLayoutParams();
          Object localObject4 = localObject3;
          localObject4 = (LinearLayoutCompat.LayoutParams)localObject3;
          if (bool4)
          {
            k = ((LinearLayoutCompat.LayoutParams)localObject4).height;
            i10 = -1;
            if (k == i10) {}
          }
          for (k = localView.getBaseline();; m = i)
          {
            i = ((LinearLayoutCompat.LayoutParams)localObject4).gravity;
            if (i < 0) {
              i = i4;
            }
            i &= 0x70;
            switch (i)
            {
            default: 
              i10 = j;
              localObject1 = this;
              boolean bool2 = hasDividerBeforeChildAt(i9);
              if (!bool2) {
                break;
              }
            }
            for (m = this.mDividerWidth + i5;; m = i5)
            {
              i = ((LinearLayoutCompat.LayoutParams)localObject4).leftMargin;
              i5 = m + i;
              localObject1 = this;
              m = getLocationOffset(localView);
              i = i5 + m;
              localObject3 = this;
              setChildFrame(localView, i, i10, i11, i12);
              m = ((LinearLayoutCompat.LayoutParams)localObject4).rightMargin + i11;
              i = getNextLocationOffset(localView);
              m += i;
              i5 += m;
              m = getChildrenSkipCount(localView, i9) + i8;
              break;
              i = ((LinearLayoutCompat.LayoutParams)localObject4).topMargin;
              i10 = j + i;
              i = -1;
              f = 0.0F / 0.0F;
              if (m == i) {
                break label484;
              }
              f = Float.MIN_VALUE;
              i = arrayOfInt[1];
              m = i - m;
              i10 += m;
              break label484;
              m = (i2 - i12) / 2 + j;
              i = ((LinearLayoutCompat.LayoutParams)localObject4).topMargin;
              m += i;
              i = ((LinearLayoutCompat.LayoutParams)localObject4).bottomMargin;
              i10 = m - i;
              break label484;
              i = i1 - i12;
              i10 = ((LinearLayoutCompat.LayoutParams)localObject4).bottomMargin;
              i10 = i - i10;
              i = -1;
              f = 0.0F / 0.0F;
              if (m == i) {
                break label484;
              }
              m = localView.getMeasuredHeight() - m;
              f = 2.8E-45F;
              i = localObject2[2];
              m = i - m;
              i10 -= m;
              break label484;
              return;
            }
          }
        }
        m = i8;
      }
      i6 = m;
    }
  }
  
  void layoutVertical(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int m = getPaddingRight();
    int n = j - m;
    j -= i;
    m = getPaddingRight();
    int i1 = j - m;
    int i2 = getVirtualChildCount();
    j = this.mGravity & 0x70;
    m = this.mGravity;
    int i3 = 8388615;
    int i4 = m & i3;
    int i5;
    int i6;
    label117:
    View localView;
    switch (j)
    {
    default: 
      j = getPaddingTop();
      i5 = 0;
      i6 = j;
      if (i5 < i2)
      {
        localView = getVirtualChildAt(i5);
        if (localView == null)
        {
          j = measureNullChild(i5);
          i6 += j;
          j = i5;
        }
      }
      break;
    }
    for (;;)
    {
      i5 = j + 1;
      break label117;
      j = getPaddingTop() + paramInt4 - paramInt2;
      m = this.mTotalLength;
      j -= m;
      break;
      j = getPaddingTop();
      m = paramInt4 - paramInt2;
      i3 = this.mTotalLength;
      m = (m - i3) / 2;
      j += m;
      break;
      j = localView.getVisibility();
      i3 = 8;
      if (j != i3)
      {
        int i7 = localView.getMeasuredWidth();
        int i8 = localView.getMeasuredHeight();
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        j = ((LinearLayoutCompat.LayoutParams)localObject2).gravity;
        if (j < 0) {
          j = i4;
        }
        i3 = r.e(this);
        j = d.a(j, i3) & 0x7;
        switch (j)
        {
        default: 
          j = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin;
          i3 = i + j;
          label354:
          boolean bool = hasDividerBeforeChildAt(i5);
          if (!bool) {
            break;
          }
        }
        for (k = this.mDividerHeight + i6;; k = i6)
        {
          i6 = ((LinearLayoutCompat.LayoutParams)localObject2).topMargin;
          int i9 = k + i6;
          k = getLocationOffset(localView);
          i6 = i9 + k;
          localObject1 = this;
          setChildFrame(localView, i3, i6, i7, i8);
          k = ((LinearLayoutCompat.LayoutParams)localObject2).bottomMargin + i8;
          i3 = getNextLocationOffset(localView);
          k += i3;
          i6 = i9 + k;
          k = getChildrenSkipCount(localView, i5) + i5;
          break;
          k = (i1 - i7) / 2 + i;
          i3 = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin;
          k += i3;
          i3 = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin;
          i3 = k - i3;
          break label354;
          k = n - i7;
          i3 = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin;
          i3 = k - i3;
          break label354;
          return;
        }
      }
      int k = i5;
    }
  }
  
  void measureChildBeforeLayout(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  void measureHorizontal(int paramInt1, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = this;
    this.mTotalLength = 0;
    int i3 = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 1;
    float f2 = Float.MIN_VALUE;
    int i8 = 0;
    float f3 = 0.0F;
    View localView1 = null;
    int i10 = getVirtualChildCount();
    int i11 = View.MeasureSpec.getMode(paramInt1);
    int i12 = View.MeasureSpec.getMode(paramInt2);
    int i13 = 0;
    float f4 = 0.0F;
    int i14 = 0;
    float f5 = 0.0F;
    View localView2 = null;
    Object localObject2 = this.mMaxAscent;
    if (localObject2 != null)
    {
      localObject2 = this.mMaxDescent;
      if (localObject2 != null) {}
    }
    else
    {
      localObject2 = new int[4];
      localObject1 = this;
      this.mMaxAscent = ((int[])localObject2);
      i = 4;
      f1 = 5.6E-45F;
      localObject2 = new int[i];
      this.mMaxDescent = ((int[])localObject2);
    }
    localObject1 = this;
    int[] arrayOfInt = this.mMaxAscent;
    localObject1 = this;
    localObject1 = this.mMaxDescent;
    Object localObject3 = localObject1;
    int i15 = -1;
    arrayOfInt[3] = i15;
    arrayOfInt[2] = i15;
    arrayOfInt[1] = i15;
    arrayOfInt[0] = i15;
    localObject2 = null;
    int i16 = 1;
    float f6 = Float.MIN_VALUE;
    int i18 = 2;
    float f7 = 2.8E-45F;
    int i19 = 3;
    float f8 = 4.2E-45F;
    i15 = -1;
    float f9 = 0.0F / 0.0F;
    localObject1[i19] = i15;
    localObject1[i18] = i15;
    localObject1[i16] = i15;
    localObject1[0] = i15;
    localObject1 = this;
    boolean bool9 = this.mBaselineAligned;
    boolean bool10 = this.mUseLargestChild;
    i = 1073741824;
    f1 = 2.0F;
    int i20;
    int i21;
    label284:
    View localView3;
    if (i11 == i)
    {
      i = 1;
      f1 = Float.MIN_VALUE;
      i20 = i;
      i21 = 0;
      i18 = 0;
      f7 = 0.0F;
      if (i18 >= i10) {
        break label1455;
      }
      localObject1 = this;
      localView3 = getVirtualChildAt(i18);
      if (localView3 != null) {
        break label407;
      }
      i = this.mTotalLength;
      i16 = measureNullChild(i18);
      i += i16;
      this.mTotalLength = i;
      i = i21;
      i16 = i14;
      f6 = f5;
      i19 = i7;
      f8 = f2;
      i15 = i4;
    }
    for (int i22 = i3;; i22 = i3)
    {
      i18 += 1;
      i21 = i;
      i14 = i16;
      f5 = f6;
      i7 = i19;
      f2 = f8;
      i4 = i15;
      i3 = i22;
      break label284;
      i = 0;
      f1 = 0.0F;
      localObject2 = null;
      i20 = 0;
      break;
      label407:
      i = localView3.getVisibility();
      i19 = 8;
      f8 = 1.1E-44F;
      if (i != i19) {
        break label472;
      }
      i = getChildrenSkipCount(localView3, i18);
      i18 += i;
      i = i21;
      i16 = i14;
      f6 = f5;
      i19 = i7;
      f8 = f2;
      i15 = i4;
    }
    label472:
    boolean bool1 = hasDividerBeforeChildAt(i18);
    if (bool1)
    {
      j = this.mTotalLength;
      i19 = this.mDividerWidth;
      j += i19;
      this.mTotalLength = j;
    }
    localObject2 = localView3.getLayoutParams();
    Object localObject4 = localObject2;
    localObject4 = (LinearLayoutCompat.LayoutParams)localObject2;
    f1 = ((LinearLayoutCompat.LayoutParams)localObject4).weight;
    float f10 = f3 + f1;
    int j = 1073741824;
    f1 = 2.0F;
    int k;
    if (i11 == j)
    {
      j = ((LinearLayoutCompat.LayoutParams)localObject4).width;
      if (j == 0)
      {
        f1 = ((LinearLayoutCompat.LayoutParams)localObject4).weight;
        i8 = 0;
        f3 = 0.0F;
        localView1 = null;
        boolean bool2 = f1 < 0.0F;
        if (bool2) {
          if (i20 != 0)
          {
            localObject1 = this;
            k = this.mTotalLength;
            i8 = ((LinearLayoutCompat.LayoutParams)localObject4).leftMargin;
            i19 = ((LinearLayoutCompat.LayoutParams)localObject4).rightMargin;
            i8 += i19;
            k += i8;
            this.mTotalLength = k;
            label628:
            if (!bool9) {
              break label1069;
            }
            f1 = 0.0F;
            localObject2 = null;
            i8 = 0;
            f3 = 0.0F;
            localView1 = null;
            k = View.MeasureSpec.makeMeasureSpec(0, 0);
            localView3.measure(k, k);
            label661:
            k = 0;
            f1 = 0.0F;
            localObject2 = null;
            i8 = 1073741824;
            f3 = 2.0F;
            if (i12 == i8) {
              break label3774;
            }
            i8 = ((LinearLayoutCompat.LayoutParams)localObject4).height;
            i19 = -1;
            f8 = 0.0F / 0.0F;
            if (i8 != i19) {
              break label3774;
            }
            i8 = 1;
            f3 = Float.MIN_VALUE;
            k = 1;
            f1 = Float.MIN_VALUE;
          }
        }
      }
    }
    for (;;)
    {
      i19 = ((LinearLayoutCompat.LayoutParams)localObject4).topMargin;
      i15 = ((LinearLayoutCompat.LayoutParams)localObject4).bottomMargin + i19;
      i22 = localView3.getMeasuredHeight() + i15;
      i19 = localView3.getMeasuredState();
      i13 = View.combineMeasuredStates(i4, i19);
      label810:
      int i23;
      if (bool9)
      {
        i4 = localView3.getBaseline();
        i19 = -1;
        f8 = 0.0F / 0.0F;
        if (i4 != i19)
        {
          i19 = ((LinearLayoutCompat.LayoutParams)localObject4).gravity;
          if (i19 >= 0) {
            break label1401;
          }
          localObject1 = this;
          i19 = this.mGravity;
          i19 = ((i19 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
          i23 = arrayOfInt[i19];
          i23 = Math.max(i23, i4);
          arrayOfInt[i19] = i23;
          i23 = localObject3[i19];
          i4 = i22 - i4;
          i4 = Math.max(i23, i4);
          localObject3[i19] = i4;
        }
      }
      i4 = Math.max(i3, i22);
      label920:
      float f11;
      if (i7 != 0)
      {
        i19 = ((LinearLayoutCompat.LayoutParams)localObject4).height;
        i7 = -1;
        f2 = 0.0F / 0.0F;
        if (i19 == i7)
        {
          i19 = 1;
          f8 = Float.MIN_VALUE;
          f11 = ((LinearLayoutCompat.LayoutParams)localObject4).weight;
          i7 = 0;
          f2 = 0.0F;
          boolean bool11 = f11 < 0.0F;
          if (!bool11) {
            break label1429;
          }
          if (k == 0) {
            break label1423;
          }
        }
      }
      label1069:
      View localView4;
      label1177:
      float f12;
      label1325:
      label1399:
      label1401:
      label1423:
      for (k = i15;; m = i22)
      {
        k = Math.max(i6, k);
        i15 = i5;
        localObject1 = this;
        i16 = getChildrenSkipCount(localView3, i18);
        i18 += i16;
        i16 = i14;
        f6 = f5;
        i6 = k;
        i5 = i15;
        i22 = i4;
        k = i21;
        i15 = i13;
        i13 = i8;
        f4 = f3;
        f3 = f10;
        break;
        localObject1 = this;
        k = this.mTotalLength;
        i8 = ((LinearLayoutCompat.LayoutParams)localObject4).leftMargin + k;
        i19 = ((LinearLayoutCompat.LayoutParams)localObject4).rightMargin;
        i8 += i19;
        k = Math.max(k, i8);
        this.mTotalLength = k;
        break label628;
        i14 = 1;
        f5 = Float.MIN_VALUE;
        break label661;
        k = -1 << -1;
        f1 = -0.0F;
        i8 = ((LinearLayoutCompat.LayoutParams)localObject4).width;
        if (i8 == 0)
        {
          f3 = ((LinearLayoutCompat.LayoutParams)localObject4).weight;
          i19 = 0;
          f8 = 0.0F;
          localView4 = null;
          boolean bool7 = f3 < 0.0F;
          if (bool7)
          {
            k = 0;
            f1 = 0.0F;
            localObject2 = null;
            i9 = -2;
            f3 = 0.0F / 0.0F;
            ((LinearLayoutCompat.LayoutParams)localObject4).width = i9;
          }
        }
        i23 = k;
        f1 = 0.0F;
        localObject2 = null;
        boolean bool3 = f10 < 0.0F;
        if (!bool3)
        {
          localObject1 = this;
          i19 = this.mTotalLength;
          i22 = 0;
          f12 = 0.0F;
          localObject2 = this;
          i9 = paramInt1;
          i15 = paramInt2;
          measureChildBeforeLayout(localView3, i18, paramInt1, i19, paramInt2, 0);
          m = -1 << -1;
          f1 = -0.0F;
          if (i23 != m) {
            ((LinearLayoutCompat.LayoutParams)localObject4).width = i23;
          }
          m = localView3.getMeasuredWidth();
          if (i20 == 0) {
            break label1325;
          }
          localObject1 = this;
          i9 = this.mTotalLength;
          i19 = ((LinearLayoutCompat.LayoutParams)localObject4).leftMargin + m;
          i15 = ((LinearLayoutCompat.LayoutParams)localObject4).rightMargin;
          i19 += i15;
          i15 = getNextLocationOffset(localView3);
          i19 += i15;
          i9 += i19;
        }
        for (this.mTotalLength = i9;; this.mTotalLength = i9)
        {
          if (!bool10) {
            break label1399;
          }
          i21 = Math.max(m, i21);
          break;
          i19 = 0;
          f8 = 0.0F;
          localView4 = null;
          break label1177;
          localObject1 = this;
          i9 = this.mTotalLength;
          i19 = i9 + m;
          i15 = ((LinearLayoutCompat.LayoutParams)localObject4).leftMargin;
          i19 += i15;
          i15 = ((LinearLayoutCompat.LayoutParams)localObject4).rightMargin;
          i19 += i15;
          i15 = getNextLocationOffset(localView3);
          i19 += i15;
          i9 = Math.max(i9, i19);
        }
        break label661;
        i19 = ((LinearLayoutCompat.LayoutParams)localObject4).gravity;
        break label810;
        i19 = 0;
        f8 = 0.0F;
        localView4 = null;
        break label920;
      }
      label1429:
      if (m != 0) {}
      for (;;)
      {
        i15 = Math.max(i5, i15);
        m = i6;
        break;
        i15 = i22;
      }
      label1455:
      localObject1 = this;
      int m = this.mTotalLength;
      if (m > 0)
      {
        boolean bool4 = hasDividerBeforeChildAt(i10);
        if (bool4)
        {
          n = this.mTotalLength;
          i16 = this.mDividerWidth;
          n += i16;
          this.mTotalLength = n;
        }
      }
      f1 = Float.MIN_VALUE;
      int n = arrayOfInt[1];
      i16 = -1;
      f6 = 0.0F / 0.0F;
      if (n == i16)
      {
        f1 = 0.0F;
        localObject2 = null;
        n = arrayOfInt[0];
        i16 = -1;
        f6 = 0.0F / 0.0F;
        if (n == i16)
        {
          f1 = 2.8E-45F;
          n = arrayOfInt[2];
          i16 = -1;
          f6 = 0.0F / 0.0F;
          if (n == i16)
          {
            f1 = 4.2E-45F;
            n = arrayOfInt[3];
            i16 = -1;
            f6 = 0.0F / 0.0F;
            if (n == i16) {
              break label3767;
            }
          }
        }
      }
      f1 = 4.2E-45F;
      n = arrayOfInt[3];
      localView3 = null;
      i16 = arrayOfInt[0];
      i18 = arrayOfInt[1];
      i19 = arrayOfInt[2];
      i18 = Math.max(i18, i19);
      i16 = Math.max(i16, i18);
      n = Math.max(n, i16);
      f6 = 4.2E-45F;
      i16 = localObject3[3];
      f7 = 0.0F;
      i18 = localObject3[0];
      f8 = Float.MIN_VALUE;
      i19 = localObject3[1];
      f9 = 2.8E-45F;
      i15 = localObject3[2];
      i19 = Math.max(i19, i15);
      i18 = Math.max(i18, i19);
      i16 = Math.max(i16, i18);
      n += i16;
      label2692:
      label2736:
      label2785:
      label2828:
      label3089:
      label3101:
      label3108:
      label3120:
      label3399:
      label3627:
      label3740:
      label3767:
      for (i18 = Math.max(i3, n);; i18 = i3)
      {
        int i24;
        if (bool10)
        {
          n = -1 << -1;
          f1 = -0.0F;
          if ((i11 == n) || (i11 == 0))
          {
            n = 0;
            f1 = 0.0F;
            localObject2 = null;
            localObject1 = this;
            this.mTotalLength = 0;
            i16 = 0;
            f6 = 0.0F;
            localView3 = null;
            if (i16 < i10)
            {
              localObject1 = this;
              localView4 = getVirtualChildAt(i16);
              if (localView4 == null)
              {
                n = this.mTotalLength;
                i19 = measureNullChild(i16);
                n += i19;
                this.mTotalLength = n;
                n = i16;
              }
              for (;;)
              {
                i16 = n + 1;
                break;
                n = localView4.getVisibility();
                i15 = 8;
                f9 = 1.1E-44F;
                if (n == i15)
                {
                  n = getChildrenSkipCount(localView4, i16) + i16;
                }
                else
                {
                  localObject2 = (LinearLayoutCompat.LayoutParams)localView4.getLayoutParams();
                  if (i20 != 0)
                  {
                    i15 = this.mTotalLength;
                    i22 = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin + i21;
                    n = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin + i22;
                    i19 = getNextLocationOffset(localView4);
                    n = n + i19 + i15;
                    this.mTotalLength = n;
                    n = i16;
                  }
                  else
                  {
                    i15 = this.mTotalLength;
                    i22 = i15 + i21;
                    i24 = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin;
                    i22 += i24;
                    n = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin + i22;
                    i19 = getNextLocationOffset(localView4);
                    n += i19;
                    n = Math.max(i15, n);
                    this.mTotalLength = n;
                    n = i16;
                  }
                }
              }
            }
          }
        }
        localObject1 = this;
        n = this.mTotalLength;
        i16 = getPaddingLeft();
        i19 = getPaddingRight();
        i16 += i19;
        n += i16;
        this.mTotalLength = n;
        n = this.mTotalLength;
        i16 = getSuggestedMinimumWidth();
        n = Math.max(n, i16);
        f6 = 0.0F;
        localView3 = null;
        int i25 = View.resolveSizeAndState(n, paramInt1, 0);
        f1 = 2.3509886E-38F;
        n = 0xFFFFFF & i25;
        i16 = this.mTotalLength;
        i16 = n - i16;
        boolean bool5;
        int i1;
        if (i14 == 0)
        {
          if (i16 != 0)
          {
            f1 = 0.0F;
            localObject2 = null;
            bool5 = f3 < 0.0F;
            if (!bool5) {}
          }
        }
        else
        {
          localObject1 = this;
          f1 = this.mWeightSum;
          i18 = 0;
          f7 = 0.0F;
          bool5 = f1 < 0.0F;
          if (bool5) {
            f3 = this.mWeightSum;
          }
          i22 = -1;
          arrayOfInt[3] = i22;
          arrayOfInt[2] = i22;
          arrayOfInt[1] = i22;
          arrayOfInt[0] = i22;
          i18 = 1;
          f8 = 2.8E-45F;
          i22 = -1;
          localObject3[3] = i22;
          localObject3[2] = i22;
          localObject3[i18] = i22;
          localObject3[0] = i22;
          i15 = -1;
          f9 = 0.0F / 0.0F;
          localObject1 = this;
          this.mTotalLength = 0;
          bool5 = false;
          f1 = 0.0F;
          localObject2 = null;
          i21 = 0;
          f7 = f3;
          i22 = i7;
          f12 = f2;
          i24 = i5;
          i19 = i4;
          i9 = i16;
          i5 = i15;
          if (i21 < i10)
          {
            localObject1 = this;
            localView2 = getVirtualChildAt(i21);
            if (localView2 == null) {
              break label3740;
            }
            i1 = localView2.getVisibility();
            i16 = 8;
            f6 = 1.1E-44F;
            if (i1 == i16)
            {
              f1 = f7;
              i16 = i9;
              i15 = i5;
              i9 = i24;
              i18 = i22;
              f7 = f12;
            }
          }
        }
        for (;;)
        {
          i21 += 1;
          i24 = i9;
          i5 = i15;
          i22 = i18;
          f12 = f7;
          i9 = i16;
          f7 = f1;
          break;
          localObject2 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
          f9 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
          f6 = 0.0F;
          localView3 = null;
          boolean bool8 = f9 < 0.0F;
          if (bool8)
          {
            f6 = i9 * f9 / f7;
            i17 = (int)f6;
            f7 -= f9;
            i15 = i9 - i17;
            i9 = getPaddingTop();
            i6 = getPaddingBottom();
            i9 += i6;
            i6 = ((LinearLayoutCompat.LayoutParams)localObject2).topMargin;
            i9 += i6;
            i6 = ((LinearLayoutCompat.LayoutParams)localObject2).bottomMargin;
            i9 += i6;
            i6 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
            i9 = getChildMeasureSpec(paramInt2, i9, i6);
            i6 = ((LinearLayoutCompat.LayoutParams)localObject2).width;
            if (i6 == 0)
            {
              i6 = 1073741824;
              if (i11 == i6) {}
            }
            else
            {
              i6 = localView2.getMeasuredWidth();
              i17 += i6;
              if (i17 < 0)
              {
                i17 = 0;
                f6 = 0.0F;
                localView3 = null;
              }
              i6 = 1073741824;
              i17 = View.MeasureSpec.makeMeasureSpec(i17, i6);
              localObject1 = localView2;
              localView2.measure(i17, i9);
              i17 = localView2.getMeasuredState();
              i9 = -16777216;
              f3 = -1.7014118E38F;
              i17 &= i9;
              i6 = View.combineMeasuredStates(i19, i17);
            }
          }
          for (f8 = f7;; f8 = f7)
          {
            if (i20 != 0)
            {
              localObject1 = this;
              i17 = this.mTotalLength;
              i18 = localView2.getMeasuredWidth();
              i9 = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin;
              i18 += i9;
              i9 = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin;
              i18 += i9;
              i9 = getNextLocationOffset(localView2);
              i18 += i9;
              i17 += i18;
              this.mTotalLength = i17;
              i17 = 1073741824;
              f6 = 2.0F;
              if (i12 == i17) {
                break label3089;
              }
              i17 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
              i18 = -1;
              f7 = 0.0F / 0.0F;
              if (i17 != i18) {
                break label3089;
              }
              i17 = 1;
              f6 = Float.MIN_VALUE;
              i18 = ((LinearLayoutCompat.LayoutParams)localObject2).topMargin;
              i9 = ((LinearLayoutCompat.LayoutParams)localObject2).bottomMargin;
              i18 += i9;
              i9 = localView2.getMeasuredHeight() + i18;
              i5 = Math.max(i5, i9);
              if (i17 == 0) {
                break label3101;
              }
              i17 = i18;
              i18 = Math.max(i24, i17);
              if (i22 == 0) {
                break label3108;
              }
              i17 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
              i22 = -1;
              f12 = 0.0F / 0.0F;
              if (i17 != i22) {
                break label3108;
              }
              i17 = 1;
              f6 = Float.MIN_VALUE;
              if (bool9)
              {
                i22 = localView2.getBaseline();
                i24 = -1;
                f11 = 0.0F / 0.0F;
                if (i22 != i24)
                {
                  i24 = ((LinearLayoutCompat.LayoutParams)localObject2).gravity;
                  if (i24 >= 0) {
                    break label3120;
                  }
                  localObject1 = this;
                }
              }
            }
            for (i1 = this.mGravity;; i1 = ((LinearLayoutCompat.LayoutParams)localObject2).gravity)
            {
              i1 = ((i1 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              i24 = Math.max(arrayOfInt[i1], i22);
              arrayOfInt[i1] = i24;
              i24 = localObject3[i1];
              i9 -= i22;
              i9 = Math.max(i24, i9);
              localObject3[i1] = i9;
              f1 = f8;
              i9 = i18;
              i18 = i17;
              f7 = f6;
              i19 = i6;
              i17 = i15;
              i15 = i5;
              break;
              if (i17 > 0) {}
              for (;;)
              {
                i6 = 1073741824;
                i17 = View.MeasureSpec.makeMeasureSpec(i17, i6);
                localObject1 = localView2;
                localView2.measure(i17, i9);
                break;
                i17 = 0;
                f6 = 0.0F;
                localView3 = null;
              }
              localObject1 = this;
              i17 = this.mTotalLength;
              i18 = localView2.getMeasuredWidth() + i17;
              i9 = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin;
              i18 += i9;
              i9 = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin;
              i18 += i9;
              i9 = getNextLocationOffset(localView2);
              i18 += i9;
              i17 = Math.max(i17, i18);
              this.mTotalLength = i17;
              break label2692;
              i17 = 0;
              f6 = 0.0F;
              localView3 = null;
              break label2736;
              i17 = i9;
              break label2785;
              i17 = 0;
              f6 = 0.0F;
              localView3 = null;
              break label2828;
            }
            localObject1 = this;
            i1 = this.mTotalLength;
            i17 = getPaddingLeft();
            i18 = getPaddingRight();
            i17 += i18;
            i1 += i17;
            this.mTotalLength = i1;
            f1 = Float.MIN_VALUE;
            i1 = arrayOfInt[1];
            i17 = -1;
            f6 = 0.0F / 0.0F;
            if (i1 == i17)
            {
              f1 = 0.0F;
              localObject2 = null;
              i1 = arrayOfInt[0];
              i17 = -1;
              f6 = 0.0F / 0.0F;
              if (i1 == i17)
              {
                f1 = 2.8E-45F;
                i1 = arrayOfInt[2];
                i17 = -1;
                f6 = 0.0F / 0.0F;
                if (i1 == i17)
                {
                  f1 = 4.2E-45F;
                  i1 = arrayOfInt[3];
                  i17 = -1;
                  f6 = 0.0F / 0.0F;
                  if (i1 == i17) {
                    break label3399;
                  }
                }
              }
            }
            f1 = 4.2E-45F;
            i1 = arrayOfInt[3];
            localView3 = null;
            i17 = arrayOfInt[0];
            i18 = arrayOfInt[1];
            i9 = arrayOfInt[2];
            i18 = Math.max(i18, i9);
            i17 = Math.max(i17, i18);
            i1 = Math.max(i1, i17);
            f6 = 4.2E-45F;
            i17 = localObject3[3];
            f7 = 0.0F;
            i18 = localObject3[0];
            f3 = Float.MIN_VALUE;
            i9 = localObject3[1];
            f9 = 2.8E-45F;
            i15 = localObject3[2];
            i9 = Math.max(i9, i15);
            i18 = Math.max(i18, i9);
            i17 = Math.max(i17, i18);
            i1 += i17;
            i5 = Math.max(i5, i1);
            i7 = i22;
            f2 = f12;
            i1 = i24;
            i4 = i19;
            for (i17 = i5;; i17 = i18)
            {
              if (i7 == 0)
              {
                i18 = 1073741824;
                f7 = 2.0F;
                if (i12 == i18) {}
              }
              for (;;)
              {
                i17 = getPaddingTop();
                i18 = getPaddingBottom();
                i17 += i18;
                i1 += i17;
                i17 = getSuggestedMinimumHeight();
                i1 = Math.max(i1, i17);
                f6 = -1.7014118E38F;
                i17 = 0xFF000000 & i4 | i25;
                i18 = i4 << 16;
                i1 = View.resolveSizeAndState(i1, paramInt2, i18);
                localObject1 = this;
                setMeasuredDimension(i17, i1);
                if (i13 != 0) {
                  forceUniformHeight(i10, paramInt1);
                }
                return;
                i24 = Math.max(i5, i6);
                if (!bool10) {
                  break;
                }
                i1 = 1073741824;
                f1 = 2.0F;
                if (i11 == i1) {
                  break;
                }
                i1 = 0;
                f1 = 0.0F;
                localObject2 = null;
                i17 = 0;
                localView3 = null;
                f6 = 0.0F;
                if (i17 >= i10) {
                  break;
                }
                localObject1 = this;
                localView1 = getVirtualChildAt(i17);
                if (localView1 != null)
                {
                  i1 = localView1.getVisibility();
                  i19 = 8;
                  f8 = 1.1E-44F;
                  if (i1 != i19) {
                    break label3627;
                  }
                }
                for (;;)
                {
                  i1 = i17 + 1;
                  i17 = i1;
                  break;
                  localObject2 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
                  f1 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
                  i19 = 0;
                  f8 = 0.0F;
                  localView4 = null;
                  boolean bool6 = f1 < 0.0F;
                  if (bool6)
                  {
                    f1 = 2.0F;
                    i2 = View.MeasureSpec.makeMeasureSpec(i21, 1073741824);
                    i19 = localView1.getMeasuredHeight();
                    i15 = 1073741824;
                    f9 = 2.0F;
                    i19 = View.MeasureSpec.makeMeasureSpec(i19, i15);
                    localView1.measure(i2, i19);
                  }
                }
                i2 = i17;
              }
              int i2 = i24;
            }
            i15 = i9;
            i6 = i19;
          }
          f1 = f7;
          int i17 = i9;
          i15 = i5;
          i9 = i24;
          i18 = i22;
          f7 = f12;
        }
      }
      label3774:
      int i9 = i13;
      f3 = f4;
    }
  }
  
  int measureNullChild(int paramInt)
  {
    return 0;
  }
  
  void measureVertical(int paramInt1, int paramInt2)
  {
    int i = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    this.mTotalLength = 0;
    int i4 = 0;
    int i5 = 0;
    int i6 = 0;
    int i7 = 0;
    int i8 = 1;
    float f2 = Float.MIN_VALUE;
    int i9 = 0;
    float f3 = 0.0F;
    int i11 = getVirtualChildCount();
    int i12 = View.MeasureSpec.getMode(paramInt1);
    int i13 = View.MeasureSpec.getMode(paramInt2);
    int i14 = 0;
    float f4 = 0.0F;
    int i15 = 0;
    float f5 = 0.0F;
    View localView1 = null;
    int i16 = this.mBaselineAlignedChildIndex;
    boolean bool9 = this.mUseLargestChild;
    boolean bool10 = bool9;
    int i18 = 0;
    int i19 = 0;
    float f6 = 0.0F;
    View localView2 = null;
    bool9 = i11;
    View localView3;
    int i20;
    float f7;
    int i22;
    float f8;
    int i23;
    int i24;
    label274:
    Object localObject2;
    float f9;
    int i10;
    int n;
    float f10;
    if (i19 < i11)
    {
      localView3 = getVirtualChildAt(i19);
      if (localView3 == null)
      {
        i = this.mTotalLength;
        i20 = measureNullChild(i19);
        i += i20;
        this.mTotalLength = i;
        i = i18;
        i20 = i15;
        f7 = f5;
        i22 = i8;
        f8 = f2;
        i23 = i5;
      }
      for (i24 = i4;; i24 = i4)
      {
        i19 += 1;
        i18 = i;
        i15 = i20;
        f5 = f7;
        i8 = i22;
        f2 = f8;
        i5 = i23;
        i4 = i24;
        break;
        i = localView3.getVisibility();
        i22 = 8;
        f8 = 1.1E-44F;
        if (i != i22) {
          break label274;
        }
        i = getChildrenSkipCount(localView3, i19);
        i19 += i;
        i = i18;
        i20 = i15;
        f7 = f5;
        i22 = i8;
        f8 = f2;
        i23 = i5;
      }
      boolean bool1 = hasDividerBeforeChildAt(i19);
      if (bool1)
      {
        j = this.mTotalLength;
        i22 = this.mDividerHeight;
        j += i22;
        this.mTotalLength = j;
      }
      localObject1 = localView3.getLayoutParams();
      localObject2 = localObject1;
      localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
      f1 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
      f9 = f3 + f1;
      int j = 1073741824;
      f1 = 2.0F;
      bool9 = i13;
      if (i13 == j)
      {
        j = ((LinearLayoutCompat.LayoutParams)localObject2).height;
        if (j == 0)
        {
          f1 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
          i9 = 0;
          f3 = 0.0F;
          boolean bool2 = f1 < 0.0F;
          if (bool2)
          {
            int k = this.mTotalLength;
            i9 = ((LinearLayoutCompat.LayoutParams)localObject2).topMargin + k;
            i22 = ((LinearLayoutCompat.LayoutParams)localObject2).bottomMargin;
            i9 += i22;
            k = Math.max(k, i9);
            this.mTotalLength = k;
            i15 = 1;
            f5 = Float.MIN_VALUE;
            if (i16 >= 0)
            {
              k = i19 + 1;
              bool9 = i16;
              if (i16 == k)
              {
                k = this.mTotalLength;
                this.mBaselineChildTop = k;
              }
            }
            bool9 = i16;
            if (i19 >= i16) {
              break label759;
            }
            f1 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
            i9 = 0;
            f3 = 0.0F;
            boolean bool3 = f1 < 0.0F;
            if (!bool3) {
              break label759;
            }
            localObject1 = new java/lang/RuntimeException;
            ((RuntimeException)localObject1).<init>("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
            throw ((Throwable)localObject1);
          }
        }
      }
      int m = -1 << -1;
      f1 = -0.0F;
      i9 = ((LinearLayoutCompat.LayoutParams)localObject2).height;
      if (i9 == 0)
      {
        f3 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
        i22 = 0;
        f8 = 0.0F;
        boolean bool8 = f3 < 0.0F;
        if (bool8)
        {
          m = 0;
          f1 = 0.0F;
          localObject1 = null;
          i10 = -2;
          f3 = 0.0F / 0.0F;
          ((LinearLayoutCompat.LayoutParams)localObject2).height = i10;
        }
      }
      int i25 = m;
      i22 = 0;
      f8 = 0.0F;
      f1 = 0.0F;
      localObject1 = null;
      boolean bool4 = f9 < 0.0F;
      if (!bool4) {
        i24 = this.mTotalLength;
      }
      for (;;)
      {
        localObject1 = this;
        i10 = paramInt1;
        i23 = paramInt2;
        measureChildBeforeLayout(localView3, i19, paramInt1, 0, paramInt2, i24);
        n = -1 << -1;
        f1 = -0.0F;
        bool9 = i25;
        if (i25 != n) {
          ((LinearLayoutCompat.LayoutParams)localObject2).height = i25;
        }
        n = localView3.getMeasuredHeight();
        i10 = this.mTotalLength;
        i22 = i10 + n;
        i23 = ((LinearLayoutCompat.LayoutParams)localObject2).topMargin;
        i22 += i23;
        i23 = ((LinearLayoutCompat.LayoutParams)localObject2).bottomMargin;
        i22 += i23;
        i23 = getNextLocationOffset(localView3);
        i22 += i23;
        i10 = Math.max(i10, i22);
        this.mTotalLength = i10;
        if (!bool10) {
          break;
        }
        i18 = Math.max(n, i18);
        break;
        i24 = 0;
        f10 = 0.0F;
      }
      label759:
      n = 0;
      f1 = 0.0F;
      localObject1 = null;
      i10 = 1073741824;
      f3 = 2.0F;
      bool9 = i12;
      if (i12 == i10) {
        break label2467;
      }
      i10 = ((LinearLayoutCompat.LayoutParams)localObject2).width;
      i22 = -1;
      f8 = 0.0F / 0.0F;
      if (i10 != i22) {
        break label2467;
      }
      i10 = 1;
      f3 = Float.MIN_VALUE;
      n = 1;
      f1 = Float.MIN_VALUE;
    }
    for (;;)
    {
      i22 = ((LinearLayoutCompat.LayoutParams)localObject2).leftMargin;
      i23 = ((LinearLayoutCompat.LayoutParams)localObject2).rightMargin + i22;
      i24 = localView3.getMeasuredWidth() + i23;
      bool9 = i4;
      i4 = Math.max(i4, i24);
      i22 = localView3.getMeasuredState();
      bool9 = i5;
      i14 = View.combineMeasuredStates(i5, i22);
      label919:
      int i26;
      if (i8 != 0)
      {
        i22 = ((LinearLayoutCompat.LayoutParams)localObject2).width;
        i8 = -1;
        f2 = 0.0F / 0.0F;
        bool9 = i8;
        if (i22 == i8)
        {
          i22 = 1;
          f8 = Float.MIN_VALUE;
          float f11 = ((LinearLayoutCompat.LayoutParams)localObject2).weight;
          i8 = 0;
          f2 = 0.0F;
          i26 = f11 < 0.0F;
          if (i26 <= 0) {
            break label1034;
          }
          if (n == 0) {
            break label1028;
          }
        }
      }
      label1028:
      for (n = i23;; n = i24)
      {
        n = Math.max(i7, n);
        i23 = i6;
        i20 = getChildrenSkipCount(localView3, i19);
        i19 += i20;
        i20 = i15;
        f7 = f5;
        i7 = n;
        i6 = i23;
        i24 = i4;
        n = i18;
        i23 = i14;
        i14 = i10;
        f4 = f3;
        f3 = f9;
        break;
        i22 = 0;
        f8 = 0.0F;
        break label919;
      }
      label1034:
      if (n != 0) {}
      for (;;)
      {
        i23 = Math.max(i6, i23);
        n = i7;
        break;
        i23 = i24;
      }
      n = this.mTotalLength;
      if (n > 0)
      {
        boolean bool5 = hasDividerBeforeChildAt(i11);
        if (bool5)
        {
          i1 = this.mTotalLength;
          i20 = this.mDividerHeight;
          i1 += i20;
          this.mTotalLength = i1;
        }
      }
      if (bool10)
      {
        i1 = -1 << -1;
        f1 = -0.0F;
        bool9 = i13;
        if ((i13 == i1) || (i13 == 0))
        {
          i1 = 0;
          f1 = 0.0F;
          localObject1 = null;
          this.mTotalLength = 0;
          i20 = 0;
          f7 = 0.0F;
          localView3 = null;
          bool9 = i11;
          if (i20 < i11)
          {
            localView2 = getVirtualChildAt(i20);
            if (localView2 == null)
            {
              i1 = this.mTotalLength;
              i19 = measureNullChild(i20);
              i1 += i19;
              this.mTotalLength = i1;
              i1 = i20;
            }
            for (;;)
            {
              i20 = i1 + 1;
              break;
              i1 = localView2.getVisibility();
              i22 = 8;
              f8 = 1.1E-44F;
              if (i1 == i22)
              {
                i1 = getChildrenSkipCount(localView2, i20) + i20;
              }
              else
              {
                localObject1 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
                i22 = this.mTotalLength;
                i23 = i22 + i18;
                i24 = ((LinearLayoutCompat.LayoutParams)localObject1).topMargin;
                i23 += i24;
                i1 = ((LinearLayoutCompat.LayoutParams)localObject1).bottomMargin + i23;
                i19 = getNextLocationOffset(localView2);
                i1 += i19;
                i1 = Math.max(i22, i1);
                this.mTotalLength = i1;
                i1 = i20;
              }
            }
          }
        }
      }
      int i1 = this.mTotalLength;
      i20 = getPaddingTop();
      i19 = getPaddingBottom();
      i20 += i19;
      i1 += i20;
      this.mTotalLength = i1;
      i1 = this.mTotalLength;
      i20 = getSuggestedMinimumHeight();
      i1 = Math.max(i1, i20);
      f7 = 0.0F;
      localView3 = null;
      int i17 = paramInt2;
      int i28 = View.resolveSizeAndState(i1, paramInt2, 0);
      f1 = 2.3509886E-38F;
      i1 = 0xFFFFFF & i28;
      i20 = this.mTotalLength;
      i20 = i1 - i20;
      boolean bool6;
      int i2;
      int i21;
      if (i15 == 0)
      {
        if (i20 != 0)
        {
          f1 = 0.0F;
          localObject1 = null;
          bool6 = f3 < 0.0F;
          if (!bool6) {}
        }
      }
      else
      {
        f1 = this.mWeightSum;
        i19 = 0;
        f6 = 0.0F;
        localView2 = null;
        bool6 = f1 < 0.0F;
        if (bool6) {
          f3 = this.mWeightSum;
        }
        this.mTotalLength = 0;
        bool6 = false;
        f1 = 0.0F;
        localObject1 = null;
        i18 = 0;
        f6 = f3;
        i24 = i8;
        f10 = f2;
        i26 = i6;
        i22 = i5;
        i7 = i4;
        i10 = i20;
        for (;;)
        {
          i17 = i11;
          if (i18 >= i11) {
            break label2121;
          }
          localView1 = getVirtualChildAt(i18);
          i2 = localView1.getVisibility();
          i20 = 8;
          f7 = 1.1E-44F;
          if (i2 != i20) {
            break;
          }
          i2 = i26;
          i20 = i22;
          i23 = i7;
          i22 = i24;
          f8 = f10;
          i18 += 1;
          i26 = i2;
          i7 = i23;
          i24 = i22;
          f10 = f8;
          i22 = i20;
        }
        localObject1 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
        float f12 = ((LinearLayoutCompat.LayoutParams)localObject1).weight;
        f7 = 0.0F;
        localView3 = null;
        boolean bool11 = f12 < 0.0F;
        if (!bool11) {
          break label2452;
        }
        f7 = i10 * f12 / f6;
        i21 = (int)f7;
        f6 -= f12;
        i10 -= i21;
        i23 = getPaddingLeft();
        i6 = getPaddingRight();
        i23 += i6;
        i6 = ((LinearLayoutCompat.LayoutParams)localObject1).leftMargin;
        i23 += i6;
        i6 = ((LinearLayoutCompat.LayoutParams)localObject1).rightMargin;
        i23 += i6;
        i6 = ((LinearLayoutCompat.LayoutParams)localObject1).width;
        i17 = paramInt1;
        i23 = getChildMeasureSpec(paramInt1, i23, i6);
        i6 = ((LinearLayoutCompat.LayoutParams)localObject1).height;
        if (i6 == 0)
        {
          i6 = 1073741824;
          i17 = i13;
          if (i13 == i6) {}
        }
        else
        {
          i6 = localView1.getMeasuredHeight();
          i21 += i6;
          if (i21 < 0)
          {
            i21 = 0;
            f7 = 0.0F;
            localView3 = null;
          }
          i6 = 1073741824;
          i21 = View.MeasureSpec.makeMeasureSpec(i21, i6);
          localView1.measure(i23, i21);
          i21 = localView1.getMeasuredState() & 0xFF00;
          i21 = View.combineMeasuredStates(i22, i21);
          i19 = i10;
          i10 = i21;
          f7 = f6;
        }
      }
      for (;;)
      {
        i22 = ((LinearLayoutCompat.LayoutParams)localObject1).leftMargin;
        i23 = ((LinearLayoutCompat.LayoutParams)localObject1).rightMargin;
        i22 += i23;
        i23 = localView1.getMeasuredWidth() + i22;
        i7 = Math.max(i7, i23);
        i6 = 1073741824;
        i17 = i12;
        if (i12 != i6)
        {
          i6 = ((LinearLayoutCompat.LayoutParams)localObject1).width;
          i8 = -1;
          f2 = 0.0F / 0.0F;
          i17 = i8;
          if (i6 == i8)
          {
            i6 = 1;
            label1923:
            if (i6 == 0) {
              break label2105;
            }
            label1928:
            i23 = Math.max(i26, i22);
            if (i24 == 0) {
              break label2112;
            }
            i22 = ((LinearLayoutCompat.LayoutParams)localObject1).width;
            i24 = -1;
            f10 = 0.0F / 0.0F;
            if (i22 != i24) {
              break label2112;
            }
            i22 = 1;
          }
        }
        int i27;
        for (f8 = Float.MIN_VALUE;; f8 = 0.0F)
        {
          i24 = this.mTotalLength;
          i27 = localView1.getMeasuredHeight() + i24;
          i6 = ((LinearLayoutCompat.LayoutParams)localObject1).topMargin;
          i27 += i6;
          i2 = ((LinearLayoutCompat.LayoutParams)localObject1).bottomMargin + i27;
          i27 = getNextLocationOffset(localView1);
          i2 += i27;
          i2 = Math.max(i24, i2);
          this.mTotalLength = i2;
          i2 = i23;
          i23 = i7;
          i21 = i10;
          i10 = i19;
          f6 = f7;
          break;
          if (i21 > 0) {}
          for (;;)
          {
            i6 = 1073741824;
            i21 = View.MeasureSpec.makeMeasureSpec(i21, i6);
            localView1.measure(i23, i21);
            break;
            i21 = 0;
            f7 = 0.0F;
            localView3 = null;
          }
          i6 = 0;
          break label1923;
          label2105:
          i22 = i23;
          break label1928;
          label2112:
          i22 = 0;
        }
        label2121:
        i2 = this.mTotalLength;
        i21 = getPaddingTop();
        i19 = getPaddingBottom();
        i21 += i19;
        i2 += i21;
        this.mTotalLength = i2;
        i8 = i24;
        f2 = f10;
        i2 = i27;
        i5 = i22;
        for (i21 = i7;; i21 = i4)
        {
          if (i8 == 0)
          {
            i19 = 1073741824;
            f6 = 2.0F;
            i17 = i12;
            if (i12 == i19) {}
          }
          for (;;)
          {
            i21 = getPaddingLeft();
            i19 = getPaddingRight();
            i21 += i19;
            i2 += i21;
            i21 = getSuggestedMinimumWidth();
            i2 = Math.max(i2, i21);
            i17 = paramInt1;
            i2 = View.resolveSizeAndState(i2, paramInt1, i5);
            setMeasuredDimension(i2, i28);
            if (i14 != 0) {
              forceUniformWidth(i11, paramInt2);
            }
            return;
            i27 = Math.max(i6, i7);
            if (!bool10) {
              break;
            }
            i2 = 1073741824;
            f1 = 2.0F;
            i17 = i13;
            if (i13 == i2) {
              break;
            }
            i2 = 0;
            f1 = 0.0F;
            localObject1 = null;
            i21 = 0;
            localView3 = null;
            f7 = 0.0F;
            i17 = i11;
            if (i21 >= i11) {
              break;
            }
            localView2 = getVirtualChildAt(i21);
            if (localView2 != null)
            {
              i2 = localView2.getVisibility();
              i10 = 8;
              f3 = 1.1E-44F;
              if (i2 != i10) {
                break label2369;
              }
            }
            for (;;)
            {
              i2 = i21 + 1;
              i21 = i2;
              break;
              label2369:
              localObject1 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
              f1 = ((LinearLayoutCompat.LayoutParams)localObject1).weight;
              i10 = 0;
              f3 = 0.0F;
              boolean bool7 = f1 < 0.0F;
              if (bool7)
              {
                i3 = View.MeasureSpec.makeMeasureSpec(localView2.getMeasuredWidth(), 1073741824);
                f3 = 2.0F;
                i10 = View.MeasureSpec.makeMeasureSpec(i18, 1073741824);
                localView2.measure(i3, i10);
              }
            }
            i3 = i21;
          }
          int i3 = i27;
        }
        label2452:
        f7 = f6;
        i19 = i10;
        i10 = i22;
      }
      label2467:
      i10 = i14;
      f3 = f4;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    Drawable localDrawable = this.mDivider;
    if (localDrawable == null) {}
    for (;;)
    {
      return;
      int i = this.mOrientation;
      int j = 1;
      if (i == j) {
        drawDividersVertical(paramCanvas);
      } else {
        drawDividersHorizontal(paramCanvas);
      }
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    String str = LinearLayoutCompat.class.getName();
    paramAccessibilityEvent.setClassName(str);
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    String str = LinearLayoutCompat.class.getName();
    paramAccessibilityNodeInfo.setClassName(str);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = this.mOrientation;
    int j = 1;
    if (i == j) {
      layoutVertical(paramInt1, paramInt2, paramInt3, paramInt4);
    }
    for (;;)
    {
      return;
      layoutHorizontal(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.mOrientation;
    int j = 1;
    if (i == j) {
      measureVertical(paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      measureHorizontal(paramInt1, paramInt2);
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    this.mBaselineAligned = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = getChildCount();
      if (paramInt < i) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      Object localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localObject = ((StringBuilder)localObject).append("base aligned child index out of range (0, ");
      int j = getChildCount();
      localObject = j + ")";
      localIllegalArgumentException.<init>((String)localObject);
      throw localIllegalArgumentException;
    }
    this.mBaselineAlignedChildIndex = paramInt;
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    Drawable localDrawable = this.mDivider;
    if (paramDrawable == localDrawable) {
      return;
    }
    this.mDivider = paramDrawable;
    int i;
    if (paramDrawable != null)
    {
      i = paramDrawable.getIntrinsicWidth();
      this.mDividerWidth = i;
      i = paramDrawable.getIntrinsicHeight();
    }
    for (this.mDividerHeight = i;; this.mDividerHeight = 0)
    {
      if (paramDrawable == null) {
        bool = true;
      }
      setWillNotDraw(bool);
      requestLayout();
      break;
      this.mDividerWidth = 0;
    }
  }
  
  public void setDividerPadding(int paramInt)
  {
    this.mDividerPadding = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    int i = this.mGravity;
    if (i != paramInt)
    {
      i = 0x800007 & paramInt;
      if (i != 0) {
        break label50;
      }
    }
    label50:
    for (i = 0x800003 | paramInt;; i = paramInt)
    {
      int j = i & 0x70;
      if (j == 0) {
        i |= 0x30;
      }
      this.mGravity = i;
      requestLayout();
      return;
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    int i = 8388615;
    int j = paramInt & i;
    int k = this.mGravity & i;
    if (k != j)
    {
      k = this.mGravity;
      i = -8388616;
      k &= i;
      j |= k;
      this.mGravity = j;
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    this.mUseLargestChild = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    int i = this.mOrientation;
    if (i != paramInt)
    {
      this.mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    int i = this.mShowDividers;
    if (paramInt != i) {
      requestLayout();
    }
    this.mShowDividers = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    int i = paramInt & 0x70;
    int j = this.mGravity & 0x70;
    if (j != i)
    {
      j = this.mGravity & 0xFFFFFF8F;
      i |= j;
      this.mGravity = i;
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    float f = Math.max(0.0F, paramFloat);
    this.mWeightSum = f;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\LinearLayoutCompat.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */