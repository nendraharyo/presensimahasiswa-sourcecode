package android.support.v7.app;

import android.support.v4.widget.NestedScrollView;
import android.view.View;

class AlertController$3
  implements Runnable
{
  AlertController$3(AlertController paramAlertController, View paramView1, View paramView2) {}
  
  public void run()
  {
    NestedScrollView localNestedScrollView = this.this$0.mScrollView;
    View localView1 = this.val$top;
    View localView2 = this.val$bottom;
    AlertController.manageScrollIndicators(localNestedScrollView, localView1, localView2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */