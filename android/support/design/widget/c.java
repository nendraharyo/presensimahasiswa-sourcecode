package android.support.design.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.v4.b.a;

class c
  extends Drawable
{
  final Paint a;
  final Rect b;
  final RectF c;
  float d;
  private int e;
  private int f;
  private int g;
  private int h;
  private ColorStateList i;
  private int j;
  private boolean k;
  private float l;
  
  private Shader a()
  {
    int m = 1;
    float f1 = 1.0F;
    float f2 = 0.5F;
    Rect localRect = this.b;
    copyBounds(localRect);
    float f3 = this.d;
    float f4 = localRect.height();
    f3 /= f4;
    int[] arrayOfInt = new int[6];
    int n = this.e;
    int i1 = this.j;
    n = a.a(n, i1);
    arrayOfInt[0] = n;
    n = this.f;
    i1 = this.j;
    n = a.a(n, i1);
    arrayOfInt[m] = n;
    i1 = a.b(this.f, 0);
    int i2 = this.j;
    i1 = a.a(i1, i2);
    arrayOfInt[2] = i1;
    i1 = a.b(this.h, 0);
    i2 = this.j;
    i1 = a.a(i1, i2);
    arrayOfInt[3] = i1;
    i1 = this.h;
    i2 = this.j;
    i1 = a.a(i1, i2);
    arrayOfInt[4] = i1;
    i1 = this.g;
    i2 = this.j;
    i1 = a.a(i1, i2);
    arrayOfInt[5] = i1;
    float[] arrayOfFloat = new float[6];
    arrayOfFloat[0] = 0.0F;
    arrayOfFloat[m] = f3;
    arrayOfFloat[2] = f2;
    arrayOfFloat[3] = f2;
    f3 = f1 - f3;
    arrayOfFloat[4] = f3;
    arrayOfFloat[5] = f1;
    LinearGradient localLinearGradient = new android/graphics/LinearGradient;
    f4 = localRect.top;
    float f5 = localRect.bottom;
    Shader.TileMode localTileMode = Shader.TileMode.CLAMP;
    localLinearGradient.<init>(0.0F, f4, 0.0F, f5, arrayOfInt, arrayOfFloat, localTileMode);
    return localLinearGradient;
  }
  
  final void a(float paramFloat)
  {
    float f1 = this.l;
    boolean bool = paramFloat < f1;
    if (bool)
    {
      this.l = paramFloat;
      invalidateSelf();
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    if (paramColorStateList != null)
    {
      int[] arrayOfInt = getState();
      int m = this.j;
      int n = paramColorStateList.getColorForState(arrayOfInt, m);
      this.j = n;
    }
    this.i = paramColorStateList;
    this.k = true;
    invalidateSelf();
  }
  
  public void draw(Canvas paramCanvas)
  {
    boolean bool = this.k;
    if (bool)
    {
      localPaint = this.a;
      localObject = a();
      localPaint.setShader((Shader)localObject);
      bool = false;
      f1 = 0.0F;
      localPaint = null;
      this.k = false;
    }
    float f1 = this.a.getStrokeWidth() / 2.0F;
    Object localObject = this.c;
    Rect localRect = this.b;
    copyBounds(localRect);
    localRect = this.b;
    ((RectF)localObject).set(localRect);
    float f2 = ((RectF)localObject).left + f1;
    ((RectF)localObject).left = f2;
    f2 = ((RectF)localObject).top + f1;
    ((RectF)localObject).top = f2;
    f2 = ((RectF)localObject).right - f1;
    ((RectF)localObject).right = f2;
    f1 = ((RectF)localObject).bottom - f1;
    ((RectF)localObject).bottom = f1;
    paramCanvas.save();
    f1 = this.l;
    f2 = ((RectF)localObject).centerX();
    float f3 = ((RectF)localObject).centerY();
    paramCanvas.rotate(f1, f2, f3);
    Paint localPaint = this.a;
    paramCanvas.drawOval((RectF)localObject, localPaint);
    paramCanvas.restore();
  }
  
  public int getOpacity()
  {
    float f1 = this.d;
    boolean bool = f1 < 0.0F;
    int m;
    if (bool) {
      m = -3;
    }
    for (f1 = 0.0F / 0.0F;; f1 = 0.0F / 0.0F)
    {
      return m;
      m = -2;
    }
  }
  
  public boolean getPadding(Rect paramRect)
  {
    int m = Math.round(this.d);
    paramRect.set(m, m, m, m);
    return true;
  }
  
  public boolean isStateful()
  {
    ColorStateList localColorStateList = this.i;
    if (localColorStateList != null)
    {
      localColorStateList = this.i;
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      bool = super.isStateful();
      if (!bool) {
        break label36;
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label36:
      bool = false;
      localColorStateList = null;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    this.k = true;
  }
  
  protected boolean onStateChange(int[] paramArrayOfInt)
  {
    ColorStateList localColorStateList = this.i;
    if (localColorStateList != null)
    {
      localColorStateList = this.i;
      int m = this.j;
      int n = localColorStateList.getColorForState(paramArrayOfInt, m);
      m = this.j;
      if (n != m)
      {
        m = 1;
        this.k = m;
        this.j = n;
      }
    }
    boolean bool = this.k;
    if (bool) {
      invalidateSelf();
    }
    return this.k;
  }
  
  public void setAlpha(int paramInt)
  {
    this.a.setAlpha(paramInt);
    invalidateSelf();
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.a.setColorFilter(paramColorFilter);
    invalidateSelf();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */