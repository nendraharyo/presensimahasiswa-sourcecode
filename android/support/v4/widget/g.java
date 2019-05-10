package android.support.v4.widget;

import android.os.Build.VERSION;
import android.widget.EdgeEffect;

public final class g
{
  private static final g.b a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/v4/widget/g$a;
      ((g.a)localObject).<init>();
    }
    for (a = (g.b)localObject;; a = (g.b)localObject)
    {
      return;
      localObject = new android/support/v4/widget/g$b;
      ((g.b)localObject).<init>();
    }
  }
  
  public static void a(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    a.a(paramEdgeEffect, paramFloat1, paramFloat2);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */