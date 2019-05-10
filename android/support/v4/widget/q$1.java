package android.support.v4.widget;

import android.view.animation.Interpolator;

final class q$1
  implements Interpolator
{
  public float getInterpolation(float paramFloat)
  {
    float f1 = 1.0F;
    float f2 = paramFloat - f1;
    float f3 = f2 * f2 * f2 * f2;
    return f2 * f3 + f1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\q$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */