package android.support.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

class af
{
  private static final ai a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 18;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/transition/ah;
      ((ah)localObject).<init>();
    }
    for (a = (ai)localObject;; a = (ai)localObject)
    {
      return;
      localObject = new android/support/transition/ag;
      ((ag)localObject).<init>();
    }
  }
  
  static ae a(ViewGroup paramViewGroup)
  {
    return a.a(paramViewGroup);
  }
  
  static void a(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    a.a(paramViewGroup, paramBoolean);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\af.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */