package android.support.v4.widget;

import android.database.ContentObserver;
import android.os.Handler;

class d$a
  extends ContentObserver
{
  d$a(d paramd)
  {
    super(localHandler);
  }
  
  public boolean deliverSelfNotifications()
  {
    return true;
  }
  
  public void onChange(boolean paramBoolean)
  {
    this.a.onContentChanged();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */