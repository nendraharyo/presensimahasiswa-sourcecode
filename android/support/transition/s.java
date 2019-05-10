package android.support.transition;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class s
  implements TypeEvaluator
{
  private Rect a;
  
  public Rect a(float paramFloat, Rect paramRect1, Rect paramRect2)
  {
    int i = paramRect1.left;
    int j = paramRect2.left;
    int k = paramRect1.left;
    float f1 = (j - k) * paramFloat;
    j = (int)f1 + i;
    i = paramRect1.top;
    k = paramRect2.top;
    int m = paramRect1.top;
    float f2 = (k - m) * paramFloat;
    k = (int)f2 + i;
    i = paramRect1.right;
    m = paramRect2.right;
    int n = paramRect1.right;
    float f3 = (m - n) * paramFloat;
    m = (int)f3 + i;
    i = paramRect1.bottom;
    n = paramRect2.bottom;
    int i1 = paramRect1.bottom;
    float f4 = (n - i1) * paramFloat;
    n = (int)f4 + i;
    Rect localRect = this.a;
    if (localRect == null)
    {
      localRect = new android/graphics/Rect;
      localRect.<init>(j, k, m, n);
    }
    for (;;)
    {
      return localRect;
      this.a.set(j, k, m, n);
      localRect = this.a;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\s.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */