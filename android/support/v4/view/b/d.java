package android.support.v4.view.b;

import android.view.animation.Interpolator;

abstract class d
  implements Interpolator
{
  private final float[] a;
  private final float b;
  
  protected d(float[] paramArrayOfFloat)
  {
    this.a = paramArrayOfFloat;
    float f1 = this.a.length + -1;
    float f2 = 1.0F / f1;
    this.b = f2;
  }
  
  public float getInterpolation(float paramFloat)
  {
    int i = 1065353216;
    float f1 = 1.0F;
    int k = 0;
    float f2 = 0.0F;
    float[] arrayOfFloat1 = null;
    boolean bool2 = paramFloat < f1;
    if (!bool2) {}
    for (;;)
    {
      return f1;
      boolean bool1 = paramFloat < 0.0F;
      float[] arrayOfFloat2;
      if (!bool1)
      {
        bool1 = false;
        arrayOfFloat2 = null;
        f1 = 0.0F;
      }
      else
      {
        arrayOfFloat2 = this.a;
        int j = (int)((arrayOfFloat2.length + -1) * paramFloat);
        arrayOfFloat1 = this.a;
        k = arrayOfFloat1.length + -2;
        j = Math.min(j, k);
        f2 = j;
        float f3 = this.b;
        f2 *= f3;
        f2 = paramFloat - f2;
        f3 = this.b;
        f2 /= f3;
        float[] arrayOfFloat3 = this.a;
        f3 = arrayOfFloat3[j];
        float[] arrayOfFloat4 = this.a;
        int m = j + 1;
        float f4 = arrayOfFloat4[m];
        float[] arrayOfFloat5 = this.a;
        f1 = arrayOfFloat5[j];
        f1 = (f4 - f1) * f2 + f3;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\view\b\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */