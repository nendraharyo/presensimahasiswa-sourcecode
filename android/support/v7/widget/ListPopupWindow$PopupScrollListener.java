package android.support.v7.widget;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.PopupWindow;

class ListPopupWindow$PopupScrollListener
  implements AbsListView.OnScrollListener
{
  ListPopupWindow$PopupScrollListener(ListPopupWindow paramListPopupWindow) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    int i = 1;
    if (paramInt == i)
    {
      Object localObject = this.this$0;
      boolean bool = ((ListPopupWindow)localObject).isInputMethodNotNeeded();
      if (!bool)
      {
        localObject = this.this$0.mPopup.getContentView();
        if (localObject != null)
        {
          localObject = this.this$0.mHandler;
          ListPopupWindow.ResizePopupRunnable localResizePopupRunnable = this.this$0.mResizePopupRunnable;
          ((Handler)localObject).removeCallbacks(localResizePopupRunnable);
          localObject = this.this$0.mResizePopupRunnable;
          ((ListPopupWindow.ResizePopupRunnable)localObject).run();
        }
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow$PopupScrollListener.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */