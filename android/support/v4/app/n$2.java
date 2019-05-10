package android.support.v4.app;

import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class n$2
  extends n.b
{
  n$2(n paramn, Animation.AnimationListener paramAnimationListener, ViewGroup paramViewGroup, Fragment paramFragment)
  {
    super(paramAnimationListener, null);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    super.onAnimationEnd(paramAnimation);
    ViewGroup localViewGroup = this.a;
    n.2.1 local1 = new android/support/v4/app/n$2$1;
    local1.<init>(this);
    localViewGroup.post(local1);
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$2.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */