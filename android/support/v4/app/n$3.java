package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class n$3
  extends AnimatorListenerAdapter
{
  n$3(n paramn, ViewGroup paramViewGroup, View paramView, Fragment paramFragment) {}
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    Object localObject1 = this.a;
    Object localObject2 = this.b;
    ((ViewGroup)localObject1).endViewTransition((View)localObject2);
    localObject1 = this.c.getAnimator();
    localObject2 = this.c;
    int i = 0;
    Fragment localFragment = null;
    ((Fragment)localObject2).setAnimator(null);
    if (localObject1 != null)
    {
      localObject1 = this.a;
      localObject2 = this.b;
      int j = ((ViewGroup)localObject1).indexOfChild((View)localObject2);
      if (j < 0)
      {
        localObject1 = this.d;
        localObject2 = this.c;
        localFragment = this.c;
        i = localFragment.getStateAfterAnimating();
        ((n)localObject1).a((Fragment)localObject2, i, 0, 0, false);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$3.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */