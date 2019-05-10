package android.support.v7.view.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.support.v7.appcompat.R.layout;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ListAdapter;

class MenuDialogHelper
  implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener, DialogInterface.OnKeyListener, MenuPresenter.Callback
{
  private AlertDialog mDialog;
  private MenuBuilder mMenu;
  ListMenuPresenter mPresenter;
  private MenuPresenter.Callback mPresenterCallback;
  
  public MenuDialogHelper(MenuBuilder paramMenuBuilder)
  {
    this.mMenu = paramMenuBuilder;
  }
  
  public void dismiss()
  {
    AlertDialog localAlertDialog = this.mDialog;
    if (localAlertDialog != null)
    {
      localAlertDialog = this.mDialog;
      localAlertDialog.dismiss();
    }
  }
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    MenuBuilder localMenuBuilder = this.mMenu;
    MenuItemImpl localMenuItemImpl = (MenuItemImpl)this.mPresenter.getAdapter().getItem(paramInt);
    localMenuBuilder.performItemAction(localMenuItemImpl, 0);
  }
  
  public void onCloseMenu(MenuBuilder paramMenuBuilder, boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      localObject = this.mMenu;
      if (paramMenuBuilder != localObject) {}
    }
    else
    {
      dismiss();
    }
    Object localObject = this.mPresenterCallback;
    if (localObject != null)
    {
      localObject = this.mPresenterCallback;
      ((MenuPresenter.Callback)localObject).onCloseMenu(paramMenuBuilder, paramBoolean);
    }
  }
  
  public void onDismiss(DialogInterface paramDialogInterface)
  {
    ListMenuPresenter localListMenuPresenter = this.mPresenter;
    MenuBuilder localMenuBuilder = this.mMenu;
    localListMenuPresenter.onCloseMenu(localMenuBuilder, true);
  }
  
  public boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    int i = 1;
    int j = 82;
    Object localObject;
    if (paramInt != j)
    {
      j = 4;
      if (paramInt != j) {}
    }
    else
    {
      j = paramKeyEvent.getAction();
      if (j == 0)
      {
        j = paramKeyEvent.getRepeatCount();
        if (j == 0)
        {
          localObject = this.mDialog.getWindow();
          if (localObject == null) {
            break label189;
          }
          localObject = ((Window)localObject).getDecorView();
          if (localObject == null) {
            break label189;
          }
          localObject = ((View)localObject).getKeyDispatcherState();
          if (localObject == null) {
            break label189;
          }
          ((KeyEvent.DispatcherState)localObject).startTracking(paramKeyEvent, this);
        }
      }
    }
    for (;;)
    {
      return i;
      j = paramKeyEvent.getAction();
      if (j == i)
      {
        bool = paramKeyEvent.isCanceled();
        if (!bool)
        {
          localObject = this.mDialog.getWindow();
          if (localObject != null)
          {
            localObject = ((Window)localObject).getDecorView();
            if (localObject != null)
            {
              localObject = ((View)localObject).getKeyDispatcherState();
              if (localObject != null)
              {
                bool = ((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent);
                if (bool)
                {
                  localObject = this.mMenu;
                  ((MenuBuilder)localObject).close(i);
                  paramDialogInterface.dismiss();
                  continue;
                }
              }
            }
          }
        }
      }
      label189:
      MenuBuilder localMenuBuilder = this.mMenu;
      boolean bool = false;
      localObject = null;
      i = localMenuBuilder.performShortcut(paramInt, paramKeyEvent, 0);
    }
  }
  
  public boolean onOpenSubMenu(MenuBuilder paramMenuBuilder)
  {
    MenuPresenter.Callback localCallback = this.mPresenterCallback;
    boolean bool;
    if (localCallback != null)
    {
      localCallback = this.mPresenterCallback;
      bool = localCallback.onOpenSubMenu(paramMenuBuilder);
    }
    for (;;)
    {
      return bool;
      bool = false;
      localCallback = null;
    }
  }
  
  public void setPresenterCallback(MenuPresenter.Callback paramCallback)
  {
    this.mPresenterCallback = paramCallback;
  }
  
  public void show(IBinder paramIBinder)
  {
    Object localObject1 = this.mMenu;
    AlertDialog.Builder localBuilder = new android/support/v7/app/AlertDialog$Builder;
    Object localObject2 = ((MenuBuilder)localObject1).getContext();
    localBuilder.<init>((Context)localObject2);
    localObject2 = new android/support/v7/view/menu/ListMenuPresenter;
    Object localObject3 = localBuilder.getContext();
    int i = R.layout.abc_list_menu_item_layout;
    ((ListMenuPresenter)localObject2).<init>((Context)localObject3, i);
    this.mPresenter = ((ListMenuPresenter)localObject2);
    this.mPresenter.setCallback(this);
    localObject2 = this.mMenu;
    localObject3 = this.mPresenter;
    ((MenuBuilder)localObject2).addMenuPresenter((MenuPresenter)localObject3);
    localObject2 = this.mPresenter.getAdapter();
    localBuilder.setAdapter((ListAdapter)localObject2, this);
    localObject2 = ((MenuBuilder)localObject1).getHeaderView();
    if (localObject2 != null) {
      localBuilder.setCustomTitle((View)localObject2);
    }
    for (;;)
    {
      localBuilder.setOnKeyListener(this);
      localObject1 = localBuilder.create();
      this.mDialog = ((AlertDialog)localObject1);
      this.mDialog.setOnDismissListener(this);
      localObject1 = this.mDialog.getWindow().getAttributes();
      int j = 1003;
      ((WindowManager.LayoutParams)localObject1).type = j;
      if (paramIBinder != null) {
        ((WindowManager.LayoutParams)localObject1).token = paramIBinder;
      }
      j = ((WindowManager.LayoutParams)localObject1).flags | 0x20000;
      ((WindowManager.LayoutParams)localObject1).flags = j;
      this.mDialog.show();
      return;
      localObject2 = ((MenuBuilder)localObject1).getHeaderIcon();
      localObject2 = localBuilder.setIcon((Drawable)localObject2);
      localObject1 = ((MenuBuilder)localObject1).getHeaderTitle();
      ((AlertDialog.Builder)localObject2).setTitle((CharSequence)localObject1);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\MenuDialogHelper.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */