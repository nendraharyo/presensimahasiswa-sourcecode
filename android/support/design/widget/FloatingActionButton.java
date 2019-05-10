package android.support.design.widget;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.design.a.d;
import android.support.v4.view.r;
import android.support.v7.widget.AppCompatImageHelper;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View.MeasureSpec;

public class FloatingActionButton
  extends t
{
  int a;
  boolean b;
  final Rect c;
  private ColorStateList d;
  private PorterDuff.Mode e;
  private int f;
  private int g;
  private int h;
  private int i;
  private final Rect j;
  private AppCompatImageHelper k;
  private f l;
  
  private int a(int paramInt)
  {
    Object localObject = getResources();
    int m = this.h;
    int n;
    if (m != 0) {
      n = this.h;
    }
    for (;;)
    {
      return n;
      switch (paramInt)
      {
      default: 
        m = a.d.design_fab_size_normal;
        n = ((Resources)localObject).getDimensionPixelSize(m);
        break;
      case -1: 
        Configuration localConfiguration = ((Resources)localObject).getConfiguration();
        m = localConfiguration.screenWidthDp;
        localObject = ((Resources)localObject).getConfiguration();
        n = ((Configuration)localObject).screenHeightDp;
        n = Math.max(m, n);
        m = 470;
        if (n < m)
        {
          n = a(1);
        }
        else
        {
          localObject = null;
          n = a(0);
        }
        break;
      case 1: 
        m = a.d.design_fab_size_mini;
        n = ((Resources)localObject).getDimensionPixelSize(m);
      }
    }
  }
  
  private static int a(int paramInt1, int paramInt2)
  {
    int m = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    switch (m)
    {
    }
    for (;;)
    {
      return paramInt1;
      paramInt1 = Math.min(paramInt1, n);
      continue;
      paramInt1 = n;
    }
  }
  
  private f.c a(FloatingActionButton.a parama)
  {
    Object localObject;
    if (parama == null) {
      localObject = null;
    }
    for (;;)
    {
      return (f.c)localObject;
      localObject = new android/support/design/widget/FloatingActionButton$1;
      ((FloatingActionButton.1)localObject).<init>(this, parama);
    }
  }
  
  private f a()
  {
    int m = Build.VERSION.SDK_INT;
    int n = 21;
    Object localObject;
    FloatingActionButton.b localb;
    if (m >= n)
    {
      localObject = new android/support/design/widget/g;
      localb = new android/support/design/widget/FloatingActionButton$b;
      localb.<init>(this);
      ((g)localObject).<init>(this, localb);
    }
    for (;;)
    {
      return (f)localObject;
      localObject = new android/support/design/widget/f;
      localb = new android/support/design/widget/FloatingActionButton$b;
      localb.<init>(this);
      ((f)localObject).<init>(this, localb);
    }
  }
  
  private f getImpl()
  {
    f localf = this.l;
    if (localf == null)
    {
      localf = a();
      this.l = localf;
    }
    return this.l;
  }
  
  void a(FloatingActionButton.a parama, boolean paramBoolean)
  {
    f localf = getImpl();
    f.c localc = a(parama);
    localf.b(localc, paramBoolean);
  }
  
  public boolean a(Rect paramRect)
  {
    int m = 0;
    boolean bool = r.w(this);
    if (bool)
    {
      int n = getWidth();
      int i4 = getHeight();
      paramRect.set(0, 0, n, i4);
      m = paramRect.left;
      n = this.c.left;
      m += n;
      paramRect.left = m;
      m = paramRect.top;
      int i1 = this.c.top;
      m += i1;
      paramRect.top = m;
      m = paramRect.right;
      int i2 = this.c.right;
      m -= i2;
      paramRect.right = m;
      m = paramRect.bottom;
      Rect localRect = this.c;
      int i3 = localRect.bottom;
      m -= i3;
      paramRect.bottom = m;
      m = 1;
    }
    return m;
  }
  
  void b(FloatingActionButton.a parama, boolean paramBoolean)
  {
    f localf = getImpl();
    f.c localc = a(parama);
    localf.a(localc, paramBoolean);
  }
  
  protected void drawableStateChanged()
  {
    super.drawableStateChanged();
    f localf = getImpl();
    int[] arrayOfInt = getDrawableState();
    localf.a(arrayOfInt);
  }
  
  public ColorStateList getBackgroundTintList()
  {
    return this.d;
  }
  
  public PorterDuff.Mode getBackgroundTintMode()
  {
    return this.e;
  }
  
  public float getCompatElevation()
  {
    return getImpl().a();
  }
  
  public Drawable getContentBackground()
  {
    return getImpl().c();
  }
  
  public int getCustomSize()
  {
    return this.h;
  }
  
  public int getRippleColor()
  {
    return this.f;
  }
  
  public int getSize()
  {
    return this.g;
  }
  
  int getSizeDimension()
  {
    int m = this.g;
    return a(m);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.b;
  }
  
  public void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    getImpl().b();
  }
  
  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    getImpl().f();
  }
  
  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    getImpl().g();
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    int m = getSizeDimension();
    int n = this.i;
    n = (m - n) / 2;
    this.a = n;
    getImpl().e();
    n = a(m, paramInt1);
    m = a(m, paramInt2);
    m = Math.min(n, m);
    n = this.c.left + m;
    int i1 = this.c.right;
    n += i1;
    i1 = this.c.top;
    m += i1;
    i1 = this.c.bottom;
    m += i1;
    setMeasuredDimension(n, m);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int m = paramMotionEvent.getAction();
    boolean bool;
    switch (m)
    {
    default: 
      bool = super.onTouchEvent(paramMotionEvent);
    }
    for (;;)
    {
      return bool;
      Rect localRect = this.j;
      bool = a(localRect);
      if (!bool) {
        break;
      }
      localRect = this.j;
      float f1 = paramMotionEvent.getX();
      int n = (int)f1;
      float f2 = paramMotionEvent.getY();
      int i1 = (int)f2;
      bool = localRect.contains(n, i1);
      if (bool) {
        break;
      }
      bool = false;
      localRect = null;
    }
  }
  
  public void setBackgroundColor(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundResource(int paramInt)
  {
    Log.i("FloatingActionButton", "Setting a custom background is not supported.");
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    Object localObject = this.d;
    if (localObject != paramColorStateList)
    {
      this.d = paramColorStateList;
      localObject = getImpl();
      ((f)localObject).a(paramColorStateList);
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    Object localObject = this.e;
    if (localObject != paramMode)
    {
      this.e = paramMode;
      localObject = getImpl();
      ((f)localObject).a(paramMode);
    }
  }
  
  public void setCompatElevation(float paramFloat)
  {
    getImpl().a(paramFloat);
  }
  
  public void setCustomSize(int paramInt)
  {
    if (paramInt < 0)
    {
      IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
      localIllegalArgumentException.<init>("Custom size should be non-negative.");
      throw localIllegalArgumentException;
    }
    this.h = paramInt;
  }
  
  public void setImageResource(int paramInt)
  {
    this.k.setImageResource(paramInt);
  }
  
  public void setRippleColor(int paramInt)
  {
    int m = this.f;
    if (m != paramInt)
    {
      this.f = paramInt;
      f localf = getImpl();
      localf.a(paramInt);
    }
  }
  
  public void setSize(int paramInt)
  {
    int m = this.g;
    if (paramInt != m)
    {
      this.g = paramInt;
      requestLayout();
    }
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    boolean bool = this.b;
    if (bool != paramBoolean)
    {
      this.b = paramBoolean;
      f localf = getImpl();
      localf.d();
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\FloatingActionButton.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */