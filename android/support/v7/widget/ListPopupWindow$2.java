package android.support.v7.widget;

import android.view.View;

class ListPopupWindow$2
  implements Runnable
{
  ListPopupWindow$2(ListPopupWindow paramListPopupWindow) {}
  
  public void run()
  {
    Object localObject = this.this$0.getAnchorView();
    if (localObject != null)
    {
      localObject = ((View)localObject).getWindowToken();
      if (localObject != null)
      {
        localObject = this.this$0;
        ((ListPopupWindow)localObject).show();
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */