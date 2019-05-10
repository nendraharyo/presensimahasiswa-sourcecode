package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

class c
  implements d
{
  public void a(Animator paramAnimator)
  {
    paramAnimator.pause();
  }
  
  public void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    paramAnimator.addPauseListener(paramAnimatorListenerAdapter);
  }
  
  public void b(Animator paramAnimator)
  {
    paramAnimator.resume();
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\c.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */