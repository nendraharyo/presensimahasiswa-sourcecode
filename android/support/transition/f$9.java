package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Rect;
import android.support.v4.view.r;
import android.view.View;

class f$9
  extends AnimatorListenerAdapter
{
  private boolean h;
  
  f$9(f paramf, View paramView, Rect paramRect, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.h = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    boolean bool = this.h;
    if (!bool)
    {
      View localView = this.a;
      Rect localRect = this.b;
      r.a(localView, localRect);
      localView = this.a;
      int i = this.c;
      int j = this.d;
      int k = this.e;
      int m = this.f;
      am.a(localView, i, j, k, m);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\f$9.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */