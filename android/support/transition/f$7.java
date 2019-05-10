package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class f$7
  extends Property
{
  f$7(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF a(View paramView)
  {
    return null;
  }
  
  public void a(View paramView, PointF paramPointF)
  {
    int i = Math.round(paramPointF.x);
    int j = Math.round(paramPointF.y);
    int k = paramView.getWidth() + i;
    int m = paramView.getHeight() + j;
    am.a(paramView, i, j, k, m);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f$7.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */