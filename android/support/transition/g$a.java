package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v4.view.r;
import android.view.View;

class g$a
  extends AnimatorListenerAdapter
{
  private final View a;
  private boolean b = false;
  
  g$a(View paramView)
  {
    this.a = paramView;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    View localView = this.a;
    float f = 1.0F;
    am.a(localView, f);
    boolean bool = this.b;
    if (bool)
    {
      localView = this.a;
      f = 0.0F;
      localView.setLayerType(0, null);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    View localView = this.a;
    boolean bool = r.q(localView);
    if (bool)
    {
      localView = this.a;
      int i = localView.getLayerType();
      if (i == 0)
      {
        i = 1;
        this.b = i;
        localView = this.a;
        int j = 2;
        localView.setLayerType(j, null);
      }
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\g$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */