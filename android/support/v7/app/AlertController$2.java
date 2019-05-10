package android.support.v7.app;

import android.support.v4.widget.NestedScrollView;
import android.support.v4.widget.NestedScrollView.b;
import android.view.View;

class AlertController$2
  implements NestedScrollView.b
{
  AlertController$2(AlertController paramAlertController, View paramView1, View paramView2) {}
  
  public void onScrollChange(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView1 = this.val$top;
    View localView2 = this.val$bottom;
    AlertController.manageScrollIndicators(paramNestedScrollView, localView1, localView2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */