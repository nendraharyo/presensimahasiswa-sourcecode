package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.appcompat.R.dimen;
import android.support.v7.appcompat.R.layout;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;

final class StandardMenuPopup
  extends MenuPopup
  implements MenuPresenter, View.OnKeyListener, AdapterView.OnItemClickListener, PopupWindow.OnDismissListener
{
  private final MenuAdapter mAdapter;
  private View mAnchorView;
  private final View.OnAttachStateChangeListener mAttachStateChangeListener;
  private int mContentWidth;
  private final Context mContext;
  private int mDropDownGravity;
  private final ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener;
  private boolean mHasContentWidth;
  private final MenuBuilder mMenu;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  final MenuPopupWindow mPopup;
  private final int mPopupMaxWidth;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  private boolean mShowTitle;
  View mShownAnchorView;
  private ViewTreeObserver mTreeObserver;
  private boolean mWasDismissed;
  
  public StandardMenuPopup(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Object localObject1 = new android/support/v7/view/menu/StandardMenuPopup$1;
    ((StandardMenuPopup.1)localObject1).<init>(this);
    this.mGlobalLayoutListener = ((ViewTreeObserver.OnGlobalLayoutListener)localObject1);
    localObject1 = new android/support/v7/view/menu/StandardMenuPopup$2;
    ((StandardMenuPopup.2)localObject1).<init>(this);
    this.mAttachStateChangeListener = ((View.OnAttachStateChangeListener)localObject1);
    this.mDropDownGravity = 0;
    this.mContext = paramContext;
    this.mMenu = paramMenuBuilder;
    this.mOverflowOnly = paramBoolean;
    localObject1 = LayoutInflater.from(paramContext);
    Object localObject2 = new android/support/v7/view/menu/MenuAdapter;
    boolean bool = this.mOverflowOnly;
    ((MenuAdapter)localObject2).<init>(paramMenuBuilder, (LayoutInflater)localObject1, bool);
    this.mAdapter = ((MenuAdapter)localObject2);
    this.mPopupStyleAttr = paramInt1;
    this.mPopupStyleRes = paramInt2;
    localObject1 = paramContext.getResources();
    int j = ((Resources)localObject1).getDisplayMetrics().widthPixels / 2;
    int i = R.dimen.abc_config_prefDialogWidth;
    int k = ((Resources)localObject1).getDimensionPixelSize(i);
    k = Math.max(j, k);
    this.mPopupMaxWidth = k;
    this.mAnchorView = paramView;
    localObject1 = new android/support/v7/widget/MenuPopupWindow;
    localObject2 = this.mContext;
    int m = this.mPopupStyleAttr;
    int n = this.mPopupStyleRes;
    ((MenuPopupWindow)localObject1).<init>((Context)localObject2, null, m, n);
    this.mPopup = ((MenuPopupWindow)localObject1);
    paramMenuBuilder.addMenuPresenter(this, paramContext);
  }
  
  private boolean tryShow()
  {
    boolean bool1 = true;
    boolean bool2 = isShowing();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      bool2 = this.mWasDismissed;
      if (!bool2)
      {
        localObject1 = this.mAnchorView;
        if (localObject1 != null) {
          break;
        }
      }
      bool1 = false;
    }
    Object localObject1 = this.mAnchorView;
    this.mShownAnchorView = ((View)localObject1);
    this.mPopup.setOnDismissListener(this);
    this.mPopup.setOnItemClickListener(this);
    this.mPopup.setModal(bool1);
    Object localObject2 = this.mShownAnchorView;
    localObject1 = this.mTreeObserver;
    if (localObject1 == null) {
      bool2 = bool1;
    }
    for (;;)
    {
      Object localObject3 = ((View)localObject2).getViewTreeObserver();
      this.mTreeObserver = ((ViewTreeObserver)localObject3);
      if (bool2)
      {
        localObject1 = this.mTreeObserver;
        localObject3 = this.mGlobalLayoutListener;
        ((ViewTreeObserver)localObject1).addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject3);
      }
      localObject1 = this.mAttachStateChangeListener;
      ((View)localObject2).addOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject1);
      this.mPopup.setAnchorView((View)localObject2);
      localObject1 = this.mPopup;
      int j = this.mDropDownGravity;
      ((MenuPopupWindow)localObject1).setDropDownGravity(j);
      bool2 = this.mHasContentWidth;
      if (!bool2)
      {
        localObject1 = this.mAdapter;
        localObject2 = this.mContext;
        int k = this.mPopupMaxWidth;
        int i = measureIndividualMenuWidth((ListAdapter)localObject1, null, (Context)localObject2, k);
        this.mContentWidth = i;
        this.mHasContentWidth = bool1;
      }
      localObject1 = this.mPopup;
      j = this.mContentWidth;
      ((MenuPopupWindow)localObject1).setContentWidth(j);
      localObject1 = this.mPopup;
      j = 2;
      ((MenuPopupWindow)localObject1).setInputMethodMode(j);
      localObject1 = this.mPopup;
      localObject2 = getEpicenterBounds();
      ((MenuPopupWindow)localObject1).setEpicenterBounds((Rect)localObject2);
      this.mPopup.show();
      localObject1 = this.mPopup;
      localObject3 = ((MenuPopupWindow)localObject1).getListView();
      ((ListView)localObject3).setOnKeyListener(this);
      boolean bool3 = this.mShowTitle;
      if (bool3)
      {
        localObject1 = this.mMenu.getHeaderTitle();
        if (localObject1 != null)
        {
          localObject1 = LayoutInflater.from(this.mContext);
          j = R.layout.abc_popup_menu_header_item_layout;
          localObject1 = (FrameLayout)((LayoutInflater)localObject1).inflate(j, (ViewGroup)localObject3, false);
          j = 16908310;
          localObject2 = (TextView)((FrameLayout)localObject1).findViewById(j);
          if (localObject2 != null)
          {
            CharSequence localCharSequence = this.mMenu.getHeaderTitle();
            ((TextView)localObject2).setText(localCharSequence);
          }
          ((FrameLayout)localObject1).setEnabled(false);
          ((ListView)localObject3).addHeaderView((View)localObject1, null, false);
        }
      }
      localObject1 = this.mPopup;
      localObject2 = this.mAdapter;
      ((MenuPopupWindow)localObject1).setAdapter((ListAdapter)localObject2);
      localObject1 = this.mPopup;
      ((MenuPopupWindow)localObject1).show();
      break;
      bool3 = false;
      localObject1 = null;
    }
  }
  
  public void addMenu(MenuBuilder paramMenuBuilder) {}
  
  public void dismiss()
  {
    boolean bool = isShowing();
    if (bool)
    {
      MenuPopupWindow localMenuPopupWindow = this.mPopup;
      localMenuPopupWindow.dismiss();
    }
  }
  
  public boolean flagActionItems()
  {
    return false;
  }
  
  public ListView getListView()
  {
    return this.mPopup.getListView();
  }
  
  public boolean isShowing()
  {
    boolean bool = this.mWasDismissed;
    MenuPopupWindow localMenuPopupWindow;
    if (!bool)
    {
      localMenuPopupWindow = this.mPopup;
      bool = localMenuPopupWindow.isShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMenuPopupWindow = null;
    }
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    Object localObject = this.mMenu;
    if (paramMenuBuilder != localObject) {}
    for (;;)
    {
      return;
      dismiss();
      localObject = this.mPresenterCallback;
      if (localObject != null)
      {
        localObject = this.mPresenterCallback;
        ((MenuPresenter.Callback)localObject).onCloseMenu(paramMenuBuilder, paramBoolean);
      }
    }
  }
  
  public void onDismiss()
  {
    boolean bool = true;
    this.mWasDismissed = bool;
    this.mMenu.close();
    Object localObject1 = this.mTreeObserver;
    if (localObject1 != null)
    {
      localObject1 = this.mTreeObserver;
      bool = ((ViewTreeObserver)localObject1).isAlive();
      if (!bool)
      {
        localObject1 = this.mShownAnchorView.getViewTreeObserver();
        this.mTreeObserver = ((ViewTreeObserver)localObject1);
      }
      localObject1 = this.mTreeObserver;
      localObject2 = this.mGlobalLayoutListener;
      ((ViewTreeObserver)localObject1).removeGlobalOnLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)localObject2);
      bool = false;
      localObject1 = null;
      this.mTreeObserver = null;
    }
    localObject1 = this.mShownAnchorView;
    Object localObject2 = this.mAttachStateChangeListener;
    ((View)localObject1).removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)localObject2);
    localObject1 = this.mOnDismissListener;
    if (localObject1 != null)
    {
      localObject1 = this.mOnDismissListener;
      ((PopupWindow.OnDismissListener)localObject1).onDismiss();
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
    boolean bool1 = paramSubMenuBuilder.hasVisibleItems();
    Object localObject1;
    if (bool1)
    {
      localObject1 = new android/support/v7/view/menu/MenuPopupHelper;
      Object localObject2 = this.mContext;
      View localView = this.mShownAnchorView;
      boolean bool2 = this.mOverflowOnly;
      int i = this.mPopupStyleAttr;
      int j = this.mPopupStyleRes;
      Object localObject3 = paramSubMenuBuilder;
      ((MenuPopupHelper)localObject1).<init>((Context)localObject2, paramSubMenuBuilder, localView, bool2, i, j);
      localObject2 = this.mPresenterCallback;
      ((MenuPopupHelper)localObject1).setPresenterCallback((MenuPresenter.Callback)localObject2);
      boolean bool3 = MenuPopup.shouldPreserveIconSpacing(paramSubMenuBuilder);
      ((MenuPopupHelper)localObject1).setForceShowIcon(bool3);
      int k = this.mDropDownGravity;
      ((MenuPopupHelper)localObject1).setGravity(k);
      localObject2 = this.mOnDismissListener;
      ((MenuPopupHelper)localObject1).setOnDismissListener((PopupWindow.OnDismissListener)localObject2);
      this.mOnDismissListener = null;
      this.mMenu.close(false);
      localObject2 = this.mPopup;
      k = ((MenuPopupWindow)localObject2).getHorizontalOffset();
      localObject3 = this.mPopup;
      int m = ((MenuPopupWindow)localObject3).getVerticalOffset();
      bool1 = ((MenuPopupHelper)localObject1).tryShow(k, m);
      if (bool1)
      {
        localObject1 = this.mPresenterCallback;
        if (localObject1 != null)
        {
          localObject1 = this.mPresenterCallback;
          ((MenuPresenter.Callback)localObject1).onOpenSubMenu(paramSubMenuBuilder);
        }
        bool1 = true;
      }
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localObject1 = null;
    }
  }
  
  public void setAnchorView(View paramView)
  {
    this.mAnchorView = paramView;
  }
  
  public void setCallback(MenuPresenter.Callback paramCallback)
  {
    this.mPresenterCallback = paramCallback;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.mAdapter.setForceShowIcon(paramBoolean);
  }
  
  public void setGravity(int paramInt)
  {
    this.mDropDownGravity = paramInt;
  }
  
  public void setHorizontalOffset(int paramInt)
  {
    this.mPopup.setHorizontalOffset(paramInt);
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
    this.mPopup.setVerticalOffset(paramInt);
  }
  
  public void show()
  {
    boolean bool = tryShow();
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("StandardMenuPopup cannot be used without an anchor");
      throw localIllegalStateException;
    }
  }
  
  public void updateMenuView(boolean paramBoolean)
  {
    this.mHasContentWidth = false;
    MenuAdapter localMenuAdapter = this.mAdapter;
    if (localMenuAdapter != null)
    {
      localMenuAdapter = this.mAdapter;
      localMenuAdapter.notifyDataSetChanged();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\StandardMenuPopup.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */