package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.Property;

class n
{
  private static final q a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/transition/p;
      ((p)localObject).<init>();
    }
    for (a = (q)localObject;; a = (q)localObject)
    {
      return;
      localObject = new android/support/transition/o;
      ((o)localObject).<init>();
    }
  }
  
  static PropertyValuesHolder a(Property paramProperty, Path paramPath)
  {
    return a.a(paramProperty, paramPath);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\n.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */