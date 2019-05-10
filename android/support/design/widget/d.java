package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v4.g.b;
import android.support.v4.g.c;
import android.support.v4.view.r;
import android.support.v7.appcompat.R.styleable;
import android.support.v7.widget.TintTypedArray;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.view.View;
import android.view.animation.Interpolator;

final class d
{
  private static final boolean a;
  private static final Paint b;
  private boolean A;
  private Bitmap B;
  private Paint C;
  private float D;
  private float E;
  private float F;
  private float G;
  private int[] H;
  private boolean I;
  private final TextPaint J;
  private Interpolator K;
  private Interpolator L;
  private float M;
  private float N;
  private float O;
  private int P;
  private float Q;
  private float R;
  private float S;
  private int T;
  private final View c;
  private boolean d;
  private float e;
  private final Rect f;
  private final Rect g;
  private final RectF h;
  private int i;
  private int j;
  private float k;
  private float l;
  private ColorStateList m;
  private ColorStateList n;
  private float o;
  private float p;
  private float q;
  private float r;
  private float s;
  private float t;
  private Typeface u;
  private Typeface v;
  private Typeface w;
  private CharSequence x;
  private CharSequence y;
  private boolean z;
  
  static
  {
    int i1 = 1;
    int i3 = Build.VERSION.SDK_INT;
    int i4 = 18;
    if (i3 < i4) {
      i3 = i1;
    }
    for (;;)
    {
      a = i3;
      i3 = 0;
      b = null;
      Paint localPaint = b;
      if (localPaint != null)
      {
        b.setAntiAlias(i1);
        localPaint = b;
        int i2 = -65281;
        localPaint.setColor(i2);
      }
      return;
      i3 = 0;
      localPaint = null;
    }
  }
  
  public d(View paramView)
  {
    this.i = i1;
    this.j = i1;
    this.k = f1;
    this.l = f1;
    this.c = paramView;
    Object localObject = new android/text/TextPaint;
    ((TextPaint)localObject).<init>(129);
    this.J = ((TextPaint)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.g = ((Rect)localObject);
    localObject = new android/graphics/Rect;
    ((Rect)localObject).<init>();
    this.f = ((Rect)localObject);
    localObject = new android/graphics/RectF;
    ((RectF)localObject).<init>();
    this.h = ((RectF)localObject);
  }
  
  private static float a(float paramFloat1, float paramFloat2, float paramFloat3, Interpolator paramInterpolator)
  {
    if (paramInterpolator != null) {
      paramFloat3 = paramInterpolator.getInterpolation(paramFloat3);
    }
    return a.a(paramFloat1, paramFloat2, paramFloat3);
  }
  
  private static int a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f1 = 1.0F - paramFloat;
    float f2 = Color.alpha(paramInt1) * f1;
    float f3 = Color.alpha(paramInt2) * paramFloat;
    f2 += f3;
    f3 = Color.red(paramInt1) * f1;
    float f4 = Color.red(paramInt2) * paramFloat;
    f3 += f4;
    f4 = Color.green(paramInt1) * f1;
    float f5 = Color.green(paramInt2) * paramFloat;
    f4 += f5;
    f5 = Color.blue(paramInt1);
    f1 *= f5;
    f5 = Color.blue(paramInt2) * paramFloat;
    f1 += f5;
    int i1 = (int)f2;
    int i2 = (int)f3;
    int i3 = (int)f4;
    int i4 = (int)f1;
    return Color.argb(i1, i2, i3, i4);
  }
  
  private static boolean a(float paramFloat1, float paramFloat2)
  {
    float f1 = Math.abs(paramFloat1 - paramFloat2);
    float f2 = 0.001F;
    boolean bool = f1 < f2;
    if (bool) {
      bool = true;
    }
    for (f1 = Float.MIN_VALUE;; f1 = 0.0F)
    {
      return bool;
      bool = false;
    }
  }
  
  private static boolean a(Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int i1 = paramRect.left;
    if (i1 == paramInt1)
    {
      i1 = paramRect.top;
      if (i1 == paramInt2)
      {
        i1 = paramRect.right;
        if (i1 == paramInt3)
        {
          i1 = paramRect.bottom;
          if (i1 != paramInt4) {}
        }
      }
    }
    for (i1 = 1;; i1 = 0) {
      return i1;
    }
  }
  
  private boolean a(Typeface paramTypeface1, Typeface paramTypeface2)
  {
    if (paramTypeface1 != null)
    {
      bool = paramTypeface1.equals(paramTypeface2);
      if (!bool) {}
    }
    else
    {
      if ((paramTypeface1 != null) || (paramTypeface2 == null)) {
        break label26;
      }
    }
    label26:
    for (boolean bool = true;; bool = false) {
      return bool;
    }
  }
  
  private boolean b(CharSequence paramCharSequence)
  {
    int i1 = 1;
    View localView = this.c;
    int i2 = r.e(localView);
    if (i2 == i1) {
      if (i1 == 0) {
        break label56;
      }
    }
    label56:
    for (b localb = c.d;; localb = c.c)
    {
      i2 = paramCharSequence.length();
      return localb.a(paramCharSequence, 0, i2);
      i1 = 0;
      localb = null;
      break;
    }
  }
  
  private void c(float paramFloat)
  {
    int i1 = 0;
    d(paramFloat);
    float f1 = this.q;
    float f2 = this.r;
    Interpolator localInterpolator = this.K;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    this.s = f1;
    f1 = this.o;
    f2 = this.p;
    localInterpolator = this.K;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    this.t = f1;
    f1 = this.k;
    f2 = this.l;
    localInterpolator = this.L;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    e(f1);
    Object localObject = this.n;
    ColorStateList localColorStateList = this.m;
    int i2;
    if (localObject != localColorStateList)
    {
      localObject = this.J;
      i2 = j();
      int i3 = k();
      i2 = a(i2, i3, paramFloat);
      ((TextPaint)localObject).setColor(i2);
    }
    for (;;)
    {
      localObject = this.J;
      f2 = this.Q;
      float f3 = this.M;
      f2 = a(f2, f3, paramFloat, null);
      f3 = this.R;
      float f4 = this.N;
      f3 = a(f3, f4, paramFloat, null);
      f4 = this.S;
      float f5 = this.O;
      f4 = a(f4, f5, paramFloat, null);
      int i4 = this.T;
      i1 = this.P;
      i4 = a(i4, i1, paramFloat);
      ((TextPaint)localObject).setShadowLayer(f2, f3, f4, i4);
      r.c(this.c);
      return;
      localObject = this.J;
      i2 = k();
      ((TextPaint)localObject).setColor(i2);
    }
  }
  
  /* Error */
  private Typeface d(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 101	android/support/design/widget/d:c	Landroid/view/View;
    //   4: invokevirtual 265	android/view/View:getContext	()Landroid/content/Context;
    //   7: astore_2
    //   8: iconst_1
    //   9: istore_3
    //   10: iload_3
    //   11: newarray <illegal type>
    //   13: astore 4
    //   15: ldc_w 266
    //   18: istore 5
    //   20: aload 4
    //   22: iconst_0
    //   23: iload 5
    //   25: iastore
    //   26: aload_2
    //   27: iload_1
    //   28: aload 4
    //   30: invokevirtual 273	android/content/Context:obtainStyledAttributes	(I[I)Landroid/content/res/TypedArray;
    //   33: astore 4
    //   35: aconst_null
    //   36: astore_2
    //   37: aload 4
    //   39: iconst_0
    //   40: invokevirtual 279	android/content/res/TypedArray:getString	(I)Ljava/lang/String;
    //   43: astore_2
    //   44: aload_2
    //   45: ifnull +19 -> 64
    //   48: iconst_0
    //   49: istore 5
    //   51: aload_2
    //   52: iconst_0
    //   53: invokestatic 283	android/graphics/Typeface:create	(Ljava/lang/String;I)Landroid/graphics/Typeface;
    //   56: astore_2
    //   57: aload 4
    //   59: invokevirtual 286	android/content/res/TypedArray:recycle	()V
    //   62: aload_2
    //   63: areturn
    //   64: aload 4
    //   66: invokevirtual 286	android/content/res/TypedArray:recycle	()V
    //   69: aconst_null
    //   70: astore_2
    //   71: goto -9 -> 62
    //   74: astore_2
    //   75: aload 4
    //   77: invokevirtual 286	android/content/res/TypedArray:recycle	()V
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	d
    //   0	82	1	paramInt	int
    //   7	64	2	localObject1	Object
    //   74	7	2	localObject2	Object
    //   9	2	3	i1	int
    //   13	63	4	localObject3	Object
    //   18	32	5	i2	int
    // Exception table:
    //   from	to	target	type
    //   39	43	74	finally
    //   52	56	74	finally
  }
  
  private void d(float paramFloat)
  {
    RectF localRectF = this.h;
    float f1 = this.f.left;
    float f2 = this.g.left;
    Interpolator localInterpolator = this.K;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    localRectF.left = f1;
    localRectF = this.h;
    f1 = this.o;
    f2 = this.p;
    localInterpolator = this.K;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    localRectF.top = f1;
    localRectF = this.h;
    f1 = this.f.right;
    f2 = this.g.right;
    localInterpolator = this.K;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    localRectF.right = f1;
    localRectF = this.h;
    f1 = this.f.bottom;
    f2 = this.g.bottom;
    localInterpolator = this.K;
    f1 = a(f1, f2, paramFloat, localInterpolator);
    localRectF.bottom = f1;
  }
  
  private void e(float paramFloat)
  {
    f(paramFloat);
    boolean bool = a;
    if (bool)
    {
      f1 = this.F;
      float f2 = 1.0F;
      bool = f1 < f2;
      if (bool) {
        bool = true;
      }
    }
    for (float f1 = Float.MIN_VALUE;; f1 = 0.0F)
    {
      this.A = bool;
      bool = this.A;
      if (bool) {
        m();
      }
      r.c(this.c);
      return;
      bool = false;
    }
  }
  
  private void f(float paramFloat)
  {
    float f1 = 1.0F;
    boolean bool1 = true;
    float f2 = Float.MIN_VALUE;
    TextUtils.TruncateAt localTruncateAt = null;
    Object localObject1 = this.x;
    if (localObject1 == null) {
      return;
    }
    float f3 = this.g.width();
    localObject1 = this.f;
    float f4 = ((Rect)localObject1).width();
    float f5 = this.l;
    boolean bool2 = a(paramFloat, f5);
    float f6;
    Typeface localTypeface1;
    if (bool2)
    {
      f6 = this.l;
      this.F = f1;
      localObject1 = this.w;
      localTypeface1 = this.u;
      bool2 = a((Typeface)localObject1, localTypeface1);
      if (!bool2) {
        break label546;
      }
      localObject1 = this.u;
      this.w = ((Typeface)localObject1);
      bool2 = bool1;
      f5 = f2;
    }
    for (;;)
    {
      f4 = 0.0F;
      localTypeface1 = null;
      boolean bool3 = f3 < 0.0F;
      label182:
      label271:
      Object localObject3;
      if (bool3)
      {
        f4 = this.G;
        bool3 = f4 < f6;
        if (!bool3)
        {
          bool3 = this.I;
          if ((!bool3) && (!bool2)) {}
        }
        else
        {
          bool2 = bool1;
          f5 = f2;
          this.G = f6;
          this.I = false;
        }
      }
      else
      {
        Object localObject2 = this.y;
        if ((localObject2 != null) && (!bool2)) {
          break;
        }
        localObject1 = this.J;
        f6 = this.G;
        ((TextPaint)localObject1).setTextSize(f6);
        localObject1 = this.J;
        localObject2 = this.w;
        ((TextPaint)localObject1).setTypeface((Typeface)localObject2);
        localObject1 = this.J;
        f6 = this.F;
        boolean bool4 = f6 < f1;
        if (!bool4) {
          break label523;
        }
        ((TextPaint)localObject1).setLinearText(bool1);
        localObject1 = this.x;
        localObject3 = this.J;
        localTruncateAt = TextUtils.TruncateAt.END;
        localObject1 = TextUtils.ellipsize((CharSequence)localObject1, (TextPaint)localObject3, f3, localTruncateAt);
        localObject3 = this.y;
        bool1 = TextUtils.equals((CharSequence)localObject1, (CharSequence)localObject3);
        if (bool1) {
          break;
        }
        this.y = ((CharSequence)localObject1);
        localObject1 = this.y;
        bool2 = b((CharSequence)localObject1);
        this.z = bool2;
        break;
        f6 = this.k;
        localObject1 = this.w;
        Typeface localTypeface2 = this.v;
        bool2 = a((Typeface)localObject1, localTypeface2);
        if (!bool2) {
          break label534;
        }
        localObject1 = this.v;
        this.w = ((Typeface)localObject1);
        bool2 = bool1;
      }
      for (f5 = f2;; f5 = 0.0F)
      {
        float f7 = this.k;
        boolean bool5 = a(paramFloat, f7);
        if (bool5) {}
        for (this.F = f1;; this.F = f7)
        {
          f7 = this.l;
          float f8 = this.k;
          f7 /= f8;
          f8 = f4 * f7;
          boolean bool6 = f8 < f3;
          if (!bool6) {
            break label504;
          }
          f3 = Math.min(f3 / f7, f4);
          break;
          f7 = this.k;
          f7 = paramFloat / f7;
        }
        label504:
        f3 = f4;
        break;
        bool2 = false;
        localObject1 = null;
        f5 = 0.0F;
        break label182;
        label523:
        bool1 = false;
        localObject3 = null;
        f2 = 0.0F;
        break label271;
        label534:
        bool2 = false;
        localObject1 = null;
      }
      label546:
      bool2 = false;
      localObject1 = null;
      f5 = 0.0F;
    }
  }
  
  private void i()
  {
    float f1 = this.e;
    c(f1);
  }
  
  private int j()
  {
    Object localObject = this.H;
    int[] arrayOfInt;
    if (localObject != null)
    {
      localObject = this.m;
      arrayOfInt = this.H;
    }
    for (int i1 = ((ColorStateList)localObject).getColorForState(arrayOfInt, 0);; i1 = ((ColorStateList)localObject).getDefaultColor())
    {
      return i1;
      localObject = this.m;
    }
  }
  
  private int k()
  {
    Object localObject = this.H;
    int[] arrayOfInt;
    if (localObject != null)
    {
      localObject = this.n;
      arrayOfInt = this.H;
    }
    for (int i1 = ((ColorStateList)localObject).getColorForState(arrayOfInt, 0);; i1 = ((ColorStateList)localObject).getDefaultColor())
    {
      return i1;
      localObject = this.n;
    }
  }
  
  private void l()
  {
    int i1 = 8388615;
    int i2 = 1;
    float f1 = Float.MIN_VALUE;
    float f2 = 0.0F;
    CharSequence localCharSequence = null;
    float f3 = 2.0F;
    float f4 = this.G;
    float f5 = this.l;
    f(f5);
    Object localObject1 = this.y;
    Object localObject2;
    Object localObject3;
    int i3;
    float f6;
    label111:
    float f7;
    float f8;
    Object localObject4;
    label235:
    int i8;
    label292:
    label371:
    int i6;
    Object localObject5;
    if (localObject1 != null)
    {
      localObject1 = this.J;
      localObject2 = this.y;
      localObject3 = this.y;
      i3 = ((CharSequence)localObject3).length();
      f5 = ((TextPaint)localObject1).measureText((CharSequence)localObject2, 0, i3);
      i3 = this.j;
      int i4 = this.z;
      if (i4 == 0) {
        break label567;
      }
      i4 = i2;
      f6 = f1;
      int i5 = android.support.v4.view.d.a(i3, i4);
      i3 = i5 & 0x70;
      switch (i3)
      {
      default: 
        localObject3 = this.J;
        f7 = ((TextPaint)localObject3).descent();
        f8 = this.J.ascent();
        f7 = (f7 - f8) / f3;
        f8 = this.J.descent();
        f7 -= f8;
        localObject4 = this.g;
        int i7 = ((Rect)localObject4).centerY();
        f8 = i7;
        f7 += f8;
        this.p = f7;
        i5 &= i1;
        switch (i5)
        {
        default: 
          localObject1 = this.g;
          i8 = ((Rect)localObject1).left;
          f5 = i8;
          this.r = f5;
          f5 = this.k;
          f(f5);
          localObject1 = this.y;
          if (localObject1 != null)
          {
            localObject1 = this.J;
            localCharSequence = this.y;
            localObject2 = this.y;
            i5 = ((CharSequence)localObject2).length();
            f2 = ((TextPaint)localObject1).measureText(localCharSequence, 0, i5);
          }
          i8 = this.i;
          boolean bool = this.z;
          if (bool)
          {
            i8 = android.support.v4.view.d.a(i8, i2);
            i6 = i8 & 0x70;
            switch (i6)
            {
            default: 
              localObject2 = this.J;
              f6 = ((TextPaint)localObject2).descent();
              f1 = this.J.ascent();
              f6 = (f6 - f1) / f3;
              f1 = this.J.descent();
              f6 -= f1;
              localObject5 = this.f;
              i2 = ((Rect)localObject5).centerY();
              f1 = i2;
              f6 += f1;
              this.o = f6;
              label487:
              i8 &= i1;
              switch (i8)
              {
              default: 
                localObject1 = this.f;
                i8 = ((Rect)localObject1).left;
                f5 = i8;
                this.q = f5;
              }
              break;
            }
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      n();
      e(f4);
      return;
      i8 = 0;
      localObject1 = null;
      f5 = 0.0F;
      break;
      label567:
      i6 = 0;
      localObject2 = null;
      f6 = 0.0F;
      break label111;
      localObject3 = this.g;
      i3 = ((Rect)localObject3).bottom;
      f7 = i3;
      this.p = f7;
      break label235;
      localObject3 = this.g;
      i3 = ((Rect)localObject3).top;
      f7 = i3;
      localObject4 = this.J;
      f8 = ((TextPaint)localObject4).ascent();
      f7 -= f8;
      this.p = f7;
      break label235;
      localObject2 = this.g;
      i6 = ((Rect)localObject2).centerX();
      f6 = i6;
      f5 /= f3;
      f5 = f6 - f5;
      this.r = f5;
      break label292;
      localObject2 = this.g;
      i6 = ((Rect)localObject2).right;
      f6 = i6;
      f5 = f6 - f5;
      this.r = f5;
      break label292;
      i2 = 0;
      localObject5 = null;
      f1 = 0.0F;
      break label371;
      localObject2 = this.f;
      i6 = ((Rect)localObject2).bottom;
      f6 = i6;
      this.o = f6;
      break label487;
      localObject2 = this.f;
      i6 = ((Rect)localObject2).top;
      f6 = i6;
      localObject5 = this.J;
      f1 = ((TextPaint)localObject5).ascent();
      f6 -= f1;
      this.o = f6;
      break label487;
      localObject1 = this.f;
      i8 = ((Rect)localObject1).centerX();
      f5 = i8;
      f2 /= f3;
      f5 -= f2;
      this.q = f5;
      continue;
      localObject1 = this.f;
      i8 = ((Rect)localObject1).right;
      f5 = i8 - f2;
      this.q = f5;
    }
  }
  
  private void m()
  {
    Object localObject1 = this.B;
    if (localObject1 == null)
    {
      localObject1 = this.f;
      boolean bool = ((Rect)localObject1).isEmpty();
      if (!bool)
      {
        localObject1 = this.y;
        bool = TextUtils.isEmpty((CharSequence)localObject1);
        if (!bool) {
          break label38;
        }
      }
    }
    for (;;)
    {
      return;
      label38:
      c(0.0F);
      float f1 = this.J.ascent();
      this.D = f1;
      f1 = this.J.descent();
      this.E = f1;
      localObject1 = this.J;
      Object localObject2 = this.y;
      CharSequence localCharSequence = this.y;
      int i2 = localCharSequence.length();
      f1 = ((TextPaint)localObject1).measureText((CharSequence)localObject2, 0, i2);
      int i1 = Math.round(f1);
      float f2 = this.E;
      float f3 = this.D;
      f2 -= f3;
      int i3 = Math.round(f2);
      if ((i1 > 0) && (i3 > 0))
      {
        localObject2 = Bitmap.Config.ARGB_8888;
        localObject1 = Bitmap.createBitmap(i1, i3, (Bitmap.Config)localObject2);
        this.B = ((Bitmap)localObject1);
        localObject1 = new android/graphics/Canvas;
        localObject2 = this.B;
        ((Canvas)localObject1).<init>((Bitmap)localObject2);
        localObject2 = this.y;
        localCharSequence = this.y;
        i2 = localCharSequence.length();
        float f4 = i3;
        float f5 = this.J.descent();
        f4 -= f5;
        TextPaint localTextPaint = this.J;
        ((Canvas)localObject1).drawText((CharSequence)localObject2, 0, i2, 0.0F, f4, localTextPaint);
        localObject1 = this.C;
        if (localObject1 == null)
        {
          localObject1 = new android/graphics/Paint;
          int i4 = 3;
          f2 = 4.2E-45F;
          ((Paint)localObject1).<init>(i4);
          this.C = ((Paint)localObject1);
        }
      }
    }
  }
  
  private void n()
  {
    Bitmap localBitmap = this.B;
    if (localBitmap != null)
    {
      this.B.recycle();
      localBitmap = null;
      this.B = null;
    }
  }
  
  void a()
  {
    Rect localRect = this.g;
    int i1 = localRect.width();
    if (i1 > 0)
    {
      localRect = this.g;
      i1 = localRect.height();
      if (i1 > 0)
      {
        localRect = this.f;
        i1 = localRect.width();
        if (i1 > 0)
        {
          localRect = this.f;
          i1 = localRect.height();
          if (i1 > 0) {
            i1 = 1;
          }
        }
      }
    }
    for (;;)
    {
      this.d = i1;
      return;
      i1 = 0;
      localRect = null;
    }
  }
  
  void a(float paramFloat)
  {
    float f1 = this.k;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.k = paramFloat;
      f();
    }
  }
  
  void a(int paramInt)
  {
    int i1 = this.i;
    if (i1 != paramInt)
    {
      this.i = paramInt;
      f();
    }
  }
  
  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = this.f;
    boolean bool = a(localRect, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!bool)
    {
      localRect = this.f;
      localRect.set(paramInt1, paramInt2, paramInt3, paramInt4);
      bool = true;
      this.I = bool;
      a();
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.n;
    if (localColorStateList != paramColorStateList)
    {
      this.n = paramColorStateList;
      f();
    }
  }
  
  public void a(Canvas paramCanvas)
  {
    int i1 = paramCanvas.save();
    Object localObject1 = this.y;
    float f1;
    float f2;
    float f3;
    boolean bool2;
    float f4;
    float f5;
    label111:
    int i2;
    Object localObject2;
    if (localObject1 != null)
    {
      boolean bool1 = this.d;
      if (bool1)
      {
        f1 = this.s;
        f2 = this.t;
        bool1 = this.A;
        if (!bool1) {
          break label206;
        }
        localObject1 = this.B;
        if (localObject1 == null) {
          break label206;
        }
        bool1 = true;
        f3 = Float.MIN_VALUE;
        bool2 = bool1;
        if (!bool2) {
          break label215;
        }
        f3 = this.D;
        f4 = this.F;
        f3 *= f4;
        f4 = this.E;
        f5 = this.F;
        f4 *= f5;
        if (bool2) {
          f2 += f3;
        }
        f3 = this.F;
        i2 = 1065353216;
        f4 = 1.0F;
        bool1 = f3 < f4;
        if (bool1)
        {
          f3 = this.F;
          f4 = this.F;
          paramCanvas.scale(f3, f4, f1, f2);
        }
        if (!bool2) {
          break label268;
        }
        localObject1 = this.B;
        localObject2 = this.C;
        paramCanvas.drawBitmap((Bitmap)localObject1, f1, f2, (Paint)localObject2);
      }
    }
    for (;;)
    {
      paramCanvas.restoreToCount(i1);
      return;
      label206:
      bool2 = false;
      localObject2 = null;
      break;
      label215:
      localObject1 = this.J;
      f3 = ((TextPaint)localObject1).ascent();
      f4 = this.F;
      f3 *= f4;
      TextPaint localTextPaint1 = this.J;
      f4 = localTextPaint1.descent();
      f5 = this.F;
      f4 *= f5;
      break label111;
      label268:
      localObject2 = this.y;
      i2 = this.y.length();
      TextPaint localTextPaint2 = this.J;
      localObject1 = paramCanvas;
      paramCanvas.drawText((CharSequence)localObject2, 0, i2, f1, f2, localTextPaint2);
    }
  }
  
  void a(Typeface paramTypeface)
  {
    this.v = paramTypeface;
    this.u = paramTypeface;
    f();
  }
  
  void a(Interpolator paramInterpolator)
  {
    this.L = paramInterpolator;
    f();
  }
  
  void a(CharSequence paramCharSequence)
  {
    CharSequence localCharSequence;
    boolean bool;
    if (paramCharSequence != null)
    {
      localCharSequence = this.x;
      bool = paramCharSequence.equals(localCharSequence);
      if (bool) {}
    }
    else
    {
      this.x = paramCharSequence;
      bool = false;
      localCharSequence = null;
      this.y = null;
      n();
      f();
    }
  }
  
  final boolean a(int[] paramArrayOfInt)
  {
    this.H = paramArrayOfInt;
    boolean bool = c();
    if (bool) {
      f();
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  Typeface b()
  {
    Typeface localTypeface = this.u;
    if (localTypeface != null) {}
    for (localTypeface = this.u;; localTypeface = Typeface.DEFAULT) {
      return localTypeface;
    }
  }
  
  void b(float paramFloat)
  {
    float f1 = android.support.v4.e.a.a(paramFloat, 0.0F, 1.0F);
    float f2 = this.e;
    boolean bool = f1 < f2;
    if (bool)
    {
      this.e = f1;
      i();
    }
  }
  
  void b(int paramInt)
  {
    int i1 = this.j;
    if (i1 != paramInt)
    {
      this.j = paramInt;
      f();
    }
  }
  
  void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = this.g;
    boolean bool = a(localRect, paramInt1, paramInt2, paramInt3, paramInt4);
    if (!bool)
    {
      localRect = this.g;
      localRect.set(paramInt1, paramInt2, paramInt3, paramInt4);
      bool = true;
      this.I = bool;
      a();
    }
  }
  
  void b(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.m;
    if (localColorStateList != paramColorStateList)
    {
      this.m = paramColorStateList;
      f();
    }
  }
  
  void b(Interpolator paramInterpolator)
  {
    this.K = paramInterpolator;
    f();
  }
  
  void c(int paramInt)
  {
    Object localObject1 = this.c.getContext();
    Object localObject2 = R.styleable.TextAppearance;
    localObject1 = TintTypedArray.obtainStyledAttributes((Context)localObject1, paramInt, (int[])localObject2);
    int i1 = R.styleable.TextAppearance_android_textColor;
    boolean bool1 = ((TintTypedArray)localObject1).hasValue(i1);
    if (bool1)
    {
      i2 = R.styleable.TextAppearance_android_textColor;
      localObject2 = ((TintTypedArray)localObject1).getColorStateList(i2);
      this.n = ((ColorStateList)localObject2);
    }
    int i2 = R.styleable.TextAppearance_android_textSize;
    boolean bool2 = ((TintTypedArray)localObject1).hasValue(i2);
    if (bool2)
    {
      i3 = R.styleable.TextAppearance_android_textSize;
      f1 = this.l;
      i4 = (int)f1;
      i3 = ((TintTypedArray)localObject1).getDimensionPixelSize(i3, i4);
      f2 = i3;
      this.l = f2;
    }
    int i3 = R.styleable.TextAppearance_android_shadowColor;
    int i4 = 0;
    float f1 = 0.0F;
    i3 = ((TintTypedArray)localObject1).getInt(i3, 0);
    this.P = i3;
    i3 = R.styleable.TextAppearance_android_shadowDx;
    float f2 = ((TintTypedArray)localObject1).getFloat(i3, 0.0F);
    this.N = f2;
    i3 = R.styleable.TextAppearance_android_shadowDy;
    f2 = ((TintTypedArray)localObject1).getFloat(i3, 0.0F);
    this.O = f2;
    i3 = R.styleable.TextAppearance_android_shadowRadius;
    f2 = ((TintTypedArray)localObject1).getFloat(i3, 0.0F);
    this.M = f2;
    ((TintTypedArray)localObject1).recycle();
    int i5 = Build.VERSION.SDK_INT;
    i3 = 16;
    f2 = 2.24E-44F;
    if (i5 >= i3)
    {
      localObject1 = d(paramInt);
      this.u = ((Typeface)localObject1);
    }
    f();
  }
  
  final boolean c()
  {
    ColorStateList localColorStateList = this.n;
    if (localColorStateList != null)
    {
      localColorStateList = this.n;
      bool = localColorStateList.isStateful();
      if (bool) {}
    }
    else
    {
      localColorStateList = this.m;
      if (localColorStateList == null) {
        break label50;
      }
      localColorStateList = this.m;
      bool = localColorStateList.isStateful();
      if (!bool) {
        break label50;
      }
    }
    boolean bool = true;
    for (;;)
    {
      return bool;
      label50:
      bool = false;
      localColorStateList = null;
    }
  }
  
  float d()
  {
    return this.e;
  }
  
  float e()
  {
    return this.l;
  }
  
  public void f()
  {
    View localView = this.c;
    int i1 = localView.getHeight();
    if (i1 > 0)
    {
      localView = this.c;
      i1 = localView.getWidth();
      if (i1 > 0)
      {
        l();
        i();
      }
    }
  }
  
  CharSequence g()
  {
    return this.x;
  }
  
  ColorStateList h()
  {
    return this.n;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */