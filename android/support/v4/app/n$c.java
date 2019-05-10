package android.support.v4.app;

import android.animation.Animator;
import android.view.animation.Animation;

class n$c
{
  public final Animation a;
  public final Animator b;
  
  private n$c(Animator paramAnimator)
  {
    IllegalStateException localIllegalStateException = null;
    this.a = null;
    this.b = paramAnimator;
    if (paramAnimator == null)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Animator cannot be null");
      throw localIllegalStateException;
    }
  }
  
  private n$c(Animation paramAnimation)
  {
    this.a = paramAnimation;
    IllegalStateException localIllegalStateException = null;
    this.b = null;
    if (paramAnimation == null)
    {
      localIllegalStateException = new java/lang/IllegalStateException;
      localIllegalStateException.<init>("Animation cannot be null");
      throw localIllegalStateException;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */