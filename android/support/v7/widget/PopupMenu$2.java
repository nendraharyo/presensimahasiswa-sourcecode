package android.support.v7.widget;

import android.widget.PopupWindow.OnDismissListener;

class PopupMenu$2
  implements PopupWindow.OnDismissListener
{
  PopupMenu$2(PopupMenu paramPopupMenu) {}
  
  public void onDismiss()
  {
    PopupMenu.OnDismissListener localOnDismissListener = this.this$0.mOnDismissListener;
    if (localOnDismissListener != null)
    {
      localOnDismissListener = this.this$0.mOnDismissListener;
      PopupMenu localPopupMenu = this.this$0;
      localOnDismissListener.onDismiss(localPopupMenu);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\PopupMenu$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */