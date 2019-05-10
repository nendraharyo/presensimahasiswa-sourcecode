package android.support.design.widget;

import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.animation.Interpolator;

class f
{
  static final Interpolator a;
  static final int[] j;
  static final int[] k;
  static final int[] l;
  static final int[] m = new int[0];
  int b = 0;
  j c;
  Drawable d;
  Drawable e;
  c f;
  Drawable g;
  float h;
  float i;
  final t n;
  final k o;
  private final m p;
  private float q;
  private final Rect r;
  private ViewTreeObserver.OnPreDrawListener s;
  
  static
  {
    int i1 = 2;
    a = a.c;
    int[] arrayOfInt = new int[i1];
    int[] tmp13_12 = arrayOfInt;
    tmp13_12[0] = 16842919;
    tmp13_12[1] = 16842910;
    j = arrayOfInt;
    arrayOfInt = new int[i1];
    int[] tmp31_30 = arrayOfInt;
    tmp31_30[0] = 16842908;
    tmp31_30[1] = 16842910;
    k = arrayOfInt;
    arrayOfInt = new int[1];
    arrayOfInt[0] = 16842910;
    l = arrayOfInt;
  }
  
  f(t paramt, k paramk)
  {
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.r = ((Rect)localObject1);
    this.n = paramt;
    this.o = paramk;
    localObject1 = new android/support/design/widget/m;
    ((m)localObject1).<init>();
    this.p = ((m)localObject1);
    localObject1 = this.p;
    int[] arrayOfInt = j;
    Object localObject2 = new android/support/design/widget/f$b;
    ((f.b)localObject2).<init>(this);
    localObject2 = a((f.e)localObject2);
    ((m)localObject1).a(arrayOfInt, (ValueAnimator)localObject2);
    localObject1 = this.p;
    arrayOfInt = k;
    localObject2 = new android/support/design/widget/f$b;
    ((f.b)localObject2).<init>(this);
    localObject2 = a((f.e)localObject2);
    ((m)localObject1).a(arrayOfInt, (ValueAnimator)localObject2);
    localObject1 = this.p;
    arrayOfInt = l;
    localObject2 = new android/support/design/widget/f$d;
    ((f.d)localObject2).<init>(this);
    localObject2 = a((f.e)localObject2);
    ((m)localObject1).a(arrayOfInt, (ValueAnimator)localObject2);
    localObject1 = this.p;
    arrayOfInt = m;
    localObject2 = new android/support/design/widget/f$a;
    ((f.a)localObject2).<init>(this);
    localObject2 = a((f.e)localObject2);
    ((m)localObject1).a(arrayOfInt, (ValueAnimator)localObject2);
    float f1 = this.n.getRotation();
    this.q = f1;
  }
  
  private ValueAnimator a(f.e parame)
  {
    ValueAnimator localValueAnimator = new android/animation/ValueAnimator;
    localValueAnimator.<init>();
    Object localObject = a;
    localValueAnimator.setInterpolator((TimeInterpolator)localObject);
    localValueAnimator.setDuration(100);
    localValueAnimator.addListener(parame);
    localValueAnimator.addUpdateListener(parame);
    localObject = new float[2];
    Object tmp40_39 = localObject;
    tmp40_39[0] = 0.0F;
    tmp40_39[1] = 1.0F;
    localValueAnimator.setFloatValues((float[])localObject);
    return localValueAnimator;
  }
  
  private static ColorStateList b(int paramInt)
  {
    int i1 = 3;
    int[][] arrayOfInt = new int[i1][];
    int[] arrayOfInt1 = new int[i1];
    Object localObject = k;
    arrayOfInt[0] = localObject;
    arrayOfInt1[0] = paramInt;
    int i2 = 1;
    int[] arrayOfInt2 = j;
    arrayOfInt[i2] = arrayOfInt2;
    arrayOfInt1[i2] = paramInt;
    i2 = 2;
    arrayOfInt2 = new int[0];
    arrayOfInt[i2] = arrayOfInt2;
    arrayOfInt1[i2] = 0;
    localObject = new android/content/res/ColorStateList;
    ((ColorStateList)localObject).<init>(arrayOfInt, arrayOfInt1);
    return (ColorStateList)localObject;
  }
  
  private void l()
  {
    Object localObject = this.s;
    if (localObject == null)
    {
      localObject = new android/support/design/widget/f$3;
      ((f.3)localObject).<init>(this);
      this.s = ((ViewTreeObserver.OnPreDrawListener)localObject);
    }
  }
  
  private boolean m()
  {
    t localt = this.n;
    boolean bool = r.w(localt);
    if (bool)
    {
      localt = this.n;
      bool = localt.isInEditMode();
      if (!bool) {
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localt = null;
    }
  }
  
  private void n()
  {
    int i1 = 1;
    int i2 = Build.VERSION.SDK_INT;
    int i4 = 19;
    float f1 = 2.7E-44F;
    Object localObject;
    int i3;
    if (i2 == i4)
    {
      float f2 = this.q % 90.0F;
      i4 = 0;
      f1 = 0.0F;
      boolean bool = f2 < 0.0F;
      if (!bool) {
        break label134;
      }
      localObject = this.n;
      i3 = ((t)localObject).getLayerType();
      if (i3 != i1)
      {
        localObject = this.n;
        ((t)localObject).setLayerType(i1, null);
      }
    }
    for (;;)
    {
      localObject = this.c;
      if (localObject != null)
      {
        localObject = this.c;
        f1 = -this.q;
        ((j)localObject).a(f1);
      }
      localObject = this.f;
      if (localObject != null)
      {
        localObject = this.f;
        f1 = -this.q;
        ((c)localObject).a(f1);
      }
      return;
      label134:
      localObject = this.n;
      i3 = ((t)localObject).getLayerType();
      if (i3 != 0)
      {
        localObject = this.n;
        i4 = 0;
        f1 = 0.0F;
        ((t)localObject).setLayerType(0, null);
      }
    }
  }
  
  float a()
  {
    return this.h;
  }
  
  final void a(float paramFloat)
  {
    float f1 = this.h;
    boolean bool = f1 < paramFloat;
    if (bool)
    {
      this.h = paramFloat;
      f1 = this.i;
      a(paramFloat, f1);
    }
  }
  
  void a(float paramFloat1, float paramFloat2)
  {
    j localj = this.c;
    if (localj != null)
    {
      localj = this.c;
      float f1 = this.i + paramFloat1;
      localj.a(paramFloat1, f1);
      e();
    }
  }
  
  void a(int paramInt)
  {
    Drawable localDrawable = this.e;
    if (localDrawable != null)
    {
      localDrawable = this.e;
      ColorStateList localColorStateList = b(paramInt);
      android.support.v4.b.a.a.a(localDrawable, localColorStateList);
    }
  }
  
  void a(ColorStateList paramColorStateList)
  {
    Object localObject = this.d;
    if (localObject != null)
    {
      localObject = this.d;
      android.support.v4.b.a.a.a((Drawable)localObject, paramColorStateList);
    }
    localObject = this.f;
    if (localObject != null)
    {
      localObject = this.f;
      ((c)localObject).a(paramColorStateList);
    }
  }
  
  void a(PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = this.d;
    if (localDrawable != null)
    {
      localDrawable = this.d;
      android.support.v4.b.a.a.a(localDrawable, paramMode);
    }
  }
  
  void a(Rect paramRect)
  {
    this.c.getPadding(paramRect);
  }
  
  void a(f.c paramc, boolean paramBoolean)
  {
    Object localObject = null;
    int i1 = k();
    if (i1 != 0) {}
    for (;;)
    {
      return;
      ViewPropertyAnimator localViewPropertyAnimator = this.n.animate();
      localViewPropertyAnimator.cancel();
      i1 = m();
      if (i1 == 0) {
        break;
      }
      i1 = 1;
      this.b = i1;
      localViewPropertyAnimator = this.n.animate().scaleX(0.0F).scaleY(0.0F).alpha(0.0F);
      long l1 = 200L;
      localViewPropertyAnimator = localViewPropertyAnimator.setDuration(l1);
      localObject = a.c;
      localViewPropertyAnimator = localViewPropertyAnimator.setInterpolator((TimeInterpolator)localObject);
      localObject = new android/support/design/widget/f$1;
      ((f.1)localObject).<init>(this, paramBoolean, paramc);
      localViewPropertyAnimator.setListener((Animator.AnimatorListener)localObject);
    }
    localObject = this.n;
    if (paramBoolean) {}
    for (int i2 = 8;; i2 = 4)
    {
      ((t)localObject).a(i2, paramBoolean);
      if (paramc == null) {
        break;
      }
      paramc.b();
      break;
    }
  }
  
  void a(int[] paramArrayOfInt)
  {
    this.p.a(paramArrayOfInt);
  }
  
  void b()
  {
    this.p.a();
  }
  
  void b(Rect paramRect) {}
  
  void b(f.c paramc, boolean paramBoolean)
  {
    Object localObject1 = null;
    float f1 = 1.0F;
    boolean bool = j();
    if (bool) {}
    for (;;)
    {
      return;
      Object localObject2 = this.n.animate();
      ((ViewPropertyAnimator)localObject2).cancel();
      bool = m();
      if (bool)
      {
        this.b = 2;
        localObject2 = this.n;
        int i1 = ((t)localObject2).getVisibility();
        if (i1 != 0)
        {
          this.n.setAlpha(0.0F);
          this.n.setScaleY(0.0F);
          localObject2 = this.n;
          ((t)localObject2).setScaleX(0.0F);
        }
        localObject2 = this.n.animate().scaleX(f1).scaleY(f1).alpha(f1);
        long l1 = 200L;
        localObject2 = ((ViewPropertyAnimator)localObject2).setDuration(l1);
        localObject1 = a.d;
        localObject2 = ((ViewPropertyAnimator)localObject2).setInterpolator((TimeInterpolator)localObject1);
        localObject1 = new android/support/design/widget/f$2;
        ((f.2)localObject1).<init>(this, paramBoolean, paramc);
        ((ViewPropertyAnimator)localObject2).setListener((Animator.AnimatorListener)localObject1);
      }
      else
      {
        localObject2 = this.n;
        localObject1 = null;
        ((t)localObject2).a(0, paramBoolean);
        this.n.setAlpha(f1);
        this.n.setScaleY(f1);
        localObject2 = this.n;
        ((t)localObject2).setScaleX(f1);
        if (paramc != null) {
          paramc.a();
        }
      }
    }
  }
  
  final Drawable c()
  {
    return this.g;
  }
  
  void d() {}
  
  final void e()
  {
    Rect localRect = this.r;
    a(localRect);
    b(localRect);
    k localk = this.o;
    int i1 = localRect.left;
    int i2 = localRect.top;
    int i3 = localRect.right;
    int i4 = localRect.bottom;
    localk.a(i1, i2, i3, i4);
  }
  
  void f()
  {
    boolean bool = h();
    if (bool)
    {
      l();
      ViewTreeObserver localViewTreeObserver = this.n.getViewTreeObserver();
      ViewTreeObserver.OnPreDrawListener localOnPreDrawListener = this.s;
      localViewTreeObserver.addOnPreDrawListener(localOnPreDrawListener);
    }
  }
  
  void g()
  {
    Object localObject = this.s;
    if (localObject != null)
    {
      localObject = this.n.getViewTreeObserver();
      ViewTreeObserver.OnPreDrawListener localOnPreDrawListener = this.s;
      ((ViewTreeObserver)localObject).removeOnPreDrawListener(localOnPreDrawListener);
      localObject = null;
      this.s = null;
    }
  }
  
  boolean h()
  {
    return true;
  }
  
  void i()
  {
    t localt = this.n;
    float f1 = localt.getRotation();
    float f2 = this.q;
    boolean bool = f2 < f1;
    if (bool)
    {
      this.q = f1;
      n();
    }
  }
  
  boolean j()
  {
    int i1 = 1;
    t localt = this.n;
    int i2 = localt.getVisibility();
    if (i2 != 0)
    {
      i2 = this.b;
      int i3 = 2;
      if (i2 != i3) {}
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      continue;
      i2 = this.b;
      if (i2 == i1) {
        i1 = 0;
      }
    }
  }
  
  boolean k()
  {
    int i1 = 1;
    t localt = this.n;
    int i2 = localt.getVisibility();
    if (i2 == 0)
    {
      i2 = this.b;
      if (i2 != i1) {}
    }
    for (;;)
    {
      return i1;
      i1 = 0;
      continue;
      int i3 = this.b;
      int i4 = 2;
      if (i3 == i4) {
        i1 = 0;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */