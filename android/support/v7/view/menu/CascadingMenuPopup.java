package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.layout;
import android.support.v7.widget.MenuItemHoverListener;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class CascadingMenuPopup
  extends MenuPopup
  implements MenuPresenter, View.OnKeyListener, PopupWindow.OnDismissListener
{
  static final int HORIZ_POSITION_LEFT = 0;
  static final int HORIZ_POSITION_RIGHT = 1;
  static final int SUBMENU_TIMEOUT_MS = 200;
  private View mAnchorView;
  private final View.OnAttachStateChangeListener mAttachStateChangeListener;
  private final Context mContext;
  private int mDropDownGravity;
  private boolean mForceShowIcon;
  private final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
  private boolean mHasXOffset;
  private boolean mHasYOffset;
  private int mLastPosition;
  private final MenuItemHoverListener mMenuItemHoverListener;
  private final int mMenuMaxWidth;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  private final List mPendingMenus;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  private int mRawDropDownGravity;
  boolean mShouldCloseImmediately;
  private boolean mShowTitle;
  final List mShowingMenus;
  View mShownAnchorView;
  final Handler mSubMenuHoverHandler;
  private ViewTreeObserver mTreeObserver;
  private int mXOffset;
  private int mYOffset;
  
  public CascadingMenuPopup(Context paramContext, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mPendingMenus = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.mShowingMenus = ((List)localObject);
    localObject = new android/support/v7/view/menu/CascadingMenuPopup$1;
    ((CascadingMenuPopup.1)localObject).<init>(this);
    this.mGlobalLayoutListener = ((ViewTreeObserver.OnGlobalLayoutListener)localObject);
    localObject = new android/support/v7/view/menu/CascadingMenuPopup$2;
    ((CascadingMenuPopup.2)localObject).<init>(this);
    this.mAttachStateChangeListener = ((View.OnAttachStateChangeListener)localObject);
    localObject = new android/support/v7/view/menu/CascadingMenuPopup$3;
    ((CascadingMenuPopup.3)localObject).<init>(this);
    this.mMenuItemHoverListener = ((MenuItemHoverListener)localObject);
    this.mRawDropDownGravity = 0;
    this.mDropDownGravity = 0;
    this.mContext = paramContext;
    this.mAnchorView = paramView;
    this.mPopupStyleAttr = paramInt1;
    this.mPopupStyleRes = paramInt2;
    this.mOverflowOnly = paramBoolean;
    this.mForceShowIcon = false;
    int i = getInitialMenuPosition();
    this.mLastPosition = i;
    localObject = paramContext.getResources();
    int j = ((Resources)localObject).getDisplayMetrics().widthPixels / 2;
    int k = R.dimen.abc_config_prefDialogWidth;
    i = ((Resources)localObject).getDimensionPixelSize(k);
    i = Math.max(j, i);
    this.mMenuMaxWidth = i;
    localObject = new android/os/Handler;
    ((Handler)localObject).<init>();
    this.mSubMenuHoverHandler = ((Handler)localObject);
  }
  
  private MenuPopupWindow createPopupWindow()
  {
    MenuPopupWindow localMenuPopupWindow = new android/support/v7/widget/MenuPopupWindow;
    Object localObject = this.mContext;
    int i = this.mPopupStyleAttr;
    int j = this.mPopupStyleRes;
    localMenuPopupWindow.<init>((Context)localObject, null, i, j);
    localObject = this.mMenuItemHoverListener;
    localMenuPopupWindow.setHoverListener((MenuItemHoverListener)localObject);
    localMenuPopupWindow.setOnItemClickListener(this);
    localMenuPopupWindow.setOnDismissListener(this);
    localObject = this.mAnchorView;
    localMenuPopupWindow.setAnchorView((View)localObject);
    int k = this.mDropDownGravity;
    localMenuPopupWindow.setDropDownGravity(k);
    localMenuPopupWindow.setModal(true);
    localMenuPopupWindow.setInputMethodMode(2);
    return localMenuPopupWindow;
  }
  
  private int findIndexOfAddedMenu(MenuBuilder paramMenuBuilder)
  {
    int i = 0;
    Object localObject = this.mShowingMenus;
    int j = ((List)localObject).size();
    if (i < j)
    {
      localObject = ((CascadingMenuPopup.CascadingMenuInfo)this.mShowingMenus.get(i)).menu;
      if (paramMenuBuilder != localObject) {}
    }
    for (int k = i;; k = -1)
    {
      return k;
      i += 1;
      break;
    }
  }
  
  private MenuItem findMenuItemForSubmenu(MenuBuilder paramMenuBuilder1, MenuBuilder paramMenuBuilder2)
  {
    int i = 0;
    MenuItem localMenuItem = null;
    int j = paramMenuBuilder1.size();
    int k = 0;
    if (k < j)
    {
      localMenuItem = paramMenuBuilder1.getItem(k);
      boolean bool = localMenuItem.hasSubMenu();
      if (bool)
      {
        SubMenu localSubMenu = localMenuItem.getSubMenu();
        if (paramMenuBuilder2 != localSubMenu) {}
      }
    }
    for (;;)
    {
      return localMenuItem;
      i = k + 1;
      k = i;
      break;
      i = 0;
      localMenuItem = null;
    }
  }
  
  private View findParentViewForSubmenu(CascadingMenuPopup.CascadingMenuInfo paramCascadingMenuInfo, MenuBuilder paramMenuBuilder)
  {
    int i = 0;
    int j = -1;
    Object localObject = paramCascadingMenuInfo.menu;
    MenuItem localMenuItem = findMenuItemForSubmenu((MenuBuilder)localObject, paramMenuBuilder);
    if (localMenuItem == null)
    {
      k = 0;
      localObject = null;
      return (View)localObject;
    }
    ListView localListView = paramCascadingMenuInfo.getListView();
    localObject = localListView.getAdapter();
    boolean bool = localObject instanceof HeaderViewListAdapter;
    int m;
    if (bool)
    {
      localObject = (HeaderViewListAdapter)localObject;
      m = ((HeaderViewListAdapter)localObject).getHeadersCount();
      localObject = (MenuAdapter)((HeaderViewListAdapter)localObject).getWrappedAdapter();
      label83:
      int n = ((MenuAdapter)localObject).getCount();
      label90:
      if (i >= n) {
        break label211;
      }
      MenuItemImpl localMenuItemImpl = ((MenuAdapter)localObject).getItem(i);
      if (localMenuItem != localMenuItemImpl) {
        break label143;
      }
    }
    label143:
    label211:
    for (int k = i;; k = j)
    {
      if (k == j)
      {
        k = 0;
        localObject = null;
        break;
        localObject = (MenuAdapter)localObject;
        m = 0;
        break label83;
        i += 1;
        break label90;
      }
      k += m;
      m = localListView.getFirstVisiblePosition();
      k -= m;
      if (k >= 0)
      {
        m = localListView.getChildCount();
        if (k < m) {}
      }
      else
      {
        k = 0;
        localObject = null;
        break;
      }
      localObject = localListView.getChildAt(k);
      break;
    }
  }
  
  private int getInitialMenuPosition()
  {
    int i = 1;
    View localView = this.mAnchorView;
    int j = r.e(localView);
    if (j == i) {
      i = 0;
    }
    return i;
  }
  
  private int getNextMenuPosition(int paramInt)
  {
    int i = 1;
    Object localObject = this.mShowingMenus;
    int j = this.mShowingMenus.size() + -1;
    localObject = ((CascadingMenuPopup.CascadingMenuInfo)((List)localObject).get(j)).getListView();
    j = 2;
    int[] arrayOfInt = new int[j];
    ((ListView)localObject).getLocationOnScreen(arrayOfInt);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    View localView = this.mShownAnchorView;
    localView.getWindowVisibleDisplayFrame(localRect);
    int k = this.mLastPosition;
    int m;
    if (k == i)
    {
      j = arrayOfInt[0];
      m = ((ListView)localObject).getWidth() + j + paramInt;
      j = localRect.right;
      if (m > j)
      {
        m = 0;
        localObject = null;
      }
    }
    for (;;)
    {
      return m;
      m = i;
      continue;
      m = arrayOfInt[0] - paramInt;
      if (m < 0)
      {
        m = i;
      }
      else
      {
        m = 0;
        localObject = null;
      }
    }
  }
  
  private void showMenu(MenuBuilder paramMenuBuilder)
  {
    int i = 5;
    int j = 2;
    int k = 1;
    LayoutInflater localLayoutInflater = LayoutInflater.from(this.mContext);
    Object localObject1 = new android/support/v7/view/menu/MenuAdapter;
    boolean bool1 = this.mOverflowOnly;
    ((MenuAdapter)localObject1).<init>(paramMenuBuilder, localLayoutInflater, bool1);
    bool1 = isShowing();
    Object localObject2;
    int i3;
    int i4;
    MenuPopupWindow localMenuPopupWindow;
    Object localObject3;
    Object localObject4;
    label193:
    label229:
    Object localObject5;
    if (!bool1)
    {
      bool1 = this.mForceShowIcon;
      if (bool1)
      {
        ((MenuAdapter)localObject1).setForceShowIcon(k);
        localObject2 = this.mContext;
        i3 = this.mMenuMaxWidth;
        i4 = measureIndividualMenuWidth((ListAdapter)localObject1, null, (Context)localObject2, i3);
        localMenuPopupWindow = createPopupWindow();
        localMenuPopupWindow.setAdapter((ListAdapter)localObject1);
        localMenuPopupWindow.setContentWidth(i4);
        int i5 = this.mDropDownGravity;
        localMenuPopupWindow.setDropDownGravity(i5);
        localObject1 = this.mShowingMenus;
        i5 = ((List)localObject1).size();
        if (i5 <= 0) {
          break label495;
        }
        localObject1 = this.mShowingMenus;
        int n = this.mShowingMenus.size() + -1;
        localObject1 = (CascadingMenuPopup.CascadingMenuInfo)((List)localObject1).get(n);
        localObject2 = findParentViewForSubmenu((CascadingMenuPopup.CascadingMenuInfo)localObject1, paramMenuBuilder);
        localObject3 = localObject2;
        localObject4 = localObject1;
        if (localObject3 == null) {
          break label702;
        }
        localMenuPopupWindow.setTouchModal(false);
        localMenuPopupWindow.setEnterTransition(null);
        n = getNextMenuPosition(i4);
        if (n != k) {
          break label504;
        }
        i5 = k;
        this.mLastPosition = n;
        int i1 = Build.VERSION.SDK_INT;
        i3 = 26;
        if (i1 < i3) {
          break label513;
        }
        localMenuPopupWindow.setAnchorView((View)localObject3);
        i1 = 0;
        localObject2 = null;
        i3 = 0;
        localObject5 = null;
        label270:
        j = this.mDropDownGravity & 0x5;
        if (j != i) {
          break label674;
        }
        if (i5 == 0) {
          break label657;
        }
        i5 = i3 + i4;
        label294:
        localMenuPopupWindow.setHorizontalOffset(i5);
        localMenuPopupWindow.setOverlapAnchor(k);
        localMenuPopupWindow.setVerticalOffset(i1);
      }
    }
    for (;;)
    {
      localObject1 = new android/support/v7/view/menu/CascadingMenuPopup$CascadingMenuInfo;
      int m = this.mLastPosition;
      ((CascadingMenuPopup.CascadingMenuInfo)localObject1).<init>(localMenuPopupWindow, paramMenuBuilder, m);
      Object localObject6 = this.mShowingMenus;
      ((List)localObject6).add(localObject1);
      localMenuPopupWindow.show();
      localObject2 = localMenuPopupWindow.getListView();
      ((ListView)localObject2).setOnKeyListener(this);
      if (localObject4 == null)
      {
        boolean bool3 = this.mShowTitle;
        if (bool3)
        {
          localObject1 = paramMenuBuilder.getHeaderTitle();
          if (localObject1 != null)
          {
            i6 = R.layout.abc_popup_menu_header_item_layout;
            localObject1 = (FrameLayout)localLayoutInflater.inflate(i6, (ViewGroup)localObject2, false);
            m = 16908310;
            localObject6 = (TextView)((FrameLayout)localObject1).findViewById(m);
            ((FrameLayout)localObject1).setEnabled(false);
            localObject5 = paramMenuBuilder.getHeaderTitle();
            ((TextView)localObject6).setText((CharSequence)localObject5);
            ((ListView)localObject2).addHeaderView((View)localObject1, null, false);
            localMenuPopupWindow.show();
          }
        }
      }
      return;
      boolean bool2 = isShowing();
      if (!bool2) {
        break;
      }
      bool2 = MenuPopup.shouldPreserveIconSpacing(paramMenuBuilder);
      ((MenuAdapter)localObject1).setForceShowIcon(bool2);
      break;
      label495:
      localObject3 = null;
      localObject4 = null;
      break label193;
      label504:
      int i6 = 0;
      localObject1 = null;
      break label229;
      label513:
      localObject2 = new int[j];
      localObject5 = this.mAnchorView;
      ((View)localObject5).getLocationOnScreen((int[])localObject2);
      int[] arrayOfInt = new int[j];
      ((View)localObject3).getLocationOnScreen(arrayOfInt);
      i3 = this.mDropDownGravity & 0x7;
      if (i3 == i)
      {
        i3 = localObject2[0];
        View localView = this.mAnchorView;
        i9 = localView.getWidth();
        i3 += i9;
        localObject2[0] = i3;
        i3 = arrayOfInt[0];
        i9 = ((View)localObject3).getWidth();
        i3 += i9;
        arrayOfInt[0] = i3;
      }
      i3 = arrayOfInt[0];
      int i9 = localObject2[0];
      i3 -= i9;
      j = arrayOfInt[m];
      int i2 = localObject2[m];
      i2 = j - i2;
      break label270;
      label657:
      i6 = ((View)localObject3).getWidth();
      i6 = i3 - i6;
      break label294;
      label674:
      if (i6 != 0)
      {
        i6 = ((View)localObject3).getWidth() + i3;
        break label294;
      }
      i6 = i3 - i4;
      break label294;
      label702:
      boolean bool4 = this.mHasXOffset;
      if (bool4)
      {
        int i7 = this.mXOffset;
        localMenuPopupWindow.setHorizontalOffset(i7);
      }
      boolean bool5 = this.mHasYOffset;
      if (bool5)
      {
        int i8 = this.mYOffset;
        localMenuPopupWindow.setVerticalOffset(i8);
      }
      localObject1 = getEpicenterBounds();
      localMenuPopupWindow.setEpicenterBounds((Rect)localObject1);
    }
  }
  
  public void addMenu(MenuBuilder paramMenuBuilder)
  {
    Object localObject = this.mContext;
    paramMenuBuilder.addMenuPresenter(this, (Context)localObject);
    boolean bool = isShowing();
    if (bool) {
      showMenu(paramMenuBuilder);
    }
    for (;;)
    {
      return;
      localObject = this.mPendingMenus;
      ((List)localObject).add(paramMenuBuilder);
    }
  }
  
  protected boolean closeMenuOnSubMenuOpened()
  {
    return false;
  }
  
  public void dismiss()
  {
    Object localObject1 = this.mShowingMenus;
    int i = ((List)localObject1).size();
    if (i > 0)
    {
      localObject1 = this.mShowingMenus;
      Object localObject2 = new CascadingMenuPopup.CascadingMenuInfo[i];
      localObject1 = (CascadingMenuPopup.CascadingMenuInfo[])((List)localObject1).toArray((Object[])localObject2);
      i += -1;
      while (i >= 0)
      {
        localObject2 = localObject1[i];
        MenuPopupWindow localMenuPopupWindow = ((CascadingMenuPopup.CascadingMenuInfo)localObject2).window;
        boolean bool = localMenuPopupWindow.isShowing();
        if (bool)
        {
          localObject2 = ((CascadingMenuPopup.CascadingMenuInfo)localObject2).window;
          ((MenuPopupWindow)localObject2).dismiss();
        }
        i += -1;
      }
    }
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListView getListView()
  {
    Object localObject = this.mShowingMenus;
    boolean bool = ((List)localObject).isEmpty();
    if (bool) {
      bool = false;
    }
    int i;
    for (localObject = null;; localObject = ((CascadingMenuPopup.CascadingMenuInfo)((List)localObject).get(i)).getListView())
    {
      return (ListView)localObject;
      localObject = this.mShowingMenus;
      List localList = this.mShowingMenus;
      i = localList.size() + -1;
    }
  }
  
  public boolean isShowing()
  {
    Object localObject = this.mShowingMenus;
    int i = ((List)localObject).size();
    boolean bool;
    if (i > 0)
    {
      localObject = ((CascadingMenuPopup.CascadingMenuInfo)this.mShowingMenus.get(0)).window;
      bool = ((MenuPopupWindow)localObject).isShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
    }
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    int i = findIndexOfAddedMenu(paramMenuBuilder);
    if (i < 0) {}
    for (;;)
    {
      return;
      int k = i + 1;
      List localList = this.mShowingMenus;
      int n = localList.size();
      if (k < n)
      {
        localList = this.mShowingMenus;
        localObject1 = ((CascadingMenuPopup.CascadingMenuInfo)localList.get(k)).menu;
        ((MenuBuilder)localObject1).close(false);
      }
      Object localObject1 = (CascadingMenuPopup.CascadingMenuInfo)this.mShowingMenus.remove(i);
      Object localObject2 = ((CascadingMenuPopup.CascadingMenuInfo)localObject1).menu;
      ((MenuBuilder)localObject2).removeMenuPresenter(this);
      boolean bool1 = this.mShouldCloseImmediately;
      if (bool1)
      {
        ((CascadingMenuPopup.CascadingMenuInfo)localObject1).window.setExitTransition(null);
        localObject2 = ((CascadingMenuPopup.CascadingMenuInfo)localObject1).window;
        ((MenuPopupWindow)localObject2).setAnimationStyle(0);
      }
      ((CascadingMenuPopup.CascadingMenuInfo)localObject1).window.dismiss();
      localObject1 = this.mShowingMenus;
      int j = ((List)localObject1).size();
      if (j > 0)
      {
        localObject1 = this.mShowingMenus;
        n = j + -1;
        localObject1 = (CascadingMenuPopup.CascadingMenuInfo)((List)localObject1).get(n);
        k = ((CascadingMenuPopup.CascadingMenuInfo)localObject1).position;
      }
      int m;
      for (this.mLastPosition = k;; this.mLastPosition = m)
      {
        if (j != 0) {
          break label329;
        }
        dismiss();
        localObject1 = this.mPresenterCallback;
        if (localObject1 != null)
        {
          localObject1 = this.mPresenterCallback;
          j = 1;
          ((MenuPresenter.Callback)localObject1).onCloseMenu(paramMenuBuilder, j);
        }
        localObject1 = this.mTreeObserver;
        if (localObject1 != null)
        {
          localObject1 = this.mTreeObserver;
          boolean bool2 = ((ViewTreeObserver)localObject1).isAlive();
          if (bool2)
          {
            localObject1 = this.mTreeObserver;
            localObject2 = this.mGlobalLayoutListener;
            ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
          }
          this.mTreeObserver = null;
        }
        localObject1 = this.mShownAnchorView;
        localObject2 = this.mAttachStateChangeListener;
        ((View)localObject1).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject2);
        localObject1 = this.mOnDismissListener;
        ((PopupWindow.OnDismissListener)localObject1).onDismiss();
        break;
        m = getInitialMenuPosition();
      }
      label329:
      if (paramBoolean)
      {
        localObject1 = ((CascadingMenuPopup.CascadingMenuInfo)this.mShowingMenus.get(0)).menu;
        ((MenuBuilder)localObject1).close(false);
      }
    }
  }
  
  public void onDismiss()
  {
    Object localObject = this.mShowingMenus;
    int i = ((List)localObject).size();
    int j = 0;
    if (j < i)
    {
      localObject = (CascadingMenuPopup.CascadingMenuInfo)this.mShowingMenus.get(j);
      MenuPopupWindow localMenuPopupWindow = ((CascadingMenuPopup.CascadingMenuInfo)localObject).window;
      boolean bool = localMenuPopupWindow.isShowing();
      if (bool) {}
    }
    for (;;)
    {
      if (localObject != null)
      {
        localObject = ((CascadingMenuPopup.CascadingMenuInfo)localObject).menu;
        ((MenuBuilder)localObject).close(false);
      }
      return;
      int k = j + 1;
      j = k;
      break;
      k = 0;
      localObject = null;
    }
  }
  
  public boolean onKey(View paramView, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = paramKeyEvent.getAction();
    if (j == i)
    {
      int k = 82;
      if (paramInt == k) {
        dismiss();
      }
    }
    for (;;)
    {
      return i;
      i = 0;
    }
  }
  
  public void onRestoreInstanceState(Parcelable paramParcelable) {}
  
  public Parcelable onSaveInstanceState()
  {
    return null;
  }
  
  public boolean onSubMenuSelected(SubMenuBuilder paramSubMenuBuilder)
  {
    boolean bool1 = true;
    Object localObject = this.mShowingMenus;
    Iterator localIterator = ((List)localObject).iterator();
    MenuBuilder localMenuBuilder;
    do
    {
      bool2 = localIterator.hasNext();
      if (!bool2) {
        break;
      }
      localObject = (CascadingMenuPopup.CascadingMenuInfo)localIterator.next();
      localMenuBuilder = ((CascadingMenuPopup.CascadingMenuInfo)localObject).menu;
    } while (paramSubMenuBuilder != localMenuBuilder);
    localObject = ((CascadingMenuPopup.CascadingMenuInfo)localObject).getListView();
    ((ListView)localObject).requestFocus();
    boolean bool2 = bool1;
    for (;;)
    {
      return bool2;
      bool2 = paramSubMenuBuilder.hasVisibleItems();
      if (bool2)
      {
        addMenu(paramSubMenuBuilder);
        localObject = this.mPresenterCallback;
        if (localObject != null)
        {
          localObject = this.mPresenterCallback;
          ((MenuPresenter.Callback)localObject).onOpenSubMenu(paramSubMenuBuilder);
        }
        bool2 = bool1;
      }
      else
      {
        bool2 = false;
        localObject = null;
      }
    }
  }
  
  public void setAnchorView(View paramView)
  {
    View localView1 = this.mAnchorView;
    if (localView1 != paramView)
    {
      this.mAnchorView = paramView;
      int i = this.mRawDropDownGravity;
      View localView2 = this.mAnchorView;
      int j = r.e(localView2);
      i = d.a(i, j);
      this.mDropDownGravity = i;
    }
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.mPresenterCallback = paramCallback;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.mForceShowIcon = paramBoolean;
  }
  
  public void setGravity(int paramInt)
  {
    int i = this.mRawDropDownGravity;
    if (i != paramInt)
    {
      this.mRawDropDownGravity = paramInt;
      View localView = this.mAnchorView;
      i = r.e(localView);
      i = d.a(paramInt, i);
      this.mDropDownGravity = i;
    }
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    this.mHasXOffset = true;
    this.mXOffset = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mOnDismissListener = paramOnDismissListener;
  }
  
  public void setShowTitle(boolean paramBoolean)
  {
    this.mShowTitle = paramBoolean;
  }
  
  public void setVerticalOffset(int paramInt)
  {
    this.mHasYOffset = true;
    this.mYOffset = paramInt;
  }
  
  public void show()
  {
    boolean bool = isShowing();
    if (bool) {}
    Object localObject2;
    do
    {
      return;
      localObject1 = this.mPendingMenus;
      localObject2 = ((List)localObject1).iterator();
      for (;;)
      {
        bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = (MenuBuilder)((Iterator)localObject2).next();
        showMenu((MenuBuilder)localObject1);
      }
      this.mPendingMenus.clear();
      localObject1 = this.mAnchorView;
      this.mShownAnchorView = ((View)localObject1);
      localObject1 = this.mShownAnchorView;
    } while (localObject1 == null);
    Object localObject1 = this.mTreeObserver;
    if (localObject1 == null) {
      bool = true;
    }
    for (;;)
    {
      localObject2 = this.mShownAnchorView.getViewTreeObserver();
      this.mTreeObserver = ((ViewTreeObserver)localObject2);
      if (bool)
      {
        localObject1 = this.mTreeObserver;
        localObject2 = this.mGlobalLayoutListener;
        ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
      }
      localObject1 = this.mShownAnchorView;
      localObject2 = this.mAttachStateChangeListener;
      ((View)localObject1).addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject2);
      break;
      bool = false;
      localObject1 = null;
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    Object localObject = this.mShowingMenus;
    Iterator localIterator = ((List)localObject).iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localObject = toMenuAdapter(((CascadingMenuPopup.CascadingMenuInfo)localIterator.next()).getListView().getAdapter());
      ((MenuAdapter)localObject).notifyDataSetChanged();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\CascadingMenuPopup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */