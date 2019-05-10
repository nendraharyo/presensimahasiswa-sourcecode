package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class m$1
  extends AnimatorListenerAdapter
{
  m$1(m paramm) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object localObject = this.a.a;
    if (localObject == paramAnimator)
    {
      localObject = this.a;
      ((m)localObject).a = null;
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\design\widget\m$1.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */