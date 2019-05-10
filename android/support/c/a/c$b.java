package android.support.c.a;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

class c$b
  extends Drawable.ConstantState
{
  private final Drawable.ConstantState a;
  
  public c$b(Drawable.ConstantState paramConstantState)
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
    c localc = new android/support/c/a/c;
    localc.<init>();
    Drawable localDrawable = this.a.newDrawable();
    localc.b = localDrawable;
    localDrawable = localc.b;
    Drawable.Callback localCallback = localc.a;
    localDrawable.setCallback(localCallback);
    return localc;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    c localc = new android/support/c/a/c;
    localc.<init>();
    Drawable localDrawable = this.a.newDrawable(paramResources);
    localc.b = localDrawable;
    localDrawable = localc.b;
    Drawable.Callback localCallback = localc.a;
    localDrawable.setCallback(localCallback);
    return localc;
  }
  
  public Drawable newDrawable(Resources paramResources, Resources.Theme paramTheme)
  {
    c localc = new android/support/c/a/c;
    localc.<init>();
    Drawable localDrawable = this.a.newDrawable(paramResources, paramTheme);
    localc.b = localDrawable;
    localDrawable = localc.b;
    Drawable.Callback localCallback = localc.a;
    localDrawable.setCallback(localCallback);
    return localc;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\c\a\c$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */