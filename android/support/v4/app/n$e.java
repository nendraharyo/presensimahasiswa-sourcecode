package android.support.v4.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

class n$e
  extends AnimationSet
  implements Runnable
{
  private final ViewGroup a;
  private final View b;
  private boolean c;
  private boolean d;
  
  n$e(Animation paramAnimation, ViewGroup paramViewGroup, View paramView)
  {
    super(false);
    this.a = paramViewGroup;
    this.b = paramView;
    addAnimation(paramAnimation);
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation)
  {
    boolean bool1 = true;
    boolean bool2 = this.c;
    if (bool2)
    {
      bool2 = this.d;
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      bool2 = super.getTransformation(paramLong, paramTransformation);
      if (!bool2)
      {
        this.c = bool1;
        ViewGroup localViewGroup = this.a;
        z.a(localViewGroup, this);
      }
    }
  }
  
  public boolean getTransformation(long paramLong, Transformation paramTransformation, float paramFloat)
  {
    boolean bool1 = true;
    boolean bool2 = this.c;
    if (bool2)
    {
      bool2 = this.d;
      if (bool2) {}
    }
    for (;;)
    {
      return bool1;
      bool1 = false;
      continue;
      bool2 = super.getTransformation(paramLong, paramTransformation, paramFloat);
      if (!bool2)
      {
        this.c = bool1;
        ViewGroup localViewGroup = this.a;
        z.a(localViewGroup, this);
      }
    }
  }
  
  public void run()
  {
    ViewGroup localViewGroup = this.a;
    View localView = this.b;
    localViewGroup.endViewTransition(localView);
    this.d = true;
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$e.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */