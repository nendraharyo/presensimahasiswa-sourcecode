package android.support.v7.widget;

import android.database.DataSetObserver;

class ListPopupWindow$PopupDataSetObserver
  extends DataSetObserver
{
  ListPopupWindow$PopupDataSetObserver(ListPopupWindow paramListPopupWindow) {}
  
  public void onChanged()
  {
    ListPopupWindow localListPopupWindow = this.this$0;
    boolean bool = localListPopupWindow.isShowing();
    if (bool)
    {
      localListPopupWindow = this.this$0;
      localListPopupWindow.show();
    }
  }
  
  public void onInvalidated()
  {
    this.this$0.dismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow$PopupDataSetObserver.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */