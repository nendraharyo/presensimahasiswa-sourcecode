package android.support.transition;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

final class f$1
  extends Property
{
  private Rect a;
  
  f$1(Class paramClass, String paramString)
  {
    super(paramClass, paramString);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.a = localRect;
  }
  
  public PointF a(Drawable paramDrawable)
  {
    Object localObject = this.a;
    paramDrawable.copyBounds((Rect)localObject);
    localObject = new android/graphics/PointF;
    float f1 = this.a.left;
    float f2 = this.a.top;
    ((PointF)localObject).<init>(f1, f2);
    return (PointF)localObject;
  }
  
  public void a(Drawable paramDrawable, PointF paramPointF)
  {
    Rect localRect = this.a;
    paramDrawable.copyBounds(localRect);
    localRect = this.a;
    int i = Math.round(paramPointF.x);
    int j = Math.round(paramPointF.y);
    localRect.offsetTo(i, j);
    localRect = this.a;
    paramDrawable.setBounds(localRect);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */