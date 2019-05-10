package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

class n$d
  extends AnimatorListenerAdapter
{
  View a;
  
  n$d(View paramView)
  {
    this.a = paramView;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    this.a.setLayerType(0, null);
    paramAnimator.removeListener(this);
  }
  
  public void onAnimationStart(Animator paramAnimator)
  {
    this.a.setLayerType(2, null);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$d.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */