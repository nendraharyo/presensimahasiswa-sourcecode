package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.os.Build.VERSION;
import android.util.Property;

class h
{
  private static final k a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/transition/j;
      ((j)localObject).<init>();
    }
    for (a = (k)localObject;; a = (k)localObject)
    {
      return;
      localObject = new android/support/transition/i;
      ((i)localObject).<init>();
    }
  }
  
  static ObjectAnimator a(Object paramObject, Property paramProperty, Path paramPath)
  {
    return a.a(paramObject, paramProperty, paramPath);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\h.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */