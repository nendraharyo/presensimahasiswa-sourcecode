package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Align;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.Serializable;
import java.text.NumberFormat;
import java.util.List;

public abstract class a
  implements Serializable
{
  private String a(String paramString, float paramFloat, Paint paramPaint)
  {
    int i = paramString.length();
    int j = 0;
    String str;
    for (Object localObject = paramString;; localObject = str)
    {
      float f = paramPaint.measureText((String)localObject);
      boolean bool = f < paramFloat;
      if ((!bool) || (j >= i)) {
        break;
      }
      j += 1;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      int k = i - j;
      str = paramString.substring(0, k);
      localObject = ((StringBuilder)localObject).append(str);
      str = "...";
    }
    if (j == i) {
      localObject = "...";
    }
    return (String)localObject;
  }
  
  private static float[] a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt1, int paramInt2)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    float f2 = paramInt1;
    boolean bool2 = paramFloat2 < f2;
    float f3;
    float f4;
    boolean bool4;
    float[] arrayOfFloat;
    float f5;
    float f6;
    if (bool2)
    {
      f2 = paramFloat4 - paramFloat2;
      f3 = paramFloat3 - paramFloat1;
      f4 = f2 / f3;
      f2 = paramInt1 - paramFloat2;
      f3 = f4 * paramFloat1;
      f3 = (f2 + f3) / f4;
      f2 = paramInt1;
      boolean bool3 = f3 < 0.0F;
      if (bool3)
      {
        f2 = f4 * paramFloat1;
        f2 = paramFloat2 - f2;
        bool4 = false;
        arrayOfFloat = null;
        f3 = 0.0F;
      }
      for (;;)
      {
        f4 = f2;
        f5 = f3;
        f2 = paramInt1;
        bool2 = paramFloat4 < f2;
        if (!bool2) {
          break label466;
        }
        f2 = paramFloat4 - paramFloat2;
        f3 = paramFloat3 - paramFloat1;
        f6 = f2 / f3;
        f2 = paramInt1 - paramFloat2;
        f3 = f6 * paramFloat1;
        f3 = (f2 + f3) / f6;
        f2 = paramInt1;
        boolean bool5 = f3 < 0.0F;
        if (!bool5) {
          break;
        }
        f2 = f6 * paramFloat1;
        f2 = paramFloat2 - f2;
        label191:
        arrayOfFloat = new float[4];
        arrayOfFloat[0] = f5;
        arrayOfFloat[1] = f4;
        arrayOfFloat[2] = f1;
        arrayOfFloat[3] = f2;
        return arrayOfFloat;
        f5 = paramInt2;
        bool3 = f3 < f5;
        if (bool3)
        {
          f3 = paramInt2;
          f2 = paramInt2 * f4 + paramFloat2;
          f4 *= paramFloat1;
          f2 -= f4;
        }
      }
    }
    bool2 = paramFloat2 < 0.0F;
    if (bool2)
    {
      f2 = paramFloat4 - paramFloat2;
      f3 = paramFloat3 - paramFloat1;
      f4 = f2 / f3;
      f2 = -paramFloat2;
      f3 = f4 * paramFloat1;
      f2 = (f2 + f3) / f4;
      bool4 = f2 < 0.0F;
      if (bool4)
      {
        f2 = f4 * paramFloat1;
        f2 = paramFloat2 - f2;
        bool4 = false;
        arrayOfFloat = null;
        f3 = 0.0F;
      }
    }
    for (;;)
    {
      f4 = f2;
      f5 = f3;
      break;
      f3 = paramInt2;
      bool4 = f2 < f3;
      if (bool4)
      {
        f3 = paramInt2;
        f2 = paramInt2 * f4 + paramFloat2;
        f4 *= paramFloat1;
        f2 -= f4;
        continue;
        f4 = paramFloat2;
        f5 = paramFloat1;
        break;
        f1 = paramInt2;
        bool1 = f3 < f1;
        if (bool1)
        {
          f1 = paramInt2;
          f2 = paramInt2 * f6 + paramFloat2;
          f3 = f6 * paramFloat1;
          f2 -= f3;
          break label191;
          label466:
          bool2 = paramFloat4 < 0.0F;
          if (bool2)
          {
            f2 = paramFloat4 - paramFloat2;
            f3 = paramFloat3 - paramFloat1;
            f3 = f2 / f3;
            f2 = -paramFloat2;
            f6 = f3 * paramFloat1;
            f2 = (f2 + f6) / f3;
            boolean bool6 = f2 < 0.0F;
            float f7;
            if (bool6)
            {
              f2 = f3 * paramFloat1;
              f7 = paramFloat2 - f2;
              bool2 = false;
              f2 = 0.0F;
              f1 = f7;
            }
            for (;;)
            {
              f7 = f1;
              f1 = f2;
              f2 = f7;
              break;
              f6 = paramInt2;
              bool6 = f2 < f6;
              if (bool6)
              {
                f2 = paramInt2;
                f1 = paramInt2 * f3 + paramFloat2;
                f3 *= paramFloat1;
                f1 -= f3;
              }
            }
          }
          f2 = paramFloat4;
          f1 = paramFloat3;
          break label191;
        }
        f1 = f3;
        break label191;
      }
      f3 = f2;
      bool2 = false;
      f2 = 0.0F;
    }
  }
  
  public abstract int a(int paramInt);
  
  protected int a(Canvas paramCanvas, g paramg, String[] paramArrayOfString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Paint paramPaint, boolean paramBoolean)
  {
    int i = 1107296256;
    float f1 = 32.0F;
    boolean bool2 = paramg.t();
    int i4;
    float f9;
    if (bool2)
    {
      float f2 = paramInt1;
      float f3 = paramInt3 + paramInt5 - paramInt6 + f1;
      Object localObject1 = Paint.Align.LEFT;
      paramPaint.setTextAlign((Paint.Align)localObject1);
      float f4 = paramg.y();
      paramPaint.setTextSize(f4);
      int m = paramArrayOfString.length;
      int i2 = paramg.c();
      int i3 = Math.min(m, i2);
      i4 = 0;
      if (i4 < i3)
      {
        w localw = paramg.a(i4);
        float f5 = a(i4);
        boolean bool3 = localw.f();
        if (!bool3) {
          break label601;
        }
        String str = paramArrayOfString[i4];
        int n = paramArrayOfString.length;
        int i5 = paramg.c();
        if (n == i5)
        {
          n = localw.a();
          paramPaint.setColor(n);
        }
        float[] arrayOfFloat;
        float f6;
        for (;;)
        {
          arrayOfFloat = new float[str.length()];
          paramPaint.getTextWidths(str, arrayOfFloat);
          i5 = 0;
          f6 = 0.0F;
          int i6 = arrayOfFloat.length;
          n = 0;
          f4 = 0.0F;
          localObject1 = null;
          while (n < i6)
          {
            float f7 = arrayOfFloat[n];
            f6 += f7;
            n += 1;
          }
          n = -3355444;
          f4 = 0.0F / 0.0F;
          paramPaint.setColor(n);
        }
        n = 1092616192;
        float f8 = 10.0F + f5 + f6;
        f4 = f2 + f8;
        if (i4 <= 0) {
          break label594;
        }
        boolean bool5 = a(f4, paramg, paramInt2, paramInt4);
        if (!bool5) {
          break label594;
        }
        f2 = paramInt1;
        f4 = paramg.y();
        f3 += f4;
        f4 = paramg.y();
        f1 += f4;
        f4 = f2 + f8;
        f9 = f1;
        label332:
        boolean bool4 = a(f4, paramg, paramInt2, paramInt4);
        int i1;
        Object localObject2;
        if (bool4)
        {
          f4 = paramInt2 - f2 - f5;
          f1 = 10.0F;
          f4 -= f1;
          boolean bool1 = a(paramg);
          if (bool1)
          {
            f4 = paramInt4 - f2 - f5;
            j = 1092616192;
            f1 = 10.0F;
            f4 -= f1;
          }
          int j = 1;
          f1 = Float.MIN_VALUE;
          i1 = paramPaint.breakText(str, j, f4, arrayOfFloat);
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          bool5 = false;
          f6 = 0.0F;
          localObject1 = str.substring(0, i1);
          localObject1 = ((StringBuilder)localObject2).append((String)localObject1);
          localObject2 = "...";
          localObject1 = ((StringBuilder)localObject1).append((String)localObject2);
          str = ((StringBuilder)localObject1).toString();
        }
        if (!paramBoolean)
        {
          localObject1 = this;
          localObject2 = paramCanvas;
          a(paramCanvas, localw, f2, f3, i4, paramPaint);
          f4 = f2 + f5;
          int k = 1084227584;
          f1 = 5.0F;
          float f10 = f4 + f1;
          i1 = 1084227584;
          f4 = 5.0F;
          float f11 = f3 + f4;
          a(paramCanvas, str, f10, f11, paramPaint);
        }
        f2 += f8;
      }
    }
    for (;;)
    {
      i4 += 1;
      f1 = f9;
      break;
      return Math.round(paramg.y() + f1);
      label594:
      f9 = f1;
      break label332;
      label601:
      f9 = f1;
    }
  }
  
  protected int a(g paramg, int paramInt, float paramFloat)
  {
    int i = paramg.J();
    boolean bool = paramg.t();
    if ((bool) && (i == 0)) {}
    for (;;)
    {
      int j = paramg.t();
      if (j == 0)
      {
        j = paramg.l();
        if (j != 0)
        {
          float f1 = paramg.i() * 4.0F;
          int k = 1077936128;
          float f2 = 3.0F;
          f1 = f1 / f2 + paramFloat;
          paramInt = (int)f1;
        }
      }
      return paramInt;
      paramInt = j;
    }
  }
  
  public v a(r paramr)
  {
    return null;
  }
  
  protected String a(NumberFormat paramNumberFormat, double paramDouble)
  {
    Object localObject = "";
    if (paramNumberFormat != null) {
      localObject = paramNumberFormat.format(paramDouble);
    }
    for (;;)
    {
      return (String)localObject;
      long l1 = Math.round(paramDouble);
      double d = l1;
      boolean bool = paramDouble < d;
      String str;
      if (!bool)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        long l2 = Math.round(paramDouble);
        localObject = ((StringBuilder)localObject).append(l2);
        str = "";
        localObject = str;
      }
      else
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = ((StringBuilder)localObject).append(paramDouble);
        str = "";
        localObject = str;
      }
    }
  }
  
  public abstract void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint paramPaint);
  
  public abstract void a(Canvas paramCanvas, w paramw, float paramFloat1, float paramFloat2, int paramInt, Paint paramPaint);
  
  protected void a(Canvas paramCanvas, String paramString, float paramFloat1, float paramFloat2, Paint paramPaint)
  {
    if (paramString != null)
    {
      String[] arrayOfString = paramString.split("\n");
      Rect localRect = new android/graphics/Rect;
      localRect.<init>();
      int i = 0;
      int j = 0;
      for (;;)
      {
        int k = arrayOfString.length;
        if (i >= k) {
          break;
        }
        String str1 = arrayOfString[i];
        float f = j + paramFloat2;
        paramCanvas.drawText(str1, paramFloat1, f, paramPaint);
        str1 = arrayOfString[i];
        String str2 = arrayOfString[i];
        int m = str2.length();
        paramPaint.getTextBounds(str1, 0, m, localRect);
        k = localRect.height();
        j = j + k + 5;
        i += 1;
      }
    }
  }
  
  protected void a(Canvas paramCanvas, String paramString, g paramg, List paramList, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint, boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool1 = paramg.k();
    float f1;
    int j;
    float f2;
    int k;
    float f4;
    int m;
    int n;
    float f5;
    int i1;
    float f6;
    int i;
    float f7;
    int i2;
    float f8;
    float f9;
    String str;
    float f10;
    Object localObject;
    int i3;
    int i4;
    float f11;
    if ((bool1) || (paramBoolean2))
    {
      paramPaint.setColor(paramInt5);
      f1 = paramFloat4 / 2.0F + paramFloat3;
      double d1 = Math.toRadians(90.0F - f1);
      double d2 = Math.sin(d1);
      d1 = Math.cos(d1);
      j = paramInt1;
      f2 = paramInt1;
      float f3 = (float)(paramFloat1 * d2);
      f2 += f3;
      k = Math.round(f2);
      j = paramInt2;
      f3 = paramInt2;
      f4 = (float)(paramFloat1 * d1);
      f3 += f4;
      m = Math.round(f3);
      j = paramInt1;
      f4 = paramInt1;
      double d3 = paramFloat2;
      d2 *= d3;
      n = Math.round((float)d2 + f4);
      j = paramInt2;
      f5 = paramInt2;
      double d4 = paramFloat2;
      d1 *= d4;
      i1 = Math.round((float)d1 + f5);
      f6 = paramg.i();
      i = 1073741824;
      f7 = f6 / 2.0F;
      i2 = 1092616192;
      f5 = 10.0F;
      f7 = Math.max(f7, f5);
      Paint.Align localAlign = Paint.Align.LEFT;
      paramPaint.setTextAlign(localAlign);
      if (k > n)
      {
        f7 = -f7;
        localAlign = Paint.Align.RIGHT;
        paramPaint.setTextAlign(localAlign);
      }
      f8 = f7;
      f9 = n + f8;
      f4 = i1;
      j = paramInt4;
      f7 = paramInt4 - f9;
      if (k > n)
      {
        j = paramInt3;
        f7 = paramInt3;
        f7 = f9 - f7;
      }
      str = a(paramString, f7, paramPaint);
      f10 = paramPaint.measureText(str);
      i = 0;
      f7 = 0.0F;
      localObject = null;
      if ((i == 0) && (paramBoolean1))
      {
        i1 = 0;
        f1 = 0.0F;
        i3 = paramList.size();
        i = 0;
        f7 = 0.0F;
        localObject = null;
        i4 = 0;
        f11 = 0.0F;
        f5 = f4;
        label381:
        j = i3;
        if ((i4 < i3) && (i1 == 0))
        {
          localObject = (RectF)paramList.get(i4);
          f4 = f9 + f10;
          float f12 = f5 + f6;
          boolean bool2 = ((RectF)localObject).intersects(f9, f5, f4, f12);
          if (!bool2) {
            break label717;
          }
          i1 = 1;
          f7 = ((RectF)localObject).bottom;
          f7 = Math.max(f5, f7);
          float f13 = Float.MIN_VALUE;
          f1 = f7;
          i = i1;
          f7 = f13;
        }
      }
    }
    for (;;)
    {
      i2 = i4 + 1;
      i4 = i2;
      f5 = f1;
      i1 = i;
      f1 = f7;
      break label381;
      if (i1 == 0)
      {
        i = 1;
        f7 = Float.MIN_VALUE;
      }
      for (;;)
      {
        f4 = f5;
        break;
        i = 0;
        f7 = 0.0F;
        localObject = null;
      }
      if (paramBoolean1)
      {
        i = 1073741824;
        f7 = f6 / 2.0F;
        j = (int)(f4 - f7);
        i3 = j;
        f1 = k;
        f5 = m;
        f11 = n;
        f2 = j;
        localObject = paramCanvas;
        paramCanvas.drawLine(f1, f5, f11, f2, paramPaint);
        f1 = n;
        f5 = j;
        f7 = n;
        f11 = f7 + f8;
        f2 = j;
        paramCanvas.drawLine(f1, f5, f11, f2, paramPaint);
      }
      for (;;)
      {
        paramCanvas.drawText(str, f9, f4, paramPaint);
        if (paramBoolean1)
        {
          localObject = new android/graphics/RectF;
          f1 = f9 + f10;
          f5 = f4 + f6;
          ((RectF)localObject).<init>(f9, f4, f1, f5);
          paramList.add(localObject);
        }
        return;
        localObject = Paint.Align.CENTER;
        paramPaint.setTextAlign((Paint.Align)localObject);
      }
      label717:
      i = i1;
      f7 = f1;
      f1 = f5;
    }
  }
  
  protected void a(Canvas paramCanvas, float[] paramArrayOfFloat, Paint paramPaint, boolean paramBoolean)
  {
    Path localPath = new android/graphics/Path;
    localPath.<init>();
    int i = paramCanvas.getHeight();
    int j = paramCanvas.getWidth();
    int k = paramArrayOfFloat.length;
    int i3 = 4;
    float f1 = 5.6E-45F;
    if (k < i3) {}
    for (;;)
    {
      return;
      float f2 = paramArrayOfFloat[0];
      f1 = paramArrayOfFloat[1];
      float f3 = paramArrayOfFloat[2];
      int i4 = 3;
      float f4 = paramArrayOfFloat[i4];
      float[] arrayOfFloat = a(f2, f1, f3, f4, i, j);
      f1 = arrayOfFloat[0];
      f3 = arrayOfFloat[1];
      localPath.moveTo(f1, f3);
      i3 = 2;
      f1 = arrayOfFloat[i3];
      int i5 = 3;
      f3 = 4.2E-45F;
      f2 = arrayOfFloat[i5];
      localPath.lineTo(f1, f2);
      int i6 = paramArrayOfFloat.length;
      k = 4;
      f2 = 5.6E-45F;
      int i7 = k;
      int i2;
      if (i7 < i6)
      {
        k = i7 + -1;
        f2 = paramArrayOfFloat[k];
        i3 = 0;
        f1 = 0.0F;
        boolean bool1 = f2 < 0.0F;
        if (bool1)
        {
          int m = i7 + 1;
          f2 = paramArrayOfFloat[m];
          i3 = 0;
          f1 = 0.0F;
          boolean bool2 = f2 < 0.0F;
          if (bool2) {}
        }
        else
        {
          int n = i7 + -1;
          f2 = paramArrayOfFloat[n];
          f1 = i;
          boolean bool3 = f2 < f1;
          if (!bool3) {
            break label287;
          }
          int i1 = i7 + 1;
          f2 = paramArrayOfFloat[i1];
          f1 = i;
          boolean bool4 = f2 < f1;
          if (!bool4) {
            break label287;
          }
        }
        for (;;)
        {
          i2 = i7 + 2;
          i7 = i2;
          break;
          label287:
          i2 = i7 + -2;
          f2 = paramArrayOfFloat[i2];
          i3 = i7 + -1;
          f1 = paramArrayOfFloat[i3];
          f3 = paramArrayOfFloat[i7];
          i4 = i7 + 1;
          f4 = paramArrayOfFloat[i4];
          arrayOfFloat = a(f2, f1, f3, f4, i, j);
          if (!paramBoolean)
          {
            i3 = 0;
            f1 = arrayOfFloat[0];
            i5 = 1;
            f3 = arrayOfFloat[i5];
            localPath.moveTo(f1, f3);
          }
          i3 = 2;
          f1 = arrayOfFloat[i3];
          i5 = 3;
          f3 = 4.2E-45F;
          f2 = arrayOfFloat[i5];
          localPath.lineTo(f1, f2);
        }
      }
      if (paramBoolean)
      {
        i2 = 0;
        arrayOfFloat = null;
        f2 = paramArrayOfFloat[0];
        i3 = 1;
        f1 = paramArrayOfFloat[i3];
        localPath.lineTo(f2, f1);
      }
      paramCanvas.drawPath(localPath, paramPaint);
    }
  }
  
  protected void a(g paramg, Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint paramPaint, boolean paramBoolean, int paramInt5)
  {
    boolean bool = paramg.e();
    if ((bool) || (paramBoolean))
    {
      if (!paramBoolean) {
        break label86;
      }
      paramPaint.setColor(paramInt5);
    }
    for (;;)
    {
      Object localObject = Paint.Style.FILL;
      paramPaint.setStyle((Paint.Style)localObject);
      float f1 = paramInt1;
      float f2 = paramInt2;
      float f3 = paramInt1 + paramInt3;
      int i = paramInt2 + paramInt4;
      float f4 = i;
      localObject = paramCanvas;
      paramCanvas.drawRect(f1, f2, f3, f4, paramPaint);
      return;
      label86:
      i = paramg.d();
      paramPaint.setColor(i);
    }
  }
  
  public boolean a(double paramDouble)
  {
    boolean bool = Double.isNaN(paramDouble);
    if (!bool)
    {
      bool = Double.isInfinite(paramDouble);
      if (!bool)
      {
        double d = Double.MAX_VALUE;
        bool = paramDouble < d;
        if (bool) {
          break label36;
        }
      }
    }
    label36:
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  protected boolean a(float paramFloat, g paramg, int paramInt1, int paramInt2)
  {
    boolean bool1 = true;
    float f1 = Float.MIN_VALUE;
    float f2 = paramInt1;
    boolean bool2 = paramFloat < f2;
    if (bool2)
    {
      bool2 = bool1;
      f2 = f1;
      boolean bool3 = a(paramg);
      if (!bool3) {
        break label79;
      }
      f2 = paramInt2;
      bool2 = paramFloat < f2;
      if (!bool2) {
        break label70;
      }
    }
    for (;;)
    {
      return bool1;
      bool2 = false;
      f2 = 0.0F;
      break;
      label70:
      bool1 = false;
      f1 = 0.0F;
      continue;
      label79:
      bool1 = bool2;
      f1 = f2;
    }
  }
  
  public boolean a(g paramg)
  {
    boolean bool = paramg instanceof ab;
    ab.a locala1;
    if (bool)
    {
      paramg = (ab)paramg;
      locala1 = paramg.O();
      ab.a locala2 = ab.a.b;
      if (locala1 == locala2) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      locala1 = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */