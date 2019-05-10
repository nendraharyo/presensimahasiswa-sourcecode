package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;

class AppCompatSpinner$DropdownPopup$1
  implements AdapterView.OnItemClickListener
{
  AppCompatSpinner$DropdownPopup$1(AppCompatSpinner.DropdownPopup paramDropdownPopup, AppCompatSpinner paramAppCompatSpinner) {}
  
  public void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.this$1.this$0.setSelection(paramInt);
    Object localObject = this.this$1.this$0.getOnItemClickListener();
    if (localObject != null)
    {
      localObject = this.this$1.this$0;
      ListAdapter localListAdapter = this.this$1.mAdapter;
      long l = localListAdapter.getItemId(paramInt);
      ((AppCompatSpinner)localObject).performItemClick(paramView, paramInt, l);
    }
    this.this$1.dismiss();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\AppCompatSpinner$DropdownPopup$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */