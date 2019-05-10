package android.support.c.a;

import android.animation.TypeEvaluator;

public class f
  implements TypeEvaluator
{
  private static final f a;
  
  static
  {
    f localf = new android/support/c/a/f;
    localf.<init>();
    a = localf;
  }
  
  public static f a()
  {
    return a;
  }
  
  public Object evaluate(float paramFloat, Object paramObject1, Object paramObject2)
  {
    int i = ((Integer)paramObject1).intValue();
    float f1 = (i >> 24 & 0xFF) / 255.0F;
    float f2 = (i >> 16 & 0xFF) / 255.0F;
    float f3 = (i >> 8 & 0xFF) / 255.0F;
    float f4 = (i & 0xFF) / 255.0F;
    int j = ((Integer)paramObject2).intValue();
    float f5 = (j >> 24 & 0xFF) / 255.0F;
    float f6 = (j >> 16 & 0xFF) / 255.0F;
    float f7 = (j >> 8 & 0xFF) / 255.0F;
    float f8 = (j & 0xFF) / 255.0F;
    f2 = (float)Math.pow(f2, 2.2D);
    f3 = (float)Math.pow(f3, 2.2D);
    f4 = (float)Math.pow(f4, 2.2D);
    f6 = (float)Math.pow(f6, 2.2D);
    f7 = (float)Math.pow(f7, 2.2D);
    f8 = (float)Math.pow(f8, 2.2D);
    f5 = (f5 - f1) * paramFloat;
    f1 += f5;
    f5 = (f6 - f2) * paramFloat;
    f2 += f5;
    f5 = (f7 - f3) * paramFloat;
    f3 += f5;
    f8 = (f8 - f4) * paramFloat;
    f4 += f8;
    f1 *= 255.0F;
    f2 = (float)Math.pow(f2, 0.45454545454545453D) * 255.0F;
    f3 = (float)Math.pow(f3, 0.45454545454545453D) * 255.0F;
    f4 = (float)Math.pow(f4, 0.45454545454545453D) * 255.0F;
    int k = Math.round(f1) << 24;
    int m = Math.round(f2) << 16;
    k |= m;
    m = Math.round(f3) << 8;
    k |= m;
    return Integer.valueOf(Math.round(f4) | k);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */