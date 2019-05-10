package android.support.v4.widget;

import android.view.animation.AnimationUtils;

class a$a
{
  private int a;
  private int b;
  private float c;
  private float d;
  private long e = Long.MIN_VALUE;
  private long f = 0L;
  private int g = 0;
  private int h = 0;
  private long i = -1;
  private float j;
  private int k;
  
  private float a(float paramFloat)
  {
    float f1 = -4.0F * paramFloat * paramFloat;
    float f2 = 4.0F * paramFloat;
    return f1 + f2;
  }
  
  private float a(long paramLong)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    long l1 = this.e;
    boolean bool = paramLong < l1;
    if (bool) {}
    for (;;)
    {
      return f2;
      l1 = this.i;
      long l2 = 0L;
      bool = l1 < l2;
      if (!bool)
      {
        l1 = this.i;
        bool = paramLong < l1;
        if (!bool) {}
      }
      else
      {
        l1 = this.e;
        l1 = paramLong - l1;
        int m = 1056964608;
        f3 = 0.5F;
        f4 = (float)l1;
        n = this.a;
        f5 = n;
        f4 /= f5;
        f2 = a.a(f4, 0.0F, f1) * f3;
        continue;
      }
      l1 = this.i;
      l1 = paramLong - l1;
      float f3 = this.j;
      f3 = f1 - f3;
      float f6 = this.j;
      float f4 = (float)l1;
      int n = this.k;
      float f5 = n;
      f4 /= f5;
      f2 = a.a(f4, 0.0F, f1) * f6 + f3;
    }
  }
  
  public void a()
  {
    long l = AnimationUtils.currentAnimationTimeMillis();
    this.e = l;
    this.i = -1;
    l = this.e;
    this.f = l;
    this.j = 0.5F;
    this.g = 0;
    this.h = 0;
  }
  
  public void a(float paramFloat1, float paramFloat2)
  {
    this.c = paramFloat1;
    this.d = paramFloat2;
  }
  
  public void a(int paramInt)
  {
    this.a = paramInt;
  }
  
  public void b()
  {
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    long l2 = this.e;
    int m = (int)(l1 - l2);
    int n = this.b;
    m = a.a(m, 0, n);
    this.k = m;
    float f1 = a(l1);
    this.j = f1;
    this.i = l1;
  }
  
  public void b(int paramInt)
  {
    this.b = paramInt;
  }
  
  public boolean c()
  {
    long l1 = this.i;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (bool)
    {
      l1 = AnimationUtils.currentAnimationTimeMillis();
      l2 = this.i;
      int m = this.k;
      long l3 = m;
      l2 += l3;
      bool = l1 < l2;
      if (!bool) {}
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void d()
  {
    long l1 = this.f;
    long l2 = 0L;
    boolean bool = l1 < l2;
    if (!bool)
    {
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("Cannot compute scroll delta before calling start()");
      throw localRuntimeException;
    }
    l1 = AnimationUtils.currentAnimationTimeMillis();
    float f1 = a(l1);
    f1 = a(f1);
    long l3 = this.f;
    l3 = l1 - l3;
    this.f = l1;
    float f2 = (float)l3 * f1;
    float f3 = this.c;
    int m = (int)(f2 * f3);
    this.g = m;
    f2 = (float)l3 * f1;
    f3 = this.d;
    m = (int)(f2 * f3);
    this.h = m;
  }
  
  public int e()
  {
    float f1 = this.c;
    float f2 = Math.abs(this.c);
    return (int)(f1 / f2);
  }
  
  public int f()
  {
    float f1 = this.d;
    float f2 = Math.abs(this.d);
    return (int)(f1 / f2);
  }
  
  public int g()
  {
    return this.g;
  }
  
  public int h()
  {
    return this.h;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\widget\a$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */