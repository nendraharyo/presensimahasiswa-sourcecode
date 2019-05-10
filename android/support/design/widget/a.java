package android.support.design.widget;

import android.support.v4.view.b.b;
import android.support.v4.view.b.c;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

class a
{
  static final Interpolator a;
  static final Interpolator b;
  static final Interpolator c;
  static final Interpolator d;
  static final Interpolator e;
  
  static
  {
    Object localObject = new android/view/animation/LinearInterpolator;
    ((LinearInterpolator)localObject).<init>();
    a = (Interpolator)localObject;
    localObject = new android/support/v4/view/b/b;
    ((b)localObject).<init>();
    b = (Interpolator)localObject;
    localObject = new android/support/v4/view/b/a;
    ((android.support.v4.view.b.a)localObject).<init>();
    c = (Interpolator)localObject;
    localObject = new android/support/v4/view/b/c;
    ((c)localObject).<init>();
    d = (Interpolator)localObject;
    localObject = new android/view/animation/DecelerateInterpolator;
    ((DecelerateInterpolator)localObject).<init>();
    e = (Interpolator)localObject;
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat2 - paramFloat1) * paramFloat3 + paramFloat1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */