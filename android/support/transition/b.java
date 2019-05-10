package android.support.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

class b
  implements d
{
  public void a(Animator paramAnimator)
  {
    ArrayList localArrayList = paramAnimator.getListeners();
    if (localArrayList != null)
    {
      int i = 0;
      Object localObject = null;
      int j = localArrayList.size();
      for (int k = 0; k < j; k = i)
      {
        localObject = (Animator.AnimatorListener)localArrayList.get(k);
        boolean bool = localObject instanceof b.a;
        if (bool)
        {
          localObject = (b.a)localObject;
          ((b.a)localObject).onAnimationPause(paramAnimator);
        }
        i = k + 1;
      }
    }
  }
  
  public void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter) {}
  
  public void b(Animator paramAnimator)
  {
    ArrayList localArrayList = paramAnimator.getListeners();
    if (localArrayList != null)
    {
      int i = 0;
      Object localObject = null;
      int j = localArrayList.size();
      for (int k = 0; k < j; k = i)
      {
        localObject = (Animator.AnimatorListener)localArrayList.get(k);
        boolean bool = localObject instanceof b.a;
        if (bool)
        {
          localObject = (b.a)localObject;
          ((b.a)localObject).onAnimationResume(paramAnimator);
        }
        i = k + 1;
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\b.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */