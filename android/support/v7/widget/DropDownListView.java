package android.support.v7.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.b.a.a;
import android.support.v4.view.v;
import android.support.v4.widget.i;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;

class DropDownListView
  extends ListView
{
  public static final int INVALID_POSITION = 255;
  public static final int NO_POSITION = 255;
  private v mClickAnimation;
  private boolean mDrawsInPressedState;
  private boolean mHijackFocus;
  private Field mIsChildViewEnabled;
  private boolean mListSelectionHidden;
  private int mMotionPosition;
  private DropDownListView.ResolveHoverRunnable mResolveHoverRunnable;
  private i mScrollHelper;
  private int mSelectionBottomPadding;
  private int mSelectionLeftPadding;
  private int mSelectionRightPadding;
  private int mSelectionTopPadding;
  private DropDownListView.GateKeeperDrawable mSelector;
  private final Rect mSelectorRect;
  
  DropDownListView(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, i);
    Object localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.mSelectorRect = ((Rect)localObject);
    this.mSelectionLeftPadding = 0;
    this.mSelectionTopPadding = 0;
    this.mSelectionRightPadding = 0;
    this.mSelectionBottomPadding = 0;
    this.mHijackFocus = paramBoolean;
    setCacheColorHint(0);
    localObject = AbsListView.class;
    String str = "mIsChildViewEnabled";
    try
    {
      localObject = ((Class)localObject).getDeclaredField(str);
      this.mIsChildViewEnabled = ((Field)localObject);
      localObject = this.mIsChildViewEnabled;
      i = 1;
      ((Field)localObject).setAccessible(i);
      return;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
      for (;;)
      {
        localNoSuchFieldException.printStackTrace();
      }
    }
  }
  
  private void clearPressedItem()
  {
    this.mDrawsInPressedState = false;
    setPressed(false);
    drawableStateChanged();
    int i = this.mMotionPosition;
    int j = getFirstVisiblePosition();
    i -= j;
    Object localObject = getChildAt(i);
    if (localObject != null) {
      ((View)localObject).setPressed(false);
    }
    localObject = this.mClickAnimation;
    if (localObject != null)
    {
      this.mClickAnimation.b();
      i = 0;
      localObject = null;
      this.mClickAnimation = null;
    }
  }
  
  private void clickPressedItem(View paramView, int paramInt)
  {
    long l = getItemIdAtPosition(paramInt);
    performItemClick(paramView, paramInt, l);
  }
  
  private void drawSelectorCompat(Canvas paramCanvas)
  {
    Object localObject = this.mSelectorRect;
    boolean bool = ((Rect)localObject).isEmpty();
    if (!bool)
    {
      localObject = getSelector();
      if (localObject != null)
      {
        Rect localRect = this.mSelectorRect;
        ((Drawable)localObject).setBounds(localRect);
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
  }
  
  private void positionSelectorCompat(int paramInt, View paramView)
  {
    Object localObject = this.mSelectorRect;
    int i = paramView.getLeft();
    int j = paramView.getTop();
    int k = paramView.getRight();
    int m = paramView.getBottom();
    ((Rect)localObject).set(i, j, k, m);
    i = ((Rect)localObject).left;
    j = this.mSelectionLeftPadding;
    i -= j;
    ((Rect)localObject).left = i;
    i = ((Rect)localObject).top;
    j = this.mSelectionTopPadding;
    i -= j;
    ((Rect)localObject).top = i;
    i = ((Rect)localObject).right;
    j = this.mSelectionRightPadding;
    i += j;
    ((Rect)localObject).right = i;
    i = ((Rect)localObject).bottom;
    j = this.mSelectionBottomPadding;
    i += j;
    ((Rect)localObject).bottom = i;
    for (;;)
    {
      try
      {
        localObject = this.mIsChildViewEnabled;
        boolean bool2 = ((Field)localObject).getBoolean(this);
        boolean bool1 = paramView.isEnabled();
        if (bool1 != bool2)
        {
          Field localField = this.mIsChildViewEnabled;
          if (bool2) {
            continue;
          }
          bool2 = true;
          localObject = Boolean.valueOf(bool2);
          localField.set(this, localObject);
          n = -1;
          if (paramInt != n) {
            refreshDrawableState();
          }
        }
        return;
      }
      catch (IllegalAccessException localIllegalAccessException)
      {
        int n;
        localIllegalAccessException.printStackTrace();
        continue;
      }
      n = 0;
      localObject = null;
    }
  }
  
  private void positionSelectorLikeFocusCompat(int paramInt, View paramView)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    Drawable localDrawable = getSelector();
    int j;
    float f2;
    Rect localRect;
    float f3;
    if (localDrawable != null)
    {
      j = -1;
      f2 = 0.0F / 0.0F;
      if (paramInt != j)
      {
        j = i;
        f2 = f1;
        if (j != 0) {
          localDrawable.setVisible(false, false);
        }
        positionSelectorCompat(paramInt, paramView);
        if (j != 0)
        {
          localRect = this.mSelectorRect;
          f3 = localRect.exactCenterX();
          f2 = localRect.exactCenterY();
          int k = getVisibility();
          if (k != 0) {
            break label123;
          }
        }
      }
    }
    for (;;)
    {
      localDrawable.setVisible(i, false);
      a.a(localDrawable, f3, f2);
      return;
      j = 0;
      localRect = null;
      f2 = 0.0F;
      break;
      label123:
      i = 0;
      f1 = 0.0F;
    }
  }
  
  private void positionSelectorLikeTouchCompat(int paramInt, View paramView, float paramFloat1, float paramFloat2)
  {
    positionSelectorLikeFocusCompat(paramInt, paramView);
    Drawable localDrawable = getSelector();
    if (localDrawable != null)
    {
      int i = -1;
      if (paramInt != i) {
        a.a(localDrawable, paramFloat1, paramFloat2);
      }
    }
  }
  
  private void setPressedItem(View paramView, int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = 21;
    boolean bool1 = true;
    this.mDrawsInPressedState = bool1;
    int j = Build.VERSION.SDK_INT;
    if (j >= i) {
      drawableHotspotChanged(paramFloat1, paramFloat2);
    }
    boolean bool2 = isPressed();
    if (!bool2) {
      setPressed(bool1);
    }
    layoutChildren();
    int k = this.mMotionPosition;
    int m = -1;
    float f1 = 0.0F / 0.0F;
    if (k != m)
    {
      k = this.mMotionPosition;
      m = getFirstVisiblePosition();
      k -= m;
      View localView = getChildAt(k);
      if ((localView != null) && (localView != paramView))
      {
        boolean bool4 = localView.isPressed();
        if (bool4) {
          localView.setPressed(false);
        }
      }
    }
    this.mMotionPosition = paramInt;
    k = paramView.getLeft();
    float f2 = k;
    f2 = paramFloat1 - f2;
    int n = paramView.getTop();
    f1 = n;
    f1 = paramFloat2 - f1;
    int i1 = Build.VERSION.SDK_INT;
    if (i1 >= i) {
      paramView.drawableHotspotChanged(f2, f1);
    }
    boolean bool3 = paramView.isPressed();
    if (!bool3) {
      paramView.setPressed(bool1);
    }
    positionSelectorLikeTouchCompat(paramInt, paramView, paramFloat1, paramFloat2);
    setSelectorEnabled(false);
    refreshDrawableState();
  }
  
  private void setSelectorEnabled(boolean paramBoolean)
  {
    DropDownListView.GateKeeperDrawable localGateKeeperDrawable = this.mSelector;
    if (localGateKeeperDrawable != null)
    {
      localGateKeeperDrawable = this.mSelector;
      localGateKeeperDrawable.setEnabled(paramBoolean);
    }
  }
  
  private boolean touchModeDrawsInPressedStateCompat()
  {
    return this.mDrawsInPressedState;
  }
  
  private void updateSelectorStateCompat()
  {
    Drawable localDrawable = getSelector();
    if (localDrawable != null)
    {
      boolean bool = touchModeDrawsInPressedStateCompat();
      if (bool)
      {
        bool = isPressed();
        if (bool)
        {
          int[] arrayOfInt = getDrawableState();
          localDrawable.setState(arrayOfInt);
        }
      }
    }
  }
  
  protected void dispatchDraw(Canvas paramCanvas)
  {
    drawSelectorCompat(paramCanvas);
    super.dispatchDraw(paramCanvas);
  }
  
  protected void drawableStateChanged()
  {
    DropDownListView.ResolveHoverRunnable localResolveHoverRunnable = this.mResolveHoverRunnable;
    if (localResolveHoverRunnable != null) {}
    for (;;)
    {
      return;
      super.drawableStateChanged();
      boolean bool = true;
      setSelectorEnabled(bool);
      updateSelectorStateCompat();
    }
  }
  
  public boolean hasFocus()
  {
    boolean bool = this.mHijackFocus;
    if (!bool)
    {
      bool = super.hasFocus();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean hasWindowFocus()
  {
    boolean bool = this.mHijackFocus;
    if (!bool)
    {
      bool = super.hasWindowFocus();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isFocused()
  {
    boolean bool = this.mHijackFocus;
    if (!bool)
    {
      bool = super.isFocused();
      if (!bool) {
        break label22;
      }
    }
    label22:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public boolean isInTouchMode()
  {
    boolean bool = this.mHijackFocus;
    if (bool)
    {
      bool = this.mListSelectionHidden;
      if (bool) {}
    }
    else
    {
      bool = super.isInTouchMode();
      if (!bool) {
        break label31;
      }
    }
    label31:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public int lookForSelectablePosition(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    ListAdapter localListAdapter1 = getAdapter();
    if (localListAdapter1 != null)
    {
      boolean bool1 = isInTouchMode();
      if (!bool1) {}
    }
    else
    {
      paramInt = i;
    }
    for (;;)
    {
      return paramInt;
      int j = localListAdapter1.getCount();
      ListAdapter localListAdapter2 = getAdapter();
      boolean bool2 = localListAdapter2.areAllItemsEnabled();
      if (!bool2)
      {
        if (paramBoolean)
        {
          bool2 = false;
          localListAdapter2 = null;
          paramInt = Math.max(0, paramInt);
          while (paramInt < j)
          {
            bool2 = localListAdapter1.isEnabled(paramInt);
            if (bool2) {
              break;
            }
            paramInt += 1;
          }
        }
        int k = j + -1;
        paramInt = Math.min(paramInt, k);
        while (paramInt >= 0)
        {
          boolean bool3 = localListAdapter1.isEnabled(paramInt);
          if (bool3) {
            break;
          }
          paramInt += -1;
        }
        if ((paramInt < 0) || (paramInt >= j)) {
          paramInt = i;
        }
      }
      else if ((paramInt < 0) || (paramInt >= j))
      {
        paramInt = i;
      }
    }
  }
  
  public int measureHeightOfChildrenCompat(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Drawable localDrawable = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt4 = i + j;
      return paramInt4;
    }
    j += i;
    label72:
    int m;
    View localView;
    Object localObject;
    int i2;
    label102:
    label141:
    int i4;
    if ((k > 0) && (localDrawable != null))
    {
      m = 0;
      localDrawable = null;
      localView = null;
      int n = 0;
      int i1 = localListAdapter.getCount();
      i = 0;
      localObject = null;
      i2 = 0;
      if (i2 >= i1) {
        break label341;
      }
      i = localListAdapter.getItemViewType(i2);
      if (i == n) {
        break label348;
      }
      int i3 = i;
      i = 0;
      localObject = null;
      n = i3;
      localView = localListAdapter.getView(i2, (View)localObject, this);
      localObject = localView.getLayoutParams();
      if (localObject == null)
      {
        localObject = generateDefaultLayoutParams();
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      i4 = ((ViewGroup.LayoutParams)localObject).height;
      if (i4 <= 0) {
        break label296;
      }
      i = ((ViewGroup.LayoutParams)localObject).height;
      i4 = 1073741824;
      i = View.MeasureSpec.makeMeasureSpec(i, i4);
      label213:
      localView.measure(paramInt1, i);
      localView.forceLayout();
      if (i2 <= 0) {
        break label355;
      }
    }
    label296:
    label341:
    label348:
    label355:
    for (i = j + k;; i = j)
    {
      j = localView.getMeasuredHeight();
      i += j;
      if (i >= paramInt4)
      {
        if ((paramInt5 < 0) || (i2 <= paramInt5) || (m <= 0) || (i == paramInt4)) {
          break;
        }
        paramInt4 = m;
        break;
        k = 0;
        break label72;
        localObject = null;
        i4 = 0;
        i = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label213;
      }
      if ((paramInt5 >= 0) && (i2 >= paramInt5)) {
        m = i;
      }
      i2 += 1;
      j = i;
      break label102;
      paramInt4 = j;
      break;
      localObject = localView;
      break label141;
    }
  }
  
  protected void onDetachedFromWindow()
  {
    this.mResolveHoverRunnable = null;
    super.onDetachedFromWindow();
  }
  
  public boolean onForwardedEvent(MotionEvent paramMotionEvent, int paramInt)
  {
    int i = 1;
    float f1 = Float.MIN_VALUE;
    int j = paramMotionEvent.getActionMasked();
    int k;
    Object localObject;
    label49:
    label119:
    boolean bool;
    switch (j)
    {
    default: 
      k = 0;
      localObject = null;
    case 3: 
      for (j = i;; bool = false)
      {
        if ((j == 0) || (k != 0)) {
          clearPressedItem();
        }
        if (j == 0) {
          break;
        }
        localObject = this.mScrollHelper;
        if (localObject == null)
        {
          localObject = new android/support/v4/widget/i;
          ((i)localObject).<init>(this);
          this.mScrollHelper = ((i)localObject);
        }
        this.mScrollHelper.a(i);
        localObject = this.mScrollHelper;
        ((i)localObject).onTouch(this, paramMotionEvent);
        return j;
        k = 0;
        localObject = null;
      }
    case 1: 
      k = 0;
      localObject = null;
    }
    for (;;)
    {
      int m = paramMotionEvent.findPointerIndex(paramInt);
      if (m < 0)
      {
        k = 0;
        localObject = null;
        bool = false;
        break label49;
      }
      float f2 = paramMotionEvent.getX(m);
      int n = (int)f2;
      float f3 = paramMotionEvent.getY(m);
      m = (int)f3;
      int i1 = pointToPosition(n, m);
      int i2 = -1;
      if (i1 == i2)
      {
        bool = k;
        k = i;
        break label49;
      }
      k = getFirstVisiblePosition();
      k = i1 - k;
      localObject = getChildAt(k);
      f2 = n;
      f3 = m;
      setPressedItem((View)localObject, i1, f2, f3);
      if (bool != i) {
        break;
      }
      clickPressedItem((View)localObject, i1);
      break;
      localObject = this.mScrollHelper;
      if (localObject == null) {
        break label119;
      }
      localObject = this.mScrollHelper;
      ((i)localObject).a(false);
      break label119;
      k = i;
    }
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = -1;
    int k = Build.VERSION.SDK_INT;
    int n = 26;
    float f1 = 3.6E-44F;
    boolean bool2;
    if (k < n) {
      bool2 = super.onHoverEvent(paramMotionEvent);
    }
    for (;;)
    {
      return bool2;
      n = paramMotionEvent.getActionMasked();
      int m = 10;
      View localView;
      if (n == m)
      {
        DropDownListView.ResolveHoverRunnable localResolveHoverRunnable = this.mResolveHoverRunnable;
        if (localResolveHoverRunnable == null)
        {
          localResolveHoverRunnable = new android/support/v7/widget/DropDownListView$ResolveHoverRunnable;
          i1 = 0;
          f2 = 0.0F;
          localView = null;
          localResolveHoverRunnable.<init>(this, null);
          this.mResolveHoverRunnable = localResolveHoverRunnable;
          localResolveHoverRunnable = this.mResolveHoverRunnable;
          localResolveHoverRunnable.post();
        }
      }
      boolean bool3 = super.onHoverEvent(paramMotionEvent);
      int i1 = 9;
      float f2 = 1.3E-44F;
      int j;
      if (n != i1)
      {
        i1 = 7;
        f2 = 9.8E-45F;
        if (n != i1) {}
      }
      else
      {
        f1 = paramMotionEvent.getX();
        n = (int)f1;
        f2 = paramMotionEvent.getY();
        i1 = (int)f2;
        n = pointToPosition(n, i1);
        if (n == i) {
          continue;
        }
        i1 = getSelectedItemPosition();
        if (n == i1) {
          continue;
        }
        i1 = getFirstVisiblePosition();
        i1 = n - i1;
        localView = getChildAt(i1);
        boolean bool1 = localView.isEnabled();
        if (bool1)
        {
          i1 = localView.getTop();
          j = getTop();
          i1 -= j;
          setSelectionFromTop(n, i1);
        }
        updateSelectorStateCompat();
        continue;
      }
      setSelection(j);
    }
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getAction();
    switch (i)
    {
    }
    for (;;)
    {
      DropDownListView.ResolveHoverRunnable localResolveHoverRunnable = this.mResolveHoverRunnable;
      if (localResolveHoverRunnable != null)
      {
        localResolveHoverRunnable = this.mResolveHoverRunnable;
        localResolveHoverRunnable.cancel();
      }
      return super.onTouchEvent(paramMotionEvent);
      float f1 = paramMotionEvent.getX();
      i = (int)f1;
      float f2 = paramMotionEvent.getY();
      int j = (int)f2;
      i = pointToPosition(i, j);
      this.mMotionPosition = i;
    }
  }
  
  void setListSelectionHidden(boolean paramBoolean)
  {
    this.mListSelectionHidden = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    Object localObject;
    if (paramDrawable != null)
    {
      localObject = new android/support/v7/widget/DropDownListView$GateKeeperDrawable;
      ((DropDownListView.GateKeeperDrawable)localObject).<init>(paramDrawable);
    }
    for (;;)
    {
      this.mSelector = ((DropDownListView.GateKeeperDrawable)localObject);
      localObject = this.mSelector;
      super.setSelector((Drawable)localObject);
      localObject = new android/graphics/Rect;
      ((Rect)localObject).<init>();
      if (paramDrawable != null) {
        paramDrawable.getPadding((Rect)localObject);
      }
      int i = ((Rect)localObject).left;
      this.mSelectionLeftPadding = i;
      i = ((Rect)localObject).top;
      this.mSelectionTopPadding = i;
      i = ((Rect)localObject).right;
      this.mSelectionRightPadding = i;
      int j = ((Rect)localObject).bottom;
      this.mSelectionBottomPadding = j;
      return;
      j = 0;
      localObject = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\DropDownListView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */