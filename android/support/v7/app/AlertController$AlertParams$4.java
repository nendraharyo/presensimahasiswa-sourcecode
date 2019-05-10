package android.support.v7.app;

import android.content.DialogInterface;
import android.content.DialogInterface.OnMultiChoiceClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

class AlertController$AlertParams$4
  implements AdapterView.OnItemClickListener
{
  AlertController$AlertParams$4(AlertController.AlertParams paramAlertParams, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    Object localObject1 = this.this$0.mCheckedItems;
    if (localObject1 != null)
    {
      localObject1 = this.this$0.mCheckedItems;
      localObject2 = this.val$listView;
      boolean bool1 = ((AlertController.RecycleListView)localObject2).isItemChecked(paramInt);
      localObject1[paramInt] = bool1;
    }
    localObject1 = this.this$0.mOnCheckboxClickListener;
    Object localObject2 = this.val$dialog.mDialog;
    boolean bool2 = this.val$listView.isItemChecked(paramInt);
    ((DialogInterface.OnMultiChoiceClickListener)localObject1).onClick((DialogInterface)localObject2, paramInt, bool2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$AlertParams$4.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */