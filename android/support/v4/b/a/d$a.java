package android.support.v4.b.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

public abstract class d$a
  extends Drawable.ConstantState
{
  int a;
  Drawable.ConstantState b;
  ColorStateList c;
  PorterDuff.Mode d;
  
  d$a(a parama, Resources paramResources)
  {
    int i = 0;
    this.c = null;
    Object localObject = d.a;
    this.d = ((PorterDuff.Mode)localObject);
    if (parama != null)
    {
      i = parama.a;
      this.a = i;
      localObject = parama.b;
      this.b = ((Drawable.ConstantState)localObject);
      localObject = parama.c;
      this.c = ((ColorStateList)localObject);
      localObject = parama.d;
      this.d = ((PorterDuff.Mode)localObject);
    }
  }
  
  boolean a()
  {
    Drawable.ConstantState localConstantState = this.b;
    boolean bool;
    if (localConstantState != null) {
      bool = true;
    }
    for (;;)
    {
      return bool;
      bool = false;
      localConstantState = null;
    }
  }
  
  public int getChangingConfigurations()
  {
    int i = this.a;
    Drawable.ConstantState localConstantState = this.b;
    int j;
    if (localConstantState != null)
    {
      localConstantState = this.b;
      j = localConstantState.getChangingConfigurations();
    }
    for (;;)
    {
      return j | i;
      j = 0;
      localConstantState = null;
    }
  }
  
  public Drawable newDrawable()
  {
    return newDrawable(null);
  }
  
  public abstract Drawable newDrawable(Resources paramResources);
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\b\a\d$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */