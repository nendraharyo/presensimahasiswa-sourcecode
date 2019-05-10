package android.support.v4.widget;

import android.content.res.Resources;
import android.os.SystemClock;
import android.support.v4.view.r;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;

public abstract class a
  implements View.OnTouchListener
{
  private static final int r = ;
  final a.a a;
  final View b;
  boolean c;
  boolean d;
  boolean e;
  private final Interpolator f;
  private Runnable g;
  private float[] h;
  private float[] i;
  private int j;
  private int k;
  private float[] l;
  private float[] m;
  private float[] n;
  private boolean o;
  private boolean p;
  private boolean q;
  
  public a(View paramView)
  {
    Object localObject = new android/support/v4/widget/a$a;
    ((a.a)localObject).<init>();
    this.a = ((a.a)localObject);
    localObject = new android/view/animation/AccelerateInterpolator;
    ((AccelerateInterpolator)localObject).<init>();
    this.f = ((Interpolator)localObject);
    localObject = new float[i1];
    Object tmp61_59 = localObject;
    tmp61_59[0] = 0.0F;
    tmp61_59[1] = 0.0F;
    this.h = ((float[])localObject);
    localObject = new float[i1];
    Object tmp82_80 = localObject;
    tmp82_80[0] = Float.MAX_VALUE;
    tmp82_80[1] = Float.MAX_VALUE;
    this.i = ((float[])localObject);
    localObject = new float[i1];
    Object tmp105_103 = localObject;
    tmp105_103[0] = 0.0F;
    tmp105_103[1] = 0.0F;
    this.l = ((float[])localObject);
    localObject = new float[i1];
    Object tmp126_124 = localObject;
    tmp126_124[0] = 0.0F;
    tmp126_124[1] = 0.0F;
    this.m = ((float[])localObject);
    localObject = new float[i1];
    Object tmp147_145 = localObject;
    tmp147_145[0] = Float.MAX_VALUE;
    tmp147_145[1] = Float.MAX_VALUE;
    this.n = ((float[])localObject);
    this.b = paramView;
    localObject = Resources.getSystem().getDisplayMetrics();
    float f5 = ((DisplayMetrics)localObject).density;
    i1 = (int)(1575.0F * f5 + f3);
    int i2 = (int)(((DisplayMetrics)localObject).density * 315.0F + f3);
    f5 = i1;
    float f6 = i1;
    a(f5, f6);
    f6 = i2;
    float f7 = i2;
    b(f6, f7);
    a(1);
    e(f1, f1);
    d(f4, f4);
    c(f2, f2);
    i2 = r;
    b(i2);
    c(500);
    d(500);
  }
  
  static float a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool = paramFloat1 < paramFloat3;
    if (bool) {}
    for (;;)
    {
      return paramFloat3;
      bool = paramFloat1 < paramFloat2;
      if (bool) {
        paramFloat3 = paramFloat2;
      } else {
        paramFloat3 = paramFloat1;
      }
    }
  }
  
  private float a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    float f1 = 0.0F;
    Interpolator localInterpolator = null;
    float f2 = a(paramFloat1 * paramFloat2, 0.0F, paramFloat3);
    float f3 = f(paramFloat4, f2);
    float f4 = paramFloat2 - paramFloat4;
    f2 = f(f4, f2) - f3;
    boolean bool1 = f2 < 0.0F;
    if (bool1)
    {
      localInterpolator = this.f;
      f2 = -f2;
    }
    for (f1 = -localInterpolator.getInterpolation(f2);; f1 = localInterpolator.getInterpolation(f2))
    {
      f2 = -1.0F;
      int i1 = 1065353216;
      f3 = 1.0F;
      f1 = a(f1, f2, f3);
      boolean bool2;
      do
      {
        return f1;
        bool2 = f2 < 0.0F;
      } while (!bool2);
      localInterpolator = this.f;
    }
  }
  
  private float a(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3)
  {
    boolean bool1 = false;
    float f1 = 0.0F;
    float[] arrayOfFloat1 = this.h;
    float f2 = arrayOfFloat1[paramInt];
    float[] arrayOfFloat2 = this.i;
    float f3 = arrayOfFloat2[paramInt];
    f2 = a(f2, paramFloat2, f3, paramFloat1);
    boolean bool2 = f2 < 0.0F;
    if (!bool2) {}
    for (;;)
    {
      return f1;
      arrayOfFloat2 = this.l;
      f3 = arrayOfFloat2[paramInt];
      float[] arrayOfFloat3 = this.m;
      float f4 = arrayOfFloat3[paramInt];
      float[] arrayOfFloat4 = this.n;
      float f5 = arrayOfFloat4[paramInt];
      f3 *= paramFloat3;
      bool1 = f2 < 0.0F;
      if (bool1) {
        f1 = a(f2 * f3, f4, f5);
      } else {
        f1 = -a(-f2 * f3, f4, f5);
      }
    }
  }
  
  static int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 > paramInt3) {}
    for (;;)
    {
      return paramInt3;
      if (paramInt1 < paramInt2) {
        paramInt3 = paramInt2;
      } else {
        paramInt3 = paramInt1;
      }
    }
  }
  
  private void c()
  {
    boolean bool1 = true;
    Object localObject = this.g;
    if (localObject == null)
    {
      localObject = new android/support/v4/widget/a$b;
      ((a.b)localObject).<init>(this);
      this.g = ((Runnable)localObject);
    }
    this.e = bool1;
    this.c = bool1;
    boolean bool2 = this.o;
    if (!bool2)
    {
      int i1 = this.k;
      if (i1 > 0)
      {
        localObject = this.b;
        Runnable localRunnable = this.g;
        int i2 = this.k;
        long l1 = i2;
        r.a((View)localObject, localRunnable, l1);
      }
    }
    for (;;)
    {
      this.o = bool1;
      return;
      localObject = this.g;
      ((Runnable)localObject).run();
    }
  }
  
  private void d()
  {
    boolean bool = this.c;
    a.a locala;
    if (bool)
    {
      bool = false;
      locala = null;
      this.e = false;
    }
    for (;;)
    {
      return;
      locala = this.a;
      locala.b();
    }
  }
  
  private float f(float paramFloat1, float paramFloat2)
  {
    int i1 = 1065353216;
    float f1 = 1.0F;
    float f2 = 0.0F;
    boolean bool2 = paramFloat2 < 0.0F;
    if (!bool2) {}
    for (;;)
    {
      return f2;
      int i2 = this.j;
      switch (i2)
      {
      default: 
        break;
      case 0: 
      case 1: 
        boolean bool3 = paramFloat1 < paramFloat2;
        if (bool3)
        {
          bool3 = paramFloat1 < 0.0F;
          if (!bool3)
          {
            f2 = paramFloat1 / paramFloat2;
            f2 = f1 - f2;
          }
          else
          {
            bool3 = this.e;
            if (bool3)
            {
              int i3 = this.j;
              int i4 = 1;
              if (i3 == i4) {
                f2 = f1;
              }
            }
          }
        }
        break;
      case 2: 
        boolean bool1 = paramFloat1 < 0.0F;
        if (bool1)
        {
          f2 = -paramFloat2;
          f2 = paramFloat1 / f2;
        }
        break;
      }
    }
  }
  
  public a a(float paramFloat1, float paramFloat2)
  {
    float f1 = 1000.0F;
    float[] arrayOfFloat = this.n;
    float f2 = paramFloat1 / f1;
    arrayOfFloat[0] = f2;
    arrayOfFloat = this.n;
    f2 = paramFloat2 / f1;
    arrayOfFloat[1] = f2;
    return this;
  }
  
  public a a(int paramInt)
  {
    this.j = paramInt;
    return this;
  }
  
  public a a(boolean paramBoolean)
  {
    boolean bool = this.p;
    if ((bool) && (!paramBoolean)) {
      d();
    }
    this.p = paramBoolean;
    return this;
  }
  
  public abstract void a(int paramInt1, int paramInt2);
  
  boolean a()
  {
    a.a locala = this.a;
    int i1 = locala.f();
    int i2 = locala.e();
    if (i1 != 0)
    {
      boolean bool1 = f(i1);
      if (bool1) {}
    }
    else
    {
      if (i2 == 0) {
        break label47;
      }
      bool2 = e(i2);
      if (!bool2) {
        break label47;
      }
    }
    boolean bool2 = true;
    for (;;)
    {
      return bool2;
      label47:
      bool2 = false;
      locala = null;
    }
  }
  
  public a b(float paramFloat1, float paramFloat2)
  {
    float f1 = 1000.0F;
    float[] arrayOfFloat = this.m;
    float f2 = paramFloat1 / f1;
    arrayOfFloat[0] = f2;
    arrayOfFloat = this.m;
    f2 = paramFloat2 / f1;
    arrayOfFloat[1] = f2;
    return this;
  }
  
  public a b(int paramInt)
  {
    this.k = paramInt;
    return this;
  }
  
  void b()
  {
    long l1 = SystemClock.uptimeMillis();
    MotionEvent localMotionEvent = MotionEvent.obtain(l1, l1, 3, 0.0F, 0.0F, 0);
    this.b.onTouchEvent(localMotionEvent);
    localMotionEvent.recycle();
  }
  
  public a c(float paramFloat1, float paramFloat2)
  {
    float f1 = 1000.0F;
    float[] arrayOfFloat = this.l;
    float f2 = paramFloat1 / f1;
    arrayOfFloat[0] = f2;
    arrayOfFloat = this.l;
    f2 = paramFloat2 / f1;
    arrayOfFloat[1] = f2;
    return this;
  }
  
  public a c(int paramInt)
  {
    this.a.a(paramInt);
    return this;
  }
  
  public a d(float paramFloat1, float paramFloat2)
  {
    this.h[0] = paramFloat1;
    this.h[1] = paramFloat2;
    return this;
  }
  
  public a d(int paramInt)
  {
    this.a.b(paramInt);
    return this;
  }
  
  public a e(float paramFloat1, float paramFloat2)
  {
    this.i[0] = paramFloat1;
    this.i[1] = paramFloat2;
    return this;
  }
  
  public abstract boolean e(int paramInt);
  
  public abstract boolean f(int paramInt);
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    int i1 = 1;
    boolean bool1 = false;
    boolean bool2 = this.p;
    if (!bool2) {
      return bool1;
    }
    int i2 = paramMotionEvent.getActionMasked();
    label56:
    boolean bool3;
    switch (i2)
    {
    default: 
      bool3 = this.q;
      if (bool3)
      {
        bool3 = this.e;
        if (!bool3) {
          break;
        }
      }
      break;
    }
    for (;;)
    {
      bool1 = i1;
      break;
      this.d = i1;
      this.o = false;
      float f1 = paramMotionEvent.getX();
      int i3 = paramView.getWidth();
      float f2 = i3;
      float f3 = this.b.getWidth();
      f1 = a(0, f1, f2, f3);
      f2 = paramMotionEvent.getY();
      int i4 = paramView.getHeight();
      f3 = i4;
      View localView = this.b;
      int i5 = localView.getHeight();
      float f4 = i5;
      f2 = a(i1, f2, f3, f4);
      a.a locala = this.a;
      locala.a(f1, f2);
      bool3 = this.e;
      if (bool3) {
        break label56;
      }
      bool3 = a();
      if (!bool3) {
        break label56;
      }
      c();
      break label56;
      d();
      break label56;
      i1 = 0;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */