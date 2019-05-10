package android.support.c.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.VectorDrawable;

class i$g
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public i$g(Drawable.ConstantState paramConstantState)
  {
    this.a = paramConstantState;
  }
  
  public boolean canApplyTheme()
  {
    return this.a.canApplyTheme();
  }
  
  public int getChangingConfigurations()
  {
    return this.a.getChangingConfigurations();
  }
  
  public Drawable newDrawable()
  {
    i locali = new android/support/c/a/i;
    locali.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)this.a.newDrawable();
    locali.b = localVectorDrawable;
    return locali;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    i locali = new android/support/c/a/i;
    locali.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)this.a.newDrawable(paramResources);
    locali.b = localVectorDrawable;
    return locali;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    i locali = new android/support/c/a/i;
    locali.<init>();
    VectorDrawable localVectorDrawable = (VectorDrawable)this.a.newDrawable(paramResources, paramTheme);
    locali.b = localVectorDrawable;
    return locali;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\i$g.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */