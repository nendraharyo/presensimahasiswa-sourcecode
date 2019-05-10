package android.support.v4.widget;

import android.database.DataSetObserver;

class d$b
  extends DataSetObserver
{
  d$b(d paramd) {}
  
  public void onChanged()
  {
    this.a.mDataValid = true;
    this.a.notifyDataSetChanged();
  }
  
  public void onInvalidated()
  {
    this.a.mDataValid = false;
    this.a.notifyDataSetInvalidated();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\d$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */