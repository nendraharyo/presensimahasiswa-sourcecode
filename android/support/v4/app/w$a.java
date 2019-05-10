package android.support.v4.app;

import android.app.PendingIntent;
import android.os.Bundle;

public class w$a
{
  final Bundle a;
  public int b;
  public CharSequence c;
  public PendingIntent d;
  private final aa[] e;
  private final aa[] f;
  private boolean g;
  
  public w$a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent)
  {
    this(paramInt, paramCharSequence, paramPendingIntent, localBundle, null, null, true);
  }
  
  w$a(int paramInt, CharSequence paramCharSequence, PendingIntent paramPendingIntent, Bundle paramBundle, aa[] paramArrayOfaa1, aa[] paramArrayOfaa2, boolean paramBoolean)
  {
    this.b = paramInt;
    CharSequence localCharSequence = w.c.d(paramCharSequence);
    this.c = localCharSequence;
    this.d = paramPendingIntent;
    if (paramBundle != null) {}
    for (;;)
    {
      this.a = paramBundle;
      this.e = paramArrayOfaa1;
      this.f = paramArrayOfaa2;
      this.g = paramBoolean;
      return;
      paramBundle = new android/os/Bundle;
      paramBundle.<init>();
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  public CharSequence b()
  {
    return this.c;
  }
  
  public PendingIntent c()
  {
    return this.d;
  }
  
  public Bundle d()
  {
    return this.a;
  }
  
  public boolean e()
  {
    return this.g;
  }
  
  public aa[] f()
  {
    return this.e;
  }
  
  public aa[] g()
  {
    return this.f;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\w$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */