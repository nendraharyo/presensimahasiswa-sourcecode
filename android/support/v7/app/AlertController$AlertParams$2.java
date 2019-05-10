package android.support.v7.app;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;

class AlertController$AlertParams$2
  extends CursorAdapter
{
  private final int mIsCheckedIndex;
  private final int mLabelIndex;
  
  AlertController$AlertParams$2(AlertController.AlertParams paramAlertParams, Context paramContext, Cursor paramCursor, boolean paramBoolean, AlertController.RecycleListView paramRecycleListView, AlertController paramAlertController)
  {
    super(paramContext, paramCursor, paramBoolean);
    Cursor localCursor = getCursor();
    String str = this.this$0.mLabelColumn;
    int i = localCursor.getColumnIndexOrThrow(str);
    this.mLabelIndex = i;
    str = this.this$0.mIsCheckedColumn;
    int j = localCursor.getColumnIndexOrThrow(str);
    this.mIsCheckedIndex = j;
  }
  
  public void bindView(View paramView, Context paramContext, Cursor paramCursor)
  {
    int i = 1;
    CheckedTextView localCheckedTextView = (CheckedTextView)paramView.findViewById(16908308);
    int j = this.mLabelIndex;
    Object localObject = paramCursor.getString(j);
    localCheckedTextView.setText((CharSequence)localObject);
    localObject = this.val$listView;
    int k = paramCursor.getPosition();
    int m = this.mIsCheckedIndex;
    m = paramCursor.getInt(m);
    if (m == i) {
      m = i;
    }
    for (;;)
    {
      ((AlertController.RecycleListView)localObject).setItemChecked(k, m);
      return;
      int n = 0;
      localCheckedTextView = null;
    }
  }
  
  public View newView(Context paramContext, Cursor paramCursor, ViewGroup paramViewGroup)
  {
    LayoutInflater localLayoutInflater = this.this$0.mInflater;
    int i = this.val$dialog.mMultiChoiceItemLayout;
    return localLayoutInflater.inflate(i, paramViewGroup, false);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\app\AlertController$AlertParams$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */