package android.support.v4.view;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.Gravity;

public final class d
{
  public static int a(int paramInt1, int paramInt2)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j) {}
    for (i = Gravity.getAbsoluteGravity(paramInt1, paramInt2);; i = 0xFF7FFFFF & paramInt1) {
      return i;
    }
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, Rect paramRect1, Rect paramRect2, int paramInt4)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j) {
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2, paramInt4);
    }
    for (;;)
    {
      return;
      Gravity.apply(paramInt1, paramInt2, paramInt3, paramRect1, paramRect2);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */