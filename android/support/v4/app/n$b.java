package android.support.v4.app;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class n$b
  implements Animation.AnimationListener
{
  private final Animation.AnimationListener a;
  
  private n$b(Animation.AnimationListener paramAnimationListener)
  {
    this.a = paramAnimationListener;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    Animation.AnimationListener localAnimationListener = this.a;
    if (localAnimationListener != null)
    {
      localAnimationListener = this.a;
      localAnimationListener.onAnimationEnd(paramAnimation);
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation)
  {
    Animation.AnimationListener localAnimationListener = this.a;
    if (localAnimationListener != null)
    {
      localAnimationListener = this.a;
      localAnimationListener.onAnimationRepeat(paramAnimation);
    }
  }
  
  public void onAnimationStart(Animation paramAnimation)
  {
    Animation.AnimationListener localAnimationListener = this.a;
    if (localAnimationListener != null)
    {
      localAnimationListener = this.a;
      localAnimationListener.onAnimationStart(paramAnimation);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */