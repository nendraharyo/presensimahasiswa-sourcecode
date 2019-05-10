package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuBuilder.Callback;
import android.support.v7.view.menu.MenuPopupHelper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ListView;
import android.widget.PopupWindow.OnDismissListener;

public class PopupMenu
{
  private final View mAnchor;
  private final Context mContext;
  private View.OnTouchListener mDragListener;
  private final MenuBuilder mMenu;
  PopupMenu.OnMenuItemClickListener mMenuItemClickListener;
  PopupMenu.OnDismissListener mOnDismissListener;
  final MenuPopupHelper mPopup;
  
  public PopupMenu(Context paramContext, View paramView)
  {
    this(paramContext, paramView, 0);
  }
  
  public PopupMenu(Context paramContext, View paramView, int paramInt)
  {
    this(paramContext, paramView, paramInt, i, 0);
  }
  
  public PopupMenu(Context paramContext, View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.mContext = paramContext;
    this.mAnchor = paramView;
    Object localObject1 = new android/support/v7/view/menu/MenuBuilder;
    ((MenuBuilder)localObject1).<init>(paramContext);
    this.mMenu = ((MenuBuilder)localObject1);
    localObject1 = this.mMenu;
    Object localObject2 = new android/support/v7/widget/PopupMenu$1;
    ((PopupMenu.1)localObject2).<init>(this);
    ((MenuBuilder)localObject1).setCallback((MenuBuilder.Callback)localObject2);
    localObject1 = new android/support/v7/view/menu/MenuPopupHelper;
    MenuBuilder localMenuBuilder = this.mMenu;
    localObject2 = paramContext;
    ((MenuPopupHelper)localObject1).<init>(paramContext, localMenuBuilder, paramView, false, paramInt2, paramInt3);
    this.mPopup = ((MenuPopupHelper)localObject1);
    this.mPopup.setGravity(paramInt1);
    localObject1 = this.mPopup;
    localObject2 = new android/support/v7/widget/PopupMenu$2;
    ((PopupMenu.2)localObject2).<init>(this);
    ((MenuPopupHelper)localObject1).setOnDismissListener((PopupWindow.OnDismissListener)localObject2);
  }
  
  public void dismiss()
  {
    this.mPopup.dismiss();
  }
  
  public View.OnTouchListener getDragToOpenListener()
  {
    Object localObject = this.mDragListener;
    if (localObject == null)
    {
      localObject = new android/support/v7/widget/PopupMenu$3;
      View localView = this.mAnchor;
      ((PopupMenu.3)localObject).<init>(this, localView);
      this.mDragListener = ((View.OnTouchListener)localObject);
    }
    return this.mDragListener;
  }
  
  public int getGravity()
  {
    return this.mPopup.getGravity();
  }
  
  public Menu getMenu()
  {
    return this.mMenu;
  }
  
  public MenuInflater getMenuInflater()
  {
    SupportMenuInflater localSupportMenuInflater = new android/support/v7/view/SupportMenuInflater;
    Context localContext = this.mContext;
    localSupportMenuInflater.<init>(localContext);
    return localSupportMenuInflater;
  }
  
  ListView getMenuListView()
  {
    Object localObject = this.mPopup;
    boolean bool = ((MenuPopupHelper)localObject).isShowing();
    if (!bool) {
      bool = false;
    }
    for (localObject = null;; localObject = this.mPopup.getListView()) {
      return (ListView)localObject;
    }
  }
  
  public void inflate(int paramInt)
  {
    MenuInflater localMenuInflater = getMenuInflater();
    MenuBuilder localMenuBuilder = this.mMenu;
    localMenuInflater.inflate(paramInt, localMenuBuilder);
  }
  
  public void setGravity(int paramInt)
  {
    this.mPopup.setGravity(paramInt);
  }
  
  public void setOnDismissListener(PopupMenu.OnDismissListener paramOnDismissListener)
  {
    this.mOnDismissListener = paramOnDismissListener;
  }
  
  public void setOnMenuItemClickListener(PopupMenu.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    this.mMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void show()
  {
    this.mPopup.show();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\PopupMenu.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */