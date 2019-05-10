package android.support.v4.app;

import android.os.Bundle;
import android.widget.RemoteViews;

public abstract class w$d
{
  protected w.c a;
  CharSequence b;
  CharSequence c;
  boolean d = false;
  
  public void a(Bundle paramBundle) {}
  
  public void a(v paramv) {}
  
  public void a(w.c paramc)
  {
    w.c localc = this.a;
    if (localc != paramc)
    {
      this.a = paramc;
      localc = this.a;
      if (localc != null)
      {
        localc = this.a;
        localc.a(this);
      }
    }
  }
  
  public RemoteViews b(v paramv)
  {
    return null;
  }
  
  public RemoteViews c(v paramv)
  {
    return null;
  }
  
  public RemoteViews d(v paramv)
  {
    return null;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\w$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */