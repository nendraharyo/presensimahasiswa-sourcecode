package android.support.transition;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.util.Property;

class o
  implements q
{
  public PropertyValuesHolder a(Property paramProperty, Path paramPath)
  {
    m localm = new android/support/transition/m;
    localm.<init>(paramProperty, paramPath);
    float[] arrayOfFloat = new float[2];
    float[] tmp17_15 = arrayOfFloat;
    tmp17_15[0] = 0.0F;
    tmp17_15[1] = 1.0F;
    return PropertyValuesHolder.ofFloat(localm, arrayOfFloat);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */