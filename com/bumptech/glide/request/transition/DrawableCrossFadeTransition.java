package com.bumptech.glide.request.transition;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

public class DrawableCrossFadeTransition
  implements Transition
{
  private final int duration;
  private final boolean isCrossFadeEnabled;
  
  public DrawableCrossFadeTransition(int paramInt, boolean paramBoolean)
  {
    this.duration = paramInt;
    this.isCrossFadeEnabled = paramBoolean;
  }
  
  public boolean transition(Drawable paramDrawable, Transition.ViewAdapter paramViewAdapter)
  {
    boolean bool1 = true;
    Object localObject = paramViewAdapter.getCurrentDrawable();
    if (localObject == null)
    {
      localObject = new android/graphics/drawable/ColorDrawable;
      ((ColorDrawable)localObject).<init>(0);
    }
    TransitionDrawable localTransitionDrawable = new android/graphics/drawable/TransitionDrawable;
    Drawable[] arrayOfDrawable = new Drawable[2];
    arrayOfDrawable[0] = localObject;
    arrayOfDrawable[bool1] = paramDrawable;
    localTransitionDrawable.<init>(arrayOfDrawable);
    boolean bool2 = this.isCrossFadeEnabled;
    localTransitionDrawable.setCrossFadeEnabled(bool2);
    int i = this.duration;
    localTransitionDrawable.startTransition(i);
    paramViewAdapter.setDrawable(localTransitionDrawable);
    return bool1;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\com\bumptech\glide\request\transition\DrawableCrossFadeTransition.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */