package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.util.Log;
import java.lang.reflect.Method;

class f
  extends e
{
  private static Method d;
  
  f(Drawable paramDrawable)
  {
    super(paramDrawable);
    d();
  }
  
  f(d.a parama, Resources paramResources)
  {
    super(parama, paramResources);
    d();
  }
  
  private void d()
  {
    Object localObject1 = d;
    String str;
    Object localObject2;
    if (localObject1 == null)
    {
      localObject1 = Drawable.class;
      str = "isProjected";
      localObject2 = null;
    }
    try
    {
      localObject2 = new Class[0];
      localObject1 = ((Class)localObject1).getDeclaredMethod(str, (Class[])localObject2);
      d = (Method)localObject1;
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        str = "WrappedDrawableApi21";
        localObject2 = "Failed to retrieve Drawable#isProjected() method";
        Log.w(str, (String)localObject2, localException);
      }
    }
  }
  
  d.a b()
  {
    f.a locala = new android/support/v4/b/a/f$a;
    d.a locala1 = this.b;
    locala.<init>(locala1, null);
    return locala;
  }
  
  protected boolean c()
  {
    boolean bool1 = false;
    int i = Build.VERSION.SDK_INT;
    int j = 21;
    if (i == j)
    {
      Drawable localDrawable = this.c;
      boolean bool3 = localDrawable instanceof GradientDrawable;
      if (!bool3)
      {
        bool3 = localDrawable instanceof DrawableContainer;
        if (!bool3)
        {
          bool3 = localDrawable instanceof InsetDrawable;
          if (!bool3)
          {
            boolean bool2 = localDrawable instanceof RippleDrawable;
            if (!bool2) {
              return bool1;
            }
          }
        }
      }
      bool1 = true;
    }
    return bool1;
  }
  
  public Rect getDirtyBounds()
  {
    return this.c.getDirtyBounds();
  }
  
  public void getOutline(Outline paramOutline)
  {
    this.c.getOutline(paramOutline);
  }
  
  public void setHotspot(float paramFloat1, float paramFloat2)
  {
    this.c.setHotspot(paramFloat1, paramFloat2);
  }
  
  public void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.c.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public boolean setState(int[] paramArrayOfInt)
  {
    boolean bool = super.setState(paramArrayOfInt);
    if (bool) {
      invalidateSelf();
    }
    for (bool = true;; bool = false) {
      return bool;
    }
  }
  
  public void setTint(int paramInt)
  {
    boolean bool = c();
    if (bool) {
      super.setTint(paramInt);
    }
    for (;;)
    {
      return;
      Drawable localDrawable = this.c;
      localDrawable.setTint(paramInt);
    }
  }
  
  public void setTintList(ColorStateList paramColorStateList)
  {
    boolean bool = c();
    if (bool) {
      super.setTintList(paramColorStateList);
    }
    for (;;)
    {
      return;
      Drawable localDrawable = this.c;
      localDrawable.setTintList(paramColorStateList);
    }
  }
  
  public void setTintMode(PorterDuff.Mode paramMode)
  {
    boolean bool = c();
    if (bool) {
      super.setTintMode(paramMode);
    }
    for (;;)
    {
      return;
      Drawable localDrawable = this.c;
      localDrawable.setTintMode(paramMode);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\a\f.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */