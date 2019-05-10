package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.b;
import android.support.v4.view.b.a;
import android.support.v7.view.ActionBarPolicy;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.ActionMenuItemView.PopupCallback;
import android.support.v7.view.menu.BaseMenuPresenter;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.ItemInvoker;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.view.menu.MenuPopupHelper;
import android.support.v7.view.menu.MenuView;
import android.support.v7.view.menu.MenuView.ItemView;
import android.support.v7.view.menu.SubMenuBuilder;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;

class ActionMenuPresenter
  extends BaseMenuPresenter
  implements b.a
{
  private static final String TAG = "ActionMenuPresenter";
  private final SparseBooleanArray mActionButtonGroups;
  ActionMenuPresenter.ActionButtonSubmenu mActionButtonPopup;
  private int mActionItemWidthLimit;
  private boolean mExpandedActionViewsExclusive;
  private int mMaxItems;
  private boolean mMaxItemsSet;
  private int mMinCellSize;
  int mOpenSubMenuId;
  ActionMenuPresenter.OverflowMenuButton mOverflowButton;
  ActionMenuPresenter.OverflowPopup mOverflowPopup;
  private Drawable mPendingOverflowIcon;
  private boolean mPendingOverflowIconSet;
  private ActionMenuPresenter.ActionMenuPopupCallback mPopupCallback;
  final ActionMenuPresenter.PopupPresenterCallback mPopupPresenterCallback;
  ActionMenuPresenter.OpenOverflowRunnable mPostedOpenRunnable;
  private boolean mReserveOverflow;
  private boolean mReserveOverflowSet;
  private View mScrapActionButtonView;
  private boolean mStrictWidthLimit;
  private int mWidthLimit;
  private boolean mWidthLimitSet;
  
  public ActionMenuPresenter(Context paramContext)
  {
    super(paramContext, i, j);
    Object localObject = new android/util/SparseBooleanArray;
    ((SparseBooleanArray)localObject).<init>();
    this.mActionButtonGroups = ((SparseBooleanArray)localObject);
    localObject = new android/support/v7/widget/ActionMenuPresenter$PopupPresenterCallback;
    ((ActionMenuPresenter.PopupPresenterCallback)localObject).<init>(this);
    this.mPopupPresenterCallback = ((ActionMenuPresenter.PopupPresenterCallback)localObject);
  }
  
  private View findViewForItem(MenuItem paramMenuItem)
  {
    ViewGroup localViewGroup = (ViewGroup)this.mMenuView;
    View localView;
    if (localViewGroup == null) {
      localView = null;
    }
    for (;;)
    {
      return (View)localView;
      int i = localViewGroup.getChildCount();
      boolean bool = false;
      Object localObject = null;
      int j;
      for (int k = 0;; k = j)
      {
        if (k >= i) {
          break label92;
        }
        localView = localViewGroup.getChildAt(k);
        bool = localView instanceof MenuView.ItemView;
        if (bool)
        {
          localObject = localView;
          localObject = ((MenuView.ItemView)localView).getItemData();
          if (localObject == paramMenuItem) {
            break;
          }
        }
        j = k + 1;
      }
      label92:
      localView = null;
    }
  }
  
  public void bindItemView(MenuItemImpl paramMenuItemImpl, MenuView.ItemView paramItemView)
  {
    paramItemView.initialize(paramMenuItemImpl, 0);
    Object localObject = (ActionMenuView)this.mMenuView;
    paramItemView = (ActionMenuItemView)paramItemView;
    paramItemView.setItemInvoker((MenuBuilder.ItemInvoker)localObject);
    localObject = this.mPopupCallback;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/ActionMenuPresenter$ActionMenuPopupCallback;
      ((ActionMenuPresenter.ActionMenuPopupCallback)localObject).<init>(this);
      this.mPopupCallback = ((ActionMenuPresenter.ActionMenuPopupCallback)localObject);
    }
    localObject = this.mPopupCallback;
    paramItemView.setPopupCallback((ActionMenuItemView.PopupCallback)localObject);
  }
  
  public boolean dismissPopupMenus()
  {
    boolean bool1 = hideOverflowMenu();
    boolean bool2 = hideSubMenus();
    return bool1 | bool2;
  }
  
  public boolean filterLeftoverView(ViewGroup paramViewGroup, int paramInt)
  {
    View localView = paramViewGroup.getChildAt(paramInt);
    ActionMenuPresenter.OverflowMenuButton localOverflowMenuButton = this.mOverflowButton;
    boolean bool;
    if (localView == localOverflowMenuButton)
    {
      bool = false;
      localView = null;
    }
    for (;;)
    {
      return bool;
      bool = super.filterLeftoverView(paramViewGroup, paramInt);
    }
  }
  
  public boolean flagActionItems()
  {
    Object localObject1 = this;
    Object localObject2 = this.mMenu;
    Object localObject3;
    int i;
    int j;
    Object localObject4;
    int k;
    int m;
    int i1;
    int i2;
    View localView1;
    int i6;
    boolean bool3;
    View localView2;
    int i12;
    MenuItemImpl localMenuItemImpl;
    int i15;
    int i18;
    label95:
    boolean bool5;
    if (localObject2 != null)
    {
      localObject2 = this.mMenu;
      localObject3 = ((MenuBuilder)localObject2).getVisibleItems();
      i = ((ArrayList)localObject3).size();
      j = i;
      localObject4 = localObject3;
      localObject1 = this;
      k = this.mMaxItems;
      m = this.mActionItemWidthLimit;
      i = 0;
      i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      localObject2 = (ViewGroup)this.mMenuView;
      i2 = 0;
      localView1 = null;
      i6 = 0;
      bool3 = false;
      localView2 = null;
      i12 = 0;
      localMenuItemImpl = null;
      i15 = 0;
      localObject3 = null;
      i18 = 0;
      if (i18 >= j) {
        break label217;
      }
      localObject3 = (MenuItemImpl)((ArrayList)localObject4).get(i18);
      bool5 = ((MenuItemImpl)localObject3).requiresActionButton();
      if (!bool5) {
        break label191;
      }
      i2 += 1;
      label130:
      localObject1 = this;
      bool5 = this.mExpandedActionViewsExclusive;
      if (!bool5) {
        break label1103;
      }
      i15 = ((MenuItemImpl)localObject3).isActionViewExpanded();
      if (i15 == 0) {
        break label1103;
      }
      i15 = 0;
      localObject3 = null;
    }
    for (;;)
    {
      i18 += 1;
      k = i15;
      break label95;
      i15 = 0;
      localObject3 = null;
      i = 0;
      localObject2 = null;
      j = 0;
      localObject4 = null;
      break;
      label191:
      bool5 = ((MenuItemImpl)localObject3).requestsActionButton();
      if (bool5)
      {
        i6 += 1;
        break label130;
      }
      i12 = 1;
      break label130;
      label217:
      localObject1 = this;
      i15 = this.mReserveOverflow;
      if (i15 != 0) {
        if (i12 == 0)
        {
          i16 = i2 + i6;
          if (i16 <= k) {}
        }
        else
        {
          k += -1;
        }
      }
      i18 = k - i2;
      localObject1 = this;
      localObject1 = this.mActionButtonGroups;
      Object localObject5 = localObject1;
      ((SparseBooleanArray)localObject1).clear();
      i12 = 0;
      localMenuItemImpl = null;
      int i16 = 0;
      localObject3 = null;
      localObject1 = this;
      boolean bool2 = this.mStrictWidthLimit;
      int i13;
      if (bool2)
      {
        i16 = this.mMinCellSize;
        i17 = m / i16;
        i12 = this.mMinCellSize;
        i13 = m % i12;
        i7 = this.mMinCellSize;
        i13 = i13 / i17 + i7;
      }
      for (int i7 = i13;; i7 = 0)
      {
        localMenuItemImpl = null;
        int i19 = 0;
        k = 0;
        i13 = i17;
        int i8;
        label460:
        int i3;
        if (i19 < j)
        {
          localObject3 = (MenuItemImpl)((ArrayList)localObject4).get(i19);
          boolean bool1 = ((MenuItemImpl)localObject3).requiresActionButton();
          if (bool1)
          {
            localObject1 = this;
            localView1 = this.mScrapActionButtonView;
            localView1 = getItemView((MenuItemImpl)localObject3, localView1, (ViewGroup)localObject2);
            localView2 = this.mScrapActionButtonView;
            if (localView2 == null) {
              this.mScrapActionButtonView = localView1;
            }
            localObject1 = this;
            bool3 = this.mStrictWidthLimit;
            if (bool3)
            {
              localView2 = null;
              i8 = ActionMenuView.measureChildForCells(localView1, i7, i13, i1, 0);
              i13 -= i8;
              i3 = localView1.getMeasuredWidth();
              i8 = m - i3;
              if (k != 0) {
                break label1090;
              }
            }
          }
        }
        for (;;)
        {
          k = ((MenuItemImpl)localObject3).getGroupId();
          if (k != 0)
          {
            m = 1;
            localObject1 = localObject5;
            ((SparseBooleanArray)localObject5).put(k, m);
          }
          ((MenuItemImpl)localObject3).setIsActionButton(true);
          i17 = i8;
          k = i18;
          i8 = i19 + 1;
          i19 = i8;
          m = i17;
          i18 = k;
          k = i3;
          break;
          localView1.measure(i1, i1);
          break label460;
          int i4 = ((MenuItemImpl)localObject3).requestsActionButton();
          int i20;
          boolean bool6;
          label617:
          View localView3;
          label705:
          label709:
          int n;
          int i10;
          if (i4 != 0)
          {
            i20 = ((MenuItemImpl)localObject3).getGroupId();
            bool6 = ((SparseBooleanArray)localObject5).get(i20);
            if (((i18 > 0) || (bool6)) && (m > 0))
            {
              localObject1 = this;
              i4 = this.mStrictWidthLimit;
              if ((i4 == 0) || (i13 > 0))
              {
                i4 = 1;
                if (i4 == 0) {
                  break label1075;
                }
                localObject1 = this;
                localView2 = this.mScrapActionButtonView;
                localView3 = getItemView((MenuItemImpl)localObject3, localView2, (ViewGroup)localObject2);
                localView2 = this.mScrapActionButtonView;
                if (localView2 == null) {
                  this.mScrapActionButtonView = localView3;
                }
                localObject1 = this;
                boolean bool4 = this.mStrictWidthLimit;
                if (!bool4) {
                  break label846;
                }
                localView2 = null;
                int i22 = ActionMenuView.measureChildForCells(localView3, i7, i13, i1, 0);
                int i9 = i13 - i22;
                if (i22 != 0) {
                  break label1068;
                }
                i13 = 0;
                localMenuItemImpl = null;
                i4 = i9;
                i9 = localView3.getMeasuredWidth();
                m -= i9;
                if (k == 0) {
                  k = i9;
                }
                localObject1 = this;
                i10 = this.mStrictWidthLimit;
                if (i10 == 0) {
                  break label879;
                }
                if (n < 0) {
                  break label870;
                }
                i10 = 1;
                label753:
                i13 &= i10;
                bool5 = i13;
                i10 = k;
                k = i4;
              }
            }
          }
          for (;;)
          {
            if ((bool5) && (i20 != 0))
            {
              localObject1 = localObject5;
              ((SparseBooleanArray)localObject5).put(i20, true);
              i13 = i18;
            }
            for (;;)
            {
              if (bool5) {
                i13 += -1;
              }
              ((MenuItemImpl)localObject3).setIsActionButton(bool5);
              i4 = i10;
              i17 = n;
              int i23 = k;
              k = i14;
              i14 = i23;
              break;
              i4 = 0;
              localView1 = null;
              break label617;
              label846:
              localView3.measure(i1, i1);
              i23 = i4;
              i4 = i14;
              i14 = i23;
              break label709;
              label870:
              i10 = 0;
              localView2 = null;
              break label753;
              label879:
              i11 = n + k;
              if (i11 > 0) {
                i11 = 1;
              }
              for (;;)
              {
                i14 &= i11;
                bool5 = i14;
                i11 = k;
                k = i4;
                break;
                i11 = 0;
                localView2 = null;
              }
              if (bool6)
              {
                localObject1 = localObject5;
                ((SparseBooleanArray)localObject5).put(i20, false);
                i14 = 0;
                localMenuItemImpl = null;
                i4 = i18;
                i18 = 0;
                for (;;)
                {
                  if (i18 < i19)
                  {
                    localMenuItemImpl = (MenuItemImpl)((ArrayList)localObject4).get(i18);
                    int i21 = localMenuItemImpl.getGroupId();
                    if (i21 == i20)
                    {
                      boolean bool7 = localMenuItemImpl.isActionButton();
                      if (bool7) {
                        i4 += 1;
                      }
                      bool7 = false;
                      localObject1 = null;
                      localMenuItemImpl.setIsActionButton(false);
                    }
                    i14 = i18 + 1;
                    i18 = i14;
                    continue;
                    localView1 = null;
                    ((MenuItemImpl)localObject3).setIsActionButton(false);
                    i5 = k;
                    i17 = n;
                    k = i18;
                    break;
                    return true;
                  }
                }
                i14 = i5;
              }
              else
              {
                i14 = i18;
              }
            }
            label1068:
            int i14 = i5;
            break label705;
            label1075:
            bool5 = i5;
            int i11 = k;
            k = i14;
          }
          label1090:
          int i5 = k;
        }
      }
      label1103:
      int i17 = k;
    }
  }
  
  public View getItemView(MenuItemImpl paramMenuItemImpl, View paramView, ViewGroup paramViewGroup)
  {
    View localView = paramMenuItemImpl.getActionView();
    if (localView != null)
    {
      bool1 = paramMenuItemImpl.hasCollapsibleActionView();
      if (!bool1) {}
    }
    else
    {
      localView = super.getItemView(paramMenuItemImpl, paramView, paramViewGroup);
    }
    boolean bool1 = paramMenuItemImpl.isActionViewExpanded();
    int i;
    if (bool1) {
      i = 8;
    }
    for (;;)
    {
      localView.setVisibility(i);
      paramViewGroup = (ActionMenuView)paramViewGroup;
      Object localObject = localView.getLayoutParams();
      boolean bool2 = paramViewGroup.checkLayoutParams((ViewGroup.LayoutParams)localObject);
      if (!bool2)
      {
        localObject = paramViewGroup.generateLayoutParams((ViewGroup.LayoutParams)localObject);
        localView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      return localView;
      i = 0;
      localObject = null;
    }
  }
  
  public MenuView getMenuView(ViewGroup paramViewGroup)
  {
    Object localObject = this.mMenuView;
    MenuView localMenuView = super.getMenuView(paramViewGroup);
    if (localObject != localMenuView)
    {
      localObject = localMenuView;
      localObject = (ActionMenuView)localMenuView;
      ((ActionMenuView)localObject).setPresenter(this);
    }
    return localMenuView;
  }
  
  public Drawable getOverflowIcon()
  {
    Object localObject = this.mOverflowButton;
    if (localObject != null) {
      localObject = this.mOverflowButton.getDrawable();
    }
    for (;;)
    {
      return (Drawable)localObject;
      boolean bool = this.mPendingOverflowIconSet;
      if (bool)
      {
        localObject = this.mPendingOverflowIcon;
      }
      else
      {
        bool = false;
        localObject = null;
      }
    }
  }
  
  public boolean hideOverflowMenu()
  {
    boolean bool1 = true;
    Object localObject = this.mPostedOpenRunnable;
    boolean bool2;
    if (localObject != null)
    {
      localObject = this.mMenuView;
      if (localObject != null)
      {
        localObject = (View)this.mMenuView;
        ActionMenuPresenter.OpenOverflowRunnable localOpenOverflowRunnable = this.mPostedOpenRunnable;
        ((View)localObject).removeCallbacks(localOpenOverflowRunnable);
        localObject = null;
        this.mPostedOpenRunnable = null;
        bool2 = bool1;
      }
    }
    for (;;)
    {
      return bool2;
      localObject = this.mOverflowPopup;
      if (localObject != null)
      {
        ((MenuPopupHelper)localObject).dismiss();
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
        localObject = null;
      }
    }
  }
  
  public boolean hideSubMenus()
  {
    ActionMenuPresenter.ActionButtonSubmenu localActionButtonSubmenu = this.mActionButtonPopup;
    boolean bool;
    if (localActionButtonSubmenu != null)
    {
      localActionButtonSubmenu = this.mActionButtonPopup;
      localActionButtonSubmenu.dismiss();
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localActionButtonSubmenu = null;
    }
  }
  
  public void initForMenu(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    super.initForMenu(paramContext, paramMenuBuilder);
    Resources localResources = paramContext.getResources();
    ActionBarPolicy localActionBarPolicy = ActionBarPolicy.get(paramContext);
    boolean bool1 = this.mReserveOverflowSet;
    if (!bool1)
    {
      bool1 = localActionBarPolicy.showsOverflowMenuButton();
      this.mReserveOverflow = bool1;
    }
    bool1 = this.mWidthLimitSet;
    if (!bool1)
    {
      int i = localActionBarPolicy.getEmbeddedMenuWidthLimit();
      this.mWidthLimit = i;
    }
    boolean bool2 = this.mMaxItemsSet;
    if (!bool2)
    {
      k = localActionBarPolicy.getMaxActionButtons();
      this.mMaxItems = k;
    }
    int k = this.mWidthLimit;
    bool2 = this.mReserveOverflow;
    if (bool2)
    {
      ActionMenuPresenter.OverflowMenuButton localOverflowMenuButton = this.mOverflowButton;
      if (localOverflowMenuButton == null)
      {
        localOverflowMenuButton = new android/support/v7/widget/ActionMenuPresenter$OverflowMenuButton;
        Object localObject = this.mSystemContext;
        localOverflowMenuButton.<init>(this, (Context)localObject);
        this.mOverflowButton = localOverflowMenuButton;
        bool2 = this.mPendingOverflowIconSet;
        if (bool2)
        {
          localOverflowMenuButton = this.mOverflowButton;
          localObject = this.mPendingOverflowIcon;
          localOverflowMenuButton.setImageDrawable((Drawable)localObject);
          this.mPendingOverflowIcon = null;
          this.mPendingOverflowIconSet = false;
        }
        j = View.MeasureSpec.makeMeasureSpec(0, 0);
        localObject = this.mOverflowButton;
        ((ActionMenuPresenter.OverflowMenuButton)localObject).measure(j, j);
      }
      localOverflowMenuButton = this.mOverflowButton;
      int j = localOverflowMenuButton.getMeasuredWidth();
      k -= j;
    }
    for (;;)
    {
      this.mActionItemWidthLimit = k;
      float f = localResources.getDisplayMetrics().density;
      k = (int)(56.0F * f);
      this.mMinCellSize = k;
      this.mScrapActionButtonView = null;
      return;
      this.mOverflowButton = null;
    }
  }
  
  public boolean isOverflowMenuShowPending()
  {
    ActionMenuPresenter.OpenOverflowRunnable localOpenOverflowRunnable = this.mPostedOpenRunnable;
    boolean bool;
    if (localOpenOverflowRunnable == null)
    {
      bool = isOverflowMenuShowing();
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOpenOverflowRunnable = null;
    }
  }
  
  public boolean isOverflowMenuShowing()
  {
    ActionMenuPresenter.OverflowPopup localOverflowPopup = this.mOverflowPopup;
    boolean bool;
    if (localOverflowPopup != null)
    {
      localOverflowPopup = this.mOverflowPopup;
      bool = localOverflowPopup.isShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localOverflowPopup = null;
    }
  }
  
  public boolean isOverflowReserved()
  {
    return this.mReserveOverflow;
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    dismissPopupMenus();
    super.onCloseMenu(paramMenuBuilder, paramBoolean);
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    boolean bool1 = this.mMaxItemsSet;
    if (!bool1)
    {
      localObject = ActionBarPolicy.get(this.mContext);
      int i = ((ActionBarPolicy)localObject).getMaxActionButtons();
      this.mMaxItems = i;
    }
    Object localObject = this.mMenu;
    if (localObject != null)
    {
      localObject = this.mMenu;
      boolean bool2 = true;
      ((MenuBuilder)localObject).onItemsChanged(bool2);
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable)
  {
    boolean bool = paramParcelable instanceof ActionMenuPresenter.SavedState;
    if (!bool) {}
    for (;;)
    {
      return;
      paramParcelable = (ActionMenuPresenter.SavedState)paramParcelable;
      int i = paramParcelable.openSubMenuId;
      if (i > 0)
      {
        Object localObject = this.mMenu;
        int j = paramParcelable.openSubMenuId;
        localObject = ((MenuBuilder)localObject).findItem(j);
        if (localObject != null)
        {
          localObject = (SubMenuBuilder)((MenuItem)localObject).getSubMenu();
          onSubMenuSelected((SubMenuBuilder)localObject);
        }
      }
    }
  }
  
  public Parcelable onSaveInstanceState()
  {
    ActionMenuPresenter.SavedState localSavedState = new android/support/v7/widget/ActionMenuPresenter$SavedState;
    localSavedState.<init>();
    int i = this.mOpenSubMenuId;
    localSavedState.openSubMenuId = i;
    return localSavedState;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    int i = 1;
    boolean bool1 = false;
    ActionMenuPresenter.ActionButtonSubmenu localActionButtonSubmenu = null;
    boolean bool2 = paramSubMenuBuilder.hasVisibleItems();
    if (!bool2) {}
    Object localObject2;
    Object localObject3;
    do
    {
      return bool1;
      for (localObject1 = paramSubMenuBuilder;; localObject1 = (SubMenuBuilder)((SubMenuBuilder)localObject1).getParentMenu())
      {
        localObject2 = ((SubMenuBuilder)localObject1).getParentMenu();
        localObject3 = this.mMenu;
        if (localObject2 == localObject3) {
          break;
        }
      }
      localObject1 = ((SubMenuBuilder)localObject1).getItem();
      localObject2 = findViewForItem((MenuItem)localObject1);
    } while (localObject2 == null);
    int j = paramSubMenuBuilder.getItem().getItemId();
    this.mOpenSubMenuId = j;
    int m = paramSubMenuBuilder.size();
    j = 0;
    Object localObject1 = null;
    label105:
    if (j < m)
    {
      Object localObject4 = paramSubMenuBuilder.getItem(j);
      boolean bool3 = ((MenuItem)localObject4).isVisible();
      if (bool3)
      {
        localObject4 = ((MenuItem)localObject4).getIcon();
        if (localObject4 != null) {
          j = i;
        }
      }
    }
    for (;;)
    {
      localActionButtonSubmenu = new android/support/v7/widget/ActionMenuPresenter$ActionButtonSubmenu;
      localObject3 = this.mContext;
      localActionButtonSubmenu.<init>(this, (Context)localObject3, paramSubMenuBuilder, (View)localObject2);
      this.mActionButtonPopup = localActionButtonSubmenu;
      localActionButtonSubmenu = this.mActionButtonPopup;
      localActionButtonSubmenu.setForceShowIcon(j);
      localObject1 = this.mActionButtonPopup;
      ((ActionMenuPresenter.ActionButtonSubmenu)localObject1).show();
      super.onSubMenuSelected(paramSubMenuBuilder);
      bool1 = i;
      break;
      j += 1;
      break label105;
      int k = 0;
      localObject1 = null;
    }
  }
  
  public void onSubUiVisibilityChanged(boolean paramBoolean)
  {
    MenuBuilder localMenuBuilder;
    if (paramBoolean)
    {
      localMenuBuilder = null;
      super.onSubMenuSelected(null);
    }
    for (;;)
    {
      return;
      localMenuBuilder = this.mMenu;
      if (localMenuBuilder != null)
      {
        localMenuBuilder = this.mMenu;
        localMenuBuilder.close(false);
      }
    }
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    this.mExpandedActionViewsExclusive = paramBoolean;
  }
  
  public void setItemLimit(int paramInt)
  {
    this.mMaxItems = paramInt;
    this.mMaxItemsSet = true;
  }
  
  public void setMenuView(ActionMenuView paramActionMenuView)
  {
    this.mMenuView = paramActionMenuView;
    MenuBuilder localMenuBuilder = this.mMenu;
    paramActionMenuView.initialize(localMenuBuilder);
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    ActionMenuPresenter.OverflowMenuButton localOverflowMenuButton = this.mOverflowButton;
    if (localOverflowMenuButton != null)
    {
      localOverflowMenuButton = this.mOverflowButton;
      localOverflowMenuButton.setImageDrawable(paramDrawable);
    }
    for (;;)
    {
      return;
      boolean bool = true;
      this.mPendingOverflowIconSet = bool;
      this.mPendingOverflowIcon = paramDrawable;
    }
  }
  
  public void setReserveOverflow(boolean paramBoolean)
  {
    this.mReserveOverflow = paramBoolean;
    this.mReserveOverflowSet = true;
  }
  
  public void setWidthLimit(int paramInt, boolean paramBoolean)
  {
    this.mWidthLimit = paramInt;
    this.mStrictWidthLimit = paramBoolean;
    this.mWidthLimitSet = true;
  }
  
  public boolean shouldIncludeItem(int paramInt, MenuItemImpl paramMenuItemImpl)
  {
    return paramMenuItemImpl.isActionButton();
  }
  
  public boolean showOverflowMenu()
  {
    boolean bool1 = true;
    boolean bool2 = this.mReserveOverflow;
    if (bool2)
    {
      bool2 = isOverflowMenuShowing();
      if (!bool2)
      {
        Object localObject1 = this.mMenu;
        if (localObject1 != null)
        {
          localObject1 = this.mMenuView;
          if (localObject1 != null)
          {
            localObject1 = this.mPostedOpenRunnable;
            if (localObject1 == null)
            {
              localObject1 = this.mMenu.getNonActionItems();
              bool2 = ((ArrayList)localObject1).isEmpty();
              if (!bool2)
              {
                localObject1 = new android/support/v7/widget/ActionMenuPresenter$OverflowPopup;
                Context localContext = this.mContext;
                MenuBuilder localMenuBuilder = this.mMenu;
                ActionMenuPresenter.OverflowMenuButton localOverflowMenuButton = this.mOverflowButton;
                Object localObject2 = this;
                ((ActionMenuPresenter.OverflowPopup)localObject1).<init>(this, localContext, localMenuBuilder, localOverflowMenuButton, bool1);
                localObject2 = new android/support/v7/widget/ActionMenuPresenter$OpenOverflowRunnable;
                ((ActionMenuPresenter.OpenOverflowRunnable)localObject2).<init>(this, (ActionMenuPresenter.OverflowPopup)localObject1);
                this.mPostedOpenRunnable = ((ActionMenuPresenter.OpenOverflowRunnable)localObject2);
                localObject1 = (View)this.mMenuView;
                localObject2 = this.mPostedOpenRunnable;
                ((View)localObject1).post((Runnable)localObject2);
                bool2 = false;
                localObject1 = null;
                super.onSubMenuSelected(null);
              }
            }
          }
        }
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    int i = 1;
    float f = Float.MIN_VALUE;
    int j = 0;
    ActionMenuView.LayoutParams localLayoutParams = null;
    super.updateMenuView(paramBoolean);
    ((View)this.mMenuView).requestLayout();
    Object localObject1 = this.mMenu;
    if (localObject1 != null)
    {
      localObject1 = this.mMenu;
      ArrayList localArrayList = ((MenuBuilder)localObject1).getActionItems();
      int k = localArrayList.size();
      int i1;
      for (int m = 0; m < k; m = i1)
      {
        localObject1 = ((MenuItemImpl)localArrayList.get(m)).getSupportActionProvider();
        if (localObject1 != null) {
          ((b)localObject1).setSubUiVisibilityListener(this);
        }
        i1 = m + 1;
      }
    }
    localObject1 = this.mMenu;
    int n;
    boolean bool2;
    label181:
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = this.mMenu.getNonActionItems();
      boolean bool1 = this.mReserveOverflow;
      if ((bool1) && (localObject1 != null))
      {
        n = ((ArrayList)localObject1).size();
        if (n != i) {
          break label339;
        }
        localObject1 = (MenuItemImpl)((ArrayList)localObject1).get(0);
        bool2 = ((MenuItemImpl)localObject1).isActionViewExpanded();
        if (bool2) {
          break label330;
        }
        bool2 = i;
        j = bool2;
      }
      if (j == 0) {
        break label360;
      }
      localObject1 = this.mOverflowButton;
      if (localObject1 == null)
      {
        localObject1 = new android/support/v7/widget/ActionMenuPresenter$OverflowMenuButton;
        localObject2 = this.mSystemContext;
        ((ActionMenuPresenter.OverflowMenuButton)localObject1).<init>(this, (Context)localObject2);
        this.mOverflowButton = ((ActionMenuPresenter.OverflowMenuButton)localObject1);
      }
      localObject1 = (ViewGroup)this.mOverflowButton.getParent();
      localObject2 = this.mMenuView;
      if (localObject1 != localObject2)
      {
        if (localObject1 != null)
        {
          localObject2 = this.mOverflowButton;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
        localObject1 = (ActionMenuView)this.mMenuView;
        localObject2 = this.mOverflowButton;
        localLayoutParams = ((ActionMenuView)localObject1).generateOverflowButtonLayoutParams();
        ((ActionMenuView)localObject1).addView((View)localObject2, localLayoutParams);
      }
    }
    for (;;)
    {
      localObject1 = (ActionMenuView)this.mMenuView;
      i = this.mReserveOverflow;
      ((ActionMenuView)localObject1).setOverflowReserved(i);
      return;
      bool2 = false;
      localObject1 = null;
      break;
      label330:
      bool2 = false;
      localObject1 = null;
      break label181;
      label339:
      if (n > 0) {}
      for (;;)
      {
        j = i;
        break;
        i = 0;
        localObject2 = null;
        f = 0.0F;
      }
      label360:
      localObject1 = this.mOverflowButton;
      if (localObject1 != null)
      {
        localObject1 = this.mOverflowButton.getParent();
        localObject2 = this.mMenuView;
        if (localObject1 == localObject2)
        {
          localObject1 = (ViewGroup)this.mMenuView;
          localObject2 = this.mOverflowButton;
          ((ViewGroup)localObject1).removeView((View)localObject2);
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActionMenuPresenter.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */