package android.support.v4.c.a;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;

class a$a
  extends a
{
  private final WindowManager a;
  
  a$a(Context paramContext)
  {
    WindowManager localWindowManager = (WindowManager)paramContext.getSystemService("window");
    this.a = localWindowManager;
  }
  
  public Display a(int paramInt)
  {
    Display localDisplay = this.a.getDefaultDisplay();
    int i = localDisplay.getDisplayId();
    if (i == paramInt) {}
    for (;;)
    {
      return localDisplay;
      localDisplay = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\c\a\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */