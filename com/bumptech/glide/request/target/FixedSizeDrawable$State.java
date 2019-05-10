package com.bumptech.glide.request.target;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class FixedSizeDrawable$State
  extends Drawable.ConstantState
{
  final int height;
  final int width;
  private final Drawable.ConstantState wrapped;
  
  FixedSizeDrawable$State(Drawable.ConstantState paramConstantState, int paramInt1, int paramInt2)
  {
    this.wrapped = paramConstantState;
    this.width = paramInt1;
    this.height = paramInt2;
  }
  
  FixedSizeDrawable$State(State paramState)
  {
    this(localConstantState, i, j);
  }
  
  public int getChangingConfigurations()
  {
    return 0;
  }
  
  public Drawable newDrawable()
  {
    FixedSizeDrawable localFixedSizeDrawable = new com/bumptech/glide/request/target/FixedSizeDrawable;
    Drawable localDrawable = this.wrapped.newDrawable();
    localFixedSizeDrawable.<init>(this, localDrawable);
    return localFixedSizeDrawable;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    FixedSizeDrawable localFixedSizeDrawable = new com/bumptech/glide/request/target/FixedSizeDrawable;
    Drawable localDrawable = this.wrapped.newDrawable(paramResources);
    localFixedSizeDrawable.<init>(this, localDrawable);
    return localFixedSizeDrawable;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\target\FixedSizeDrawable$State.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */