package android.support.v4.c.a;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;

class a$b
  extends a
{
  private final DisplayManager a;
  
  a$b(Context paramContext)
  {
    DisplayManager localDisplayManager = (DisplayManager)paramContext.getSystemService("display");
    this.a = localDisplayManager;
  }
  
  public Display a(int paramInt)
  {
    return this.a.getDisplay(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\c\a\a$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */