package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class d
  extends Drawable
  implements Drawable.Callback, b, c
{
  static final PorterDuff.Mode a = PorterDuff.Mode.SRC_IN;
  d.a b;
  Drawable c;
  private int d;
  private PorterDuff.Mode e;
  private boolean f;
  private boolean g;
  
  d(Drawable paramDrawable)
  {
    d.a locala = b();
    this.b = locala;
    a(paramDrawable);
  }
  
  d(d.a parama, Resources paramResources)
  {
    this.b = parama;
    a(paramResources);
  }
  
  private void a(Resources paramResources)
  {
    Object localObject = this.b;
    if (localObject != null)
    {
      localObject = this.b.b;
      if (localObject != null)
      {
        localObject = this.b.b.newDrawable(paramResources);
        a((Drawable)localObject);
      }
    }
  }
  
  private boolean a(int[] paramArrayOfInt)
  {
    boolean bool1 = true;
    boolean bool2 = false;
    boolean bool3 = c();
    if (!bool3) {}
    for (;;)
    {
      return bool2;
      ColorStateList localColorStateList = this.b.c;
      PorterDuff.Mode localMode1 = this.b.d;
      if ((localColorStateList != null) && (localMode1 != null))
      {
        int j = localColorStateList.getDefaultColor();
        int i = localColorStateList.getColorForState(paramArrayOfInt, j);
        boolean bool4 = this.f;
        if (bool4)
        {
          int k = this.d;
          if (i == k)
          {
            PorterDuff.Mode localMode2 = this.e;
            if (localMode1 == localMode2) {
              continue;
            }
          }
        }
        setColorFilter(i, localMode1);
        this.d = i;
        this.e = localMode1;
        this.f = bool1;
        bool2 = bool1;
      }
      else
      {
        this.f = false;
        clearColorFilter();
      }
    }
  }
  
  public final Drawable a()
  {
    return this.c;
  }
  
  public final void a(Drawable paramDrawable)
  {
    Object localObject = this.c;
    boolean bool1;
    Drawable.ConstantState localConstantState;
    if (localObject != null)
    {
      localObject = this.c;
      bool1 = false;
      localConstantState = null;
      ((Drawable)localObject).setCallback(null);
    }
    this.c = paramDrawable;
    if (paramDrawable != null)
    {
      paramDrawable.setCallback(this);
      boolean bool2 = paramDrawable.isVisible();
      bool1 = true;
      setVisible(bool2, bool1);
      localObject = paramDrawable.getState();
      setState((int[])localObject);
      int i = paramDrawable.getLevel();
      setLevel(i);
      localObject = paramDrawable.getBounds();
      setBounds((Rect)localObject);
      localObject = this.b;
      if (localObject != null)
      {
        localObject = this.b;
        localConstantState = paramDrawable.getConstantState();
        ((d.a)localObject).b = localConstantState;
      }
    }
    invalidateSelf();
  }
  
  d.a b()
  {
    d.b localb = new android/support/v4/b/a/d$b;
    d.a locala = this.b;
    localb.<init>(locala, null);
    return localb;
  }
  
  protected boolean c()
  {
    return true;
  }
  
  public void draw(Canvas paramCanvas)
  {
    this.c.draw(paramCanvas);
  }
  
  public int getChangingConfigurations()
  {
    int i = super.getChangingConfigurations();
    d.a locala = this.b;
    int j;
    if (locala != null)
    {
      locala = this.b;
      j = locala.getChangingConfigurations();
    }
    for (;;)
    {
      j |= i;
      i = this.c.getChangingConfigurations();
      return j | i;
      j = 0;
      locala = null;
    }
  }
  
  public Drawable.ConstantState getConstantState()
  {
    d.a locala = this.b;
    boolean bool;
    if (locala != null)
    {
      locala = this.b;
      bool = locala.a();
      if (bool)
      {
        locala = this.b;
        int i = getChangingConfigurations();
        locala.a = i;
      }
    }
    for (locala = this.b;; locala = null)
    {
      return locala;
      bool = false;
    }
  }
  
  public Drawable getCurrent()
  {
    return this.c.getCurrent();
  }
  
  public int getIntrinsicHeight()
  {
    return this.c.getIntrinsicHeight();
  }
  
  public int getIntrinsicWidth()
  {
    return this.c.getIntrinsicWidth();
  }
  
  public int getMinimumHeight()
  {
    return this.c.getMinimumHeight();
  }
  
  public int getMinimumWidth()
  {
    return this.c.getMinimumWidth();
  }
  
  public int getOpacity()
  {
    return this.c.getOpacity();
  }
  
  public boolean getPadding(Rect paramRect)
  {
    return this.c.getPadding(paramRect);
  }
  
  public int[] getState()
  {
    return this.c.getState();
  }
  
  public Region getTransparentRegion()
  {
    return this.c.getTransparentRegion();
  }
  
  public void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public boolean isStateful()
  {
    boolean bool = c();
    Object localObject;
    if (bool)
    {
      localObject = this.b;
      if (localObject != null)
      {
        localObject = this.b.c;
        if (localObject != null)
        {
          bool = ((ColorStateList)localObject).isStateful();
          if (bool) {}
        }
        else
        {
          localObject = this.c;
          bool = ((Drawable)localObject).isStateful();
          if (!bool) {
            break label64;
          }
        }
        bool = true;
      }
    }
    for (;;)
    {
      return bool;
      bool = false;
      localObject = null;
      break;
      label64:
      bool = false;
      localObject = null;
    }
  }
  
  public void jumpToCurrentState()
  {
    this.c.jumpToCurrentState();
  }
  
  public Drawable mutate()
  {
    boolean bool = this.g;
    d.a locala;
    if (!bool)
    {
      localObject = super.mutate();
      if (localObject == this)
      {
        localObject = b();
        this.b = ((d.a)localObject);
        localObject = this.c;
        if (localObject != null)
        {
          localObject = this.c;
          ((Drawable)localObject).mutate();
        }
        localObject = this.b;
        if (localObject != null)
        {
          locala = this.b;
          localObject = this.c;
          if (localObject == null) {
            break label93;
          }
        }
      }
    }
    for (Object localObject = this.c.getConstantState();; localObject = null)
    {
      locala.b = ((Drawable.ConstantState)localObject);
      bool = true;
      this.g = bool;
      return this;
      label93:
      bool = false;
    }
  }
  
  protected void onBoundsChange(Rect paramRect)
  {
    Drawable localDrawable = this.c;
    if (localDrawable != null)
    {
      localDrawable = this.c;
      localDrawable.setBounds(paramRect);
    }
  }
  
  protected boolean onLevelChange(int paramInt)
  {
    return this.c.setLevel(paramInt);
  }
  
  public void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public void setAlpha(int paramInt)
  {
    this.c.setAlpha(paramInt);
  }
  
  public void setChangingConfigurations(int paramInt)
  {
    this.c.setChangingConfigurations(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    this.c.setColorFilter(paramColorFilter);
  }
  
  public void setDither(boolean paramBoolean)
  {
    this.c.setDither(paramBoolean);
  }
  
  public void setFilterBitmap(boolean paramBoolean)
  {
    this.c.setFilterBitmap(paramBoolean);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    Drawable localDrawable = this.c;
    boolean bool1 = localDrawable.setState(paramArrayOfInt);
    boolean bool2 = a(paramArrayOfInt);
    if ((bool2) || (bool1)) {
      bool1 = true;
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      localDrawable = null;
    }
  }
  
  public void setTint(int paramInt)
  {
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    setTintList(localColorStateList);
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    this.b.c = paramColorStateList;
    int[] arrayOfInt = getState();
    a(arrayOfInt);
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    this.b.d = paramMode;
    int[] arrayOfInt = getState();
    a(arrayOfInt);
  }
  
  public boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    boolean bool = super.setVisible(paramBoolean1, paramBoolean2);
    Drawable localDrawable;
    if (!bool)
    {
      localDrawable = this.c;
      bool = localDrawable.setVisible(paramBoolean1, paramBoolean2);
      if (!bool) {}
    }
    else
    {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localDrawable = null;
    }
  }
  
  public void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\a\d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */