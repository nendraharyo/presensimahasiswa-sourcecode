package android.support.v4.app;

import android.app.Notification.BigTextStyle;
import android.app.Notification.Builder;
import android.os.Build.VERSION;

public class w$b
  extends w.d
{
  private CharSequence e;
  
  public b a(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = w.c.d(paramCharSequence);
    this.e = localCharSequence;
    return this;
  }
  
  public void a(v paramv)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 16;
    if (i >= j)
    {
      Notification.BigTextStyle localBigTextStyle = new android/app/Notification$BigTextStyle;
      Object localObject = paramv.a();
      localBigTextStyle.<init>((Notification.Builder)localObject);
      localObject = this.b;
      localBigTextStyle = localBigTextStyle.setBigContentTitle((CharSequence)localObject);
      localObject = this.e;
      localBigTextStyle = localBigTextStyle.bigText((CharSequence)localObject);
      boolean bool = this.d;
      if (bool)
      {
        localObject = this.c;
        localBigTextStyle.setSummaryText((CharSequence)localObject);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\w$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */