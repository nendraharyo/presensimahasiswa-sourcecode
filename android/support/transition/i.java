package android.support.transition;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.util.Property;

class i
  implements k
{
  public ObjectAnimator a(Object paramObject, Property paramProperty, Path paramPath)
  {
    m localm = new android/support/transition/m;
    localm.<init>(paramProperty, paramPath);
    float[] arrayOfFloat = new float[2];
    float[] tmp19_17 = arrayOfFloat;
    tmp19_17[0] = 0.0F;
    tmp19_17[1] = 1.0F;
    return ObjectAnimator.ofFloat(paramObject, localm, arrayOfFloat);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\i.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */