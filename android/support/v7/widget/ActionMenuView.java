package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuBuilder.ItemInvoker;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPresenter;
import android.support.v7.view.menu.MenuPresenter.Callback;
import android.support.v7.view.menu.MenuView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;

public class ActionMenuView
  extends LinearLayoutCompat
  implements MenuBuilder.ItemInvoker, MenuView
{
  static final int GENERATED_ITEM_PADDING = 4;
  static final int MIN_CELL_SIZE = 56;
  private static final String TAG = "ActionMenuView";
  private MenuPresenter.Callback mActionMenuPresenterCallback;
  private boolean mFormatItems;
  private int mFormatItemsWidth;
  private int mGeneratedItemPadding;
  private MenuBuilder mMenu;
  MenuBuilder.Callback mMenuBuilderCallback;
  private int mMinCellSize;
  ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
  private Context mPopupContext;
  private int mPopupTheme;
  private ActionMenuPresenter mPresenter;
  private boolean mReserveOverflow;
  
  public ActionMenuView(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = paramContext.getResources().getDisplayMetrics().density;
    int i = (int)(56.0F * f);
    this.mMinCellSize = i;
    int j = (int)(f * 4.0F);
    this.mGeneratedItemPadding = j;
    this.mPopupContext = paramContext;
    this.mPopupTheme = 0;
  }
  
  static int measureChildForCells(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i = 1;
    int j = 2;
    boolean bool2 = false;
    ActionMenuView.LayoutParams localLayoutParams = (ActionMenuView.LayoutParams)paramView.getLayoutParams();
    int k = View.MeasureSpec.getSize(paramInt3) - paramInt4;
    int n = View.MeasureSpec.getMode(paramInt3);
    int i1 = View.MeasureSpec.makeMeasureSpec(k, n);
    boolean bool3 = paramView instanceof ActionMenuItemView;
    Object localObject;
    label83:
    int m;
    if (bool3)
    {
      localObject = paramView;
      localObject = (ActionMenuItemView)paramView;
      if (localObject == null) {
        break label237;
      }
      bool3 = ((ActionMenuItemView)localObject).hasText();
      if (!bool3) {
        break label237;
      }
      n = i;
      if ((paramInt2 <= 0) || ((n != 0) && (paramInt2 < j))) {
        break label243;
      }
      m = View.MeasureSpec.makeMeasureSpec(paramInt1 * paramInt2, -1 << -1);
      ((View)paramView).measure(m, i1);
      int i2 = ((View)paramView).getMeasuredWidth();
      m = i2 / paramInt1;
      i2 %= paramInt1;
      if (i2 != 0) {
        m += 1;
      }
      if ((n != 0) && (m < j)) {
        m = j;
      }
    }
    for (;;)
    {
      boolean bool1 = localLayoutParams.isOverflowButton;
      if ((!bool1) && (n != 0)) {
        bool2 = i;
      }
      localLayoutParams.expandable = bool2;
      localLayoutParams.cellsUsed = m;
      int i3 = View.MeasureSpec.makeMeasureSpec(m * paramInt1, 1073741824);
      ((View)paramView).measure(i3, i1);
      return m;
      m = 0;
      localObject = null;
      break;
      label237:
      n = 0;
      break label83;
      label243:
      m = 0;
      localObject = null;
    }
  }
  
  private void onMeasureExactFormat(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    int i5 = View.MeasureSpec.getSize(paramInt2);
    int i6 = getPaddingLeft();
    int i10 = getPaddingRight();
    i6 += i10;
    i10 = getPaddingTop();
    int i13 = getPaddingBottom();
    int i15 = i10 + i13;
    i10 = -2;
    float f1 = 0.0F / 0.0F;
    int i16 = paramInt2;
    int i21 = getChildMeasureSpec(paramInt2, i15, i10);
    int i22 = j - i6;
    j = this.mMinCellSize;
    i13 = i22 / j;
    j = this.mMinCellSize;
    j = i22 % j;
    if (i13 == 0)
    {
      j = 0;
      f2 = 0.0F;
      localLayoutParams = null;
      setMeasuredDimension(i22, 0);
      return;
    }
    i6 = this.mMinCellSize;
    j /= i13;
    int i23 = i6 + j;
    int i24 = 0;
    int i25 = 0;
    int i26 = 0;
    View localView1 = null;
    i6 = 0;
    float f3 = 0.0F;
    Object localObject = null;
    int i28 = 0;
    float f4 = 0.0F;
    long l1 = 0L;
    int i29 = getChildCount();
    j = 0;
    float f2 = 0.0F;
    ActionMenuView.LayoutParams localLayoutParams = null;
    int i30 = 0;
    float f5 = 0.0F;
    View localView2;
    long l2;
    int i34;
    int i35;
    for (;;)
    {
      i16 = i30;
      if (i30 >= i29) {
        break label652;
      }
      localView2 = getChildAt(i30);
      j = localView2.getVisibility();
      i32 = 8;
      if (j != i32) {
        break;
      }
      i10 = i6;
      l2 = l1;
      i34 = i24;
      i35 = i13;
      i13 = i25;
      label260:
      i32 = i30 + 1;
      i30 = i32;
      i25 = i13;
      i24 = i34;
      i13 = i35;
      l1 = l2;
      i6 = i10;
    }
    boolean bool8 = localView2 instanceof ActionMenuItemView;
    boolean bool11 = bool8;
    int i32 = i6 + 1;
    int i17;
    int i37;
    int i40;
    if (bool8)
    {
      j = this.mGeneratedItemPadding;
      i6 = 0;
      f3 = 0.0F;
      localObject = null;
      i17 = this.mGeneratedItemPadding;
      i37 = i17;
      i40 = 0;
      localView2.setPadding(j, 0, i17, 0);
    }
    localLayoutParams = (ActionMenuView.LayoutParams)localView2.getLayoutParams();
    localLayoutParams.expanded = false;
    localLayoutParams.extraPixels = 0;
    localLayoutParams.cellsUsed = 0;
    localLayoutParams.expandable = false;
    localLayoutParams.leftMargin = 0;
    i6 = 0;
    f3 = 0.0F;
    localObject = null;
    localLayoutParams.rightMargin = 0;
    label444:
    label470:
    int i36;
    if (bool11)
    {
      localObject = localView2;
      localObject = (ActionMenuItemView)localView2;
      int i7 = ((ActionMenuItemView)localObject).hasText();
      if (i7 != 0)
      {
        i7 = 1;
        f3 = Float.MIN_VALUE;
        localLayoutParams.preventEdgeOffset = i7;
        i7 = localLayoutParams.isOverflowButton;
        if (i7 == 0) {
          break label645;
        }
        i7 = 1;
        f3 = Float.MIN_VALUE;
        i17 = i23;
        i36 = measureChildForCells(localView2, i23, i7, i21, i15);
        i17 = i36;
        i25 = Math.max(i25, i36);
        boolean bool4 = localLayoutParams.expandable;
        if (!bool4) {
          break label2061;
        }
      }
    }
    label645:
    label652:
    label700:
    label733:
    label778:
    label816:
    label893:
    label941:
    label1156:
    int i9;
    label1197:
    label1265:
    label1308:
    label1593:
    int i27;
    label1814:
    label1822:
    label1983:
    label1990:
    label1997:
    label2008:
    label2061:
    for (int i8 = i26 + 1;; i9 = i27)
    {
      int k = localLayoutParams.isOverflowButton;
      if (k != 0) {
        k = 1;
      }
      for (f2 = Float.MIN_VALUE;; f2 = f4)
      {
        i28 = i13 - i36;
        i10 = localView2.getMeasuredHeight();
        i17 = i24;
        i26 = Math.max(i24, i10);
        i10 = 1;
        f1 = Float.MIN_VALUE;
        i17 = i36;
        int i33;
        if (i36 == i10)
        {
          f1 = Float.MIN_VALUE;
          long l3 = 1 << i30 | l1;
          i34 = i26;
          i35 = i28;
          i26 = i8;
          i28 = k;
          f4 = f2;
          l2 = l3;
          i13 = i25;
          i10 = i32;
          break label260;
          i8 = 0;
          f3 = 0.0F;
          localObject = null;
          break label444;
          i8 = i13;
          break label470;
          int m;
          int i31;
          long l4;
          if (i28 != 0)
          {
            m = 2;
            f2 = 2.8E-45F;
            if (i8 == m)
            {
              m = 1;
              f2 = Float.MIN_VALUE;
              i10 = m;
              f1 = f2;
              i31 = 0;
              f5 = 0.0F;
              l4 = l1;
              i15 = i13;
              if ((i26 <= 0) || (i15 <= 0)) {
                break label2008;
              }
              i32 = -1 >>> 1;
              l1 = 0L;
              i13 = 0;
              m = 0;
              f2 = 0.0F;
              localLayoutParams = null;
              i40 = 0;
              i17 = i40;
              if (i40 >= i29) {
                break label893;
              }
              localLayoutParams = (ActionMenuView.LayoutParams)getChildAt(i40).getLayoutParams();
              boolean bool9 = localLayoutParams.expandable;
              if (bool9) {
                break label816;
              }
              m = i13;
              i13 = i32;
            }
          }
          int i41;
          long l5;
          for (;;)
          {
            i40 += 1;
            i32 = i13;
            i13 = m;
            break label733;
            m = 0;
            f2 = 0.0F;
            localLayoutParams = null;
            i10 = 0;
            localView2 = null;
            f1 = 0.0F;
            break;
            i18 = localLayoutParams.cellsUsed;
            if (i18 < i32)
            {
              i13 = localLayoutParams.cellsUsed;
              l1 = 1L << i41;
              m = 1;
              f2 = Float.MIN_VALUE;
            }
            else
            {
              m = localLayoutParams.cellsUsed;
              if (m != i32) {
                break label1997;
              }
              l5 = 1L << i41;
              l1 |= l5;
              m = i13 + 1;
              i13 = i32;
            }
          }
          l4 |= l1;
          int i18 = i15;
          if (i13 > i15) {}
          for (l1 = l4;; l1 = l4)
          {
            int i11;
            long l8;
            View localView3;
            int i38;
            if (i28 == 0)
            {
              m = 1;
              f2 = Float.MIN_VALUE;
              if (i8 == m)
              {
                m = 1;
                f2 = Float.MIN_VALUE;
                if (i15 <= 0) {
                  break label1814;
                }
                l3 = 0L;
                boolean bool5 = l1 < l3;
                if (!bool5) {
                  break label1814;
                }
                i8 += -1;
                i18 = i15;
                if ((i15 >= i8) && (m == 0))
                {
                  i8 = 1;
                  f3 = Float.MIN_VALUE;
                  if (i25 <= i8) {
                    break label1814;
                  }
                }
                i8 = Long.bitCount(l1);
                f3 = i8;
                if (m != 0) {
                  break label1983;
                }
                l3 = 1L & l1;
                long l6 = 0L;
                boolean bool1 = l3 < l6;
                if (bool1)
                {
                  f2 = 0.0F;
                  localLayoutParams = (ActionMenuView.LayoutParams)getChildAt(0).getLayoutParams();
                  bool1 = localLayoutParams.preventEdgeOffset;
                  if (!bool1)
                  {
                    int n = 1056964608;
                    f2 = 0.5F;
                    f3 -= f2;
                  }
                }
                f2 = Float.MIN_VALUE;
                i11 = i29 + -1;
                l3 = 1 << i11 & l1;
                l6 = 0L;
                boolean bool2 = l3 < l6;
                if (!bool2) {
                  break label1983;
                }
                int i1 = i29 + -1;
                localLayoutParams = (ActionMenuView.LayoutParams)getChildAt(i1).getLayoutParams();
                boolean bool3 = localLayoutParams.preventEdgeOffset;
                if (bool3) {
                  break label1983;
                }
                int i2 = 1056964608;
                f2 = f3 - 0.5F;
                f3 = 0.0F;
                localObject = null;
                i9 = f2 < 0.0F;
                if (i9 <= 0) {
                  break label1593;
                }
                f3 = i15 * i23;
                f2 = f3 / f2;
                i2 = (int)f2;
                i9 = i2;
                i2 = 0;
                f2 = 0.0F;
                localLayoutParams = null;
                i13 = 0;
                i11 = i31;
                for (f1 = f5;; f1 = f2)
                {
                  i18 = i29;
                  if (i13 >= i29) {
                    break label1822;
                  }
                  f2 = Float.MIN_VALUE;
                  l6 = 1 << i13 & l1;
                  long l7 = 0L;
                  i3 = l6 < l7;
                  if (i3 != 0) {
                    break;
                  }
                  i3 = i11;
                  f2 = f1;
                  i13 += 1;
                  i11 = i3;
                }
                i41 = i32 + 1;
                int i3 = 0;
                f2 = 0.0F;
                localLayoutParams = null;
                i32 = 0;
                i13 = i15;
                l8 = l4;
                i18 = i29;
                if (i32 < i29)
                {
                  localView3 = getChildAt(i32);
                  localLayoutParams = (ActionMenuView.LayoutParams)localView3.getLayoutParams();
                  i37 = 1 << i32;
                  i18 = i37;
                  long l9 = i37;
                  l5 = l9;
                  l5 = l9 & l1;
                  long l10 = 0L;
                  i38 = l5 < l10;
                  if (i38 == 0)
                  {
                    i4 = localLayoutParams.cellsUsed;
                    i18 = i41;
                    if (i4 != i41) {
                      break label1990;
                    }
                    f2 = Float.MIN_VALUE;
                    l9 = 1 << i32;
                    l4 = l9;
                    l8 |= l9;
                    i4 = i13;
                  }
                }
              }
            }
            for (;;)
            {
              i32 += 1;
              i13 = i4;
              break label1308;
              if (i11 != 0)
              {
                int i19 = localLayoutParams.preventEdgeOffset;
                i38 = i19;
                if (i19 != 0)
                {
                  i38 = 1;
                  i19 = i38;
                  if (i13 == i38)
                  {
                    i20 = this.mGeneratedItemPadding;
                    i38 = i20;
                    int i39 = i20 + i23;
                    i20 = this.mGeneratedItemPadding;
                    localView3.setPadding(i39, 0, i20, 0);
                  }
                }
              }
              int i20 = localLayoutParams.cellsUsed;
              i36 = i20;
              i36 = i20 + 1;
              i20 = i36;
              localLayoutParams.cellsUsed = i36;
              i36 = 1;
              i20 = i36;
              localLayoutParams.expanded = i36;
              i4 = i13 + -1;
              continue;
              i4 = 1;
              f2 = Float.MIN_VALUE;
              l4 = l8;
              i31 = i4;
              f5 = f2;
              i15 = i13;
              break label700;
              i4 = 0;
              f2 = 0.0F;
              localLayoutParams = null;
              break label941;
              i4 = 0;
              f2 = 0.0F;
              localLayoutParams = null;
              i9 = 0;
              localObject = null;
              f3 = 0.0F;
              break label1197;
              localView1 = getChildAt(i13);
              localLayoutParams = (ActionMenuView.LayoutParams)localView1.getLayoutParams();
              boolean bool10 = localView1 instanceof ActionMenuItemView;
              if (bool10)
              {
                localLayoutParams.extraPixels = i9;
                i11 = 1;
                f1 = Float.MIN_VALUE;
                localLayoutParams.expanded = i11;
                if (i13 == 0)
                {
                  boolean bool6 = localLayoutParams.preventEdgeOffset;
                  if (!bool6)
                  {
                    i12 = -i9 / 2;
                    localLayoutParams.leftMargin = i12;
                  }
                }
                i4 = 1;
                f2 = Float.MIN_VALUE;
                break label1265;
              }
              bool10 = localLayoutParams.isOverflowButton;
              if (bool10)
              {
                localLayoutParams.extraPixels = i9;
                f1 = Float.MIN_VALUE;
                localLayoutParams.expanded = true;
                i12 = -i9 / 2;
                localLayoutParams.rightMargin = i12;
                i4 = 1;
                f2 = Float.MIN_VALUE;
                break label1265;
              }
              if (i13 != 0)
              {
                i27 = i9 / 2;
                localLayoutParams.leftMargin = i27;
              }
              i27 = i29 + -1;
              if (i13 != i27)
              {
                i27 = i9 / 2;
                localLayoutParams.rightMargin = i27;
              }
              i4 = i12;
              f2 = f1;
              break label1265;
              i12 = i31;
              f1 = f5;
              if (i12 != 0)
              {
                i4 = 0;
                f2 = 0.0F;
                localLayoutParams = null;
                i9 = 0;
                localObject = null;
                f3 = 0.0F;
                i20 = i29;
                if (i9 < i29)
                {
                  localView2 = getChildAt(i9);
                  localLayoutParams = (ActionMenuView.LayoutParams)localView2.getLayoutParams();
                  boolean bool7 = localLayoutParams.expanded;
                  if (!bool7) {}
                  for (;;)
                  {
                    i4 = i9 + 1;
                    i9 = i4;
                    break;
                    i14 = localLayoutParams.cellsUsed * i23;
                    i4 = localLayoutParams.extraPixels + i14;
                    i14 = 1073741824;
                    i4 = View.MeasureSpec.makeMeasureSpec(i4, i14);
                    i20 = i21;
                    localView2.measure(i4, i21);
                  }
                }
              }
              i4 = 1073741824;
              f2 = 2.0F;
              i20 = i;
              if (i != i4) {}
              for (;;)
              {
                setMeasuredDimension(i22, i24);
                break;
                i24 = i5;
              }
              f2 = f3;
              break label1156;
              i4 = i14;
            }
            i4 = i14;
            i14 = i33;
            break label778;
          }
        }
        int i12 = i33;
        int i14 = i25;
        i34 = i27;
        i35 = i28;
        i28 = i4;
        f4 = f2;
        i27 = i9;
        l2 = l1;
        break label260;
        int i4 = i28;
      }
    }
  }
  
  protected boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams != null)
    {
      bool = paramLayoutParams instanceof ActionMenuView.LayoutParams;
      if (!bool) {}
    }
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void dismissPopupMenus()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mPresenter;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mPresenter;
      localActionMenuPresenter.dismissPopupMenus();
    }
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  protected ActionMenuView.LayoutParams generateDefaultLayoutParams()
  {
    int i = -2;
    ActionMenuView.LayoutParams localLayoutParams = new android/support/v7/widget/ActionMenuView$LayoutParams;
    localLayoutParams.<init>(i, i);
    localLayoutParams.gravity = 16;
    return localLayoutParams;
  }
  
  public ActionMenuView.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ActionMenuView.LayoutParams localLayoutParams = new android/support/v7/widget/ActionMenuView$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  protected ActionMenuView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    ActionMenuView.LayoutParams localLayoutParams;
    if (paramLayoutParams != null)
    {
      boolean bool = paramLayoutParams instanceof ActionMenuView.LayoutParams;
      if (bool)
      {
        localLayoutParams = new android/support/v7/widget/ActionMenuView$LayoutParams;
        paramLayoutParams = (ActionMenuView.LayoutParams)paramLayoutParams;
        localLayoutParams.<init>(paramLayoutParams);
        int i = localLayoutParams.gravity;
        if (i <= 0)
        {
          i = 16;
          localLayoutParams.gravity = i;
        }
      }
    }
    for (;;)
    {
      return localLayoutParams;
      localLayoutParams = new android/support/v7/widget/ActionMenuView$LayoutParams;
      localLayoutParams.<init>(paramLayoutParams);
      break;
      localLayoutParams = generateDefaultLayoutParams();
    }
  }
  
  public ActionMenuView.LayoutParams generateOverflowButtonLayoutParams()
  {
    ActionMenuView.LayoutParams localLayoutParams = generateDefaultLayoutParams();
    localLayoutParams.isOverflowButton = true;
    return localLayoutParams;
  }
  
  public Menu getMenu()
  {
    Object localObject1 = this.mMenu;
    Object localObject2;
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = getContext();
      localObject2 = new android/support/v7/view/menu/MenuBuilder;
      ((MenuBuilder)localObject2).<init>((Context)localObject1);
      this.mMenu = ((MenuBuilder)localObject2);
      localObject2 = this.mMenu;
      localObject3 = new android/support/v7/widget/ActionMenuView$MenuBuilderCallback;
      ((ActionMenuView.MenuBuilderCallback)localObject3).<init>(this);
      ((MenuBuilder)localObject2).setCallback((MenuBuilder.Callback)localObject3);
      localObject2 = new android/support/v7/widget/ActionMenuPresenter;
      ((ActionMenuPresenter)localObject2).<init>((Context)localObject1);
      this.mPresenter = ((ActionMenuPresenter)localObject2);
      localObject1 = this.mPresenter;
      boolean bool = true;
      ((ActionMenuPresenter)localObject1).setReserveOverflow(bool);
      localObject2 = this.mPresenter;
      localObject1 = this.mActionMenuPresenterCallback;
      if (localObject1 == null) {
        break label135;
      }
      localObject1 = this.mActionMenuPresenterCallback;
    }
    for (;;)
    {
      ((ActionMenuPresenter)localObject2).setCallback((MenuPresenter.Callback)localObject1);
      localObject1 = this.mMenu;
      localObject2 = this.mPresenter;
      localObject3 = this.mPopupContext;
      ((MenuBuilder)localObject1).addMenuPresenter((MenuPresenter)localObject2, (Context)localObject3);
      localObject1 = this.mPresenter;
      ((ActionMenuPresenter)localObject1).setMenuView(this);
      return this.mMenu;
      label135:
      localObject1 = new android/support/v7/widget/ActionMenuView$ActionMenuPresenterCallback;
      ((ActionMenuView.ActionMenuPresenterCallback)localObject1).<init>();
    }
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    return this.mPresenter.getOverflowIcon();
  }
  
  public int getPopupTheme()
  {
    return this.mPopupTheme;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  protected boolean hasSupportDividerBeforeChildAt(int paramInt)
  {
    boolean bool1 = false;
    boolean bool2;
    Object localObject;
    if (paramInt == 0)
    {
      bool2 = false;
      localObject = null;
    }
    for (;;)
    {
      return bool2;
      int i = paramInt + -1;
      localObject = getChildAt(i);
      View localView = getChildAt(paramInt);
      int j = getChildCount();
      if (paramInt < j)
      {
        boolean bool4 = localObject instanceof ActionMenuView.ActionMenuChildView;
        if (bool4)
        {
          localObject = (ActionMenuView.ActionMenuChildView)localObject;
          bool3 = ((ActionMenuView.ActionMenuChildView)localObject).needsDividerAfter();
          bool1 = false | bool3;
        }
      }
      if (paramInt > 0)
      {
        bool3 = localView instanceof ActionMenuView.ActionMenuChildView;
        if (bool3)
        {
          localObject = localView;
          localObject = (ActionMenuView.ActionMenuChildView)localView;
          bool3 = ((ActionMenuView.ActionMenuChildView)localObject).needsDividerBefore() | bool1;
          continue;
        }
      }
      boolean bool3 = bool1;
    }
  }
  
  public boolean hideOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mPresenter;
      bool = localActionMenuPresenter.hideOverflowMenu();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public void initialize(MenuBuilder paramMenuBuilder)
  {
    this.mMenu = paramMenuBuilder;
  }
  
  public boolean invokeItem(MenuItemImpl paramMenuItemImpl)
  {
    return this.mMenu.performItemAction(paramMenuItemImpl, 0);
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mPresenter;
      bool = localActionMenuPresenter.isOverflowMenuShowPending();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mPresenter;
      bool = localActionMenuPresenter.isOverflowMenuShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
  
  public boolean isOverflowReserved()
  {
    return this.mReserveOverflow;
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    ActionMenuPresenter localActionMenuPresenter = this.mPresenter;
    if (localActionMenuPresenter != null)
    {
      this.mPresenter.updateMenuView(false);
      localActionMenuPresenter = this.mPresenter;
      boolean bool = localActionMenuPresenter.isOverflowMenuShowing();
      if (bool)
      {
        this.mPresenter.hideOverflowMenu();
        localActionMenuPresenter = this.mPresenter;
        localActionMenuPresenter.showOverflowMenu();
      }
    }
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    dismissPopupMenus();
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    boolean bool1 = this.mFormatItems;
    if (!bool1) {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    int j;
    int k;
    int m;
    int n;
    int i3;
    View localView1;
    int i;
    int i4;
    float f1;
    boolean bool5;
    float f2;
    Object localObject;
    int i8;
    int i10;
    int i6;
    for (;;)
    {
      return;
      j = getChildCount();
      k = (paramInt4 - paramInt2) / 2;
      m = getDividerWidth();
      n = 0;
      i3 = 0;
      localView1 = null;
      i = paramInt3 - paramInt1;
      i4 = getPaddingRight();
      i -= i4;
      i4 = getPaddingLeft();
      int i5 = i - i4;
      i4 = 0;
      f1 = 0.0F;
      bool5 = ViewUtils.isLayoutRtl(this);
      i = 0;
      f2 = 0.0F;
      localObject = null;
      i8 = 0;
      if (i8 < j)
      {
        View localView2 = getChildAt(i8);
        i = localView2.getVisibility();
        int i9 = 8;
        if (i == i9)
        {
          i = i4;
          f2 = f1;
          i9 = i3;
          i4 = i5;
          i5 = n;
        }
        for (;;)
        {
          i8 += 1;
          n = i5;
          i5 = i4;
          i3 = i9;
          i4 = i;
          f1 = f2;
          break;
          localObject = (ActionMenuView.LayoutParams)localView2.getLayoutParams();
          boolean bool6 = ((ActionMenuView.LayoutParams)localObject).isOverflowButton;
          if (bool6)
          {
            i4 = localView2.getMeasuredWidth();
            bool6 = hasSupportDividerBeforeChildAt(i8);
            if (bool6) {
              i4 += m;
            }
            int i11 = localView2.getMeasuredHeight();
            if (bool5)
            {
              i10 = getPaddingLeft();
              i = ((ActionMenuView.LayoutParams)localObject).leftMargin + i10;
              i10 = i + i4;
            }
            for (;;)
            {
              int i12 = i11 / 2;
              i12 = k - i12;
              i11 += i12;
              localView2.layout(i, i12, i10, i11);
              i4 = i5 - i4;
              i = 1;
              f2 = Float.MIN_VALUE;
              i10 = i3;
              i5 = n;
              break;
              i10 = getWidth();
              i12 = getPaddingRight();
              i10 -= i12;
              i = ((ActionMenuView.LayoutParams)localObject).rightMargin;
              i10 -= i;
              i = i10 - i4;
            }
          }
          i10 = localView2.getMeasuredWidth();
          int i13 = ((ActionMenuView.LayoutParams)localObject).leftMargin;
          i10 += i13;
          i = ((ActionMenuView.LayoutParams)localObject).rightMargin;
          i10 += i;
          i = n + i10;
          i10 = i5 - i10;
          boolean bool4 = hasSupportDividerBeforeChildAt(i8);
          if (bool4) {
            i += m;
          }
          i6 = i3 + 1;
          int i14 = i4;
          i4 = i10;
          i10 = i6;
          i6 = i;
          i = i14;
          f2 = f1;
        }
      }
      i = 1;
      f2 = Float.MIN_VALUE;
      if ((j != i) || (i4 != 0)) {
        break;
      }
      i = 0;
      f2 = 0.0F;
      localObject = getChildAt(0);
      i4 = ((View)localObject).getMeasuredWidth();
      i10 = ((View)localObject).getMeasuredHeight();
      i6 = (paramInt3 - paramInt1) / 2;
      i3 = i4 / 2;
      i6 -= i3;
      i3 = i10 / 2;
      i3 = k - i3;
      i4 += i6;
      i10 += i3;
      ((View)localObject).layout(i6, i3, i4, i10);
    }
    if (i4 != 0)
    {
      i = 0;
      f2 = 0.0F;
      localObject = null;
      label601:
      i = i3 - i;
      i4 = 0;
      f1 = 0.0F;
      if (i <= 0) {
        break label752;
      }
      i = i6 / i;
      label626:
      i6 = Math.max(0, i);
      if (!bool5) {
        break label855;
      }
      i = getWidth();
      i4 = getPaddingRight();
      i4 = i - i4;
      i = 0;
      f2 = 0.0F;
      localObject = null;
      i10 = 0;
      label670:
      if (i10 < j)
      {
        localView1 = getChildAt(i10);
        localObject = (ActionMenuView.LayoutParams)localView1.getLayoutParams();
        n = localView1.getVisibility();
        i8 = 8;
        if (n == i8) {
          break label1039;
        }
        boolean bool2 = ((ActionMenuView.LayoutParams)localObject).isOverflowButton;
        if (!bool2) {
          break label764;
        }
        i = i4;
      }
    }
    for (;;)
    {
      i10 += 1;
      i4 = i;
      break label670;
      break;
      i = 1;
      f2 = Float.MIN_VALUE;
      break label601;
      label752:
      i = 0;
      f2 = 0.0F;
      localObject = null;
      break label626;
      label764:
      int i1 = ((ActionMenuView.LayoutParams)localObject).rightMargin;
      i4 -= i1;
      i1 = localView1.getMeasuredWidth();
      i8 = localView1.getMeasuredHeight();
      m = i8 / 2;
      m = k - m;
      int i7 = i4 - i1;
      i8 += m;
      localView1.layout(i7, m, i4, i8);
      i = ((ActionMenuView.LayoutParams)localObject).leftMargin + i1 + i6;
      i = i4 - i;
      continue;
      label855:
      i4 = getPaddingLeft();
      i = 0;
      f2 = 0.0F;
      localObject = null;
      i10 = 0;
      label873:
      if (i10 < j)
      {
        localView1 = getChildAt(i10);
        localObject = (ActionMenuView.LayoutParams)localView1.getLayoutParams();
        i1 = localView1.getVisibility();
        i8 = 8;
        if (i1 == i8) {
          break label1032;
        }
        boolean bool3 = ((ActionMenuView.LayoutParams)localObject).isOverflowButton;
        if (!bool3) {
          break label945;
        }
        i = i4;
      }
      for (;;)
      {
        i10 += 1;
        i4 = i;
        break label873;
        break;
        label945:
        int i2 = ((ActionMenuView.LayoutParams)localObject).leftMargin;
        i4 += i2;
        i2 = localView1.getMeasuredWidth();
        i8 = localView1.getMeasuredHeight();
        m = i8 / 2;
        m = k - m;
        i7 = i4 + i2;
        i8 += m;
        localView1.layout(i4, m, i7, i8);
        i = ((ActionMenuView.LayoutParams)localObject).rightMargin + i2 + i6 + i4;
        continue;
        label1032:
        i = i4;
      }
      label1039:
      i = i4;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int i = 1;
    boolean bool1 = this.mFormatItems;
    int k = View.MeasureSpec.getMode(paramInt1);
    int i1 = 1073741824;
    int j;
    Object localObject;
    boolean bool3;
    if (k == i1)
    {
      k = i;
      this.mFormatItems = k;
      boolean bool2 = this.mFormatItems;
      if (bool1 != bool2) {
        this.mFormatItemsWidth = 0;
      }
      int m = View.MeasureSpec.getSize(paramInt1);
      bool1 = this.mFormatItems;
      if (bool1)
      {
        MenuBuilder localMenuBuilder = this.mMenu;
        if (localMenuBuilder != null)
        {
          j = this.mFormatItemsWidth;
          if (m != j)
          {
            this.mFormatItemsWidth = m;
            localObject = this.mMenu;
            ((MenuBuilder)localObject).onItemsChanged(i);
          }
        }
      }
      j = getChildCount();
      bool3 = this.mFormatItems;
      if ((!bool3) || (j <= 0)) {
        break label149;
      }
      onMeasureExactFormat(paramInt1, paramInt2);
    }
    for (;;)
    {
      return;
      bool3 = false;
      localObject = null;
      break;
      label149:
      int n;
      for (i = 0; i < j; i = n)
      {
        localObject = (ActionMenuView.LayoutParams)getChildAt(i).getLayoutParams();
        ((ActionMenuView.LayoutParams)localObject).rightMargin = 0;
        ((ActionMenuView.LayoutParams)localObject).leftMargin = 0;
        n = i + 1;
      }
      super.onMeasure(paramInt1, paramInt2);
    }
  }
  
  public MenuBuilder peekMenu()
  {
    return this.mMenu;
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    this.mPresenter.setExpandedActionViewsExclusive(paramBoolean);
  }
  
  public void setMenuCallbacks(MenuPresenter.Callback paramCallback, MenuBuilder.Callback paramCallback1)
  {
    this.mActionMenuPresenterCallback = paramCallback;
    this.mMenuBuilderCallback = paramCallback1;
  }
  
  public void setOnMenuItemClickListener(ActionMenuView.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    this.mPresenter.setOverflowIcon(paramDrawable);
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    this.mReserveOverflow = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    int i = this.mPopupTheme;
    Object localObject;
    if (i != paramInt)
    {
      this.mPopupTheme = paramInt;
      if (paramInt != 0) {
        break label30;
      }
      localObject = getContext();
    }
    for (this.mPopupContext = ((Context)localObject);; this.mPopupContext = ((Context)localObject))
    {
      return;
      label30:
      localObject = new android/view/ContextThemeWrapper;
      Context localContext = getContext();
      ((ContextThemeWrapper)localObject).<init>(localContext, paramInt);
    }
  }
  
  public void setPresenter(ActionMenuPresenter paramActionMenuPresenter)
  {
    this.mPresenter = paramActionMenuPresenter;
    this.mPresenter.setMenuView(this);
  }
  
  public boolean showOverflowMenu()
  {
    ActionMenuPresenter localActionMenuPresenter = this.mPresenter;
    boolean bool;
    if (localActionMenuPresenter != null)
    {
      localActionMenuPresenter = this.mPresenter;
      bool = localActionMenuPresenter.showOverflowMenu();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionMenuPresenter = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuView.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */