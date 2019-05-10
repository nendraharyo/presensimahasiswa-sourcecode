package android.support.v7.widget;

import android.database.DataSetObserver;

class ActivityChooserView$1
  extends DataSetObserver
{
  ActivityChooserView$1(ActivityChooserView paramActivityChooserView) {}
  
  public void onChanged()
  {
    super.onChanged();
    this.this$0.mAdapter.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    super.onInvalidated();
    this.this$0.mAdapter.notifyDataSetInvalidated();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\ActivityChooserView$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */