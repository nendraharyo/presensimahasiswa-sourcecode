package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup.MarginLayoutParams;

public final class f
{
  public static int a(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j) {}
    for (i = paramMarginLayoutParams.getMarginStart();; i = paramMarginLayoutParams.leftMargin) {
      return i;
    }
  }
  
  public static int b(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    int i = Build.VERSION.SDK_INT;
    int j = 17;
    if (i >= j) {}
    for (i = paramMarginLayoutParams.getMarginEnd();; i = paramMarginLayoutParams.rightMargin) {
      return i;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */