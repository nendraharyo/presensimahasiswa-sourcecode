package android.support.c.a;

import android.animation.TypeEvaluator;
import android.support.v4.b.b;
import android.support.v4.b.b.b;

class e$a
  implements TypeEvaluator
{
  private b.b[] a;
  
  public b.b[] a(float paramFloat, b.b[] paramArrayOfb1, b.b[] paramArrayOfb2)
  {
    int i = b.a(paramArrayOfb1, paramArrayOfb2);
    if (i == 0)
    {
      localObject = new java/lang/IllegalArgumentException;
      ((IllegalArgumentException)localObject).<init>("Can't interpolate between two incompatible pathData");
      throw ((Throwable)localObject);
    }
    Object localObject = this.a;
    if (localObject != null)
    {
      localObject = this.a;
      i = b.a((b.b[])localObject, paramArrayOfb1);
      if (i != 0) {}
    }
    else
    {
      localObject = b.a(paramArrayOfb1);
      this.a = ((b.b[])localObject);
    }
    i = 0;
    localObject = null;
    for (;;)
    {
      int k = paramArrayOfb1.length;
      if (i >= k) {
        break;
      }
      b.b localb1 = this.a[i];
      b.b localb2 = paramArrayOfb1[i];
      b.b localb3 = paramArrayOfb2[i];
      localb1.a(localb2, localb3, paramFloat);
      int j;
      i += 1;
    }
    return this.a;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\e$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */