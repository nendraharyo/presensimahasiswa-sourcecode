package android.support.transition;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class m
  extends Property
{
  private final Property a;
  private final PathMeasure b;
  private final float c;
  private final float[] d;
  private final PointF e;
  private float f;
  
  m(Property paramProperty, Path paramPath)
  {
    super(Float.class, str);
    Object localObject = new float[2];
    this.d = ((float[])localObject);
    localObject = new android/graphics/PointF;
    ((PointF)localObject).<init>();
    this.e = ((PointF)localObject);
    this.a = paramProperty;
    localObject = new android/graphics/PathMeasure;
    ((PathMeasure)localObject).<init>(paramPath, false);
    this.b = ((PathMeasure)localObject);
    float f1 = this.b.getLength();
    this.c = f1;
  }
  
  public Float a(Object paramObject)
  {
    return Float.valueOf(this.f);
  }
  
  public void a(Object paramObject, Float paramFloat)
  {
    float f1 = paramFloat.floatValue();
    this.f = f1;
    Object localObject = this.b;
    float f2 = this.c;
    float f3 = paramFloat.floatValue();
    f2 *= f3;
    float[] arrayOfFloat = this.d;
    ((PathMeasure)localObject).getPosTan(f2, arrayOfFloat, null);
    localObject = this.e;
    f2 = this.d[0];
    ((PointF)localObject).x = f2;
    localObject = this.e;
    f2 = this.d[1];
    ((PointF)localObject).y = f2;
    localObject = this.a;
    PointF localPointF = this.e;
    ((Property)localObject).set(paramObject, localPointF);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\m.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */