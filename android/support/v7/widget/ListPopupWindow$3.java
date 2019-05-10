package android.support.v7.widget;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

class ListPopupWindow$3
  implements AdapterView.OnItemSelectedListener
{
  ListPopupWindow$3(ListPopupWindow paramListPopupWindow) {}
  
  public void onItemSelected(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    int i = -1;
    if (paramInt != i)
    {
      DropDownListView localDropDownListView = this.this$0.mDropDownList;
      if (localDropDownListView != null) {
        localDropDownListView.setListSelectionHidden(false);
      }
    }
  }
  
  public void onNothingSelected(AdapterView paramAdapterView) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ListPopupWindow$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */