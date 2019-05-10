package android.support.v7.app;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

class AlertController$AlertParams$1
  extends ArrayAdapter
{
  AlertController$AlertParams$1(AlertController.AlertParams paramAlertParams, Context paramContext, int paramInt1, int paramInt2, CharSequence[] paramArrayOfCharSequence, AlertController.RecycleListView paramRecycleListView)
  {
    super(paramContext, paramInt1, paramInt2, paramArrayOfCharSequence);
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    View localView = super.getView(paramInt, paramView, paramViewGroup);
    Object localObject = this.this$0.mCheckedItems;
    if (localObject != null)
    {
      localObject = this.this$0.mCheckedItems;
      int i = localObject[paramInt];
      if (i != 0)
      {
        localObject = this.val$listView;
        boolean bool = true;
        ((AlertController.RecycleListView)localObject).setItemChecked(paramInt, bool);
      }
    }
    return localView;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$AlertParams$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */