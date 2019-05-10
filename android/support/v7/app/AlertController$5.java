package android.support.v7.app;

import android.view.View;
import android.widget.ListView;

class AlertController$5
  implements Runnable
{
  AlertController$5(AlertController paramAlertController, View paramView1, View paramView2) {}
  
  public void run()
  {
    ListView localListView = this.this$0.mListView;
    View localView1 = this.val$top;
    View localView2 = this.val$bottom;
    AlertController.manageScrollIndicators(localListView, localView1, localView2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */