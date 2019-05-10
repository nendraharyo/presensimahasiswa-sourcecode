package android.support.v7.view.menu;

import android.support.v7.widget.ForwardingListener;

class ActionMenuItemView$ActionMenuItemForwardingListener
  extends ForwardingListener
{
  public ActionMenuItemView$ActionMenuItemForwardingListener(ActionMenuItemView paramActionMenuItemView)
  {
    super(paramActionMenuItemView);
  }
  
  public ShowableListMenu getPopup()
  {
    Object localObject = this.this$0.mPopupCallback;
    if (localObject != null) {}
    for (localObject = this.this$0.mPopupCallback.getPopup();; localObject = null) {
      return (ShowableListMenu)localObject;
    }
  }
  
  protected boolean onForwardingStarted()
  {
    boolean bool1 = false;
    Object localObject = this.this$0.mItemInvoker;
    if (localObject != null)
    {
      localObject = this.this$0.mItemInvoker;
      MenuItemImpl localMenuItemImpl = this.this$0.mItemData;
      boolean bool2 = ((MenuBuilder.ItemInvoker)localObject).invokeItem(localMenuItemImpl);
      if (bool2)
      {
        localObject = getPopup();
        if (localObject != null)
        {
          bool2 = ((ShowableListMenu)localObject).isShowing();
          if (bool2) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\view\menu\ActionMenuItemView$ActionMenuItemForwardingListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */