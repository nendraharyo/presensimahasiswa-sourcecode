package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;

public abstract class t
  extends a
{
  protected d a;
  protected g b;
  protected int c;
  protected int d;
  
  public t(d paramd, g paramg)
  {
    this.c = i;
    this.d = i;
    this.a = paramd;
    this.b = paramg;
  }
  
  public int a(int paramInt)
  {
    return 10;
  }
  
  public g a()
  {
    return this.b;
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, Paint paramPaint)
  {
    Object localObject = this.b;
    boolean bool = ((g)localObject).k();
    if (bool)
    {
      int i = this.b.h();
      paramPaint.setColor(i);
      localObject = Paint.Align.CENTER;
      paramPaint.setTextAlign((Paint.Align)localObject);
      float f1 = this.b.b();
      paramPaint.setTextSize(f1);
      String str = this.b.a();
      i = paramInt3 / 2 + paramInt1;
      float f2 = i;
      f1 = paramInt2;
      float f3 = this.b.b();
      float f4 = f1 + f3;
      localObject = this;
      a(paramCanvas, str, f2, f4, paramPaint);
    }
  }
  
  public void a(Canvas paramCanvas, w paramw, float paramFloat1, float paramFloat2, int paramInt, Paint paramPaint)
  {
    float f1 = 5.0F;
    float f2 = paramFloat2 - f1;
    float f3 = paramFloat1 + 10.0F;
    float f4 = paramFloat2 + f1;
    f1 = paramFloat1;
    paramCanvas.drawRect(paramFloat1, f2, f3, f4, paramPaint);
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void c(int paramInt)
  {
    this.d = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\t.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */