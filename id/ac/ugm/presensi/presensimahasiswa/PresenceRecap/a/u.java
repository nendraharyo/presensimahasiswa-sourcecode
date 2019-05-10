package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import java.util.List;

public class u
  extends z
{
  private float d;
  
  private void a(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2)
  {
    float f1 = this.d;
    float f2 = paramFloat1 - f1;
    f1 = this.d;
    float f3 = paramFloat2 - f1;
    f1 = this.d;
    float f4 = paramFloat1 + f1;
    f1 = this.d;
    float f5 = paramFloat2 + f1;
    paramCanvas.drawLine(f2, f3, f4, f5, paramPaint);
    f1 = this.d;
    f2 = paramFloat1 + f1;
    f1 = this.d;
    f3 = paramFloat2 - f1;
    f1 = this.d;
    f4 = paramFloat1 - f1;
    f1 = this.d;
    f5 = paramFloat2 + f1;
    paramCanvas.drawLine(f2, f3, f4, f5, paramPaint);
  }
  
  private void a(Canvas paramCanvas, Paint paramPaint, float[] paramArrayOfFloat, float paramFloat1, float paramFloat2)
  {
    int i = 3;
    boolean bool = true;
    paramArrayOfFloat[0] = paramFloat1;
    float f1 = this.d;
    f1 = paramFloat2 - f1;
    float f2 = this.d / 2.0F;
    f1 -= f2;
    paramArrayOfFloat[bool] = f1;
    f2 = this.d;
    f2 = paramFloat1 - f2;
    paramArrayOfFloat[2] = f2;
    f1 = this.d + paramFloat2;
    paramArrayOfFloat[i] = f1;
    f2 = this.d + paramFloat1;
    paramArrayOfFloat[4] = f2;
    f2 = paramArrayOfFloat[i];
    paramArrayOfFloat[5] = f2;
    a(paramCanvas, paramArrayOfFloat, paramPaint, bool);
  }
  
  private void b(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2)
  {
    float f = this.d;
    paramCanvas.drawCircle(paramFloat1, paramFloat2, f, paramPaint);
  }
  
  private void b(Canvas paramCanvas, Paint paramPaint, float[] paramArrayOfFloat, float paramFloat1, float paramFloat2)
  {
    boolean bool = true;
    paramArrayOfFloat[0] = paramFloat1;
    float f1 = this.d;
    f1 = paramFloat2 - f1;
    paramArrayOfFloat[bool] = f1;
    float f2 = this.d;
    f2 = paramFloat1 - f2;
    paramArrayOfFloat[2] = f2;
    paramArrayOfFloat[3] = paramFloat2;
    paramArrayOfFloat[4] = paramFloat1;
    f2 = this.d + paramFloat2;
    paramArrayOfFloat[5] = f2;
    f2 = this.d + paramFloat1;
    paramArrayOfFloat[6] = f2;
    paramArrayOfFloat[7] = paramFloat2;
    a(paramCanvas, paramArrayOfFloat, paramPaint, bool);
  }
  
  private void c(Canvas paramCanvas, Paint paramPaint, float paramFloat1, float paramFloat2)
  {
    float f1 = this.d;
    float f2 = paramFloat1 - f1;
    f1 = this.d;
    float f3 = paramFloat2 - f1;
    f1 = this.d;
    float f4 = paramFloat1 + f1;
    f1 = this.d;
    float f5 = paramFloat2 + f1;
    paramCanvas.drawRect(f2, f3, f4, f5, paramPaint);
  }
  
  public int a(int paramInt)
  {
    return 10;
  }
  
  public void a(Canvas paramCanvas, Paint paramPaint, List paramList, ad paramad, float paramFloat, int paramInt1, int paramInt2)
  {
    int i = paramad.a();
    paramPaint.setColor(i);
    float f1 = paramPaint.getStrokeWidth();
    boolean bool = paramad.j();
    Object localObject1;
    int k;
    Object localObject2;
    int m;
    int j;
    if (bool)
    {
      localObject1 = Paint.Style.FILL;
      paramPaint.setStyle((Paint.Style)localObject1);
      k = paramList.size();
      localObject1 = u.1.a;
      localObject2 = paramad.k();
      m = ((s)localObject2).ordinal();
      j = localObject1[m];
      switch (j)
      {
      }
    }
    for (;;)
    {
      paramPaint.setStrokeWidth(f1);
      return;
      float f2 = paramad.l();
      paramPaint.setStrokeWidth(f2);
      localObject1 = Paint.Style.STROKE;
      paramPaint.setStyle((Paint.Style)localObject1);
      break;
      f2 = paramad.l();
      paramPaint.setStrokeWidth(f2);
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      m = 0;
      localObject2 = null;
      float f3;
      while (m < k)
      {
        f3 = ((Float)paramList.get(m)).floatValue();
        j = m + 1;
        localObject1 = (Float)paramList.get(j);
        f2 = ((Float)localObject1).floatValue();
        a(paramCanvas, paramPaint, f3, f2);
        j = m + 2;
        m = j;
      }
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      m = 0;
      localObject2 = null;
      while (m < k)
      {
        f3 = ((Float)paramList.get(m)).floatValue();
        j = m + 1;
        localObject1 = (Float)paramList.get(j);
        f2 = ((Float)localObject1).floatValue();
        b(paramCanvas, paramPaint, f3, f2);
        j = m + 2;
        m = j;
      }
      float[] arrayOfFloat = new float[6];
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      float f4;
      float f5;
      for (int n = 0; n < k; n = j)
      {
        f4 = ((Float)paramList.get(n)).floatValue();
        j = n + 1;
        f5 = ((Float)paramList.get(j)).floatValue();
        localObject1 = this;
        localObject2 = paramCanvas;
        a(paramCanvas, paramPaint, arrayOfFloat, f4, f5);
        j = n + 2;
      }
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      m = 0;
      localObject2 = null;
      while (m < k)
      {
        f3 = ((Float)paramList.get(m)).floatValue();
        j = m + 1;
        localObject1 = (Float)paramList.get(j);
        f2 = ((Float)localObject1).floatValue();
        c(paramCanvas, paramPaint, f3, f2);
        j = m + 2;
        m = j;
      }
      arrayOfFloat = new float[8];
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      for (n = 0; n < k; n = j)
      {
        f4 = ((Float)paramList.get(n)).floatValue();
        j = n + 1;
        f5 = ((Float)paramList.get(j)).floatValue();
        localObject1 = this;
        localObject2 = paramCanvas;
        b(paramCanvas, paramPaint, arrayOfFloat, f4, f5);
        j = n + 2;
      }
      j = 0;
      f2 = 0.0F;
      localObject1 = null;
      m = 0;
      localObject2 = null;
      while (m < k)
      {
        f3 = ((Float)paramList.get(m)).floatValue();
        j = m + 1;
        localObject1 = (Float)paramList.get(j);
        f2 = ((Float)localObject1).floatValue();
        paramCanvas.drawPoint(f3, f2, paramPaint);
        j = m + 2;
        m = j;
      }
    }
  }
  
  public void a(Canvas paramCanvas, w paramw, float paramFloat1, float paramFloat2, int paramInt, Paint paramPaint)
  {
    float f1 = 10.0F;
    Object localObject1 = paramw;
    localObject1 = (ad)paramw;
    boolean bool = ((ad)localObject1).j();
    Object localObject2;
    int i;
    if (bool)
    {
      localObject1 = Paint.Style.FILL;
      paramPaint.setStyle((Paint.Style)localObject1);
      localObject1 = u.1.a;
      paramw = (ad)paramw;
      localObject2 = paramw.k();
      int j = ((s)localObject2).ordinal();
      i = localObject1[j];
      switch (i)
      {
      }
    }
    for (;;)
    {
      return;
      localObject1 = Paint.Style.STROKE;
      paramPaint.setStyle((Paint.Style)localObject1);
      break;
      float f2 = paramFloat1 + f1;
      a(paramCanvas, paramPaint, f2, paramFloat2);
      continue;
      f2 = paramFloat1 + f1;
      b(paramCanvas, paramPaint, f2, paramFloat2);
      continue;
      i = 6;
      f2 = 8.4E-45F;
      float[] arrayOfFloat = new float[i];
      float f3 = paramFloat1 + f1;
      localObject1 = this;
      localObject2 = paramCanvas;
      a(paramCanvas, paramPaint, arrayOfFloat, f3, paramFloat2);
      continue;
      f2 = paramFloat1 + f1;
      c(paramCanvas, paramPaint, f2, paramFloat2);
      continue;
      i = 8;
      f2 = 1.1E-44F;
      arrayOfFloat = new float[i];
      f3 = paramFloat1 + f1;
      localObject1 = this;
      localObject2 = paramCanvas;
      b(paramCanvas, paramPaint, arrayOfFloat, f3, paramFloat2);
      continue;
      f2 = paramFloat1 + f1;
      paramCanvas.drawPoint(f2, paramFloat2, paramPaint);
    }
  }
  
  protected f[] a(List paramList1, List paramList2, float paramFloat, int paramInt1, int paramInt2)
  {
    int i = paramList1.size();
    f[] arrayOff = new f[i / 2];
    int j = 0;
    f localf = null;
    for (int k = 0; k < i; k = j)
    {
      int m = this.b.I();
      int n = k / 2;
      localf = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/f;
      RectF localRectF = new android/graphics/RectF;
      float f1 = ((Float)paramList1.get(k)).floatValue();
      float f2 = m;
      f2 = f1 - f2;
      int i1 = k + 1;
      f1 = ((Float)paramList1.get(i1)).floatValue();
      float f3 = m;
      f3 = f1 - f3;
      f1 = ((Float)paramList1.get(k)).floatValue();
      float f4 = m + f1;
      i1 = k + 1;
      f1 = ((Float)paramList1.get(i1)).floatValue();
      float f5 = m;
      f1 += f5;
      localRectF.<init>(f2, f3, f4, f1);
      Double localDouble1 = (Double)paramList2.get(k);
      double d1 = localDouble1.doubleValue();
      int i2 = k + 1;
      Double localDouble2 = (Double)paramList2.get(i2);
      double d2 = localDouble2.doubleValue();
      localf.<init>(localRectF, d1, d2);
      arrayOff[n] = localf;
      j = k + 2;
    }
    return arrayOff;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\\\u.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */