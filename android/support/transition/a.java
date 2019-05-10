package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build.VERSION;

class a
{
  private static final d a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 19;
    Object localObject;
    if (i >= j)
    {
      localObject = new android/support/transition/c;
      ((c)localObject).<init>();
    }
    for (a = (d)localObject;; a = (d)localObject)
    {
      return;
      localObject = new android/support/transition/b;
      ((b)localObject).<init>();
    }
  }
  
  static void a(Animator paramAnimator)
  {
    a.a(paramAnimator);
  }
  
  static void a(Animator paramAnimator, AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    a.a(paramAnimator, paramAnimatorListenerAdapter);
  }
  
  static void b(Animator paramAnimator)
  {
    a.b(paramAnimator);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */