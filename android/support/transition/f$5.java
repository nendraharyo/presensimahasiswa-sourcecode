package android.support.transition;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

final class f$5
  extends Property
{
  f$5(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public PointF a(View paramView)
  {
    return null;
  }
  
  public void a(View paramView, PointF paramPointF)
  {
    int i = paramView.getLeft();
    int j = paramView.getTop();
    int k = Math.round(paramPointF.x);
    int m = Math.round(paramPointF.y);
    am.a(paramView, i, j, k, m);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f$5.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */