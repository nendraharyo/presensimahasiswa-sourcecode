package android.support.v7.widget;

import android.support.v4.view.r;
import android.view.View;
import android.widget.PopupWindow;

class ListPopupWindow$ResizePopupRunnable
  implements Runnable
{
  ListPopupWindow$ResizePopupRunnable(ListPopupWindow paramListPopupWindow) {}
  
  public void run()
  {
    Object localObject1 = this.this$0.mDropDownList;
    if (localObject1 != null)
    {
      localObject1 = this.this$0.mDropDownList;
      boolean bool = r.z((View)localObject1);
      if (bool)
      {
        localObject1 = this.this$0.mDropDownList;
        int i = ((DropDownListView)localObject1).getCount();
        Object localObject2 = this.this$0.mDropDownList;
        int j = ((DropDownListView)localObject2).getChildCount();
        if (i > j)
        {
          localObject1 = this.this$0.mDropDownList;
          i = ((DropDownListView)localObject1).getChildCount();
          localObject2 = this.this$0;
          j = ((ListPopupWindow)localObject2).mListItemExpandMaximum;
          if (i <= j)
          {
            localObject1 = this.this$0.mPopup;
            j = 2;
            ((PopupWindow)localObject1).setInputMethodMode(j);
            localObject1 = this.this$0;
            ((ListPopupWindow)localObject1).show();
          }
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow$ResizePopupRunnable.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */