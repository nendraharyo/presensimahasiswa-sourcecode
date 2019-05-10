package android.support.c.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

class i$f
  extends Drawable.ConstantState
{
  int a;
  i.e b;
  ColorStateList c;
  PorterDuff.Mode d;
  boolean e;
  Bitmap f;
  ColorStateList g;
  PorterDuff.Mode h;
  int i;
  boolean j;
  boolean k;
  Paint l;
  
  public i$f()
  {
    this.c = null;
    Object localObject = i.a;
    this.d = ((PorterDuff.Mode)localObject);
    localObject = new android/support/c/a/i$e;
    ((i.e)localObject).<init>();
    this.b = ((i.e)localObject);
  }
  
  public i$f(f paramf)
  {
    int m = 0;
    this.c = null;
    Object localObject1 = i.a;
    this.d = ((PorterDuff.Mode)localObject1);
    if (paramf != null)
    {
      m = paramf.a;
      this.a = m;
      localObject1 = new android/support/c/a/i$e;
      Object localObject2 = paramf.b;
      ((i.e)localObject1).<init>((i.e)localObject2);
      this.b = ((i.e)localObject1);
      localObject1 = i.e.a(paramf.b);
      Paint localPaint;
      if (localObject1 != null)
      {
        localObject1 = this.b;
        localObject2 = new android/graphics/Paint;
        localPaint = i.e.a(paramf.b);
        ((Paint)localObject2).<init>(localPaint);
        i.e.a((i.e)localObject1, (Paint)localObject2);
      }
      localObject1 = i.e.b(paramf.b);
      if (localObject1 != null)
      {
        localObject1 = this.b;
        localObject2 = new android/graphics/Paint;
        localPaint = i.e.b(paramf.b);
        ((Paint)localObject2).<init>(localPaint);
        i.e.b((i.e)localObject1, (Paint)localObject2);
      }
      localObject1 = paramf.c;
      this.c = ((ColorStateList)localObject1);
      localObject1 = paramf.d;
      this.d = ((PorterDuff.Mode)localObject1);
      boolean bool = paramf.e;
      this.e = bool;
    }
  }
  
  public Paint a(ColorFilter paramColorFilter)
  {
    boolean bool1 = a();
    if ((!bool1) && (paramColorFilter == null)) {
      bool1 = false;
    }
    for (Paint localPaint = null;; localPaint = this.l)
    {
      return localPaint;
      localPaint = this.l;
      if (localPaint == null)
      {
        localPaint = new android/graphics/Paint;
        localPaint.<init>();
        this.l = localPaint;
        localPaint = this.l;
        boolean bool2 = true;
        localPaint.setFilterBitmap(bool2);
      }
      localPaint = this.l;
      i.e locale = this.b;
      int m = locale.getRootAlpha();
      localPaint.setAlpha(m);
      this.l.setColorFilter(paramColorFilter);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    this.f.eraseColor(0);
    Canvas localCanvas = new android/graphics/Canvas;
    Bitmap localBitmap = this.f;
    localCanvas.<init>(localBitmap);
    this.b.a(localCanvas, paramInt1, paramInt2, null);
  }
  
  public void a(Canvas paramCanvas, ColorFilter paramColorFilter, Rect paramRect)
  {
    Paint localPaint = a(paramColorFilter);
    Bitmap localBitmap = this.f;
    paramCanvas.drawBitmap(localBitmap, null, paramRect, localPaint);
  }
  
  public boolean a()
  {
    i.e locale = this.b;
    int m = locale.getRootAlpha();
    int i1 = 255;
    if (m < i1) {
      m = 1;
    }
    for (;;)
    {
      return m;
      int n = 0;
      locale = null;
    }
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    Object localObject = this.f;
    boolean bool;
    if (localObject != null)
    {
      bool = c(paramInt1, paramInt2);
      if (bool) {}
    }
    else
    {
      localObject = Bitmap.Config.ARGB_8888;
      localObject = Bitmap.createBitmap(paramInt1, paramInt2, (Bitmap.Config)localObject);
      this.f = ((Bitmap)localObject);
      bool = true;
      this.k = bool;
    }
  }
  
  public boolean b()
  {
    boolean bool1 = this.k;
    Object localObject1;
    int m;
    if (!bool1)
    {
      localObject1 = this.g;
      Object localObject2 = this.c;
      if (localObject1 == localObject2)
      {
        localObject1 = this.h;
        localObject2 = this.d;
        if (localObject1 == localObject2)
        {
          bool1 = this.j;
          boolean bool2 = this.e;
          if (bool1 == bool2)
          {
            m = this.i;
            localObject2 = this.b;
            int i1 = ((i.e)localObject2).getRootAlpha();
            if (m == i1) {
              m = 1;
            }
          }
        }
      }
    }
    for (;;)
    {
      return m;
      int n = 0;
      localObject1 = null;
    }
  }
  
  public void c()
  {
    Object localObject = this.c;
    this.g = ((ColorStateList)localObject);
    localObject = this.d;
    this.h = ((PorterDuff.Mode)localObject);
    int m = this.b.getRootAlpha();
    this.i = m;
    boolean bool = this.e;
    this.j = bool;
    this.k = false;
  }
  
  public boolean c(int paramInt1, int paramInt2)
  {
    Bitmap localBitmap = this.f;
    int m = localBitmap.getWidth();
    if (paramInt1 == m)
    {
      localBitmap = this.f;
      m = localBitmap.getHeight();
      if (paramInt2 == m) {
        m = 1;
      }
    }
    for (;;)
    {
      return m;
      m = 0;
      localBitmap = null;
    }
  }
  
  public int getChangingConfigurations()
  {
    return this.a;
  }
  
  public Drawable newDrawable()
  {
    i locali = new android/support/c/a/i;
    locali.<init>(this);
    return locali;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    i locali = new android/support/c/a/i;
    locali.<init>(this);
    return locali;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */