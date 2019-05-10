package id.ac.ugm.presensi.presensimahasiswa.PresenceRecap.a;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class o
  extends t
{
  private p e;
  
  public o(d paramd, g paramg)
  {
    super(paramd, paramg);
    p localp = new id/ac/ugm/presensi/presensimahasiswa/PresenceRecap/a/p;
    localp.<init>();
    this.e = localp;
  }
  
  public v a(r paramr)
  {
    return this.e.c(paramr);
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Paint paramPaint)
  {
    int i = this.b.z();
    paramPaint.setAntiAlias(i);
    Object localObject1 = Paint.Style.FILL;
    paramPaint.setStyle((Paint.Style)localObject1);
    float f1 = this.b.i();
    paramPaint.setTextSize(f1);
    localObject1 = this.b;
    int i1 = paramInt4 / 5;
    int i2 = 0;
    g localg1 = null;
    int i3 = a((g)localObject1, i1, 0.0F);
    int i4 = paramInt1 + paramInt3;
    int i5 = this.a.a();
    double d1 = 0.0D;
    int i6 = i5;
    String[] arrayOfString = new String[i5];
    i = 0;
    f1 = 0.0F;
    localObject1 = null;
    Object localObject2;
    for (double d2 = d1;; d2 = d1)
    {
      i6 = i5;
      if (i >= i5) {
        break;
      }
      d1 = this.a.a(i) + d2;
      localObject2 = this.a.b(i);
      arrayOfString[i] = localObject2;
      int j;
      i += 1;
    }
    localObject1 = this.b;
    boolean bool1 = ((g)localObject1).u();
    int i9;
    int i10;
    int i12;
    int i15;
    if (bool1)
    {
      localg1 = this.b;
      boolean bool2 = true;
      localObject1 = this;
      localObject2 = paramCanvas;
      i9 = paramInt1;
      i10 = paramInt2;
      i12 = paramInt3;
      i15 = paramInt4;
      i3 = a(paramCanvas, localg1, arrayOfString, paramInt1, i4, paramInt2, paramInt3, paramInt4, i3, paramPaint, bool2);
    }
    for (int i16 = i3;; i16 = i3)
    {
      int k = paramInt2 + paramInt4 - i16;
      Object localObject3 = this.b;
      boolean bool6 = false;
      Object localObject4 = this;
      Object localObject5 = paramCanvas;
      i3 = paramInt1;
      int i17 = paramInt2;
      int i8 = paramInt3;
      a((g)localObject3, paramCanvas, paramInt1, paramInt2, paramInt3, paramInt4, paramPaint, false, 0);
      float f2 = this.b.M();
      i1 = Math.abs(i4 - paramInt1);
      i2 = Math.abs(k - paramInt2);
      d1 = Math.min(i1, i2) * 0.35D;
      localObject2 = this.b;
      float f3 = ((g)localObject2).A();
      double d3 = f3;
      d1 *= d3;
      i2 = (int)d1;
      i1 = this.c;
      i9 = -1 >>> 1;
      float f4 = 0.0F / 0.0F;
      if (i1 == i9)
      {
        i1 = (paramInt1 + i4) / 2;
        this.c = i1;
      }
      i1 = this.d;
      i9 = -1 >>> 1;
      f4 = 0.0F / 0.0F;
      if (i1 == i9)
      {
        k = (k + paramInt2) / 2;
        this.d = k;
      }
      localObject1 = this.e;
      i1 = this.c;
      i9 = this.d;
      ((p)localObject1).a(i2, i1, i9);
      localObject1 = this.e;
      i6 = i5;
      int m = ((p)localObject1).a(i5);
      float f5;
      float f6;
      RectF localRectF;
      float f7;
      float f8;
      ArrayList localArrayList;
      label644:
      Object localObject6;
      label753:
      double d4;
      float f10;
      int i13;
      if (m == 0)
      {
        m = 1;
        f1 = Float.MIN_VALUE;
        i1 = m;
        f3 = f1;
        if (i1 != 0)
        {
          localObject1 = this.e;
          ((p)localObject1).a();
        }
        f5 = i2 * 0.9F;
        f1 = i2;
        i9 = 1066192077;
        f4 = 1.1F;
        f6 = f1 * f4;
        localRectF = new android/graphics/RectF;
        f1 = this.c - i2;
        i10 = this.d - i2;
        f7 = i10;
        i12 = this.c + i2;
        f8 = i12;
        i15 = this.d + i2;
        float f9 = i15;
        localRectF.<init>(f1, f7, f8, f9);
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        m = 0;
        f1 = 0.0F;
        localObject1 = null;
        i6 = i5;
        if (m >= i5) {
          break label1302;
        }
        localObject4 = this.b;
        localObject6 = ((g)localObject4).a(m);
        boolean bool3 = ((w)localObject6).c();
        if (!bool3) {
          break label1265;
        }
        localObject4 = new android/graphics/RadialGradient;
        i12 = this.c;
        f8 = i12;
        i15 = this.d;
        f9 = i15;
        i17 = ((w)localObject6).d();
        i8 = ((w)localObject6).e();
        Shader.TileMode localTileMode = Shader.TileMode.MIRROR;
        ((RadialGradient)localObject4).<init>(f8, f9, f6, i17, i8, localTileMode);
        paramPaint.setShader((Shader)localObject4);
        localObject4 = this.a;
        d1 = ((d)localObject4).a(m);
        f7 = (float)d1;
        d4 = f7 / d2;
        double d5 = 360.0D;
        d4 *= d5;
        f10 = (float)d4;
        boolean bool4 = ((w)localObject6).g();
        if (!bool4) {
          break label1282;
        }
        i13 = 1119092736;
        i15 = 1073741824;
        f9 = f10 / 2.0F + f2;
        d4 = Math.toRadians(90.0F - f9);
        double d6 = i2;
        double d7 = d6;
        d7 = d6 * 0.1D;
        double d8 = Math.sin(d4);
        d7 *= d8;
        d6 = d7;
        f8 = (float)d7;
        d6 = i2;
        d7 = d6;
        d8 = 0.1D;
        d7 = d6 * d8;
        d4 = Math.cos(d4) * d7;
        f9 = (float)d4;
        localRectF.offset(f8, f9);
        bool6 = true;
        paramCanvas.drawArc(localRectF, f2, f10, bool6, paramPaint);
        f8 = -f8;
        f9 = -f9;
        localRectF.offset(f8, f9);
      }
      for (;;)
      {
        i13 = ((w)localObject6).a();
        paramPaint.setColor(i13);
        f8 = 0.0F;
        paramPaint.setShader(null);
        localObject6 = this.a.b(m);
        g localg2 = this.b;
        int i18 = this.c;
        int i7 = this.d;
        int i19 = this.b.h();
        boolean bool7 = true;
        a(paramCanvas, (String)localObject6, localg2, localArrayList, i18, i7, f5, f6, f2, f10, paramInt1, i4, i19, paramPaint, bool7, false);
        localObject3 = this.b;
        boolean bool5 = ((g)localObject3).N();
        if (bool5)
        {
          localObject3 = this.b.a(m).i();
          localObject5 = this.a;
          d4 = ((d)localObject5).a(m);
          String str = a((NumberFormat)localObject3, d4);
          g localg3 = this.b;
          int i20 = this.c;
          i7 = this.d;
          float f11 = f5 / 2.0F;
          i14 = 1073741824;
          f8 = 2.0F;
          float f12 = f6 / f8;
          localObject3 = this.b;
          int i21 = ((g)localObject3).h();
          boolean bool8 = true;
          a(paramCanvas, str, localg3, localArrayList, i20, i7, f11, f12, f2, f10, paramInt1, i4, i21, paramPaint, false, bool8);
        }
        if (i1 != 0)
        {
          localObject3 = this.e;
          ((p)localObject3).a(m, f7, f2, f10);
        }
        f2 += f10;
        m += 1;
        break label644;
        int n = 0;
        f1 = 0.0F;
        localObject1 = null;
        i1 = 0;
        localObject2 = null;
        f3 = 0.0F;
        break;
        label1265:
        i11 = ((w)localObject6).a();
        paramPaint.setColor(i11);
        break label753;
        label1282:
        bool6 = true;
        paramCanvas.drawArc(localRectF, f2, f10, bool6, paramPaint);
      }
      label1302:
      localArrayList.clear();
      localg1 = this.b;
      localObject1 = this;
      localObject2 = paramCanvas;
      i9 = paramInt1;
      int i11 = paramInt2;
      int i14 = paramInt3;
      i15 = paramInt4;
      i3 = i16;
      a(paramCanvas, localg1, arrayOfString, paramInt1, i4, paramInt2, paramInt3, paramInt4, i16, paramPaint, false);
      i2 = paramInt1;
      i9 = paramInt3;
      a(paramCanvas, paramInt1, paramInt2, paramInt3, paramPaint);
      return;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\id\a\\ugm\presensi\presensimahasiswa\PresenceRecap\a\o.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */