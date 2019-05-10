package android.support.design.widget;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.FillType;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v7.graphics.drawable.DrawableWrapper;

class j
  extends DrawableWrapper
{
  static final double a = Math.cos(Math.toRadians(45.0D));
  final Paint b;
  final Paint c;
  final RectF d;
  float e;
  Path f;
  float g;
  float h;
  float i;
  float j;
  private boolean k;
  private final int l;
  private final int m;
  private final int n;
  private boolean o;
  private float p;
  private boolean q;
  
  public static float a(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    float f1 = 1.5F;
    double d1;
    if (paramBoolean)
    {
      d1 = f1 * paramFloat1;
      double d2 = a;
      double d3 = 1.0D - d2;
      d2 = paramFloat2;
      d3 *= d2;
      d1 += d3;
    }
    for (f1 = (float)d1;; f1 *= paramFloat1) {
      return f1;
    }
  }
  
  private void a(Canvas paramCanvas)
  {
    int i1 = paramCanvas.save();
    float f1 = this.p;
    float f2 = this.d.centerX();
    RectF localRectF = this.d;
    float f3 = localRectF.centerY();
    paramCanvas.rotate(f1, f2, f3);
    f1 = -this.e;
    f2 = this.i;
    f3 = f1 - f2;
    float f4 = this.e;
    Object localObject = this.d;
    f1 = ((RectF)localObject).width();
    f2 = 2.0F * f4;
    f1 -= f2;
    f2 = 0.0F;
    Paint localPaint1 = null;
    boolean bool1 = f1 < 0.0F;
    boolean bool2;
    if (bool1)
    {
      bool1 = true;
      f1 = Float.MIN_VALUE;
      bool2 = bool1;
      localObject = this.d;
      f1 = ((RectF)localObject).height();
      f2 = 2.0F * f4;
      f1 -= f2;
      f2 = 0.0F;
      localPaint1 = null;
      bool1 = f1 < 0.0F;
      if (!bool1) {
        break label934;
      }
      bool1 = true;
      f1 = Float.MIN_VALUE;
    }
    for (boolean bool3 = bool1;; bool3 = false)
    {
      f1 = this.j;
      f2 = this.j * 0.25F;
      f1 -= f2;
      f2 = this.j;
      float f5 = this.j * 0.5F;
      f2 -= f5;
      f5 = this.j;
      float f6 = this.j;
      float f7 = 1.0F;
      f6 *= f7;
      f5 -= f6;
      f2 += f4;
      float f8 = f4 / f2;
      f1 += f4;
      float f9 = f4 / f1;
      f1 = f4 + f5;
      float f10 = f4 / f1;
      int i4 = paramCanvas.save();
      f1 = this.d.left + f4;
      f2 = this.d.top + f4;
      paramCanvas.translate(f1, f2);
      paramCanvas.scale(f8, f9);
      localObject = this.f;
      localPaint1 = this.b;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      Paint localPaint2;
      if (bool2)
      {
        i2 = 1065353216;
        f1 = 1.0F / f8;
        paramCanvas.scale(f1, 1.0F);
        f2 = 0.0F;
        localPaint1 = null;
        f1 = this.d.width();
        f5 = 2.0F * f4;
        f5 = f1 - f5;
        f1 = this.e;
        f6 = -f1;
        localPaint2 = this.c;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f3, f5, f6, localPaint2);
      }
      paramCanvas.restoreToCount(i4);
      i4 = paramCanvas.save();
      f1 = this.d.right - f4;
      f2 = this.d.bottom - f4;
      paramCanvas.translate(f1, f2);
      paramCanvas.scale(f8, f10);
      int i2 = 1127481344;
      f1 = 180.0F;
      paramCanvas.rotate(f1);
      localObject = this.f;
      localPaint1 = this.b;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      if (bool2)
      {
        i2 = 1065353216;
        f1 = 1.0F / f8;
        paramCanvas.scale(f1, 1.0F);
        f2 = 0.0F;
        localPaint1 = null;
        f1 = this.d.width();
        f5 = 2.0F * f4;
        f5 = f1 - f5;
        f1 = -this.e;
        f6 = this.i + f1;
        localPaint2 = this.c;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f3, f5, f6, localPaint2);
      }
      paramCanvas.restoreToCount(i4);
      int i3 = paramCanvas.save();
      f1 = this.d.left + f4;
      f2 = this.d.bottom - f4;
      paramCanvas.translate(f1, f2);
      paramCanvas.scale(f8, f10);
      i2 = 1132920832;
      f1 = 270.0F;
      paramCanvas.rotate(f1);
      localObject = this.f;
      localPaint1 = this.b;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      if (bool3)
      {
        i2 = 1065353216;
        f1 = 1.0F / f10;
        paramCanvas.scale(f1, 1.0F);
        f2 = 0.0F;
        localPaint1 = null;
        f1 = this.d.height();
        f5 = 2.0F * f4;
        f5 = f1 - f5;
        f1 = this.e;
        f6 = -f1;
        localPaint2 = this.c;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f3, f5, f6, localPaint2);
      }
      paramCanvas.restoreToCount(i3);
      i3 = paramCanvas.save();
      f1 = this.d.right - f4;
      f2 = this.d.top + f4;
      paramCanvas.translate(f1, f2);
      paramCanvas.scale(f8, f9);
      i2 = 1119092736;
      f1 = 90.0F;
      paramCanvas.rotate(f1);
      localObject = this.f;
      localPaint1 = this.b;
      paramCanvas.drawPath((Path)localObject, localPaint1);
      if (bool3)
      {
        i2 = 1065353216;
        f1 = 1.0F / f9;
        paramCanvas.scale(f1, 1.0F);
        f2 = 0.0F;
        localPaint1 = null;
        f1 = this.d.height();
        f5 = 2.0F * f4;
        f5 = f1 - f5;
        f1 = this.e;
        f6 = -f1;
        localPaint2 = this.c;
        localObject = paramCanvas;
        paramCanvas.drawRect(0.0F, f3, f5, f6, localPaint2);
      }
      paramCanvas.restoreToCount(i3);
      paramCanvas.restoreToCount(i1);
      return;
      i2 = 0;
      f1 = 0.0F;
      localObject = null;
      i3 = 0;
      break;
      label934:
      i2 = 0;
      f1 = 0.0F;
      localObject = null;
    }
  }
  
  private void a(Rect paramRect)
  {
    float f1 = this.h * 1.5F;
    RectF localRectF = this.d;
    float f2 = paramRect.left;
    float f3 = this.h;
    f2 += f3;
    f3 = paramRect.top + f1;
    float f4 = paramRect.right;
    float f5 = this.h;
    f4 -= f5;
    f1 = paramRect.bottom - f1;
    localRectF.set(f2, f3, f4, f1);
    Drawable localDrawable = getWrappedDrawable();
    int i1 = (int)this.d.left;
    int i2 = (int)this.d.top;
    int i3 = (int)this.d.right;
    int i4 = (int)this.d.bottom;
    localDrawable.setBounds(i1, i2, i3, i4);
    b();
  }
  
  public static float b(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      double d1 = paramFloat1;
      double d2 = a;
      double d3 = 1.0D - d2;
      d2 = paramFloat2;
      d3 *= d2;
      d1 += d3;
      paramFloat1 = (float)d1;
    }
    return paramFloat1;
  }
  
  private void b()
  {
    int i1 = 2;
    int i2 = 1;
    int i3 = 3;
    Object localObject1 = new android/graphics/RectF;
    float f1 = -this.e;
    float f2 = -this.e;
    float f3 = this.e;
    float f4 = this.e;
    ((RectF)localObject1).<init>(f1, f2, f3, f4);
    RectF localRectF = new android/graphics/RectF;
    localRectF.<init>((RectF)localObject1);
    f1 = -this.i;
    f2 = -this.i;
    localRectF.inset(f1, f2);
    Object localObject2 = this.f;
    if (localObject2 == null)
    {
      localObject2 = new android/graphics/Path;
      ((Path)localObject2).<init>();
      this.f = ((Path)localObject2);
    }
    for (;;)
    {
      localObject2 = this.f;
      Path.FillType localFillType = Path.FillType.EVEN_ODD;
      ((Path)localObject2).setFillType(localFillType);
      localObject2 = this.f;
      f2 = -this.e;
      ((Path)localObject2).moveTo(f2, 0.0F);
      localObject2 = this.f;
      f2 = -this.i;
      ((Path)localObject2).rLineTo(f2, 0.0F);
      this.f.arcTo(localRectF, 180.0F, 90.0F, false);
      localObject2 = this.f;
      f2 = 270.0F;
      int i4 = -1028390912;
      ((Path)localObject2).arcTo((RectF)localObject1, f2, -90.0F, false);
      localObject2 = this.f;
      ((Path)localObject2).close();
      f1 = localRectF.top;
      f3 = -f1;
      boolean bool = f3 < 0.0F;
      if (bool)
      {
        f2 = this.e / f3;
        int i5 = 1065353216;
        f1 = (1.0F - f2) / 2.0F;
        float f5 = f2 + f1;
        localPaint = this.b;
        localObject2 = new android/graphics/RadialGradient;
        int i6 = 4;
        f4 = 5.6E-45F;
        int[] arrayOfInt = new int[i6];
        arrayOfInt[0] = 0;
        int i7 = this.l;
        arrayOfInt[i2] = i7;
        i7 = this.m;
        arrayOfInt[i1] = i7;
        i7 = this.n;
        arrayOfInt[i3] = i7;
        i7 = 4;
        localObject3 = new float[i7];
        localObject3[0] = 0.0F;
        localObject3[i2] = f2;
        localObject3[i1] = f5;
        localObject3[i3] = 1.0F;
        localObject4 = Shader.TileMode.CLAMP;
        localFillType = null;
        f2 = 0.0F;
        ((RadialGradient)localObject2).<init>(0.0F, 0.0F, f3, arrayOfInt, (float[])localObject3, (Shader.TileMode)localObject4);
        localPaint.setShader((Shader)localObject2);
      }
      Paint localPaint = this.c;
      localObject2 = new android/graphics/LinearGradient;
      f2 = ((RectF)localObject1).top;
      f4 = localRectF.top;
      Object localObject3 = new int[i3];
      i4 = this.l;
      localObject3[0] = i4;
      i4 = this.m;
      localObject3[i2] = i4;
      i4 = this.n;
      localObject3[i1] = i4;
      Object localObject4 = new float[i3];
      Object tmp480_478 = localObject4;
      tmp480_478[0] = 0.0F;
      Object tmp484_480 = tmp480_478;
      tmp484_480[1] = 0.5F;
      tmp484_480[2] = 1.0F;
      localObject1 = Shader.TileMode.CLAMP;
      ((LinearGradient)localObject2).<init>(0.0F, f2, 0.0F, f4, (int[])localObject3, (float[])localObject4, (Shader.TileMode)localObject1);
      localPaint.setShader((Shader)localObject2);
      this.c.setAntiAlias(false);
      return;
      localObject2 = this.f;
      ((Path)localObject2).reset();
    }
  }
  
  private static int c(float paramFloat)
  {
    int i1 = Math.round(paramFloat);
    int i2 = i1 % 2;
    int i3 = 1;
    if (i2 == i3) {
      i1 += -1;
    }
    return i1;
  }
  
  public float a()
  {
    return this.j;
  }
  
  final void a(float paramFloat)
  {
    float f1 = this.p;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.p = paramFloat;
      invalidateSelf();
    }
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = true;
    int i1 = 0;
    float f1 = 0.0F;
    boolean bool2 = paramFloat1 < 0.0F;
    if (!bool2)
    {
      bool2 = paramFloat2 < 0.0F;
      if (!bool2) {}
    }
    else
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("invalid shadow size");
      throw localIllegalArgumentException;
    }
    int i2 = c(paramFloat1);
    float f2 = i2;
    i1 = c(paramFloat2);
    f1 = i1;
    boolean bool4 = f2 < f1;
    if (bool4)
    {
      boolean bool3 = this.q;
      if (!bool3) {
        this.q = bool1;
      }
      f2 = f1;
    }
    float f3 = this.j;
    bool4 = f3 < f2;
    if (!bool4)
    {
      f3 = this.h;
      bool4 = f3 < f1;
      if (bool4) {}
    }
    for (;;)
    {
      return;
      this.j = f2;
      this.h = f1;
      int i4 = 1069547520;
      f3 = 1.5F;
      int i3 = Math.round(f2 * f3);
      f2 = i3;
      this.i = f2;
      this.g = f1;
      this.k = bool1;
      invalidateSelf();
    }
  }
  
  public void b(float paramFloat)
  {
    float f1 = this.h;
    a(paramFloat, f1);
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.k;
    if (bool)
    {
      Rect localRect = getBounds();
      a(localRect);
      bool = false;
      localRect = null;
      this.k = false;
    }
    a(paramCanvas);
    super.draw(paramCanvas);
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public boolean getPadding(Rect paramRect)
  {
    float f1 = this.h;
    float f2 = this.e;
    boolean bool1 = this.o;
    int i1 = (int)Math.ceil(a(f1, f2, bool1));
    f2 = this.h;
    float f3 = this.e;
    boolean bool2 = this.o;
    int i2 = (int)Math.ceil(b(f2, f3, bool2));
    paramRect.set(i2, i1, i2, i1);
    return true;
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.k = true;
  }
  
  public void setAlpha(int paramInt)
  {
    super.setAlpha(paramInt);
    this.b.setAlpha(paramInt);
    this.c.setAlpha(paramInt);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\j.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */