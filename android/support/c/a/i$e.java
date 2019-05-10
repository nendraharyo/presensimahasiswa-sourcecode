package android.support.c.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.PathMeasure;
import android.support.v4.h.a;
import java.util.ArrayList;

class i$e
{
  private static final Matrix k;
  final i.c a;
  float b;
  float c;
  float d;
  float e;
  int f;
  String g;
  final a h;
  private final Path i;
  private final Path j;
  private final Matrix l;
  private Paint m;
  private Paint n;
  private PathMeasure o;
  private int p;
  
  static
  {
    Matrix localMatrix = new android/graphics/Matrix;
    localMatrix.<init>();
    k = localMatrix;
  }
  
  public i$e()
  {
    Object localObject = new android/graphics/Matrix;
    ((Matrix)localObject).<init>();
    this.l = ((Matrix)localObject);
    this.b = 0.0F;
    this.c = 0.0F;
    this.d = 0.0F;
    this.e = 0.0F;
    this.f = 255;
    this.g = null;
    localObject = new android/support/v4/h/a;
    ((a)localObject).<init>();
    this.h = ((a)localObject);
    localObject = new android/support/c/a/i$c;
    ((i.c)localObject).<init>();
    this.a = ((i.c)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.i = ((Path)localObject);
    localObject = new android/graphics/Path;
    ((Path)localObject).<init>();
    this.j = ((Path)localObject);
  }
  
  public i$e(e parame)
  {
    Object localObject1 = new android/graphics/Matrix;
    ((Matrix)localObject1).<init>();
    this.l = ((Matrix)localObject1);
    this.b = 0.0F;
    this.c = 0.0F;
    this.d = 0.0F;
    this.e = 0.0F;
    this.f = 255;
    this.g = null;
    localObject1 = new android/support/v4/h/a;
    ((a)localObject1).<init>();
    this.h = ((a)localObject1);
    localObject1 = new android/support/c/a/i$c;
    Object localObject2 = parame.a;
    a locala = this.h;
    ((i.c)localObject1).<init>((i.c)localObject2, locala);
    this.a = ((i.c)localObject1);
    localObject1 = new android/graphics/Path;
    localObject2 = parame.i;
    ((Path)localObject1).<init>((Path)localObject2);
    this.i = ((Path)localObject1);
    localObject1 = new android/graphics/Path;
    localObject2 = parame.j;
    ((Path)localObject1).<init>((Path)localObject2);
    this.j = ((Path)localObject1);
    float f1 = parame.b;
    this.b = f1;
    f1 = parame.c;
    this.c = f1;
    f1 = parame.d;
    this.d = f1;
    f1 = parame.e;
    this.e = f1;
    int i1 = parame.p;
    this.p = i1;
    i1 = parame.f;
    this.f = i1;
    localObject1 = parame.g;
    this.g = ((String)localObject1);
    localObject1 = parame.g;
    if (localObject1 != null)
    {
      localObject1 = this.h;
      localObject2 = parame.g;
      ((a)localObject1).put(localObject2, this);
    }
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = paramFloat1 * paramFloat4;
    float f2 = paramFloat2 * paramFloat3;
    return f1 - f2;
  }
  
  private float a(Matrix paramMatrix)
  {
    int i1 = 3;
    int i2 = 2;
    int i3 = 1;
    float f1 = 0.0F;
    int i4 = 4;
    float[] arrayOfFloat = new float[i4];
    float[] tmp21_19 = arrayOfFloat;
    float[] tmp22_21 = tmp21_19;
    float[] tmp22_21 = tmp21_19;
    tmp22_21[0] = 0.0F;
    tmp22_21[1] = 1.0F;
    tmp22_21[2] = 1.0F;
    tmp22_21[3] = 0.0F;
    paramMatrix.mapVectors(arrayOfFloat);
    double d1 = arrayOfFloat[0];
    double d2 = arrayOfFloat[i3];
    d1 = Math.hypot(d1, d2);
    float f2 = (float)d1;
    d2 = arrayOfFloat[i2];
    double d3 = arrayOfFloat[i1];
    d2 = Math.hypot(d2, d3);
    float f3 = (float)d2;
    float f4 = arrayOfFloat[0];
    float f5 = arrayOfFloat[i3];
    float f6 = arrayOfFloat[i2];
    float f7 = arrayOfFloat[i1];
    f7 = a(f4, f5, f6, f7);
    f2 = Math.max(f2, f3);
    boolean bool = f2 < 0.0F;
    if (bool) {
      f1 = Math.abs(f7) / f2;
    }
    return f1;
  }
  
  private void a(i.c paramc, Matrix paramMatrix, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    i.c.a(paramc).set(paramMatrix);
    Object localObject1 = i.c.a(paramc);
    Object localObject2 = i.c.b(paramc);
    ((Matrix)localObject1).preConcat((Matrix)localObject2);
    paramCanvas.save();
    int i1 = 0;
    localObject1 = null;
    int i3 = 0;
    localObject1 = paramc.a;
    i1 = ((ArrayList)localObject1).size();
    if (i3 < i1)
    {
      localObject1 = paramc.a;
      localObject2 = ((ArrayList)localObject1).get(i3);
      boolean bool1 = localObject2 instanceof i.c;
      Object localObject3;
      if (bool1)
      {
        localObject2 = (i.c)localObject2;
        localObject3 = i.c.a(paramc);
        localObject1 = this;
        a((i.c)localObject2, (Matrix)localObject3, paramCanvas, paramInt1, paramInt2, paramColorFilter);
      }
      for (;;)
      {
        int i2 = i3 + 1;
        i3 = i2;
        break;
        boolean bool2 = localObject2 instanceof i.d;
        if (bool2)
        {
          localObject3 = localObject2;
          localObject3 = (i.d)localObject2;
          localObject1 = this;
          localObject2 = paramc;
          a(paramc, (i.d)localObject3, paramCanvas, paramInt1, paramInt2, paramColorFilter);
        }
      }
    }
    paramCanvas.restore();
  }
  
  private void a(i.c paramc, i.d paramd, Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    float f1 = paramInt1;
    float f2 = this.d;
    f1 /= f2;
    f2 = paramInt2;
    float f3 = this.e;
    f2 /= f3;
    f3 = Math.min(f1, f2);
    Object localObject1 = i.c.a(paramc);
    this.l.set((Matrix)localObject1);
    Object localObject2 = this.l;
    ((Matrix)localObject2).postScale(f1, f2);
    f2 = a((Matrix)localObject1);
    f1 = 0.0F;
    Object localObject3 = null;
    boolean bool1 = f2 < 0.0F;
    if (!bool1) {}
    Path localPath;
    for (;;)
    {
      return;
      localObject3 = this.i;
      paramd.a((Path)localObject3);
      localObject3 = this.i;
      localObject1 = this.j;
      ((Path)localObject1).reset();
      bool2 = paramd.a();
      if (!bool2) {
        break;
      }
      localPath = this.j;
      Matrix localMatrix = this.l;
      localPath.addPath((Path)localObject3, localMatrix);
      localObject3 = this.j;
      paramCanvas.clipPath((Path)localObject3);
    }
    paramd = (i.b)paramd;
    float f4 = paramd.g;
    float f5 = 0.0F;
    localObject2 = null;
    boolean bool2 = f4 < 0.0F;
    PathMeasure localPathMeasure;
    boolean bool4;
    if (!bool2)
    {
      f4 = paramd.h;
      f5 = 1.0F;
      bool2 = f4 < f5;
      if (!bool2) {}
    }
    else
    {
      f4 = paramd.g;
      f5 = paramd.i;
      f4 = (f4 + f5) % 1.0F;
      f5 = paramd.h;
      float f6 = paramd.i;
      f5 += f6;
      f6 = 1.0F;
      f5 %= f6;
      localPathMeasure = this.o;
      if (localPathMeasure == null)
      {
        localPathMeasure = new android/graphics/PathMeasure;
        localPathMeasure.<init>();
        this.o = localPathMeasure;
      }
      localPathMeasure = this.o;
      Object localObject4 = this.i;
      boolean bool3 = false;
      localPathMeasure.setPath((Path)localObject4, false);
      localPathMeasure = this.o;
      f6 = localPathMeasure.getLength();
      f4 *= f6;
      f5 *= f6;
      ((Path)localObject3).reset();
      bool4 = f4 < f5;
      if (!bool4) {
        break label853;
      }
      localObject4 = this.o;
      bool3 = true;
      ((PathMeasure)localObject4).getSegment(f4, f6, (Path)localObject3, bool3);
      localObject1 = this.o;
      f6 = 0.0F;
      localPathMeasure = null;
      bool4 = true;
      ((PathMeasure)localObject1).getSegment(0.0F, f5, (Path)localObject3, bool4);
      label426:
      bool2 = false;
      f4 = 0.0F;
      localObject1 = null;
      f5 = 0.0F;
      localObject2 = null;
      ((Path)localObject3).rLineTo(0.0F, 0.0F);
    }
    localObject1 = this.j;
    localObject2 = this.l;
    ((Path)localObject1).addPath((Path)localObject3, (Matrix)localObject2);
    int i1 = paramd.c;
    if (i1 != 0)
    {
      localObject3 = this.n;
      if (localObject3 == null)
      {
        localObject3 = new android/graphics/Paint;
        ((Paint)localObject3).<init>();
        this.n = ((Paint)localObject3);
        localObject3 = this.n;
        localObject1 = Paint.Style.FILL;
        ((Paint)localObject3).setStyle((Paint.Style)localObject1);
        localObject3 = this.n;
        bool2 = true;
        f4 = Float.MIN_VALUE;
        ((Paint)localObject3).setAntiAlias(bool2);
      }
      localObject1 = this.n;
      i1 = paramd.c;
      f5 = paramd.f;
      i1 = i.a(i1, f5);
      ((Paint)localObject1).setColor(i1);
      ((Paint)localObject1).setColorFilter(paramColorFilter);
      localObject2 = this.j;
      i1 = paramd.e;
      if (i1 != 0) {
        break label879;
      }
    }
    label853:
    label879:
    for (localObject3 = Path.FillType.WINDING;; localObject3 = Path.FillType.EVEN_ODD)
    {
      ((Path)localObject2).setFillType((Path.FillType)localObject3);
      localObject3 = this.j;
      paramCanvas.drawPath((Path)localObject3, (Paint)localObject1);
      i1 = paramd.a;
      if (i1 == 0) {
        break;
      }
      localObject3 = this.m;
      if (localObject3 == null)
      {
        localObject3 = new android/graphics/Paint;
        ((Paint)localObject3).<init>();
        this.m = ((Paint)localObject3);
        localObject3 = this.m;
        localObject1 = Paint.Style.STROKE;
        ((Paint)localObject3).setStyle((Paint.Style)localObject1);
        localObject3 = this.m;
        bool2 = true;
        f4 = Float.MIN_VALUE;
        ((Paint)localObject3).setAntiAlias(bool2);
      }
      localObject3 = this.m;
      localObject1 = paramd.k;
      if (localObject1 != null)
      {
        localObject1 = paramd.k;
        ((Paint)localObject3).setStrokeJoin((Paint.Join)localObject1);
      }
      localObject1 = paramd.j;
      if (localObject1 != null)
      {
        localObject1 = paramd.j;
        ((Paint)localObject3).setStrokeCap((Paint.Cap)localObject1);
      }
      f4 = paramd.l;
      ((Paint)localObject3).setStrokeMiter(f4);
      int i2 = paramd.a;
      f5 = paramd.d;
      i2 = i.a(i2, f5);
      ((Paint)localObject3).setColor(i2);
      ((Paint)localObject3).setColorFilter(paramColorFilter);
      f2 *= f3;
      f3 = paramd.b;
      f2 *= f3;
      ((Paint)localObject3).setStrokeWidth(f2);
      localPath = this.j;
      paramCanvas.drawPath(localPath, (Paint)localObject3);
      break;
      localPathMeasure = this.o;
      bool4 = true;
      localPathMeasure.getSegment(f4, f5, (Path)localObject3, bool4);
      break label426;
    }
  }
  
  public void a(Canvas paramCanvas, int paramInt1, int paramInt2, ColorFilter paramColorFilter)
  {
    i.c localc = this.a;
    Matrix localMatrix = k;
    a(localc, localMatrix, paramCanvas, paramInt1, paramInt2, paramColorFilter);
  }
  
  public float getAlpha()
  {
    return getRootAlpha() / 255.0F;
  }
  
  public int getRootAlpha()
  {
    return this.f;
  }
  
  public void setAlpha(float paramFloat)
  {
    int i1 = (int)(255.0F * paramFloat);
    setRootAlpha(i1);
  }
  
  public void setRootAlpha(int paramInt)
  {
    this.f = paramInt;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */