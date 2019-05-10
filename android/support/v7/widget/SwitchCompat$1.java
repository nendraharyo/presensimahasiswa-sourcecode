package android.support.v7.widget;

import android.util.Property;

final class SwitchCompat$1
  extends Property
{
  SwitchCompat$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
  }
  
  public Float get(SwitchCompat paramSwitchCompat)
  {
    return Float.valueOf(SwitchCompat.access$000(paramSwitchCompat));
  }
  
  public void set(SwitchCompat paramSwitchCompat, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    paramSwitchCompat.setThumbPosition(f);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v7\widget\SwitchCompat$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */