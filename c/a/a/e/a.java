package c.a.a.e;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class a
{
  private Bitmap a;
  private Canvas b;
  
  public a(Bitmap paramBitmap, Canvas paramCanvas)
  {
    this.a = paramBitmap;
    this.b = paramCanvas;
  }
  
  public Canvas a()
  {
    Canvas localCanvas = this.b;
    if (localCanvas == null)
    {
      localCanvas = new android/graphics/Canvas;
      Bitmap localBitmap = this.a;
      localCanvas.<init>(localBitmap);
      this.b = localCanvas;
    }
    return this.b;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\c\a\a\e\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */