package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.d;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.dimen;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class MenuPopupHelper
  implements MenuHelper
{
  private static final int TOUCH_EPICENTER_SIZE_DP = 48;
  private View mAnchorView;
  private final Context mContext;
  private int mDropDownGravity = 8388611;
  private boolean mForceShowIcon;
  private final PopupWindow.OnDismissListener mInternalOnDismissListener;
  private final MenuBuilder mMenu;
  private PopupWindow.OnDismissListener mOnDismissListener;
  private final boolean mOverflowOnly;
  private MenuPopup mPopup;
  private final int mPopupStyleAttr;
  private final int mPopupStyleRes;
  private MenuPresenter.Callback mPresenterCallback;
  
  public MenuPopupHelper(Context paramContext, MenuBuilder paramMenuBuilder)
  {
    this(paramContext, paramMenuBuilder, null, false, i, 0);
  }
  
  public MenuPopupHelper(Context paramContext, MenuBuilder paramMenuBuilder, View paramView)
  {
    this(paramContext, paramMenuBuilder, paramView, false, i, 0);
  }
  
  public MenuPopupHelper(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean, int paramInt)
  {
    this(paramContext, paramMenuBuilder, paramView, paramBoolean, paramInt, 0);
  }
  
  public MenuPopupHelper(Context paramContext, MenuBuilder paramMenuBuilder, View paramView, boolean paramBoolean, int paramInt1, int paramInt2)
  {
    MenuPopupHelper.1 local1 = new android/support/v7/view/menu/MenuPopupHelper$1;
    local1.<init>(this);
    this.mInternalOnDismissListener = local1;
    this.mContext = paramContext;
    this.mMenu = paramMenuBuilder;
    this.mAnchorView = paramView;
    this.mOverflowOnly = paramBoolean;
    this.mPopupStyleAttr = paramInt1;
    this.mPopupStyleRes = paramInt2;
  }
  
  private MenuPopup createPopup()
  {
    Object localObject1 = ((WindowManager)this.mContext.getSystemService("window")).getDefaultDisplay();
    Object localObject2 = new android/graphics/Point;
    ((Point)localObject2).<init>();
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    int k;
    label95:
    Object localObject3;
    int i1;
    if (i >= j)
    {
      ((Display)localObject1).getRealSize((Point)localObject2);
      k = ((Point)localObject2).x;
      int m = ((Point)localObject2).y;
      k = Math.min(k, m);
      localObject2 = this.mContext.getResources();
      i = R.dimen.abc_cascading_menus_min_smallest_width;
      m = ((Resources)localObject2).getDimensionPixelSize(i);
      if (k < m) {
        break label220;
      }
      k = 1;
      if (k == 0) {
        break label228;
      }
      localObject1 = new android/support/v7/view/menu/CascadingMenuPopup;
      localObject2 = this.mContext;
      localObject3 = this.mAnchorView;
      j = this.mPopupStyleAttr;
      i1 = this.mPopupStyleRes;
      boolean bool2 = this.mOverflowOnly;
      ((CascadingMenuPopup)localObject1).<init>((Context)localObject2, (View)localObject3, j, i1, bool2);
    }
    for (;;)
    {
      localObject2 = this.mMenu;
      ((MenuPopup)localObject1).addMenu((MenuBuilder)localObject2);
      localObject2 = this.mInternalOnDismissListener;
      ((MenuPopup)localObject1).setOnDismissListener((PopupWindow.OnDismissListener)localObject2);
      localObject2 = this.mAnchorView;
      ((MenuPopup)localObject1).setAnchorView((View)localObject2);
      localObject2 = this.mPresenterCallback;
      ((MenuPopup)localObject1).setCallback((MenuPresenter.Callback)localObject2);
      boolean bool1 = this.mForceShowIcon;
      ((MenuPopup)localObject1).setForceShowIcon(bool1);
      int n = this.mDropDownGravity;
      ((MenuPopup)localObject1).setGravity(n);
      return (MenuPopup)localObject1;
      ((Display)localObject1).getSize((Point)localObject2);
      break;
      label220:
      k = 0;
      localObject1 = null;
      break label95;
      label228:
      localObject1 = new android/support/v7/view/menu/StandardMenuPopup;
      localObject2 = this.mContext;
      localObject3 = this.mMenu;
      View localView = this.mAnchorView;
      i1 = this.mPopupStyleAttr;
      int i2 = this.mPopupStyleRes;
      boolean bool3 = this.mOverflowOnly;
      ((StandardMenuPopup)localObject1).<init>((Context)localObject2, (MenuBuilder)localObject3, localView, i1, i2, bool3);
    }
  }
  
  private void showPopup(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    MenuPopup localMenuPopup = getPopup();
    localMenuPopup.setShowTitle(paramBoolean2);
    if (paramBoolean1)
    {
      int i = this.mDropDownGravity;
      Object localObject1 = this.mAnchorView;
      int j = r.e((View)localObject1);
      i = d.a(i, j) & 0x7;
      j = 5;
      float f1 = 7.0E-45F;
      if (i == j)
      {
        localObject2 = this.mAnchorView;
        i = ((View)localObject2).getWidth();
        paramInt1 += i;
      }
      localMenuPopup.setHorizontalOffset(paramInt1);
      localMenuPopup.setVerticalOffset(paramInt2);
      Object localObject2 = this.mContext.getResources().getDisplayMetrics();
      float f2 = ((DisplayMetrics)localObject2).density * 48.0F;
      j = 1073741824;
      f1 = 2.0F;
      f2 /= f1;
      i = (int)f2;
      localObject1 = new android/graphics/Rect;
      int k = paramInt1 - i;
      int m = paramInt2 - i;
      int n = paramInt1 + i;
      i += paramInt2;
      ((Rect)localObject1).<init>(k, m, n, i);
      localMenuPopup.setEpicenterBounds((Rect)localObject1);
    }
    localMenuPopup.show();
  }
  
  public void dismiss()
  {
    boolean bool = isShowing();
    if (bool)
    {
      MenuPopup localMenuPopup = this.mPopup;
      localMenuPopup.dismiss();
    }
  }
  
  public int getGravity()
  {
    return this.mDropDownGravity;
  }
  
  public ListView getListView()
  {
    return getPopup().getListView();
  }
  
  public MenuPopup getPopup()
  {
    MenuPopup localMenuPopup = this.mPopup;
    if (localMenuPopup == null)
    {
      localMenuPopup = createPopup();
      this.mPopup = localMenuPopup;
    }
    return this.mPopup;
  }
  
  public boolean isShowing()
  {
    MenuPopup localMenuPopup = this.mPopup;
    boolean bool;
    if (localMenuPopup != null)
    {
      localMenuPopup = this.mPopup;
      bool = localMenuPopup.isShowing();
      if (bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localMenuPopup = null;
    }
  }
  
  protected void onDismiss()
  {
    this.mPopup = null;
    PopupWindow.OnDismissListener localOnDismissListener = this.mOnDismissListener;
    if (localOnDismissListener != null)
    {
      localOnDismissListener = this.mOnDismissListener;
      localOnDismissListener.onDismiss();
    }
  }
  
  public void setAnchorView(View paramView)
  {
    this.mAnchorView = paramView;
  }
  
  public void setForceShowIcon(boolean paramBoolean)
  {
    this.mForceShowIcon = paramBoolean;
    MenuPopup localMenuPopup = this.mPopup;
    if (localMenuPopup != null)
    {
      localMenuPopup = this.mPopup;
      localMenuPopup.setForceShowIcon(paramBoolean);
    }
  }
  
  public void setGravity(int paramInt)
  {
    this.mDropDownGravity = paramInt;
  }
  
  public void setOnDismissListener(PopupWindow.OnDismissListener paramOnDismissListener)
  {
    this.mOnDismissListener = paramOnDismissListener;
  }
  
  public void setPresenterCallback(MenuPresenter.Callback paramCallback)
  {
    this.mPresenterCallback = paramCallback;
    MenuPopup localMenuPopup = this.mPopup;
    if (localMenuPopup != null)
    {
      localMenuPopup = this.mPopup;
      localMenuPopup.setCallback(paramCallback);
    }
  }
  
  public void show()
  {
    boolean bool = tryShow();
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("MenuPopupHelper cannot be used without an anchor");
      throw localIllegalStateException;
    }
  }
  
  public void show(int paramInt1, int paramInt2)
  {
    boolean bool = tryShow(paramInt1, paramInt2);
    if (!bool)
    {
      IllegalStateException localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("MenuPopupHelper cannot be used without an anchor");
      throw localIllegalStateException;
    }
  }
  
  public boolean tryShow()
  {
    boolean bool1 = true;
    boolean bool2 = isShowing();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      View localView = this.mAnchorView;
      if (localView == null) {
        bool1 = false;
      } else {
        showPopup(0, 0, false, false);
      }
    }
  }
  
  public boolean tryShow(int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    boolean bool2 = isShowing();
    if (bool2) {}
    for (;;)
    {
      return bool1;
      View localView = this.mAnchorView;
      if (localView == null) {
        bool1 = false;
      } else {
        showPopup(paramInt1, paramInt2, bool1, bool1);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuPopupHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */