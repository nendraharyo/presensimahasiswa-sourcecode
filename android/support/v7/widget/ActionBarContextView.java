package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.id;
import android.support.v7.appcompat.R.layout;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.view.ActionMode;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPresenter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ActionBarContextView
  extends AbsActionBarView
{
  private static final String TAG = "ActionBarContextView";
  private View mClose;
  private int mCloseItemLayout;
  private View mCustomView;
  private CharSequence mSubtitle;
  private int mSubtitleStyleRes;
  private TextView mSubtitleView;
  private CharSequence mTitle;
  private LinearLayout mTitleLayout;
  private boolean mTitleOptional;
  private int mTitleStyleRes;
  private TextView mTitleView;
  
  public ActionBarContextView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public ActionBarContextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Object localObject = R.styleable.ActionMode;
    localObject = TintTypedArray.obtainStyledAttributes(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    int i = R.styleable.ActionMode_background;
    Drawable localDrawable = ((TintTypedArray)localObject).getDrawable(i);
    r.a(this, localDrawable);
    i = R.styleable.ActionMode_titleTextStyle;
    i = ((TintTypedArray)localObject).getResourceId(i, 0);
    this.mTitleStyleRes = i;
    i = R.styleable.ActionMode_subtitleTextStyle;
    i = ((TintTypedArray)localObject).getResourceId(i, 0);
    this.mSubtitleStyleRes = i;
    i = R.styleable.ActionMode_height;
    i = ((TintTypedArray)localObject).getLayoutDimension(i, 0);
    this.mContentHeight = i;
    i = R.styleable.ActionMode_closeItemLayout;
    int j = R.layout.abc_action_mode_close_item_material;
    i = ((TintTypedArray)localObject).getResourceId(i, j);
    this.mCloseItemLayout = i;
    ((TintTypedArray)localObject).recycle();
  }
  
  private void initTitle()
  {
    int i = 8;
    boolean bool1 = true;
    Object localObject1 = this.mTitleLayout;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext());
      int j = R.layout.abc_action_bar_title_item;
      ((LayoutInflater)localObject1).inflate(j, this);
      int m = getChildCount() + -1;
      localObject1 = (LinearLayout)getChildAt(m);
      this.mTitleLayout = ((LinearLayout)localObject1);
      localObject1 = this.mTitleLayout;
      j = R.id.action_bar_title;
      localObject1 = (TextView)((LinearLayout)localObject1).findViewById(j);
      this.mTitleView = ((TextView)localObject1);
      localObject1 = this.mTitleLayout;
      j = R.id.action_bar_subtitle;
      localObject1 = (TextView)((LinearLayout)localObject1).findViewById(j);
      this.mSubtitleView = ((TextView)localObject1);
      m = this.mTitleStyleRes;
      int n;
      if (m != 0)
      {
        localObject1 = this.mTitleView;
        localObject2 = getContext();
        n = this.mTitleStyleRes;
        ((TextView)localObject1).setTextAppearance((Context)localObject2, n);
      }
      m = this.mSubtitleStyleRes;
      if (m != 0)
      {
        localObject1 = this.mSubtitleView;
        localObject2 = getContext();
        n = this.mSubtitleStyleRes;
        ((TextView)localObject1).setTextAppearance((Context)localObject2, n);
      }
    }
    localObject1 = this.mTitleView;
    Object localObject2 = this.mTitle;
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.mSubtitleView;
    localObject2 = this.mSubtitle;
    ((TextView)localObject1).setText((CharSequence)localObject2);
    localObject1 = this.mTitle;
    boolean bool2 = TextUtils.isEmpty((CharSequence)localObject1);
    int k;
    label251:
    TextView localTextView;
    if (!bool2)
    {
      bool2 = bool1;
      localObject2 = this.mSubtitle;
      k = TextUtils.isEmpty((CharSequence)localObject2);
      if (k != 0) {
        break label328;
      }
      localTextView = this.mSubtitleView;
      if (!bool1) {
        break label333;
      }
      k = 0;
      localObject2 = null;
    }
    for (;;)
    {
      localTextView.setVisibility(k);
      localObject2 = this.mTitleLayout;
      if ((bool2) || (bool1)) {
        i = 0;
      }
      ((LinearLayout)localObject2).setVisibility(i);
      localObject1 = this.mTitleLayout.getParent();
      if (localObject1 == null)
      {
        localObject1 = this.mTitleLayout;
        addView((View)localObject1);
      }
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label328:
      bool1 = false;
      break label251;
      label333:
      k = i;
    }
  }
  
  public void closeMode()
  {
    View localView = this.mClose;
    if (localView == null) {
      killMode();
    }
  }
  
  protected ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    localMarginLayoutParams.<init>(-1, -2);
    return localMarginLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = new android/view/ViewGroup$MarginLayoutParams;
    Context localContext = getContext();
    localMarginLayoutParams.<init>(localContext, paramAttributeSet);
    return localMarginLayoutParams;
  }
  
  public CharSequence getSubtitle()
  {
    return this.mSubtitle;
  }
  
  public CharSequence getTitle()
  {
    return this.mTitle;
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.hideOverflowMenu();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public void initForMode(ActionMode paramActionMode)
  {
    Object localObject1 = this.mClose;
    int i;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = LayoutInflater.from(getContext());
      i = this.mCloseItemLayout;
      localObject2 = null;
      localObject1 = ((LayoutInflater)localObject1).inflate(i, this, false);
      this.mClose = ((View)localObject1);
      localObject1 = this.mClose;
      addView((View)localObject1);
    }
    for (;;)
    {
      localObject1 = this.mClose;
      i = R.id.action_mode_close_button;
      localObject1 = ((View)localObject1).findViewById(i);
      Object localObject3 = new android/support/v7/widget/ActionBarContextView$1;
      ((ActionBarContextView.1)localObject3).<init>(this, paramActionMode);
      ((View)localObject1).setOnClickListener((View.OnClickListener)localObject3);
      localObject1 = (MenuBuilder)paramActionMode.getMenu();
      localObject3 = this.mActionMenuPresenter;
      if (localObject3 != null)
      {
        localObject3 = this.mActionMenuPresenter;
        ((ActionMenuPresenter)localObject3).dismissPopupMenus();
      }
      localObject3 = new android/support/v7/widget/ActionMenuPresenter;
      localObject2 = getContext();
      ((ActionMenuPresenter)localObject3).<init>((Context)localObject2);
      this.mActionMenuPresenter = ((ActionMenuPresenter)localObject3);
      this.mActionMenuPresenter.setReserveOverflow(true);
      localObject3 = new android/view/ViewGroup$LayoutParams;
      ((ViewGroup.LayoutParams)localObject3).<init>(-2, -1);
      localObject2 = this.mActionMenuPresenter;
      Context localContext = this.mPopupContext;
      ((MenuBuilder)localObject1).addMenuPresenter((MenuPresenter)localObject2, localContext);
      localObject1 = (ActionMenuView)this.mActionMenuPresenter.getMenuView(this);
      this.mMenuView = ((ActionMenuView)localObject1);
      r.a(this.mMenuView, null);
      localObject1 = this.mMenuView;
      addView((View)localObject1, (ViewGroup.LayoutParams)localObject3);
      return;
      localObject1 = this.mClose.getParent();
      if (localObject1 == null)
      {
        localObject1 = this.mClose;
        addView((View)localObject1);
      }
    }
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.isOverflowMenuShowing();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public boolean isTitleOptional()
  {
    return this.mTitleOptional;
  }
  
  public void killMode()
  {
    removeAllViews();
    this.mCustomView = null;
    this.mMenuView = null;
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    if (localActionMenuPresenter != null)
    {
      this.mActionMenuPresenter.hideOverflowMenu();
      localActionMenuPresenter = this.mActionMenuPresenter;
      localActionMenuPresenter.hideSubMenus();
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    int i = paramAccessibilityEvent.getEventType();
    int j = 32;
    if (i == j)
    {
      paramAccessibilityEvent.setSource(this);
      Object localObject = getClass().getName();
      paramAccessibilityEvent.setClassName((CharSequence)localObject);
      localObject = getContext().getPackageName();
      paramAccessibilityEvent.setPackageName((CharSequence)localObject);
      localObject = this.mTitle;
      paramAccessibilityEvent.setContentDescription((CharSequence)localObject);
    }
    for (;;)
    {
      return;
      super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 8;
    boolean bool = ViewUtils.isLayoutRtl(this);
    int j;
    int k;
    int m;
    int i1;
    Object localObject1;
    label131:
    int i2;
    label147:
    Object localObject2;
    if (bool)
    {
      j = paramInt3 - paramInt1;
      k = getPaddingRight();
      j -= k;
      k = j;
      m = getPaddingTop();
      j = paramInt4 - paramInt2;
      n = getPaddingTop();
      j -= n;
      n = getPaddingBottom();
      i1 = j - n;
      localObject1 = this.mClose;
      if (localObject1 == null) {
        break label438;
      }
      localObject1 = this.mClose;
      j = ((View)localObject1).getVisibility();
      if (j == i) {
        break label438;
      }
      localObject1 = (ViewGroup.MarginLayoutParams)this.mClose.getLayoutParams();
      if (!bool) {
        break label386;
      }
      n = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
      if (!bool) {
        break label396;
      }
      j = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
      i2 = j;
      n = next(k, n, bool);
      localObject2 = this.mClose;
      localObject1 = this;
      j = positionChild((View)localObject2, n, m, i1, bool) + n;
      k = next(j, i2, bool);
    }
    label325:
    label386:
    label396:
    label432:
    label438:
    for (int n = k;; n = k)
    {
      localObject1 = this.mTitleLayout;
      if (localObject1 != null)
      {
        localObject1 = this.mCustomView;
        if (localObject1 == null)
        {
          localObject1 = this.mTitleLayout;
          j = ((LinearLayout)localObject1).getVisibility();
          if (j != i)
          {
            localObject2 = this.mTitleLayout;
            localObject1 = this;
            j = positionChild((View)localObject2, n, m, i1, bool);
            n += j;
          }
        }
      }
      localObject1 = this.mCustomView;
      if (localObject1 != null)
      {
        localObject2 = this.mCustomView;
        localObject1 = this;
        j = positionChild((View)localObject2, n, m, i1, bool) + n;
      }
      if (bool)
      {
        n = getPaddingLeft();
        localObject1 = this.mMenuView;
        if (localObject1 != null)
        {
          localObject2 = this.mMenuView;
          if (bool) {
            break label432;
          }
        }
      }
      for (bool = true;; bool = false)
      {
        localObject1 = this;
        j = positionChild((View)localObject2, n, m, i1, bool) + n;
        return;
        j = getPaddingLeft();
        k = j;
        break;
        n = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
        break label131;
        j = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin;
        i2 = j;
        break label147;
        j = paramInt3 - paramInt1;
        k = getPaddingRight();
        n = j - k;
        break label325;
      }
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = -2;
    int j = 1073741824;
    int k = -1 << -1;
    float f = -0.0F;
    int m = 0;
    int n = View.MeasureSpec.getMode(paramInt1);
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (n != j)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = getClass().getSimpleName();
      localObject2 = (String)localObject3 + " can only be used " + "with android:layout_width=\"match_parent\" (or fill_parent)";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    n = View.MeasureSpec.getMode(paramInt2);
    if (n == 0)
    {
      localObject1 = new java/lang/IllegalStateException;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject3 = getClass().getSimpleName();
      localObject2 = (String)localObject3 + " can only be used " + "with android:layout_height=\"wrap_content\"";
      ((IllegalStateException)localObject1).<init>((String)localObject2);
      throw ((Throwable)localObject1);
    }
    int i1 = View.MeasureSpec.getSize(paramInt1);
    n = this.mContentHeight;
    int i2;
    int i3;
    int i5;
    Object localObject4;
    if (n > 0)
    {
      n = this.mContentHeight;
      i2 = n;
      n = getPaddingTop();
      i3 = getPaddingBottom();
      int i4 = n + i3;
      n = getPaddingLeft();
      n = i1 - n;
      i3 = getPaddingRight();
      n -= i3;
      i5 = i2 - i4;
      i3 = View.MeasureSpec.makeMeasureSpec(i5, k);
      localObject4 = this.mClose;
      int i8;
      if (localObject4 != null)
      {
        localObject4 = this.mClose;
        int i6 = measureChildView((View)localObject4, n, i3, 0);
        localObject1 = (ViewGroup.MarginLayoutParams)this.mClose.getLayoutParams();
        i8 = ((ViewGroup.MarginLayoutParams)localObject1).leftMargin;
        n = ((ViewGroup.MarginLayoutParams)localObject1).rightMargin + i8;
        n = i6 - n;
      }
      localObject4 = this.mMenuView;
      if (localObject4 != null)
      {
        localObject4 = this.mMenuView.getParent();
        if (localObject4 == this)
        {
          localObject4 = this.mMenuView;
          n = measureChildView((View)localObject4, n, i3, 0);
        }
      }
      localObject4 = this.mTitleLayout;
      if (localObject4 != null)
      {
        localObject4 = this.mCustomView;
        if (localObject4 == null)
        {
          boolean bool = this.mTitleOptional;
          if (!bool) {
            break label709;
          }
          int i7 = View.MeasureSpec.makeMeasureSpec(0, 0);
          LinearLayout localLinearLayout = this.mTitleLayout;
          localLinearLayout.measure(i7, i3);
          localObject3 = this.mTitleLayout;
          i7 = ((LinearLayout)localObject3).getMeasuredWidth();
          if (i7 > n) {
            break label693;
          }
          i3 = 1;
          label437:
          if (i3 != 0) {
            n -= i7;
          }
          localObject4 = this.mTitleLayout;
          if (i3 == 0) {
            break label702;
          }
          i3 = 0;
          localObject3 = null;
          label466:
          ((LinearLayout)localObject4).setVisibility(i3);
        }
      }
      label473:
      localObject3 = this.mCustomView;
      if (localObject3 != null)
      {
        localObject3 = this.mCustomView;
        localObject4 = ((View)localObject3).getLayoutParams();
        i3 = ((ViewGroup.LayoutParams)localObject4).width;
        if (i3 == i) {
          break label731;
        }
        i3 = j;
        label514:
        i8 = ((ViewGroup.LayoutParams)localObject4).width;
        if (i8 >= 0)
        {
          i8 = ((ViewGroup.LayoutParams)localObject4).width;
          n = Math.min(i8, n);
        }
        i8 = ((ViewGroup.LayoutParams)localObject4).height;
        if (i8 == i) {
          break label738;
        }
        label555:
        k = ((ViewGroup.LayoutParams)localObject4).height;
        if (k < 0) {
          break label745;
        }
        k = Math.min(((ViewGroup.LayoutParams)localObject4).height, i5);
        label579:
        View localView = this.mCustomView;
        n = View.MeasureSpec.makeMeasureSpec(n, i3);
        i3 = View.MeasureSpec.makeMeasureSpec(k, j);
        localView.measure(n, i3);
      }
      n = this.mContentHeight;
      if (n > 0) {
        break label761;
      }
      i3 = getChildCount();
      i2 = 0;
      localObject2 = null;
      label635:
      if (m >= i3) {
        break label752;
      }
      localObject1 = getChildAt(m);
      n = ((View)localObject1).getMeasuredHeight() + i4;
      if (n <= i2) {
        break label772;
      }
    }
    for (;;)
    {
      m += 1;
      i2 = n;
      break label635;
      n = View.MeasureSpec.getSize(paramInt2);
      i2 = n;
      break;
      label693:
      i3 = 0;
      localObject3 = null;
      break label437;
      label702:
      i3 = 8;
      break label466;
      label709:
      localObject4 = this.mTitleLayout;
      n = measureChildView((View)localObject4, n, i3, 0);
      break label473;
      label731:
      i3 = k;
      break label514;
      label738:
      j = k;
      break label555;
      label745:
      k = i5;
      break label579;
      label752:
      setMeasuredDimension(i1, i2);
      for (;;)
      {
        return;
        label761:
        setMeasuredDimension(i1, i2);
      }
      label772:
      n = i2;
    }
  }
  
  public void setContentHeight(int paramInt)
  {
    this.mContentHeight = paramInt;
  }
  
  public void setCustomView(View paramView)
  {
    Object localObject = this.mCustomView;
    if (localObject != null)
    {
      localObject = this.mCustomView;
      removeView((View)localObject);
    }
    this.mCustomView = paramView;
    if (paramView != null)
    {
      localObject = this.mTitleLayout;
      if (localObject != null)
      {
        localObject = this.mTitleLayout;
        removeView((View)localObject);
        localObject = null;
        this.mTitleLayout = null;
      }
    }
    if (paramView != null) {
      addView(paramView);
    }
    requestLayout();
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    this.mSubtitle = paramCharSequence;
    initTitle();
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    this.mTitle = paramCharSequence;
    initTitle();
  }
  
  public void setTitleOptional(boolean paramBoolean)
  {
    boolean bool = this.mTitleOptional;
    if (paramBoolean != bool) {
      requestLayout();
    }
    this.mTitleOptional = paramBoolean;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mActionMenuPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mActionMenuPresenter;
      bool = localActionMenuPresenter.showOverflowMenu();
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionBarContextView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */