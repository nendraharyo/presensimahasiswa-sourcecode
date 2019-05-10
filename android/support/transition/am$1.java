package android.support.transition;

import android.util.Property;
import android.view.View;

final class am$1
  extends Property
{
  am$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float a(View paramView)
  {
    return Float.valueOf(am.c(paramView));
  }
  
  public void a(View paramView, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    am.a(paramView, f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\am$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */