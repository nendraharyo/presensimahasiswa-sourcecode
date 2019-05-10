package android.support.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

class at$a
  extends AnimatorListenerAdapter
  implements b.a, u.c
{
  boolean a = false;
  private final View b;
  private final int c;
  private final ViewGroup d;
  private final boolean e;
  private boolean f;
  
  at$a(View paramView, int paramInt, boolean paramBoolean)
  {
    this.b = paramView;
    this.c = paramInt;
    ViewGroup localViewGroup = (ViewGroup)paramView.getParent();
    this.d = localViewGroup;
    this.e = paramBoolean;
    a(true);
  }
  
  private void a()
  {
    boolean bool = this.a;
    if (!bool)
    {
      Object localObject = this.b;
      int i = this.c;
      am.a((View)localObject, i);
      localObject = this.d;
      if (localObject != null)
      {
        localObject = this.d;
        ((ViewGroup)localObject).invalidate();
      }
    }
    a(false);
  }
  
  private void a(boolean paramBoolean)
  {
    boolean bool = this.e;
    if (bool)
    {
      bool = this.f;
      if (bool != paramBoolean)
      {
        ViewGroup localViewGroup = this.d;
        if (localViewGroup != null)
        {
          this.f = paramBoolean;
          localViewGroup = this.d;
          af.a(localViewGroup, paramBoolean);
        }
      }
    }
  }
  
  public void a(u paramu)
  {
    a();
    paramu.b(this);
  }
  
  public void b(u paramu)
  {
    a(false);
  }
  
  public void c(u paramu)
  {
    a(true);
  }
  
  public void d(u paramu) {}
  
  public void onAnimationCancel(Animator paramAnimator)
  {
    this.a = true;
  }
  
  public void onAnimationEnd(Animator paramAnimator)
  {
    a();
  }
  
  public void onAnimationPause(Animator paramAnimator)
  {
    boolean bool = this.a;
    if (!bool)
    {
      View localView = this.b;
      int i = this.c;
      am.a(localView, i);
    }
  }
  
  public void onAnimationRepeat(Animator paramAnimator) {}
  
  public void onAnimationResume(Animator paramAnimator)
  {
    boolean bool = this.a;
    if (!bool)
    {
      View localView = this.b;
      am.a(localView, 0);
    }
  }
  
  public void onAnimationStart(Animator paramAnimator) {}
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\transition\at$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */