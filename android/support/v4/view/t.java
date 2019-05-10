package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.ViewGroup;

public final class t
{
  static final t.c a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/view/t$b;
      ((t.b)localObject).<init>();
      a = (t.c)localObject;
    }
    for (;;)
    {
      return;
      i = Build.VERSION.SDK_INT;
      j = 18;
      if (i >= j)
      {
        localObject = new android/support/v4/view/t$a;
        ((t.a)localObject).<init>();
        a = (t.c)localObject;
      }
      else
      {
        localObject = new android/support/v4/view/t$c;
        ((t.c)localObject).<init>();
        a = (t.c)localObject;
      }
    }
  }
  
  public static boolean a(ViewGroup paramViewGroup)
  {
    return a.a(paramViewGroup);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */