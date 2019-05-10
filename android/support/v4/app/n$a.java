package android.support.v4.app;

import android.os.Build.VERSION;
import android.support.v4.view.r;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class n$a
  extends n.b
{
  View a;
  
  n$a(View paramView, Animation.AnimationListener paramAnimationListener)
  {
    super(paramAnimationListener, null);
    this.a = paramView;
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    View localView = this.a;
    boolean bool = r.z(localView);
    int j;
    n.a.1 local1;
    if (!bool)
    {
      int i = Build.VERSION.SDK_INT;
      j = 24;
      if (i < j) {}
    }
    else
    {
      localView = this.a;
      local1 = new android/support/v4/app/n$a$1;
      local1.<init>(this);
      localView.post(local1);
    }
    for (;;)
    {
      super.onAnimationEnd(paramAnimation);
      return;
      localView = this.a;
      j = 0;
      local1 = null;
      localView.setLayerType(0, null);
    }
  }
}


/* Location:              C:\Users\haryo\Desktop\enjarify-master\presensi-enjarify.jar!\android\support\v4\app\n$a.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       0.7.1
 */